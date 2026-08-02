package defpackage;

import androidx.compose.animation.core.c;
import androidx.compose.runtime.f;

/* loaded from: classes10.dex */
public final class osv implements m3u0 {
    public boolean A;
    public long B;
    public final /* synthetic */ c C;
    public Number a;
    public Number b;
    public final gl11 c;
    public final oz40 w;
    public jj2 x;
    public lax0 y;
    public boolean z;

    public osv(c cVar, Number number, Number number2, gl11 gl11Var, nsv nsvVar) {
        this.C = cVar;
        this.a = number;
        this.b = number2;
        this.c = gl11Var;
        this.w = f.j(number);
        this.x = nsvVar;
        this.y = new lax0(nsvVar, gl11Var, this.a, this.b, null);
    }

    @Override // defpackage.m3u0
    public final Object getValue() {
        return this.w.getValue();
    }
}
