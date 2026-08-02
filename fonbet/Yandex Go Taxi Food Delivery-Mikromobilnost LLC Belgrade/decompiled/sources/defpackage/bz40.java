package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes12.dex */
public final class bz40 implements j690 {
    public final p651 b;
    public final fwi c;
    public final yx40 d = f.g(0);
    public final yx40 e = f.g(0);

    public bz40(a050 a050Var, fwi fwiVar) {
        this.b = a050Var;
        this.c = fwiVar;
    }

    @Override // defpackage.j690
    public final float a() {
        return this.c.H(this.e.getIntValue());
    }

    @Override // defpackage.j690
    public final float b(LayoutDirection layoutDirection) {
        p651 p651Var = this.b;
        fwi fwiVar = this.c;
        return fwiVar.H(p651Var.d(fwiVar, layoutDirection));
    }

    @Override // defpackage.j690
    public final float c(LayoutDirection layoutDirection) {
        p651 p651Var = this.b;
        fwi fwiVar = this.c;
        return fwiVar.H(p651Var.b(fwiVar, layoutDirection));
    }

    @Override // defpackage.j690
    public final float d() {
        return this.c.H(this.d.getIntValue());
    }
}
