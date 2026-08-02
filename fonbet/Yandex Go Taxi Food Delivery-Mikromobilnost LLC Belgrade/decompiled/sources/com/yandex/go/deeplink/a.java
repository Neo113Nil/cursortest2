package com.yandex.go.deeplink;

import com.yandex.go.experiment.h;
import defpackage.cug;
import defpackage.eq21;
import defpackage.fx60;
import defpackage.g92;
import defpackage.hd21;
import defpackage.id21;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.uq21;
import defpackage.v770;
import defpackage.wq21;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes.dex */
public final class a extends id21 {
    public final yvf0 b;
    public final fx60 c;
    public final wq21 d;
    public final eq21 e;

    public a(yvf0 yvf0Var, fx60 fx60Var, wq21 wq21Var, eq21 eq21Var) {
        this.b = yvf0Var;
        this.c = fx60Var;
        this.d = wq21Var;
        this.e = eq21Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (hd21) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        if (r11 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, hd21 hd21Var, ContinuationImpl continuationImpl) {
        UserPhotoUploadingDeeplinkHandler$handleDeeplink$1 userPhotoUploadingDeeplinkHandler$handleDeeplink$1;
        Object obj;
        int i;
        if (continuationImpl instanceof UserPhotoUploadingDeeplinkHandler$handleDeeplink$1) {
            userPhotoUploadingDeeplinkHandler$handleDeeplink$1 = (UserPhotoUploadingDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = userPhotoUploadingDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userPhotoUploadingDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                obj = userPhotoUploadingDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userPhotoUploadingDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    b.b(obj);
                    Events$Zalogin$LoginContext events$Zalogin$LoginContext = Events$Zalogin$LoginContext.DEEPLINK;
                    userPhotoUploadingDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    userPhotoUploadingDeeplinkHandler$handleDeeplink$1.L$1 = hd21Var;
                    userPhotoUploadingDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    userPhotoUploadingDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    userPhotoUploadingDeeplinkHandler$handleDeeplink$1.label = 1;
                    obj = this.c.c(events$Zalogin$LoginContext, userPhotoUploadingDeeplinkHandler$handleDeeplink$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    hd21Var = (hd21) userPhotoUploadingDeeplinkHandler$handleDeeplink$1.L$1;
                    oep0Var = (oep0) userPhotoUploadingDeeplinkHandler$handleDeeplink$1.L$0;
                    b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return zy11.a;
                }
                Boolean a = hd21Var.a();
                boolean booleanValue = a != null ? a.booleanValue() : false;
                userPhotoUploadingDeeplinkHandler$handleDeeplink$1.L$0 = null;
                userPhotoUploadingDeeplinkHandler$handleDeeplink$1.L$1 = null;
                userPhotoUploadingDeeplinkHandler$handleDeeplink$1.L$2 = null;
                userPhotoUploadingDeeplinkHandler$handleDeeplink$1.L$3 = null;
                userPhotoUploadingDeeplinkHandler$handleDeeplink$1.label = 2;
                cug cugVar = this.e.b;
                cugVar.getClass();
                cugVar.a.a("UserPhotoUploading.Deeplink.Open", new HashMap(), 1, new HashMap());
                Object collect = new o(com.yandex.go.coroutines.b.k(e.T(new h(this.d.a().a()), 1), 30000L, new g92(2, Boolean.FALSE)), new UserPhotoUploadingDeeplinkHandler$processDeeplink$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null)).collect(new uq21(this, oep0Var, booleanValue), userPhotoUploadingDeeplinkHandler$handleDeeplink$1);
                return collect == coroutineSingletons ? coroutineSingletons : collect;
            }
        }
        userPhotoUploadingDeeplinkHandler$handleDeeplink$1 = new UserPhotoUploadingDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        obj = userPhotoUploadingDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userPhotoUploadingDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
