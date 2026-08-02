package yads;

import android.content.Context;
import java.util.Map;
import kotlin.Pair;
import xsna.pn00;

/* loaded from: classes10.dex */
public enum t9 {
    d,
    e,
    f;

    public static final s9 b;
    public static final Map c;

    static {
        t9 t9Var = d;
        t9 t9Var2 = e;
        t9 t9Var3 = f;
        b = new s9();
        c = pn00.m(new Pair(s9.a("values_dimen_%s", t9Var.name()), 48), new Pair(s9.a("values_dimen_%s_sw600dp", t9Var.name()), 56), new Pair(s9.a("values_dimen_%s", t9Var2.name()), 15), new Pair(s9.a("values_dimen_%s_sw600dp", t9Var2.name()), 17), new Pair(s9.a("values_dimen_%s", t9Var3.name()), 19), new Pair(s9.a("values_dimen_%s_sw600dp", t9Var3.name()), 23));
    }

    t9() {
    }

    public final int a(Context context) {
        try {
            s9 s9Var = b;
            StringBuilder sb = new StringBuilder(name());
            int d2 = om3.d(context);
            int b2 = om3.b(context);
            if (d2 > b2) {
                d2 = b2;
            }
            if (d2 >= 600) {
                sb.append("_sw600dp");
            }
            String sb2 = sb.toString();
            s9Var.getClass();
            Integer num = (Integer) c.get(s9.a("values_dimen_%s", sb2));
            if (num != null) {
                return num.intValue();
            }
        } catch (Exception unused) {
        }
        try {
            s9 s9Var2 = b;
            String name = name();
            s9Var2.getClass();
            Integer num2 = (Integer) c.get(s9.a("values_dimen_%s", name));
            if (num2 != null) {
                return num2.intValue();
            }
            return 0;
        } catch (Exception unused2) {
            return 0;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return name();
    }
}
