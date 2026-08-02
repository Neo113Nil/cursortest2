package com.yandex.go.loyalty.impl.common.domain;

import com.yandex.go.loyalty.impl.selector.data.model.GeoState;
import com.yandex.go.loyalty.impl.selector.data.model.LoyaltyStateParam;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class k implements vpr {
    public final /* synthetic */ l a;

    public k(l lVar) {
        this.a = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(GeoState geoState, Continuation continuation) {
        LoyaltyStateFCPListener$onFirstContentfulPaint$1$2$emit$1 loyaltyStateFCPListener$onFirstContentfulPaint$1$2$emit$1;
        int i;
        if (continuation instanceof LoyaltyStateFCPListener$onFirstContentfulPaint$1$2$emit$1) {
            loyaltyStateFCPListener$onFirstContentfulPaint$1$2$emit$1 = (LoyaltyStateFCPListener$onFirstContentfulPaint$1$2$emit$1) continuation;
            int i2 = loyaltyStateFCPListener$onFirstContentfulPaint$1$2$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loyaltyStateFCPListener$onFirstContentfulPaint$1$2$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = loyaltyStateFCPListener$onFirstContentfulPaint$1$2$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = loyaltyStateFCPListener$onFirstContentfulPaint$1$2$emit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = (a) this.a.c.get();
                    LoyaltyStateParam loyaltyStateParam = new LoyaltyStateParam(geoState);
                    loyaltyStateFCPListener$onFirstContentfulPaint$1$2$emit$1.L$0 = null;
                    loyaltyStateFCPListener$onFirstContentfulPaint$1$2$emit$1.label = 1;
                    if (aVar.b(loyaltyStateParam, loyaltyStateFCPListener$onFirstContentfulPaint$1$2$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                }
                return zy11.a;
            }
        }
        loyaltyStateFCPListener$onFirstContentfulPaint$1$2$emit$1 = new LoyaltyStateFCPListener$onFirstContentfulPaint$1$2$emit$1(this, continuation);
        Object obj2 = loyaltyStateFCPListener$onFirstContentfulPaint$1$2$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loyaltyStateFCPListener$onFirstContentfulPaint$1$2$emit$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
