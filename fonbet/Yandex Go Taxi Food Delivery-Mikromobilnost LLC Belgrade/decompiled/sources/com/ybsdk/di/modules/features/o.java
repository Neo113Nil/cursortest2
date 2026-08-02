package com.ybsdk.di.modules.features;

import defpackage.ny61;
import defpackage.ppp0;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;

/* loaded from: classes3.dex */
public final class o {
    public final /* synthetic */ com.ybsdk.common.repositiories.auth.f a;
    public final /* synthetic */ ppp0 b;

    public o(com.ybsdk.common.repositiories.auth.f fVar, ppp0 ppp0Var) {
        this.a = fVar;
        this.b = ppp0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        RedirectUrlFeatureModule$provideRedirectUrlAuthorizationProvider$1$getAuthorizationUrl$1 redirectUrlFeatureModule$provideRedirectUrlAuthorizationProvider$1$getAuthorizationUrl$1;
        int i;
        Long l;
        Serializable d;
        if (continuationImpl instanceof RedirectUrlFeatureModule$provideRedirectUrlAuthorizationProvider$1$getAuthorizationUrl$1) {
            redirectUrlFeatureModule$provideRedirectUrlAuthorizationProvider$1$getAuthorizationUrl$1 = (RedirectUrlFeatureModule$provideRedirectUrlAuthorizationProvider$1$getAuthorizationUrl$1) continuationImpl;
            int i2 = redirectUrlFeatureModule$provideRedirectUrlAuthorizationProvider$1$getAuthorizationUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                redirectUrlFeatureModule$provideRedirectUrlAuthorizationProvider$1$getAuthorizationUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = redirectUrlFeatureModule$provideRedirectUrlAuthorizationProvider$1$getAuthorizationUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = redirectUrlFeatureModule$provideRedirectUrlAuthorizationProvider$1$getAuthorizationUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    redirectUrlFeatureModule$provideRedirectUrlAuthorizationProvider$1$getAuthorizationUrl$1.L$0 = str;
                    redirectUrlFeatureModule$provideRedirectUrlAuthorizationProvider$1$getAuthorizationUrl$1.label = 1;
                    obj = this.a.a(redirectUrlFeatureModule$provideRedirectUrlAuthorizationProvider$1$getAuthorizationUrl$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) redirectUrlFeatureModule$provideRedirectUrlAuthorizationProvider$1$getAuthorizationUrl$1.L$0;
                    kotlin.b.b(obj);
                }
                l = (Long) obj;
                if (l != null) {
                    return new Result.Failure(new IllegalStateException("yandexUid was null"));
                }
                long longValue = l.longValue();
                redirectUrlFeatureModule$provideRedirectUrlAuthorizationProvider$1$getAuthorizationUrl$1.L$0 = null;
                redirectUrlFeatureModule$provideRedirectUrlAuthorizationProvider$1$getAuthorizationUrl$1.label = 2;
                d = ((com.ybsdk.feature.passport.impl.a) this.b).d(longValue, str, ClearCryptoProPrefs.COUNTRY, redirectUrlFeatureModule$provideRedirectUrlAuthorizationProvider$1$getAuthorizationUrl$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        redirectUrlFeatureModule$provideRedirectUrlAuthorizationProvider$1$getAuthorizationUrl$1 = new RedirectUrlFeatureModule$provideRedirectUrlAuthorizationProvider$1$getAuthorizationUrl$1(this, continuationImpl);
        Object obj2 = redirectUrlFeatureModule$provideRedirectUrlAuthorizationProvider$1$getAuthorizationUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = redirectUrlFeatureModule$provideRedirectUrlAuthorizationProvider$1$getAuthorizationUrl$1.label;
        if (i != 0) {
        }
        l = (Long) obj2;
        if (l != null) {
        }
    }
}
