package defpackage;

import com.yandex.quark.js.implementation.common.a;

/* loaded from: classes7.dex */
public abstract class nea1 {
    public static final Object a = new Object();

    public static void a(String str, boolean z) {
        if (z) {
            return;
        }
        dy31.g(null, str);
    }

    public static final void b(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final String c(a aVar) {
        kig0 kig0Var = (kig0) aVar.a.a.getValue();
        if (!(kig0Var instanceof hig0) && !jl40.l(kig0Var, gig0.a)) {
            if (kig0Var instanceof iig0) {
                return ((iig0) kig0Var).a;
            }
            w511.b();
        }
        return null;
    }
}
