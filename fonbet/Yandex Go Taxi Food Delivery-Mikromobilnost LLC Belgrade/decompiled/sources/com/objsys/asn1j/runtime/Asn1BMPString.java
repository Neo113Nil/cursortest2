package com.objsys.asn1j.runtime;

import java.io.IOException;

/* loaded from: classes11.dex */
public class Asn1BMPString extends Asn1CharString {
    public static final int BITSPERCHAR = 16;
    public static final Asn1Tag TAG = new Asn1Tag(0, 0, 30);

    public Asn1BMPString() {
        super((short) 30);
    }

    private void readSegment(Asn1BerDecodeBuffer asn1BerDecodeBuffer, StringBuffer stringBuffer, int i) throws Asn1Exception, IOException {
        if (i % 2 != 0) {
            throw new Asn1InvalidLengthException();
        }
        while (i > 0) {
            int read = asn1BerDecodeBuffer.read();
            if (read == -1) {
                throw new Asn1EndOfBufferException(asn1BerDecodeBuffer);
            }
            int i2 = read * 256;
            int read2 = asn1BerDecodeBuffer.read();
            if (read2 == -1) {
                throw new Asn1EndOfBufferException(asn1BerDecodeBuffer);
            }
            i -= 2;
            stringBuffer.append((char) (i2 + read2));
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, TAG);
        }
        StringBuffer stringBuffer = new StringBuffer();
        Asn1Tag lastTag = asn1BerDecodeBuffer.getLastTag();
        if (lastTag == null || !lastTag.isConstructed()) {
            stringBuffer.ensureCapacity(i / 2);
            readSegment(asn1BerDecodeBuffer, stringBuffer, i);
        } else {
            Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
            int i2 = 0;
            while (!asn1BerDecodeContext.expired()) {
                int matchTag = matchTag(asn1BerDecodeBuffer, Asn1OctetString.TAG);
                if (matchTag <= 0) {
                    throw new Asn1Exception(asn1BerDecodeBuffer, "Invalid format of constructed value");
                }
                i2 += matchTag;
                stringBuffer.ensureCapacity(i2);
                readSegment(asn1BerDecodeBuffer, stringBuffer, matchTag);
            }
            if (i == -9999) {
                matchTag(asn1BerDecodeBuffer, Asn1Tag.EOC);
            }
        }
        this.value = stringBuffer.toString();
        asn1BerDecodeBuffer.setTypeCode((short) 30);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int length = this.value.length();
        for (int i = length - 1; i >= 0; i--) {
            char charAt = this.value.charAt(i);
            asn1BerEncodeBuffer.copy((byte) (charAt % 256));
            asn1BerEncodeBuffer.copy((byte) (charAt / 256));
        }
        int i2 = length * 2;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, i2) + i2 : i2;
    }

    public Asn1BMPString(String str) {
        super(str, (short) 30);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException {
        encode(asn1PerEncodeBuffer, 16, 16, (Asn1CharSet) null);
    }

    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer, Asn1CharSet asn1CharSet) throws Asn1Exception, IOException {
        encode(asn1PerEncodeBuffer, 16, 16, asn1CharSet);
    }

    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer, Asn1CharSet asn1CharSet, long j, long j2) throws Asn1Exception, IOException {
        encode(asn1PerEncodeBuffer, 16, 16, asn1CharSet, j, j2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z) throws Asn1Exception, IOException {
        asn1BerOutputStream.encodeBMPString(this.value, z, TAG);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerOutputStream asn1PerOutputStream) throws Asn1Exception, IOException {
        encode(asn1PerOutputStream.mBuffer, 16, 16, (Asn1CharSet) null);
        asn1PerOutputStream.writeBuffer(false);
    }

    public void encode(Asn1PerOutputStream asn1PerOutputStream, Asn1CharSet asn1CharSet) throws Asn1Exception, IOException {
        encode(asn1PerOutputStream.mBuffer, 16, 16, asn1CharSet);
        asn1PerOutputStream.writeBuffer(false);
    }

    public void encode(Asn1PerOutputStream asn1PerOutputStream, Asn1CharSet asn1CharSet, long j, long j2) throws Asn1Exception, IOException {
        encode(asn1PerOutputStream.mBuffer, 16, 16, asn1CharSet, j, j2);
        asn1PerOutputStream.writeBuffer(false);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        decode(asn1PerDecodeBuffer, 16, 16, (Asn1CharSet) null);
    }

    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer, Asn1CharSet asn1CharSet) throws Asn1Exception, IOException {
        decode(asn1PerDecodeBuffer, 16, 16, asn1CharSet);
    }

    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer, Asn1CharSet asn1CharSet, long j, long j2) throws Asn1Exception, IOException {
        decode(asn1PerDecodeBuffer, 16, 16, asn1CharSet, j, j2);
    }
}
