package com.yandex.go.business.impl.deeplink;

import defpackage.evu0;
import defpackage.h3y;
import defpackage.hxx;
import defpackage.iq41;
import defpackage.kn51;
import defpackage.ln51;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.v770;
import defpackage.vn51;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkExperiment;

/* loaded from: classes.dex */
public final class c extends ln51 {
    public final h3y b;
    public final iq41 c;

    public c(h3y h3yVar, iq41 iq41Var) {
        this.b = h3yVar;
        this.c = iq41Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (kn51) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, kn51 kn51Var, ContinuationImpl continuationImpl) {
        YangoBusinessDeeplinkHandler$handleDeeplink$1 yangoBusinessDeeplinkHandler$handleDeeplink$1;
        int i;
        oep0 oep0Var2;
        String str;
        WebViewFromDeeplinkExperiment webViewFromDeeplinkExperiment;
        if (continuationImpl instanceof YangoBusinessDeeplinkHandler$handleDeeplink$1) {
            yangoBusinessDeeplinkHandler$handleDeeplink$1 = (YangoBusinessDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = yangoBusinessDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yangoBusinessDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = yangoBusinessDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yangoBusinessDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String a = kn51Var.a();
                    b bVar = new b(this.c.a.a());
                    yangoBusinessDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    yangoBusinessDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    yangoBusinessDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    yangoBusinessDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    yangoBusinessDeeplinkHandler$handleDeeplink$1.L$4 = a;
                    yangoBusinessDeeplinkHandler$handleDeeplink$1.label = 1;
                    obj = e.A(bVar, yangoBusinessDeeplinkHandler$handleDeeplink$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    oep0Var2 = oep0Var;
                    str = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) yangoBusinessDeeplinkHandler$handleDeeplink$1.L$4;
                    oep0Var2 = (oep0) yangoBusinessDeeplinkHandler$handleDeeplink$1.L$0;
                    kotlin.b.b(obj);
                }
                webViewFromDeeplinkExperiment = (WebViewFromDeeplinkExperiment) obj;
                zy11 zy11Var = zy11.a;
                if (webViewFromDeeplinkExperiment != null) {
                    String str2 = webViewFromDeeplinkExperiment.a(str).b;
                    String str3 = evu0.J(str2) ? null : str2;
                    if (str3 != null) {
                        ((pep0) oep0Var2).f((com.yandex.go.business.impl.router.b) this.b.get(), new vn51(str3), hxx.a);
                        return zy11Var;
                    }
                }
                return zy11Var;
            }
        }
        yangoBusinessDeeplinkHandler$handleDeeplink$1 = new YangoBusinessDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj2 = yangoBusinessDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yangoBusinessDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        webViewFromDeeplinkExperiment = (WebViewFromDeeplinkExperiment) obj2;
        zy11 zy11Var2 = zy11.a;
        if (webViewFromDeeplinkExperiment != null) {
        }
        return zy11Var2;
    }
}
