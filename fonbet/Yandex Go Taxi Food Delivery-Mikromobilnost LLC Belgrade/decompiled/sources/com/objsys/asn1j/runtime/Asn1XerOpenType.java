package com.objsys.asn1j.runtime;

import java.io.IOException;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes11.dex */
public class Asn1XerOpenType extends Asn1OpenType {
    private transient Asn1XerSaxHandler mSaxHandler;

    public class SaxHandler extends Asn1XerSaxHandler {
        Asn1XerEncodeBuffer mEncodeBuffer = new Asn1XerEncodeBuffer(true, 0);

        public SaxHandler() {
        }

        private boolean isEmptyElement(String str) {
            byte[] buffer = this.mEncodeBuffer.getBuffer();
            int msgLength = this.mEncodeBuffer.getMsgLength();
            int i = msgLength - 1;
            if (i > 0 && buffer[i] == 62) {
                int i2 = msgLength - 2;
                while (i2 >= 0 && buffer[i2] != 60) {
                    i2--;
                }
                int i3 = i2 + 1;
                if (str.equals(new String(buffer, i3, i - i3))) {
                    buffer[i] = Alerts.alert_illegal_parameter;
                    this.mEncodeBuffer.copy((byte) 62);
                    return true;
                }
            }
            return false;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) throws SAXException {
            try {
                this.mEncodeBuffer.encodeData(new String(cArr, i, i2));
            } catch (Asn1Exception unused) {
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
            try {
                if (isComplete()) {
                    return;
                }
                if (!isEmptyElement(str3)) {
                    this.mEncodeBuffer.encodeEndElement(str3);
                }
                this.mCurrState = 3;
                int i = this.mLevel - 1;
                this.mLevel = i;
                if (i < 0) {
                    throw new SAXException("XML state error");
                }
                if (i == 0) {
                    Asn1XerOpenType.this.value = this.mEncodeBuffer.getMsgCopy();
                }
            } catch (Asn1Exception e) {
                throw new SAXException(e.getMessage());
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            try {
                this.mEncodeBuffer.encodeStartElement(str3);
                this.mLevel++;
            } catch (Asn1Exception e) {
                throw new SAXException(e.getMessage());
            }
        }
    }

    public Asn1XerOpenType(Asn1EncodeBuffer asn1EncodeBuffer) {
        super(asn1EncodeBuffer);
        this.mSaxHandler = null;
        if (asn1EncodeBuffer instanceof Asn1XerEncodeBuffer) {
            this.mTextEncoding = true;
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1OpenType, com.objsys.asn1j.runtime.Asn1OctetString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        this.mTextEncoding = false;
        super.decode(asn1BerDecodeBuffer, z, i);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder) throws IOException, Asn1Exception {
        byte[] bArr;
        this.mTextEncoding = true;
        if (asn1XerEncoder.getState() == 3) {
            asn1XerEncoder.indent();
        }
        int i = 0;
        while (true) {
            bArr = this.value;
            if (bArr[i] >= 48 || i >= bArr.length) {
                break;
            } else {
                i++;
            }
        }
        if (i < bArr.length) {
            asn1XerEncoder.copy(bArr, i, bArr.length - i);
        }
    }

    public Asn1XerSaxHandler getSaxHandler() {
        this.mTextEncoding = true;
        if (this.mSaxHandler == null) {
            this.mSaxHandler = new SaxHandler();
        }
        return this.mSaxHandler;
    }

    @Override // com.objsys.asn1j.runtime.Asn1OctetString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        this.mTextEncoding = false;
        super.decode(asn1PerDecodeBuffer);
    }

    public Asn1XerOpenType(byte[] bArr) {
        super(bArr);
        this.mSaxHandler = null;
    }

    public Asn1XerOpenType(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
        this.mSaxHandler = null;
    }

    public Asn1XerOpenType() {
        this.mSaxHandler = null;
    }

    @Override // com.objsys.asn1j.runtime.Asn1OpenType, com.objsys.asn1j.runtime.Asn1OctetString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException {
        this.mTextEncoding = false;
        super.encode(asn1PerEncodeBuffer);
    }

    @Override // com.objsys.asn1j.runtime.Asn1OctetString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str, String str2) throws IOException, Asn1Exception {
        this.mTextEncoding = true;
        asn1XerEncoder.encodeStartElement(str, str2);
        asn1XerEncoder.copy(this.value);
        asn1XerEncoder.encodeEndElement(str);
        asn1XerEncoder.setState(3);
    }

    @Override // com.objsys.asn1j.runtime.Asn1OctetString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str) throws IOException, Asn1Exception {
        this.mTextEncoding = true;
        asn1XerEncoder.encodeStartElement(str);
        encode(asn1XerEncoder);
        asn1XerEncoder.encodeEndElement(str);
    }

    @Override // com.objsys.asn1j.runtime.Asn1OpenType, com.objsys.asn1j.runtime.Asn1OctetString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        this.mTextEncoding = false;
        return super.encode(asn1BerEncodeBuffer, z);
    }
}
