package defpackage;

import androidx.compose.ui.graphics.colorspace.a;

/* loaded from: classes.dex */
public final /* synthetic */ class a3k0 implements r5m {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ a3k0(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.r5m
    public final double a(double d) {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                return y6i0.b(aVar.k.a(d), aVar.e, aVar.f);
            default:
                return aVar.n.a(y6i0.b(d, aVar.e, aVar.f));
        }
    }
}
