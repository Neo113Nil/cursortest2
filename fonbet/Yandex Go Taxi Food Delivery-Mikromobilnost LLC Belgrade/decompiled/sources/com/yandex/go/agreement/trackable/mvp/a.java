package com.yandex.go.agreement.trackable.mvp;

import defpackage.cd;
import defpackage.n101;
import defpackage.ny61;
import defpackage.r101;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ b a;
    public final /* synthetic */ r101 b;

    public a(b bVar, r101 r101Var) {
        this.a = bVar;
        this.b = r101Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TrackableAcceptancePresenter$attachView$$inlined$safeCollectIn$2$2$1 trackableAcceptancePresenter$attachView$$inlined$safeCollectIn$2$2$1;
        int i;
        if (continuation instanceof TrackableAcceptancePresenter$attachView$$inlined$safeCollectIn$2$2$1) {
            trackableAcceptancePresenter$attachView$$inlined$safeCollectIn$2$2$1 = (TrackableAcceptancePresenter$attachView$$inlined$safeCollectIn$2$2$1) continuation;
            int i2 = trackableAcceptancePresenter$attachView$$inlined$safeCollectIn$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackableAcceptancePresenter$attachView$$inlined$safeCollectIn$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = trackableAcceptancePresenter$attachView$$inlined$safeCollectIn$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackableAcceptancePresenter$attachView$$inlined$safeCollectIn$2$2$1.label;
                b bVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    com.yandex.go.agreement.trackable.mapper.a aVar = bVar.B;
                    cd cdVar = bVar.x.a;
                    trackableAcceptancePresenter$attachView$$inlined$safeCollectIn$2$2$1.L$0 = null;
                    trackableAcceptancePresenter$attachView$$inlined$safeCollectIn$2$2$1.L$1 = null;
                    trackableAcceptancePresenter$attachView$$inlined$safeCollectIn$2$2$1.L$2 = null;
                    trackableAcceptancePresenter$attachView$$inlined$safeCollectIn$2$2$1.label = 1;
                    obj2 = aVar.c(cdVar, trackableAcceptancePresenter$attachView$$inlined$safeCollectIn$2$2$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                n101 n101Var = (n101) obj2;
                bVar.H = n101Var.f;
                bVar.I = n101Var.e;
                this.b.m9(n101Var);
                r0 r0Var = bVar.K;
                Boolean bool = Boolean.TRUE;
                r0Var.getClass();
                r0Var.m(null, bool);
                return zy11.a;
            }
        }
        trackableAcceptancePresenter$attachView$$inlined$safeCollectIn$2$2$1 = new TrackableAcceptancePresenter$attachView$$inlined$safeCollectIn$2$2$1(this, continuation);
        Object obj22 = trackableAcceptancePresenter$attachView$$inlined$safeCollectIn$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackableAcceptancePresenter$attachView$$inlined$safeCollectIn$2$2$1.label;
        b bVar2 = this.a;
        if (i != 0) {
        }
        n101 n101Var2 = (n101) obj22;
        bVar2.H = n101Var2.f;
        bVar2.I = n101Var2.e;
        this.b.m9(n101Var2);
        r0 r0Var2 = bVar2.K;
        Boolean bool2 = Boolean.TRUE;
        r0Var2.getClass();
        r0Var2.m(null, bool2);
        return zy11.a;
    }
}
