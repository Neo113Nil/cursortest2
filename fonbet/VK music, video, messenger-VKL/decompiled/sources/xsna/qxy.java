package xsna;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.puy;

/* compiled from: LazyStaggeredGridSemantics.kt */
/* loaded from: classes11.dex */
public final class qxy implements luy {
    public final /* synthetic */ uxy a;

    public qxy(uxy uxyVar) {
        this.a = uxyVar;
    }

    @Override // xsna.luy
    public final int a() {
        uxy uxyVar = this.a;
        return uxyVar.g().c() + uxyVar.g().b();
    }

    @Override // xsna.luy
    public final float b() {
        uxy uxyVar = this.a;
        int intValue = ((wak0) uxyVar.c.c).getIntValue();
        int intValue2 = ((wak0) uxyVar.c.e).getIntValue();
        return uxyVar.c() ? (intValue * 500) + intValue2 + 100 : (intValue * 500) + intValue2;
    }

    @Override // xsna.luy
    public final q4g c() {
        return new q4g(-1, -1);
    }

    @Override // xsna.luy
    public final int d() {
        uxy uxyVar = this.a;
        return (int) (uxyVar.g().getOrientation() == Orientation.Vertical ? uxyVar.g().a() & 4294967295L : uxyVar.g().a() >> 32);
    }

    @Override // xsna.luy
    public final float e() {
        uxy uxyVar = this.a;
        return (((wak0) uxyVar.c.c).getIntValue() * 500) + ((wak0) uxyVar.c.e).getIntValue();
    }

    @Override // xsna.luy
    public final Object f(int i, puy.a aVar) {
        fh9 fh9Var = uxy.x;
        uxy uxyVar = this.a;
        uxyVar.getClass();
        Object b = uxyVar.b(MutatePriority.Default, new wxy(uxyVar, i, 0, null), aVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (b != coroutineSingletons) {
            b = s3q0.a;
        }
        return b == coroutineSingletons ? b : s3q0.a;
    }
}
