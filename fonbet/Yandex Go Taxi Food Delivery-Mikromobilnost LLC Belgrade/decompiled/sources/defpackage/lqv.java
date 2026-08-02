package defpackage;

import com.ybsdk.widgets.common.MoneyInputEditView;
import java.time.DateTimeException;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.LocalTime;
import kotlinx.datetime.format.AmPmMarker;

/* loaded from: classes9.dex */
public final class lqv implements g6z0, fpe {
    public Integer a;
    public Integer b;
    public AmPmMarker c;
    public Integer d;
    public Integer e;
    public Integer f;

    public lqv(Integer num, Integer num2, AmPmMarker amPmMarker, Integer num3, Integer num4, Integer num5) {
        this.a = num;
        this.b = num2;
        this.c = amPmMarker;
        this.d = num3;
        this.e = num4;
        this.f = num5;
    }

    @Override // defpackage.g6z0
    public final void E(Integer num) {
        this.a = num;
    }

    @Override // defpackage.fpe
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lqv copy() {
        return new lqv(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LocalTime b() {
        Integer num;
        int intValue;
        int intValue2;
        Integer num2 = this.a;
        Integer num3 = this.b;
        if (num2 != null) {
            intValue = num2.intValue();
            if (num3 != null && ((intValue + 11) % 12) + 1 != (intValue2 = num3.intValue())) {
                w511.f(oyr.h(intValue, intValue2, "Inconsistent hour and hour-of-am-pm: hour is ", ", but hour-of-am-pm is "));
                return null;
            }
            AmPmMarker amPmMarker = this.c;
            if (amPmMarker != null) {
                if ((amPmMarker == AmPmMarker.PM) != (intValue >= 12)) {
                    vg10.c(intValue, ", but the AM/PM marker is ", amPmMarker, "Inconsistent hour and the AM/PM marker: hour is ");
                    return null;
                }
            }
        } else {
            if (num3 != null) {
                int intValue3 = num3.intValue();
                AmPmMarker amPmMarker2 = this.c;
                if (amPmMarker2 != null) {
                    if (intValue3 == 12) {
                        intValue3 = 0;
                    }
                    num = Integer.valueOf(intValue3 + (amPmMarker2 != AmPmMarker.PM ? 0 : 12));
                    if (num != null) {
                        throw new DateTimeFormatException("Incomplete time: missing hour");
                    }
                    intValue = num.intValue();
                }
            }
            num = null;
            if (num != null) {
            }
        }
        Integer num4 = this.d;
        pb61.a(num4, "minute");
        int intValue4 = num4.intValue();
        Integer num5 = this.e;
        int intValue5 = num5 != null ? num5.intValue() : 0;
        Integer num6 = this.f;
        try {
            return new LocalTime(java.time.LocalTime.of(intValue, intValue4, intValue5, num6 != null ? num6.intValue() : 0));
        } catch (DateTimeException e) {
            yci0.r(e);
            return null;
        }
    }

    @Override // defpackage.g6z0
    public final Integer c() {
        return this.f;
    }

    @Override // defpackage.g6z0
    public final Integer d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lqv)) {
            return false;
        }
        lqv lqvVar = (lqv) obj;
        return jl40.l(this.a, lqvVar.a) && jl40.l(this.b, lqvVar.b) && this.c == lqvVar.c && jl40.l(this.d, lqvVar.d) && jl40.l(this.e, lqvVar.e) && jl40.l(this.f, lqvVar.f);
    }

    @Override // defpackage.g6z0
    public final void f(Integer num) {
        this.e = num;
    }

    @Override // defpackage.g6z0
    public final AmPmMarker h() {
        return this.c;
    }

    public final int hashCode() {
        Integer num = this.a;
        int intValue = (num != null ? num.intValue() : 0) * 31;
        Integer num2 = this.b;
        int intValue2 = ((num2 != null ? num2.intValue() : 0) * 31) + intValue;
        AmPmMarker amPmMarker = this.c;
        int hashCode = ((amPmMarker != null ? amPmMarker.hashCode() : 0) * 31) + intValue2;
        Integer num3 = this.d;
        int intValue3 = ((num3 != null ? num3.intValue() : 0) * 31) + hashCode;
        Integer num4 = this.e;
        int intValue4 = ((num4 != null ? num4.intValue() : 0) * 31) + intValue3;
        Integer num5 = this.f;
        return intValue4 + (num5 != null ? num5.intValue() : 0);
    }

    @Override // defpackage.g6z0
    public final void j(Integer num) {
        this.b = num;
    }

    @Override // defpackage.g6z0
    public final void k(Integer num) {
        this.f = num;
    }

    @Override // defpackage.g6z0
    public final Integer o() {
        return this.a;
    }

    @Override // defpackage.g6z0
    public final void p(AmPmMarker amPmMarker) {
        this.c = amPmMarker;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r4 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        Object obj = this.a;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append(':');
        Object obj2 = this.d;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb.append(obj2);
        sb.append(':');
        Integer num = this.e;
        sb.append(num != null ? num : "??");
        sb.append('.');
        Integer num2 = this.f;
        if (num2 != null) {
            String valueOf = String.valueOf(num2.intValue());
            str = evu0.N(MoneyInputEditView.DEFAULT_VALUE, 9 - valueOf.length(), valueOf);
        }
        str = "???";
        sb.append(str);
        return sb.toString();
    }

    @Override // defpackage.g6z0
    public final Integer u() {
        return this.e;
    }

    @Override // defpackage.g6z0
    public final Integer x() {
        return this.d;
    }

    @Override // defpackage.g6z0
    public final void y(Integer num) {
        this.d = num;
    }

    public /* synthetic */ lqv(int i) {
        this(null, null, null, null, null, null);
    }

    public lqv() {
        this(0);
    }
}
