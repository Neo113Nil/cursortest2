package xsna;

/* compiled from: VkSkeleton.kt */
/* loaded from: classes17.dex */
public final class fhu0 implements izs<ggj, s3q0> {
    public final /* synthetic */ androidx.compose.ui.graphics.c b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public fhu0(androidx.compose.ui.graphics.c cVar, float f, float f2) {
        this.b = cVar;
        this.c = f;
        this.d = f2;
    }

    @Override // xsna.izs
    public final s3q0 invoke(ggj ggjVar) {
        ggj ggjVar2 = ggjVar;
        androidx.compose.ui.graphics.c cVar = this.b;
        fr9 fr9Var = ggjVar2.a0().a;
        float f = this.c;
        float f2 = this.d;
        fr9Var.d(f, f2, f, f2);
        try {
            androidx.compose.ui.graphics.d.c(ggjVar2, cVar, l5g.b, null, 60);
            s3q0 s3q0Var = s3q0.a;
            fr9 fr9Var2 = ggjVar2.a0().a;
            float f3 = -f;
            float f4 = -f2;
            fr9Var2.d(f3, f4, f3, f4);
            return s3q0.a;
        } catch (Throwable th) {
            fr9 fr9Var3 = ggjVar2.a0().a;
            float f5 = -f;
            float f6 = -f2;
            fr9Var3.d(f5, f6, f5, f6);
            throw th;
        }
    }
}
