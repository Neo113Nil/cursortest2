package com.objsys.asn1j.runtime;

import com.yandex.go.sql.BaseDatabaseHelper;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes11.dex */
public class Asn1Integer extends Asn1Type {
    static final int SIZEOF_INT = 4;
    static final int SIZEOF_LONG = 8;
    public static final Asn1Tag TAG = new Asn1Tag(0, 0, 2);
    private static Asn1RunTime rt = Asn1RunTime.instance();
    private static final long serialVersionUID = 977086821174128117L;
    public transient long value;

    public Asn1Integer() {
        this.value = 0L;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        objectInputStream.readShort();
        this.value = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeShort(1);
        objectOutputStream.writeLong(this.value);
    }

    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer, long j, long j2) throws Asn1Exception, IOException {
        this.value = 0L;
        if (j2 != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            long j3 = (j2 - j) + 1;
            if (j != j2) {
                this.value = asn1PerDecodeBuffer.decodeConsWholeNumber(j3);
            }
        } else {
            int decodeLength = (int) asn1PerDecodeBuffer.decodeLength();
            asn1PerDecodeBuffer.byteAlign();
            this.value = asn1PerDecodeBuffer.decodeInt(decodeLength, false);
        }
        this.value += j;
        asn1PerDecodeBuffer.setTypeCode((short) 2);
        long j4 = this.value;
        if (j4 < j || j4 > j2) {
            throw new Asn1ConsVioException("Asn1Integer.value", this.value);
        }
    }

    public void decodeXER(String str, String str2) throws Asn1Exception {
        this.value = Long.parseLong(str);
        rt.lcheck(4);
    }

    public void decodeXML(String str, String str2) throws Asn1Exception {
        decodeXER(str, str2);
    }

    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer, long j, long j2) throws Asn1Exception {
        long j3 = this.value;
        if (j3 < j || j3 > j2) {
            throw new Asn1ConsVioException("Asn1Integer.value", this.value);
        }
        long j4 = j3 - j;
        if (j2 == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            asn1PerEncodeBuffer.encodeInt(j4, true, false);
            return;
        }
        long j5 = (j2 - j) + 1;
        if (j != j2) {
            asn1PerEncodeBuffer.encodeConsWholeNumber(j4, j5);
        }
    }

    public boolean equals(Object obj) {
        return this.value == ((Asn1Integer) obj).value;
    }

    public int getBitCount() {
        return Asn1RunTime.getLongBitCount(this.value);
    }

    public String toString() {
        return Long.toString(this.value);
    }

    public static int getBitCount(long j) {
        return Asn1RunTime.getLongBitCount(j);
    }

    public Asn1Integer(long j) {
        this.value = j;
    }

    public boolean equals(long j) {
        return this.value == j;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException {
        asn1PerEncodeBuffer.encodeInt(this.value, true, true);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encodeIntValue = asn1BerEncodeBuffer.encodeIntValue(this.value);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, encodeIntValue) + encodeIntValue : encodeIntValue;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str) throws IOException, Asn1Exception {
        if (str == null) {
            str = BaseDatabaseHelper.TYPE_INTEGER;
        }
        asn1XerEncoder.encodeStartElement(str);
        asn1XerEncoder.copy(toString());
        asn1XerEncoder.encodeEndElement(str);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str, String str2) throws IOException, Asn1Exception {
        if (str == null) {
            str = BaseDatabaseHelper.TYPE_INTEGER;
        }
        asn1XerEncoder.encodeStartElement(str, str2);
        asn1XerEncoder.copy(toString());
        asn1XerEncoder.encodeEndElement(str);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z) throws Asn1Exception, IOException {
        if (z) {
            asn1BerOutputStream.encodeTag(TAG);
        }
        asn1BerOutputStream.encodeIntValue(this.value, true);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerOutputStream asn1PerOutputStream) throws Asn1Exception, IOException {
        asn1PerOutputStream.mBuffer.encodeInt(this.value, true, true);
        asn1PerOutputStream.writeBuffer(false);
    }

    public void encode(Asn1PerOutputStream asn1PerOutputStream, long j, long j2) throws Asn1Exception, IOException {
        encode(asn1PerOutputStream.mBuffer, j, j2);
        asn1PerOutputStream.writeBuffer(false);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        int decodeLength = (int) asn1PerDecodeBuffer.decodeLength();
        asn1PerDecodeBuffer.byteAlign();
        this.value = asn1PerDecodeBuffer.decodeInt(decodeLength, true);
        asn1PerDecodeBuffer.setTypeCode((short) 2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, TAG);
        }
        this.value = Asn1RunTime.decodeIntValue(asn1BerDecodeBuffer, i, true);
        rt.lcheck(1);
        asn1BerDecodeBuffer.setTypeCode((short) 2);
    }
}
