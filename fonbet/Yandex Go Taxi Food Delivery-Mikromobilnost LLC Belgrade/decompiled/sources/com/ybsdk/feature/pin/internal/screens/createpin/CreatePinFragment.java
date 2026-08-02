package com.ybsdk.feature.pin.internal.screens.createpin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.b;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView;
import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;
import defpackage.anp0;
import defpackage.b7f;
import defpackage.bmg0;
import defpackage.ce4;
import defpackage.cjm0;
import defpackage.cva1;
import defpackage.cwb0;
import defpackage.d7f;
import defpackage.dcs;
import defpackage.dwb0;
import defpackage.dye;
import defpackage.dzh0;
import defpackage.f7f;
import defpackage.fj3;
import defpackage.g7f;
import defpackage.gwh0;
import defpackage.hm91;
import defpackage.i3y;
import defpackage.kwt0;
import defpackage.lfx;
import defpackage.n751;
import defpackage.nwb0;
import defpackage.ny61;
import defpackage.q761;
import defpackage.sis;
import defpackage.stz0;
import defpackage.sza;
import defpackage.tdr;
import defpackage.tis;
import defpackage.u1w;
import defpackage.u6f;
import defpackage.v6f;
import defpackage.vis;
import defpackage.w511;
import defpackage.w6f;
import defpackage.xty0;
import defpackage.y1x0;
import defpackage.y8f;
import defpackage.yis;
import defpackage.yr31;
import defpackage.z1x0;
import defpackage.zy11;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 F2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u00020\u00062\u00020\u00072\u00020\b:\u0001GB)\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001e\u001a\u00020\u001d*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001bH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J!\u0010.\u001a\u00020\u00152\u0006\u0010+\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0005H\u0014¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u0010\u001aJ!\u00107\u001a\u00020\u00032\u0006\u00104\u001a\u0002032\b\u00106\u001a\u0004\u0018\u000105H\u0014¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020#H\u0016¢\u0006\u0004\b9\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010:R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010;R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010<R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010=R\u0016\u0010>\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D¨\u0006H"}, d2 = {"Lcom/ybsdk/feature/pin/internal/screens/createpin/CreatePinFragment;", "Lce4;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lq761;", "Lg7f;", "Lcom/ybsdk/feature/pin/internal/screens/createpin/a;", "Ltdr;", "Lxdr;", "Lkwt0;", "Ld7f;", "presenterFactory", "Lanp0;", "sdkBottomSheetInsetsProvider", "Ldwb0;", "visualParams", "Lfj3;", "authLandingFeature", "<init>", "(Ld7f;Lanp0;Ldwb0;Lfj3;)V", "Lyis;", "fullScreenMessage", "Lzy11;", "renderError", "(Lyis;)V", "viewState", "setIndicatorAccessibility", "(Lg7f;)V", "", "pageToOpen", "", "getDotsText", "(Lg7f;I)Ljava/lang/String;", "position", "switchToDotsViewToPosition", "(I)V", "", "fitsSystemWindow", "()Z", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "createViewModel", "()Lcom/ybsdk/feature/pin/internal/screens/createpin/a;", "render", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lq761;", "onBackPressed", "Ld7f;", "Lanp0;", "Ldwb0;", "Lfj3;", "lastAnnouncedValue", CA20Status.STATUS_USER_I, "Lcom/ybsdk/feature/pin/internal/screens/createpin/CreatePinScreenParams;", "screenParams$delegate", "Li3y;", "getScreenParams", "()Lcom/ybsdk/feature/pin/internal/screens/createpin/CreatePinScreenParams;", "screenParams", "Companion", "v6f", "feature-pin_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CreatePinFragment extends BaseMvvmFragment<q761, g7f, a> implements ce4, tdr, kwt0 {
    public static final v6f Companion = new v6f();
    public static final String SCREEN_KEY = "CreatePinCodeFragment";
    private final fj3 authLandingFeature;
    private int lastAnnouncedValue;
    private final d7f presenterFactory;

    /* renamed from: screenParams$delegate, reason: from kotlin metadata */
    private final i3y screenParams;
    private final anp0 sdkBottomSheetInsetsProvider;
    private final dwb0 visualParams;

    public CreatePinFragment(d7f d7fVar, anp0 anp0Var, dwb0 dwb0Var, fj3 fj3Var) {
        super(null, null, null, null, a.class, 15, null);
        this.presenterFactory = d7fVar;
        this.sdkBottomSheetInsetsProvider = anp0Var;
        this.visualParams = dwb0Var;
        this.authLandingFeature = fj3Var;
        this.screenParams = dcs.c(this);
    }

    private final String getDotsText(g7f g7fVar, int i) {
        int b = i == 0 ? g7fVar.d().b() : g7fVar.e().b();
        return requireContext().getResources().getQuantityString(gwh0.ybsdk_pin_pin_indicator_accessibility_announcer, b, Integer.valueOf(b));
    }

    private final CreatePinScreenParams getScreenParams() {
        return (CreatePinScreenParams) this.screenParams.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$10$lambda$6(CreatePinFragment createPinFragment, char c) {
        createPinFragment.getViewModel().c0(sza.d(c));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$10$lambda$7(CreatePinFragment createPinFragment) {
        createPinFragment.getViewModel().d0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$10$lambda$8(CreatePinFragment createPinFragment) {
        createPinFragment.authLandingFeature.getClass();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$10$lambda$9(CreatePinFragment createPinFragment) {
        createPinFragment.getViewModel().d0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final stz0 render$lambda$14$lambda$11(g7f g7fVar, stz0 stz0Var) {
        return stz0.a(stz0Var, g7fVar.h(), null, null, null, null, null, false, false, null, null, 0, 32766);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$14$lambda$12(CreatePinFragment createPinFragment) {
        createPinFragment.getViewModel().f0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$14$lambda$13(CreatePinFragment createPinFragment) {
        createPinFragment.getViewModel().f0();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderError(yis fullScreenMessage) {
        q761 q761Var = (q761) getBinding();
        if (fullScreenMessage instanceof vis) {
            q761Var.e.render(null);
            q761Var.f.setVisibility(8);
            return;
        }
        cva1 a = fullScreenMessage.a();
        if (a instanceof sis) {
            q761Var.f.render(((sis) fullScreenMessage.a()).e());
            q761Var.f.setVisibility(0);
            q761Var.e.setVisibility(8);
        } else {
            if (!(a instanceof tis)) {
                w511.b();
                return;
            }
            q761Var.e.render(((tis) fullScreenMessage.a()).e());
            q761Var.f.setVisibility(8);
            q761Var.e.setVisibility(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setIndicatorAccessibility(g7f viewState) {
        ((q761) getBinding()).c.setContentDescription(getDotsText(viewState, 0));
        ((q761) getBinding()).d.setContentDescription(getDotsText(viewState, 1));
        nwb0 d = viewState.c() == 0 ? viewState.d() : viewState.e();
        if (w6f.a[d.a().ordinal()] != 1) {
            b.r(((q761) getBinding()).b, getText(viewState.b().b()));
        } else if (this.lastAnnouncedValue != d.b()) {
            this.lastAnnouncedValue = d.b();
            b.r(((q761) getBinding()).b, getDotsText(viewState, viewState.c()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void switchToDotsViewToPosition(int position) {
        if (((q761) getBinding()).b.getDisplayedChild() != position) {
            ((q761) getBinding()).b.setInAnimation(AnimationUtils.loadAnimation(requireContext(), position == 0 ? bmg0.ybsdk_anim_pin_slide_in_left : bmg0.ybsdk_anim_pin_slide_in_right));
            ((q761) getBinding()).b.setOutAnimation(AnimationUtils.loadAnimation(requireContext(), position == 0 ? bmg0.ybsdk_anim_pin_slide_out_right : bmg0.ybsdk_anim_pin_slide_out_left));
            if (position == 0) {
                ((q761) getBinding()).b.showNext();
            } else {
                ((q761) getBinding()).b.showPrevious();
                b.r(((q761) getBinding()).b, getText(dzh0.ybsdk_card_pin_repeat_hint));
            }
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((f7f) this.presenterFactory).a(getScreenParams());
    }

    @Override // defpackage.tdr
    public boolean fitNavigation() {
        return true;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.xdr
    public boolean fitsSystemWindow() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        q761 q761Var = (q761) getBinding();
        u1w h = insets.a.h(519);
        int i = h.b;
        int i2 = h.d;
        ErrorView errorView = q761Var.e;
        ViewGroup.LayoutParams layoutParams = errorView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i, marginLayoutParams.rightMargin, i2);
        errorView.setLayoutParams(marginLayoutParams);
        ConstraintLayout constraintLayout = q761Var.h;
        ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
        if (layoutParams2 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, i, marginLayoutParams2.rightMargin, i2);
        constraintLayout.setLayoutParams(marginLayoutParams2);
        CommunicationFullScreenView communicationFullScreenView = q761Var.f;
        ViewGroup.LayoutParams layoutParams3 = communicationFullScreenView.getLayoutParams();
        if (layoutParams3 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, i2);
        communicationFullScreenView.setLayoutParams(marginLayoutParams3);
        return insets;
    }

    @Override // defpackage.ce4
    public boolean onBackPressed() {
        return getViewModel().e0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        q761 q761Var = (q761) getBinding();
        if (!isNewInsetsHandlingEnabled() && ((cwb0) this.visualParams).a()) {
            int b = ((cjm0) this.sdkBottomSheetInsetsProvider).b();
            ToolbarView toolbarView = q761Var.k;
            ViewGroup.LayoutParams layoutParams = toolbarView.getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, b, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            toolbarView.setLayoutParams(marginLayoutParams);
            ImageView ybLogo = q761Var.e.getYbLogo();
            ViewGroup.LayoutParams layoutParams2 = ybLogo.getLayoutParams();
            if (layoutParams2 == null) {
                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, b, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                ybLogo.setLayoutParams(marginLayoutParams2);
            }
        }
        NumberKeyboardView numberKeyboardView = q761Var.g;
        ErrorView errorView = q761Var.e;
        numberKeyboardView.setOnCharPressed(new dye(5, this));
        q761Var.g.setOnKeyBackspacePressed(new CreatePinFragment$onViewCreated$1$4(getViewModel()));
        errorView.setPrimaryButtonOnClickListener(new u6f(this, 2));
        errorView.setSecondaryButtonClickListener(new u6f(this, 3));
        q761Var.f.setPrimaryButtonOnClickListener(new u6f(this, 4));
        errorView.setChangeVisibilityWithDelay(false);
        setStatusBarColorModel(new z1x0(y1x0.c()));
        setNavigationBarColorModel(new z1x0(y1x0.c()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(g7f viewState) {
        q761 q761Var = (q761) getBinding();
        switchToDotsViewToPosition(viewState.c());
        q761Var.k.render(new dye(4, viewState));
        hm91.f(q761Var.c, viewState.d(), new u6f(this, 0), new CreatePinFragment$render$1$3(getViewModel()));
        hm91.f(q761Var.d, viewState.e(), new u6f(this, 1), new CreatePinFragment$render$1$5(getViewModel()));
        AppCompatTextView appCompatTextView = q761Var.i;
        appCompatTextView.setText(getText(viewState.b().b()));
        xty0.f(appCompatTextView, viewState.b().a());
        q761Var.h.setVisibility((viewState.g() || !(viewState.a() instanceof vis)) ? 8 : 0);
        q761Var.j.setVisibility(viewState.g() ? 0 : 8);
        setBackButtonVisible(viewState.a() instanceof vis);
        renderError(viewState.a());
        setIndicatorAccessibility(viewState);
        q761Var.g.setEnabled(viewState.f() instanceof b7f);
    }

    @Override // defpackage.kwt0
    public boolean shouldActivateSpoilers() {
        return false;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public q761 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return q761.o(inflater, container);
    }
}
