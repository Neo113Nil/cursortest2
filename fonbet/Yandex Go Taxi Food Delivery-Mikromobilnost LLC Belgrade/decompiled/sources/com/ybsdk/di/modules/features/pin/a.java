package com.ybsdk.di.modules.features.pin;

import com.ybsdk.api.YBSdkVisualParams;
import com.ybsdk.common.repositiories.auth.f;
import defpackage.ny61;
import defpackage.nyg0;
import defpackage.ppp0;
import defpackage.w5b1;
import defpackage.ws51;
import defpackage.wzb0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final boolean a;
    public final /* synthetic */ f b;
    public final /* synthetic */ ppp0 c;

    public a(YBSdkVisualParams yBSdkVisualParams, f fVar, ppp0 ppp0Var) {
        this.b = fVar;
        this.c = ppp0Var;
        this.a = yBSdkVisualParams.getShowLogOut();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0046, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PinFeatureModule$providePinSignOutHelper$1$getPinSignOutState$1 pinFeatureModule$providePinSignOutHelper$1$getPinSignOutState$1;
        int i;
        Long l;
        Object g;
        if (continuationImpl instanceof PinFeatureModule$providePinSignOutHelper$1$getPinSignOutState$1) {
            pinFeatureModule$providePinSignOutHelper$1$getPinSignOutState$1 = (PinFeatureModule$providePinSignOutHelper$1$getPinSignOutState$1) continuationImpl;
            int i2 = pinFeatureModule$providePinSignOutHelper$1$getPinSignOutState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinFeatureModule$providePinSignOutHelper$1$getPinSignOutState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinFeatureModule$providePinSignOutHelper$1$getPinSignOutState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinFeatureModule$providePinSignOutHelper$1$getPinSignOutState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pinFeatureModule$providePinSignOutHelper$1$getPinSignOutState$1.label = 1;
                    obj = this.b.a(pinFeatureModule$providePinSignOutHelper$1$getPinSignOutState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        g = ((Result) obj).getValue();
                        if (Result.a(g) == null) {
                            ws51 ws51Var = (ws51) g;
                            return new wzb0(ws51Var.b, ws51Var.c, w5b1.d(ws51Var, nyg0.ybsdk_ic_person_avatar_unknown));
                        }
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                l = (Long) obj;
                if (l != null) {
                    long longValue = l.longValue();
                    pinFeatureModule$providePinSignOutHelper$1$getPinSignOutState$1.label = 2;
                    g = ((com.ybsdk.feature.passport.impl.a) this.c).g(longValue, pinFeatureModule$providePinSignOutHelper$1$getPinSignOutState$1);
                }
                return null;
            }
        }
        pinFeatureModule$providePinSignOutHelper$1$getPinSignOutState$1 = new PinFeatureModule$providePinSignOutHelper$1$getPinSignOutState$1(this, continuationImpl);
        Object obj2 = pinFeatureModule$providePinSignOutHelper$1$getPinSignOutState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinFeatureModule$providePinSignOutHelper$1$getPinSignOutState$1.label;
        if (i != 0) {
        }
        l = (Long) obj2;
        if (l != null) {
        }
        return null;
    }
}
