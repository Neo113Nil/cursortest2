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
public class Asn1XmlEmbeddedPDV extends Asn1Type {
    public static final Asn1Tag TAG = new Asn1Tag(0, 32, 11);
    public Asn1OctetString data_value;
    public Asn1ObjectDescriptor data_value_descriptor;
    public Asn1XmlEmbeddedPDV_identification identification;
    public String _mTypeName = "embeddedPDV";
    private transient Asn1XerSaxHandler mSaxHandler = null;

    public class SaxHandler extends Asn1XerSaxHandler {
        private static final byte _DATA_VALUE = 3;
        private static final byte _DATA_VALUE_DESCRIPTOR = 2;
        private static final byte _IDENTIFICATION = 1;
        int mReqElemCnt;
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
                if (i4 == 2 || i4 == 3) {
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
                        Asn1XmlEmbeddedPDV.this.data_value_descriptor = new Asn1ObjectDescriptor();
                        Asn1XmlEmbeddedPDV.this.data_value_descriptor.decodeXML(this.mCurrElemValue.toString(), null);
                    } else if (i2 == 3) {
                        Asn1XmlEmbeddedPDV.this.data_value = new Asn1OctetString();
                        Asn1XmlEmbeddedPDV.this.data_value.decodeXML(this.mCurrElemValue.toString(), null);
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
            Asn1XerElemInfo[] asn1XerElemInfoArr = {new Asn1XerElemInfo("identification", false), new Asn1XerElemInfo("data_value_descriptor", true), new Asn1XerElemInfo("data_value", false)};
            for (int i = this.mCurrElemID; i < 3; i++) {
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
            this.mElemSaxHandler = null;
            this.mReqElemCnt = 0;
            Asn1XmlEmbeddedPDV asn1XmlEmbeddedPDV = Asn1XmlEmbeddedPDV.this;
            asn1XmlEmbeddedPDV.identification = null;
            asn1XmlEmbeddedPDV.data_value_descriptor = null;
            asn1XmlEmbeddedPDV.data_value = null;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            int i = this.mLevel;
            if (i == 0) {
                if (!Asn1XmlEmbeddedPDV.this.matchTypeName(str2)) {
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
                    Asn1XmlEmbeddedPDV.this.identification = new Asn1XmlEmbeddedPDV_identification();
                    Asn1XerSaxHandler saxHandler = Asn1XmlEmbeddedPDV.this.identification.getSaxHandler();
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

    public Asn1XmlEmbeddedPDV(Asn1XmlEmbeddedPDV_identification asn1XmlEmbeddedPDV_identification, String str, byte[] bArr) {
        this.identification = asn1XmlEmbeddedPDV_identification;
        this.data_value_descriptor = new Asn1ObjectDescriptor(str);
        this.data_value = new Asn1OctetString(bArr);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, TAG);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1XmlEmbeddedPDV_identification asn1XmlEmbeddedPDV_identification = new Asn1XmlEmbeddedPDV_identification();
        this.identification = asn1XmlEmbeddedPDV_identification;
        asn1XmlEmbeddedPDV_identification.decode(asn1BerDecodeBuffer, false, intHolder.value);
        if (intHolder.value == -9999) {
            matchTag(asn1BerDecodeBuffer, Asn1Tag.EOC);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 1, intHolder, true)) {
            Asn1ObjectDescriptor asn1ObjectDescriptor = new Asn1ObjectDescriptor();
            this.data_value_descriptor = asn1ObjectDescriptor;
            asn1ObjectDescriptor.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 2, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1OctetString asn1OctetString = new Asn1OctetString();
        this.data_value = asn1OctetString;
        asn1OctetString.decode(asn1BerDecodeBuffer, false, intHolder.value);
        if (!asn1BerDecodeContext.expired()) {
            Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
            if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 0, 1) || peekTag.equals((short) 128, (short) 0, 2)) {
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
        int encode = this.data_value.encode(asn1BerEncodeBuffer, false);
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 2, encode) + encode;
        Asn1ObjectDescriptor asn1ObjectDescriptor = this.data_value_descriptor;
        if (asn1ObjectDescriptor != null) {
            int encode2 = asn1ObjectDescriptor.encode(asn1BerEncodeBuffer, false);
            encodeTagAndLength = encodeTagAndLength + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 1, encode2);
        }
        int encode3 = this.identification.encode(asn1BerEncodeBuffer, false);
        int encodeTagAndLength2 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode3) + encodeTagAndLength + encode3;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, encodeTagAndLength2) + encodeTagAndLength2 : encodeTagAndLength2;
    }

    public Asn1XerSaxHandler getSaxHandler() {
        if (this.mSaxHandler == null) {
            this.mSaxHandler = new SaxHandler();
        }
        this.mSaxHandler.init(0);
        return this.mSaxHandler;
    }

    public void init() {
        this.identification = null;
        this.data_value_descriptor = null;
        this.data_value = null;
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
        Asn1XmlEmbeddedPDV_identification asn1XmlEmbeddedPDV_identification = this.identification;
        if (asn1XmlEmbeddedPDV_identification != null) {
            asn1XmlEmbeddedPDV_identification.print(printStream, "identification", i + 1);
        }
        Asn1ObjectDescriptor asn1ObjectDescriptor = this.data_value_descriptor;
        if (asn1ObjectDescriptor != null) {
            asn1ObjectDescriptor.print(printStream, "data_value_descriptor", i + 1);
        }
        Asn1OctetString asn1OctetString = this.data_value;
        if (asn1OctetString != null) {
            asn1OctetString.print(printStream, "data_value", i + 1);
        }
        indent(printStream, i);
    }

    public Asn1XmlEmbeddedPDV(Asn1XmlEmbeddedPDV_identification asn1XmlEmbeddedPDV_identification, Asn1ObjectDescriptor asn1ObjectDescriptor, Asn1OctetString asn1OctetString) {
        this.identification = asn1XmlEmbeddedPDV_identification;
        this.data_value_descriptor = asn1ObjectDescriptor;
        this.data_value = asn1OctetString;
    }

    public Asn1XmlEmbeddedPDV(Asn1XmlEmbeddedPDV_identification asn1XmlEmbeddedPDV_identification, Asn1OctetString asn1OctetString) {
        this.identification = asn1XmlEmbeddedPDV_identification;
        this.data_value = asn1OctetString;
    }

    public Asn1XmlEmbeddedPDV() {
    }

    public Asn1XmlEmbeddedPDV(Asn1XmlEmbeddedPDV_identification asn1XmlEmbeddedPDV_identification, byte[] bArr) {
        this.identification = asn1XmlEmbeddedPDV_identification;
        this.data_value = new Asn1OctetString(bArr);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z) throws Asn1Exception, IOException {
        if (z) {
            asn1BerOutputStream.encodeTagAndIndefLen(TAG);
        }
        asn1BerOutputStream.encodeTagAndIndefLen((short) 128, (short) 32, 0);
        this.identification.encode(asn1BerOutputStream, false);
        asn1BerOutputStream.encodeEOC();
        if (this.data_value_descriptor != null) {
            asn1BerOutputStream.encodeTag((short) 128, (short) 0, 1);
            this.data_value_descriptor.encode(asn1BerOutputStream, false);
        }
        asn1BerOutputStream.encodeTag((short) 128, (short) 0, 2);
        this.data_value.encode(asn1BerOutputStream, false);
        if (z) {
            asn1BerOutputStream.encodeEOC();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException {
        asn1PerEncodeBuffer.encodeBit(this.data_value_descriptor != null, null);
        Asn1XmlEmbeddedPDV_identification asn1XmlEmbeddedPDV_identification = this.identification;
        if (asn1XmlEmbeddedPDV_identification != null) {
            asn1XmlEmbeddedPDV_identification.encode(asn1PerEncodeBuffer);
            Asn1ObjectDescriptor asn1ObjectDescriptor = this.data_value_descriptor;
            if (asn1ObjectDescriptor != null) {
                asn1ObjectDescriptor.encode(asn1PerEncodeBuffer);
            }
            Asn1OctetString asn1OctetString = this.data_value;
            if (asn1OctetString != null) {
                asn1OctetString.encode(asn1PerEncodeBuffer);
                return;
            } else {
                quz.k("data_value");
                return;
            }
        }
        quz.k("identification");
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XmlEncodeBuffer asn1XmlEncodeBuffer) throws Asn1Exception, IOException {
        if (isOpenType()) {
            encode(asn1XmlEncodeBuffer, "embeddedPDV", "xmlns=\"http://www.obj-sys.com/Asn1EmbeddedPDV\" xsi:schemaLocation=\"http://www.obj-sys.com/Asn1EmbeddedPDV Asn1EmbeddedPDV.xsd\"");
            return;
        }
        asn1XmlEncodeBuffer.encodeStartDocument();
        encode(asn1XmlEncodeBuffer, "embeddedPDV", "xmlns=\"http://www.obj-sys.com/Asn1EmbeddedPDV\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.obj-sys.com/Asn1EmbeddedPDV Asn1EmbeddedPDV.xsd\"");
        asn1XmlEncodeBuffer.encodeEndDocument();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str, String str2) throws Asn1Exception, IOException {
        if (str == null) {
            str = "embeddedPDV";
        }
        asn1XerEncoder.encodeStartElement(str, str2);
        asn1XerEncoder.incrLevel();
        this.identification.encode(asn1XerEncoder, "identification", null);
        Asn1ObjectDescriptor asn1ObjectDescriptor = this.data_value_descriptor;
        if (asn1ObjectDescriptor != null) {
            asn1ObjectDescriptor.encode(asn1XerEncoder, "data_value_descriptor", (String) null);
        }
        this.data_value.encode(asn1XerEncoder, "data_value", (String) null);
        asn1XerEncoder.decrLevel();
        asn1XerEncoder.encodeEndElement(str);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        init();
        boolean decodeBit = asn1PerDecodeBuffer.decodeBit("data_value_descriptorPresent");
        Asn1XmlEmbeddedPDV_identification asn1XmlEmbeddedPDV_identification = new Asn1XmlEmbeddedPDV_identification();
        this.identification = asn1XmlEmbeddedPDV_identification;
        asn1XmlEmbeddedPDV_identification.decode(asn1PerDecodeBuffer);
        if (decodeBit) {
            Asn1ObjectDescriptor asn1ObjectDescriptor = new Asn1ObjectDescriptor();
            this.data_value_descriptor = asn1ObjectDescriptor;
            asn1ObjectDescriptor.decode(asn1PerDecodeBuffer);
        } else {
            this.data_value_descriptor = null;
        }
        Asn1OctetString asn1OctetString = new Asn1OctetString();
        this.data_value = asn1OctetString;
        asn1OctetString.decode(asn1PerDecodeBuffer);
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
