package com.objsys.asn1j.runtime;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: classes11.dex */
public class Asn1Real extends Asn1Type {
    private static final int MINUS_INFINITY = 65;
    private static final int PLUS_INFINITY = 64;
    private static final int REAL_BASE_16 = 32;
    private static final int REAL_BASE_2 = 0;
    private static final int REAL_BASE_8 = 16;
    private static final int REAL_BASE_MASK = 48;
    private static final int REAL_BINARY = 128;
    private static final int REAL_EXPLEN_1 = 0;
    private static final int REAL_EXPLEN_2 = 1;
    private static final int REAL_EXPLEN_3 = 2;
    private static final int REAL_EXPLEN_LONG = 3;
    private static final int REAL_EXPLEN_MASK = 3;
    private static final int REAL_FACTOR_MASK = 12;
    private static final int REAL_ISO6093_MASK = 63;
    private static final int REAL_SIGN = 64;
    public static final Asn1Tag TAG = new Asn1Tag(0, 0, 9);
    private static final long serialVersionUID = 3406587116835849281L;
    public transient double value;

    public Asn1Real() {
        this.value = 0.0d;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        objectInputStream.readShort();
        this.value = objectInputStream.readDouble();
    }

    private static int trailingZerosCnt(long j) {
        int intTrailingZerosCnt = Asn1RunTime.intTrailingZerosCnt((int) j);
        return intTrailingZerosCnt < 32 ? intTrailingZerosCnt : Asn1RunTime.intTrailingZerosCnt((int) (j >>> 32)) + 32;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeShort(1);
        objectOutputStream.writeDouble(this.value);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, TAG);
        }
        if (i == 0) {
            this.value = 0.0d;
            return;
        }
        int readByte = asn1BerDecodeBuffer.readByte();
        if (i == 1) {
            if (readByte == 64) {
                this.value = Double.POSITIVE_INFINITY;
                return;
            } else {
                if (readByte != 65) {
                    throw new Asn1Exception(asn1BerDecodeBuffer, "Invalid REAL value");
                }
                this.value = Double.NEGATIVE_INFINITY;
                return;
            }
        }
        int i2 = i - 1;
        int i3 = 3;
        int i4 = 2;
        if ((readByte & 128) != 0) {
            int i5 = readByte & 3;
            if (i5 == 0) {
                i3 = 1;
            } else if (i5 == 1) {
                i3 = 2;
            } else if (i5 != 2) {
                i3 = asn1BerDecodeBuffer.readByte();
                i2 = i - 2;
            }
            int decodeIntValue = (int) Asn1RunTime.decodeIntValue(asn1BerDecodeBuffer, i3, true);
            long decodeIntValue2 = Asn1RunTime.decodeIntValue(asn1BerDecodeBuffer, i2 - i3, false) * (1 << ((readByte & 12) >> 2));
            int i6 = readByte & 48;
            if (i6 != 0) {
                i4 = 16;
                if (i6 == 16) {
                    i4 = 8;
                } else if (i6 != 32) {
                    throw new Asn1Exception(asn1BerDecodeBuffer, "Invalid REAL value");
                }
            }
            double pow = Math.pow(i4, decodeIntValue) * decodeIntValue2;
            this.value = pow;
            if ((readByte & 64) != 0) {
                this.value = -pow;
            }
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.setLength(i2);
            int i7 = 0;
            while (i2 > 0) {
                int read = asn1BerDecodeBuffer.read();
                if (read == -1) {
                    throw new Asn1EndOfBufferException(asn1BerDecodeBuffer);
                }
                stringBuffer.setCharAt(i7, (char) read);
                i2--;
                i7++;
            }
            int i8 = readByte & 63;
            int i9 = 0;
            for (int i10 = 0; i10 < stringBuffer.length(); i10++) {
                char charAt = stringBuffer.charAt(i10);
                if (i8 >= 2 && charAt == ',') {
                    stringBuffer.setCharAt(i10, '.');
                } else if ((i8 < 1 || ((charAt < '0' || charAt > '9') && charAt != '+' && charAt != '-')) && ((i8 < 2 || charAt != '.') && (i8 != 3 || (charAt != 'E' && charAt != 'e')))) {
                    if (i9 != 0 || charAt != ' ') {
                        throw new Asn1Exception(asn1BerDecodeBuffer, "Invalid REAL value");
                    }
                }
                i9++;
            }
            try {
                this.value = Double.valueOf(stringBuffer.toString()).doubleValue();
            } catch (NumberFormatException unused) {
                throw new Asn1Exception(asn1BerDecodeBuffer, "Invalid REAL value");
            }
        }
        asn1BerDecodeBuffer.setTypeCode((short) 9);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void decodeXER(String str, String str2) throws Asn1Exception {
        int i;
        boolean z;
        double d;
        int i2;
        String trim = str.trim();
        double d2 = 0.0d;
        if (trim.compareTo("0") == 0) {
            this.value = 0.0d;
            return;
        }
        if (trim.compareTo("MINUS-INFINITY") == 0) {
            this.value = Double.NEGATIVE_INFINITY;
            return;
        }
        if (trim.compareTo("PLUS-INFINITY") == 0) {
            this.value = Double.POSITIVE_INFINITY;
            return;
        }
        int length = trim.length();
        if (length == 0) {
            throw new Asn1Exception("Invalid REAL value: ".concat(trim));
        }
        if (trim.charAt(0) == '-') {
            i = 1;
            z = true;
        } else {
            i = 0;
            z = false;
        }
        if (i >= length) {
            throw new Asn1Exception("Invalid REAL value: ".concat(trim));
        }
        double d3 = 0.0d;
        char c = 0;
        while (true) {
            d = d2;
            if (i >= length || trim.charAt(i) == '.') {
                break;
            }
            c = trim.charAt(i);
            if (!Character.isDigit(c)) {
                throw new Asn1Exception("Invalid REAL value: ".concat(trim));
            }
            d3 = (d3 * 10.0d) + (c - '0');
            i++;
            d2 = d;
        }
        if (i < length && (c = trim.charAt(i)) == '.') {
            i++;
            double d4 = 0.1d;
            while (i < length) {
                c = trim.charAt(i);
                if (c == 'E' || c == 'e') {
                    break;
                }
                if (!Character.isDigit(c)) {
                    throw new Asn1Exception("Invalid REAL value: ".concat(trim));
                }
                d3 += (c - '0') * d4;
                i++;
                d4 *= 0.1d;
                z = z;
            }
        }
        boolean z2 = z;
        if (i < length && (c == 'E' || c == 'e')) {
            int i3 = i + 1;
            if (i3 >= length) {
                throw new Asn1Exception("Invalid REAL value: ".concat(trim));
            }
            char charAt = trim.charAt(i3);
            if (charAt == '+') {
                i3 = i + 2;
            } else if (charAt == '-') {
                i3 = i + 2;
                i2 = -1;
                if (i3 < length) {
                    throw new Asn1Exception("Invalid REAL value: ".concat(trim));
                }
                int i4 = 0;
                while (i3 < length) {
                    char charAt2 = trim.charAt(i3);
                    if (!Character.isDigit(charAt2)) {
                        throw new Asn1Exception("Invalid REAL value: ".concat(trim));
                    }
                    i4 = (i4 * 10) + (charAt2 - '0');
                    i3++;
                }
                d3 *= Math.pow(10.0d, i4 * i2);
            } else if (!Character.isDigit(charAt)) {
                throw new Asn1Exception("Invalid REAL value: ".concat(trim));
            }
            i2 = 1;
            if (i3 < length) {
            }
        }
        if (z2) {
            d3 = d - d3;
        }
        this.value = d3;
    }

    public void decodeXML(String str, String str2) throws Asn1Exception {
        int i;
        boolean z;
        int i2;
        String trim = str.trim();
        if (trim.compareTo("-0") == 0) {
            this.value = Asn1XmlUtil.getMinusZero();
            return;
        }
        if (trim.compareTo("-INF") == 0) {
            this.value = Double.NEGATIVE_INFINITY;
            return;
        }
        if (trim.compareTo("INF") == 0) {
            this.value = Double.POSITIVE_INFINITY;
            return;
        }
        if (trim.compareTo("NaN") == 0) {
            this.value = Double.NaN;
            return;
        }
        if (trim.compareTo("0") == 0) {
            this.value = 0.0d;
            return;
        }
        int length = trim.length();
        if (length == 0) {
            throw new Asn1Exception("Invalid REAL value: ".concat(trim));
        }
        if (trim.charAt(0) == '+') {
            z = false;
            i = 1;
        } else if (trim.charAt(0) == '-') {
            i = 1;
            z = true;
        } else {
            i = 0;
            z = false;
        }
        if (i >= length) {
            throw new Asn1Exception("Invalid REAL value: ".concat(trim));
        }
        double d = 0.0d;
        char c = 0;
        while (i < length && trim.charAt(i) != '.') {
            c = trim.charAt(i);
            if (!Character.isDigit(c)) {
                throw new Asn1Exception("Invalid REAL value: ".concat(trim));
            }
            d = (d * 10.0d) + (c - '0');
            i++;
        }
        if (i < length && (c = trim.charAt(i)) == '.') {
            i++;
            double d2 = 0.1d;
            while (i < length) {
                c = trim.charAt(i);
                if (c == 'E' || c == 'e') {
                    break;
                }
                if (!Character.isDigit(c)) {
                    throw new Asn1Exception("Invalid REAL value: ".concat(trim));
                }
                d += (c - '0') * d2;
                i++;
                d2 *= 0.1d;
            }
        }
        if (i < length && (c == 'E' || c == 'e')) {
            int i3 = i + 1;
            if (i3 >= length) {
                throw new Asn1Exception("Invalid REAL value: ".concat(trim));
            }
            char charAt = trim.charAt(i3);
            if (charAt == '-') {
                i3 = i + 2;
                i2 = -1;
            } else {
                if (charAt == '+') {
                    i3 = i + 2;
                }
                i2 = 1;
            }
            if (i3 >= length) {
                throw new Asn1Exception("Invalid REAL value: ".concat(trim));
            }
            int i4 = 0;
            while (i3 < length) {
                char charAt2 = trim.charAt(i3);
                if (!Character.isDigit(charAt2)) {
                    throw new Asn1Exception("Invalid REAL value: ".concat(trim));
                }
                i4 = (i4 * 10) + (charAt2 - '0');
                i3++;
            }
            d *= Math.pow(10.0d, i4 * i2);
        }
        if (z) {
            d = 0.0d - d;
        }
        this.value = d;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException {
        int i;
        double d = this.value;
        if (d == 0.0d) {
            asn1PerEncodeBuffer.encodeLength(0L);
            return;
        }
        if (d == Double.NEGATIVE_INFINITY) {
            asn1PerEncodeBuffer.encodeLength(1L);
            asn1PerEncodeBuffer.encodeInt(65L, 8);
            return;
        }
        if (d == Double.POSITIVE_INFINITY) {
            asn1PerEncodeBuffer.encodeLength(1L);
            asn1PerEncodeBuffer.encodeInt(64L, 8);
            return;
        }
        long doubleToLongBits = Double.doubleToLongBits(d);
        char c = (doubleToLongBits >> 63) == 0 ? (char) 1 : (char) 65535;
        int i2 = ((int) ((doubleToLongBits >> 52) & 2047)) - 1075;
        long j = doubleToLongBits & 4503599627370495L;
        long j2 = i2 == 0 ? j << 1 : j | 4503599627370496L;
        if (j2 != 0) {
            int trailingZerosCnt = trailingZerosCnt(j2);
            j2 >>>= trailingZerosCnt;
            i2 += trailingZerosCnt;
            i = Asn1Util.getUlongBytesCount(j2) + 1;
        } else {
            i = 2;
        }
        int i3 = c == 65535 ? 192 : 128;
        long j3 = i2;
        int bytesCount = Asn1Util.getBytesCount(j3);
        int i4 = i + bytesCount;
        if (bytesCount != 1) {
            if (bytesCount == 2) {
                i3 |= 1;
            } else if (bytesCount != 3) {
                i3 |= 3;
                i4++;
            } else {
                i3 |= 2;
            }
        }
        asn1PerEncodeBuffer.encodeLength(i4);
        asn1PerEncodeBuffer.encodeBits((byte) i3, 8);
        if ((i3 & 3) == 3) {
            asn1PerEncodeBuffer.encodeBits((byte) bytesCount, 8);
        }
        if (bytesCount > 0) {
            asn1PerEncodeBuffer.encodeInt(j3, bytesCount * 8);
        }
        asn1PerEncodeBuffer.encodeInt(j2, false, false);
    }

    public boolean equals(Object obj) {
        return this.value == ((Asn1Real) obj).value;
    }

    public String toString() {
        return Double.toString(this.value);
    }

    public Asn1Real(double d) {
        this.value = d;
    }

    public boolean equals(double d) {
        return this.value == d;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        double d = this.value;
        if (d == Double.NEGATIVE_INFINITY) {
            i = asn1BerEncodeBuffer.encodeIntValue(65L);
        } else if (d == Double.POSITIVE_INFINITY) {
            i = asn1BerEncodeBuffer.encodeIntValue(64L);
        } else if (d != 0.0d) {
            long doubleToLongBits = Double.doubleToLongBits(d);
            char c = (doubleToLongBits >> 63) == 0 ? (char) 1 : (char) 65535;
            int i2 = ((int) ((doubleToLongBits >> 52) & 2047)) - 1075;
            long j = doubleToLongBits & 4503599627370495L;
            long j2 = i2 == 0 ? j << 1 : j | 4503599627370496L;
            if (j2 != 0) {
                int trailingZerosCnt = trailingZerosCnt(j2);
                j2 >>>= trailingZerosCnt;
                i2 += trailingZerosCnt;
            }
            int encodeIntValue = asn1BerEncodeBuffer.encodeIntValue(j2);
            int encodeIntValue2 = asn1BerEncodeBuffer.encodeIntValue(i2);
            int i3 = encodeIntValue + encodeIntValue2;
            int i4 = c == 65535 ? 192 : 128;
            if (encodeIntValue2 != 1) {
                if (encodeIntValue2 == 2) {
                    i4 |= 1;
                } else if (encodeIntValue2 != 3) {
                    i4 |= 3;
                    i3 += asn1BerEncodeBuffer.encodeIntValue(encodeIntValue2);
                } else {
                    i4 |= 2;
                }
            }
            asn1BerEncodeBuffer.copy((byte) i4);
            i = i3 + 1;
        } else {
            i = 0;
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, i) + i : i;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str) throws IOException, Asn1Exception {
        asn1XerEncoder.encodeRealValue(this.value, str);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str, String str2) throws IOException, Asn1Exception {
        asn1XerEncoder.encodeRealValue(this.value, str, str2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z) throws Asn1Exception, IOException {
        int i;
        if (z) {
            asn1BerOutputStream.encodeTag(TAG);
        }
        double d = this.value;
        if (d == 0.0d) {
            asn1BerOutputStream.encodeLength(0);
            return;
        }
        if (d == Double.NEGATIVE_INFINITY) {
            asn1BerOutputStream.encodeIntValue(65L, true);
            return;
        }
        if (d == Double.POSITIVE_INFINITY) {
            asn1BerOutputStream.encodeIntValue(64L, true);
            return;
        }
        long doubleToLongBits = Double.doubleToLongBits(d);
        char c = (doubleToLongBits >> 63) == 0 ? (char) 1 : (char) 65535;
        int i2 = ((int) ((doubleToLongBits >> 52) & 2047)) - 1075;
        long j = doubleToLongBits & 4503599627370495L;
        long j2 = i2 == 0 ? j << 1 : j | 4503599627370496L;
        if (j2 != 0) {
            int trailingZerosCnt = trailingZerosCnt(j2);
            j2 >>>= trailingZerosCnt;
            i2 += trailingZerosCnt;
            i = Asn1Util.getUlongBytesCount(j2) + 1;
        } else {
            i = 2;
        }
        int i3 = c == 65535 ? 192 : 128;
        long j3 = i2;
        int bytesCount = Asn1Util.getBytesCount(j3);
        int i4 = i + bytesCount;
        if (bytesCount != 1) {
            if (bytesCount == 2) {
                i3 |= 1;
            } else if (bytesCount != 3) {
                i3 |= 3;
                i4++;
            } else {
                i3 |= 2;
            }
        }
        asn1BerOutputStream.encodeLength(i4);
        asn1BerOutputStream.write((byte) i3);
        if ((i3 & 3) == 3) {
            asn1BerOutputStream.encodeIntValue(bytesCount, false);
        }
        asn1BerOutputStream.encodeIntValue(j3, false);
        asn1BerOutputStream.encodeIntValue(j2, false);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerOutputStream asn1PerOutputStream) throws Asn1Exception, IOException {
        encode(asn1PerOutputStream.mBuffer);
        asn1PerOutputStream.writeBuffer(false);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        Asn1PerDecodeBuffer asn1PerDecodeBuffer2;
        int decodeLength = (int) asn1PerDecodeBuffer.decodeLength();
        if (decodeLength == 0) {
            this.value = 0.0d;
            return;
        }
        int i = 8;
        int decodeBitsToInt = asn1PerDecodeBuffer.decodeBitsToInt(8);
        if (decodeLength == 1) {
            if (decodeBitsToInt != 64) {
                if (decodeBitsToInt == 65) {
                    this.value = Double.NEGATIVE_INFINITY;
                    return;
                }
                throw new Asn1Exception(asn1PerDecodeBuffer, "Invalid REAL value");
            }
            this.value = Double.POSITIVE_INFINITY;
            return;
        }
        int i2 = decodeLength - 1;
        int i3 = 3;
        if ((decodeBitsToInt & 128) != 0) {
            int i4 = decodeBitsToInt & 3;
            if (i4 == 0) {
                i3 = 1;
            } else if (i4 == 1) {
                i3 = 2;
            } else if (i4 != 2) {
                i3 = asn1PerDecodeBuffer.decodeBitsToInt(8);
                i2 = decodeLength - 2;
            }
            int decodeInt = (int) asn1PerDecodeBuffer.decodeInt(i3, true);
            long decodeBitsToLong = asn1PerDecodeBuffer.decodeBitsToLong((i2 - i3) * 8) * (1 << ((decodeBitsToInt & 12) >> 2));
            int i5 = decodeBitsToInt & 48;
            if (i5 == 0) {
                i = 2;
            } else if (i5 != 16) {
                if (i5 != 32) {
                    throw new Asn1Exception(asn1PerDecodeBuffer, "Invalid REAL value");
                }
                i = 16;
            }
            double pow = Math.pow(i, decodeInt) * decodeBitsToLong;
            this.value = pow;
            if ((decodeBitsToInt & 64) != 0) {
                this.value = -pow;
            }
            asn1PerDecodeBuffer2 = asn1PerDecodeBuffer;
        } else if ((decodeBitsToInt & 63) == 3) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.ensureCapacity(i2);
            asn1PerDecodeBuffer2 = asn1PerDecodeBuffer;
            asn1PerDecodeBuffer2.decodeCharString(i2, 8, 8, null, stringBuffer);
            for (int i6 = 0; i6 < stringBuffer.length(); i6++) {
                char charAt = stringBuffer.charAt(i6);
                if (charAt == ',') {
                    stringBuffer.setCharAt(i6, '.');
                } else if ((charAt < '0' || charAt > '9') && charAt != '+' && charAt != '-' && charAt != '.' && charAt != 'E' && charAt != 'e') {
                    throw new Asn1Exception(asn1PerDecodeBuffer2, "Invalid REAL value");
                }
            }
            try {
                this.value = Double.valueOf(stringBuffer.toString()).doubleValue();
            } catch (NumberFormatException unused) {
                throw new Asn1Exception(asn1PerDecodeBuffer2, "Invalid REAL value");
            }
        } else {
            throw new Asn1Exception(asn1PerDecodeBuffer, "Invalid REAL value");
        }
        asn1PerDecodeBuffer2.setTypeCode((short) 9);
    }
}
