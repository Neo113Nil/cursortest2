package com.yandex.go.places.impl.ui.web_custom_tabs;

import androidx.core.view.OneShotPreDrawListener;
import defpackage.dvw;
import defpackage.j18;
import defpackage.ny61;
import defpackage.r6b;
import defpackage.sg41;
import defpackage.sls;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a implements sg41 {
    public final /* synthetic */ WebCustomTabsModalView a;

    public a(WebCustomTabsModalView webCustomTabsModalView) {
        this.a = webCustomTabsModalView;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.sg41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cf(ContinuationImpl continuationImpl) {
        WebCustomTabsModalView$InnerMvpView$awaitFirstFrameDrawn$1 webCustomTabsModalView$InnerMvpView$awaitFirstFrameDrawn$1;
        int i;
        if (continuationImpl instanceof WebCustomTabsModalView$InnerMvpView$awaitFirstFrameDrawn$1) {
            webCustomTabsModalView$InnerMvpView$awaitFirstFrameDrawn$1 = (WebCustomTabsModalView$InnerMvpView$awaitFirstFrameDrawn$1) continuationImpl;
            int i2 = webCustomTabsModalView$InnerMvpView$awaitFirstFrameDrawn$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webCustomTabsModalView$InnerMvpView$awaitFirstFrameDrawn$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webCustomTabsModalView$InnerMvpView$awaitFirstFrameDrawn$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webCustomTabsModalView$InnerMvpView$awaitFirstFrameDrawn$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    WebCustomTabsModalView webCustomTabsModalView = this.a;
                    webCustomTabsModalView$InnerMvpView$awaitFirstFrameDrawn$1.L$0 = webCustomTabsModalView;
                    webCustomTabsModalView$InnerMvpView$awaitFirstFrameDrawn$1.label = 1;
                    j18 j18Var = new j18(1, dvw.b(webCustomTabsModalView$InnerMvpView$awaitFirstFrameDrawn$1));
                    j18Var.u();
                    OneShotPreDrawListener.add(WebCustomTabsModalView.access$getBinding(webCustomTabsModalView).c, new r6b(j18Var, 8));
                    if (j18Var.s() == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        webCustomTabsModalView$InnerMvpView$awaitFirstFrameDrawn$1 = new WebCustomTabsModalView$InnerMvpView$awaitFirstFrameDrawn$1(this, continuationImpl);
        Object obj2 = webCustomTabsModalView$InnerMvpView$awaitFirstFrameDrawn$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webCustomTabsModalView$InnerMvpView$awaitFirstFrameDrawn$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    @Override // defpackage.sg41
    public final void showError(sls slsVar, sls slsVar2) {
        this.a.showError(slsVar, slsVar2);
    }

    @Override // defpackage.sg41
    public final void showLoading() {
        this.a.showLoading();
    }
}
