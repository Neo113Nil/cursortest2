package xsna;

import androidx.compose.foundation.gestures.Orientation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.puy;

/* compiled from: LazyLayoutSemanticState.kt */
/* loaded from: classes11.dex */
public final class nuy implements luy {
    public final f1m a;
    public final /* synthetic */ xvy b;
    public final /* synthetic */ boolean c;

    public nuy(xvy xvyVar, boolean z) {
        this.b = xvyVar;
        this.c = z;
        this.a = bbk0.b(new w4u(xvyVar, 6));
    }

    @Override // xsna.luy
    public final int a() {
        xvy xvyVar = this.b;
        return xvyVar.j().c() + xvyVar.j().b();
    }

    @Override // xsna.luy
    public final float b() {
        xvy xvyVar = this.b;
        int h = xvyVar.h();
        int i = xvyVar.i();
        return xvyVar.c() ? (h * 500) + i + 100 : (h * 500) + i;
    }

    @Override // xsna.luy
    public final q4g c() {
        boolean z = this.c;
        f1m f1mVar = this.a;
        return z ? new q4g(((Number) f1mVar.getValue()).intValue(), 1) : new q4g(1, ((Number) f1mVar.getValue()).intValue());
    }

    @Override // xsna.luy
    public final int d() {
        xvy xvyVar = this.b;
        return (int) (xvyVar.j().getOrientation() == Orientation.Vertical ? xvyVar.j().a() & 4294967295L : xvyVar.j().a() >> 32);
    }

    @Override // xsna.luy
    public final float e() {
        xvy xvyVar = this.b;
        return (xvyVar.h() * 500) + xvyVar.i();
    }

    @Override // xsna.luy
    public final Object f(int i, puy.a aVar) {
        fh9 fh9Var = xvy.y;
        Object k = this.b.k(i, 0, aVar);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
    }
}
