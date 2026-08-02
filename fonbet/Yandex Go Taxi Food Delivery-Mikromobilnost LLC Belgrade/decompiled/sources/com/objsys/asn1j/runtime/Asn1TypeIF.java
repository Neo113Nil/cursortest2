package com.objsys.asn1j.runtime;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

/* loaded from: classes11.dex */
public interface Asn1TypeIF {
    void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException;

    void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException;

    void decode(Object obj, InputStream inputStream) throws Asn1Exception, IOException;

    void decode(Object obj, String str) throws Asn1Exception, IOException;

    int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception;

    void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z) throws Asn1Exception, IOException;

    void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException;

    void encode(Asn1PerOutputStream asn1PerOutputStream) throws Asn1Exception, IOException;

    void encode(Asn1XerEncoder asn1XerEncoder) throws Asn1Exception, IOException;

    void encode(Asn1XerEncoder asn1XerEncoder, String str) throws Asn1Exception, IOException;

    void encode(Asn1XerEncoder asn1XerEncoder, String str, String str2) throws Asn1Exception, IOException;

    void encode(Asn1XmlEncodeBuffer asn1XmlEncodeBuffer) throws Asn1Exception, IOException;

    boolean isOpenType();

    void print(PrintStream printStream, String str, int i);

    void setOpenType();
}
