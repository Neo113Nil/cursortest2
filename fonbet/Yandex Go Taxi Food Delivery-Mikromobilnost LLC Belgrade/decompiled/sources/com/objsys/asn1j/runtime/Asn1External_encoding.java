package com.objsys.asn1j.runtime;

import defpackage.n;
import defpackage.x8e;
import java.io.IOException;
import java.io.PrintStream;

/* loaded from: classes11.dex */
public class Asn1External_encoding extends Asn1Choice {
    public static final byte _ARBITRARY = 3;
    public static final byte _OCTET_ALIGNED = 2;
    public static final byte _SINGLE_ASN1_TYPE = 1;

    public Asn1External_encoding(byte b, Asn1Type asn1Type) {
        setElement(b, asn1Type);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        Asn1Tag h = n.h(asn1BerDecodeBuffer, 8);
        int decodeTagAndLength = asn1BerDecodeBuffer.decodeTagAndLength(h);
        if (h.equals((short) 128, (short) 32, 0)) {
            Asn1OpenType asn1OpenType = new Asn1OpenType();
            asn1BerDecodeBuffer.invokeStartElement("single_ASN1_type", -1);
            setElement(1, asn1OpenType);
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            asn1BerDecodeBuffer.invokeCharacters(asn1OpenType.toString());
            asn1BerDecodeBuffer.invokeEndElement("single_ASN1_type", -1);
            if (decodeTagAndLength == -9999) {
                matchTag(asn1BerDecodeBuffer, Asn1Tag.EOC);
                return;
            }
            return;
        }
        if (h.equals((short) 128, (short) 0, 1)) {
            Asn1OctetString asn1OctetString = new Asn1OctetString();
            asn1BerDecodeBuffer.invokeStartElement("octet_aligned", -1);
            setElement(2, asn1OctetString);
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
            asn1BerDecodeBuffer.invokeCharacters(asn1OctetString.toString());
            asn1BerDecodeBuffer.invokeEndElement("octet_aligned", -1);
            return;
        }
        if (!h.equals((short) 128, (short) 0, 2)) {
            x8e.d(asn1BerDecodeBuffer, h);
            return;
        }
        Asn1BitString asn1BitString = new Asn1BitString();
        asn1BerDecodeBuffer.invokeStartElement("arbitrary", -1);
        setElement(3, asn1BitString);
        this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
        asn1BerDecodeBuffer.invokeCharacters(asn1BitString.toString());
        asn1BerDecodeBuffer.invokeEndElement("arbitrary", -1);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode;
        int encodeTagAndLength;
        int i = this.choiceID;
        if (i == 1) {
            encode = ((Asn1OpenType) getElement()).encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode);
        } else if (i == 2) {
            encode = ((Asn1OctetString) getElement()).encode(asn1BerEncodeBuffer, false);
            encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 1, encode);
        } else {
            if (i != 3) {
                x8e.b();
                return 0;
            }
            encode = ((Asn1BitString) getElement()).encode(asn1BerEncodeBuffer, false);
            encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 2, encode);
        }
        return encodeTagAndLength + encode;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Choice
    public String getElemName() {
        int i = this.choiceID;
        return i != 1 ? i != 2 ? i != 3 ? "UNDEFINED" : "arbitrary" : "octet_aligned" : "single_ASN1_type";
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void print(PrintStream printStream, String str, int i) {
        indent(printStream, i);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(" {");
        printStream.getClass();
        Asn1Type asn1Type = this.element;
        if (asn1Type != null) {
            asn1Type.print(printStream, getElemName(), i + 1);
        }
        indent(printStream, i);
    }

    public void set_arbitrary(Asn1BitString asn1BitString) {
        setElement(3, asn1BitString);
    }

    public void set_octet_aligned(Asn1OctetString asn1OctetString) {
        setElement(2, asn1OctetString);
    }

    public void set_single_ASN1_type(Asn1OpenType asn1OpenType) {
        setElement(1, asn1OpenType);
    }

    public Asn1External_encoding() {
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z) throws Asn1Exception, IOException {
        int i = this.choiceID;
        if (i == 1) {
            Asn1OpenType asn1OpenType = (Asn1OpenType) getElement();
            asn1BerOutputStream.encodeTagAndIndefLen((short) 128, (short) 32, 0);
            asn1OpenType.encode(asn1BerOutputStream, true);
            asn1BerOutputStream.encodeEOC();
            return;
        }
        if (i == 2) {
            Asn1OctetString asn1OctetString = (Asn1OctetString) getElement();
            asn1BerOutputStream.encodeTag((short) 128, (short) 0, 1);
            asn1OctetString.encode(asn1BerOutputStream, false);
        } else {
            if (i == 3) {
                Asn1BitString asn1BitString = (Asn1BitString) getElement();
                asn1BerOutputStream.encodeTag((short) 128, (short) 0, 2);
                asn1BitString.encode(asn1BerOutputStream, false);
                return;
            }
            x8e.b();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException {
        asn1PerEncodeBuffer.encodeConsWholeNumber(this.choiceID - 1, 3L, "index");
        int i = this.choiceID;
        if (i == 1) {
            Asn1OpenType asn1OpenType = (Asn1OpenType) this.element;
            Asn1PerEncodeBuffer asn1PerEncodeBuffer2 = new Asn1PerEncodeBuffer(asn1PerEncodeBuffer.isAligned());
            asn1OpenType.encode(asn1PerEncodeBuffer2);
            asn1PerEncodeBuffer.encodeOpenType(asn1PerEncodeBuffer2, null);
            return;
        }
        if (i == 2) {
            ((Asn1OctetString) this.element).encode(asn1PerEncodeBuffer);
        } else if (i == 3) {
            ((Asn1BitString) this.element).encode(asn1PerEncodeBuffer);
        } else {
            x8e.b();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        int decodeConsWholeNumber = (int) asn1PerDecodeBuffer.decodeConsWholeNumber(3L, "index");
        this.choiceID = decodeConsWholeNumber + 1;
        asn1PerDecodeBuffer.invokeStartElement(getElemName(), -1);
        if (decodeConsWholeNumber == 0) {
            Asn1OpenType asn1OpenType = new Asn1OpenType();
            asn1OpenType.decode(asn1PerDecodeBuffer);
            this.element = asn1OpenType;
            asn1PerDecodeBuffer.invokeCharacters(asn1OpenType.toString());
        } else if (decodeConsWholeNumber == 1) {
            Asn1OctetString asn1OctetString = new Asn1OctetString();
            asn1OctetString.decode(asn1PerDecodeBuffer);
            this.element = asn1OctetString;
            asn1PerDecodeBuffer.invokeCharacters(asn1OctetString.toString());
        } else if (decodeConsWholeNumber == 2) {
            Asn1BitString asn1BitString = new Asn1BitString();
            asn1BitString.decode(asn1PerDecodeBuffer);
            this.element = asn1BitString;
            asn1PerDecodeBuffer.invokeCharacters(asn1BitString.toString());
        } else {
            throw new Asn1InvalidChoiceOptionException(asn1PerDecodeBuffer, decodeConsWholeNumber);
        }
        asn1PerDecodeBuffer.invokeEndElement(getElemName(), -1);
    }
}
