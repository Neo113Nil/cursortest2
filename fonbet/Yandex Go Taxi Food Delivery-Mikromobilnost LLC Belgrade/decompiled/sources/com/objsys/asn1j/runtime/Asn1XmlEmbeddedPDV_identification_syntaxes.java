package com.objsys.asn1j.runtime;

import defpackage.n;
import defpackage.quz;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/* loaded from: classes11.dex */
public class Asn1XmlEmbeddedPDV_identification_syntaxes extends Asn1Type {
    public Asn1ObjectIdentifier abstract_;
    public Asn1ObjectIdentifier transfer;
    public String _mTypeName = "embeddedPDV_identification_syntaxes";
    private transient Asn1XerSaxHandler mSaxHandler = null;

    public class SaxHandler extends Asn1XerSaxHandler {
        private static final byte _ABSTRACT_ = 1;
        private static final byte _TRANSFER = 2;
        StringBuffer mCurrElemValue = new StringBuffer();
        int mReqElemCnt;

        public SaxHandler() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) throws SAXException {
            int i3 = this.mCurrState;
            if ((i3 == 1 || i3 == 2) && this.mLevel >= 2) {
                int i4 = this.mCurrElemID;
                if (i4 == 1 || i4 == 2) {
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
                if (this.mReqElemCnt != 2) {
                    throw new SAXException("missing required fields");
                }
                return;
            }
            if (i == 1) {
                if (this.mCurrState == 2) {
                    try {
                        int i2 = this.mCurrElemID;
                        if (i2 == 1) {
                            Asn1XmlEmbeddedPDV_identification_syntaxes.this.abstract_ = new Asn1ObjectIdentifier();
                            Asn1XmlEmbeddedPDV_identification_syntaxes.this.abstract_.decodeXML(this.mCurrElemValue.toString(), null);
                        } else if (i2 == 2) {
                            Asn1XmlEmbeddedPDV_identification_syntaxes.this.transfer = new Asn1ObjectIdentifier();
                            Asn1XmlEmbeddedPDV_identification_syntaxes.this.transfer.decodeXML(this.mCurrElemValue.toString(), null);
                        }
                    } catch (Asn1Exception e) {
                        throw new SAXException(e.getMessage());
                    }
                }
                this.mCurrState = 3;
            }
        }

        public int getElementID(String str, String str2, String str3) {
            Asn1XerElemInfo[] asn1XerElemInfoArr = {new Asn1XerElemInfo("abstract", false), new Asn1XerElemInfo("transfer", false)};
            for (int i = this.mCurrElemID; i < 2; i++) {
                if (asn1XerElemInfoArr[i].equals(str2)) {
                    if (!asn1XerElemInfoArr[i].isOptional()) {
                        this.mReqElemCnt++;
                    }
                    return i + 1;
                }
                if (!asn1XerElemInfoArr[i].isOptional()) {
                    return -1;
                }
            }
            return -1;
        }

        @Override // com.objsys.asn1j.runtime.Asn1XerSaxHandler
        public void init(int i) {
            super.init(i);
            this.mReqElemCnt = 0;
            Asn1XmlEmbeddedPDV_identification_syntaxes asn1XmlEmbeddedPDV_identification_syntaxes = Asn1XmlEmbeddedPDV_identification_syntaxes.this;
            asn1XmlEmbeddedPDV_identification_syntaxes.abstract_ = null;
            asn1XmlEmbeddedPDV_identification_syntaxes.transfer = null;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            int i = this.mLevel;
            if (i == 0) {
                if (!Asn1XmlEmbeddedPDV_identification_syntaxes.this.matchTypeName(str2)) {
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
            }
            this.mLevel++;
        }
    }

    public Asn1XmlEmbeddedPDV_identification_syntaxes(int[] iArr, int[] iArr2) {
        this.abstract_ = new Asn1ObjectIdentifier(iArr);
        this.transfer = new Asn1ObjectIdentifier(iArr2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 0, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1ObjectIdentifier asn1ObjectIdentifier = new Asn1ObjectIdentifier();
        this.abstract_ = asn1ObjectIdentifier;
        asn1ObjectIdentifier.decode(asn1BerDecodeBuffer, false, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 1, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1ObjectIdentifier asn1ObjectIdentifier2 = new Asn1ObjectIdentifier();
        this.transfer = asn1ObjectIdentifier2;
        asn1ObjectIdentifier2.decode(asn1BerDecodeBuffer, false, intHolder.value);
        if (!asn1BerDecodeContext.expired()) {
            Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
            if (peekTag.equals((short) 128, (short) 0, 0) || peekTag.equals((short) 128, (short) 0, 1)) {
                quz.g();
                return;
            }
        }
        if (z && i == -9999) {
            matchTag(asn1BerDecodeBuffer, Asn1Tag.EOC);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.transfer.encode(asn1BerEncodeBuffer, false);
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 1, encode) + encode;
        int encode2 = this.abstract_.encode(asn1BerEncodeBuffer, false);
        int encodeTagAndLength2 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 0, encode2) + encodeTagAndLength + encode2;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encodeTagAndLength2) + encodeTagAndLength2 : encodeTagAndLength2;
    }

    public Asn1XerSaxHandler getSaxHandler() {
        if (this.mSaxHandler == null) {
            this.mSaxHandler = new SaxHandler();
        }
        this.mSaxHandler.init(0);
        return this.mSaxHandler;
    }

    public void init() {
        this.abstract_ = null;
        this.transfer = null;
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
        Asn1ObjectIdentifier asn1ObjectIdentifier = this.abstract_;
        if (asn1ObjectIdentifier != null) {
            asn1ObjectIdentifier.print(printStream, "abstract_", i + 1);
        }
        Asn1ObjectIdentifier asn1ObjectIdentifier2 = this.transfer;
        if (asn1ObjectIdentifier2 != null) {
            asn1ObjectIdentifier2.print(printStream, "transfer", i + 1);
        }
        indent(printStream, i);
    }

    public Asn1XmlEmbeddedPDV_identification_syntaxes(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1ObjectIdentifier asn1ObjectIdentifier2) {
        this.abstract_ = asn1ObjectIdentifier;
        this.transfer = asn1ObjectIdentifier2;
    }

    public Asn1XmlEmbeddedPDV_identification_syntaxes() {
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z) throws Asn1Exception, IOException {
        if (z) {
            asn1BerOutputStream.encodeTagAndIndefLen(Asn1Tag.SEQUENCE);
        }
        asn1BerOutputStream.encodeTag((short) 128, (short) 0, 0);
        this.abstract_.encode(asn1BerOutputStream, false);
        asn1BerOutputStream.encodeTag((short) 128, (short) 0, 1);
        this.transfer.encode(asn1BerOutputStream, false);
        if (z) {
            asn1BerOutputStream.encodeEOC();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException {
        Asn1ObjectIdentifier asn1ObjectIdentifier = this.abstract_;
        if (asn1ObjectIdentifier != null) {
            asn1ObjectIdentifier.encode(asn1PerEncodeBuffer);
            Asn1ObjectIdentifier asn1ObjectIdentifier2 = this.transfer;
            if (asn1ObjectIdentifier2 != null) {
                asn1ObjectIdentifier2.encode(asn1PerEncodeBuffer);
                return;
            } else {
                quz.k("transfer");
                return;
            }
        }
        quz.k("abstract_");
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str, String str2) throws Asn1Exception, IOException {
        if (str == null) {
            str = "embeddedPDV_identification_syntaxes";
        }
        asn1XerEncoder.encodeStartElement(str, str2);
        asn1XerEncoder.incrLevel();
        this.abstract_.encode(asn1XerEncoder, "abstract", null);
        this.transfer.encode(asn1XerEncoder, "transfer", null);
        asn1XerEncoder.decrLevel();
        asn1XerEncoder.encodeEndElement(str);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        init();
        Asn1ObjectIdentifier asn1ObjectIdentifier = new Asn1ObjectIdentifier();
        this.abstract_ = asn1ObjectIdentifier;
        asn1ObjectIdentifier.decode(asn1PerDecodeBuffer);
        Asn1ObjectIdentifier asn1ObjectIdentifier2 = new Asn1ObjectIdentifier();
        this.transfer = asn1ObjectIdentifier2;
        asn1ObjectIdentifier2.decode(asn1PerDecodeBuffer);
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
