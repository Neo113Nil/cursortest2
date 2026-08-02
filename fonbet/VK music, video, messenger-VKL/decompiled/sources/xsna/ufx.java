package xsna;

import com.vk.dto.common.id.UserId;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: InternalApiMethodCall.kt */
/* loaded from: classes11.dex */
public final class ufx<T> implements xy2<T> {
    public final String a;
    public final b03<T> b;
    public final f03<T> c;
    public final HashMap<String, String> d = new HashMap<>();
    public String e;

    public ufx(String str, b03<T> b03Var, f03<T> f03Var) {
        this.a = str;
        this.b = b03Var;
        this.c = f03Var;
    }

    public static void j(ufx ufxVar, String str, float f) {
        double d = f;
        if (-1.7976931348623157E308d <= d && d <= Double.MAX_VALUE) {
            ufxVar.d.put(str, String.valueOf(f));
            return;
        }
        throw new IllegalArgumentException("Param " + str + " not in -1.7976931348623157E308..1.7976931348623157E308");
    }

    public static /* synthetic */ void k(ufx ufxVar, String str, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i2 = Integer.MIN_VALUE;
        }
        ufxVar.f(i, i2, Integer.MAX_VALUE, str);
    }

    public static void l(ufx ufxVar, String str, long j, int i) {
        long j2 = (i & 4) != 0 ? Long.MIN_VALUE : 0L;
        if (j2 > j || j > Long.MAX_VALUE) {
            throw new IllegalArgumentException(xy6.a(Long.MAX_VALUE, "..", rqi.d(j2, "Param ", str, " not in ")));
        }
        ufxVar.d.put(str, String.valueOf(j));
    }

    public static void m(ufx ufxVar, String str, UserId userId, long j, int i) {
        if ((i & 4) != 0) {
            j = Long.MIN_VALUE;
        }
        if (userId != null) {
            long j2 = userId.b;
            if (j > j2 || j2 > Long.MAX_VALUE) {
                throw new IllegalArgumentException(xy6.a(Long.MAX_VALUE, "..", rqi.d(j, "Param ", str, " not in ")));
            }
            ufxVar.d.put(str, String.valueOf(j2));
        }
    }

    public static /* synthetic */ void n(ufx ufxVar, String str, String str2, int i, int i2) {
        if ((i2 & 8) != 0) {
            i = Integer.MAX_VALUE;
        }
        ufxVar.g(0, i, str, str2);
    }

    public static void o(ufx ufxVar, String str, List list, int i) {
        n(ufxVar, str, j5g.g0(list, StringUtils.COMMA, null, null, 0, new rfx((i & 4) != 0 ? Long.MIN_VALUE : 1L, str), 30), 0, 12);
    }

    @Override // xsna.xy2
    public final b03<T> a() {
        return this.b;
    }

    @Override // xsna.xy2
    public final String b() {
        return this.a;
    }

    @Override // xsna.xy2
    public final String c() {
        return this.e;
    }

    @Override // xsna.xy2
    public final String d() {
        return "5.285";
    }

    @Override // xsna.xy2
    public final f03<T> e() {
        return this.c;
    }

    public final void f(int i, int i2, int i3, String str) {
        if (i2 <= i && i <= i3) {
            this.d.put(str, String.valueOf(i));
        } else {
            StringBuilder b = xy6.b(i2, "Param ", str, " not in ", "..");
            b.append(i3);
            throw new IllegalArgumentException(b.toString());
        }
    }

    public final void g(int i, int i2, String str, String str2) {
        if (str2 != null) {
            int length = str2.length();
            if (i <= length && length <= i2) {
                this.d.put(str, str2);
            } else {
                StringBuilder b = xy6.b(i, "Param ", str, " not in ", "..");
                b.append(i2);
                throw new IllegalArgumentException(b.toString());
            }
        }
    }

    @Override // xsna.xy2
    public final Map getParamsMap() {
        return this.d;
    }

    public final void h(String str, Iterable<?> iterable) {
        n(this, str, j5g.g0(iterable, StringUtils.COMMA, null, null, 0, null, 62), 0, 12);
    }

    public final void i(String str, boolean z) {
        this.d.put(str, z ? "1" : "0");
    }
}
