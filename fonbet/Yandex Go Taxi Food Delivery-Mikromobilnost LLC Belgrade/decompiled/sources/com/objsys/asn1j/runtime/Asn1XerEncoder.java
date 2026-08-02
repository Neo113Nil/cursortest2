package com.objsys.asn1j.runtime;

import java.io.IOException;

/* loaded from: classes11.dex */
public interface Asn1XerEncoder {
    public static final int XERDATA = 2;
    public static final int XEREND = 3;
    public static final int XERINDENT = 3;
    public static final int XERINIT = 0;
    public static final int XERSTART = 1;

    void copy(byte b) throws IOException;

    void copy(String str) throws IOException, Asn1Exception;

    void copy(byte[] bArr) throws IOException, Asn1Exception;

    void copy(byte[] bArr, int i, int i2) throws IOException, Asn1Exception;

    void decrLevel();

    void encodeBinStrValue(byte[] bArr, int i) throws IOException, Asn1Exception;

    void encodeByte(byte b) throws IOException;

    void encodeData(String str) throws IOException, Asn1Exception;

    void encodeEmptyElement(String str) throws IOException, Asn1Exception;

    void encodeEmptyElement(String str, String str2) throws IOException, Asn1Exception;

    void encodeEndDocument() throws IOException, Asn1Exception;

    void encodeEndElement(String str) throws IOException, Asn1Exception;

    void encodeHexStrValue(byte[] bArr) throws IOException, Asn1Exception;

    void encodeNamedValue(String str, String str2) throws IOException, Asn1Exception;

    void encodeNamedValue(String str, String str2, String str3) throws IOException, Asn1Exception;

    void encodeNamedValueElement(String str) throws IOException, Asn1Exception;

    void encodeObjectId(int[] iArr) throws IOException, Asn1Exception;

    void encodeRealValue(double d, String str) throws IOException, Asn1Exception;

    void encodeRealValue(double d, String str, String str2) throws IOException, Asn1Exception;

    void encodeStartDocument() throws IOException, Asn1Exception;

    void encodeStartElement(String str) throws IOException, Asn1Exception;

    void encodeStartElement(String str, String str2) throws IOException, Asn1Exception;

    int getState();

    void incrLevel();

    void indent() throws IOException, Asn1Exception;

    void setState(int i);
}
