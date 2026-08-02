package com.yandex.go.user_profile.fullscreen.domain;

import com.yandex.go.user_profile.fullscreen.models.UserProfileExperiment;
import com.yandex.go.user_profile.fullscreen.models.l;
import com.yandex.go.user_profile.fullscreen.presentation.UserProfileJsNativeApi;
import defpackage.evu0;
import defpackage.fn21;
import defpackage.ny61;
import java.util.Locale;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes14.dex */
public final class a {
    public final l a;
    public final ru.yandex.taxi.am.token.a b;
    public final fn21 c;
    public final UserProfileJsNativeApi d;

    public a(l lVar, ru.yandex.taxi.am.token.a aVar, fn21 fn21Var, UserProfileJsNativeApi userProfileJsNativeApi) {
        this.a = lVar;
        this.b = aVar;
        this.c = fn21Var;
        this.d = userProfileJsNativeApi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0061, code lost:
    
        if (r4 == r3) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, ContinuationImpl continuationImpl) {
        UserProfileConfigFactory$getWebConfig$1 userProfileConfigFactory$getWebConfig$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        boolean z2;
        Object b;
        UserProfileExperiment userProfileExperiment;
        int i2;
        String Hg;
        Object d;
        UserProfileExperiment userProfileExperiment2;
        String str;
        String str2;
        if (continuationImpl instanceof UserProfileConfigFactory$getWebConfig$1) {
            userProfileConfigFactory$getWebConfig$1 = (UserProfileConfigFactory$getWebConfig$1) continuationImpl;
            int i3 = userProfileConfigFactory$getWebConfig$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                userProfileConfigFactory$getWebConfig$1.label = i3 - Integer.MIN_VALUE;
                Object obj = userProfileConfigFactory$getWebConfig$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userProfileConfigFactory$getWebConfig$1.label;
                if (i != 0) {
                    b.b(obj);
                    z2 = z;
                    userProfileConfigFactory$getWebConfig$1.Z$0 = z2;
                    userProfileConfigFactory$getWebConfig$1.label = 1;
                    b = this.a.b(userProfileConfigFactory$getWebConfig$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) userProfileConfigFactory$getWebConfig$1.L$2;
                        userProfileExperiment2 = (UserProfileExperiment) userProfileConfigFactory$getWebConfig$1.L$0;
                        b.b(obj);
                        d = ((Result) obj).getValue();
                        if (d instanceof Result.Failure) {
                            d = null;
                        }
                        str2 = (String) d;
                        if (str2 != null) {
                            String str3 = userProfileExperiment2.b;
                            CoreWebViewConfig.Companion.getClass();
                            CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
                            aVar.b("X-YaTaxi-UserId".toLowerCase(Locale.ROOT), str);
                            aVar.k = this.d;
                            aVar.c = str2;
                            aVar.b = str3;
                            return new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194294, null);
                        }
                        return null;
                    }
                    boolean z3 = userProfileConfigFactory$getWebConfig$1.Z$0;
                    b.b(obj);
                    b = obj;
                    z2 = z3;
                }
                userProfileExperiment = (UserProfileExperiment) b;
                String str4 = userProfileExperiment.b;
                i2 = (z2 || !userProfileExperiment.f) ? 0 : 1;
                if ((!userProfileExperiment.i() || i2 != 0) && !evu0.J(str4) && (Hg = ((h) this.c).Hg()) != null) {
                    userProfileConfigFactory$getWebConfig$1.L$0 = userProfileExperiment;
                    userProfileConfigFactory$getWebConfig$1.L$1 = null;
                    userProfileConfigFactory$getWebConfig$1.L$2 = Hg;
                    userProfileConfigFactory$getWebConfig$1.Z$0 = z2;
                    userProfileConfigFactory$getWebConfig$1.I$0 = i2;
                    userProfileConfigFactory$getWebConfig$1.label = 2;
                    d = this.b.d(false, userProfileConfigFactory$getWebConfig$1);
                    if (d != coroutineSingletons) {
                        userProfileExperiment2 = userProfileExperiment;
                        str = Hg;
                        if (d instanceof Result.Failure) {
                        }
                        str2 = (String) d;
                        if (str2 != null) {
                        }
                    }
                    return coroutineSingletons;
                }
                return null;
            }
        }
        userProfileConfigFactory$getWebConfig$1 = new UserProfileConfigFactory$getWebConfig$1(this, continuationImpl);
        Object obj2 = userProfileConfigFactory$getWebConfig$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userProfileConfigFactory$getWebConfig$1.label;
        if (i != 0) {
        }
        userProfileExperiment = (UserProfileExperiment) b;
        String str42 = userProfileExperiment.b;
        if (z2) {
        }
        if (!userProfileExperiment.i()) {
        }
        userProfileConfigFactory$getWebConfig$1.L$0 = userProfileExperiment;
        userProfileConfigFactory$getWebConfig$1.L$1 = null;
        userProfileConfigFactory$getWebConfig$1.L$2 = Hg;
        userProfileConfigFactory$getWebConfig$1.Z$0 = z2;
        userProfileConfigFactory$getWebConfig$1.I$0 = i2;
        userProfileConfigFactory$getWebConfig$1.label = 2;
        d = this.b.d(false, userProfileConfigFactory$getWebConfig$1);
        if (d != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
