package defpackage;

import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class cyu {
    public final r0 a;
    public final gci0 b;

    public cyu() {
        r0 c = bvf0.c(new i5r("", false));
        this.a = c;
        this.b = e.d(c);
    }

    public final boolean a(String str, boolean z) {
        r0 r0Var = this.a;
        if (jl40.l(str, ((i5r) r0Var.getValue()).a)) {
            return false;
        }
        i5r i5rVar = new i5r(str, z);
        r0Var.getClass();
        r0Var.m(null, i5rVar);
        return true;
    }
}
