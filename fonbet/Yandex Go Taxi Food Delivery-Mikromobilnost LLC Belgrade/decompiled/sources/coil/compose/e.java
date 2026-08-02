package coil.compose;

import defpackage.jdi0;
import defpackage.jh91;
import defpackage.lkj;
import defpackage.n8e;
import defpackage.nkj;
import defpackage.ny61;
import defpackage.sx21;
import defpackage.vpr;
import defpackage.wis0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;

    public e(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1 constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1) {
            constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1 = (ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1.label;
                wis0 wis0Var = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    long j = ((n8e) obj).a;
                    jdi0 jdi0Var = sx21.b;
                    int i3 = (int) (3 & j);
                    int i4 = (((i3 & 2) >> 1) * 3) + ((i3 & 1) << 1);
                    if (!(((((int) (j >> 33)) & ((1 << (i4 + 13)) - 1)) - 1 == 0) | ((((1 << (18 - i4)) - 1) & ((int) (j >> (i4 + 46)))) - 1 == 0))) {
                        boolean e = n8e.e(j);
                        jh91 jh91Var = nkj.a;
                        jh91 lkjVar = e ? new lkj(n8e.i(j)) : jh91Var;
                        if (n8e.d(j)) {
                            jh91Var = new lkj(n8e.h(j));
                        }
                        wis0Var = new wis0(lkjVar, jh91Var);
                    }
                    if (wis0Var != null) {
                        constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(wis0Var, constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1 = new ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1.label;
        wis0 wis0Var2 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
