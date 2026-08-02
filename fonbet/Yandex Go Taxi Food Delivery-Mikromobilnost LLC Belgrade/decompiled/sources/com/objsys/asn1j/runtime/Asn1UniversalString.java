package com.objsys.asn1j.runtime;

import android.support.v4.media.session.PlaybackStateCompat;
import defpackage.quz;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes11.dex */
public class Asn1UniversalString extends Asn1Type {
    public static final int BITSPERCHAR = 32;
    private static final long serialVersionUID = -1570296157849439388L;
    protected transient StringBuffer mStringBuffer;
    public transient int[] value;
    public static final Asn1Tag TAG = new Asn1Tag(0, 0, 28);
    private static final int[] encoding_mask = {-2048, -65536, -2097152, -67108864};
    private static final int[] encoding_byte = {192, 224, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC, 248, 252};

    public Asn1UniversalString(String str) {
        this.value = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            this.value[i] = str.charAt(i);
        }
    }

    private void byteAlign(Asn1PerMessageBuffer asn1PerMessageBuffer, int i, long j, long j2) {
        if (asn1PerMessageBuffer.isAligned()) {
            long j3 = i * j2;
            if (j2 == j) {
                if (j3 <= 16) {
                    return;
                }
            } else if (j3 < 16) {
                return;
            }
            asn1PerMessageBuffer.byteAlign();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        objectInputStream.readShort();
        this.value = (int[]) objectInputStream.readObject();
    }

    private void readSegment(Asn1BerDecodeBuffer asn1BerDecodeBuffer, int i, IntHolder intHolder) throws Asn1Exception, IOException {
        if (i < 0 || i % 4 != 0) {
            throw new Asn1InvalidLengthException();
        }
        int i2 = i / 4;
        int[] iArr = this.value;
        if (iArr.length == 0) {
            this.value = new int[i2];
        } else {
            int i3 = intHolder.value;
            if (i3 + i2 >= iArr.length) {
                reallocIntArray(i3 + i2);
            }
        }
        int i4 = intHolder.value;
        while (i4 < intHolder.value + i2) {
            this.value[i4] = 0;
            for (int i5 = 0; i5 < 4; i5++) {
                int read = asn1BerDecodeBuffer.read();
                if (read == -1) {
                    throw new Asn1EndOfBufferException(asn1BerDecodeBuffer);
                }
                int[] iArr2 = this.value;
                iArr2[i4] = (iArr2[i4] * 256) + read;
            }
            i4++;
        }
        intHolder.value = i4;
    }

    private void reallocIntArray(int i) {
        int[] iArr = this.value;
        int[] iArr2 = new int[i];
        this.value = iArr2;
        if (iArr != null) {
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeShort(1);
        objectOutputStream.writeObject(this.value);
    }

    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer, int i, int i2, int i3, Asn1CharSet asn1CharSet, int i4) throws Asn1Exception, IOException {
        int i5 = 0;
        if (asn1CharSet == null) {
            if (!asn1PerDecodeBuffer.isAligned()) {
                i2 = i3;
            }
            asn1PerDecodeBuffer.mTraceHandler.newBitField("value", i * i2);
            while (i5 < i) {
                this.value[i4 + i5] = asn1PerDecodeBuffer.decodeBitsToInt(i2, null);
                i5++;
            }
            return;
        }
        int numBitsPerChar = asn1CharSet.getNumBitsPerChar(asn1PerDecodeBuffer.isAligned());
        boolean z = Math.pow(2.0d, (double) numBitsPerChar) - 1.0d < ((double) asn1CharSet.getMaxValue());
        asn1PerDecodeBuffer.mTraceHandler.newBitField("value", i * numBitsPerChar);
        while (i5 < i) {
            int decodeBitsToInt = asn1PerDecodeBuffer.decodeBitsToInt(numBitsPerChar, null);
            int[] iArr = this.value;
            if (z) {
                iArr[i4 + i5] = asn1CharSet.getCharAtIndex(decodeBitsToInt);
            } else {
                iArr[i4 + i5] = decodeBitsToInt;
            }
            i5++;
        }
    }

    public void decodeXER(String str, String str2) throws Asn1Exception {
        String trim = str.trim();
        this.value = new int[trim.length()];
        int i = 0;
        while (true) {
            int[] iArr = this.value;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = trim.charAt(i);
            i++;
        }
    }

    public void decodeXML(String str, String str2) throws Asn1Exception {
        decodeXER(str, str2);
    }

    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer, int i, int i2, int i3, int i4, Asn1CharSet asn1CharSet) throws Asn1Exception {
        int i5 = 0;
        if (asn1CharSet == null) {
            if (!asn1PerEncodeBuffer.isAligned()) {
                i3 = i4;
            }
            asn1PerEncodeBuffer.mTraceHandler.newBitField("value", i * i3);
            while (i5 < i) {
                asn1PerEncodeBuffer.encodeInt(this.value[i2 + i5], i3, (String) null);
                i5++;
            }
            return;
        }
        int numBitsPerChar = asn1CharSet.getNumBitsPerChar(asn1PerEncodeBuffer.isAligned());
        boolean z = Math.pow(2.0d, (double) numBitsPerChar) - 1.0d < ((double) asn1CharSet.getMaxValue());
        asn1PerEncodeBuffer.mTraceHandler.newBitField("value", i * numBitsPerChar);
        while (i5 < i) {
            int i6 = this.value[i2 + i5];
            if (z) {
                asn1PerEncodeBuffer.encodeInt(asn1CharSet.getCharIndex(i6), numBitsPerChar, (String) null);
            } else {
                asn1PerEncodeBuffer.encodeInt(i6, numBitsPerChar, (String) null);
            }
            i5++;
        }
    }

    public void encodeData(Asn1XerEncoder asn1XerEncoder) throws IOException, Asn1Exception {
        byte[] bArr = new byte[6];
        int i = 0;
        while (true) {
            int[] iArr = this.value;
            if (i >= iArr.length) {
                return;
            }
            int i2 = iArr[i];
            if (i2 < 0 || i2 > Integer.MAX_VALUE) {
                break;
            }
            if (i2 < 128) {
                asn1XerEncoder.copy((byte) i2);
            } else {
                int i3 = 2;
                while (i3 < 6 && (encoding_mask[i3 - 2] & i2) != 0) {
                    i3++;
                }
                bArr[0] = (byte) encoding_byte[i3 - 2];
                int i4 = i3 - 1;
                do {
                    bArr[i4] = (byte) ((i2 & 63) | 128);
                    i2 >>>= 6;
                    i4--;
                } while (i4 > 0);
                bArr[0] = (byte) (i2 | bArr[0]);
                asn1XerEncoder.copy(bArr, 0, i3);
            }
            i++;
        }
        quz.s("not a correct ISO 10646 encoded string");
    }

    public boolean equals(Object obj) {
        Asn1UniversalString asn1UniversalString = (Asn1UniversalString) obj;
        if (this.value.length != asn1UniversalString.value.length) {
            return false;
        }
        int i = 0;
        while (true) {
            int[] iArr = this.value;
            if (i >= iArr.length) {
                return true;
            }
            if (iArr[i] != asn1UniversalString.value[i]) {
                return false;
            }
            i++;
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type
    public int getLength() throws Asn1InvalidLengthException {
        return this.value.length;
    }

    public String toString() {
        if (this.mStringBuffer == null) {
            this.mStringBuffer = new StringBuffer();
        }
        this.mStringBuffer.setLength(this.value.length);
        int i = 0;
        while (true) {
            int[] iArr = this.value;
            int length = iArr.length;
            StringBuffer stringBuffer = this.mStringBuffer;
            if (i >= length) {
                return stringBuffer.toString();
            }
            stringBuffer.setCharAt(i, (char) iArr[i]);
            i++;
        }
    }

    public Asn1UniversalString(int[] iArr) {
        this.value = iArr;
    }

    public Asn1UniversalString() {
        this.value = new int[0];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        decode(asn1PerDecodeBuffer, 32, 32, (Asn1CharSet) null);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException {
        encode(asn1PerEncodeBuffer, 32, 32, (Asn1CharSet) null);
    }

    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer, Asn1CharSet asn1CharSet) throws Asn1Exception, IOException {
        decode(asn1PerDecodeBuffer, 32, 32, asn1CharSet);
    }

    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer, Asn1CharSet asn1CharSet) throws Asn1Exception, IOException {
        encode(asn1PerEncodeBuffer, 32, 32, asn1CharSet);
    }

    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer, Asn1CharSet asn1CharSet, long j, long j2) throws Asn1Exception, IOException {
        decode(asn1PerDecodeBuffer, 32, 32, asn1CharSet, j, j2);
    }

    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer, Asn1CharSet asn1CharSet, long j, long j2) throws Asn1Exception, IOException {
        encode(asn1PerEncodeBuffer, 32, 32, asn1CharSet, j, j2);
    }

    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer, int i, int i2, Asn1CharSet asn1CharSet) throws Asn1Exception, IOException {
        Asn1UniversalString asn1UniversalString;
        Asn1PerDecodeBuffer asn1PerDecodeBuffer2;
        int i3;
        int i4;
        Asn1CharSet asn1CharSet2;
        int i5 = 0;
        while (true) {
            int decodeLength = (int) asn1PerDecodeBuffer.decodeLength();
            if (decodeLength > 0) {
                int i6 = i5 + decodeLength;
                asn1PerDecodeBuffer.byteAlign();
                if (this.value.length == 0) {
                    this.value = new int[i6];
                } else {
                    this.reallocIntArray(i6);
                }
                asn1UniversalString = this;
                asn1PerDecodeBuffer2 = asn1PerDecodeBuffer;
                i3 = i;
                i4 = i2;
                asn1CharSet2 = asn1CharSet;
                asn1UniversalString.decode(asn1PerDecodeBuffer2, decodeLength, i3, i4, asn1CharSet2, i5);
                i5 = i6;
            } else {
                asn1UniversalString = this;
                asn1PerDecodeBuffer2 = asn1PerDecodeBuffer;
                i3 = i;
                i4 = i2;
                asn1CharSet2 = asn1CharSet;
            }
            if (decodeLength < 16384) {
                return;
            }
            this = asn1UniversalString;
            asn1PerDecodeBuffer = asn1PerDecodeBuffer2;
            i = i3;
            i2 = i4;
            asn1CharSet = asn1CharSet2;
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int length = this.value.length;
        for (int i = length - 1; i >= 0; i--) {
            int i2 = this.value[i];
            for (int i3 = 0; i3 < 4; i3++) {
                int i4 = i2 % 256;
                i2 /= 256;
                asn1BerEncodeBuffer.copy((byte) i4);
            }
        }
        int i5 = length * 4;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, i5) + i5 : i5;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, TAG);
        }
        IntHolder intHolder = new IntHolder(0);
        Asn1Tag lastTag = asn1BerDecodeBuffer.getLastTag();
        if (lastTag != null && lastTag.isConstructed()) {
            Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
            while (!asn1BerDecodeContext.expired()) {
                int matchTag = matchTag(asn1BerDecodeBuffer, Asn1OctetString.TAG);
                if (matchTag > 0) {
                    readSegment(asn1BerDecodeBuffer, matchTag, intHolder);
                } else {
                    throw new Asn1Exception(asn1BerDecodeBuffer, "Invalid format of constructed value");
                }
            }
            if (i == -9999) {
                matchTag(asn1BerDecodeBuffer, Asn1Tag.EOC);
            }
        } else {
            readSegment(asn1BerDecodeBuffer, i, intHolder);
        }
        asn1BerDecodeBuffer.setTypeCode((short) 28);
    }

    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer, int i, int i2, Asn1CharSet asn1CharSet) throws Asn1Exception, IOException {
        Asn1UniversalString asn1UniversalString;
        Asn1PerEncodeBuffer asn1PerEncodeBuffer2;
        int i3;
        int i4;
        Asn1CharSet asn1CharSet2;
        int length = this.value.length;
        int i5 = 0;
        while (true) {
            int encodeLength = (int) asn1PerEncodeBuffer.encodeLength(length);
            if (encodeLength > 0) {
                asn1PerEncodeBuffer.byteAlign();
                asn1UniversalString = this;
                asn1PerEncodeBuffer2 = asn1PerEncodeBuffer;
                i3 = i;
                i4 = i2;
                asn1CharSet2 = asn1CharSet;
                asn1UniversalString.encode(asn1PerEncodeBuffer2, encodeLength, i5, i3, i4, asn1CharSet2);
            } else {
                asn1UniversalString = this;
                asn1PerEncodeBuffer2 = asn1PerEncodeBuffer;
                i3 = i;
                i4 = i2;
                asn1CharSet2 = asn1CharSet;
            }
            length -= encodeLength;
            if (length <= 0) {
                asn1PerEncodeBuffer2.encodeLengthEOM(length);
                return;
            }
            i5 += encodeLength;
            this = asn1UniversalString;
            asn1PerEncodeBuffer = asn1PerEncodeBuffer2;
            i = i3;
            i2 = i4;
            asn1CharSet = asn1CharSet2;
        }
    }

    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer, int i, int i2, Asn1CharSet asn1CharSet, long j, long j2) throws Asn1Exception, IOException {
        int numBitsPerChar;
        int length = this.value.length;
        long j3 = length;
        if (j3 < j || j3 > j2) {
            throw new Asn1ConsVioException("Asn1UniversalString.length", j3);
        }
        if (j2 < PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
            asn1PerEncodeBuffer.encodeLength(j3, j, j2);
            if (length > 0) {
                if (asn1CharSet == null) {
                    numBitsPerChar = asn1PerEncodeBuffer.isAligned() ? i : i2;
                } else {
                    numBitsPerChar = asn1CharSet.getNumBitsPerChar(asn1PerEncodeBuffer.isAligned());
                }
                byteAlign(asn1PerEncodeBuffer, numBitsPerChar, j, j2);
                encode(asn1PerEncodeBuffer, length, 0, i, i2, asn1CharSet);
                return;
            }
            return;
        }
        encode(asn1PerEncodeBuffer, i, i2, asn1CharSet);
    }

    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer, int i, int i2, Asn1CharSet asn1CharSet, long j, long j2) throws Asn1Exception, IOException {
        int numBitsPerChar;
        if (j2 < PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
            int decodeLength = (int) asn1PerDecodeBuffer.decodeLength(j, j2);
            if (decodeLength > 0) {
                if (asn1CharSet == null) {
                    numBitsPerChar = asn1PerDecodeBuffer.isAligned() ? i : i2;
                } else {
                    numBitsPerChar = asn1CharSet.getNumBitsPerChar(asn1PerDecodeBuffer.isAligned());
                }
                byteAlign(asn1PerDecodeBuffer, numBitsPerChar, j, j2);
                this.value = new int[decodeLength];
                decode(asn1PerDecodeBuffer, decodeLength, i, i2, asn1CharSet, 0);
                return;
            }
            return;
        }
        decode(asn1PerDecodeBuffer, i, i2, asn1CharSet);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str) throws IOException, Asn1Exception {
        if (str == null) {
            str = "UniversalString";
        }
        asn1XerEncoder.encodeStartElement(str);
        encodeData(asn1XerEncoder);
        asn1XerEncoder.encodeEndElement(str);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str, String str2) throws IOException, Asn1Exception {
        if (str == null) {
            str = "UniversalString";
        }
        asn1XerEncoder.encodeStartElement(str, str2);
        encodeData(asn1XerEncoder);
        asn1XerEncoder.encodeEndElement(str);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z) throws Asn1Exception, IOException {
        asn1BerOutputStream.encodeUnivString(this.value, z, TAG);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerOutputStream asn1PerOutputStream) throws Asn1Exception, IOException {
        encode(asn1PerOutputStream.mBuffer, 32, 32, (Asn1CharSet) null);
        asn1PerOutputStream.writeBuffer(false);
    }

    public void encode(Asn1PerOutputStream asn1PerOutputStream, Asn1CharSet asn1CharSet) throws Asn1Exception, IOException {
        encode(asn1PerOutputStream.mBuffer, 32, 32, asn1CharSet);
        asn1PerOutputStream.writeBuffer(false);
    }

    public void encode(Asn1PerOutputStream asn1PerOutputStream, Asn1CharSet asn1CharSet, long j, long j2) throws Asn1Exception, IOException {
        encode(asn1PerOutputStream.mBuffer, 32, 32, asn1CharSet, j, j2);
        asn1PerOutputStream.writeBuffer(false);
    }

    public void encode(Asn1PerOutputStream asn1PerOutputStream, int i, int i2, int i3, int i4, Asn1CharSet asn1CharSet) throws Asn1Exception, IOException {
        encode(asn1PerOutputStream.mBuffer, i, i2, i3, i4, asn1CharSet);
        asn1PerOutputStream.writeBuffer(false);
    }

    public void encode(Asn1PerOutputStream asn1PerOutputStream, int i, int i2, Asn1CharSet asn1CharSet) throws Asn1Exception, IOException {
        encode(asn1PerOutputStream.mBuffer, i, i2, asn1CharSet);
        asn1PerOutputStream.writeBuffer(false);
    }

    public void encode(Asn1PerOutputStream asn1PerOutputStream, int i, int i2, Asn1CharSet asn1CharSet, long j, long j2) throws Asn1Exception, IOException {
        encode(asn1PerOutputStream.mBuffer, i, i2, asn1CharSet, j, j2);
        asn1PerOutputStream.writeBuffer(false);
    }
}
