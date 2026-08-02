package com.objsys.asn1j.runtime;

import com.adjust.sdk.Constants;
import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.ny61;
import defpackage.quz;
import defpackage.xfo;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.SimpleTimeZone;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public abstract class Asn1Time extends Asn18BitCharString implements Comparable {
    public static final int Apr = 4;
    public static final int April = 4;
    public static final int Aug = 8;
    public static final int August = 8;
    public static final int Dec = 12;
    public static final int December = 12;
    public static final int Feb = 2;
    public static final int February = 2;
    public static final int Jan = 1;
    public static final int January = 1;
    public static final int Jul = 7;
    public static final int July = 7;
    public static final int Jun = 6;
    public static final int June = 6;
    public static final int Mar = 3;
    public static final int March = 3;
    public static final int May = 5;
    public static final int Nov = 11;
    public static final int November = 11;
    public static final int Oct = 10;
    public static final int October = 10;
    public static final int Sep = 9;
    public static final int September = 9;
    static short[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final long serialVersionUID = 6260627786112948830L;
    protected transient int day;
    protected transient boolean derRules;
    protected transient int diffHour;
    protected transient int diffMin;
    protected transient int hour;
    protected transient int minute;
    protected transient int month;
    protected transient boolean parsed;
    protected transient String secFraction;
    protected transient int second;
    protected transient boolean utcFlag;
    protected transient int year;

    public Asn1Time(short s, boolean z) {
        super(s);
        this.secFraction = new String();
        this.derRules = z;
        init();
    }

    public static char charAt(String str, int i) {
        if (i >= str.length()) {
            return (char) 0;
        }
        return str.charAt(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
    
        if ((r5 % com.adjust.sdk.Constants.MINIMAL_ERROR_STATUS_CODE) == 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean checkDate(int i, int i2, int i3) {
        if (i <= 0 || i2 <= 0) {
            return true;
        }
        if (i3 >= 0 && i2 > 0) {
            short s = daysInMonth[i2];
            int i4 = s;
            if (i2 == 2) {
                i4 = s;
                if (i3 % 4 == 0) {
                    if (i3 % 100 == 0) {
                        i4 = s;
                    }
                    i4 = s + 1;
                }
            }
            if (i >= 1 && i <= i4) {
                return true;
            }
        } else if (i2 > 0) {
            short s2 = daysInMonth[i2];
            if (i <= s2) {
                return true;
            }
            if (i2 == 2 && i <= s2 + 1) {
                return true;
            }
        }
        return false;
    }

    public static int parseInt(String str, IntHolder intHolder, int i) {
        if (intHolder.value + i > str.length()) {
            ny61.s();
            return 0;
        }
        int i2 = intHolder.value;
        int i3 = i + i2;
        intHolder.value = i3;
        return Integer.parseInt(str.substring(i2, i3));
    }

    private static int parseXmlInt(String str, IntHolder intHolder, int i) {
        if (intHolder.value + i > str.length()) {
            ny61.s();
            return 0;
        }
        if (i == 0) {
            while (i < str.length() && (Character.isDigit(str.charAt(i)) || (i == 0 && (str.charAt(i) == '-' || str.charAt(i) == '+')))) {
                i++;
            }
        }
        char charAt = str.charAt(intHolder.value);
        if (charAt == '-' || charAt == 'T' || charAt == ':' || charAt == '.' || charAt == ',' || charAt == 'Z') {
            intHolder.value++;
        }
        int i2 = intHolder.value;
        int i3 = i + i2;
        intHolder.value = i3;
        return Integer.parseInt(str.substring(i2, i3));
    }

    public static void putInteger(StringBuffer stringBuffer, int i, int i2) {
        String valueOf = String.valueOf(i2);
        int length = valueOf.length();
        if (length < i) {
            while (length < i) {
                stringBuffer.append(MoneyInputEditView.DEFAULT_VALUE);
                length++;
            }
        } else if (length > i) {
            valueOf = valueOf.substring(length - i);
        }
        stringBuffer.append(valueOf);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        short readShort = objectInputStream.readShort();
        this.year = objectInputStream.readShort();
        this.month = objectInputStream.read();
        this.day = objectInputStream.read();
        this.hour = objectInputStream.read();
        this.minute = objectInputStream.read();
        this.second = objectInputStream.read();
        if (readShort == 1) {
            this.secFraction = Integer.toString(objectInputStream.read());
        } else if (readShort == 2) {
            this.secFraction = Integer.toString(objectInputStream.readInt());
        } else {
            this.secFraction = (String) objectInputStream.readObject();
        }
        this.diffHour = objectInputStream.read();
        this.diffMin = objectInputStream.read();
        this.utcFlag = objectInputStream.readBoolean();
        this.parsed = objectInputStream.readBoolean();
        this.derRules = objectInputStream.readBoolean();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeShort(3);
        objectOutputStream.writeShort(this.year);
        objectOutputStream.writeByte(this.month);
        objectOutputStream.writeByte(this.day);
        objectOutputStream.writeByte(this.hour);
        objectOutputStream.writeByte(this.minute);
        objectOutputStream.writeByte(this.second);
        objectOutputStream.writeObject(this.secFraction);
        objectOutputStream.writeByte(this.diffHour);
        objectOutputStream.writeByte(this.diffMin);
        objectOutputStream.writeBoolean(this.utcFlag);
        objectOutputStream.writeBoolean(this.parsed);
        objectOutputStream.writeBoolean(this.derRules);
    }

    public void clear() {
        this.hour = -1;
        this.day = -1;
        this.month = -1;
        this.year = -1;
        this.diffMin = 0;
        this.diffHour = 0;
        this.second = 0;
        this.minute = 0;
        this.utcFlag = this.derRules;
        this.parsed = true;
        this.value = "";
        this.secFraction = "";
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        try {
            if (obj instanceof Calendar) {
                long time = getTime().getTime().getTime() - ((Calendar) obj).getTime().getTime();
                if (time > 0) {
                    return 1;
                }
                return time == 0 ? 0 : -1;
            }
            long time2 = getTime().getTime().getTime() - ((Asn1Time) obj).getTime().getTime().getTime();
            if (time2 > 0) {
                return 1;
            }
            return time2 == 0 ? 0 : -1;
        } catch (Asn1Exception e) {
            xfo.h(e.getMessage());
            return 0;
        }
    }

    public abstract boolean compileString() throws Asn1Exception;

    @Override // com.objsys.asn1j.runtime.Asn1CharString
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i, Asn1Tag asn1Tag) throws Asn1Exception, IOException {
        this.parsed = false;
        super.decode(asn1BerDecodeBuffer, z, i, asn1Tag);
        setDER(asn1BerDecodeBuffer instanceof Asn1DerDecodeBuffer);
    }

    @Override // com.objsys.asn1j.runtime.Asn1CharString
    public void decodeXML(String str, String str2) throws Asn1Exception {
        parseXmlString(str);
    }

    @Override // com.objsys.asn1j.runtime.Asn1CharString
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z, Asn1Tag asn1Tag) throws Asn1Exception {
        safeParseString();
        boolean z2 = asn1BerEncodeBuffer instanceof Asn1DerEncodeBuffer;
        if (this.derRules != z2) {
            setDER(z2);
            if (!compileString()) {
                quz.s("Time string could not be generated.");
                return 0;
            }
        }
        return super.encode(asn1BerEncodeBuffer, z, asn1Tag);
    }

    @Override // com.objsys.asn1j.runtime.Asn1CharString
    public boolean equals(Object obj) {
        try {
            if (obj instanceof Asn1Time) {
                return getTime().equals(((Asn1Time) obj).getTime());
            }
            if (obj instanceof Calendar) {
                return getTime().equals((Calendar) obj);
            }
            return false;
        } catch (Asn1Exception unused) {
            return false;
        }
    }

    public int getDay() throws Asn1Exception {
        if (!this.parsed) {
            parseString(this.value);
        }
        return this.day;
    }

    public int getDiff() throws Asn1Exception {
        if (!this.parsed) {
            parseString(this.value);
        }
        return (this.diffHour * 60) + this.diffMin;
    }

    public int getDiffHour() throws Asn1Exception {
        if (!this.parsed) {
            parseString(this.value);
        }
        return this.diffHour;
    }

    public int getDiffMinute() throws Asn1Exception {
        if (!this.parsed) {
            parseString(this.value);
        }
        return this.diffMin;
    }

    public String getFraction() throws Asn1Exception {
        if (!this.parsed) {
            parseString(this.value);
        }
        return this.secFraction;
    }

    public int getHour() throws Asn1Exception {
        if (!this.parsed) {
            parseString(this.value);
        }
        return this.hour;
    }

    public int getMinute() throws Asn1Exception {
        if (!this.parsed) {
            parseString(this.value);
        }
        return this.minute;
    }

    public int getMonth() throws Asn1Exception {
        if (!this.parsed) {
            parseString(this.value);
        }
        return this.month;
    }

    public int getSecond() throws Asn1Exception {
        if (!this.parsed) {
            parseString(this.value);
        }
        return this.second;
    }

    public Calendar getTime() throws Asn1Exception {
        int i;
        if (!this.parsed) {
            parseString(this.value);
        }
        Calendar calendar = Calendar.getInstance();
        if (this.utcFlag) {
            i = 0;
        } else {
            i = (this.diffMin * 60000) + (this.diffHour * Constants.ONE_HOUR);
        }
        calendar.setTimeZone(new SimpleTimeZone(i, ""));
        calendar.setLenient(false);
        calendar.set(this.year, this.month - 1, this.day, this.hour, this.minute, this.second);
        if (this.secFraction.length() > 0) {
            calendar.set(14, Integer.parseInt(this.secFraction));
        } else {
            calendar.set(14, 0);
        }
        calendar.set(15, i);
        return calendar;
    }

    public boolean getUTC() throws Asn1Exception {
        if (!this.parsed) {
            parseString(this.value);
        }
        return this.utcFlag;
    }

    public int getYear() throws Asn1Exception {
        if (!this.parsed) {
            parseString(this.value);
        }
        return this.year;
    }

    public void init() {
        this.hour = -1;
        this.day = -1;
        this.month = -1;
        this.year = -1;
        this.second = 0;
        this.minute = 0;
        this.diffMin = 0;
        this.diffHour = 0;
        this.utcFlag = this.derRules;
    }

    public abstract void parseString(String str) throws Asn1Exception;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if ((r11 % com.adjust.sdk.Constants.MINIMAL_ERROR_STATUS_CODE) == 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void parseXmlString(String str) throws Asn1Exception {
        if (str == null) {
            quz.s("Invalid parameter");
            return;
        }
        clear();
        IntHolder intHolder = new IntHolder(0);
        try {
            this.year = parseXmlInt(str, intHolder, 0);
            this.month = parseXmlInt(str, intHolder, 2);
            this.day = parseXmlInt(str, intHolder, 2);
            this.hour = parseXmlInt(str, intHolder, 2);
            this.minute = parseXmlInt(str, intHolder, 2);
            int parseXmlInt = parseXmlInt(str, intHolder, 2);
            this.second = parseXmlInt;
            int i = this.year;
            if (i == 0) {
                StringBuffer stringBuffer = new StringBuffer("Invalid year value: ");
                stringBuffer.append(this.year);
                throw new Asn1Exception(stringBuffer.toString());
            }
            int i2 = this.month;
            if (i2 < 1 || i2 > 12) {
                StringBuffer stringBuffer2 = new StringBuffer("Invalid month value: ");
                stringBuffer2.append(this.month);
                throw new Asn1Exception(stringBuffer2.toString());
            }
            short s = daysInMonth[i2];
            int i3 = s;
            if (i2 == 2) {
                i3 = s;
                if (i % 4 == 0) {
                    if (i % 100 == 0) {
                        i3 = s;
                    }
                    i3 = s + 1;
                }
            }
            int i4 = this.day;
            if (i4 < 1 || i4 > i3) {
                StringBuffer stringBuffer3 = new StringBuffer("Invalid day value: ");
                stringBuffer3.append(this.day);
                throw new Asn1Exception(stringBuffer3.toString());
            }
            int i5 = this.hour;
            if (i5 < 0 || i5 > 23) {
                StringBuffer stringBuffer4 = new StringBuffer("Invalid hour value: ");
                stringBuffer4.append(this.hour);
                throw new Asn1Exception(stringBuffer4.toString());
            }
            int i6 = this.minute;
            if (i6 < 0 || i6 > 59) {
                StringBuffer stringBuffer5 = new StringBuffer("Invalid minute value: ");
                stringBuffer5.append(this.minute);
                throw new Asn1Exception(stringBuffer5.toString());
            }
            if (parseXmlInt < 0 || parseXmlInt > 59) {
                StringBuffer stringBuffer6 = new StringBuffer("Invalid second value: ");
                stringBuffer6.append(this.second);
                throw new Asn1Exception(stringBuffer6.toString());
            }
            char charAt = charAt(str, intHolder.value);
            if (charAt == '.' || charAt == ',') {
                intHolder.value++;
                int i7 = 0;
                while (Character.isDigit(charAt(str, intHolder.value + i7))) {
                    i7++;
                }
                if (i7 == 0) {
                    throw new Asn1Exception("Unexpected '.' or ','");
                }
                int i8 = intHolder.value;
                this.secFraction = str.substring(i8, i8 + i7);
                intHolder.value += i7;
            }
            if (charAt(str, intHolder.value) == 'Z') {
                int i9 = intHolder.value + 1;
                intHolder.value = i9;
                this.utcFlag = true;
                if (i9 != str.length()) {
                    throw new Asn1Exception("Unexpected values at end of string");
                }
            } else {
                this.utcFlag = false;
                char charAt2 = charAt(str, intHolder.value);
                if (charAt2 == '-' || charAt2 == '+') {
                    int i10 = intHolder.value + 1;
                    intHolder.value = i10;
                    if (!Character.isDigit(charAt(str, i10))) {
                        throw new Asn1Exception("Invalid diffhour");
                    }
                    this.diffHour = parseXmlInt(str, intHolder, 2);
                    int parseXmlInt2 = parseXmlInt(str, intHolder, 2);
                    this.diffMin = parseXmlInt2;
                    int i11 = this.diffHour;
                    if (i11 < 0 || i11 > 12) {
                        StringBuffer stringBuffer7 = new StringBuffer();
                        stringBuffer7.append("Invalid diffhour value: ");
                        stringBuffer7.append(this.diffHour);
                        throw new Asn1Exception(stringBuffer7.toString());
                    }
                    if (parseXmlInt2 < 0 || parseXmlInt2 > 59) {
                        StringBuffer stringBuffer8 = new StringBuffer();
                        stringBuffer8.append("Invalid diffminute value: ");
                        stringBuffer8.append(this.diffMin);
                        throw new Asn1Exception(stringBuffer8.toString());
                    }
                    if (charAt2 == '-') {
                        this.diffHour = -i11;
                        this.diffMin = -parseXmlInt2;
                    }
                }
            }
            this.parsed = true;
            if (str != this.value) {
                compileString();
            }
        } catch (IllegalArgumentException unused) {
            quz.s("Invalid date format");
        } catch (IndexOutOfBoundsException unused2) {
            quz.s("Invalid date format");
        } catch (NumberFormatException unused3) {
            quz.s("Invalid number format");
        }
    }

    public void safeParseString() {
        try {
            if (this.parsed) {
                return;
            }
            parseString(this.value);
        } catch (Asn1Exception unused) {
        }
    }

    public void setDER(boolean z) {
        this.derRules = z;
    }

    public void setDay(int i) throws Asn1Exception {
        if (i >= 1 && i <= 31 && checkDate(i, this.month, this.year)) {
            safeParseString();
            this.day = i;
            compileString();
            return;
        }
        StringBuffer stringBuffer = new StringBuffer("Invalid day value: ");
        stringBuffer.append(i);
        stringBuffer.append(" for month (");
        stringBuffer.append(this.month);
        stringBuffer.append(") and year (");
        stringBuffer.append(this.year);
        stringBuffer.append(Extension.C_BRAKE);
        throw new Asn1Exception(stringBuffer.toString());
    }

    public void setDiff(int i, int i2) throws Asn1Exception {
        if (i < -12 || i > 12) {
            StringBuffer stringBuffer = new StringBuffer("Invalid diffhour value: ");
            stringBuffer.append(i);
            throw new Asn1Exception(stringBuffer.toString());
        }
        if (Math.abs(i2) > 59) {
            StringBuffer stringBuffer2 = new StringBuffer("Invalid diffminute value: ");
            stringBuffer2.append(i2);
            throw new Asn1Exception(stringBuffer2.toString());
        }
        safeParseString();
        this.diffHour = i;
        if (i < 0) {
            this.diffMin = -Math.abs(i2);
        } else {
            this.diffMin = Math.abs(i2);
        }
        compileString();
    }

    public void setDiffHour(int i) throws Asn1Exception {
        if (i < -12 || i > 12) {
            StringBuffer stringBuffer = new StringBuffer("Invalid diffhour value: ");
            stringBuffer.append(i);
            throw new Asn1Exception(stringBuffer.toString());
        }
        safeParseString();
        this.diffHour = i;
        compileString();
    }

    public void setFraction(String str) throws Asn1Exception {
        safeParseString();
        this.secFraction = str;
        compileString();
    }

    public void setHour(int i) throws Asn1Exception {
        if (i < 0 || i > 23) {
            StringBuffer stringBuffer = new StringBuffer("Invalid hour value: ");
            stringBuffer.append(i);
            throw new Asn1Exception(stringBuffer.toString());
        }
        safeParseString();
        this.hour = i;
        compileString();
    }

    public void setMinute(int i) throws Asn1Exception {
        if (i < 0 || i > 59) {
            StringBuffer stringBuffer = new StringBuffer("Invalid minute value: ");
            stringBuffer.append(i);
            throw new Asn1Exception(stringBuffer.toString());
        }
        safeParseString();
        this.minute = i;
        compileString();
    }

    public void setMonth(int i) throws Asn1Exception {
        if (i < 1 || i > 12) {
            StringBuffer stringBuffer = new StringBuffer("Invalid month value: ");
            stringBuffer.append(i);
            throw new Asn1Exception(stringBuffer.toString());
        }
        if (checkDate(this.day, i, this.year)) {
            safeParseString();
            this.month = i;
            compileString();
            return;
        }
        StringBuffer stringBuffer2 = new StringBuffer("Invalid month value: ");
        stringBuffer2.append(i);
        stringBuffer2.append(" for day (");
        stringBuffer2.append(this.day);
        stringBuffer2.append(") and year (");
        stringBuffer2.append(this.year);
        stringBuffer2.append(Extension.C_BRAKE);
        throw new Asn1Exception(stringBuffer2.toString());
    }

    public void setSecond(int i) throws Asn1Exception {
        if (i < 0 || i > 59) {
            StringBuffer stringBuffer = new StringBuffer("Invalid second value: ");
            stringBuffer.append(i);
            throw new Asn1Exception(stringBuffer.toString());
        }
        safeParseString();
        this.second = i;
        compileString();
    }

    public void setTime(Calendar calendar) throws Asn1Exception {
        clear();
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
        if (calendar.isSet(12)) {
            this.minute = calendar.get(12);
        } else {
            this.minute = 0;
        }
        if (calendar.isSet(13)) {
            this.second = calendar.get(13);
        } else {
            this.second = 0;
        }
        if (calendar.isSet(14)) {
            this.secFraction = Integer.toString(calendar.get(14));
        } else {
            this.secFraction = new String();
        }
        if (calendar.isSet(15)) {
            int i = calendar.get(15);
            this.diffHour = i / Constants.ONE_HOUR;
            this.diffMin = (i % Constants.ONE_HOUR) / 60000;
        } else {
            this.diffMin = 0;
            this.diffHour = 0;
        }
        if (calendar.isSet(16)) {
            int i2 = calendar.get(16);
            this.diffHour = (i2 / Constants.ONE_HOUR) + this.diffHour;
            this.diffMin = ((i2 % Constants.ONE_HOUR) / 60000) + this.diffMin;
        }
        this.utcFlag = this.derRules;
        compileString();
    }

    public void setUTC(boolean z) throws Asn1Exception {
        if (this.derRules) {
            return;
        }
        safeParseString();
        this.utcFlag = z;
        compileString();
    }

    public void setYear(int i) throws Asn1Exception {
        if (i < 0) {
            StringBuffer stringBuffer = new StringBuffer("Invalid year value: ");
            stringBuffer.append(i);
            throw new Asn1Exception(stringBuffer.toString());
        }
        if (checkDate(this.day, this.month, i)) {
            safeParseString();
            this.year = i;
            compileString();
            return;
        }
        StringBuffer stringBuffer2 = new StringBuffer("Invalid year value: ");
        stringBuffer2.append(i);
        stringBuffer2.append(" for day (");
        stringBuffer2.append(this.day);
        stringBuffer2.append(") and month (");
        stringBuffer2.append(this.month);
        stringBuffer2.append(Extension.C_BRAKE);
        throw new Asn1Exception(stringBuffer2.toString());
    }

    @Override // com.objsys.asn1j.runtime.Asn18BitCharString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        this.parsed = false;
        super.decode(asn1PerDecodeBuffer);
        setDER(true);
    }

    public Asn1Time(String str, short s, boolean z) {
        super(str, s);
        this.secFraction = new String();
        this.derRules = z;
        init();
    }

    @Override // com.objsys.asn1j.runtime.Asn18BitCharString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException {
        safeParseString();
        if (!this.derRules) {
            setDER(true);
            if (!compileString()) {
                quz.s("Time string could not be generated.");
                return;
            }
        }
        super.encode(asn1PerEncodeBuffer);
    }

    public void putInteger(int i, int i2) {
        putInteger(this.mStringBuffer, i, i2);
    }

    public void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z, Asn1Tag asn1Tag) throws Asn1Exception, IOException {
        safeParseString();
        asn1BerOutputStream.encodeCharString(this.value, z, asn1Tag);
    }

    @Override // com.objsys.asn1j.runtime.Asn18BitCharString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerOutputStream asn1PerOutputStream) throws Asn1Exception, IOException {
        encode(asn1PerOutputStream.mBuffer);
        asn1PerOutputStream.writeBuffer(false);
    }

    public void setDiff(int i) throws Asn1Exception {
        if (Math.abs(i) <= 720) {
            safeParseString();
            this.diffHour = i / 60;
            this.diffMin = i % 60;
            compileString();
            return;
        }
        StringBuffer stringBuffer = new StringBuffer("Invalid diff value: ");
        stringBuffer.append(i);
        throw new Asn1Exception(stringBuffer.toString());
    }
}
