package com.objsys.asn1j.runtime;

import com.yandex.go.sql.BaseDatabaseHelper;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes11.dex */
public class Asn1BigInteger extends Asn1Type {
    static final int MAX_BIG_INT_LEN = 100000;
    private static final long serialVersionUID = 2009412881072054788L;
    protected transient boolean mbSignExtend;
    public transient BigInteger value;
    public static final Asn1Tag TAG = new Asn1Tag(0, 0, 2);
    static final BigInteger TWOFIVESIX = new BigInteger("256");
    static final BigInteger MINUSONE = new BigInteger("-1");
    static final BigInteger ZERO = BigInteger.ZERO;

    public Asn1BigInteger(String str) {
        String str2;
        String str3;
        String substring;
        this.mbSignExtend = true;
        if (str.charAt(0) == '-') {
            str3 = str.substring(1);
            str2 = "-";
        } else {
            str2 = "";
            str3 = str;
        }
        int i = 2;
        if (str3.startsWith(HexString.STR_0x)) {
            substring = str3.substring(2);
            i = 16;
        } else if (str3.startsWith("0b")) {
            substring = str3.substring(2);
        } else if (!str3.startsWith("0o")) {
            this.value = new BigInteger(str);
            return;
        } else {
            substring = str3.substring(2);
            i = 8;
        }
        init(str2.concat(substring), i);
    }

    public static BigInteger decodeValue(Asn1DecodeBuffer asn1DecodeBuffer, int i) throws Asn1Exception, IOException {
        if (i > 100000) {
            StringBuffer stringBuffer = new StringBuffer("too big integer value (length is ");
            stringBuffer.append(i);
            stringBuffer.append(Extension.C_BRAKE);
            throw new Asn1Exception(stringBuffer.toString());
        }
        BigInteger bigInteger = null;
        for (int i2 = 0; i2 < i; i2++) {
            int readByte = asn1DecodeBuffer.readByte();
            if (readByte < 0) {
                throw new Asn1EndOfBufferException(asn1DecodeBuffer);
            }
            if (i2 == 0) {
                bigInteger = new BigInteger(readByte > 127 ? "-1" : "0");
            }
            bigInteger = bigInteger.multiply(TWOFIVESIX).add(new BigInteger(Integer.toString(readByte)));
        }
        return bigInteger == null ? ZERO : bigInteger;
    }

    public static int encodeValue(Asn1EncodeBuffer asn1EncodeBuffer, BigInteger bigInteger, boolean z, boolean z2) {
        int intValue;
        BigInteger bigInteger2;
        int i;
        BigInteger bigInteger3 = bigInteger;
        int i2 = 0;
        while (true) {
            BigInteger[] divideAndRemainder = bigInteger3.divideAndRemainder(TWOFIVESIX);
            BigInteger bigInteger4 = divideAndRemainder[0];
            intValue = divideAndRemainder[1].intValue();
            bigInteger2 = ZERO;
            if (bigInteger4.compareTo(bigInteger2) == -1 && intValue != 0) {
                bigInteger4 = bigInteger4.add(MINUSONE);
            }
            if (z2) {
                asn1EncodeBuffer.copy((byte) intValue);
            }
            i = i2 + 1;
            if (bigInteger4.compareTo(bigInteger2) == 0 || bigInteger4.compareTo(MINUSONE) == 0) {
                break;
            }
            bigInteger3 = bigInteger4;
            i2 = i;
        }
        if (z && bigInteger.compareTo(bigInteger2) > 0 && (intValue & 128) == 128) {
            if (z2) {
                asn1EncodeBuffer.copy((byte) 0);
            }
            return i2 + 2;
        }
        if (!z || bigInteger.compareTo(bigInteger2) >= 0 || (intValue & 128) != 0) {
            return i;
        }
        if (z2) {
            asn1EncodeBuffer.copy((byte) -1);
        }
        return i2 + 2;
    }

    private void init(String str, int i) {
        int i2 = 1;
        this.mbSignExtend = true;
        this.value = new BigInteger(str, i);
        if (i == 10 || str.length() <= 0 || str.charAt(0) == '-' || str.charAt(0) == '0') {
            return;
        }
        int i3 = 2;
        if (i == 2) {
            i3 = 8;
        } else if (i == 8) {
            i3 = 3;
            i2 = 4;
        } else if (i != 16) {
            return;
        } else {
            i2 = 8;
        }
        if (str.length() % i3 != 0 || Character.digit(str.charAt(0), i) < i2) {
            return;
        }
        byte[] byteArray = this.value.toByteArray();
        int i4 = 0;
        while (i4 < byteArray.length && byteArray[i4] == 0) {
            i4++;
        }
        int length = byteArray.length - i4;
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, i4, bArr, 0, length);
        this.value = new BigInteger(bArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        objectInputStream.readShort();
        this.mbSignExtend = objectInputStream.readBoolean();
        this.value = (BigInteger) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeShort(1);
        objectOutputStream.writeBoolean(this.mbSignExtend);
        objectOutputStream.writeObject(this.value);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        int decodeLength = (int) asn1PerDecodeBuffer.decodeLength();
        asn1PerDecodeBuffer.byteAlign();
        asn1PerDecodeBuffer.getTraceHandler().newBitField("value", decodeLength * 8);
        this.value = decodeValue(asn1PerDecodeBuffer, decodeLength);
        asn1PerDecodeBuffer.setTypeCode((short) 2);
    }

    public void decodeXER(String str, String str2) throws Asn1Exception {
        this.value = new BigInteger(str);
    }

    public void decodeXML(String str, String str2) throws Asn1Exception {
        decodeXER(str, str2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException {
        int byteIndex;
        Asn1PerEncodeBuffer asn1PerEncodeBuffer2;
        int encodeValue = encodeValue(asn1PerEncodeBuffer, this.value, this.mbSignExtend, false);
        asn1PerEncodeBuffer.encodeLength(encodeValue);
        boolean isAligned = asn1PerEncodeBuffer.isAligned();
        if (isAligned) {
            asn1PerEncodeBuffer.getTraceHandler().newBitField("value", encodeValue * 8);
            byteIndex = asn1PerEncodeBuffer.getByteIndex() + 1;
            asn1PerEncodeBuffer2 = null;
        } else {
            asn1PerEncodeBuffer2 = asn1PerEncodeBuffer;
            asn1PerEncodeBuffer = new Asn1PerEncodeBuffer(true, encodeValue);
            byteIndex = 0;
        }
        encodeValue(asn1PerEncodeBuffer, this.value, this.mbSignExtend, true);
        asn1PerEncodeBuffer.reverseBytes(byteIndex, encodeValue);
        if (isAligned) {
            return;
        }
        asn1PerEncodeBuffer2.encodeBits(asn1PerEncodeBuffer.getBuffer(), 0, encodeValue * 8);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Asn1BigInteger) {
            return this.value.equals(((Asn1BigInteger) obj).value);
        }
        if (obj instanceof BigInteger) {
            return this.value.equals((BigInteger) obj);
        }
        if (obj instanceof String) {
            return equals(new Asn1BigInteger((String) obj));
        }
        return false;
    }

    public String toString() {
        return this.value.toString();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, TAG);
        }
        this.value = decodeValue(asn1BerDecodeBuffer, i);
        asn1BerDecodeBuffer.setTypeCode((short) 2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encodeValue = encodeValue(asn1BerEncodeBuffer, this.value, this.mbSignExtend, true);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, encodeValue) + encodeValue : encodeValue;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str) throws IOException, Asn1Exception {
        if (str == null) {
            str = BaseDatabaseHelper.TYPE_INTEGER;
        }
        asn1XerEncoder.encodeStartElement(str);
        asn1XerEncoder.copy(toString());
        asn1XerEncoder.encodeEndElement(str);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str, String str2) throws IOException, Asn1Exception {
        if (str == null) {
            str = BaseDatabaseHelper.TYPE_INTEGER;
        }
        asn1XerEncoder.encodeStartElement(str, str2);
        asn1XerEncoder.copy(toString());
        asn1XerEncoder.encodeEndElement(str);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z) throws Asn1Exception, IOException {
        if (z) {
            asn1BerOutputStream.encodeTag(TAG);
        }
        Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
        asn1BerOutputStream.encodeLength(encodeValue(asn1BerEncodeBuffer, this.value, this.mbSignExtend, true));
        asn1BerOutputStream.write(asn1BerEncodeBuffer.getMsgCopy());
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerOutputStream asn1PerOutputStream) throws Asn1Exception, IOException {
        encode(asn1PerOutputStream.mBuffer);
        asn1PerOutputStream.writeBuffer(false);
    }

    public Asn1BigInteger(BigInteger bigInteger) {
        this.mbSignExtend = true;
        this.value = bigInteger;
    }

    public Asn1BigInteger() {
        this.mbSignExtend = true;
        this.value = null;
    }

    public Asn1BigInteger(String str, int i) {
        this.mbSignExtend = true;
        init(str, i);
    }
}
