package xsna;

import com.vk.dto.common.id.UserId;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: InternalApiMethodCall.kt */
/* loaded from: classes2.dex */
public final class tfx<T> implements xy2<T> {
    public final String a;
    public final b03<T> b;
    public final f03<T> c;
    public final HashMap<String, String> d = new HashMap<>();
    public String e;

    public tfx(String str, b03<T> b03Var, f03<T> f03Var) {
        this.a = str;
        this.b = b03Var;
        this.c = f03Var;
    }

    public static /* synthetic */ void l(tfx tfxVar, String str, int i, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = Integer.MIN_VALUE;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        tfxVar.f(i, i2, i3, str);
    }

    public static void m(tfx tfxVar, String str, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = Long.MIN_VALUE;
        }
        if (j2 > j || j > Long.MAX_VALUE) {
            throw new IllegalArgumentException(xy6.a(Long.MAX_VALUE, "..", rqi.d(j2, "Param ", str, " not in ")));
        }
        tfxVar.d.put(str, String.valueOf(j));
    }

    public static void n(tfx tfxVar, String str, UserId userId, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j = Long.MIN_VALUE;
        }
        if ((i & 8) != 0) {
            j2 = Long.MAX_VALUE;
        }
        if (userId != null) {
            long j3 = userId.b;
            if (j > j3 || j3 > j2) {
                throw new IllegalArgumentException(xy6.a(j2, "..", rqi.d(j, "Param ", str, " not in ")));
            }
            tfxVar.d.put(str, String.valueOf(j3));
        }
    }

    public static /* synthetic */ void o(tfx tfxVar, String str, String str2, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        tfxVar.g(i, i2, str, str2);
    }

    public static void p(tfx tfxVar, String str, List list, long j, int i) {
        if ((i & 4) != 0) {
            j = Long.MIN_VALUE;
        }
        o(tfxVar, str, j5g.g0(list, StringUtils.COMMA, null, null, 0, new qfx(j, str, 0), 30), 0, 0, 12);
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

    public final void h(String str, float f, double d, double d2) {
        double d3 = f;
        if (d <= d3 && d3 <= d2) {
            this.d.put(str, String.valueOf(f));
            return;
        }
        throw new IllegalArgumentException("Param " + str + " not in " + d + ".." + d2);
    }

    public final void i(String str, Iterable<?> iterable) {
        o(this, str, j5g.g0(iterable, StringUtils.COMMA, null, null, 0, null, 62), 0, 0, 12);
    }

    public final void j(String str, boolean z) {
        this.d.put(str, z ? "1" : "0");
    }
}
