package xsna;

import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: DefaultTextContextMenuDropdownProvider.android.kt */
/* loaded from: classes11.dex */
public final class ng00 implements fxb0 {
    public final xe8 b;
    public q9x c;
    public LayoutDirection d;
    public q9x e;
    public h9x f;

    public ng00(xe8 xe8Var) {
        this.b = xe8Var;
    }

    @Override // xsna.fxb0
    public final long b(l9x l9xVar, long j, LayoutDirection layoutDirection, long j2) {
        h9x h9xVar = this.f;
        if (h9xVar != null) {
            q9x q9xVar = this.c;
            if ((q9xVar == null ? false : q9x.b(q9xVar.a, j)) && this.d == layoutDirection) {
                q9x q9xVar2 = this.e;
                if (q9xVar2 != null ? q9x.b(q9xVar2.a, j2) : false) {
                    return h9xVar.a;
                }
            }
        }
        long b = this.b.b(l9xVar, j, layoutDirection, j2);
        this.c = new q9x(j);
        this.d = layoutDirection;
        this.e = new q9x(j2);
        this.f = new h9x(b);
        return b;
    }
}
