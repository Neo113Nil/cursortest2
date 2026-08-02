package com.objsys.asn1j.runtime;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: classes11.dex */
public abstract class Asn1Enumerated extends Asn1Type {
    public static final Asn1Tag TAG = new Asn1Tag(0, 0, 10);
    public static final int UNDEFINED = -999;
    private static final long serialVersionUID = 6679322540041260007L;
    public transient int value;

    public Asn1Enumerated() {
        this.value = UNDEFINED;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        objectInputStream.readShort();
        this.value = objectInputStream.readInt();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeShort(1);
        objectOutputStream.writeInt(this.value);
    }

    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer, long j, long j2) throws Asn1Exception, IOException {
        long j3 = (j2 - j) + 1;
        if (j != j2) {
            this.value = (int) (asn1PerDecodeBuffer.decodeConsWholeNumber(j3) + j);
        } else {
            this.value = (int) j;
        }
        asn1PerDecodeBuffer.setTypeCode((short) 10);
    }

    public void decodeXER(String str, String str2) throws Asn1Exception {
        int parseValue = parseValue(str);
        this.value = parseValue;
        if (parseValue == -999) {
            throw new Asn1InvalidEnumException(str);
        }
    }

    public void decodeXML(String str, String str2) throws Asn1Exception {
        decodeXER(str, str2);
    }

    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer, long j, long j2) throws Asn1Exception {
        int i = this.value;
        if (i < j || i > j2) {
            throw new Asn1ConsVioException("Asn1Enumerated.value", this.value);
        }
        long j3 = i - j;
        long j4 = (j2 - j) + 1;
        if (j != j2) {
            asn1PerEncodeBuffer.encodeConsWholeNumber(j3, j4);
        }
    }

    public boolean equals(Object obj) {
        return this.value == ((Asn1Enumerated) obj).value;
    }

    public int parseValue(String str) throws Asn1Exception {
        return -1;
    }

    public String toString() {
        return null;
    }

    public Asn1Enumerated(int i) {
        this.value = i;
    }

    public boolean equals(int i) {
        return this.value == i;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, TAG);
        }
        this.value = (int) Asn1RunTime.decodeIntValue(asn1BerDecodeBuffer, i, true);
        asn1BerDecodeBuffer.setTypeCode((short) 10);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encodeIntValue = asn1BerEncodeBuffer.encodeIntValue(this.value);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, encodeIntValue) + encodeIntValue : encodeIntValue;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str) throws IOException, Asn1Exception {
        if (str == null) {
            str = "ENUMERATED";
        }
        String asn1Enumerated = toString();
        if (!asn1Enumerated.equals("UNDEFINED")) {
            asn1XerEncoder.encodeNamedValue(asn1Enumerated, str);
            return;
        }
        throw new Asn1InvalidEnumException(this.value);
    }

    public void encode(Asn1XerEncodeBuffer asn1XerEncodeBuffer) throws Asn1Exception {
        String asn1Enumerated = toString();
        if (!asn1Enumerated.equals("UNDEFINED")) {
            asn1XerEncodeBuffer.encodeNamedValueElement(asn1Enumerated);
            return;
        }
        throw new Asn1InvalidEnumException(this.value);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str, String str2) throws IOException, Asn1Exception {
        if (str == null) {
            str = "ENUMERATED";
        }
        String asn1Enumerated = toString();
        if (!asn1Enumerated.equals("UNDEFINED")) {
            asn1XerEncoder.encodeNamedValue(asn1Enumerated, str, str2);
            return;
        }
        throw new Asn1InvalidEnumException(this.value);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z) throws Asn1Exception, IOException {
        if (z) {
            asn1BerOutputStream.encodeTag(TAG);
        }
        asn1BerOutputStream.encodeIntValue(this.value, true);
    }

    public void encode(Asn1PerOutputStream asn1PerOutputStream, long j, long j2) throws Asn1Exception, IOException {
        encode(asn1PerOutputStream.mBuffer, j, j2);
        asn1PerOutputStream.writeBuffer(false);
    }
}
