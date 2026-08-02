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
public class Asn1XerExternal extends Asn1Type {
    public static final Asn1Tag TAG = new Asn1Tag(0, 32, 8);
    public Asn1ObjectDescriptor data_value_descriptor;
    public Asn1ObjectIdentifier direct_reference;
    public Asn1XerExternal_encoding encoding;
    public Asn1Integer indirect_reference;
    private transient Asn1XerSaxHandler mSaxHandler = null;

    public class SaxHandler extends Asn1XerSaxHandler {
        private static final byte _DATA_VALUE_DESCRIPTOR = 3;
        private static final byte _DIRECT_REFERENCE = 1;
        private static final byte _ENCODING = 4;
        private static final byte _INDIRECT_REFERENCE = 2;
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
                if (this.mReqElemCnt != 1) {
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
                    if (i2 == 1) {
                        Asn1XerExternal.this.direct_reference = new Asn1ObjectIdentifier();
                        Asn1XerExternal.this.direct_reference.decodeXER(this.mCurrElemValue.toString(), null);
                    } else if (i2 == 2) {
                        Asn1XerExternal.this.indirect_reference = new Asn1Integer();
                        Asn1XerExternal.this.indirect_reference.decodeXER(this.mCurrElemValue.toString(), null);
                    } else if (i2 == 3) {
                        Asn1XerExternal.this.data_value_descriptor = new Asn1ObjectDescriptor();
                        Asn1XerExternal.this.data_value_descriptor.decodeXER(this.mCurrElemValue.toString(), null);
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
            Asn1XerElemInfo[] asn1XerElemInfoArr = {new Asn1XerElemInfo("direct_reference", true), new Asn1XerElemInfo("indirect_reference", true), new Asn1XerElemInfo("data_value_descriptor", true), new Asn1XerElemInfo("encoding", false)};
            for (int i = this.mCurrElemID; i < 4; i++) {
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
            Asn1XerExternal asn1XerExternal = Asn1XerExternal.this;
            asn1XerExternal.direct_reference = null;
            asn1XerExternal.indirect_reference = null;
            asn1XerExternal.data_value_descriptor = null;
            asn1XerExternal.encoding = null;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            int i = this.mLevel;
            if (i == 0) {
                if (!Asn1XerExternal.this.matchTypeName(str2)) {
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
                if (this.mCurrElemID == 4) {
                    Asn1XerExternal.this.encoding = new Asn1XerExternal_encoding();
                    Asn1XerSaxHandler saxHandler = Asn1XerExternal.this.encoding.getSaxHandler();
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

    public Asn1XerExternal(int[] iArr, long j, String str, Asn1XerExternal_encoding asn1XerExternal_encoding) {
        this.direct_reference = new Asn1ObjectIdentifier(iArr);
        this.indirect_reference = new Asn1Integer(j);
        this.data_value_descriptor = new Asn1ObjectDescriptor(str);
        this.encoding = asn1XerExternal_encoding;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, TAG);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 6, intHolder, false)) {
            Asn1ObjectIdentifier asn1ObjectIdentifier = new Asn1ObjectIdentifier();
            this.direct_reference = asn1ObjectIdentifier;
            asn1ObjectIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            Asn1Integer asn1Integer = new Asn1Integer();
            this.indirect_reference = asn1Integer;
            asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 7, intHolder, false)) {
            Asn1ObjectDescriptor asn1ObjectDescriptor = new Asn1ObjectDescriptor();
            this.data_value_descriptor = asn1ObjectDescriptor;
            asn1ObjectDescriptor.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (!peekTag.equals((short) 128, (short) 32, 0) && !peekTag.equals((short) 128, (short) 0, 1) && !peekTag.equals((short) 128, (short) 0, 2)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1XerExternal_encoding asn1XerExternal_encoding = new Asn1XerExternal_encoding();
        this.encoding = asn1XerExternal_encoding;
        asn1XerExternal_encoding.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.expired()) {
            Asn1Tag peekTag2 = asn1BerDecodeBuffer.peekTag();
            if (peekTag2.equals((short) 0, (short) 0, 6) || peekTag2.equals((short) 0, (short) 0, 2) || peekTag2.equals((short) 0, (short) 0, 7)) {
                quz.g();
                return;
            }
        }
        if (z && i == -9999) {
            matchTag(asn1BerDecodeBuffer, Asn1Tag.EOC);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException {
        asn1PerEncodeBuffer.encodeBit(this.direct_reference != null, null);
        asn1PerEncodeBuffer.encodeBit(this.indirect_reference != null, null);
        asn1PerEncodeBuffer.encodeBit(this.data_value_descriptor != null, null);
        Asn1ObjectIdentifier asn1ObjectIdentifier = this.direct_reference;
        if (asn1ObjectIdentifier != null) {
            asn1ObjectIdentifier.encode(asn1PerEncodeBuffer);
        }
        Asn1Integer asn1Integer = this.indirect_reference;
        if (asn1Integer != null) {
            asn1Integer.encode(asn1PerEncodeBuffer);
        }
        Asn1ObjectDescriptor asn1ObjectDescriptor = this.data_value_descriptor;
        if (asn1ObjectDescriptor != null) {
            asn1ObjectDescriptor.encode(asn1PerEncodeBuffer);
        }
        Asn1XerExternal_encoding asn1XerExternal_encoding = this.encoding;
        if (asn1XerExternal_encoding != null) {
            asn1XerExternal_encoding.encode(asn1PerEncodeBuffer);
        } else {
            quz.k("encoding");
        }
    }

    public Asn1XerSaxHandler getSaxHandler() {
        if (this.mSaxHandler == null) {
            this.mSaxHandler = new SaxHandler();
        }
        this.mSaxHandler.init(0);
        return this.mSaxHandler;
    }

    public void init() {
        this.direct_reference = null;
        this.indirect_reference = null;
        this.data_value_descriptor = null;
        this.encoding = null;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type
    public boolean matchTypeName(String str) {
        return str.equals("External");
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void print(PrintStream printStream, String str, int i) {
        indent(printStream, i);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(" {");
        printStream.getClass();
        Asn1ObjectIdentifier asn1ObjectIdentifier = this.direct_reference;
        if (asn1ObjectIdentifier != null) {
            asn1ObjectIdentifier.print(printStream, "direct_reference", i + 1);
        }
        Asn1Integer asn1Integer = this.indirect_reference;
        if (asn1Integer != null) {
            asn1Integer.print(printStream, "indirect_reference", i + 1);
        }
        Asn1ObjectDescriptor asn1ObjectDescriptor = this.data_value_descriptor;
        if (asn1ObjectDescriptor != null) {
            asn1ObjectDescriptor.print(printStream, "data_value_descriptor", i + 1);
        }
        Asn1XerExternal_encoding asn1XerExternal_encoding = this.encoding;
        if (asn1XerExternal_encoding != null) {
            asn1XerExternal_encoding.print(printStream, "encoding", i + 1);
        }
        indent(printStream, i);
    }

    public Asn1XerExternal(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1Integer asn1Integer, Asn1ObjectDescriptor asn1ObjectDescriptor, Asn1XerExternal_encoding asn1XerExternal_encoding) {
        this.direct_reference = asn1ObjectIdentifier;
        this.indirect_reference = asn1Integer;
        this.data_value_descriptor = asn1ObjectDescriptor;
        this.encoding = asn1XerExternal_encoding;
    }

    public Asn1XerExternal(Asn1XerExternal_encoding asn1XerExternal_encoding) {
        this.encoding = asn1XerExternal_encoding;
    }

    public Asn1XerExternal() {
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z) throws Asn1Exception, IOException {
        if (z) {
            asn1BerOutputStream.encodeTagAndIndefLen(TAG);
        }
        Asn1ObjectIdentifier asn1ObjectIdentifier = this.direct_reference;
        if (asn1ObjectIdentifier != null) {
            asn1ObjectIdentifier.encode(asn1BerOutputStream, true);
        }
        Asn1Integer asn1Integer = this.indirect_reference;
        if (asn1Integer != null) {
            asn1Integer.encode(asn1BerOutputStream, true);
        }
        Asn1ObjectDescriptor asn1ObjectDescriptor = this.data_value_descriptor;
        if (asn1ObjectDescriptor != null) {
            asn1ObjectDescriptor.encode(asn1BerOutputStream, true);
        }
        this.encoding.encode(asn1BerOutputStream, true);
        if (z) {
            asn1BerOutputStream.encodeEOC();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.encoding.encode(asn1BerEncodeBuffer, true);
        Asn1ObjectDescriptor asn1ObjectDescriptor = this.data_value_descriptor;
        if (asn1ObjectDescriptor != null) {
            encode += asn1ObjectDescriptor.encode(asn1BerEncodeBuffer, true);
        }
        Asn1Integer asn1Integer = this.indirect_reference;
        if (asn1Integer != null) {
            encode += asn1Integer.encode(asn1BerEncodeBuffer, true);
        }
        Asn1ObjectIdentifier asn1ObjectIdentifier = this.direct_reference;
        if (asn1ObjectIdentifier != null) {
            encode += asn1ObjectIdentifier.encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, encode) + encode : encode;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str) throws Asn1Exception, IOException {
        if (str == null) {
            str = "External";
        }
        asn1XerEncoder.encodeStartElement(str);
        asn1XerEncoder.incrLevel();
        Asn1ObjectIdentifier asn1ObjectIdentifier = this.direct_reference;
        if (asn1ObjectIdentifier != null) {
            asn1ObjectIdentifier.encode(asn1XerEncoder, "direct_reference");
        }
        Asn1Integer asn1Integer = this.indirect_reference;
        if (asn1Integer != null) {
            asn1Integer.encode(asn1XerEncoder, "indirect_reference");
        }
        Asn1ObjectDescriptor asn1ObjectDescriptor = this.data_value_descriptor;
        if (asn1ObjectDescriptor != null) {
            asn1ObjectDescriptor.encode(asn1XerEncoder, "data_value_descriptor");
        }
        this.encoding.encode(asn1XerEncoder, "encoding");
        asn1XerEncoder.decrLevel();
        asn1XerEncoder.encodeEndElement(str);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        init();
        boolean decodeBit = asn1PerDecodeBuffer.decodeBit("direct_referencePresent");
        boolean decodeBit2 = asn1PerDecodeBuffer.decodeBit("indirect_referencePresent");
        boolean decodeBit3 = asn1PerDecodeBuffer.decodeBit("data_value_descriptorPresent");
        if (decodeBit) {
            Asn1ObjectIdentifier asn1ObjectIdentifier = new Asn1ObjectIdentifier();
            this.direct_reference = asn1ObjectIdentifier;
            asn1ObjectIdentifier.decode(asn1PerDecodeBuffer);
        } else {
            this.direct_reference = null;
        }
        if (decodeBit2) {
            Asn1Integer asn1Integer = new Asn1Integer();
            this.indirect_reference = asn1Integer;
            asn1Integer.decode(asn1PerDecodeBuffer);
        } else {
            this.indirect_reference = null;
        }
        if (decodeBit3) {
            Asn1ObjectDescriptor asn1ObjectDescriptor = new Asn1ObjectDescriptor();
            this.data_value_descriptor = asn1ObjectDescriptor;
            asn1ObjectDescriptor.decode(asn1PerDecodeBuffer);
        } else {
            this.data_value_descriptor = null;
        }
        Asn1XerExternal_encoding asn1XerExternal_encoding = new Asn1XerExternal_encoding();
        this.encoding = asn1XerExternal_encoding;
        asn1XerExternal_encoding.decode(asn1PerDecodeBuffer);
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
