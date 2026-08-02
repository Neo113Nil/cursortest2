package com.objsys.asn1j.runtime;

import com.yandex.go.sql.BaseDatabaseHelper;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;

/* loaded from: classes11.dex */
public abstract class Asn1Type implements Asn1TypeIF, Serializable, Cloneable {
    public static final short BIT_STRING = 3;
    public static final short BMPString = 30;
    public static final short BOOLEAN = 1;
    public static final short ENUMERATED = 10;
    public static final short EOC = 0;
    public static final short EXTERNAL = 8;
    public static final short GeneralString = 27;
    public static final short GeneralTime = 24;
    public static final short GraphicString = 25;
    public static final short IA5String = 22;
    public static final short INTEGER = 2;
    public static final short NULL = 5;
    public static final short NumericString = 18;
    public static final short OBJECT_IDENTIFIER = 6;
    public static final short OCTET_STRING = 4;
    public static final short ObjectDescriptor = 7;
    public static final short OpenType = 99;
    public static final short PrintableString = 19;
    public static final short REAL = 9;
    public static final short RelativeOID = 13;
    public static final short SEQUENCE = 16;
    public static final short SET = 17;
    public static final short T61String = 20;
    public static final short TeletexString = 20;
    public static final short UTCTime = 23;
    public static final short UTF8String = 12;
    public static final short UniversalString = 28;
    public static final short VideotexString = 21;
    public static final short VisibleString = 26;
    private static final long serialVersionUID = -257475726651236891L;
    private boolean mOpenType = false;
    private transient Asn1Tag mParsedTag = new Asn1Tag();
    private transient IntHolder mParsedLen = new IntHolder();

    public static String getTypeName(short s) {
        if (s == 12) {
            return "UTF8String";
        }
        if (s == 30) {
            return "BMPString";
        }
        if (s == 99) {
            return "ANY";
        }
        switch (s) {
            case 0:
                return "EOC";
            case 1:
                return "BOOLEAN";
            case 2:
                return BaseDatabaseHelper.TYPE_INTEGER;
            case 3:
                return "BIT STRING";
            case 4:
                return "OCTET STRING";
            case 5:
                return "NULL";
            case 6:
                return "OBJECT IDENTIFIER";
            case 7:
                return "ObjectDescriptor";
            case 8:
                return "EXTERNAL";
            case 9:
                return "REAL";
            case 10:
                return "ENUMERATED";
            default:
                switch (s) {
                    case 16:
                        return "SEQUENCE";
                    case 17:
                        return "SET";
                    case 18:
                        return "NumericString";
                    case 19:
                        return "PrintableString";
                    case 20:
                        return "T61String";
                    case 21:
                        return "VideotexString";
                    case 22:
                        return "IA5String";
                    case 23:
                        return "UTCTime";
                    case 24:
                        return "GeneralTime";
                    case 25:
                        return "GraphicString";
                    case 26:
                        return "VisibleString";
                    case 27:
                        return "GeneralString";
                    case 28:
                        return "UniversalString";
                    default:
                        return "?";
                }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        objectInputStream.readShort();
        this.mParsedTag = (Asn1Tag) objectInputStream.readObject();
        this.mParsedLen = new IntHolder(objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeShort(1);
        objectOutputStream.writeObject(this.mParsedTag);
        objectOutputStream.writeInt(this.mParsedLen.value);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        throw new Asn1Exception("Attempt to invoke base class PER decode method.");
    }

    @Override // com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException {
        throw new Asn1Exception("Attempt to invoke base class PER encode method.");
    }

    public int getLength() throws Asn1InvalidLengthException {
        throw new Asn1InvalidLengthException();
    }

    public void indent(PrintStream printStream, int i) {
        int i2 = i * 3;
        for (int i3 = 0; i3 < i2; i3++) {
            printStream.getClass();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1TypeIF
    public boolean isOpenType() {
        return this.mOpenType;
    }

    public int matchTag(Asn1BerDecodeBuffer asn1BerDecodeBuffer, short s, short s2, int i) throws Asn1Exception, IOException {
        if (asn1BerDecodeBuffer.matchTag(s, s2, i, this.mParsedTag, this.mParsedLen)) {
            return this.mParsedLen.value;
        }
        throw new Asn1TagMatchFailedException(asn1BerDecodeBuffer, new Asn1Tag(s, s2, i), this.mParsedTag);
    }

    public boolean matchTypeName(String str) {
        return true;
    }

    public void pdiag(String str) {
        Diag.instance().println(str);
    }

    @Override // com.objsys.asn1j.runtime.Asn1TypeIF
    public void print(PrintStream printStream, String str, int i) {
        indent(printStream, i);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(" = ");
        stringBuffer.append(toString());
        printStream.getClass();
    }

    public void setKey(byte[] bArr) {
        Asn1RunTime.instance().setKey(bArr);
    }

    @Override // com.objsys.asn1j.runtime.Asn1TypeIF
    public void setOpenType() {
        this.mOpenType = true;
    }

    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer) throws Asn1Exception, IOException {
        decode(asn1BerDecodeBuffer, true, 0);
    }

    @Override // com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z) throws Asn1Exception, IOException {
    }

    @Override // com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
    }

    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer) throws Asn1Exception {
        return encode(asn1BerEncodeBuffer, true);
    }

    @Override // com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Object obj, String str) throws Asn1Exception, IOException {
        throw new Asn1Exception("Attempt to invoke base class XER decode method.");
    }

    @Override // com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        return 0;
    }

    @Override // com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Object obj, InputStream inputStream) throws Asn1Exception, IOException {
        throw new Asn1Exception("Attempt to invoke base class XER decode method.");
    }

    @Override // com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder) throws Asn1Exception, IOException {
        encode(asn1XerEncoder, (String) null);
    }

    @Override // com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str) throws Asn1Exception, IOException {
        throw new Asn1Exception("Attempt to invoke base class XER encode method.");
    }

    @Override // com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XmlEncodeBuffer asn1XmlEncodeBuffer) throws Asn1Exception, IOException {
        encode(asn1XmlEncodeBuffer, null, null);
    }

    @Override // com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str, String str2) throws Asn1Exception, IOException {
        throw new Asn1Exception("Attempt to invoke base class XML encode method.");
    }

    @Override // com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerOutputStream asn1PerOutputStream) throws Asn1Exception, IOException {
        throw new Asn1Exception("Attempt to invoke base class PER encode method.");
    }

    public int matchTag(Asn1BerDecodeBuffer asn1BerDecodeBuffer, Asn1Tag asn1Tag) throws Asn1Exception, IOException {
        return matchTag(asn1BerDecodeBuffer, asn1Tag.mClass, asn1Tag.mForm, asn1Tag.mIDCode);
    }
}
