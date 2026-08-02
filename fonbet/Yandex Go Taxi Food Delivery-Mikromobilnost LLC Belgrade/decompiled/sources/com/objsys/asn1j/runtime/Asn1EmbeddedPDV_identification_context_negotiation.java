package com.objsys.asn1j.runtime;

import defpackage.quz;
import java.io.IOException;
import java.io.PrintStream;

/* loaded from: classes11.dex */
public class Asn1EmbeddedPDV_identification_context_negotiation extends Asn1Type {
    public Asn1Integer presentation_context_id;
    public Asn1ObjectIdentifier transfer_syntax;

    public Asn1EmbeddedPDV_identification_context_negotiation(long j, int[] iArr) {
        this.presentation_context_id = new Asn1Integer(j);
        this.transfer_syntax = new Asn1ObjectIdentifier(iArr);
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
        asn1BerDecodeBuffer.invokeStartElement("presentation_context_id", -1);
        Asn1Integer asn1Integer = new Asn1Integer();
        this.presentation_context_id = asn1Integer;
        asn1Integer.decode(asn1BerDecodeBuffer, false, intHolder.value);
        asn1BerDecodeBuffer.invokeCharacters(this.presentation_context_id.toString());
        asn1BerDecodeBuffer.invokeEndElement("presentation_context_id", -1);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 1, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        asn1BerDecodeBuffer.invokeStartElement("transfer_syntax", -1);
        Asn1ObjectIdentifier asn1ObjectIdentifier = new Asn1ObjectIdentifier();
        this.transfer_syntax = asn1ObjectIdentifier;
        asn1ObjectIdentifier.decode(asn1BerDecodeBuffer, false, intHolder.value);
        asn1BerDecodeBuffer.invokeCharacters(this.transfer_syntax.toString());
        asn1BerDecodeBuffer.invokeEndElement("transfer_syntax", -1);
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
        int encode = this.transfer_syntax.encode(asn1BerEncodeBuffer, false);
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 1, encode) + encode;
        int encode2 = this.presentation_context_id.encode(asn1BerEncodeBuffer, false);
        int encodeTagAndLength2 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 0, encode2) + encodeTagAndLength + encode2;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encodeTagAndLength2) + encodeTagAndLength2 : encodeTagAndLength2;
    }

    public void init() {
        this.presentation_context_id = null;
        this.transfer_syntax = null;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void print(PrintStream printStream, String str, int i) {
        indent(printStream, i);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(" {");
        printStream.getClass();
        Asn1Integer asn1Integer = this.presentation_context_id;
        if (asn1Integer != null) {
            asn1Integer.print(printStream, "presentation_context_id", i + 1);
        }
        Asn1ObjectIdentifier asn1ObjectIdentifier = this.transfer_syntax;
        if (asn1ObjectIdentifier != null) {
            asn1ObjectIdentifier.print(printStream, "transfer_syntax", i + 1);
        }
        indent(printStream, i);
    }

    public Asn1EmbeddedPDV_identification_context_negotiation(Asn1Integer asn1Integer, Asn1ObjectIdentifier asn1ObjectIdentifier) {
        this.presentation_context_id = asn1Integer;
        this.transfer_syntax = asn1ObjectIdentifier;
    }

    public Asn1EmbeddedPDV_identification_context_negotiation() {
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z) throws Asn1Exception, IOException {
        if (z) {
            asn1BerOutputStream.encodeTagAndIndefLen(Asn1Tag.SEQUENCE);
        }
        asn1BerOutputStream.encodeTag((short) 128, (short) 0, 0);
        this.presentation_context_id.encode(asn1BerOutputStream, false);
        asn1BerOutputStream.encodeTag((short) 128, (short) 0, 1);
        this.transfer_syntax.encode(asn1BerOutputStream, false);
        if (z) {
            asn1BerOutputStream.encodeEOC();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException {
        Asn1Integer asn1Integer = this.presentation_context_id;
        if (asn1Integer != null) {
            asn1Integer.encode(asn1PerEncodeBuffer);
            Asn1ObjectIdentifier asn1ObjectIdentifier = this.transfer_syntax;
            if (asn1ObjectIdentifier != null) {
                asn1ObjectIdentifier.encode(asn1PerEncodeBuffer);
                return;
            } else {
                quz.k("transfer_syntax");
                return;
            }
        }
        quz.k("presentation_context_id");
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        init();
        asn1PerDecodeBuffer.invokeStartElement("presentation_context_id", -1);
        Asn1Integer asn1Integer = new Asn1Integer();
        this.presentation_context_id = asn1Integer;
        asn1Integer.decode(asn1PerDecodeBuffer);
        asn1PerDecodeBuffer.invokeCharacters(this.presentation_context_id.toString());
        asn1PerDecodeBuffer.invokeEndElement("presentation_context_id", -1);
        asn1PerDecodeBuffer.invokeStartElement("transfer_syntax", -1);
        Asn1ObjectIdentifier asn1ObjectIdentifier = new Asn1ObjectIdentifier();
        this.transfer_syntax = asn1ObjectIdentifier;
        asn1ObjectIdentifier.decode(asn1PerDecodeBuffer);
        asn1PerDecodeBuffer.invokeCharacters(this.transfer_syntax.toString());
        asn1PerDecodeBuffer.invokeEndElement("transfer_syntax", -1);
    }
}
