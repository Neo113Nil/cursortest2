package com.objsys.asn1j.runtime;

import defpackage.quz;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;

/* loaded from: classes11.dex */
public class Asn1XerEncodeBuffer extends Asn1EncodeBuffer implements Asn1XerEncoder {
    private static Asn1RunTime rt = Asn1RunTime.instance();
    boolean mCanonical;
    String mIndent;
    int mLevel;
    String mLineSep;
    int mState;

    public Asn1XerEncodeBuffer() {
        this.mLevel = 0;
        this.mState = 0;
        this.mLineSep = "\n";
        this.mCanonical = false;
    }

    @Override // com.objsys.asn1j.runtime.Asn1EncodeBuffer
    public void binDump(PrintStream printStream, String str) {
        hexDump();
    }

    @Override // com.objsys.asn1j.runtime.Asn1EncodeBuffer
    public void checkSize(int i) {
        int i2 = this.mByteIndex;
        int i3 = i2 + i;
        byte[] bArr = this.mData;
        if (i3 > bArr.length) {
            int i4 = this.mSizeIncrement;
            byte[] bArr2 = new byte[bArr.length + ((((i - 1) / i4) + 1) * i4)];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            this.mData = bArr2;
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1EncodeBuffer
    public void copy(byte[] bArr) throws Asn1Exception {
        checkSize(bArr.length);
        System.arraycopy(bArr, 0, this.mData, this.mByteIndex, bArr.length);
        this.mByteIndex += bArr.length;
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void decrLevel() {
        this.mLevel--;
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeBinStrValue(byte[] bArr, int i) throws Asn1Exception {
        checkSize(i);
        int i2 = 128;
        for (int i3 = 0; i3 < i; i3++) {
            byte[] bArr2 = this.mData;
            int i4 = this.mByteIndex;
            this.mByteIndex = i4 + 1;
            bArr2[i4] = (byte) ((bArr[i3 / 8] & i2) != 0 ? 49 : 48);
            i2 >>>= 1;
            if (i2 == 0) {
                i2 = 128;
            }
        }
        rt.lcheck(4);
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeByte(byte b) {
        checkSize(2);
        byte b2 = (byte) ((b & 255) >>> 4);
        if (b2 < 0 || b2 > 9) {
            byte[] bArr = this.mData;
            int i = this.mByteIndex;
            this.mByteIndex = i + 1;
            bArr[i] = (byte) (b2 + 55);
        } else {
            byte[] bArr2 = this.mData;
            int i2 = this.mByteIndex;
            this.mByteIndex = i2 + 1;
            bArr2[i2] = (byte) (b2 + 48);
        }
        byte b3 = (byte) (b & PKIBody._CCP);
        if (b3 < 0 || b3 > 9) {
            byte[] bArr3 = this.mData;
            int i3 = this.mByteIndex;
            this.mByteIndex = i3 + 1;
            bArr3[i3] = (byte) (b3 + 55);
        } else {
            byte[] bArr4 = this.mData;
            int i4 = this.mByteIndex;
            this.mByteIndex = i4 + 1;
            bArr4[i4] = (byte) (b3 + 48);
        }
        rt.lcheck(4);
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeData(String str) throws Asn1Exception {
        copy(str);
        this.mState = 2;
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeEmptyElement(String str, String str2) throws Asn1Exception {
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
        rt.lcheck(4);
        this.mState = 3;
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeEndDocument() throws Asn1Exception {
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeEndElement(String str) throws Asn1Exception {
        if (this.mState == 3) {
            indent();
        }
        if (str != null) {
            StringBuffer stringBuffer = new StringBuffer("</");
            stringBuffer.append(str);
            stringBuffer.append(">");
            copy(new String(stringBuffer.toString()));
        }
        this.mState = 3;
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeHexStrValue(byte[] bArr) throws Asn1Exception {
        checkSize(bArr.length * 2);
        for (byte b : bArr) {
            encodeByte(b);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeNamedValue(String str, String str2) throws Asn1Exception {
        if (str2.length() > 0) {
            encodeStartElement(str2);
        }
        encodeNamedValueElement(str);
        if (str2.length() > 0) {
            encodeEndElement(str2);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeNamedValueElement(String str) throws Asn1Exception {
        StringBuffer stringBuffer = new StringBuffer("<");
        stringBuffer.append(str);
        stringBuffer.append("/>");
        copy(new String(stringBuffer.toString()));
        this.mState = 2;
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeObjectId(int[] iArr) throws Asn1Exception {
        if (iArr.length == 0) {
            quz.r();
            return;
        }
        checkSize((iArr.length * 2) - 1);
        for (int i = 0; i < iArr.length - 1; i++) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(String.valueOf(iArr[i]));
            stringBuffer.append(Extension.DOT_CHAR);
            copy(stringBuffer.toString());
        }
        rt.lcheck(4);
        copy(String.valueOf(iArr[iArr.length - 1]));
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeRealValue(double d, String str) throws IOException, Asn1Exception {
        if (str == null) {
            str = "REAL";
        }
        rt.lcheck(4);
        Asn1XerUtil.encodeReal(this, d, str);
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeStartDocument() throws Asn1Exception {
        copy("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeStartElement(String str, String str2) throws Asn1Exception, IOException {
        String str3;
        if (str == null || str.length() <= 0) {
            return;
        }
        rt.lcheck(4);
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
    }

    public byte[] getBuffer() {
        return this.mData;
    }

    @Override // com.objsys.asn1j.runtime.Asn1MessageBuffer
    public InputStream getInputStream() {
        return new ByteArrayInputStream(this.mData, 0, this.mByteIndex);
    }

    @Override // com.objsys.asn1j.runtime.Asn1EncodeBuffer
    public byte[] getMsgCopy() {
        int i = this.mByteIndex;
        byte[] bArr = new byte[i];
        System.arraycopy(this.mData, 0, bArr, 0, i);
        return bArr;
    }

    @Override // com.objsys.asn1j.runtime.Asn1EncodeBuffer
    public int getMsgLength() {
        return this.mByteIndex;
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
    public void indent() throws Asn1Exception {
        if (this.mCanonical) {
            return;
        }
        copy(this.mLineSep);
        int i = this.mLevel * 3;
        checkSize(i);
        for (int i2 = 0; i2 < i; i2++) {
            byte[] bArr = this.mData;
            int i3 = this.mByteIndex;
            this.mByteIndex = i3 + 1;
            bArr[i3] = BlobHeaderStructure.BLOB_VERSION;
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1EncodeBuffer
    public void reset() {
        this.mByteIndex = 0;
    }

    public void setCanonical(boolean z) {
        this.mCanonical = z;
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void setState(int i) {
        this.mState = i;
    }

    @Override // com.objsys.asn1j.runtime.Asn1EncodeBuffer
    public void write(OutputStream outputStream) throws IOException {
        outputStream.write(this.mData, 0, this.mByteIndex);
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeRealValue(double d, String str, String str2) throws IOException, Asn1Exception {
        Asn1XmlUtil.encodeReal(this, d, str, str2);
    }

    public Asn1XerEncodeBuffer(boolean z) {
        super(0);
        this.mLevel = 0;
        this.mState = 0;
        this.mLineSep = "\n";
        this.mCanonical = z;
    }

    public Asn1XerEncodeBuffer(boolean z, int i) {
        super(i);
        this.mLevel = 0;
        this.mState = 0;
        this.mLineSep = "\n";
        this.mCanonical = z;
    }

    @Override // com.objsys.asn1j.runtime.Asn1EncodeBuffer
    public void copy(byte b) {
        checkSize(1);
        byte[] bArr = this.mData;
        int i = this.mByteIndex;
        this.mByteIndex = i + 1;
        bArr[i] = b;
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void copy(byte[] bArr, int i, int i2) throws Asn1Exception {
        checkSize(i2);
        System.arraycopy(bArr, i, this.mData, this.mByteIndex, i2);
        this.mByteIndex += i2;
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeNamedValue(String str, String str2, String str3) throws Asn1Exception, IOException {
        encodeStartElement(str2, str3);
        encodeNamedValueElement(str);
        encodeEndElement(str2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void copy(String str) throws Asn1Exception {
        try {
            copy(str.getBytes("UTF8"));
        } catch (UnsupportedEncodingException unused) {
            System.out.getClass();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeEmptyElement(String str) throws Asn1Exception {
        StringBuffer stringBuffer = new StringBuffer("<");
        stringBuffer.append(str);
        stringBuffer.append("/>");
        copy(new String(stringBuffer.toString()));
        this.mState = 3;
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeStartElement(String str) throws Asn1Exception {
        indent();
        if (str != null) {
            StringBuffer stringBuffer = new StringBuffer("<");
            stringBuffer.append(str);
            stringBuffer.append(">");
            copy(new String(stringBuffer.toString()));
        }
        this.mState = 1;
    }
}
