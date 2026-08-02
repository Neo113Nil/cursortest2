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
public class Asn1XerExternal_encoding extends Asn1Choice {
    public static final byte _ARBITRARY = 3;
    public static final byte _OCTET_ALIGNED = 2;
    public static final byte _SINGLE_ASN1_TYPE = 1;
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
                if (i4 == 1 || i4 == 2 || i4 == 3) {
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
                    if (i2 == 1) {
                        Asn1XerOpenType asn1XerOpenType = new Asn1XerOpenType();
                        Asn1XerExternal_encoding.this.set_single_ASN1_type(asn1XerOpenType);
                        asn1XerOpenType.decodeXER(this.mCurrElemValue.toString(), null);
                    } else if (i2 == 2) {
                        Asn1OctetString asn1OctetString = new Asn1OctetString();
                        Asn1XerExternal_encoding.this.set_octet_aligned(asn1OctetString);
                        asn1OctetString.decodeXER(this.mCurrElemValue.toString(), null);
                    } else if (i2 == 3) {
                        Asn1BitString asn1BitString = new Asn1BitString();
                        Asn1XerExternal_encoding.this.set_arbitrary(asn1BitString);
                        asn1BitString.decodeXER(this.mCurrElemValue.toString(), null);
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
            Asn1XerElemInfo[] asn1XerElemInfoArr = {new Asn1XerElemInfo("single_ASN1_type", false), new Asn1XerElemInfo("octet_aligned", false), new Asn1XerElemInfo("arbitrary", false)};
            for (int i = 0; i < 3; i++) {
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
                if (!Asn1XerExternal_encoding.this.matchTypeName(str2)) {
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
                if (this.mCurrElemID == 1) {
                    Asn1XerOpenType asn1XerOpenType = new Asn1XerOpenType();
                    Asn1XerExternal_encoding.this.set_single_ASN1_type(asn1XerOpenType);
                    Asn1XerSaxHandler saxHandler = asn1XerOpenType.getSaxHandler();
                    this.mElemSaxHandler = saxHandler;
                    saxHandler.init(1);
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

    public Asn1XerExternal_encoding(byte b, Asn1Type asn1Type) {
        setElement(b, asn1Type);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        Asn1Tag h = n.h(asn1BerDecodeBuffer, 8);
        int decodeTagAndLength = asn1BerDecodeBuffer.decodeTagAndLength(h);
        if (h.equals((short) 128, (short) 32, 0)) {
            setElement(1, new Asn1XerOpenType());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            if (decodeTagAndLength == -9999) {
                matchTag(asn1BerDecodeBuffer, Asn1Tag.EOC);
                return;
            }
            return;
        }
        if (h.equals((short) 128, (short) 0, 1)) {
            setElement(2, new Asn1OctetString());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
        } else if (!h.equals((short) 128, (short) 0, 2)) {
            x8e.d(asn1BerDecodeBuffer, h);
        } else {
            setElement(3, new Asn1BitString());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str) throws Asn1Exception, IOException {
        if (str == null) {
            str = "CHOICE";
        }
        if (str.length() > 0) {
            asn1XerEncoder.encodeStartElement(str);
            asn1XerEncoder.incrLevel();
        }
        int i = this.choiceID;
        if (i == 1) {
            ((Asn1XerOpenType) getElement()).encode(asn1XerEncoder, "single_ASN1_type");
        } else if (i == 2) {
            ((Asn1OctetString) getElement()).encode(asn1XerEncoder, "octet_aligned");
        } else {
            if (i != 3) {
                x8e.b();
                return;
            }
            ((Asn1BitString) getElement()).encode(asn1XerEncoder, "arbitrary");
        }
        if (str.length() > 0) {
            asn1XerEncoder.decrLevel();
            asn1XerEncoder.encodeEndElement(str);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Choice
    public String getElemName() {
        int i = this.choiceID;
        return i != 1 ? i != 2 ? i != 3 ? "UNDEFINED" : "arbitrary" : "octet_aligned" : "single_ASN1_type";
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
        return str.equals("CHOICE");
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

    public void set_single_ASN1_type(Asn1XerOpenType asn1XerOpenType) {
        setElement(1, asn1XerOpenType);
    }

    public Asn1XerExternal_encoding() {
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z) throws Asn1Exception, IOException {
        int i = this.choiceID;
        if (i == 1) {
            Asn1XerOpenType asn1XerOpenType = (Asn1XerOpenType) getElement();
            asn1BerOutputStream.encodeTagAndIndefLen((short) 128, (short) 32, 0);
            asn1XerOpenType.encode(asn1BerOutputStream, true);
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
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        int decodeConsWholeNumber = (int) asn1PerDecodeBuffer.decodeConsWholeNumber(3L, "index");
        this.choiceID = decodeConsWholeNumber + 1;
        if (decodeConsWholeNumber == 0) {
            Asn1XerOpenType asn1XerOpenType = new Asn1XerOpenType();
            asn1XerOpenType.decode(asn1PerDecodeBuffer);
            this.element = asn1XerOpenType;
        } else if (decodeConsWholeNumber == 1) {
            Asn1OctetString asn1OctetString = new Asn1OctetString();
            asn1OctetString.decode(asn1PerDecodeBuffer);
            this.element = asn1OctetString;
        } else {
            if (decodeConsWholeNumber == 2) {
                Asn1BitString asn1BitString = new Asn1BitString();
                asn1BitString.decode(asn1PerDecodeBuffer);
                this.element = asn1BitString;
                return;
            }
            throw new Asn1InvalidChoiceOptionException(asn1PerDecodeBuffer, decodeConsWholeNumber);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException {
        asn1PerEncodeBuffer.encodeConsWholeNumber(this.choiceID - 1, 3L, "index");
        int i = this.choiceID;
        if (i == 1) {
            ((Asn1XerOpenType) this.element).encode(asn1PerEncodeBuffer);
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
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode;
        int encodeTagAndLength;
        int i = this.choiceID;
        if (i == 1) {
            encode = ((Asn1XerOpenType) getElement()).encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode);
        } else if (i == 2) {
            encode = ((Asn1OctetString) getElement()).encode(asn1BerEncodeBuffer, false);
            encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 1, encode);
        } else if (i == 3) {
            encode = ((Asn1BitString) getElement()).encode(asn1BerEncodeBuffer, false);
            encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 2, encode);
        } else {
            x8e.b();
            return 0;
        }
        return encodeTagAndLength + encode;
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
