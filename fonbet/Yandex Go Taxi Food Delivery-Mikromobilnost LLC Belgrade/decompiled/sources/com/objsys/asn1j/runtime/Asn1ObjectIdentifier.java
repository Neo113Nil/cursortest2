package com.objsys.asn1j.runtime;

import defpackage.quz;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: classes11.dex */
public class Asn1ObjectIdentifier extends Asn1Type {
    public static final int MAXSUBIDS = 128;
    public static final Asn1Tag TAG = new Asn1Tag(0, 0, 6);
    private static Asn1RunTime rt = Asn1RunTime.instance();
    private static final long serialVersionUID = -2735122526060278835L;
    public transient int[] value;

    public Asn1ObjectIdentifier() {
        this.value = null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        objectInputStream.readShort();
        this.value = (int[]) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeShort(1);
        objectOutputStream.writeObject(this.value);
    }

    public void append(int[] iArr) {
        int length;
        int[] iArr2 = this.value;
        if (iArr2 == null) {
            this.value = new int[iArr.length];
            length = 0;
        } else {
            length = iArr2.length;
            int[] iArr3 = new int[iArr2.length + iArr.length];
            this.value = iArr3;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        }
        System.arraycopy(iArr, 0, this.value, length, iArr.length);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        int decodeLength = (int) asn1PerDecodeBuffer.decodeLength();
        if (decodeLength <= 0) {
            this.value = new int[0];
            return;
        }
        asn1PerDecodeBuffer.getTraceHandler().newBitField("value", 0);
        this.value = asn1PerDecodeBuffer.decodeOIDContents(decodeLength);
        asn1PerDecodeBuffer.getTraceHandler().setBitCount();
        asn1PerDecodeBuffer.setTypeCode((short) 6);
    }

    public void decodeXER(String str, String str2) throws Asn1Exception {
        String trim = str.trim();
        int length = trim.length();
        if (length == 0) {
            quz.r();
            return;
        }
        int i = -1;
        int i2 = 0;
        while (true) {
            i = trim.indexOf(46, i + 1);
            if (i <= 0) {
                break;
            } else {
                i2++;
            }
        }
        int i3 = i2 + 1;
        if (i3 < 2 || i3 > 128) {
            quz.r();
            return;
        }
        this.value = new int[i3];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = trim.charAt(i6);
            if (Character.isDigit(charAt)) {
                i5 = (charAt - '0') + (i5 * 10);
            } else if (charAt != '.') {
                quz.r();
                return;
            } else if (i6 + 1 >= length) {
                quz.r();
                return;
            } else {
                this.value[i4] = i5;
                i5 = 0;
                i4++;
            }
        }
        int[] iArr = this.value;
        iArr[i4] = i5;
        int i7 = iArr[0];
        if (i7 > 2 || (i7 != 2 && iArr[1] > 39)) {
            quz.r();
        }
    }

    public void decodeXML(String str, String str2) throws Asn1Exception {
        decodeXER(str, str2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z) throws Asn1Exception, IOException {
        int i;
        int[] iArr = this.value;
        int i2 = 2;
        if (iArr.length < 2 || (i = iArr[0]) > 2 || (i != 2 && iArr[1] > 39)) {
            quz.r();
            return;
        }
        int i3 = 2;
        int i4 = 1;
        while (true) {
            if (i3 >= this.value.length) {
                break;
            }
            i4 += Asn1RunTime.getIdentBytesCount(r5[i3]);
            i3++;
        }
        if (z) {
            asn1BerOutputStream.encodeTag(TAG);
        }
        asn1BerOutputStream.encodeLength(i4);
        int[] iArr2 = this.value;
        asn1BerOutputStream.encodeIdentifier((iArr2[0] * 40) + iArr2[1]);
        while (true) {
            if (i2 >= this.value.length) {
                return;
            }
            asn1BerOutputStream.encodeIdentifier(r9[i2]);
            i2++;
        }
    }

    public boolean equals(Object obj) {
        Asn1ObjectIdentifier asn1ObjectIdentifier = (Asn1ObjectIdentifier) obj;
        if (asn1ObjectIdentifier.value.length != this.value.length) {
            return false;
        }
        int i = 0;
        while (true) {
            int[] iArr = this.value;
            if (i >= iArr.length) {
                return true;
            }
            if (iArr[i] != asn1ObjectIdentifier.value[i]) {
                return false;
            }
            i++;
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer((this.value.length * 4) + 3);
        stringBuffer.append("{ ");
        int i = 0;
        while (true) {
            int[] iArr = this.value;
            if (i >= iArr.length) {
                stringBuffer.append("}");
                return stringBuffer.toString();
            }
            String num = Integer.toString(iArr[i]);
            if (num.length() + stringBuffer.length() + 2 >= stringBuffer.capacity()) {
                stringBuffer.ensureCapacity(((this.value.length - i) * (num.length() + 1)) + 1);
            }
            stringBuffer.append(num);
            stringBuffer.append(" ");
            i++;
        }
    }

    public Asn1ObjectIdentifier(int[] iArr) {
        this.value = iArr;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, TAG);
        }
        if (i > 0) {
            this.value = asn1BerDecodeBuffer.decodeOIDContents(i);
            rt.lcheck(1);
            asn1BerDecodeBuffer.setTypeCode((short) 6);
            return;
        }
        throw new Asn1InvalidLengthException();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException {
        int i;
        int[] iArr = this.value;
        if (iArr.length >= 2 && (i = iArr[0]) <= 2 && (i == 2 || iArr[1] <= 39)) {
            asn1PerEncodeBuffer.encodeOIDLengthAndValue(iArr);
        } else {
            quz.r();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str) throws IOException, Asn1Exception {
        int i;
        if (str == null) {
            str = "OBJECT_IDENTIFIER";
        }
        int[] iArr = this.value;
        if (iArr.length >= 2 && (i = iArr[0]) <= 2 && (i == 2 || iArr[1] <= 39)) {
            asn1XerEncoder.encodeStartElement(str);
            asn1XerEncoder.encodeObjectId(this.value);
            asn1XerEncoder.encodeEndElement(str);
            return;
        }
        quz.r();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str, String str2) throws IOException, Asn1Exception {
        int i;
        if (str == null) {
            str = "OBJECT_IDENTIFIER";
        }
        int[] iArr = this.value;
        if (iArr.length >= 2 && (i = iArr[0]) <= 2 && (i == 2 || iArr[1] <= 39)) {
            asn1XerEncoder.encodeStartElement(str, str2);
            asn1XerEncoder.encodeObjectId(this.value);
            asn1XerEncoder.encodeEndElement(str);
            return;
        }
        quz.r();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        int[] iArr = this.value;
        if (iArr.length >= 2 && (i = iArr[0]) <= 2 && (i == 2 || iArr[1] <= 39)) {
            int length = iArr.length - 1;
            int i2 = 0;
            while (length >= 1) {
                int[] iArr2 = this.value;
                i2 += asn1BerEncodeBuffer.encodeIdentifier(length == 1 ? (iArr2[0] * 40) + iArr2[1] : iArr2[length]);
                length--;
            }
            if (z) {
                i2 += asn1BerEncodeBuffer.encodeTagAndLength(TAG, i2);
            }
            rt.lcheck(1);
            return i2;
        }
        quz.r();
        return 0;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerOutputStream asn1PerOutputStream) throws Asn1Exception, IOException {
        int i;
        int[] iArr = this.value;
        if (iArr.length >= 2 && (i = iArr[0]) <= 2 && (i == 2 || iArr[1] <= 39)) {
            asn1PerOutputStream.encodeOIDLengthAndValue(iArr);
        } else {
            quz.r();
        }
    }
}
