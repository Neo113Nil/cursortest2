package defpackage;

import androidx.compose.ui.graphics.layer.a;

/* loaded from: classes10.dex */
public final class kbp0 implements l0u {
    public xy40 a;

    @Override // defpackage.l0u
    public final a a() {
        ixv.b("GraphicsContext not provided");
        throw null;
    }

    @Override // defpackage.l0u
    public final void b(a aVar) {
    }

    public final void c() {
        xy40 xy40Var = this.a;
        if (xy40Var != null) {
            Object[] objArr = xy40Var.a;
            int i = xy40Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                b((a) objArr[i2]);
            }
            xy40Var.j();
        }
    }
}
