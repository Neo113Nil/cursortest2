package xsna;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Tooltip.kt */
/* loaded from: classes11.dex */
public final class k6p0 implements h6p0 {
    public final ni50 a;
    public final bi50<Boolean> b = new bi50<>(Boolean.FALSE);
    public lq9 c;

    public k6p0(ni50 ni50Var) {
        this.a = ni50Var;
    }

    @Override // xsna.h6p0
    public final void a() {
        lq9 lq9Var = this.c;
        if (lq9Var != null) {
            lq9Var.z(null);
        }
    }

    @Override // xsna.h6p0
    public final Object b(MutatePriority mutatePriority, SuspendLambda suspendLambda) {
        Object b = this.a.b(mutatePriority, new i6p0(this, new j6p0(this, null), mutatePriority, null), suspendLambda);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : s3q0.a;
    }

    @Override // xsna.h6p0
    public final bi50<Boolean> c() {
        return this.b;
    }

    @Override // xsna.h6p0
    public final void dismiss() {
        this.b.w0(Boolean.FALSE);
    }

    @Override // xsna.h6p0
    public final boolean isVisible() {
        bi50<Boolean> bi50Var = this.b;
        return ((Boolean) ((zak0) bi50Var.d).getValue()).booleanValue() || ((Boolean) ((zak0) bi50Var.e).getValue()).booleanValue();
    }
}
