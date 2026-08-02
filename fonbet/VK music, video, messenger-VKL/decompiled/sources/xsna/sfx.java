package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: InternalApiMethodCall.kt */
/* loaded from: classes17.dex */
public final class sfx<T> implements xy2<T> {
    public final String a;
    public final b03<T> b;
    public final f03<T> c;
    public final HashMap<String, String> d = new HashMap<>();

    public sfx(String str, b03<T> b03Var, f03<T> f03Var) {
        this.a = str;
        this.b = b03Var;
        this.c = f03Var;
    }

    public static void g(sfx sfxVar, String str, String str2) {
        if (str2 != null) {
            int length = str2.length();
            if (length >= 0 && length <= Integer.MAX_VALUE) {
                sfxVar.d.put(str, str2);
            } else {
                StringBuilder b = xy6.b(0, "Param ", str, " not in ", "..");
                b.append(Integer.MAX_VALUE);
                throw new IllegalArgumentException(b.toString());
            }
        }
    }

    public static void h(sfx sfxVar, String str, List list) {
        g(sfxVar, str, j5g.g0(list, StringUtils.COMMA, null, null, 0, new hba(str, 2), 30));
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

    public final void f(String str, Iterable<?> iterable) {
        g(this, str, j5g.g0(iterable, StringUtils.COMMA, null, null, 0, null, 62));
    }

    @Override // xsna.xy2
    public final Map getParamsMap() {
        return this.d;
    }
}
