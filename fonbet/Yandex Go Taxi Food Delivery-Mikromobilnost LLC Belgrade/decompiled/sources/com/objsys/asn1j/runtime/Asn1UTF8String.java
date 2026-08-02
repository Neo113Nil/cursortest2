package com.objsys.asn1j.runtime;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* loaded from: classes11.dex */
public class Asn1UTF8String extends Asn1CharString {
    public static final Asn1Tag TAG = new Asn1Tag(0, 0, 12);

    public Asn1UTF8String() {
        super((short) 12);
    }

    private byte[] allocByteArray(int i) {
        return new byte[i];
    }

    private byte[] reallocByteArray(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        return bArr2;
    }

    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer, long j, long j2) throws Asn1Exception, IOException {
        if (j2 >= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
            decode(asn1PerDecodeBuffer);
            return;
        }
        int decodeLength = (int) asn1PerDecodeBuffer.decodeLength();
        if (decodeLength > 0) {
            asn1PerDecodeBuffer.byteAlign();
            byte[] allocByteArray = allocByteArray(decodeLength);
            asn1PerDecodeBuffer.decodeBitsToOctetArray(allocByteArray, 0, decodeLength * 8);
            String str = new String(allocByteArray, "UTF8");
            if (str.length() < j || str.length() > j2) {
                throw new Asn1ConsVioException("Asn1UTF8String.length", str.length());
            }
            this.value = str;
            asn1PerDecodeBuffer.setTypeCode((short) 12);
        }
    }

    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer, long j, long j2) throws Asn1Exception, IOException {
        try {
            byte[] bytes = this.value.getBytes("UTF8");
            if (this.value.length() < j || this.value.length() > j2) {
                throw new Asn1ConsVioException("Asn1UTF8String.length", this.value.length());
            }
            if (j2 >= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                encode(asn1PerEncodeBuffer);
                return;
            }
            asn1PerEncodeBuffer.encodeLength(bytes.length);
            if (bytes.length > 0) {
                asn1PerEncodeBuffer.byteAlign();
                asn1PerEncodeBuffer.encodeBits(bytes, 0, bytes.length * 8);
            }
        } catch (UnsupportedEncodingException unused) {
            System.out.getClass();
        }
    }

    public Asn1UTF8String(String str) {
        super(str, (short) 12);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        int decodeLength;
        int i = 0;
        byte[] bArr = null;
        int i2 = 0;
        do {
            decodeLength = (int) asn1PerDecodeBuffer.decodeLength();
            if (decodeLength > 0) {
                i += decodeLength;
                asn1PerDecodeBuffer.byteAlign();
                bArr = i2 == 0 ? allocByteArray(i) : reallocByteArray(bArr, i);
                asn1PerDecodeBuffer.decodeBitsToOctetArray(bArr, i2, decodeLength * 8);
                if (decodeLength >= 16384) {
                    i2 = i;
                }
            }
        } while (decodeLength >= 16384);
        if (bArr != null) {
            this.value = new String(bArr, "UTF8");
        }
        asn1PerDecodeBuffer.setTypeCode((short) 12);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException {
        try {
            byte[] bytes = this.value.getBytes("UTF8");
            int length = bytes.length;
            int i = 0;
            while (true) {
                int encodeLength = (int) asn1PerEncodeBuffer.encodeLength(length);
                if (encodeLength > 0) {
                    asn1PerEncodeBuffer.byteAlign();
                    asn1PerEncodeBuffer.encodeBits(bytes, i, encodeLength * 8);
                }
                length -= encodeLength;
                if (length <= 0) {
                    asn1PerEncodeBuffer.encodeLengthEOM(length);
                    return;
                }
                i += encodeLength;
            }
        } catch (UnsupportedEncodingException unused) {
            System.out.getClass();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, TAG);
        }
        Asn1OctetString asn1OctetString = new Asn1OctetString();
        asn1OctetString.decode(asn1BerDecodeBuffer, false, i);
        this.value = new String(asn1OctetString.value, "UTF8");
        if (z && i == -9999) {
            matchTag(asn1BerDecodeBuffer, Asn1Tag.EOC);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i = 0;
        try {
            byte[] bytes = this.value.getBytes("UTF8");
            i = bytes.length;
            asn1BerEncodeBuffer.copy(bytes);
        } catch (UnsupportedEncodingException unused) {
            System.out.getClass();
        }
        return z ? i + asn1BerEncodeBuffer.encodeTagAndLength(TAG, i) : i;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z) throws Asn1Exception, IOException {
        try {
            byte[] bytes = this.value.getBytes("UTF8");
            if (z) {
                asn1BerOutputStream.encodeTag(TAG);
            }
            asn1BerOutputStream.encodeLength(bytes.length);
            asn1BerOutputStream.write(bytes);
        } catch (UnsupportedEncodingException unused) {
            System.out.getClass();
        }
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
}
