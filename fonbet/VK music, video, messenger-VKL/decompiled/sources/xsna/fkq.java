package xsna;

import com.vk.log.L;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: FamilyDay2026PtrConfig.kt */
/* loaded from: classes11.dex */
public final class fkq {
    public static final a h = new a();
    public static final fkq i;
    public static final fkq j;
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    /* compiled from: FamilyDay2026PtrConfig.kt */
    public static final class a {
    }

    static {
        fkq fkqVar = new fkq(0, null, true, true, true, true, null);
        i = fkqVar;
        j = fkqVar;
    }

    public fkq(int i2, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    public final boolean a() {
        String str;
        if (this.a <= 0) {
            return false;
        }
        if (!this.d) {
            return true;
        }
        String str2 = this.b;
        if (str2 == null || (str = this.c) == null) {
            return false;
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());
            Date date = new Date();
            Date parse = simpleDateFormat.parse(str2);
            Date parse2 = simpleDateFormat.parse(str);
            if (parse != null && parse2 != null && date.compareTo(parse) >= 0) {
                if (date.compareTo(parse2) <= 0) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            L.j(e, "FamilyDay2026PtrConfig");
            return false;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkq)) {
            return false;
        }
        fkq fkqVar = (fkq) obj;
        return this.a == fkqVar.a && epx.f(this.b, fkqVar.b) && epx.f(this.c, fkqVar.c) && this.d == fkqVar.d && this.e == fkqVar.e && this.f == fkqVar.f && this.g == fkqVar.g;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return Boolean.hashCode(this.g) + qoy.b(qoy.b(qoy.b((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FamilyDay2026PtrConfig(probability=");
        sb.append(this.a);
        sb.append(", startShowingFromDateTime=");
        sb.append(this.b);
        sb.append(", stopShowingFromDateTime=");
        sb.append(this.c);
        sb.append(", showOnlyOnSpecifiedDates=");
        sb.append(this.d);
        sb.append(", withoutAnimation=");
        sb.append(this.e);
        sb.append(", withoutAnimationBehindStatusBar=");
        sb.append(this.f);
        sb.append(", withoutCustomPtr=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
