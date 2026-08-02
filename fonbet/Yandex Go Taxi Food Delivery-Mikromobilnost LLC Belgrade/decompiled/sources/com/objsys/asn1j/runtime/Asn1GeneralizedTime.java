package com.objsys.asn1j.runtime;

import defpackage.quz;
import java.io.IOException;
import java.util.Calendar;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes11.dex */
public class Asn1GeneralizedTime extends Asn1Time {
    public static final Asn1Tag TAG = new Asn1Tag(0, 0, 24);

    public Asn1GeneralizedTime() {
        super((short) 24, false);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Time
    public boolean compileString() throws Asn1Exception {
        int i;
        if (this.year < 0 || this.month <= 0 || this.day <= 0 || this.hour < 0) {
            return false;
        }
        this.value = "";
        StringBuffer stringBuffer = this.mStringBuffer;
        if (stringBuffer == null) {
            this.mStringBuffer = new StringBuffer();
        } else {
            stringBuffer.setLength(0);
        }
        if ((this.derRules || this.utcFlag) && !(this.diffHour == 0 && this.diffMin == 0)) {
            Calendar time = getTime();
            time.add(12, -this.diffMin);
            time.add(11, -this.diffHour);
            putInteger(4, time.get(1));
            putInteger(2, time.get(2) + 1);
            putInteger(2, time.get(5));
            putInteger(2, time.get(11));
            i = time.get(12);
        } else {
            putInteger(4, this.year);
            putInteger(2, this.month);
            putInteger(2, this.day);
            putInteger(2, this.hour);
            i = this.minute;
        }
        if (this.derRules || i > 0 || this.second > 0 || this.secFraction.length() > 0) {
            putInteger(2, i);
            if (this.derRules || this.second > 0 || this.secFraction.length() > 0) {
                putInteger(2, this.second);
                if (this.secFraction.length() > 0) {
                    this.mStringBuffer.append('.');
                    this.mStringBuffer.append(this.secFraction);
                }
            }
        }
        if (this.derRules || this.utcFlag) {
            this.mStringBuffer.append('Z');
        } else {
            int i2 = this.diffHour;
            if (i2 != 0 || this.diffMin != 0) {
                this.mStringBuffer.append(i2 > 0 ? '+' : LicenseUtility.SEPARATOR);
                int i3 = this.diffMin;
                int i4 = this.diffHour;
                if (i3 != 0) {
                    putInteger(2, Math.abs(i4));
                    putInteger(2, Math.abs(this.diffMin));
                } else {
                    putInteger(2, Math.abs(i4));
                }
            }
        }
        this.value = this.mStringBuffer.toString();
        return true;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        decode(asn1BerDecodeBuffer, z, i, TAG);
    }

    @Override // com.objsys.asn1j.runtime.Asn1CharString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str, String str2) throws IOException, Asn1Exception {
        asn1XerEncoder.encodeStartElement(str, str2);
        encodeXMLData(asn1XerEncoder);
        asn1XerEncoder.encodeEndElement(str);
    }

    public void encodeXMLData(Asn1XerEncoder asn1XerEncoder) throws IOException, Asn1Exception {
        parseString(this.value);
        if (this.year < 0 || this.day <= 0 || this.month <= 0 || this.hour < 0 || this.minute < 0 || this.second < 0) {
            quz.s("Invalid date format");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Asn1Time.putInteger(stringBuffer, 4, this.year);
        char c = LicenseUtility.SEPARATOR;
        stringBuffer.append(LicenseUtility.SEPARATOR);
        Asn1Time.putInteger(stringBuffer, 2, this.month);
        stringBuffer.append(LicenseUtility.SEPARATOR);
        Asn1Time.putInteger(stringBuffer, 2, this.day);
        stringBuffer.append('T');
        Asn1Time.putInteger(stringBuffer, 2, this.hour);
        stringBuffer.append(':');
        Asn1Time.putInteger(stringBuffer, 2, this.minute);
        stringBuffer.append(':');
        Asn1Time.putInteger(stringBuffer, 2, this.second);
        if (this.secFraction.length() > 0) {
            stringBuffer.append('.');
            stringBuffer.append(this.secFraction);
        }
        if (this.utcFlag) {
            stringBuffer.append('Z');
        } else {
            int i = this.diffHour;
            if (i != 0 || this.diffMin != 0) {
                if (i > 0) {
                    c = '+';
                }
                stringBuffer.append(c);
                Asn1Time.putInteger(stringBuffer, 2, Math.abs(this.diffHour));
                stringBuffer.append(':');
                Asn1Time.putInteger(stringBuffer, 2, Math.abs(this.diffMin));
            }
        }
        asn1XerEncoder.copy(stringBuffer.toString());
    }

    public int getCentury() throws Asn1Exception {
        int year = getYear();
        if (year >= 0) {
            return year / 100;
        }
        StringBuffer stringBuffer = new StringBuffer("Invalid year value: ");
        stringBuffer.append(year);
        throw new Asn1Exception(stringBuffer.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if ((r11 % com.adjust.sdk.Constants.MINIMAL_ERROR_STATUS_CODE) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
    
        r4 = r14.second;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b9, code lost:
    
        if (r4 < 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bb, code lost:
    
        if (r4 > 59) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00be, code lost:
    
        r1 = new java.lang.StringBuffer("Invalid second value: ");
        r1.append(r14.second);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d1, code lost:
    
        throw new com.objsys.asn1j.runtime.Asn1Exception(r1.toString());
     */
    @Override // com.objsys.asn1j.runtime.Asn1Time
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void parseString(String str) throws Asn1Exception {
        char c;
        int i;
        if (str == null) {
            quz.s("Invalid parameter");
            return;
        }
        clear();
        IntHolder intHolder = new IntHolder(0);
        try {
            this.year = Asn1Time.parseInt(str, intHolder, 4);
            this.month = Asn1Time.parseInt(str, intHolder, 2);
            int parseInt = Asn1Time.parseInt(str, intHolder, 2);
            this.day = parseInt;
            int i2 = this.year;
            if (i2 < 0) {
                StringBuffer stringBuffer = new StringBuffer("Invalid year value: ");
                stringBuffer.append(this.year);
                throw new Asn1Exception(stringBuffer.toString());
            }
            int i3 = this.month;
            if (i3 < 1 || i3 > 12) {
                StringBuffer stringBuffer2 = new StringBuffer("Invalid month value: ");
                stringBuffer2.append(this.month);
                throw new Asn1Exception(stringBuffer2.toString());
            }
            short s = Asn1Time.daysInMonth[i3];
            int i4 = s;
            if (i3 == 2) {
                i4 = s;
                if (i2 % 4 == 0) {
                    if (i2 % 100 == 0) {
                        i4 = s;
                    }
                    i4 = s + 1;
                }
            }
            if (parseInt < 1 || parseInt > i4) {
                StringBuffer stringBuffer3 = new StringBuffer("Invalid day value: ");
                stringBuffer3.append(this.day);
                throw new Asn1Exception(stringBuffer3.toString());
            }
            if (!Character.isDigit(Asn1Time.charAt(str, intHolder.value))) {
                throw new Asn1Exception("Hours expected");
            }
            this.hour = Asn1Time.parseInt(str, intHolder, 2);
            if (Character.isDigit(Asn1Time.charAt(str, intHolder.value))) {
                this.minute = Asn1Time.parseInt(str, intHolder, 2);
                if (Character.isDigit(Asn1Time.charAt(str, intHolder.value))) {
                    this.second = Asn1Time.parseInt(str, intHolder, 2);
                    c = 3;
                } else {
                    c = 2;
                }
            } else {
                c = 1;
            }
            int i5 = this.hour;
            if (i5 < 0 || i5 > 23) {
                StringBuffer stringBuffer4 = new StringBuffer("Invalid hour value: ");
                stringBuffer4.append(this.hour);
                throw new Asn1Exception(stringBuffer4.toString());
            }
            if (c >= 2 && ((i = this.minute) < 0 || i > 59)) {
                StringBuffer stringBuffer5 = new StringBuffer("Invalid minute value: ");
                stringBuffer5.append(this.minute);
                throw new Asn1Exception(stringBuffer5.toString());
            }
            char charAt = Asn1Time.charAt(str, intHolder.value);
            if (this.derRules && charAt == ',') {
                throw new Asn1Exception("Invalid decimal mark");
            }
            if (charAt == '.' || charAt == ',') {
                intHolder.value++;
                if (c != 3) {
                    throw new Asn1Exception("Unexpected '.' or ','");
                }
                int i6 = 0;
                while (Character.isDigit(Asn1Time.charAt(str, intHolder.value + i6))) {
                    i6++;
                }
                if (i6 == 0) {
                    throw new Asn1Exception("Invalid fraction value ");
                }
                int i7 = intHolder.value;
                this.secFraction = str.substring(i7, i7 + i6);
                intHolder.value += i6;
            }
            if (Asn1Time.charAt(str, intHolder.value) == 'Z') {
                int i8 = intHolder.value + 1;
                intHolder.value = i8;
                this.utcFlag = true;
                if (i8 != str.length()) {
                    throw new Asn1Exception("Unexpected values at end of string");
                }
            } else {
                if (this.derRules) {
                    throw new Asn1Exception("Unexpected zone offset in DER/CER/PER time string");
                }
                this.utcFlag = false;
                char charAt2 = Asn1Time.charAt(str, intHolder.value);
                if (charAt2 == '-' || charAt2 == '+') {
                    int i9 = intHolder.value + 1;
                    intHolder.value = i9;
                    if (!Character.isDigit(Asn1Time.charAt(str, i9))) {
                        throw new Asn1Exception("Invalid diffhour");
                    }
                    this.diffHour = Asn1Time.parseInt(str, intHolder, 2);
                    if (Character.isDigit(Asn1Time.charAt(str, intHolder.value))) {
                        this.diffMin = Asn1Time.parseInt(str, intHolder, 2);
                    }
                    int i10 = this.diffHour;
                    if (i10 < 0 || i10 > 12) {
                        StringBuffer stringBuffer6 = new StringBuffer();
                        stringBuffer6.append("Invalid diffhour value: ");
                        stringBuffer6.append(this.diffHour);
                        throw new Asn1Exception(stringBuffer6.toString());
                    }
                    int i11 = this.diffMin;
                    if (i11 < 0 || i11 > 59) {
                        StringBuffer stringBuffer7 = new StringBuffer();
                        stringBuffer7.append("Invalid diffminute value: ");
                        stringBuffer7.append(this.diffMin);
                        throw new Asn1Exception(stringBuffer7.toString());
                    }
                    if (charAt2 == '-') {
                        this.diffHour = -i10;
                        this.diffMin = -i11;
                    }
                }
            }
            this.parsed = true;
            if (str != this.value) {
                compileString();
            }
        } catch (NumberFormatException unused) {
            quz.s("Invalid number format");
        } catch (IllegalArgumentException unused2) {
            quz.s("Invalid date format");
        } catch (IndexOutOfBoundsException unused3) {
            quz.s("Invalid date format");
        }
    }

    public void setCentury(int i) throws Asn1Exception {
        if (i < 0 || i > 99) {
            StringBuffer stringBuffer = new StringBuffer("Invalid century value: ");
            stringBuffer.append(i);
            throw new Asn1Exception(stringBuffer.toString());
        }
        safeParseString();
        this.year = (this.year % 100) + (i * 100);
        compileString();
    }

    public Asn1GeneralizedTime(boolean z) {
        super((short) 24, z);
    }

    public Asn1GeneralizedTime(String str) {
        super(str, (short) 24, false);
    }

    public Asn1GeneralizedTime(String str, boolean z) {
        super(str, (short) 24, z);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z) throws Asn1Exception, IOException {
        super.encode(asn1BerOutputStream, z, TAG);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        return encode(asn1BerEncodeBuffer, z, TAG);
    }
}
