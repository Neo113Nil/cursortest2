package com.objsys.asn1j.runtime;

import defpackage.quz;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public class Asn1XerOutputStream extends Asn1OutputStream implements Asn1XerEncoder {
    private static Asn1RunTime rt = Asn1RunTime.instance();
    boolean mCanonical;
    String mIndent;
    int mLevel;
    String mLineSep;
    int mState;

    public Asn1XerOutputStream(OutputStream outputStream, boolean z, int i) {
        super(i != 0 ? new BufferedOutputStream(outputStream, i) : outputStream);
        this.mLevel = 0;
        this.mState = 0;
        this.mLineSep = "\n";
        this.mCanonical = z;
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void copy(byte b) throws IOException {
        write(b);
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void decrLevel() {
        this.mLevel--;
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeBinStrValue(byte[] bArr, int i) throws IOException, Asn1Exception {
        int i2 = 128;
        for (int i3 = 0; i3 < i; i3++) {
            write((byte) ((bArr[i3 / 8] & i2) != 0 ? 49 : 48));
            i2 >>>= 1;
            if (i2 == 0) {
                i2 = 128;
            }
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeByte(byte b) throws IOException {
        byte b2 = (byte) ((b & 255) >>> 4);
        if (b2 < 0 || b2 > 9) {
            write((byte) (b2 + 55));
        } else {
            write((byte) (b2 + 48));
        }
        byte b3 = (byte) (b & PKIBody._CCP);
        if (b3 < 0 || b3 > 9) {
            write((byte) (b3 + 55));
        } else {
            write((byte) (b3 + 48));
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeData(String str) throws IOException, Asn1Exception {
        write(str);
        this.mState = 2;
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeEmptyElement(String str, String str2) throws Asn1Exception, IOException {
        String str3;
        if (str == null) {
            return;
        }
        if (str2 == null) {
            StringBuffer stringBuffer = new StringBuffer("<");
            stringBuffer.append(str);
            stringBuffer.append("/>");
            str3 = new String(stringBuffer.toString());
        } else {
            StringBuffer stringBuffer2 = new StringBuffer("<");
            stringBuffer2.append(str);
            stringBuffer2.append(" ");
            stringBuffer2.append(str2);
            stringBuffer2.append("/>");
            str3 = new String(stringBuffer2.toString());
        }
        copy(str3);
        this.mState = 3;
        rt.lcheck(4);
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeEndDocument() throws IOException, Asn1Exception {
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeEndElement(String str) throws IOException, Asn1Exception {
        if (this.mState == 3) {
            indent();
        }
        if (str != null) {
            StringBuffer stringBuffer = new StringBuffer("</");
            stringBuffer.append(str);
            stringBuffer.append(">");
            write(new String(stringBuffer.toString()));
        }
        this.mState = 3;
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeHexStrValue(byte[] bArr) throws IOException, Asn1Exception {
        for (byte b : bArr) {
            encodeByte(b);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeNamedValue(String str, String str2) throws IOException, Asn1Exception {
        if (str2.length() > 0) {
            encodeStartElement(str2);
        }
        encodeNamedValueElement(str);
        if (str2.length() > 0) {
            encodeEndElement(str2);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeNamedValueElement(String str) throws IOException, Asn1Exception {
        StringBuffer stringBuffer = new StringBuffer("<");
        stringBuffer.append(str);
        stringBuffer.append("/>");
        write(new String(stringBuffer.toString()));
        this.mState = 2;
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeObjectId(int[] iArr) throws IOException, Asn1Exception {
        if (iArr.length == 0) {
            quz.r();
            return;
        }
        for (int i = 0; i < iArr.length - 1; i++) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(String.valueOf(iArr[i]));
            stringBuffer.append(Extension.DOT_CHAR);
            write(stringBuffer.toString());
        }
        write(String.valueOf(iArr[iArr.length - 1]));
        rt.lcheck(4);
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeRealValue(double d, String str) throws IOException, Asn1Exception {
        if (str == null) {
            str = "REAL";
        }
        Asn1XerUtil.encodeReal(this, d, str);
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeStartDocument() throws IOException, Asn1Exception {
        write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeStartElement(String str, String str2) throws Asn1Exception, IOException {
        String str3;
        if (str == null || str.length() <= 0) {
            return;
        }
        indent();
        if (str2 == null || str2.length() <= 0) {
            StringBuffer stringBuffer = new StringBuffer("<");
            stringBuffer.append(str);
            stringBuffer.append(">");
            str3 = new String(stringBuffer.toString());
        } else {
            StringBuffer stringBuffer2 = new StringBuffer("<");
            stringBuffer2.append(str);
            stringBuffer2.append(" ");
            stringBuffer2.append(str2);
            stringBuffer2.append(">");
            str3 = new String(stringBuffer2.toString());
        }
        copy(str3);
        this.mState = 1;
        rt.lcheck(4);
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public int getState() {
        return this.mState;
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void incrLevel() {
        this.mLevel++;
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void indent() throws IOException, Asn1Exception {
        if (this.mCanonical) {
            return;
        }
        write(this.mLineSep);
        for (int i = 0; i < this.mLevel * 3; i++) {
            write(32);
        }
    }

    public void setCanonical(boolean z) {
        this.mCanonical = z;
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void setState(int i) {
        this.mState = i;
    }

    public void write(String str) throws IOException, Asn1Exception {
        try {
            write(str.getBytes("UTF8"));
        } catch (UnsupportedEncodingException unused) {
            System.out.getClass();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void copy(byte[] bArr) throws IOException, Asn1Exception {
        write(bArr);
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void copy(byte[] bArr, int i, int i2) throws IOException, Asn1Exception {
        write(bArr, i, i2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void copy(String str) throws IOException, Asn1Exception {
        write(str);
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeRealValue(double d, String str, String str2) throws IOException, Asn1Exception {
        Asn1XmlUtil.encodeReal(this, d, str, str2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeNamedValue(String str, String str2, String str3) throws Asn1Exception, IOException {
        encodeStartElement(str2, str3);
        encodeNamedValueElement(str);
        encodeEndElement(str2);
    }

    public Asn1XerOutputStream(OutputStream outputStream) {
        super(new BufferedOutputStream(outputStream));
        this.mLevel = 0;
        this.mState = 0;
        this.mLineSep = "\n";
        this.mCanonical = false;
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeEmptyElement(String str) throws IOException, Asn1Exception {
        StringBuffer stringBuffer = new StringBuffer("<");
        stringBuffer.append(str);
        stringBuffer.append("/>");
        write(new String(stringBuffer.toString()));
        this.mState = 3;
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeStartElement(String str) throws IOException, Asn1Exception {
        indent();
        if (str != null) {
            StringBuffer stringBuffer = new StringBuffer("<");
            stringBuffer.append(str);
            stringBuffer.append(">");
            write(new String(stringBuffer.toString()));
        }
        this.mState = 1;
        rt.lcheck(4);
    }
}
