package androidx.compose.animation.core;

import defpackage.bvf0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zx01;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", l = {1222}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
final class Transition$animateTo$1$1$1 extends SuspendLambda implements wls {
    float F$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ zx01 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transition$animateTo$1$1$1(zx01 zx01Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = zx01Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Transition$animateTo$1$1$1 transition$animateTo$1$1$1 = new Transition$animateTo$1$1$1(this.this$0, continuation);
        transition$animateTo$1$1$1.L$0 = obj;
        return transition$animateTo$1$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((Transition$animateTo$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final float h;
        tse tseVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tse tseVar2 = (tse) this.L$0;
            h = e.h(tseVar2.getCoroutineContext());
            tseVar = tseVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h = this.F$0;
            tseVar = (tse) this.L$0;
            kotlin.b.b(obj);
        }
        while (bvf0.D(tseVar)) {
            final zx01 zx01Var = this.this$0;
            tls tlsVar = new tls() { // from class: ux01
                @Override // defpackage.tls
                public final Object invoke(Object obj2) {
                    long longValue = ((Long) obj2).longValue();
                    zx01 zx01Var2 = zx01.this;
                    boolean g = zx01Var2.g();
                    iy40 iy40Var = zx01Var2.g;
                    if (!g) {
                        if (iy40Var.getLongValue() == Long.MIN_VALUE) {
                            iy40Var.setLongValue(longValue);
                            zx01Var2.a.a.setValue(Boolean.TRUE);
                        }
                        long longValue2 = longValue - iy40Var.getLongValue();
                        float f = h;
                        if (f != 0.0f) {
                            longValue2 = m810.c(longValue2 / f);
                        }
                        if (zx01Var2.b == null) {
                            zx01Var2.f.setLongValue(longValue2);
                        }
                        zx01Var2.h(longValue2, f == 0.0f);
                    }
                    return zy11.a;
                }
            };
            this.L$0 = tseVar;
            this.F$0 = h;
            this.label = 1;
            if (jl40.z(get_context()).v(tlsVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11.a;
    }
}
