package xsna;

import com.vk.dto.common.id.UserId;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: InternalApiMethodCall.kt */
/* loaded from: classes17.dex */
public final class vfx<T> implements xy2<T> {
    public final String a;
    public final b03<T> b;
    public final f03<T> c;
    public final HashMap<String, String> d = new HashMap<>();

    public vfx(String str, b03<T> b03Var, f03<T> f03Var) {
        this.a = str;
        this.b = b03Var;
        this.c = f03Var;
    }

    public static /* synthetic */ void k(vfx vfxVar, String str, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i2 = Integer.MIN_VALUE;
        }
        vfxVar.f(i, i2, Integer.MAX_VALUE, str);
    }

    public static void l(vfx vfxVar, String str, UserId userId, int i) {
        long j = (i & 4) != 0 ? Long.MIN_VALUE : 1L;
        if (userId != null) {
            long j2 = userId.b;
            if (j > j2 || j2 > Long.MAX_VALUE) {
                throw new IllegalArgumentException(xy6.a(Long.MAX_VALUE, "..", rqi.d(j, "Param ", str, " not in ")));
            }
            vfxVar.d.put(str, String.valueOf(j2));
        }
    }

    public static void m(vfx vfxVar, String str, String str2, int i, int i2) {
        if ((i2 & 8) != 0) {
            i = Integer.MAX_VALUE;
        }
        if (str2 != null) {
            int length = str2.length();
            if (length >= 0 && length <= i) {
                vfxVar.d.put(str, str2);
            } else {
                StringBuilder b = xy6.b(0, "Param ", str, " not in ", "..");
                b.append(i);
                throw new IllegalArgumentException(b.toString());
            }
        }
    }

    public static void n(vfx vfxVar, List list) {
        m(vfxVar, "co_owner_ids", j5g.g0(list, StringUtils.COMMA, null, null, 0, new x90(25), 30), 0, 12);
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
        return null;
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

    public final void g(long j, long j2, long j3, String str) {
        if (j2 > j || j > j3) {
            throw new IllegalArgumentException(xy6.a(j3, "..", rqi.d(j2, "Param ", str, " not in ")));
        }
        this.d.put(str, String.valueOf(j));
    }

    @Override // xsna.xy2
    public final Map getParamsMap() {
        return this.d;
    }

    public final void h(String str, float f, double d, double d2) {
        double d3 = f;
        if (d <= d3 && d3 <= d2) {
            this.d.put(str, String.valueOf(f));
            return;
        }
        throw new IllegalArgumentException("Param " + str + " not in " + d + ".." + d2);
    }

    public final void i(String str, Iterable<?> iterable) {
        m(this, str, j5g.g0(iterable, StringUtils.COMMA, null, null, 0, null, 62), 0, 12);
    }

    public final void j(String str, boolean z) {
        this.d.put(str, z ? "1" : "0");
    }
}
