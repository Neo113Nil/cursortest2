package defpackage;

import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.DayOfWeek;
import kotlinx.datetime.LocalDate;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes9.dex */
public final class jqv implements lb61, wqg, fpe {
    public final oqv a;
    public Integer b;
    public Integer c;
    public Integer d;

    public jqv(oqv oqvVar, Integer num, Integer num2, Integer num3) {
        this.a = oqvVar;
        this.b = num;
        this.c = num2;
        this.d = num3;
    }

    @Override // defpackage.wqg
    public final Integer B() {
        return this.d;
    }

    @Override // defpackage.lb61
    public final void C(Integer num) {
        this.a.a = num;
    }

    @Override // defpackage.fpe
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jqv copy() {
        oqv oqvVar = this.a;
        return new jqv(new oqv(oqvVar.a, oqvVar.b), this.b, this.c, this.d);
    }

    @Override // defpackage.wqg
    public final Integer b() {
        return this.c;
    }

    public final LocalDate c() {
        LocalDate localDate;
        int intValue;
        oqv oqvVar = this.a;
        Integer num = oqvVar.a;
        pb61.a(num, "year");
        int intValue2 = num.intValue();
        Integer num2 = this.d;
        if (num2 == null) {
            Integer num3 = oqvVar.b;
            pb61.a(num3, "monthNumber");
            int intValue3 = num3.intValue();
            Integer num4 = this.b;
            pb61.a(num4, "day");
            localDate = new LocalDate(intValue2, intValue3, num4.intValue());
        } else {
            LocalDate localDate2 = new LocalDate(intValue2, 1, 1);
            int intValue4 = num2.intValue() - 1;
            asg.Companion.getClass();
            LocalDate e = sfb1.e(localDate2, intValue4, rrg.a());
            if (e.g() != intValue2) {
                throw new DateTimeFormatException("Can not create a LocalDate from the given input: the day of year is " + num2 + ", which is not a valid day of year for the year " + intValue2);
            }
            if (oqvVar.b != null) {
                int d = cob1.d(e.c());
                Integer num5 = oqvVar.b;
                if (num5 == null || d != num5.intValue()) {
                    StringBuilder sb = new StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                    sb.append(num2);
                    sb.append(", which is ");
                    sb.append(e.c());
                    sb.append(", but ");
                    throw new DateTimeFormatException(oo31.j(sb, oqvVar.b, " was specified as the month number"));
                }
            }
            if (this.b != null) {
                int a = e.a();
                Integer num6 = this.b;
                if (num6 == null || a != num6.intValue()) {
                    StringBuilder sb2 = new StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                    sb2.append(num2);
                    sb2.append(", which is the day ");
                    sb2.append(e.a());
                    sb2.append(" of ");
                    sb2.append(e.c());
                    sb2.append(", but ");
                    throw new DateTimeFormatException(oo31.j(sb2, this.b, " was specified as the day of month"));
                }
            }
            localDate = e;
        }
        Integer num7 = this.c;
        if (num7 == null || (intValue = num7.intValue()) == localDate.b().ordinal() + 1) {
            return localDate;
        }
        StringBuilder sb3 = new StringBuilder("Can not create a LocalDate from the given input: the day of week is ");
        if (1 > intValue || intValue >= 8) {
            w511.f(oyr.i(intValue, "Expected ISO day-of-week number in 1..7, got "));
            return null;
        }
        sb3.append((DayOfWeek) DayOfWeek.a().get(intValue - 1));
        sb3.append(" but the date is ");
        sb3.append(localDate);
        sb3.append(", which is a ");
        sb3.append(localDate.b());
        throw new DateTimeFormatException(sb3.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jqv)) {
            return false;
        }
        jqv jqvVar = (jqv) obj;
        return jl40.l(this.a, jqvVar.a) && jl40.l(this.b, jqvVar.b) && jl40.l(this.c, jqvVar.c) && jl40.l(this.d, jqvVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 29791;
        Integer num = this.b;
        int hashCode2 = ((num != null ? num.hashCode() : 0) * 961) + hashCode;
        Integer num2 = this.c;
        int hashCode3 = ((num2 != null ? num2.hashCode() : 0) * 31) + hashCode2;
        Integer num3 = this.d;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // defpackage.lb61
    public final Integer l() {
        return this.a.a;
    }

    @Override // defpackage.wqg
    public final Integer m() {
        return this.b;
    }

    @Override // defpackage.lb61
    public final Integer n() {
        return this.a.b;
    }

    @Override // defpackage.wqg
    public final void s(Integer num) {
        this.b = num;
    }

    @Override // defpackage.wqg
    public final void t(Integer num) {
        this.c = num;
    }

    public final String toString() {
        Integer num = this.d;
        oqv oqvVar = this.a;
        if (num == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(oqvVar);
            sb.append(LicenseUtility.SEPARATOR);
            Object obj = this.b;
            if (obj == null) {
                obj = "??";
            }
            sb.append(obj);
            sb.append(" (day of week is ");
            Object obj2 = this.c;
            return qv10.r(sb, obj2 != null ? obj2 : "??", ')');
        }
        if (this.b == null && oqvVar.b == null) {
            StringBuilder sb2 = new StringBuilder(Extension.O_BRAKE);
            Object obj3 = oqvVar.a;
            if (obj3 == null) {
                obj3 = "??";
            }
            sb2.append(obj3);
            sb2.append(")-");
            sb2.append(this.d);
            sb2.append(" (day of week is ");
            Object obj4 = this.c;
            return qv10.r(sb2, obj4 != null ? obj4 : "??", ')');
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(oqvVar);
        sb3.append(LicenseUtility.SEPARATOR);
        Object obj5 = this.b;
        if (obj5 == null) {
            obj5 = "??";
        }
        sb3.append(obj5);
        sb3.append(" (day of week is ");
        Object obj6 = this.c;
        sb3.append(obj6 != null ? obj6 : "??");
        sb3.append(", day of year is ");
        return vfc.o(sb3, this.d, ')');
    }

    @Override // defpackage.wqg
    public final void v(Integer num) {
        this.d = num;
    }

    @Override // defpackage.lb61
    public final void w(Integer num) {
        this.a.b = num;
    }

    public jqv() {
        this(0);
    }

    public /* synthetic */ jqv(int i) {
        this(new oqv(null, null), null, null, null);
    }
}
