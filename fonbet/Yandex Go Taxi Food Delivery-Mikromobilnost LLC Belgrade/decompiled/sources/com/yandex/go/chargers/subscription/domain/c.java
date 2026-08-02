package com.yandex.go.chargers.subscription.domain;

import com.yandex.go.chargers.subscription.data.ChargersSubscriptionApi;
import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionStatusActionDto$PlusHome;
import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionStatusParamsDto;
import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionStatusResponseDto;
import com.yandex.go.chargers.subscription.data.model.q;
import com.yandex.go.chargers.subscription.data.model.t;
import defpackage.cmt;
import defpackage.cva;
import defpackage.cy9;
import defpackage.dva;
import defpackage.eva;
import defpackage.fva;
import defpackage.gva;
import defpackage.h3y;
import defpackage.jl40;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes12.dex */
public final class c {
    public final po21 a;
    public final com.yandex.go.chargers.error.data.a b;
    public final h3y c;

    public c(po21 po21Var, com.yandex.go.chargers.error.data.a aVar, h3y h3yVar) {
        this.a = po21Var;
        this.b = aVar;
        this.c = h3yVar;
    }

    public static gva b(ChargersSubscriptionStatusResponseDto chargersSubscriptionStatusResponseDto) {
        t tVar = chargersSubscriptionStatusResponseDto.a;
        return jl40.l(tVar, q.INSTANCE) ? fva.a : tVar instanceof ChargersSubscriptionStatusActionDto$PlusHome ? new eva(((ChargersSubscriptionStatusActionDto$PlusHome) tVar).a) : dva.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(4:18|19|20|21))(1:23))(3:29|30|(2:32|27))|24|(2:26|27)(3:28|20|21)))|39|6|7|(0)(0)|24|(0)(0)|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0048, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r0.L$0 = null;
        r0.L$1 = null;
        r0.label = 3;
        r8 = r7.b.a(r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
    
        if (r8 != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ChargersGetSubscriptionStatusInteractor$getSubscriptionStatus$1 chargersGetSubscriptionStatusInteractor$getSubscriptionStatus$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        c cVar;
        if (continuationImpl instanceof ChargersGetSubscriptionStatusInteractor$getSubscriptionStatus$1) {
            chargersGetSubscriptionStatusInteractor$getSubscriptionStatus$1 = (ChargersGetSubscriptionStatusInteractor$getSubscriptionStatus$1) continuationImpl;
            int i2 = chargersGetSubscriptionStatusInteractor$getSubscriptionStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersGetSubscriptionStatusInteractor$getSubscriptionStatus$1.label = i2 - Integer.MIN_VALUE;
                obj = chargersGetSubscriptionStatusInteractor$getSubscriptionStatus$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersGetSubscriptionStatusInteractor$getSubscriptionStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    po21 po21Var = this.a;
                    chargersGetSubscriptionStatusInteractor$getSubscriptionStatus$1.label = 1;
                    obj = ((e) po21Var).h(chargersGetSubscriptionStatusInteractor$getSubscriptionStatus$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            cVar = (c) chargersGetSubscriptionStatusInteractor$getSubscriptionStatus$1.L$1;
                            kotlin.b.b(obj);
                            cVar.getClass();
                            return b((ChargersSubscriptionStatusResponseDto) obj);
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return new cva((cy9) obj);
                    }
                    kotlin.b.b(obj);
                }
                cmt<ChargersSubscriptionStatusResponseDto> c = ((ChargersSubscriptionApi) this.c.get()).c(new ChargersSubscriptionStatusParamsDto(((mo21) obj).a()));
                chargersGetSubscriptionStatusInteractor$getSubscriptionStatus$1.L$0 = null;
                chargersGetSubscriptionStatusInteractor$getSubscriptionStatus$1.L$1 = this;
                chargersGetSubscriptionStatusInteractor$getSubscriptionStatus$1.label = 2;
                obj = ru.yandex.taxi.network.api.a.d(c, chargersGetSubscriptionStatusInteractor$getSubscriptionStatus$1);
                if (obj != coroutineSingletons) {
                    return coroutineSingletons;
                }
                cVar = this;
                cVar.getClass();
                return b((ChargersSubscriptionStatusResponseDto) obj);
            }
        }
        chargersGetSubscriptionStatusInteractor$getSubscriptionStatus$1 = new ChargersGetSubscriptionStatusInteractor$getSubscriptionStatus$1(this, continuationImpl);
        obj = chargersGetSubscriptionStatusInteractor$getSubscriptionStatus$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersGetSubscriptionStatusInteractor$getSubscriptionStatus$1.label;
        if (i != 0) {
        }
        cmt<ChargersSubscriptionStatusResponseDto> c2 = ((ChargersSubscriptionApi) this.c.get()).c(new ChargersSubscriptionStatusParamsDto(((mo21) obj).a()));
        chargersGetSubscriptionStatusInteractor$getSubscriptionStatus$1.L$0 = null;
        chargersGetSubscriptionStatusInteractor$getSubscriptionStatus$1.L$1 = this;
        chargersGetSubscriptionStatusInteractor$getSubscriptionStatus$1.label = 2;
        obj = ru.yandex.taxi.network.api.a.d(c2, chargersGetSubscriptionStatusInteractor$getSubscriptionStatus$1);
        if (obj != coroutineSingletons) {
        }
    }
}
