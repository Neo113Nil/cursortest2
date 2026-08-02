package com.yandex.go.taxi.order.state;

import defpackage.j780;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class g implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.n a;
    public final /* synthetic */ j780 b;

    public g(kotlinx.coroutines.flow.n nVar, j780 j780Var) {
        this.a = nVar;
        this.b = j780Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MakeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$1 makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof MakeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$1) {
            makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$1 = (MakeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$1) continuation;
            int i2 = makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f fVar = new f(vprVar, this.b);
                    makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$1.L$0 = null;
                    makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$1.L$1 = null;
                    makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$1.L$2 = null;
                    makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(fVar, makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$1 = new MakeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
