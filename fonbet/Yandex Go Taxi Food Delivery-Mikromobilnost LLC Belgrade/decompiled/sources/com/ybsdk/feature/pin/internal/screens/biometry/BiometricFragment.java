package com.ybsdk.feature.pin.internal.screens.biometry;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.feature.pin.api.entities.BiometricHelper$PromptContent;
import com.ybsdk.feature.pin.api.entities.BiometricHelper$PromptMode;
import com.ybsdk.feature.pin.internal.screens.biometry.BiometricFragment;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.ay5;
import defpackage.b9s0;
import defpackage.c661;
import defpackage.dcs;
import defpackage.ey5;
import defpackage.hx5;
import defpackage.i3y;
import defpackage.ix5;
import defpackage.lfx;
import defpackage.p6s0;
import defpackage.qas0;
import defpackage.qy5;
import defpackage.sy5;
import defpackage.tls;
import defpackage.ux5;
import defpackage.x4c;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R)\u0010*\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\u00030$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lcom/ybsdk/feature/pin/internal/screens/biometry/BiometricFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lc661;", "Lzy11;", "Lcom/ybsdk/feature/pin/internal/screens/biometry/b;", "Lqy5;", "biometricPresenter", "Lux5;", "biometricHelper", "<init>", "(Lqy5;Lux5;)V", "showBiometricPrompt", "(Lux5;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "createViewModel", "()Lcom/ybsdk/feature/pin/internal/screens/biometry/b;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lc661;", "viewState", "render", "(Lzy11;)V", "Lqy5;", "Lux5;", "Lkotlin/Function1;", "Lay5;", "successCallback$delegate", "Li3y;", "getSuccessCallback", "()Ltls;", "successCallback", "Lcom/ybsdk/feature/pin/internal/screens/biometry/BiometricScreenParams;", "screenParams$delegate", "getScreenParams", "()Lcom/ybsdk/feature/pin/internal/screens/biometry/BiometricScreenParams;", "screenParams", "Ley5;", "biometricPrompt$delegate", "getBiometricPrompt", "()Ley5;", "biometricPrompt", "feature-pin_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BiometricFragment extends BaseMvvmFragment<c661, zy11, b> {
    private final ux5 biometricHelper;
    private final qy5 biometricPresenter;

    /* renamed from: biometricPrompt$delegate, reason: from kotlin metadata */
    private final i3y biometricPrompt;

    /* renamed from: screenParams$delegate, reason: from kotlin metadata */
    private final i3y screenParams;

    /* renamed from: successCallback$delegate, reason: from kotlin metadata */
    private final i3y successCallback;

    public BiometricFragment(qy5 qy5Var, ux5 ux5Var) {
        super(Boolean.FALSE, null, null, null, b.class, 14, null);
        this.biometricPresenter = qy5Var;
        this.biometricHelper = ux5Var;
        this.successCallback = kotlin.a.a(new hx5(this, 0));
        this.screenParams = dcs.c(this);
        this.biometricPrompt = kotlin.a.a(new hx5(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ey5 biometricPrompt_delegate$lambda$6(BiometricFragment biometricFragment) {
        int i = 2;
        return ((com.ybsdk.feature.pin.internal.domain.biometric.a) biometricFragment.biometricHelper).a(biometricFragment, biometricFragment.getSuccessCallback(), new hx5(biometricFragment, i), new ix5(biometricFragment, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 biometricPrompt_delegate$lambda$6$lambda$4(BiometricFragment biometricFragment) {
        biometricFragment.getViewModel().f0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 biometricPrompt_delegate$lambda$6$lambda$5(BiometricFragment biometricFragment, int i) {
        biometricFragment.getViewModel().g0(i);
        return zy11.a;
    }

    private final ey5 getBiometricPrompt() {
        return (ey5) this.biometricPrompt.getValue();
    }

    private final BiometricScreenParams getScreenParams() {
        return (BiometricScreenParams) this.screenParams.getValue();
    }

    private final tls getSuccessCallback() {
        return (tls) this.successCallback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$7(BiometricFragment biometricFragment, View view) {
        biometricFragment.getViewModel().e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$8(BiometricFragment biometricFragment, View view) {
        biometricFragment.getViewModel().h0();
    }

    private final void showBiometricPrompt(ux5 biometricHelper) {
        ((com.ybsdk.feature.pin.internal.domain.biometric.a) biometricHelper).d(this, BiometricHelper$PromptMode.Encrypt, getBiometricPrompt(), BiometricHelper$PromptContent.Add, getViewModel().c0(), new ix5(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showBiometricPrompt$lambda$9(BiometricFragment biometricFragment, Throwable th) {
        biometricFragment.getViewModel().d0(th);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tls successCallback_delegate$lambda$3(BiometricFragment biometricFragment) {
        return new ix5(biometricFragment, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 successCallback_delegate$lambda$3$lambda$2(BiometricFragment biometricFragment, ay5 ay5Var) {
        Object failure;
        boolean isDetached = biometricFragment.isDetached();
        zy11 zy11Var = zy11.a;
        if (!isDetached) {
            try {
                biometricFragment.getViewModel().b0(ay5Var);
                failure = zy11Var;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                x4c.g("Failed to send biometric success", a, null, null, 12);
            }
        }
        return zy11Var;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof p6s0) {
            showBiometricPrompt(((p6s0) sideEffect).a());
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
        return ((sy5) this.biometricPresenter).a(getScreenParams());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((c661) getBinding()).d.announceTitleForAccessibility();
        final int i = 0;
        ((c661) getBinding()).b.setOnClickListener(new View.OnClickListener(this) { // from class: jx5
            public final /* synthetic */ BiometricFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                BiometricFragment biometricFragment = this.b;
                switch (i2) {
                    case 0:
                        BiometricFragment.onViewCreated$lambda$7(biometricFragment, view2);
                        break;
                    default:
                        BiometricFragment.onViewCreated$lambda$8(biometricFragment, view2);
                        break;
                }
            }
        });
        final int i2 = 1;
        ((c661) getBinding()).c.setOnClickListener(new View.OnClickListener(this) { // from class: jx5
            public final /* synthetic */ BiometricFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                BiometricFragment biometricFragment = this.b;
                switch (i22) {
                    case 0:
                        BiometricFragment.onViewCreated$lambda$7(biometricFragment, view2);
                        break;
                    default:
                        BiometricFragment.onViewCreated$lambda$8(biometricFragment, view2);
                        break;
                }
            }
        });
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public c661 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return c661.o(inflater, container);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(zy11 viewState) {
    }
}
