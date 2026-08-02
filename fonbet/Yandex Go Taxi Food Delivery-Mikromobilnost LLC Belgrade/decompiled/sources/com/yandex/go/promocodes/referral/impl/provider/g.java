package com.yandex.go.promocodes.referral.impl.provider;

import com.yandex.go.promocodes.referral.impl.net.dto.ReferralCodes;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ k b;

    public g(vpr vprVar, k kVar) {
        this.a = vprVar;
        this.b = kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        if (r2.emit(r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ReferralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1 referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1;
        int i;
        Object obj2;
        vpr vprVar;
        vpr vprVar2;
        if (continuation instanceof ReferralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1) {
            referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1 = (ReferralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1) continuation;
            int i2 = referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    obj2 = (ReferralCodes) obj;
                    boolean l = jl40.l(obj2, ReferralCodes.c);
                    vprVar = this.a;
                    if (l) {
                        f fVar = this.b.f;
                        referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$0 = null;
                        referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$1 = null;
                        referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$2 = null;
                        referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$3 = null;
                        referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$4 = vprVar;
                        referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$5 = null;
                        referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$6 = null;
                        referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.label = 1;
                        obj3 = fVar.a(referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1);
                        if (obj3 != coroutineSingletons) {
                            vprVar2 = vprVar;
                        }
                        return coroutineSingletons;
                    }
                    referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$0 = null;
                    referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$1 = null;
                    referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$2 = null;
                    referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$3 = null;
                    referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$4 = null;
                    referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$5 = null;
                    referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$6 = null;
                    referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.label = 2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj3);
                        return zy11.a;
                    }
                    vprVar2 = (vpr) referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj3);
                }
                vprVar = vprVar2;
                obj2 = obj3;
                referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$0 = null;
                referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$1 = null;
                referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$2 = null;
                referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$3 = null;
                referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$4 = null;
                referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$5 = null;
                referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$6 = null;
                referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.label = 2;
            }
        }
        referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1 = new ReferralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1(this, continuation);
        Object obj32 = referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        vprVar = vprVar2;
        obj2 = obj32;
        referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$0 = null;
        referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$1 = null;
        referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$2 = null;
        referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$3 = null;
        referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$4 = null;
        referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$5 = null;
        referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.L$6 = null;
        referralCodesProviderImpl$referralCodeFlow$$inlined$map$1$2$1.label = 2;
    }
}
