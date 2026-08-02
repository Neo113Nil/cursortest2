package com.objsys.asn1j.runtime;

import java.util.Iterator;
import java.util.LinkedList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public class Asn1PerBitFieldList {
    private Asn1PerBitField mCurrBitField;
    private LinkedList mBitFieldList = new LinkedList();
    private StringBuffer mNameBuffer = new StringBuffer();
    private int mLastElemNameStartIndex = 0;

    public void addElemName(String str, int i) {
        int length = this.mNameBuffer.length();
        this.mLastElemNameStartIndex = length;
        if (length > 0) {
            this.mNameBuffer.append(Extension.DOT_CHAR);
        }
        this.mNameBuffer.append(str);
        if (i >= 0) {
            StringBuffer stringBuffer = this.mNameBuffer;
            StringBuffer stringBuffer2 = new StringBuffer("[");
            stringBuffer2.append(i);
            stringBuffer2.append("]");
            stringBuffer.append(stringBuffer2.toString());
        }
    }

    public Asn1PerBitField getCurrBitField() {
        return this.mCurrBitField;
    }

    public Iterator iterator() {
        return this.mBitFieldList.iterator();
    }

    public Asn1PerBitField newBitField(String str, int i, int i2) {
        String stringBuffer = this.mNameBuffer.toString();
        if (str != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(stringBuffer);
            stringBuffer2.append(" ");
            stringBuffer2.append(str);
            stringBuffer = stringBuffer2.toString();
        }
        Asn1PerBitField asn1PerBitField = new Asn1PerBitField(stringBuffer, i, i2);
        this.mCurrBitField = asn1PerBitField;
        this.mBitFieldList.addLast(asn1PerBitField);
        return this.mCurrBitField;
    }

    public void removeLastElemName() {
        this.mNameBuffer.setLength(this.mLastElemNameStartIndex);
        int i = this.mLastElemNameStartIndex;
        if (i <= 0) {
            return;
        }
        this.mLastElemNameStartIndex = i - 1;
        while (true) {
            int i2 = this.mLastElemNameStartIndex;
            if (i2 <= 0 || this.mNameBuffer.charAt(i2) == '.') {
                return;
            } else {
                this.mLastElemNameStartIndex--;
            }
        }
    }

    public void reset() {
        this.mBitFieldList.clear();
        this.mNameBuffer.setLength(0);
        this.mLastElemNameStartIndex = 0;
    }

    public void setBitOffset(int i) {
        Asn1PerBitField asn1PerBitField = this.mCurrBitField;
        if (asn1PerBitField != null) {
            asn1PerBitField.setBitOffset(i);
        }
    }
}
