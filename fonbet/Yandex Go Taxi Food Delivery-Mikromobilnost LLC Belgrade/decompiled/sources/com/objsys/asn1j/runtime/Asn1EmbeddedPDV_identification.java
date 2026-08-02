package com.objsys.asn1j.runtime;

import defpackage.n;
import defpackage.x8e;
import java.io.IOException;
import java.io.PrintStream;

/* loaded from: classes11.dex */
public class Asn1EmbeddedPDV_identification extends Asn1Choice {
    public static final byte _CONTEXT_NEGOTIATION = 4;
    public static final byte _FIXED = 6;
    public static final byte _PRESENTATION_CONTEXT_ID = 3;
    public static final byte _SYNTAX = 2;
    public static final byte _SYNTAXES = 1;
    public static final byte _TRANSFER_SYNTAX = 5;

    public Asn1EmbeddedPDV_identification(byte b, Asn1Type asn1Type) {
        setElement(b, asn1Type);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        Asn1Tag h = n.h(asn1BerDecodeBuffer, 8);
        int decodeTagAndLength = asn1BerDecodeBuffer.decodeTagAndLength(h);
        if (h.equals((short) 128, (short) 32, 0)) {
            Asn1Type asn1EmbeddedPDV_identification_syntaxes = new Asn1EmbeddedPDV_identification_syntaxes();
            asn1BerDecodeBuffer.invokeStartElement("syntaxes", -1);
            setElement(1, asn1EmbeddedPDV_identification_syntaxes);
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
            asn1BerDecodeBuffer.invokeEndElement("syntaxes", -1);
            if (decodeTagAndLength == -9999) {
                matchTag(asn1BerDecodeBuffer, Asn1Tag.EOC);
                return;
            }
            return;
        }
        if (h.equals((short) 128, (short) 0, 1)) {
            Asn1ObjectIdentifier asn1ObjectIdentifier = new Asn1ObjectIdentifier();
            asn1BerDecodeBuffer.invokeStartElement("syntax", -1);
            setElement(2, asn1ObjectIdentifier);
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
            asn1BerDecodeBuffer.invokeCharacters(asn1ObjectIdentifier.toString());
            asn1BerDecodeBuffer.invokeEndElement("syntax", -1);
            return;
        }
        if (h.equals((short) 128, (short) 0, 2)) {
            Asn1Integer asn1Integer = new Asn1Integer();
            asn1BerDecodeBuffer.invokeStartElement("presentation_context_id", -1);
            setElement(3, asn1Integer);
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
            asn1BerDecodeBuffer.invokeCharacters(asn1Integer.toString());
            asn1BerDecodeBuffer.invokeEndElement("presentation_context_id", -1);
            return;
        }
        if (h.equals((short) 128, (short) 32, 3)) {
            Asn1Type asn1EmbeddedPDV_identification_context_negotiation = new Asn1EmbeddedPDV_identification_context_negotiation();
            asn1BerDecodeBuffer.invokeStartElement("context_negotiation", -1);
            setElement(4, asn1EmbeddedPDV_identification_context_negotiation);
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
            asn1BerDecodeBuffer.invokeEndElement("context_negotiation", -1);
            if (decodeTagAndLength == -9999) {
                matchTag(asn1BerDecodeBuffer, Asn1Tag.EOC);
                return;
            }
            return;
        }
        if (h.equals((short) 128, (short) 0, 4)) {
            Asn1ObjectIdentifier asn1ObjectIdentifier2 = new Asn1ObjectIdentifier();
            asn1BerDecodeBuffer.invokeStartElement("transfer_syntax", -1);
            setElement(5, asn1ObjectIdentifier2);
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
            asn1BerDecodeBuffer.invokeCharacters(asn1ObjectIdentifier2.toString());
            asn1BerDecodeBuffer.invokeEndElement("transfer_syntax", -1);
            return;
        }
        if (!h.equals((short) 128, (short) 0, 5)) {
            x8e.d(asn1BerDecodeBuffer, h);
            return;
        }
        Asn1Null asn1Null = Asn1Null.NULL_VALUE;
        asn1BerDecodeBuffer.invokeStartElement("fixed", -1);
        setElement(6, asn1Null);
        this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
        asn1BerDecodeBuffer.invokeCharacters(asn1Null.toString());
        asn1BerDecodeBuffer.invokeEndElement("fixed", -1);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode;
        int encodeTagAndLength;
        switch (this.choiceID) {
            case 1:
                encode = ((Asn1EmbeddedPDV_identification_syntaxes) getElement()).encode(asn1BerEncodeBuffer, false);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode);
                break;
            case 2:
                encode = ((Asn1ObjectIdentifier) getElement()).encode(asn1BerEncodeBuffer, false);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 1, encode);
                break;
            case 3:
                encode = ((Asn1Integer) getElement()).encode(asn1BerEncodeBuffer, false);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 2, encode);
                break;
            case 4:
                encode = ((Asn1EmbeddedPDV_identification_context_negotiation) getElement()).encode(asn1BerEncodeBuffer, false);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode);
                break;
            case 5:
                encode = ((Asn1ObjectIdentifier) getElement()).encode(asn1BerEncodeBuffer, false);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 4, encode);
                break;
            case 6:
                encode = ((Asn1Null) getElement()).encode(asn1BerEncodeBuffer, false);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 5, encode);
                break;
            default:
                x8e.b();
                return 0;
        }
        return encodeTagAndLength + encode;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Choice
    public String getElemName() {
        switch (this.choiceID) {
            case 1:
                return "syntaxes";
            case 2:
                return "syntax";
            case 3:
                return "presentation_context_id";
            case 4:
                return "context_negotiation";
            case 5:
                return "transfer_syntax";
            case 6:
                return "fixed";
            default:
                return "UNDEFINED";
        }
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

    public void set_context_negotiation(Asn1EmbeddedPDV_identification_context_negotiation asn1EmbeddedPDV_identification_context_negotiation) {
        setElement(4, asn1EmbeddedPDV_identification_context_negotiation);
    }

    public void set_fixed() {
        setElement(6, Asn1Null.NULL_VALUE);
    }

    public void set_presentation_context_id(Asn1Integer asn1Integer) {
        setElement(3, asn1Integer);
    }

    public void set_syntax(Asn1ObjectIdentifier asn1ObjectIdentifier) {
        setElement(2, asn1ObjectIdentifier);
    }

    public void set_syntaxes(Asn1EmbeddedPDV_identification_syntaxes asn1EmbeddedPDV_identification_syntaxes) {
        setElement(1, asn1EmbeddedPDV_identification_syntaxes);
    }

    public void set_transfer_syntax(Asn1ObjectIdentifier asn1ObjectIdentifier) {
        setElement(5, asn1ObjectIdentifier);
    }

    public Asn1EmbeddedPDV_identification() {
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z) throws Asn1Exception, IOException {
        switch (this.choiceID) {
            case 1:
                Asn1EmbeddedPDV_identification_syntaxes asn1EmbeddedPDV_identification_syntaxes = (Asn1EmbeddedPDV_identification_syntaxes) getElement();
                asn1BerOutputStream.encodeTagAndIndefLen((short) 128, (short) 32, 0);
                asn1EmbeddedPDV_identification_syntaxes.encode(asn1BerOutputStream, false);
                asn1BerOutputStream.encodeEOC();
                break;
            case 2:
                Asn1ObjectIdentifier asn1ObjectIdentifier = (Asn1ObjectIdentifier) getElement();
                asn1BerOutputStream.encodeTag((short) 128, (short) 0, 1);
                asn1ObjectIdentifier.encode(asn1BerOutputStream, false);
                break;
            case 3:
                Asn1Integer asn1Integer = (Asn1Integer) getElement();
                asn1BerOutputStream.encodeTag((short) 128, (short) 0, 2);
                asn1Integer.encode(asn1BerOutputStream, false);
                break;
            case 4:
                Asn1EmbeddedPDV_identification_context_negotiation asn1EmbeddedPDV_identification_context_negotiation = (Asn1EmbeddedPDV_identification_context_negotiation) getElement();
                asn1BerOutputStream.encodeTagAndIndefLen((short) 128, (short) 32, 3);
                asn1EmbeddedPDV_identification_context_negotiation.encode(asn1BerOutputStream, false);
                asn1BerOutputStream.encodeEOC();
                break;
            case 5:
                Asn1ObjectIdentifier asn1ObjectIdentifier2 = (Asn1ObjectIdentifier) getElement();
                asn1BerOutputStream.encodeTag((short) 128, (short) 0, 4);
                asn1ObjectIdentifier2.encode(asn1BerOutputStream, false);
                break;
            case 6:
                Asn1Null asn1Null = (Asn1Null) getElement();
                asn1BerOutputStream.encodeTag((short) 128, (short) 0, 5);
                asn1Null.encode(asn1BerOutputStream, false);
                break;
            default:
                x8e.b();
                break;
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException {
        asn1PerEncodeBuffer.encodeConsWholeNumber(this.choiceID - 1, 6L, "index");
        switch (this.choiceID) {
            case 1:
                ((Asn1EmbeddedPDV_identification_syntaxes) this.element).encode(asn1PerEncodeBuffer);
                break;
            case 2:
                ((Asn1ObjectIdentifier) this.element).encode(asn1PerEncodeBuffer);
                break;
            case 3:
                ((Asn1Integer) this.element).encode(asn1PerEncodeBuffer);
                break;
            case 4:
                ((Asn1EmbeddedPDV_identification_context_negotiation) this.element).encode(asn1PerEncodeBuffer);
                break;
            case 5:
                ((Asn1ObjectIdentifier) this.element).encode(asn1PerEncodeBuffer);
                break;
            case 6:
                ((Asn1Null) this.element).encode(asn1PerEncodeBuffer);
                break;
            default:
                x8e.b();
                break;
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        int decodeConsWholeNumber = (int) asn1PerDecodeBuffer.decodeConsWholeNumber(6L, "index");
        this.choiceID = decodeConsWholeNumber + 1;
        asn1PerDecodeBuffer.invokeStartElement(getElemName(), -1);
        if (decodeConsWholeNumber == 0) {
            Asn1EmbeddedPDV_identification_syntaxes asn1EmbeddedPDV_identification_syntaxes = new Asn1EmbeddedPDV_identification_syntaxes();
            asn1EmbeddedPDV_identification_syntaxes.decode(asn1PerDecodeBuffer);
            this.element = asn1EmbeddedPDV_identification_syntaxes;
        } else if (decodeConsWholeNumber == 1) {
            Asn1ObjectIdentifier asn1ObjectIdentifier = new Asn1ObjectIdentifier();
            asn1ObjectIdentifier.decode(asn1PerDecodeBuffer);
            this.element = asn1ObjectIdentifier;
            asn1PerDecodeBuffer.invokeCharacters(asn1ObjectIdentifier.toString());
        } else if (decodeConsWholeNumber == 2) {
            Asn1Integer asn1Integer = new Asn1Integer();
            asn1Integer.decode(asn1PerDecodeBuffer);
            this.element = asn1Integer;
            asn1PerDecodeBuffer.invokeCharacters(asn1Integer.toString());
        } else if (decodeConsWholeNumber == 3) {
            Asn1EmbeddedPDV_identification_context_negotiation asn1EmbeddedPDV_identification_context_negotiation = new Asn1EmbeddedPDV_identification_context_negotiation();
            asn1EmbeddedPDV_identification_context_negotiation.decode(asn1PerDecodeBuffer);
            this.element = asn1EmbeddedPDV_identification_context_negotiation;
        } else if (decodeConsWholeNumber == 4) {
            Asn1ObjectIdentifier asn1ObjectIdentifier2 = new Asn1ObjectIdentifier();
            asn1ObjectIdentifier2.decode(asn1PerDecodeBuffer);
            this.element = asn1ObjectIdentifier2;
            asn1PerDecodeBuffer.invokeCharacters(asn1ObjectIdentifier2.toString());
        } else if (decodeConsWholeNumber == 5) {
            Asn1Null asn1Null = Asn1Null.NULL_VALUE;
            asn1Null.decode(asn1PerDecodeBuffer);
            this.element = asn1Null;
            asn1PerDecodeBuffer.invokeCharacters(asn1Null.toString());
        } else {
            throw new Asn1InvalidChoiceOptionException(asn1PerDecodeBuffer, decodeConsWholeNumber);
        }
        asn1PerDecodeBuffer.invokeEndElement(getElemName(), -1);
    }
}
