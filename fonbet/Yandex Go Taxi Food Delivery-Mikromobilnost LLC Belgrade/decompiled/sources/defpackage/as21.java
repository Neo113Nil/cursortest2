package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;

/* loaded from: classes10.dex */
public final class as21 {
    public final wnt a;
    public final cne0 b;
    public final String c;

    public as21(b03 b03Var, wnt wntVar, dne0 dne0Var) {
        this.a = wntVar;
        this.b = dne0Var.b();
        this.c = b64.j(b03Var.getApplicationId(), ".utils.PreferenceUtils.");
    }

    public static int b(as21 as21Var, String str) {
        return as21Var.b.i(as21Var.c + str, 0);
    }

    public final boolean a(String str, boolean z) {
        return this.b.g(this.c + str, z);
    }

    public final String c(String str) {
        return this.b.l(this.c + str, null);
    }

    public final Object d(String str, KSerializer kSerializer) {
        String l = this.b.l(str, null);
        if (l == null) {
            return null;
        }
        try {
            return ((xnt) this.a).c(l, kSerializer);
        } catch (SerializationException unused) {
            return null;
        }
    }

    public final void e(String str, boolean z) {
        this.b.u(this.c + str, z);
    }

    public final void f(int i, String str) {
        this.b.p(i, this.c + str);
    }

    public final void g(String str, String str2) {
        this.b.r(this.c + str, str2);
    }

    public final void h(String str, KSerializer kSerializer, Object obj) {
        this.b.r(str, obj != null ? ((xnt) this.a).e(obj, kSerializer) : null);
    }
}
