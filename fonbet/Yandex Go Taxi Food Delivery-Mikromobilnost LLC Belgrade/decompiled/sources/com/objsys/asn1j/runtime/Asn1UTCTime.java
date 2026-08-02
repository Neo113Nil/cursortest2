package com.objsys.asn1j.runtime;

import com.adjust.sdk.Constants;
import defpackage.quz;
import java.io.IOException;
import java.util.Calendar;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes11.dex */
public class Asn1UTCTime extends Asn1Time {
    public static final Asn1Tag TAG = new Asn1Tag(0, 0, 23);

    public Asn1UTCTime() {
        super((short) 23, false);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Time
    public void clear() {
        super.clear();
        this.minute = -1;
        this.hour = -1;
        this.utcFlag = true;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Time
    public boolean compileString() throws Asn1Exception {
        this.value = "";
        boolean z = false;
        if (this.year >= 0 && this.day > 0 && this.month > 0 && this.hour >= 0 && this.minute >= 0) {
            StringBuffer stringBuffer = this.mStringBuffer;
            if (stringBuffer == null) {
                this.mStringBuffer = new StringBuffer();
            } else {
                stringBuffer.setLength(0);
            }
            z = true;
            if ((this.derRules || this.utcFlag) && !(this.diffHour == 0 && this.diffMin == 0)) {
                Calendar time = getTime();
                time.add(12, -this.diffMin);
                time.add(11, -this.diffHour);
                putInteger(2, time.get(1));
                putInteger(2, time.get(2) + 1);
                putInteger(2, time.get(5));
                putInteger(2, time.get(11));
                putInteger(2, time.get(12));
            } else {
                putInteger(2, this.year);
                putInteger(2, this.month);
                putInteger(2, this.day);
                putInteger(2, this.hour);
                putInteger(2, this.minute);
            }
            putInteger(2, this.second);
            if (this.derRules || this.utcFlag) {
                this.mStringBuffer.append('Z');
            } else {
                int i = this.diffHour;
                if (i != 0 || this.diffMin != 0) {
                    this.mStringBuffer.append(i > 0 ? '+' : LicenseUtility.SEPARATOR);
                    putInteger(2, Math.abs(this.diffHour));
                    putInteger(2, Math.abs(this.diffMin));
                }
            }
            this.value = this.mStringBuffer.toString();
        }
        return z;
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

    @Override // com.objsys.asn1j.runtime.Asn1Time
    public String getFraction() throws Asn1Exception {
        return null;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Time
    public void init() {
        super.init();
        this.minute = -1;
        this.hour = -1;
        this.utcFlag = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if ((r10 % com.adjust.sdk.Constants.MINIMAL_ERROR_STATUS_CODE) == 0) goto L25;
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
            this.year = Asn1Time.parseInt(str, intHolder, 2);
            this.month = Asn1Time.parseInt(str, intHolder, 2);
            int parseInt = Asn1Time.parseInt(str, intHolder, 2);
            this.day = parseInt;
            int i2 = this.year;
            if (i2 < 0) {
                StringBuffer stringBuffer = new StringBuffer("Invalid year value: ");
                stringBuffer.append(this.year);
                throw new Asn1Exception(stringBuffer.toString());
            }
            if (i2 < 100) {
                if (i2 > 70) {
                    this.year = i2 + 1900;
                } else {
                    this.year = i2 + 2000;
                }
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
                int i5 = this.year;
                i4 = s;
                if (i5 % 4 == 0) {
                    if (i5 % 100 == 0) {
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
            if (!Character.isDigit(Asn1Time.charAt(str, intHolder.value))) {
                throw new Asn1Exception("Minutes expected");
            }
            this.minute = Asn1Time.parseInt(str, intHolder, 2);
            if (Character.isDigit(Asn1Time.charAt(str, intHolder.value))) {
                this.second = Asn1Time.parseInt(str, intHolder, 2);
                c = 3;
            } else {
                c = 2;
            }
            int i6 = this.hour;
            if (i6 < 0 || i6 > 23) {
                StringBuffer stringBuffer4 = new StringBuffer("Invalid hour value: ");
                stringBuffer4.append(this.hour);
                throw new Asn1Exception(stringBuffer4.toString());
            }
            int i7 = this.minute;
            if (i7 < 0 || i7 > 59) {
                StringBuffer stringBuffer5 = new StringBuffer("Invalid minute value: ");
                stringBuffer5.append(this.minute);
                throw new Asn1Exception(stringBuffer5.toString());
            }
            if (c == 3 && ((i = this.second) < 0 || i > 59)) {
                StringBuffer stringBuffer6 = new StringBuffer("Invalid second value: ");
                stringBuffer6.append(this.second);
                throw new Asn1Exception(stringBuffer6.toString());
            }
            Asn1Time.charAt(str, intHolder.value);
            if (Asn1Time.charAt(str, intHolder.value) == 'Z') {
                int i8 = intHolder.value + 1;
                intHolder.value = i8;
                this.utcFlag = true;
                if (i8 != str.length()) {
                    throw new Asn1Exception("Unexpected values at the end of string");
                }
            } else {
                if (this.derRules) {
                    throw new Asn1Exception("Unexpected zone offset in DER/CER/PER time string");
                }
                this.utcFlag = false;
                char charAt = Asn1Time.charAt(str, intHolder.value);
                if (charAt == '-' || charAt == '+') {
                    int i9 = intHolder.value + 1;
                    intHolder.value = i9;
                    if (!Character.isDigit(Asn1Time.charAt(str, i9))) {
                        throw new Asn1Exception("Invalid diffhour");
                    }
                    this.diffHour = Asn1Time.parseInt(str, intHolder, 2);
                    if (!Character.isDigit(Asn1Time.charAt(str, intHolder.value))) {
                        throw new Asn1Exception("Invalid diffminute");
                    }
                    int parseInt2 = Asn1Time.parseInt(str, intHolder, 2);
                    this.diffMin = parseInt2;
                    int i10 = this.diffHour;
                    if (i10 < 0 || i10 > 12) {
                        StringBuffer stringBuffer7 = new StringBuffer("Invalid diffhour value: ");
                        stringBuffer7.append(this.diffHour);
                        throw new Asn1Exception(stringBuffer7.toString());
                    }
                    if (parseInt2 < 0 || parseInt2 > 59) {
                        StringBuffer stringBuffer8 = new StringBuffer("Invalid diffminute value: ");
                        stringBuffer8.append(this.diffMin);
                        throw new Asn1Exception(stringBuffer8.toString());
                    }
                    if (charAt == '-') {
                        this.diffHour = -i10;
                        this.diffMin = -parseInt2;
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

    @Override // com.objsys.asn1j.runtime.Asn1Time
    public void setFraction(String str) throws Asn1Exception {
        this.secFraction = "";
        throw new Asn1Exception("Fraction doesn't supported for Asn1UTCTime.");
    }

    @Override // com.objsys.asn1j.runtime.Asn1Time
    public void setTime(Calendar calendar) throws Asn1Exception {
        clear();
        boolean z = true;
        if (!calendar.isSet(1)) {
            quz.s("Invalid Calendar value: no year");
            return;
        }
        this.year = calendar.get(1);
        if (!calendar.isSet(2)) {
            quz.s("Invalid Calendar value: no month");
            return;
        }
        this.month = calendar.get(2) + 1;
        if (!calendar.isSet(5)) {
            quz.s("Invalid Calendar value: no day");
            return;
        }
        this.day = calendar.get(5);
        if (!calendar.isSet(11)) {
            quz.s("Invalid Calendar value: no hours");
            return;
        }
        this.hour = calendar.get(11);
        if (!calendar.isSet(12)) {
            quz.s("Invalid Calendar value: no minutes");
            return;
        }
        this.minute = calendar.get(12);
        if (calendar.isSet(13)) {
            this.second = calendar.get(13);
        } else {
            this.second = 0;
        }
        this.secFraction = "";
        if (calendar.isSet(15)) {
            int i = calendar.get(15);
            this.diffHour = i / Constants.ONE_HOUR;
            this.diffMin = (i % Constants.ONE_HOUR) / 60000;
            if (i != 0 && !this.derRules) {
                z = false;
            }
            this.utcFlag = z;
        } else {
            this.diffMin = 0;
            this.diffHour = 0;
            this.utcFlag = true;
        }
        compileString();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Time
    public void setYear(int i) throws Asn1Exception {
        if (i < 0) {
            StringBuffer stringBuffer = new StringBuffer("Invalid year value: ");
            stringBuffer.append(i);
            throw new Asn1Exception(stringBuffer.toString());
        }
        if (i < 100) {
            if (i >= 50) {
                super.setYear(i + 1900);
            } else {
                super.setYear(i + 2000);
            }
        }
        super.setYear(i);
    }

    public Asn1UTCTime(boolean z) {
        super((short) 23, z);
    }

    public Asn1UTCTime(String str) {
        super(str, (short) 23, false);
    }

    public Asn1UTCTime(String str, boolean z) {
        super(str, (short) 23, z);
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
