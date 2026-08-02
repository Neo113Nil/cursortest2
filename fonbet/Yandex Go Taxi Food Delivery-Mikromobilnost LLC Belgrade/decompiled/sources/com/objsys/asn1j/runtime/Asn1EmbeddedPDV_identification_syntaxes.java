package com.objsys.asn1j.runtime;

import defpackage.quz;
import java.io.IOException;
import java.io.PrintStream;

/* loaded from: classes11.dex */
public class Asn1EmbeddedPDV_identification_syntaxes extends Asn1Type {
    public Asn1ObjectIdentifier abstract_;
    public Asn1ObjectIdentifier transfer;

    public Asn1EmbeddedPDV_identification_syntaxes(int[] iArr, int[] iArr2) {
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
        asn1BerDecodeBuffer.invokeStartElement("abstract_", -1);
        Asn1ObjectIdentifier asn1ObjectIdentifier = new Asn1ObjectIdentifier();
        this.abstract_ = asn1ObjectIdentifier;
        asn1ObjectIdentifier.decode(asn1BerDecodeBuffer, false, intHolder.value);
        asn1BerDecodeBuffer.invokeCharacters(this.abstract_.toString());
        asn1BerDecodeBuffer.invokeEndElement("abstract_", -1);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 1, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        asn1BerDecodeBuffer.invokeStartElement("transfer", -1);
        Asn1ObjectIdentifier asn1ObjectIdentifier2 = new Asn1ObjectIdentifier();
        this.transfer = asn1ObjectIdentifier2;
        asn1ObjectIdentifier2.decode(asn1BerDecodeBuffer, false, intHolder.value);
        asn1BerDecodeBuffer.invokeCharacters(this.transfer.toString());
        asn1BerDecodeBuffer.invokeEndElement("transfer", -1);
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

    public void init() {
        this.abstract_ = null;
        this.transfer = null;
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

    public Asn1EmbeddedPDV_identification_syntaxes(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1ObjectIdentifier asn1ObjectIdentifier2) {
        this.abstract_ = asn1ObjectIdentifier;
        this.transfer = asn1ObjectIdentifier2;
    }

    public Asn1EmbeddedPDV_identification_syntaxes() {
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
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        init();
        asn1PerDecodeBuffer.invokeStartElement("abstract_", -1);
        Asn1ObjectIdentifier asn1ObjectIdentifier = new Asn1ObjectIdentifier();
        this.abstract_ = asn1ObjectIdentifier;
        asn1ObjectIdentifier.decode(asn1PerDecodeBuffer);
        asn1PerDecodeBuffer.invokeCharacters(this.abstract_.toString());
        asn1PerDecodeBuffer.invokeEndElement("abstract_", -1);
        asn1PerDecodeBuffer.invokeStartElement("transfer", -1);
        Asn1ObjectIdentifier asn1ObjectIdentifier2 = new Asn1ObjectIdentifier();
        this.transfer = asn1ObjectIdentifier2;
        asn1ObjectIdentifier2.decode(asn1PerDecodeBuffer);
        asn1PerDecodeBuffer.invokeCharacters(this.transfer.toString());
        asn1PerDecodeBuffer.invokeEndElement("transfer", -1);
    }
}
