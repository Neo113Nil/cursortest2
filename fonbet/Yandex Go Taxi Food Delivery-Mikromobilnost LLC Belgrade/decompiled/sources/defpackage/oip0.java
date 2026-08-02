package defpackage;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.c;
import androidx.compose.foundation.gestures.h;
import androidx.compose.runtime.f;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes10.dex */
public final class oip0 implements wkp0 {
    public static final tig0 j = new tig0(new arm0(16), new tyo0(8));
    public final yx40 a;
    public float f;
    public final yx40 b = f.g(0);
    public final yx40 c = f.g(0);
    public final ay40 d = new ay40();
    public final yx40 e = f.g(Integer.MAX_VALUE);
    public final h g = new h(new uyo0(7, this));
    public final qxi h = f.d(new is6(this, 7));
    public final qxi i = f.d(new is6(this, 8));

    public oip0(int i) {
        this.a = f.g(i);
    }

    public static Object f(oip0 oip0Var, int i, SuspendLambda suspendLambda) {
        Object g = c.g(oip0Var, i - oip0Var.a.getIntValue(), new twt0(7, null), suspendLambda);
        return g == CoroutineSingletons.COROUTINE_SUSPENDED ? g : zy11.a;
    }

    @Override // defpackage.wkp0
    public final boolean a() {
        return this.g.a();
    }

    @Override // defpackage.wkp0
    public final boolean b() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // defpackage.wkp0
    public final float c(float f) {
        return this.g.c(f);
    }

    @Override // defpackage.wkp0
    public final Object d(MutatePriority mutatePriority, wls wlsVar, Continuation continuation) {
        Object d = this.g.d(mutatePriority, wlsVar, continuation);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : zy11.a;
    }

    @Override // defpackage.wkp0
    public final boolean e() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }
}
