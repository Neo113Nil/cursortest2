package com.objsys.asn1j.runtime;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: classes11.dex */
public class Asn1OctetString extends Asn1Type implements Comparable {
    public static final Asn1Tag TAG = new Asn1Tag(0, 0, 4);
    private static Asn1RunTime rt = Asn1RunTime.instance();
    private static final long serialVersionUID = -1633161801793532563L;
    public transient byte[] value;

    public Asn1OctetString(String str) throws Asn1ValueParseException {
        if (str == null || str.length() == 0) {
            this.value = new byte[0];
        } else {
            this.value = Asn1Value.parseString(str);
        }
    }

    private void allocByteArray(int i) {
        if (this.value == null) {
            this.value = new byte[i];
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        objectInputStream.readShort();
        this.value = (byte[]) objectInputStream.readObject();
    }

    private void reallocByteArray(int i) {
        byte[] bArr = this.value;
        byte[] bArr2 = new byte[i];
        this.value = bArr2;
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeShort(1);
        objectOutputStream.writeObject(this.value);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        byte[] bArr = ((Asn1OctetString) obj).value;
        byte[] bArr2 = this.value;
        int length = bArr2.length < bArr.length ? bArr2.length : bArr.length;
        int i = 0;
        while (true) {
            byte[] bArr3 = this.value;
            if (i >= length) {
                if (bArr3.length == bArr.length) {
                    return 0;
                }
                return bArr3.length < bArr.length ? -1 : 1;
            }
            int i2 = bArr3[i] & 255;
            int i3 = bArr[i] & 255;
            if (i2 < i3) {
                return -1;
            }
            if (i2 > i3) {
                return 1;
            }
            i++;
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, TAG);
        }
        Asn1Tag lastTag = asn1BerDecodeBuffer.getLastTag();
        if (lastTag != null && lastTag.isConstructed()) {
            Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (!asn1BerDecodeContext.expired()) {
                    int matchTag = matchTag(asn1BerDecodeBuffer, TAG);
                    if (matchTag <= 0) {
                        throw new Asn1Exception(asn1BerDecodeBuffer, "Invalid format of constructed value");
                    }
                    i2 += matchTag;
                    if (i3 == 0) {
                        this.value = new byte[i2];
                    } else {
                        reallocByteArray(i2);
                    }
                    asn1BerDecodeBuffer.read(this.value, i3, matchTag);
                } else if (i == -9999) {
                    matchTag(asn1BerDecodeBuffer, Asn1Tag.EOC);
                }
            }
        } else {
            if (i < 0) {
                throw new Asn1InvalidLengthException();
            }
            byte[] bArr = new byte[i];
            this.value = bArr;
            if (i != 0) {
                asn1BerDecodeBuffer.read(bArr);
            }
        }
        rt.lcheck(1);
        asn1BerDecodeBuffer.setTypeCode((short) 4);
    }

    public void decodeXER(String str, String str2) throws Asn1Exception {
        String trim = str.trim();
        rt.lcheck(4);
        this.value = Asn1RunTime.decodeHexOctetStr(trim);
    }

    public void decodeXML(String str, String str2) throws Asn1Exception {
        decodeXER(str, str2);
    }

    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer, long j, long j2) throws Asn1Exception, IOException {
        if (this.value == null) {
            this.value = new byte[0];
        }
        byte[] bArr = this.value;
        if (bArr.length < j || bArr.length > j2) {
            throw new Asn1ConsVioException("Asn1OctetString.length", this.value.length);
        }
        if (j2 >= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
            encode(asn1PerEncodeBuffer);
            return;
        }
        asn1PerEncodeBuffer.encodeLength(bArr.length, j, j2);
        if (this.value.length > 0) {
            if (j != j2 || j2 > 2) {
                asn1PerEncodeBuffer.byteAlign();
            }
            byte[] bArr2 = this.value;
            asn1PerEncodeBuffer.encodeBits(bArr2, 0, bArr2.length * 8);
        }
    }

    public boolean equals(byte[] bArr) {
        if (bArr.length != this.value.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != this.value[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type
    public int getLength() throws Asn1InvalidLengthException {
        return this.value.length;
    }

    public InputStream toInputStream() {
        byte[] bArr = this.value;
        return new ByteArrayInputStream(bArr, 0, bArr.length);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(this.value.length * 2);
        if (this.value != null) {
            int i = 0;
            while (true) {
                byte[] bArr = this.value;
                if (i >= bArr.length) {
                    break;
                }
                Asn1Util.toHexString(bArr[i], stringBuffer);
                i++;
            }
        }
        return stringBuffer.toString();
    }

    public Asn1OctetString(byte[] bArr) {
        this.value = bArr;
    }

    public boolean equals(Object obj) {
        return equals(((Asn1OctetString) obj).value);
    }

    public Asn1OctetString(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.value = bArr2;
        if (bArr != null) {
            System.arraycopy(bArr, i, bArr2, 0, i2);
        }
    }

    public Asn1OctetString() {
        this.value = null;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException {
        if (this.value == null) {
            this.value = new byte[0];
        }
        byte[] bArr = this.value;
        asn1PerEncodeBuffer.encodeOctetString(bArr, 0, bArr.length);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        if (this.value == null) {
            this.value = new byte[0];
        }
        byte[] bArr = this.value;
        int length = bArr.length;
        if (length != 0) {
            asn1BerEncodeBuffer.copy(bArr);
        }
        if (z) {
            length += asn1BerEncodeBuffer.encodeTagAndLength(TAG, length);
        }
        rt.lcheck(1);
        return length;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str) throws IOException, Asn1Exception {
        if (str == null) {
            str = "OCTET_STRING";
        }
        if (this.value.length == 0) {
            asn1XerEncoder.indent();
            asn1XerEncoder.encodeEmptyElement(str);
        } else {
            asn1XerEncoder.encodeStartElement(str);
            asn1XerEncoder.encodeHexStrValue(this.value);
            asn1XerEncoder.encodeEndElement(str);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str, String str2) throws IOException, Asn1Exception {
        if (str == null) {
            str = "OCTET_STRING";
        }
        if (this.value.length == 0) {
            asn1XerEncoder.indent();
            asn1XerEncoder.encodeEmptyElement(str, str2);
        } else {
            asn1XerEncoder.encodeStartElement(str, str2);
            asn1XerEncoder.encodeHexStrValue(this.value);
            asn1XerEncoder.encodeEndElement(str);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z) throws Asn1Exception, IOException {
        asn1BerOutputStream.encodeOctetString(this.value, z, TAG);
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
                    allocByteArray(i);
                } else {
                    reallocByteArray(i);
                }
                asn1PerDecodeBuffer.decodeBitsToOctetArray(this.value, i2, decodeLength * 8);
                if (decodeLength >= 16384) {
                    i2 = i;
                }
            }
        } while (decodeLength >= 16384);
        if (this.value == null) {
            this.value = new byte[0];
        }
        asn1PerDecodeBuffer.setTypeCode((short) 4);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerOutputStream asn1PerOutputStream) throws Asn1Exception, IOException {
        if (this.value == null) {
            this.value = new byte[0];
        }
        Asn1PerEncodeBuffer asn1PerEncodeBuffer = asn1PerOutputStream.mBuffer;
        byte[] bArr = this.value;
        asn1PerEncodeBuffer.encodeOctetString(bArr, 0, bArr.length);
    }

    public void encode(Asn1PerOutputStream asn1PerOutputStream, long j, long j2) throws Asn1Exception, IOException {
        encode(asn1PerOutputStream.mBuffer, j, j2);
        asn1PerOutputStream.writeBuffer(false);
    }

    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer, long j, long j2) throws Asn1Exception, IOException {
        if (j2 < PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
            int decodeLength = (int) asn1PerDecodeBuffer.decodeLength(j, j2);
            if (decodeLength > 0) {
                if (j != j2 || j2 > 2) {
                    asn1PerDecodeBuffer.byteAlign();
                }
                allocByteArray(decodeLength);
                asn1PerDecodeBuffer.decodeBitsToOctetArray(this.value, 0, decodeLength * 8);
            } else {
                this.value = new byte[0];
            }
        } else {
            decode(asn1PerDecodeBuffer);
        }
        asn1PerDecodeBuffer.setTypeCode((short) 4);
    }
}
