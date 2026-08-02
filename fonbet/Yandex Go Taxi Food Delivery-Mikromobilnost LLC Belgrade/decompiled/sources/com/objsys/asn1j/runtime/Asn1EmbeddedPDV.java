package com.objsys.asn1j.runtime;

import defpackage.quz;
import java.io.IOException;
import java.io.PrintStream;

/* loaded from: classes11.dex */
public class Asn1EmbeddedPDV extends Asn1Type {
    public static final Asn1Tag TAG = new Asn1Tag(0, 32, 11);
    public Asn1OctetString data_value;
    public Asn1ObjectDescriptor data_value_descriptor;
    public Asn1EmbeddedPDV_identification identification;

    public Asn1EmbeddedPDV(Asn1EmbeddedPDV_identification asn1EmbeddedPDV_identification, String str, byte[] bArr) {
        this.identification = asn1EmbeddedPDV_identification;
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
        asn1BerDecodeBuffer.invokeStartElement("identification", -1);
        Asn1EmbeddedPDV_identification asn1EmbeddedPDV_identification = new Asn1EmbeddedPDV_identification();
        this.identification = asn1EmbeddedPDV_identification;
        asn1EmbeddedPDV_identification.decode(asn1BerDecodeBuffer, false, intHolder.value);
        asn1BerDecodeBuffer.invokeEndElement("identification", -1);
        if (intHolder.value == -9999) {
            matchTag(asn1BerDecodeBuffer, Asn1Tag.EOC);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 1, intHolder, true)) {
            asn1BerDecodeBuffer.invokeStartElement("data_value_descriptor", -1);
            Asn1ObjectDescriptor asn1ObjectDescriptor = new Asn1ObjectDescriptor();
            this.data_value_descriptor = asn1ObjectDescriptor;
            asn1ObjectDescriptor.decode(asn1BerDecodeBuffer, false, intHolder.value);
            asn1BerDecodeBuffer.invokeCharacters(this.data_value_descriptor.toString());
            asn1BerDecodeBuffer.invokeEndElement("data_value_descriptor", -1);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 2, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        asn1BerDecodeBuffer.invokeStartElement("data_value", -1);
        Asn1OctetString asn1OctetString = new Asn1OctetString();
        this.data_value = asn1OctetString;
        asn1OctetString.decode(asn1BerDecodeBuffer, false, intHolder.value);
        asn1BerDecodeBuffer.invokeCharacters(this.data_value.toString());
        asn1BerDecodeBuffer.invokeEndElement("data_value", -1);
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

    public void init() {
        this.identification = null;
        this.data_value_descriptor = null;
        this.data_value = null;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void print(PrintStream printStream, String str, int i) {
        indent(printStream, i);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(" {");
        printStream.getClass();
        Asn1EmbeddedPDV_identification asn1EmbeddedPDV_identification = this.identification;
        if (asn1EmbeddedPDV_identification != null) {
            asn1EmbeddedPDV_identification.print(printStream, "identification", i + 1);
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

    public Asn1EmbeddedPDV(Asn1EmbeddedPDV_identification asn1EmbeddedPDV_identification, Asn1ObjectDescriptor asn1ObjectDescriptor, Asn1OctetString asn1OctetString) {
        this.identification = asn1EmbeddedPDV_identification;
        this.data_value_descriptor = asn1ObjectDescriptor;
        this.data_value = asn1OctetString;
    }

    public Asn1EmbeddedPDV(Asn1EmbeddedPDV_identification asn1EmbeddedPDV_identification, Asn1OctetString asn1OctetString) {
        this.identification = asn1EmbeddedPDV_identification;
        this.data_value = asn1OctetString;
    }

    public Asn1EmbeddedPDV() {
    }

    public Asn1EmbeddedPDV(Asn1EmbeddedPDV_identification asn1EmbeddedPDV_identification, byte[] bArr) {
        this.identification = asn1EmbeddedPDV_identification;
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
        Asn1EmbeddedPDV_identification asn1EmbeddedPDV_identification = this.identification;
        if (asn1EmbeddedPDV_identification != null) {
            asn1EmbeddedPDV_identification.encode(asn1PerEncodeBuffer);
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
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        init();
        boolean decodeBit = asn1PerDecodeBuffer.decodeBit("data_value_descriptorPresent");
        asn1PerDecodeBuffer.invokeStartElement("identification", -1);
        Asn1EmbeddedPDV_identification asn1EmbeddedPDV_identification = new Asn1EmbeddedPDV_identification();
        this.identification = asn1EmbeddedPDV_identification;
        asn1EmbeddedPDV_identification.decode(asn1PerDecodeBuffer);
        asn1PerDecodeBuffer.invokeEndElement("identification", -1);
        if (decodeBit) {
            asn1PerDecodeBuffer.invokeStartElement("data_value_descriptor", -1);
            Asn1ObjectDescriptor asn1ObjectDescriptor = new Asn1ObjectDescriptor();
            this.data_value_descriptor = asn1ObjectDescriptor;
            asn1ObjectDescriptor.decode(asn1PerDecodeBuffer);
            asn1PerDecodeBuffer.invokeCharacters(this.data_value_descriptor.toString());
            asn1PerDecodeBuffer.invokeEndElement("data_value_descriptor", -1);
        } else {
            this.data_value_descriptor = null;
        }
        asn1PerDecodeBuffer.invokeStartElement("data_value", -1);
        Asn1OctetString asn1OctetString = new Asn1OctetString();
        this.data_value = asn1OctetString;
        asn1OctetString.decode(asn1PerDecodeBuffer);
        asn1PerDecodeBuffer.invokeCharacters(this.data_value.toString());
        asn1PerDecodeBuffer.invokeEndElement("data_value", -1);
    }
}
