package xsna;

import androidx.compose.foundation.gestures.Orientation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.puy;

/* compiled from: LazySemantics.kt */
/* loaded from: classes11.dex */
public final class lwy implements luy {
    public final /* synthetic */ dsy a;

    public lwy(dsy dsyVar) {
        this.a = dsyVar;
    }

    @Override // xsna.luy
    public final int a() {
        dsy dsyVar = this.a;
        return dsyVar.i().c() + dsyVar.i().b();
    }

    @Override // xsna.luy
    public final float b() {
        dsy dsyVar = this.a;
        int g = dsyVar.g();
        int h = dsyVar.h();
        return dsyVar.c() ? (g * 500) + h + 100 : (g * 500) + h;
    }

    @Override // xsna.luy
    public final q4g c() {
        return new q4g(-1, -1);
    }

    @Override // xsna.luy
    public final int d() {
        dsy dsyVar = this.a;
        return (int) (dsyVar.i().getOrientation() == Orientation.Vertical ? dsyVar.i().a() & 4294967295L : dsyVar.i().a() >> 32);
    }

    @Override // xsna.luy
    public final float e() {
        dsy dsyVar = this.a;
        return (dsyVar.g() * 500) + dsyVar.h();
    }

    @Override // xsna.luy
    public final Object f(int i, puy.a aVar) {
        Object j = dsy.j(this.a, i, aVar);
        return j == CoroutineSingletons.COROUTINE_SUSPENDED ? j : s3q0.a;
    }
}
