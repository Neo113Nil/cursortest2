package com.yandex.go.permission.location_with_agreement.interactor;

import defpackage.hge0;
import defpackage.lbz;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes8.dex */
public final class h implements hge0 {
    public final e a;
    public final lbz b;

    public h(e eVar, lbz lbzVar) {
        this.a = eVar;
        this.b = lbzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.hge0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        LocationWithAgreementAutoLoginDelayCondition$performAction$1 locationWithAgreementAutoLoginDelayCondition$performAction$1;
        int i;
        if (continuationImpl instanceof LocationWithAgreementAutoLoginDelayCondition$performAction$1) {
            locationWithAgreementAutoLoginDelayCondition$performAction$1 = (LocationWithAgreementAutoLoginDelayCondition$performAction$1) continuationImpl;
            int i2 = locationWithAgreementAutoLoginDelayCondition$performAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationWithAgreementAutoLoginDelayCondition$performAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locationWithAgreementAutoLoginDelayCondition$performAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationWithAgreementAutoLoginDelayCondition$performAction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g gVar = new g(new m0(this.a.b(), this.b.b, new LocationWithAgreementAutoLoginDelayCondition$isNotShowing$1()));
                    locationWithAgreementAutoLoginDelayCondition$performAction$1.label = 1;
                    if (kotlinx.coroutines.flow.e.y(gVar, locationWithAgreementAutoLoginDelayCondition$performAction$1) == coroutineSingletons) {
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
        locationWithAgreementAutoLoginDelayCondition$performAction$1 = new LocationWithAgreementAutoLoginDelayCondition$performAction$1(this, continuationImpl);
        Object obj2 = locationWithAgreementAutoLoginDelayCondition$performAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationWithAgreementAutoLoginDelayCondition$performAction$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
