package com.objsys.asn1j.runtime;

import android.support.v4.media.session.PlaybackStateCompat;
import defpackage.quz;
import defpackage.x4e;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.BitSet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public class Asn1BitString extends Asn1Type {
    public static final Asn1Tag TAG = new Asn1Tag(0, 0, 3);
    private static Asn1RunTime rt = Asn1RunTime.instance();
    private static final long serialVersionUID = -8111143948369307678L;
    public transient int numbits;
    public transient byte[] value;

    public Asn1BitString(BitSet bitSet) {
        allocBitArray(bitSet.length());
        int i = 0;
        int i2 = 0;
        int i3 = 128;
        for (int i4 = 0; i4 < bitSet.length(); i4++) {
            i2 = bitSet.get(i4) ? i2 | i3 : i2;
            i3 >>= 1;
            if (i3 == 0) {
                this.value[i] = (byte) i2;
                i2 = 0;
                i3 = 128;
                i++;
            }
        }
        if (i3 != 128) {
            this.value[i] = (byte) i2;
        }
    }

    private void allocBitArray(int i) {
        this.numbits = i;
        int i2 = (i + 7) / 8;
        byte[] bArr = this.value;
        if (bArr == null || bArr.length < i2) {
            this.value = new byte[i2];
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        objectInputStream.readShort();
        int readInt = objectInputStream.readInt();
        this.numbits = readInt;
        allocBitArray(readInt);
        objectInputStream.readFully(this.value, 0, (this.numbits + 7) / 8);
    }

    private void reallocBitArray(int i) {
        this.numbits = i;
        int i2 = (i + 7) / 8;
        byte[] bArr = this.value;
        if (bArr.length == i2) {
            return;
        }
        byte[] bArr2 = new byte[i2];
        this.value = bArr2;
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i2));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeShort(1);
        objectOutputStream.writeInt(this.numbits);
        objectOutputStream.write(this.value, 0, (this.numbits + 7) / 8);
    }

    public void clear(int i) {
        set(i, false);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, TAG);
        }
        Asn1Tag lastTag = asn1BerDecodeBuffer.getLastTag();
        byte b = 0;
        if (lastTag != null && lastTag.isConstructed()) {
            Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
            int i2 = -1;
            int i3 = 0;
            int i4 = 0;
            while (!asn1BerDecodeContext.expired()) {
                int matchTag = matchTag(asn1BerDecodeBuffer, TAG);
                if (matchTag <= 0) {
                    throw new Asn1Exception(asn1BerDecodeBuffer, "Invalid format of constructed value");
                }
                i4 += matchTag;
                if (i3 == 0) {
                    allocBitArray(i4 * 8);
                } else {
                    reallocBitArray(i4 * 8);
                }
                asn1BerDecodeBuffer.read(this.value, i3, matchTag);
                i2 = i3;
                i3 = i4;
            }
            if (i2 >= 0) {
                byte[] bArr = this.value;
                b = bArr[i2];
                int i5 = (i3 - i2) - 1;
                if (i5 > 0) {
                    System.arraycopy(bArr, i2 + 1, bArr, i2, i5);
                }
                i4--;
            }
            if (b < 0 || b > 7) {
                StringBuffer stringBuffer = new StringBuffer("Invalid format of bit string: initial octet is invalid (");
                stringBuffer.append((int) b);
                stringBuffer.append(Extension.C_BRAKE);
                throw new Asn1Exception(stringBuffer.toString());
            }
            reallocBitArray((i4 * 8) - b);
            if (i == -9999) {
                matchTag(asn1BerDecodeBuffer, Asn1Tag.EOC);
            }
        } else {
            if (i < 0) {
                throw new Asn1InvalidLengthException();
            }
            if (i != 0) {
                int i6 = i - 1;
                int read = asn1BerDecodeBuffer.read();
                if (read < 0) {
                    throw new Asn1EndOfBufferException(asn1BerDecodeBuffer);
                }
                if (read < 0 || read > 7) {
                    StringBuffer stringBuffer2 = new StringBuffer("Invalid format of bit string: initial octet is invalid (");
                    stringBuffer2.append(read);
                    stringBuffer2.append(Extension.C_BRAKE);
                    throw new Asn1Exception(stringBuffer2.toString());
                }
                if (i6 == 0 && read != 0) {
                    throw new Asn1InvalidLengthException();
                }
                this.numbits = (i6 * 8) - read;
                byte[] bArr2 = new byte[i6];
                this.value = bArr2;
                asn1BerDecodeBuffer.read(bArr2);
            } else {
                this.numbits = 0;
                this.value = null;
            }
        }
        asn1BerDecodeBuffer.setTypeCode((short) 3);
    }

    public void decodeXER(String str, String str2) throws Asn1Exception {
        String trim = str.trim();
        int length = trim.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (!Character.isSpaceChar(trim.charAt(i2))) {
                i++;
            }
        }
        this.value = new byte[(i + 7) / 8];
        int i3 = 0;
        int i4 = 0;
        int i5 = 128;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = trim.charAt(i6);
            if (!Character.isSpaceChar(charAt)) {
                if (i3 % 8 == 0) {
                    this.value[i4] = 0;
                }
                if (charAt == '1') {
                    byte[] bArr = this.value;
                    bArr[i4] = (byte) (bArr[i4] | i5);
                } else if (charAt != '0') {
                    quz.s("Invalid format of bit string");
                    return;
                }
                i3++;
                i5 >>= 1;
                if (i5 == 0) {
                    i4++;
                    i5 = 128;
                }
            }
        }
        rt.lcheck(4);
        this.numbits = i3;
    }

    public void decodeXML(String str, String str2) throws Asn1Exception {
        decodeXER(str, str2);
    }

    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer, long j, long j2) throws Asn1Exception, IOException {
        int i = this.numbits;
        if (i < j || i > j2) {
            throw new Asn1ConsVioException("Asn1BitString.length", this.numbits);
        }
        if (j2 >= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
            encode(asn1PerEncodeBuffer);
            return;
        }
        asn1PerEncodeBuffer.encodeLength(i, j, j2);
        if (this.numbits > 0) {
            if (j != j2 || j2 > 16) {
                asn1PerEncodeBuffer.byteAlign();
            }
            asn1PerEncodeBuffer.encodeBits(this.value, 0, this.numbits);
        }
    }

    public boolean equals(int i, byte[] bArr) {
        if (i != this.numbits) {
            return false;
        }
        int c = x4e.c(i, 1, 8, 1);
        for (int i2 = 0; i2 < c; i2++) {
            if (bArr[i2] != this.value[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type
    public int getLength() throws Asn1InvalidLengthException {
        return this.numbits;
    }

    public boolean isNamedBitStr(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (!Character.isWhitespace(charAt)) {
                return Character.isLetter(charAt);
            }
        }
        return false;
    }

    public boolean isSet(int i) {
        int i2 = i / 8;
        int i3 = 1 << (7 - (i % 8));
        byte[] bArr = this.value;
        return (bArr == null || bArr.length < i2 || (bArr[i2] & i3) == 0) ? false : true;
    }

    public void set(int i, boolean z) {
        int i2 = i / 8;
        int i3 = 1 << (7 - (i % 8));
        int i4 = i2 + 1;
        byte[] bArr = this.value;
        if (bArr == null) {
            this.value = new byte[i4];
        } else if (bArr.length < i4) {
            byte[] bArr2 = new byte[i4];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.value = bArr2;
        }
        byte[] bArr3 = this.value;
        byte b = bArr3[i2];
        bArr3[i2] = (byte) (z ? b | i3 : (~i3) & b);
        int i5 = i + 1;
        if (i5 > this.numbits) {
            this.numbits = i5;
        }
    }

    public boolean[] toBoolArray() {
        int i = this.numbits;
        boolean[] zArr = new boolean[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr = this.value;
            if (i2 >= bArr.length) {
                return zArr;
            }
            byte b = bArr[i2];
            int i4 = i < 8 ? i : 8;
            int i5 = 128;
            int i6 = 0;
            while (i6 < i4) {
                int i7 = i3 + 1;
                zArr[i3] = (b & i5) != 0;
                i5 >>= 1;
                i6++;
                i3 = i7;
            }
            i -= 8;
            i2++;
        }
    }

    public String toHexString() {
        String str = new String("");
        for (int i = 0; i < this.value.length; i++) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str);
            stringBuffer.append(Asn1Util.toHexString(this.value[i]));
            str = stringBuffer.toString();
        }
        return str;
    }

    public String toString() {
        String stringBuffer;
        int i = this.numbits;
        int i2 = 0;
        if (i > 16) {
            int i3 = (i + 3) / 4;
            StringBuffer stringBuffer2 = new StringBuffer(i3);
            if (this.value != null) {
                int i4 = 4;
                int i5 = 0;
                while (i2 < i3) {
                    int i6 = (this.value[i5] >> i4) & 15;
                    stringBuffer2.append((char) (i6 + (i6 >= 10 ? 87 : 48)));
                    i4 -= 4;
                    if (i4 < 0) {
                        i5++;
                        i4 = 4;
                    }
                    i2++;
                }
            }
            stringBuffer = stringBuffer2.toString();
        } else if (i != 0) {
            boolean[] boolArray = toBoolArray();
            StringBuffer stringBuffer3 = new StringBuffer(boolArray.length);
            while (i2 < boolArray.length) {
                stringBuffer3.append(boolArray[i2] ? "1" : "0");
                i2++;
            }
            stringBuffer = stringBuffer3.toString();
        } else {
            stringBuffer = null;
        }
        return stringBuffer != null ? stringBuffer : "";
    }

    public boolean equals(Object obj) {
        Asn1BitString asn1BitString = (Asn1BitString) obj;
        return equals(asn1BitString.numbits, asn1BitString.value);
    }

    public void set(int i) {
        set(i, true);
    }

    public Asn1BitString(int i, byte[] bArr) {
        this.numbits = i;
        this.value = bArr;
    }

    public Asn1BitString(boolean[] zArr) {
        allocBitArray(zArr.length);
        int i = 0;
        int i2 = 0;
        int i3 = 128;
        for (boolean z : zArr) {
            i2 = z ? i2 | i3 : i2;
            i3 >>= 1;
            if (i3 == 0) {
                this.value[i] = (byte) i2;
                i2 = 0;
                i3 = 128;
                i++;
            }
        }
        if (i3 != 128) {
            this.value[i] = (byte) i2;
        }
    }

    public Asn1BitString(String str) throws Asn1ValueParseException {
        IntHolder intHolder = new IntHolder();
        this.value = Asn1Value.parseString(str, intHolder);
        this.numbits = intHolder.value;
    }

    public Asn1BitString() {
        this.numbits = 0;
        this.value = null;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException {
        int i = this.numbits;
        int i2 = 0;
        while (true) {
            int encodeLength = (int) asn1PerEncodeBuffer.encodeLength(i);
            if (encodeLength > 0) {
                asn1PerEncodeBuffer.byteAlign();
                asn1PerEncodeBuffer.encodeBits(this.value, i2, encodeLength);
            }
            i -= encodeLength;
            if (i > 0) {
                i2 += encodeLength / 8;
            } else {
                asn1PerEncodeBuffer.encodeLengthEOM(this.numbits);
                return;
            }
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i = this.numbits;
        int i2 = (i + 7) / 8;
        int i3 = i % 8;
        if (i3 != 0) {
            i3 = 8 - i3;
            byte[] bArr = this.value;
            int i4 = i2 - 1;
            bArr[i4] = (byte) (bArr[i4] & (~((1 << i3) - 1)));
        }
        if (i2 != 0) {
            asn1BerEncodeBuffer.copy(this.value, 0, i2);
        }
        asn1BerEncodeBuffer.copy((byte) i3);
        int i5 = i2 + 1;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, i5) + i5 : i5;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str) throws IOException, Asn1Exception {
        if (str == null) {
            str = "BIT_STRING";
        }
        if (this.numbits == 0) {
            asn1XerEncoder.indent();
            asn1XerEncoder.encodeEmptyElement(str);
        } else {
            asn1XerEncoder.encodeStartElement(str);
            asn1XerEncoder.encodeBinStrValue(this.value, this.numbits);
            asn1XerEncoder.encodeEndElement(str);
        }
    }

    public void encode(Asn1XerEncoder asn1XerEncoder, String str, String str2, String[] strArr, int[] iArr) throws IOException, Asn1Exception {
        if (str == null) {
            str = "BIT_STRING";
        }
        if (this.numbits == 0) {
            asn1XerEncoder.indent();
            asn1XerEncoder.encodeEmptyElement(str, str2);
            return;
        }
        asn1XerEncoder.encodeStartElement(str, str2);
        boolean z = false;
        for (int i = 0; i < strArr.length; i++) {
            if (isSet(iArr[i])) {
                if (z) {
                    asn1XerEncoder.copy(" ");
                } else {
                    z = true;
                }
                asn1XerEncoder.encodeNamedValueElement(strArr[i]);
            }
        }
        if (!z) {
            asn1XerEncoder.encodeBinStrValue(this.value, this.numbits);
        }
        asn1XerEncoder.encodeEndElement(str);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str, String str2) throws IOException, Asn1Exception {
        if (str == null) {
            str = "BIT_STRING";
        }
        if (this.numbits == 0) {
            asn1XerEncoder.indent();
            asn1XerEncoder.encodeEmptyElement(str, str2);
        } else {
            asn1XerEncoder.encodeStartElement(str, str2);
            asn1XerEncoder.encodeBinStrValue(this.value, this.numbits);
            asn1XerEncoder.encodeEndElement(str);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z) throws Asn1Exception, IOException {
        asn1BerOutputStream.encodeBitString(this.value, this.numbits, z, TAG);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerOutputStream asn1PerOutputStream) throws Asn1Exception, IOException {
        encode(asn1PerOutputStream.mBuffer);
        asn1PerOutputStream.writeBuffer(false);
    }

    public void encode(Asn1PerOutputStream asn1PerOutputStream, long j, long j2) throws Asn1Exception, IOException {
        encode(asn1PerOutputStream.mBuffer, j, j2);
        asn1PerOutputStream.writeBuffer(false);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        int decodeLength;
        int i = 0;
        int i2 = 0;
        do {
            decodeLength = (int) asn1PerDecodeBuffer.decodeLength();
            if (decodeLength > 0) {
                i += decodeLength;
                asn1PerDecodeBuffer.byteAlign();
                if (i2 == 0) {
                    allocBitArray(i);
                } else {
                    reallocBitArray(i);
                }
                asn1PerDecodeBuffer.decodeBitsToOctetArray(this.value, i2, decodeLength);
                if (decodeLength >= 16384) {
                    i2 = (decodeLength / 8) + i2;
                }
            }
        } while (decodeLength >= 16384);
        asn1PerDecodeBuffer.setTypeCode((short) 3);
    }

    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer, long j, long j2) throws Asn1Exception, IOException {
        if (j2 < PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
            int decodeLength = (int) asn1PerDecodeBuffer.decodeLength(j, j2);
            this.numbits = decodeLength;
            if (decodeLength > 0) {
                if (j != j2 || j2 > 16) {
                    asn1PerDecodeBuffer.byteAlign();
                }
                allocBitArray(this.numbits);
                asn1PerDecodeBuffer.decodeBitsToOctetArray(this.value, 0, this.numbits);
            }
        } else {
            decode(asn1PerDecodeBuffer);
        }
        asn1PerDecodeBuffer.setTypeCode((short) 3);
    }
}
