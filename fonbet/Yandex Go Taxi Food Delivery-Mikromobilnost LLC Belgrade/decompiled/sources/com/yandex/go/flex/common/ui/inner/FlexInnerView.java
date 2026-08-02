package com.yandex.go.flex.common.ui.inner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.flex.common.ui.inner.FlexInnerView;
import defpackage.c230;
import defpackage.e230;
import defpackage.ijr;
import defpackage.kth0;
import defpackage.ny61;
import defpackage.pey;
import defpackage.sls;
import defpackage.u1m;
import defpackage.vng;
import defpackage.wlr;
import defpackage.y130;
import defpackage.y5e;
import flex.engine.a;
import kotlin.Metadata;
import ru.yandex.taxi.animation.NavigationDirection;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001f\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/yandex/go/flex/common/ui/inner/FlexInnerView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lwlr;", "Landroid/content/Context;", "context", "Lflex/engine/a;", "engine", "Lijr;", "configuration", "<init>", "(Landroid/content/Context;Lflex/engine/a;Lijr;)V", "Le230;", "insetsType", "()Le230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lwlr;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Ljava/lang/Runnable;", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "startAction", "endAction", "animateDismiss", "Lflex/engine/a;", "Lijr;", "", "getFullscreen", "()Z", "fullscreen", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FlexInnerView extends SlideableBindingModalView<wlr> {
    private final ijr configuration;
    private final a engine;

    public FlexInnerView(Context context, a aVar, ijr ijrVar) {
        super(context);
        this.engine = aVar;
        this.configuration = ijrVar;
        setCardMode(ijrVar.b ? SlideableModalView.CardMode.FULLSCREEN : SlideableModalView.CardMode.FIXED_CARD);
        u1m u1mVar = ijrVar.d;
        if (u1mVar != null) {
            a.q(aVar, u1mVar, ijrVar.c, false, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(FlexInnerView flexInnerView) {
        return flexInnerView.getBinding().b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$1(FlexInnerView flexInnerView) {
        return flexInnerView.getBinding().b;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        if (this.configuration.a) {
            y5e.c(getContent(), startAction, endAction, NavigationDirection.BACKWARD, 4);
        } else {
            super.animateDismiss(startAction, endAction);
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        if (this.configuration.a) {
            y5e.d(getContent(), onAnimateShowStartAction, onAnimateShowEndAction, NavigationDirection.FORWARD, 4);
        } else {
            super.animateShow(onAnimateShowStartAction, onAnimateShowEndAction);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public wlr bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(kth0.flex_sdk_inner_view, (ViewGroup) this, false);
        if (inflate != null) {
            GoFrameLayout goFrameLayout = (GoFrameLayout) inflate;
            return new wlr(goFrameLayout, goFrameLayout);
        }
        ny61.t("rootView");
        return null;
    }

    public final boolean getFullscreen() {
        return this.configuration.b;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        if (this.configuration.b) {
            final int i = 0;
            return new y130(1, new sls(this) { // from class: hjr
                public final /* synthetic */ FlexInnerView b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    View insetsType$lambda$0;
                    View insetsType$lambda$1;
                    int i2 = i;
                    FlexInnerView flexInnerView = this.b;
                    switch (i2) {
                        case 0:
                            insetsType$lambda$0 = FlexInnerView.insetsType$lambda$0(flexInnerView);
                            return insetsType$lambda$0;
                        default:
                            insetsType$lambda$1 = FlexInnerView.insetsType$lambda$1(flexInnerView);
                            return insetsType$lambda$1;
                    }
                }
            });
        }
        final int i2 = 1;
        return new c230(0, new sls(this) { // from class: hjr
            public final /* synthetic */ FlexInnerView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                View insetsType$lambda$0;
                View insetsType$lambda$1;
                int i22 = i2;
                FlexInnerView flexInnerView = this.b;
                switch (i22) {
                    case 0:
                        insetsType$lambda$0 = FlexInnerView.insetsType$lambda$0(flexInnerView);
                        return insetsType$lambda$0;
                    default:
                        insetsType$lambda$1 = FlexInnerView.insetsType$lambda$1(flexInnerView);
                        return insetsType$lambda$1;
                }
            }
        }, false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        pey o = vng.o(getBinding().b);
        if (o != null) {
            this.engine.g(getBinding().b, o);
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.engine.j();
        super.onDetachedFromWindow();
    }
}
