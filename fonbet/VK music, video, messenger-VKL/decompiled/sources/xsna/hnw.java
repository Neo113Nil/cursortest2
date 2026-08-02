package xsna;

import android.graphics.PointF;

/* compiled from: ImageViewerPage.kt */
/* loaded from: classes3.dex */
public final class hnw implements i64 {
    public final /* synthetic */ PointF b;
    public final /* synthetic */ fnw c;

    public hnw(PointF pointF, fnw fnwVar) {
        this.b = pointF;
        this.c = fnwVar;
    }

    @Override // xsna.i64
    public final void a() {
        fnw fnwVar = this.c;
        fnwVar.getCallback().b(fnwVar.getPosition());
    }

    @Override // xsna.i64
    public final void b(float f, float f2) {
        PointF pointF = this.b;
        pointF.set(f, f2);
        this.c.getCallback().f(pointF);
    }

    @Override // xsna.i64
    public final void c(float f, float f2) {
        PointF pointF = this.b;
        pointF.set(f, f2);
        this.c.getCallback().a(pointF);
    }
}
