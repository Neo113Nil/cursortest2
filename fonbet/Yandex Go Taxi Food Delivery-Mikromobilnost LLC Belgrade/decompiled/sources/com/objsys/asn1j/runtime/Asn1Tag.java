package com.objsys.asn1j.runtime;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* loaded from: classes11.dex */
public class Asn1Tag implements Serializable {
    public static final short APPL = 64;
    public static final short Bit8Mask = 128;
    public static final short CONS = 32;
    public static final short CTXT = 128;
    public static final short ClassMask = 192;
    public static final boolean EXPL = true;
    public static final short EXTIDCODE = 31;
    public static final short FormMask = 32;
    public static final short IDMask = 31;
    public static final boolean IMPL = false;
    public static final short L7BitsMask = 127;
    public static final short PRIM = 0;
    public static final short PRIV = 192;
    public static final short UNIV = 0;
    public transient short mClass;
    public transient short mForm;
    public transient int mIDCode;
    public static final Asn1Tag ENUM = new Asn1Tag(0, 0, 10);
    public static final Asn1Tag EOC = new Asn1Tag(0, 0, 0);
    public static final Asn1Tag SEQUENCE = new Asn1Tag(0, 32, 16);
    public static final Asn1Tag SET = new Asn1Tag(0, 32, 17);

    public Asn1Tag() {
        this.mClass = (short) 0;
        this.mForm = (short) 0;
        this.mIDCode = 0;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        objectInputStream.readShort();
        this.mClass = objectInputStream.readShort();
        this.mForm = objectInputStream.readShort();
        this.mIDCode = objectInputStream.readShort();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeShort(1);
        objectOutputStream.writeShort(this.mClass);
        objectOutputStream.writeShort(this.mForm);
        objectOutputStream.writeShort(this.mIDCode);
    }

    public boolean equals(short s, short s2, int i) {
        return this.mClass == s && this.mIDCode == i;
    }

    public boolean isConstructed() {
        return this.mForm == 32;
    }

    public boolean isEOC() {
        return equals((short) 0, (short) 0, 0);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[");
        short s = this.mClass;
        if (s == 0) {
            stringBuffer.append("UNIVERSAL ");
        } else if (s == 64) {
            stringBuffer.append("APPLICATION ");
        } else if (s != 128) {
            if (s != 192) {
                stringBuffer.append("??? ");
            } else {
                stringBuffer.append("PRIVATE ");
            }
        }
        stringBuffer.append(Integer.toString(this.mIDCode));
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public Asn1Tag(short s, short s2, int i) {
        this.mClass = s;
        this.mForm = s2;
        this.mIDCode = i;
    }

    public boolean equals(Asn1Tag asn1Tag) {
        return equals(asn1Tag.mClass, asn1Tag.mForm, asn1Tag.mIDCode);
    }
}
