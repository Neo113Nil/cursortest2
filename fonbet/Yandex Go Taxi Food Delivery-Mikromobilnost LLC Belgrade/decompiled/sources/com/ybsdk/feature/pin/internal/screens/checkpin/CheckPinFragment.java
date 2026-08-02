package com.ybsdk.feature.pin.internal.screens.checkpin;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentManager;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.feature.pin.api.SecondFactorHelper$SecondFactorResult;
import com.ybsdk.feature.pin.api.entities.BiometricHelper$PromptContent;
import com.ybsdk.feature.pin.api.entities.BiometricHelper$PromptMode;
import com.ybsdk.feature.pin.internal.domain.PinState;
import com.ybsdk.feature.pin.internal.screens.checkpin.CheckPinFragment;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.PinCodeDotsView;
import com.ybsdk.widgets.common.SignOutButton;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.awb0;
import defpackage.ay5;
import defpackage.b9s0;
import defpackage.ce4;
import defpackage.dcs;
import defpackage.e48;
import defpackage.ey5;
import defpackage.eyp0;
import defpackage.fhb;
import defpackage.fj3;
import defpackage.ghb;
import defpackage.gwh0;
import defpackage.hm91;
import defpackage.i3y;
import defpackage.ihb;
import defpackage.jbs0;
import defpackage.jl40;
import defpackage.kao;
import defpackage.kwt0;
import defpackage.lfx;
import defpackage.o761;
import defpackage.od9;
import defpackage.qas0;
import defpackage.r5s0;
import defpackage.sls;
import defpackage.stz0;
import defpackage.sza;
import defpackage.thb;
import defpackage.tls;
import defpackage.ux5;
import defpackage.w511;
import defpackage.x4e;
import defpackage.xty0;
import defpackage.y0c;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0001UB)\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010%\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0014¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0004H\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00132\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b0\u0010 J\u001f\u00103\u001a\u00020\u00132\u0006\u00102\u001a\u0002012\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b3\u00104R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00105R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00106R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00107R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R)\u0010B\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010=\u0012\u0004\u0012\u00020\u00130<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR'\u0010E\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u00130<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010?\u001a\u0004\bD\u0010AR!\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00130F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010?\u001a\u0004\bH\u0010IR\u001b\u0010O\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010?\u001a\u0004\bM\u0010NR\u001b\u0010T\u001a\u00020P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010?\u001a\u0004\bR\u0010S¨\u0006V"}, d2 = {"Lcom/ybsdk/feature/pin/internal/screens/checkpin/CheckPinFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lo761;", "Lthb;", "Lcom/ybsdk/feature/pin/internal/screens/checkpin/b;", "Lce4;", "Lkwt0;", "Lcom/ybsdk/feature/pin/internal/screens/checkpin/a;", "presenterFactory", "Leyp0;", "secondFactorHelper", "Lux5;", "biometricHelper", "Lfj3;", "authLandingFeature", "<init>", "(Lcom/ybsdk/feature/pin/internal/screens/checkpin/a;Leyp0;Lux5;Lfj3;)V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onPause", "()V", "onResume", "onDestroyView", "viewState", "render", "(Lthb;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lo761;", "createViewModel", "()Lcom/ybsdk/feature/pin/internal/screens/checkpin/b;", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "", "onBackPressed", "()Z", "setIndicatorAccessibility", "Lcom/ybsdk/feature/pin/internal/screens/checkpin/CheckType;", "type", "showBiometricPrompt", "(Lcom/ybsdk/feature/pin/internal/screens/checkpin/CheckType;Lux5;)V", "Lcom/ybsdk/feature/pin/internal/screens/checkpin/a;", "Leyp0;", "Lux5;", "Lfj3;", "", "lastAnnouncedValue", CA20Status.STATUS_USER_I, "Lkotlin/Function1;", "Lay5;", "successCallback$delegate", "Li3y;", "getSuccessCallback", "()Ltls;", "successCallback", "errorCallback$delegate", "getErrorCallback", "errorCallback", "Lkotlin/Function0;", "cancelCallback$delegate", "getCancelCallback", "()Lsls;", "cancelCallback", "Ley5;", "biometricPrompt$delegate", "getBiometricPrompt", "()Ley5;", "biometricPrompt", "Lcom/ybsdk/feature/pin/internal/screens/checkpin/CheckPinFragment$CheckPinScreenParams;", "screenParams$delegate", "getScreenParams", "()Lcom/ybsdk/feature/pin/internal/screens/checkpin/CheckPinFragment$CheckPinScreenParams;", "screenParams", "CheckPinScreenParams", "feature-pin_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CheckPinFragment extends BaseMvvmFragment<o761, thb, b> implements ce4, kwt0 {
    private final fj3 authLandingFeature;
    private final ux5 biometricHelper;

    /* renamed from: biometricPrompt$delegate, reason: from kotlin metadata */
    private final i3y biometricPrompt;

    /* renamed from: cancelCallback$delegate, reason: from kotlin metadata */
    private final i3y cancelCallback;

    /* renamed from: errorCallback$delegate, reason: from kotlin metadata */
    private final i3y errorCallback;
    private int lastAnnouncedValue;
    private final a presenterFactory;

    /* renamed from: screenParams$delegate, reason: from kotlin metadata */
    private final i3y screenParams;
    private final eyp0 secondFactorHelper;

    /* renamed from: successCallback$delegate, reason: from kotlin metadata */
    private final i3y successCallback;

    public CheckPinFragment(a aVar, eyp0 eyp0Var, ux5 ux5Var, fj3 fj3Var) {
        super(null, null, null, null, b.class, 15, null);
        this.presenterFactory = aVar;
        this.secondFactorHelper = eyp0Var;
        this.biometricHelper = ux5Var;
        this.authLandingFeature = fj3Var;
        this.successCallback = kotlin.a.a(new fhb(this, 1));
        this.errorCallback = kotlin.a.a(new fhb(this, 2));
        this.cancelCallback = kotlin.a.a(new fhb(this, 3));
        this.biometricPrompt = kotlin.a.a(new fhb(this, 4));
        this.screenParams = dcs.c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ey5 biometricPrompt_delegate$lambda$6(CheckPinFragment checkPinFragment) {
        return ((com.ybsdk.feature.pin.internal.domain.biometric.a) checkPinFragment.biometricHelper).a(checkPinFragment, checkPinFragment.getSuccessCallback(), checkPinFragment.getCancelCallback(), checkPinFragment.getErrorCallback());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sls cancelCallback_delegate$lambda$5(CheckPinFragment checkPinFragment) {
        return new fhb(checkPinFragment, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 cancelCallback_delegate$lambda$5$lambda$4(CheckPinFragment checkPinFragment) {
        checkPinFragment.getViewModel().n0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tls errorCallback_delegate$lambda$3(CheckPinFragment checkPinFragment) {
        return new ghb(checkPinFragment, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 errorCallback_delegate$lambda$3$lambda$2(CheckPinFragment checkPinFragment, int i) {
        checkPinFragment.getViewModel().w0(i);
        return zy11.a;
    }

    private final ey5 getBiometricPrompt() {
        return (ey5) this.biometricPrompt.getValue();
    }

    private final sls getCancelCallback() {
        return (sls) this.cancelCallback.getValue();
    }

    private final tls getErrorCallback() {
        return (tls) this.errorCallback.getValue();
    }

    private final CheckPinScreenParams getScreenParams() {
        return (CheckPinScreenParams) this.screenParams.getValue();
    }

    private final tls getSuccessCallback() {
        return (tls) this.successCallback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$7(CheckPinFragment checkPinFragment, String str, Bundle bundle) {
        SecondFactorHelper$SecondFactorResult a = ((awb0) checkPinFragment.secondFactorHelper).a(bundle);
        if (jl40.l(a, SecondFactorHelper$SecondFactorResult.Cancel.INSTANCE) || !(a instanceof SecondFactorHelper$SecondFactorResult.VerificationToken)) {
            return;
        }
        checkPinFragment.getViewModel().y0(((SecondFactorHelper$SecondFactorResult.VerificationToken) a).getVerificationToken());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$13$lambda$10(CheckPinFragment checkPinFragment) {
        checkPinFragment.authLandingFeature.getClass();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$13$lambda$11(CheckPinFragment checkPinFragment, View view) {
        checkPinFragment.authLandingFeature.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$13$lambda$12(CheckPinFragment checkPinFragment, String str) {
        checkPinFragment.getViewModel().v0(str);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$13$lambda$8(CheckPinFragment checkPinFragment, char c) {
        checkPinFragment.getViewModel().h0(sza.d(c));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$13$lambda$9(CheckPinFragment checkPinFragment) {
        checkPinFragment.getViewModel().s0(true, null);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$14(CheckPinFragment checkPinFragment, View view) {
        checkPinFragment.getViewModel().s0(false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final stz0 render$lambda$18$lambda$15(thb thbVar, stz0 stz0Var) {
        return stz0.a(stz0Var, thbVar.l(), null, null, null, null, null, false, false, null, null, 0, 32766);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setIndicatorAccessibility(thb viewState) {
        ((o761) getBinding()).f.setContentDescription(requireContext().getResources().getQuantityString(gwh0.ybsdk_pin_pin_indicator_accessibility_announcer, viewState.e().b(), Integer.valueOf(viewState.e().b())));
        if (ihb.a[viewState.e().a().ordinal()] != 1) {
            androidx.core.view.b.r(((o761) getBinding()).f, com.ybsdk.core.utils.text.d.a(requireContext(), viewState.c().b()));
        } else {
            if (this.lastAnnouncedValue == viewState.e().b() || viewState.e().a() != PinState.NORMAL) {
                return;
            }
            this.lastAnnouncedValue = viewState.e().b();
        }
    }

    private final void showBiometricPrompt(CheckType type, ux5 biometricHelper) {
        BiometricHelper$PromptMode biometricHelper$PromptMode;
        int i = ihb.b[type.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            biometricHelper$PromptMode = BiometricHelper$PromptMode.Decrypt;
        } else {
            if (i != 4 && i != 5) {
                w511.b();
                return;
            }
            biometricHelper$PromptMode = BiometricHelper$PromptMode.Encrypt;
        }
        ((com.ybsdk.feature.pin.internal.domain.biometric.a) biometricHelper).d(this, biometricHelper$PromptMode, getBiometricPrompt(), BiometricHelper$PromptContent.Verify, getViewModel().k0(), new ghb(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showBiometricPrompt$lambda$19(CheckPinFragment checkPinFragment, Throwable th) {
        checkPinFragment.getViewModel().p0(th);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tls successCallback_delegate$lambda$1(CheckPinFragment checkPinFragment) {
        return new ghb(checkPinFragment, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 successCallback_delegate$lambda$1$lambda$0(CheckPinFragment checkPinFragment, ay5 ay5Var) {
        checkPinFragment.getViewModel().q0(ay5Var);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof y0c) {
            PinCodeDotsView.clear$default(((o761) getBinding()).f, null, 1, null);
            return;
        }
        if (sideEffect instanceof r5s0) {
            r5s0 r5s0Var = (r5s0) sideEffect;
            showBiometricPrompt(r5s0Var.b(), r5s0Var.a());
        } else if (sideEffect instanceof b9s0) {
            com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), ((b9s0) sideEffect).a(), null, 12);
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public b getFactoryOfViewModel() {
        return ((d) this.presenterFactory).a(getScreenParams());
    }

    @Override // defpackage.ce4
    public boolean onBackPressed() {
        getViewModel().m0();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        this.secondFactorHelper.getClass();
        parentFragmentManager.m0("request_key_authorization", this, new e48(25, this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getBiometricPrompt().b();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        getViewModel().u0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getViewModel().x0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getViewModel().r0();
        o761 o761Var = (o761) getBinding();
        o761Var.d.setOnCharPressed(new ghb(this, 3));
        NumberKeyboardView numberKeyboardView = o761Var.d;
        numberKeyboardView.setOnKeyBackspacePressed(new CheckPinFragment$onViewCreated$1$2(getViewModel()));
        numberKeyboardView.setOnBiometricPressed(new CheckPinFragment$onViewCreated$1$3(getViewModel()));
        ErrorView errorView = o761Var.b;
        errorView.setPrimaryButtonOnClickListener(new fhb(this, 5));
        errorView.setSecondaryButtonClickListener(new fhb(this, 6));
        final int i = 0;
        o761Var.h.setOnClickListener(new View.OnClickListener(this) { // from class: hhb
            public final /* synthetic */ CheckPinFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                CheckPinFragment checkPinFragment = this.b;
                switch (i2) {
                    case 0:
                        CheckPinFragment.onViewCreated$lambda$13$lambda$11(checkPinFragment, view2);
                        break;
                    default:
                        CheckPinFragment.onViewCreated$lambda$14(checkPinFragment, view2);
                        break;
                }
            }
        });
        o761Var.e.setActionHandler(new ghb(this, 4));
        com.ybsdk.core.utils.ext.view.b.m(o761Var.j);
        final int i2 = 1;
        ((o761) getBinding()).c.setOnClickListener(new View.OnClickListener(this) { // from class: hhb
            public final /* synthetic */ CheckPinFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                CheckPinFragment checkPinFragment = this.b;
                switch (i22) {
                    case 0:
                        CheckPinFragment.onViewCreated$lambda$13$lambda$11(checkPinFragment, view2);
                        break;
                    default:
                        CheckPinFragment.onViewCreated$lambda$14(checkPinFragment, view2);
                        break;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(thb viewState) {
        o761 o761Var = (o761) getBinding();
        ToolbarView toolbarView = o761Var.j;
        NumberKeyboardView numberKeyboardView = o761Var.d;
        AppCompatTextView appCompatTextView = o761Var.g;
        SignOutButton signOutButton = o761Var.h;
        toolbarView.setVisibility(viewState.j() ? 4 : 0);
        o761Var.j.render(new od9(21, viewState));
        signOutButton.setVisibility((viewState.k() == null || !viewState.j()) ? 8 : 0);
        o761Var.k.setVisibility(viewState.f() ? 0 : 8);
        jbs0 k = viewState.k();
        if (k != null) {
            signOutButton.render(k);
        }
        o761Var.i.setVisibility(viewState.h() ? 8 : 0);
        o761Var.c.setVisibility(viewState.i() ? 0 : 4);
        hm91.f(o761Var.f, viewState.e(), new CheckPinFragment$render$1$3(getViewModel()), new CheckPinFragment$render$1$4(getViewModel()));
        appCompatTextView.setText(com.ybsdk.core.utils.text.d.a(requireContext(), viewState.c().b()));
        xty0.f(appCompatTextView, viewState.c().a());
        ErrorView errorView = o761Var.b;
        kao b = viewState.b();
        if (!viewState.h()) {
            b = null;
        }
        errorView.render(b);
        numberKeyboardView.setBiometricEnabled(viewState.g());
        setBackButtonVisible(!viewState.h());
        numberKeyboardView.setEnabled(viewState.e().a() == PinState.NORMAL);
        o761Var.e.render(viewState.d());
        setIndicatorAccessibility(viewState);
        setBackButtonVisible(viewState.a());
    }

    @Override // defpackage.kwt0
    public boolean shouldActivateSpoilers() {
        return false;
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J0\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0018¨\u0006'"}, d2 = {"Lcom/ybsdk/feature/pin/internal/screens/checkpin/CheckPinFragment$CheckPinScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "Lcom/ybsdk/feature/pin/internal/screens/checkpin/CheckType;", "checkType", "", "originDeeplink", "", "dropBackStack", "<init>", "(Lcom/ybsdk/feature/pin/internal/screens/checkpin/CheckType;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/pin/internal/screens/checkpin/CheckType;", "component2", "()Ljava/lang/String;", "component3", "()Z", "copy", "(Lcom/ybsdk/feature/pin/internal/screens/checkpin/CheckType;Ljava/lang/String;Z)Lcom/ybsdk/feature/pin/internal/screens/checkpin/CheckPinFragment$CheckPinScreenParams;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/pin/internal/screens/checkpin/CheckType;", "getCheckType", "Ljava/lang/String;", "getOriginDeeplink", "Z", "getDropBackStack", "feature-pin_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class CheckPinScreenParams implements ScreenParams {
        public static final Parcelable.Creator<CheckPinScreenParams> CREATOR = new Creator();
        private final CheckType checkType;
        private final boolean dropBackStack;
        private final String originDeeplink;

        public /* synthetic */ CheckPinScreenParams(CheckType checkType, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(checkType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? true : z);
        }

        public static /* synthetic */ CheckPinScreenParams copy$default(CheckPinScreenParams checkPinScreenParams, CheckType checkType, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                checkType = checkPinScreenParams.checkType;
            }
            if ((i & 2) != 0) {
                str = checkPinScreenParams.originDeeplink;
            }
            if ((i & 4) != 0) {
                z = checkPinScreenParams.dropBackStack;
            }
            return checkPinScreenParams.copy(checkType, str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final CheckType getCheckType() {
            return this.checkType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getOriginDeeplink() {
            return this.originDeeplink;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getDropBackStack() {
            return this.dropBackStack;
        }

        public final CheckPinScreenParams copy(CheckType checkType, String originDeeplink, boolean dropBackStack) {
            return new CheckPinScreenParams(checkType, originDeeplink, dropBackStack);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CheckPinScreenParams)) {
                return false;
            }
            CheckPinScreenParams checkPinScreenParams = (CheckPinScreenParams) other;
            return this.checkType == checkPinScreenParams.checkType && jl40.l(this.originDeeplink, checkPinScreenParams.originDeeplink) && this.dropBackStack == checkPinScreenParams.dropBackStack;
        }

        public final CheckType getCheckType() {
            return this.checkType;
        }

        public final boolean getDropBackStack() {
            return this.dropBackStack;
        }

        public final String getOriginDeeplink() {
            return this.originDeeplink;
        }

        public int hashCode() {
            int hashCode = this.checkType.hashCode() * 31;
            String str = this.originDeeplink;
            return Boolean.hashCode(this.dropBackStack) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            CheckType checkType = this.checkType;
            String str = this.originDeeplink;
            boolean z = this.dropBackStack;
            StringBuilder sb = new StringBuilder("CheckPinScreenParams(checkType=");
            sb.append(checkType);
            sb.append(", originDeeplink=");
            sb.append(str);
            sb.append(", dropBackStack=");
            return x4e.i(sb, z, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.checkType.name());
            dest.writeString(this.originDeeplink);
            dest.writeInt(this.dropBackStack ? 1 : 0);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CheckPinScreenParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CheckPinScreenParams createFromParcel(Parcel parcel) {
                return new CheckPinScreenParams(CheckType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CheckPinScreenParams[] newArray(int i) {
                return new CheckPinScreenParams[i];
            }
        }

        public CheckPinScreenParams(CheckType checkType, String str, boolean z) {
            this.checkType = checkType;
            this.originDeeplink = str;
            this.dropBackStack = z;
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public o761 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return o761.o(inflater, container);
    }
}
