package com.yandex.go.user_profile.main_menu.profile;

import com.yandex.go.user_profile.main_menu.profile.domain.c;
import com.yandex.go.user_profile.main_menu.profile.models.UserProfileStyle;
import defpackage.jj3;
import defpackage.ny61;
import defpackage.o600;
import defpackage.oep0;
import defpackage.qzj0;
import defpackage.rs21;
import defpackage.um3;
import defpackage.v770;
import defpackage.yvf0;
import defpackage.zjy0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class b extends rs21 {
    public final yvf0 b;
    public final jj3 c;
    public final o600 d;

    public b(yvf0 yvf0Var, jj3 jj3Var, o600 o600Var) {
        this.b = yvf0Var;
        this.c = jj3Var;
        this.d = o600Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, ContinuationImpl continuationImpl) {
        UserRatingDeeplinkHandler$handleDeeplink$1 userRatingDeeplinkHandler$handleDeeplink$1;
        int i;
        if (continuationImpl instanceof UserRatingDeeplinkHandler$handleDeeplink$1) {
            userRatingDeeplinkHandler$handleDeeplink$1 = (UserRatingDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = userRatingDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userRatingDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userRatingDeeplinkHandler$handleDeeplink$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userRatingDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    userRatingDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    userRatingDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    userRatingDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    userRatingDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    userRatingDeeplinkHandler$handleDeeplink$1.label = 1;
                    obj = ((c) this.d).a(userRatingDeeplinkHandler$handleDeeplink$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oep0Var = (oep0) userRatingDeeplinkHandler$handleDeeplink$1.L$0;
                    kotlin.b.b(obj);
                }
                this.c.c(new um3(Events$Zalogin$LoginContext.DEEPLINK, new qzj0(null, new zjy0(18, (UserProfileStyle) obj, oep0Var, this)), false, false, 28));
                return zy11.a;
            }
        }
        userRatingDeeplinkHandler$handleDeeplink$1 = new UserRatingDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj3 = userRatingDeeplinkHandler$handleDeeplink$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userRatingDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        this.c.c(new um3(Events$Zalogin$LoginContext.DEEPLINK, new qzj0(null, new zjy0(18, (UserProfileStyle) obj3, oep0Var, this)), false, false, 28));
        return zy11.a;
    }
}
