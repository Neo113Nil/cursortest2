package com.yandex.go.account.deeplink;

import com.yandex.go.taxi.order.domain.repositories.e0;
import defpackage.cm51;
import defpackage.cot;
import defpackage.h3y;
import defpackage.jc4;
import defpackage.jj3;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.p2y0;
import defpackage.qeb1;
import defpackage.qq31;
import defpackage.qzj0;
import defpackage.um3;
import defpackage.v770;
import defpackage.zi;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.zalogin.d;

/* loaded from: classes.dex */
public final class b extends cm51 {
    public final g b;
    public final h3y c;
    public final jj3 d;
    public final cot e;
    public final h3y f;
    public final p2y0 g;

    public b(g gVar, h3y h3yVar, jj3 jj3Var, cot cotVar, h3y h3yVar2, p2y0 p2y0Var) {
        this.b = gVar;
        this.c = h3yVar;
        this.d = jj3Var;
        this.e = cotVar;
        this.f = h3yVar2;
        this.g = p2y0Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d((ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        YandexloginTypedDeeplinkHandler$handleDeeplink$1 yandexloginTypedDeeplinkHandler$handleDeeplink$1;
        int i;
        boolean booleanValue;
        if (continuationImpl instanceof YandexloginTypedDeeplinkHandler$handleDeeplink$1) {
            yandexloginTypedDeeplinkHandler$handleDeeplink$1 = (YandexloginTypedDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = yandexloginTypedDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yandexloginTypedDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = yandexloginTypedDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yandexloginTypedDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    yandexloginTypedDeeplinkHandler$handleDeeplink$1.L$0 = null;
                    yandexloginTypedDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    yandexloginTypedDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    yandexloginTypedDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    yandexloginTypedDeeplinkHandler$handleDeeplink$1.label = 1;
                    obj = ((e0) this.g).r(yandexloginTypedDeeplinkHandler$handleDeeplink$1);
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
                booleanValue = ((Boolean) obj).booleanValue();
                zy11 zy11Var = zy11.a;
                cot cotVar = this.e;
                if (!booleanValue) {
                    cotVar.i("failFetchingSession");
                    return zy11Var;
                }
                g gVar = this.b;
                if (!gVar.f()) {
                    jc4 jc4Var = (jc4) cotVar.b;
                    jc4Var.getClass();
                    jc4Var.a.a("YandexLogin.Deeplink.AuthorizationDidShow", new HashMap(), 1, new HashMap());
                    this.d.c(new um3(Events$Zalogin$LoginContext.DEEPLINK, new qzj0(null, new qq31(23, this)), false, false, 28));
                    return zy11Var;
                }
                if (!gVar.a.Mg()) {
                    cotVar.i("alreadyHasYandexAccount");
                    return zy11Var;
                }
                jc4 jc4Var2 = (jc4) cotVar.b;
                jc4Var2.getClass();
                jc4Var2.a.a("YandexLogin.Deeplink.YandexAuthorizationDidShow", new HashMap(), 1, new HashMap());
                d dVar = (d) this.c.get();
                dVar.b(Events$Zalogin$LinkageContext.DEEPLINK, qeb1.b(dVar.e), new zi(21), new zi(21));
                return zy11Var;
            }
        }
        yandexloginTypedDeeplinkHandler$handleDeeplink$1 = new YandexloginTypedDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj2 = yandexloginTypedDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yandexloginTypedDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        zy11 zy11Var2 = zy11.a;
        cot cotVar2 = this.e;
        if (!booleanValue) {
        }
    }
}
