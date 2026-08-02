package com.yandex.go.promocodes.referral.impl.provider;

import com.yandex.go.promocodes.referral.impl.net.dto.ReferralCodes;
import defpackage.as21;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class f {
    public final as21 a;
    public final tt2 b;
    public volatile ReferralCodes c;

    public f(tt2 tt2Var, as21 as21Var) {
        this.a = as21Var;
        this.b = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ReferralCodesProviderImpl$ReferralCodesCache$getValue$1 referralCodesProviderImpl$ReferralCodesCache$getValue$1;
        int i;
        if (continuationImpl instanceof ReferralCodesProviderImpl$ReferralCodesCache$getValue$1) {
            referralCodesProviderImpl$ReferralCodesCache$getValue$1 = (ReferralCodesProviderImpl$ReferralCodesCache$getValue$1) continuationImpl;
            int i2 = referralCodesProviderImpl$ReferralCodesCache$getValue$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                referralCodesProviderImpl$ReferralCodesCache$getValue$1.label = i2 - Integer.MIN_VALUE;
                Object obj = referralCodesProviderImpl$ReferralCodesCache$getValue$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = referralCodesProviderImpl$ReferralCodesCache$getValue$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ReferralCodes referralCodes = this.c;
                    if (referralCodes != null) {
                        return referralCodes;
                    }
                    referralCodesProviderImpl$ReferralCodesCache$getValue$1.label = 1;
                    obj = b(referralCodesProviderImpl$ReferralCodesCache$getValue$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ReferralCodes referralCodes2 = (ReferralCodes) obj;
                this.c = referralCodes2;
                return referralCodes2;
            }
        }
        referralCodesProviderImpl$ReferralCodesCache$getValue$1 = new ReferralCodesProviderImpl$ReferralCodesCache$getValue$1(this, continuationImpl);
        Object obj3 = referralCodesProviderImpl$ReferralCodesCache$getValue$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = referralCodesProviderImpl$ReferralCodesCache$getValue$1.label;
        if (i != 0) {
        }
        ReferralCodes referralCodes22 = (ReferralCodes) obj3;
        this.c = referralCodes22;
        return referralCodes22;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ReferralCodesProviderImpl$ReferralCodesCache$read$1 referralCodesProviderImpl$ReferralCodesCache$read$1;
        int i;
        if (continuationImpl instanceof ReferralCodesProviderImpl$ReferralCodesCache$read$1) {
            referralCodesProviderImpl$ReferralCodesCache$read$1 = (ReferralCodesProviderImpl$ReferralCodesCache$read$1) continuationImpl;
            int i2 = referralCodesProviderImpl$ReferralCodesCache$read$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                referralCodesProviderImpl$ReferralCodesCache$read$1.label = i2 - Integer.MIN_VALUE;
                Object obj = referralCodesProviderImpl$ReferralCodesCache$read$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = referralCodesProviderImpl$ReferralCodesCache$read$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.b.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    ReferralCodesProviderImpl$ReferralCodesCache$read$2 referralCodesProviderImpl$ReferralCodesCache$read$2 = new ReferralCodesProviderImpl$ReferralCodesCache$read$2(this, null);
                    referralCodesProviderImpl$ReferralCodesCache$read$1.label = 1;
                    obj = tje.k0(mdhVar, referralCodesProviderImpl$ReferralCodesCache$read$2, referralCodesProviderImpl$ReferralCodesCache$read$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ReferralCodes referralCodes = (ReferralCodes) obj;
                return referralCodes != null ? ReferralCodes.c : referralCodes;
            }
        }
        referralCodesProviderImpl$ReferralCodesCache$read$1 = new ReferralCodesProviderImpl$ReferralCodesCache$read$1(this, continuationImpl);
        Object obj2 = referralCodesProviderImpl$ReferralCodesCache$read$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = referralCodesProviderImpl$ReferralCodesCache$read$1.label;
        if (i != 0) {
        }
        ReferralCodes referralCodes2 = (ReferralCodes) obj2;
        if (referralCodes2 != null) {
        }
    }
}
