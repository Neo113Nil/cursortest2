package com.yandex.plus.home.graphql.plusstate;

import defpackage.cvw;
import defpackage.gyy;
import defpackage.hyy;
import defpackage.ike;
import defpackage.jyy;
import defpackage.kyy;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.s8x;
import defpackage.tje;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wyj;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PlusStateRepositoryImpl$getPlusStateFlow$$inlined$map$1$2$1 plusStateRepositoryImpl$getPlusStateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof PlusStateRepositoryImpl$getPlusStateFlow$$inlined$map$1$2$1) {
            plusStateRepositoryImpl$getPlusStateFlow$$inlined$map$1$2$1 = (PlusStateRepositoryImpl$getPlusStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = plusStateRepositoryImpl$getPlusStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusStateRepositoryImpl$getPlusStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = plusStateRepositoryImpl$getPlusStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusStateRepositoryImpl$getPlusStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    kyy kyyVar = (kyy) obj;
                    if (kyyVar == null) {
                        c cVar = this.b;
                        r0 r0Var = cVar.i;
                        r0Var.getClass();
                        hyy hyyVar = hyy.a;
                        r0Var.m(null, hyyVar);
                        ike ikeVar = cVar.f;
                        s8x s8xVar = cVar.j;
                        ((wyj) cVar.e).getClass();
                        mdh mdhVar = wyj.e;
                        s8xVar.getClass();
                        tje.N(ikeVar, cvw.U(s8xVar, mdhVar), null, new PlusStateRepositoryImpl$getPlusStateFlow$1$1(cVar, null), 2);
                        kyyVar = hyyVar;
                    } else if (!(kyyVar instanceof hyy) && !(kyyVar instanceof gyy) && !(kyyVar instanceof jyy)) {
                        w511.b();
                        return null;
                    }
                    plusStateRepositoryImpl$getPlusStateFlow$$inlined$map$1$2$1.L$0 = null;
                    plusStateRepositoryImpl$getPlusStateFlow$$inlined$map$1$2$1.L$1 = null;
                    plusStateRepositoryImpl$getPlusStateFlow$$inlined$map$1$2$1.L$2 = null;
                    plusStateRepositoryImpl$getPlusStateFlow$$inlined$map$1$2$1.L$3 = null;
                    plusStateRepositoryImpl$getPlusStateFlow$$inlined$map$1$2$1.I$0 = 0;
                    plusStateRepositoryImpl$getPlusStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(kyyVar, plusStateRepositoryImpl$getPlusStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        plusStateRepositoryImpl$getPlusStateFlow$$inlined$map$1$2$1 = new PlusStateRepositoryImpl$getPlusStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = plusStateRepositoryImpl$getPlusStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusStateRepositoryImpl$getPlusStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
