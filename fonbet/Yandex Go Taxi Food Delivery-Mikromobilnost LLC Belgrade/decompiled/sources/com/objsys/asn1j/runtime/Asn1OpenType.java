package com.objsys.asn1j.runtime;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: classes11.dex */
public class Asn1OpenType extends Asn1OctetString {
    private static final String EDATAMSG = "ENCODED DATA";
    private static final long serialVersionUID = 1794928988706612635L;
    protected transient Asn1EncodeBuffer mEncodeBuffer;
    protected transient int mLength;
    protected transient boolean mTextEncoding;

    public Asn1OpenType(Asn1EncodeBuffer asn1EncodeBuffer) {
        if (asn1EncodeBuffer instanceof Asn1BerEncodeBuffer) {
            this.mLength = asn1EncodeBuffer.getMsgLength();
            this.mEncodeBuffer = asn1EncodeBuffer;
        } else {
            this.value = asn1EncodeBuffer.getMsgCopy();
        }
        this.mTextEncoding = false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        objectInputStream.readShort();
        this.mLength = objectInputStream.readInt();
        this.mTextEncoding = objectInputStream.readBoolean();
        this.mEncodeBuffer = null;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeShort(1);
        objectOutputStream.writeInt(this.mLength);
        objectOutputStream.writeBoolean(this.mTextEncoding);
    }

    @Override // com.objsys.asn1j.runtime.Asn1OctetString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        this.value = asn1BerDecodeBuffer.decodeOpenType();
        asn1BerDecodeBuffer.setTypeCode((short) 99);
    }

    @Override // com.objsys.asn1j.runtime.Asn1OctetString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        return this.value != null ? super.encode(asn1BerEncodeBuffer, false) : this.mLength;
    }

    @Override // com.objsys.asn1j.runtime.Asn1OctetString
    public String toString() {
        byte[] bArr = this.value;
        if (bArr != null) {
            try {
                return this.mTextEncoding ? new String(bArr, "UTF-8") : super.toString();
            } catch (UnsupportedEncodingException unused) {
                return null;
            }
        }
        Asn1EncodeBuffer asn1EncodeBuffer = this.mEncodeBuffer;
        return asn1EncodeBuffer != null ? asn1EncodeBuffer.toString() : EDATAMSG;
    }

    @Override // com.objsys.asn1j.runtime.Asn1OctetString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException {
        byte[] bArr = this.value;
        asn1PerEncodeBuffer.encodeOpenType(bArr, 0, bArr.length);
    }

    @Override // com.objsys.asn1j.runtime.Asn1OctetString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z) throws Asn1Exception, IOException {
        byte[] bArr = this.value;
        if (bArr != null) {
            asn1BerOutputStream.write(bArr);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1OctetString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerOutputStream asn1PerOutputStream) throws Asn1Exception, IOException {
        byte[] bArr = this.value;
        asn1PerOutputStream.encodeOpenType(bArr, 0, bArr.length);
    }

    public Asn1OpenType(byte[] bArr) {
        super(bArr);
        this.mLength = 0;
        this.mTextEncoding = false;
    }

    public Asn1OpenType(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
        this.mLength = 0;
        this.mTextEncoding = false;
    }

    public Asn1OpenType() {
        this.mLength = 0;
        this.mTextEncoding = false;
    }

    public Asn1OpenType(int i) {
        this.mLength = i;
    }
}
