package com.yandex.go.intercity.flex.dashboard.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.flex.common.api.ui.FlexSdkFrameLayout;
import com.yandex.go.intercity.flex.dashboard.presentation.h;
import defpackage.cma1;
import defpackage.cvu0;
import defpackage.ltg0;
import defpackage.mdw;
import defpackage.ny61;
import defpackage.olr;
import defpackage.oow;
import defpackage.pth0;
import defpackage.qlr;
import defpackage.qow;
import defpackage.sih0;
import defpackage.tje;
import defpackage.wdw;
import defpackage.xdw;
import defpackage.xew;
import flex.engine.a;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewTopRounded$1;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001'B=\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u001a\u0010#\u001a\u00020\"8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0018\u0010(\u001a\u00060'R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/yandex/go/intercity/flex/dashboard/view/IntercityDashboardFlexSdkView;", "Lcom/yandex/go/flex/common/api/ui/FlexSdkFrameLayout;", "Lwdw;", "Landroid/content/Context;", "context", "Lflex/engine/a;", "flexSdkEngine", "Lcom/yandex/go/intercity/flex/dashboard/presentation/h;", "presenter", "Loow;", "performanceAnalytics", "Lmdw;", "intercityFlexDocumentTracker", "Lxdw;", "intercityDashboardFlexParams", "<init>", "(Landroid/content/Context;Lflex/engine/a;Lcom/yandex/go/intercity/flex/dashboard/presentation/h;Loow;Lmdw;Lxdw;)V", "Landroid/view/ViewGroup;", "provideEngineContainer", "()Landroid/view/ViewGroup;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "isVisible", "setProgressVisibility", "(Z)V", "applyThemeForChildrenByDefault", "()Z", "Lflex/engine/a;", "Lcom/yandex/go/intercity/flex/dashboard/presentation/h;", "Loow;", "Lmdw;", "Lqlr;", "binding", "Lqlr;", "getBinding", "()Lqlr;", "Lxew;", "progressViewTracker", "Lxew;", "Landroidx/transition/AutoTransition;", "progressViewTransition", "Landroidx/transition/AutoTransition;", "Lolr;", "firstLoadingEvent", "Lolr;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IntercityDashboardFlexSdkView extends FlexSdkFrameLayout implements wdw {
    private final qlr binding;
    private final olr firstLoadingEvent;
    private final a flexSdkEngine;
    private final mdw intercityFlexDocumentTracker;
    private final oow performanceAnalytics;
    private final h presenter;
    private final xew progressViewTracker;
    private final AutoTransition progressViewTransition;

    public IntercityDashboardFlexSdkView(Context context, a aVar, h hVar, oow oowVar, mdw mdwVar, xdw xdwVar) {
        super(context, aVar, false);
        this.flexSdkEngine = aVar;
        this.presenter = hVar;
        this.performanceAnalytics = oowVar;
        this.intercityFlexDocumentTracker = mdwVar;
        LayoutInflater.from(context).inflate(pth0.flex_screen_intercity_dashboard, this);
        int i = sih0.feed_sdk_intercity_dashboard_container;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i, this);
        if (frameLayout != null) {
            i = sih0.feed_sdk_intercity_dashboard_progress;
            GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, this);
            if (goFrameLayout != null) {
                this.binding = new qlr(this, frameLayout, goFrameLayout);
                this.progressViewTracker = new xew(this);
                AutoTransition autoTransition = new AutoTransition();
                autoTransition.P(200L);
                this.progressViewTransition = autoTransition;
                this.firstLoadingEvent = new olr("Flex.First.Loading.".concat(cvu0.v(xdwVar.a, "/", Extension.DOT_CHAR, false)), "IntercityFlex");
                setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewTopRounded$1(tje.r(ltg0.intercity_flex_dashboard_top_round_radius, getContext())));
                setClipToOutline(true);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    @Override // com.yandex.go.flex.common.api.ui.FlexSdkFrameLayout, defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    @Override // com.yandex.go.flex.common.api.ui.FlexSdkFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.Mg(this);
        ((qow) this.performanceAnalytics).d(this.firstLoadingEvent);
        this.flexSdkEngine.c(this.progressViewTracker);
        this.flexSdkEngine.b(this.intercityFlexDocumentTracker);
    }

    @Override // com.yandex.go.flex.common.api.ui.FlexSdkFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        ((qow) this.performanceAnalytics).b("IntercityFlex");
    }

    @Override // com.yandex.go.flex.common.api.ui.FlexSdkFrameLayout
    public ViewGroup provideEngineContainer() {
        return getBinding().b;
    }

    @Override // defpackage.wdw
    public void setProgressVisibility(boolean isVisible) {
        if (!isVisible) {
            ((qow) this.performanceAnalytics).c(this.firstLoadingEvent);
        }
        GoFrameLayout goFrameLayout = getBinding().c;
        TransitionManager.a(this.progressViewTransition, goFrameLayout);
        goFrameLayout.setVisibility(isVisible ? 0 : 8);
    }

    @Override // com.yandex.go.flex.common.api.ui.FlexSdkFrameLayout
    public qlr getBinding() {
        return this.binding;
    }
}
