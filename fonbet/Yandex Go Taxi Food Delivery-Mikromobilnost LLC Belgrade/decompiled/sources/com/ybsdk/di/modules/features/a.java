package com.ybsdk.di.modules.features;

import com.ybsdk.feature.autotopup.api.data.AutoTopupUserStatus;
import defpackage.kn21;
import defpackage.ny61;
import defpackage.uv3;
import defpackage.w511;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final /* synthetic */ com.ybsdk.common.repositiories.user.a a;

    public a(com.ybsdk.common.repositiories.user.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        AutoTopupFeatureModule$autoTopupUserStatusProvider$1$getUserStatus$1 autoTopupFeatureModule$autoTopupUserStatusProvider$1$getUserStatus$1;
        int i;
        Object a;
        if (continuationImpl instanceof AutoTopupFeatureModule$autoTopupUserStatusProvider$1$getUserStatus$1) {
            autoTopupFeatureModule$autoTopupUserStatusProvider$1$getUserStatus$1 = (AutoTopupFeatureModule$autoTopupUserStatusProvider$1$getUserStatus$1) continuationImpl;
            int i2 = autoTopupFeatureModule$autoTopupUserStatusProvider$1$getUserStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupFeatureModule$autoTopupUserStatusProvider$1$getUserStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupFeatureModule$autoTopupUserStatusProvider$1$getUserStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupFeatureModule$autoTopupUserStatusProvider$1$getUserStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    autoTopupFeatureModule$autoTopupUserStatusProvider$1$getUserStatus$1.label = 1;
                    a = this.a.a(true, autoTopupFeatureModule$autoTopupUserStatusProvider$1$getUserStatus$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    return a;
                }
                int i3 = uv3.a[((kn21) a).a.ordinal()];
                if (i3 == 1) {
                    return AutoTopupUserStatus.NOT_REGISTERED;
                }
                if (i3 == 2) {
                    return AutoTopupUserStatus.ANONYMOUS;
                }
                if (i3 == 3) {
                    return AutoTopupUserStatus.IDENTIFIED;
                }
                if (i3 == 4) {
                    return AutoTopupUserStatus.KYC;
                }
                if (i3 == 5) {
                    return AutoTopupUserStatus.KYC_EDS;
                }
                w511.b();
                return null;
            }
        }
        autoTopupFeatureModule$autoTopupUserStatusProvider$1$getUserStatus$1 = new AutoTopupFeatureModule$autoTopupUserStatusProvider$1$getUserStatus$1(this, continuationImpl);
        Object obj2 = autoTopupFeatureModule$autoTopupUserStatusProvider$1$getUserStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupFeatureModule$autoTopupUserStatusProvider$1$getUserStatus$1.label;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
    }
}
