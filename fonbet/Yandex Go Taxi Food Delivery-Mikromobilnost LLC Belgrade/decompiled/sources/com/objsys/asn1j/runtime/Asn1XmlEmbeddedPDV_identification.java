package com.objsys.asn1j.runtime;

import defpackage.n;
import defpackage.quz;
import defpackage.x8e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/* loaded from: classes11.dex */
public class Asn1XmlEmbeddedPDV_identification extends Asn1Choice {
    public static final byte _CONTEXT_NEGOTIATION = 4;
    public static final byte _FIXED = 6;
    public static final byte _PRESENTATION_CONTEXT_ID = 3;
    public static final byte _SYNTAX = 2;
    public static final byte _SYNTAXES = 1;
    public static final byte _TRANSFER_SYNTAX = 5;
    public String _mTypeName = "embeddedPDV_identification";
    private transient Asn1XerSaxHandler mSaxHandler = null;

    public class SaxHandler extends Asn1XerSaxHandler {
        Asn1XerSaxHandler mElemSaxHandler = null;
        StringBuffer mCurrElemValue = new StringBuffer();

        public SaxHandler() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) throws SAXException {
            int i3 = this.mCurrState;
            if ((i3 == 1 || i3 == 2) && this.mLevel >= 2) {
                Asn1XerSaxHandler asn1XerSaxHandler = this.mElemSaxHandler;
                if (asn1XerSaxHandler != null) {
                    asn1XerSaxHandler.characters(cArr, i, i2);
                    return;
                }
                int i4 = this.mCurrElemID;
                if (i4 == 2 || i4 == 3 || i4 == 5 || i4 == 6) {
                    this.mCurrState = 2;
                    this.mCurrElemValue.append(cArr, i, i2);
                }
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
            int i = this.mLevel - 1;
            this.mLevel = i;
            if (i == 0) {
                return;
            }
            if (i != 1) {
                Asn1XerSaxHandler asn1XerSaxHandler = this.mElemSaxHandler;
                if (asn1XerSaxHandler != null) {
                    asn1XerSaxHandler.endElement(str, str2, str3);
                    return;
                }
                return;
            }
            if (this.mCurrState == 2) {
                try {
                    int i2 = this.mCurrElemID;
                    if (i2 == 2) {
                        Asn1ObjectIdentifier asn1ObjectIdentifier = new Asn1ObjectIdentifier();
                        Asn1XmlEmbeddedPDV_identification.this.set_syntax(asn1ObjectIdentifier);
                        asn1ObjectIdentifier.decodeXML(this.mCurrElemValue.toString(), null);
                    } else if (i2 == 3) {
                        Asn1Integer asn1Integer = new Asn1Integer();
                        Asn1XmlEmbeddedPDV_identification.this.set_presentation_context_id(asn1Integer);
                        asn1Integer.decodeXML(this.mCurrElemValue.toString(), null);
                    } else if (i2 == 5) {
                        Asn1ObjectIdentifier asn1ObjectIdentifier2 = new Asn1ObjectIdentifier();
                        Asn1XmlEmbeddedPDV_identification.this.set_transfer_syntax(asn1ObjectIdentifier2);
                        asn1ObjectIdentifier2.decodeXML(this.mCurrElemValue.toString(), null);
                    } else if (i2 == 6) {
                        Asn1Null asn1Null = new Asn1Null();
                        Asn1XmlEmbeddedPDV_identification.this.set_fixed();
                        asn1Null.decodeXML(this.mCurrElemValue.toString(), null);
                    }
                } catch (Asn1Exception e) {
                    throw new SAXException(e.getMessage());
                }
            }
            Asn1XerSaxHandler asn1XerSaxHandler2 = this.mElemSaxHandler;
            if (asn1XerSaxHandler2 != null) {
                asn1XerSaxHandler2.endElement(str, str2, str3);
                this.mElemSaxHandler = null;
            }
            this.mCurrState = 3;
        }

        public int getElementID(String str, String str2, String str3) {
            Asn1XerElemInfo[] asn1XerElemInfoArr = {new Asn1XerElemInfo("syntaxes", false), new Asn1XerElemInfo("syntax", false), new Asn1XerElemInfo("presentation_context_id", false), new Asn1XerElemInfo("context_negotiation", false), new Asn1XerElemInfo("transfer_syntax", false), new Asn1XerElemInfo("fixed", false)};
            for (int i = 0; i < 6; i++) {
                if (asn1XerElemInfoArr[i].equals(str2)) {
                    return i + 1;
                }
            }
            return -1;
        }

        @Override // com.objsys.asn1j.runtime.Asn1XerSaxHandler
        public void init(int i) {
            super.init(i);
            this.mElemSaxHandler = null;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            int i = this.mLevel;
            if (i == 0) {
                if (!Asn1XmlEmbeddedPDV_identification.this.matchTypeName(str2)) {
                    throw new SAXException(n.j("unexpected tag: ", str2));
                }
            } else if (i == 1) {
                this.mCurrState = 1;
                int elementID = getElementID(str, str2, str3);
                this.mCurrElemID = elementID;
                if (elementID == -1) {
                    throw new SAXException(n.j("unexpected tag: ", str2));
                }
                this.mCurrElemValue.setLength(0);
                int i2 = this.mCurrElemID;
                if (i2 == 1) {
                    Asn1XmlEmbeddedPDV_identification_syntaxes asn1XmlEmbeddedPDV_identification_syntaxes = new Asn1XmlEmbeddedPDV_identification_syntaxes();
                    Asn1XmlEmbeddedPDV_identification.this.set_syntaxes(asn1XmlEmbeddedPDV_identification_syntaxes);
                    Asn1XerSaxHandler saxHandler = asn1XmlEmbeddedPDV_identification_syntaxes.getSaxHandler();
                    this.mElemSaxHandler = saxHandler;
                    saxHandler.init(1);
                } else if (i2 == 4) {
                    Asn1XmlEmbeddedPDV_identification_context_negotiation asn1XmlEmbeddedPDV_identification_context_negotiation = new Asn1XmlEmbeddedPDV_identification_context_negotiation();
                    Asn1XmlEmbeddedPDV_identification.this.set_context_negotiation(asn1XmlEmbeddedPDV_identification_context_negotiation);
                    Asn1XerSaxHandler saxHandler2 = asn1XmlEmbeddedPDV_identification_context_negotiation.getSaxHandler();
                    this.mElemSaxHandler = saxHandler2;
                    saxHandler2.init(1);
                }
            } else {
                Asn1XerSaxHandler asn1XerSaxHandler = this.mElemSaxHandler;
                if (asn1XerSaxHandler != null) {
                    asn1XerSaxHandler.startElement(str, str2, str3, attributes);
                }
            }
            this.mLevel++;
        }
    }

    public Asn1XmlEmbeddedPDV_identification(byte b, Asn1Type asn1Type) {
        setElement(b, asn1Type);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        Asn1Tag h = n.h(asn1BerDecodeBuffer, 8);
        int decodeTagAndLength = asn1BerDecodeBuffer.decodeTagAndLength(h);
        if (h.equals((short) 128, (short) 32, 0)) {
            setElement(1, new Asn1XmlEmbeddedPDV_identification_syntaxes());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
            if (decodeTagAndLength == -9999) {
                matchTag(asn1BerDecodeBuffer, Asn1Tag.EOC);
                return;
            }
            return;
        }
        if (h.equals((short) 128, (short) 0, 1)) {
            setElement(2, new Asn1ObjectIdentifier());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 0, 2)) {
            setElement(3, new Asn1Integer());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 3)) {
            setElement(4, new Asn1XmlEmbeddedPDV_identification_context_negotiation());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
            if (decodeTagAndLength == -9999) {
                matchTag(asn1BerDecodeBuffer, Asn1Tag.EOC);
                return;
            }
            return;
        }
        if (h.equals((short) 128, (short) 0, 4)) {
            setElement(5, new Asn1ObjectIdentifier());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
        } else if (!h.equals((short) 128, (short) 0, 5)) {
            x8e.d(asn1BerDecodeBuffer, h);
        } else {
            setElement(6, Asn1Null.NULL_VALUE);
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode;
        int encodeTagAndLength;
        switch (this.choiceID) {
            case 1:
                encode = ((Asn1XmlEmbeddedPDV_identification_syntaxes) getElement()).encode(asn1BerEncodeBuffer, false);
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
                encode = ((Asn1XmlEmbeddedPDV_identification_context_negotiation) getElement()).encode(asn1BerEncodeBuffer, false);
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

    public Asn1XerSaxHandler getSaxHandler() {
        if (this.mSaxHandler == null) {
            this.mSaxHandler = new SaxHandler();
        }
        this.mSaxHandler.init(0);
        return this.mSaxHandler;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type
    public boolean matchTypeName(String str) {
        return str.equals(this._mTypeName);
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

    public void set_context_negotiation(Asn1XmlEmbeddedPDV_identification_context_negotiation asn1XmlEmbeddedPDV_identification_context_negotiation) {
        setElement(4, asn1XmlEmbeddedPDV_identification_context_negotiation);
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

    public void set_syntaxes(Asn1XmlEmbeddedPDV_identification_syntaxes asn1XmlEmbeddedPDV_identification_syntaxes) {
        setElement(1, asn1XmlEmbeddedPDV_identification_syntaxes);
    }

    public void set_transfer_syntax(Asn1ObjectIdentifier asn1ObjectIdentifier) {
        setElement(5, asn1ObjectIdentifier);
    }

    public Asn1XmlEmbeddedPDV_identification() {
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z) throws Asn1Exception, IOException {
        switch (this.choiceID) {
            case 1:
                Asn1XmlEmbeddedPDV_identification_syntaxes asn1XmlEmbeddedPDV_identification_syntaxes = (Asn1XmlEmbeddedPDV_identification_syntaxes) getElement();
                asn1BerOutputStream.encodeTagAndIndefLen((short) 128, (short) 32, 0);
                asn1XmlEmbeddedPDV_identification_syntaxes.encode(asn1BerOutputStream, false);
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
                Asn1XmlEmbeddedPDV_identification_context_negotiation asn1XmlEmbeddedPDV_identification_context_negotiation = (Asn1XmlEmbeddedPDV_identification_context_negotiation) getElement();
                asn1BerOutputStream.encodeTagAndIndefLen((short) 128, (short) 32, 3);
                asn1XmlEmbeddedPDV_identification_context_negotiation.encode(asn1BerOutputStream, false);
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
                ((Asn1XmlEmbeddedPDV_identification_syntaxes) this.element).encode(asn1PerEncodeBuffer);
                break;
            case 2:
                ((Asn1ObjectIdentifier) this.element).encode(asn1PerEncodeBuffer);
                break;
            case 3:
                ((Asn1Integer) this.element).encode(asn1PerEncodeBuffer);
                break;
            case 4:
                ((Asn1XmlEmbeddedPDV_identification_context_negotiation) this.element).encode(asn1PerEncodeBuffer);
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
    public void encode(Asn1XerEncoder asn1XerEncoder, String str, String str2) throws Asn1Exception, IOException {
        if (str == null) {
            str = "embeddedPDV_identification";
        }
        if (str.length() > 0) {
            asn1XerEncoder.encodeStartElement(str, str2);
            asn1XerEncoder.incrLevel();
        }
        switch (this.choiceID) {
            case 1:
                ((Asn1XmlEmbeddedPDV_identification_syntaxes) getElement()).encode(asn1XerEncoder, "syntaxes", null);
                break;
            case 2:
                ((Asn1ObjectIdentifier) getElement()).encode(asn1XerEncoder, "syntax", null);
                break;
            case 3:
                ((Asn1Integer) getElement()).encode(asn1XerEncoder, "presentation_context_id", (String) null);
                break;
            case 4:
                ((Asn1XmlEmbeddedPDV_identification_context_negotiation) getElement()).encode(asn1XerEncoder, "context_negotiation", null);
                break;
            case 5:
                ((Asn1ObjectIdentifier) getElement()).encode(asn1XerEncoder, "transfer_syntax", null);
                break;
            case 6:
                ((Asn1Null) getElement()).encode(asn1XerEncoder, "fixed", null);
                break;
            default:
                x8e.b();
                return;
        }
        if (str.length() > 0) {
            asn1XerEncoder.decrLevel();
            asn1XerEncoder.encodeEndElement(str);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        int decodeConsWholeNumber = (int) asn1PerDecodeBuffer.decodeConsWholeNumber(6L, "index");
        this.choiceID = decodeConsWholeNumber + 1;
        if (decodeConsWholeNumber == 0) {
            Asn1XmlEmbeddedPDV_identification_syntaxes asn1XmlEmbeddedPDV_identification_syntaxes = new Asn1XmlEmbeddedPDV_identification_syntaxes();
            asn1XmlEmbeddedPDV_identification_syntaxes.decode(asn1PerDecodeBuffer);
            this.element = asn1XmlEmbeddedPDV_identification_syntaxes;
            return;
        }
        if (decodeConsWholeNumber == 1) {
            Asn1ObjectIdentifier asn1ObjectIdentifier = new Asn1ObjectIdentifier();
            asn1ObjectIdentifier.decode(asn1PerDecodeBuffer);
            this.element = asn1ObjectIdentifier;
            return;
        }
        if (decodeConsWholeNumber == 2) {
            Asn1Integer asn1Integer = new Asn1Integer();
            asn1Integer.decode(asn1PerDecodeBuffer);
            this.element = asn1Integer;
            return;
        }
        if (decodeConsWholeNumber == 3) {
            Asn1XmlEmbeddedPDV_identification_context_negotiation asn1XmlEmbeddedPDV_identification_context_negotiation = new Asn1XmlEmbeddedPDV_identification_context_negotiation();
            asn1XmlEmbeddedPDV_identification_context_negotiation.decode(asn1PerDecodeBuffer);
            this.element = asn1XmlEmbeddedPDV_identification_context_negotiation;
        } else if (decodeConsWholeNumber == 4) {
            Asn1ObjectIdentifier asn1ObjectIdentifier2 = new Asn1ObjectIdentifier();
            asn1ObjectIdentifier2.decode(asn1PerDecodeBuffer);
            this.element = asn1ObjectIdentifier2;
        } else {
            if (decodeConsWholeNumber == 5) {
                Asn1Null asn1Null = Asn1Null.NULL_VALUE;
                asn1Null.decode(asn1PerDecodeBuffer);
                this.element = asn1Null;
                return;
            }
            throw new Asn1InvalidChoiceOptionException(asn1PerDecodeBuffer, decodeConsWholeNumber);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Object obj, String str) throws Asn1Exception, IOException {
        XMLReader xMLReader = (XMLReader) obj;
        try {
            SaxHandler saxHandler = (SaxHandler) getSaxHandler();
            xMLReader.setContentHandler(saxHandler);
            xMLReader.setErrorHandler(saxHandler);
            xMLReader.parse(new InputSource(str));
        } catch (SAXException e) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(byteArrayOutputStream));
            quz.i(byteArrayOutputStream);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Object obj, InputStream inputStream) throws Asn1Exception, IOException {
        XMLReader xMLReader = (XMLReader) obj;
        try {
            SaxHandler saxHandler = (SaxHandler) getSaxHandler();
            xMLReader.setContentHandler(saxHandler);
            xMLReader.setErrorHandler(saxHandler);
            xMLReader.parse(new InputSource(inputStream));
        } catch (SAXException e) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(byteArrayOutputStream));
            quz.i(byteArrayOutputStream);
        }
    }
}
