package com.objsys.asn1j.runtime;

import defpackage.quz;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: classes11.dex */
public class Asn1Boolean extends Asn1Type {
    private static final long serialVersionUID = 6822741769471077623L;
    public transient boolean value;
    public static final Asn1Tag TAG = new Asn1Tag(0, 0, 1);
    public static final Asn1Boolean TRUE_VALUE = new Asn1Boolean(true);
    public static final Asn1Boolean FALSE_VALUE = new Asn1Boolean(false);

    public Asn1Boolean() {
        this.value = false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        objectInputStream.readShort();
        this.value = objectInputStream.readBoolean();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeShort(1);
        objectOutputStream.writeBoolean(this.value);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            matchTag(asn1BerDecodeBuffer, TAG);
        }
        int read = asn1BerDecodeBuffer.read();
        if (read < 0) {
            throw new Asn1EndOfBufferException(asn1BerDecodeBuffer);
        }
        asn1BerDecodeBuffer.setTypeCode((short) 1);
        this.value = read != 0;
    }

    public void decodeXER(String str, String str2) throws Asn1Exception {
        String trim = str.trim();
        if (trim.compareTo("true") == 0) {
            this.value = true;
        } else if (trim.compareTo("false") == 0) {
            this.value = false;
        } else {
            quz.s("Invalid BOOLEAN value");
        }
    }

    public void decodeXML(String str, String str2) throws Asn1Exception {
        decodeXER(str, str2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        asn1BerEncodeBuffer.copy((byte) (this.value ? -1 : 0));
        if (z) {
            return asn1BerEncodeBuffer.encodeTagAndLength(TAG, 1) + 1;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        return this.value == ((Asn1Boolean) obj).value;
    }

    public String toString() {
        return this.value ? "TRUE" : "FALSE";
    }

    public Asn1Boolean(boolean z) {
        this.value = z;
    }

    public boolean equals(boolean z) {
        return this.value == z;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException {
        asn1PerEncodeBuffer.encodeBit(this.value);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str) throws IOException, Asn1Exception {
        if (str == null) {
            str = "BOOLEAN";
        }
        asn1XerEncoder.encodeNamedValue(this.value ? "true" : "false", str);
    }

    public void encode(Asn1XerEncodeBuffer asn1XerEncodeBuffer) throws Asn1Exception {
        asn1XerEncodeBuffer.encodeNamedValueElement(this.value ? "true" : "false");
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str, String str2) throws IOException, Asn1Exception {
        if (str == null) {
            str = "BOOLEAN";
        }
        asn1XerEncoder.encodeNamedValue(this.value ? "true" : "false", str, str2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        this.value = asn1PerDecodeBuffer.decodeBit();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z) throws Asn1Exception, IOException {
        if (z) {
            asn1BerOutputStream.encodeTag(TAG);
        }
        asn1BerOutputStream.encodeLength(1);
        asn1BerOutputStream.write(this.value ? -1 : 0);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerOutputStream asn1PerOutputStream) throws Asn1Exception, IOException {
        asn1PerOutputStream.mBuffer.encodeBit(this.value);
        asn1PerOutputStream.writeBuffer(false);
    }
}
