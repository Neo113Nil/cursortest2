package com.yandex.go.flex.common.facade.routers.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.flex.common.facade.b;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a230;
import defpackage.b230;
import defpackage.cmi;
import defpackage.czo0;
import defpackage.dzg0;
import defpackage.e230;
import defpackage.e2x0;
import defpackage.g0y;
import defpackage.g2h0;
import defpackage.g5c;
import defpackage.gjp0;
import defpackage.hbp0;
import defpackage.hzk;
import defpackage.i3y;
import defpackage.ljr;
import defpackage.nhr;
import defpackage.ny61;
import defpackage.pjr;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.szl;
import defpackage.tje;
import defpackage.tpr;
import defpackage.vng;
import defpackage.w511;
import defpackage.xhr;
import defpackage.xjs;
import defpackage.yjs;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007*\u0001C\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B5\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\rH\u0014¢\u0006\u0004\b%\u0010\u0015J\u000f\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\rH\u0014¢\u0006\u0004\b)\u0010\u0015J\u000f\u0010*\u001a\u00020\u0018H\u0014¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\rH\u0014¢\u0006\u0004\b,\u0010\u0015J\u0017\u0010.\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u0018H\u0016¢\u0006\u0004\b.\u0010\u001eJ\u000f\u0010/\u001a\u00020\u0018H\u0016¢\u0006\u0004\b/\u0010+J\u000f\u00101\u001a\u000200H\u0014¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0018H\u0014¢\u0006\u0004\b3\u0010+J\u0019\u00106\u001a\u00020\r2\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b6\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010:R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010;R\u0016\u0010<\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lcom/yandex/go/flex/common/facade/routers/views/FullscreenFlexView;", "Lcom/yandex/go/flex/common/facade/routers/views/GenericFlexModalView;", "Lg0y;", "Lrkr;", "Landroid/content/Context;", "context", "Lnhr;", "flexConfig", "Lxhr;", "flexController", "Le2x0;", "systemBarsHoldersRepository", "Lkotlin/Function0;", "Lzy11;", "onDetachCallback", "<init>", "(Landroid/content/Context;Lnhr;Lxhr;Le2x0;Lsls;)V", "Lcom/yandex/go/design/view/GoImageView;", "createCloseButton", "()Lcom/yandex/go/design/view/GoImageView;", "addCloseButton", "()V", "removeCloseButton", "Ltpr;", "", "isLightFlow", "setupStatusBar", "(Ltpr;)V", "isLight", "changeTheme", "(Z)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lg0y;", "onAttachedToWindow", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "onDetachedFromWindow", "hasCustomBackground", "()Z", "onBackPressed", "isBackPressedEnabled", "changeBackPressedState", "allowTraverse", "Le230;", "insetsType", "()Le230;", "shouldDismissOnTouchOutside", "Lg5c;", "closeReason", "setCloseTransitionReason", "(Lg5c;)V", "Lnhr;", "Lxhr;", "Le2x0;", "Lsls;", "backPressedEnabled", "Z", "closeButton", "Lcom/yandex/go/design/view/GoImageView;", "Lhbp0;", "scopeDelegate", "Lhbp0;", "yjs", "documentTracker$delegate", "Li3y;", "getDocumentTracker", "()Lyjs;", "documentTracker", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FullscreenFlexView extends GenericFlexModalView<g0y> {
    private boolean backPressedEnabled;
    private GoImageView closeButton;

    /* renamed from: documentTracker$delegate, reason: from kotlin metadata */
    private final i3y documentTracker;
    private final nhr flexConfig;
    private final xhr flexController;
    private final sls onDetachCallback;
    private final hbp0 scopeDelegate;
    private final e2x0 systemBarsHoldersRepository;

    public FullscreenFlexView(Context context, nhr nhrVar, xhr xhrVar, e2x0 e2x0Var, sls slsVar) {
        super(context, nhrVar, xhrVar);
        this.flexConfig = nhrVar;
        this.flexController = xhrVar;
        this.systemBarsHoldersRepository = e2x0Var;
        this.onDetachCallback = slsVar;
        this.backPressedEnabled = true;
        this.scopeDelegate = new hbp0(new czo0(14), "FullscreenFlexView", null);
        this.documentTracker = a.b(LazyThreadSafetyMode.NONE, new xjs(this, 1));
        manualInit();
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        ViewGroup bottomSheet = getBottomSheet();
        Drawable drawable = nhrVar.e;
        bottomSheet.setBackground(drawable == null ? vng.t(g2h0.bg_fullscreen, getContext()) : drawable);
        if (nhrVar.m) {
            this.closeButton = createCloseButton();
        }
        setAnimationDelegate(nhrVar.l.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addCloseButton() {
        GoImageView goImageView = this.closeButton;
        if (goImageView != null) {
            ((g0y) getBinding()).a.addView(goImageView);
            ViewGroup.LayoutParams layoutParams = goImageView.getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 53;
            layoutParams2.width = tje.u(24, goImageView.getContext());
            layoutParams2.height = tje.u(24, goImageView.getContext());
            layoutParams2.topMargin = tje.u(20, goImageView.getContext());
            layoutParams2.rightMargin = tje.u(16, goImageView.getContext());
            goImageView.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeTheme(boolean isLight) {
        if (isLight) {
            setBackgroundColor(-1);
        } else {
            if (isLight) {
                w511.b();
                return;
            }
            setBackgroundColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
        }
        this.systemBarsHoldersRepository.a(0, qoi0.a(FullscreenFlexView.class), isLight);
    }

    private final GoImageView createCloseButton() {
        GoImageView goImageView = new GoImageView(getContext(), null, 0, 6, null);
        goImageView.setImageResource(dzg0.ic_cross_filled);
        goImageView.setOnClickListener(new cmi(25, this));
        Integer num = this.flexConfig.g;
        if (num != null) {
            goImageView.setImageTintList(ColorStateList.valueOf(num.intValue()));
        }
        return goImageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yjs documentTracker_delegate$lambda$0(FullscreenFlexView fullscreenFlexView) {
        return new yjs(fullscreenFlexView);
    }

    private final yjs getDocumentTracker() {
        return (yjs) this.documentTracker.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(FullscreenFlexView fullscreenFlexView) {
        return fullscreenFlexView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void removeCloseButton() {
        GoImageView goImageView = this.closeButton;
        if (goImageView != null) {
            ((g0y) getBinding()).a.removeView(goImageView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupStatusBar(tpr isLightFlow) {
        hbp0.e(this.scopeDelegate, null, null, new FullscreenFlexView$setupStatusBar$1(isLightFlow, this, null), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    /* renamed from: allowTraverse */
    public boolean getIsTrackingsRedesignEnabled() {
        return this.flexConfig.e == null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        Integer num = this.flexConfig.f;
        return num != null ? num.intValue() : super.getBackgroundColor();
    }

    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public g0y bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        return g0y.o(inflater, parent, false);
    }

    @Override // com.yandex.go.flex.common.facade.routers.views.GenericFlexModalView
    public void changeBackPressedState(boolean isBackPressedEnabled) {
        this.backPressedEnabled = isBackPressedEnabled;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: hasCustomBackground */
    public boolean getHasCustomBackgroundColor() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        ljr ljrVar = this.flexConfig.i;
        return (ljrVar == null || !ljrVar.a.a) ? new a230(11, new xjs(this, 0), null) : b230.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        pjr pjrVar;
        super.onAttachedToWindow();
        this.scopeDelegate.a();
        hbp0.e(this.scopeDelegate, null, null, new FullscreenFlexView$onAttachedToWindow$1(this, null), 3);
        setOnTouchOutsideListener(null);
        ljr ljrVar = this.flexConfig.i;
        if (ljrVar != null && (pjrVar = ljrVar.b) != null) {
            ((hzk) pjrVar).s();
        }
        ((b) this.flexController).b(((g0y) getBinding()).b, this);
        addCloseButton();
        ((b) this.flexController).a(getDocumentTracker());
        szl szlVar = this.flexConfig.a.h;
        if (szlVar != null) {
            ((b) this.flexController).a(szlVar);
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        if (this.backPressedEnabled) {
            xhr xhrVar = this.flexController;
            ((b) xhrVar).a.k(new gjp0(Boolean.TRUE));
            super.onBackPressed();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        pjr pjrVar;
        super.onDetachedFromWindow();
        this.scopeDelegate.b();
        ((b) this.flexController).d();
        ((b) this.flexController).c();
        szl szlVar = this.flexConfig.a.h;
        if (szlVar != null) {
            ((b) this.flexController).e(szlVar);
        }
        ((b) this.flexController).e(getDocumentTracker());
        if (this.flexConfig.d != null) {
            this.systemBarsHoldersRepository.b(qoi0.a(FullscreenFlexView.class));
        }
        ljr ljrVar = this.flexConfig.i;
        if (ljrVar != null && (pjrVar = ljrVar.b) != null) {
            ((com.yandex.div.core.expression.variables.a) ((hzk) pjrVar).b).k("handleInsetsInFlex", "ignoreFitSystemWindows");
        }
        this.onDetachCallback.invoke();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void setCloseTransitionReason(g5c closeReason) {
        if (closeReason != null) {
            this.flexConfig.l.b();
        }
        super.setCloseTransitionReason(closeReason);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: shouldDismissOnTouchOutside */
    public boolean getDismissOnTouchOutside() {
        return false;
    }
}
