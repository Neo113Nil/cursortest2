package com.objsys.asn1j.runtime;

import defpackage.quz;
import java.io.IOException;
import java.io.PrintStream;

/* loaded from: classes11.dex */
public class Asn1External extends Asn1Type {
    public static final Asn1Tag TAG = new Asn1Tag(0, 32, 8);
    public Asn1ObjectDescriptor data_value_descriptor;
    public Asn1ObjectIdentifier direct_reference;
    public Asn1External_encoding encoding;
    public Asn1Integer indirect_reference;

    public Asn1External(int[] iArr, long j, String str, Asn1External_encoding asn1External_encoding) {
        this.direct_reference = new Asn1ObjectIdentifier(iArr);
        this.indirect_reference = new Asn1Integer(j);
        this.data_value_descriptor = new Asn1ObjectDescriptor(str);
        this.encoding = asn1External_encoding;
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
            asn1BerDecodeBuffer.invokeStartElement("direct_reference", -1);
            Asn1ObjectIdentifier asn1ObjectIdentifier = new Asn1ObjectIdentifier();
            this.direct_reference = asn1ObjectIdentifier;
            asn1ObjectIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
            asn1BerDecodeBuffer.invokeCharacters(this.direct_reference.toString());
            asn1BerDecodeBuffer.invokeEndElement("direct_reference", -1);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            asn1BerDecodeBuffer.invokeStartElement("indirect_reference", -1);
            Asn1Integer asn1Integer = new Asn1Integer();
            this.indirect_reference = asn1Integer;
            asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
            asn1BerDecodeBuffer.invokeCharacters(this.indirect_reference.toString());
            asn1BerDecodeBuffer.invokeEndElement("indirect_reference", -1);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 7, intHolder, false)) {
            asn1BerDecodeBuffer.invokeStartElement("data_value_descriptor", -1);
            Asn1ObjectDescriptor asn1ObjectDescriptor = new Asn1ObjectDescriptor();
            this.data_value_descriptor = asn1ObjectDescriptor;
            asn1ObjectDescriptor.decode(asn1BerDecodeBuffer, true, intHolder.value);
            asn1BerDecodeBuffer.invokeCharacters(this.data_value_descriptor.toString());
            asn1BerDecodeBuffer.invokeEndElement("data_value_descriptor", -1);
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
        asn1BerDecodeBuffer.invokeStartElement("encoding", -1);
        Asn1External_encoding asn1External_encoding = new Asn1External_encoding();
        this.encoding = asn1External_encoding;
        asn1External_encoding.decode(asn1BerDecodeBuffer, true, intHolder.value);
        asn1BerDecodeBuffer.invokeEndElement("encoding", -1);
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
        Asn1External_encoding asn1External_encoding = this.encoding;
        if (asn1External_encoding != null) {
            asn1External_encoding.encode(asn1PerEncodeBuffer);
        } else {
            quz.k("encoding");
        }
    }

    public void init() {
        this.direct_reference = null;
        this.indirect_reference = null;
        this.data_value_descriptor = null;
        this.encoding = null;
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
        Asn1External_encoding asn1External_encoding = this.encoding;
        if (asn1External_encoding != null) {
            asn1External_encoding.print(printStream, "encoding", i + 1);
        }
        indent(printStream, i);
    }

    public Asn1External(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1Integer asn1Integer, Asn1ObjectDescriptor asn1ObjectDescriptor, Asn1External_encoding asn1External_encoding) {
        this.direct_reference = asn1ObjectIdentifier;
        this.indirect_reference = asn1Integer;
        this.data_value_descriptor = asn1ObjectDescriptor;
        this.encoding = asn1External_encoding;
    }

    public Asn1External(Asn1External_encoding asn1External_encoding) {
        this.encoding = asn1External_encoding;
    }

    public Asn1External() {
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
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        init();
        boolean decodeBit = asn1PerDecodeBuffer.decodeBit("direct_referencePresent");
        boolean decodeBit2 = asn1PerDecodeBuffer.decodeBit("indirect_referencePresent");
        boolean decodeBit3 = asn1PerDecodeBuffer.decodeBit("data_value_descriptorPresent");
        if (decodeBit) {
            asn1PerDecodeBuffer.invokeStartElement("direct_reference", -1);
            Asn1ObjectIdentifier asn1ObjectIdentifier = new Asn1ObjectIdentifier();
            this.direct_reference = asn1ObjectIdentifier;
            asn1ObjectIdentifier.decode(asn1PerDecodeBuffer);
            asn1PerDecodeBuffer.invokeCharacters(this.direct_reference.toString());
            asn1PerDecodeBuffer.invokeEndElement("direct_reference", -1);
        } else {
            this.direct_reference = null;
        }
        if (decodeBit2) {
            asn1PerDecodeBuffer.invokeStartElement("indirect_reference", -1);
            Asn1Integer asn1Integer = new Asn1Integer();
            this.indirect_reference = asn1Integer;
            asn1Integer.decode(asn1PerDecodeBuffer);
            asn1PerDecodeBuffer.invokeCharacters(this.indirect_reference.toString());
            asn1PerDecodeBuffer.invokeEndElement("indirect_reference", -1);
        } else {
            this.indirect_reference = null;
        }
        if (decodeBit3) {
            asn1PerDecodeBuffer.invokeStartElement("data_value_descriptor", -1);
            Asn1ObjectDescriptor asn1ObjectDescriptor = new Asn1ObjectDescriptor();
            this.data_value_descriptor = asn1ObjectDescriptor;
            asn1ObjectDescriptor.decode(asn1PerDecodeBuffer);
            asn1PerDecodeBuffer.invokeCharacters(this.data_value_descriptor.toString());
            asn1PerDecodeBuffer.invokeEndElement("data_value_descriptor", -1);
        } else {
            this.data_value_descriptor = null;
        }
        asn1PerDecodeBuffer.invokeStartElement("encoding", -1);
        Asn1External_encoding asn1External_encoding = new Asn1External_encoding();
        this.encoding = asn1External_encoding;
        asn1External_encoding.decode(asn1PerDecodeBuffer);
        asn1PerDecodeBuffer.invokeEndElement("encoding", -1);
    }
}
