package com.yandex.payment.sdk.ui.payment.sbp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.yandex.payment.common.result.ResultType;
import com.yandex.payment.common.sbp.SbpOperation;
import com.yandex.payment.sdk.core.data.PaymentToken;
import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import com.yandex.payment.sdk.ui.BaseActivity;
import com.yandex.payment.sdk.ui.ViewBindingActivityImpl;
import com.yandex.payment.sdk.ui.view.payment.PaymentButtonView;
import defpackage.apa1;
import defpackage.ay90;
import defpackage.azj0;
import defpackage.b88;
import defpackage.bqr0;
import defpackage.d1d;
import defpackage.ddf;
import defpackage.eyf0;
import defpackage.i3y;
import defpackage.j9h0;
import defpackage.jgm0;
import defpackage.kv5;
import defpackage.ls31;
import defpackage.mx60;
import defpackage.mxk;
import defpackage.omo;
import defpackage.oy80;
import defpackage.p7u;
import defpackage.pub1;
import defpackage.pwf;
import defpackage.qv90;
import defpackage.qwf;
import defpackage.r720;
import defpackage.rgm0;
import defpackage.roa0;
import defpackage.rv5;
import defpackage.sv5;
import defpackage.sv90;
import defpackage.v40;
import defpackage.wy4;
import defpackage.xsf;
import defpackage.y8h;
import defpackage.yv90;
import defpackage.zbq0;
import defpackage.zcy;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 =2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002>?B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\"\u0010\u0019R\u001b\u0010(\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,R\u001a\u0010/\u001a\u00020.8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00105¨\u0006@"}, d2 = {"Lcom/yandex/payment/sdk/ui/payment/sbp/BindSbpActivity;", "Lcom/yandex/payment/sdk/ui/ViewBindingActivityImpl;", "Lbqr0;", "Lroa0;", "Lp7u;", "<init>", "()V", "Lzy11;", "backPressed", "cancelAndFinish", "Landroid/view/View;", "getBlurView", "()Landroid/view/View;", "Landroid/widget/ImageView;", "getSlideView", "()Landroid/widget/ImageView;", "Landroid/widget/FrameLayout;", "getSheetView", "()Landroid/widget/FrameLayout;", "Landroid/widget/TextView;", "getDebugView", "()Landroid/widget/TextView;", "Landroidx/fragment/app/Fragment;", "fragment", "onAttachFragment", "(Landroidx/fragment/app/Fragment;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "tryCloseActivity", "Ld1d;", "componentDispatcher", "()Ld1d;", "showLoadingFragment$paymentsdk_release", "showLoadingFragment", "activityViewModel$delegate", "Li3y;", "getActivityViewModel", "()Lbqr0;", "activityViewModel", "Lay90;", "paymentComponent$delegate", "getPaymentComponent", "()Lay90;", "paymentComponent", "Landroid/content/BroadcastReceiver;", "dismissInterfaceReceiver", "Landroid/content/BroadcastReceiver;", "getDismissInterfaceReceiver$paymentsdk_release", "()Landroid/content/BroadcastReceiver;", "", "getContentContainerId", "()I", "contentContainerId", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getMainContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "mainContainer", "getExitContainerId", "exitContainerId", "Companion", "a", "sv5", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BindSbpActivity extends ViewBindingActivityImpl<bqr0, roa0> implements p7u {
    private static final String ARG_RESULT_TYPE = "ARG_RESULT_TYPE";
    public static final sv5 Companion = new sv5();

    /* renamed from: activityViewModel$delegate, reason: from kotlin metadata */
    private final i3y activityViewModel = kotlin.a.b(LazyThreadSafetyMode.NONE, new rv5(this, 0));

    /* renamed from: paymentComponent$delegate, reason: from kotlin metadata */
    private final i3y paymentComponent = kotlin.a.a(new rv5(this, 1));
    private final BroadcastReceiver dismissInterfaceReceiver = new BroadcastReceiver() { // from class: com.yandex.payment.sdk.ui.payment.sbp.BindSbpActivity$dismissInterfaceReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BindSbpActivity.this.cancelAndFinish();
        }
    };

    public static final class a implements eyf0 {
        @Override // defpackage.eyf0
        public final b88 getCard3DSWebViewDelegateFactory() {
            return new com.yandex.payment.sdk.ui.payment.sbp.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bqr0 activityViewModel_delegate$lambda$0(BindSbpActivity bindSbpActivity) {
        return (bqr0) new ls31(bindSbpActivity, new r720(1, ((pwf) bindSbpActivity.getBaseComponent$paymentsdk_release()).c())).b(bqr0.class);
    }

    private final void backPressed() {
        if (getSupportFragmentManager().K() > 1) {
            getSupportFragmentManager().V();
            return;
        }
        qv90.a.getClass();
        reportEvent(sv90.h());
        getActivityViewModel().Y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelAndFinish() {
        ((yv90) ((pwf) getBaseComponent$paymentsdk_release()).f()).j.c();
        finishWithResult$paymentsdk_release();
    }

    private final ay90 getPaymentComponent() {
        return (ay90) this.paymentComponent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView onAttachFragment$lambda$0(BindSbpActivity bindSbpActivity) {
        return bindSbpActivity.getBinding().e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaymentButtonView onAttachFragment$lambda$1(BindSbpActivity bindSbpActivity) {
        return bindSbpActivity.getBinding().f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreate$lambda$1(BindSbpActivity bindSbpActivity, mx60 mx60Var) {
        bindSbpActivity.backPressed();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ay90 paymentComponent_delegate$lambda$0(BindSbpActivity bindSbpActivity) {
        wy4 baseComponent$paymentsdk_release = bindSbpActivity.getBaseComponent$paymentsdk_release();
        return new qwf(((pwf) baseComponent$paymentsdk_release).a, new oy80(6, new PaymentToken(""), null));
    }

    @Override // defpackage.p7u
    public d1d componentDispatcher() {
        y8h y8hVar = new y8h();
        y8hVar.a(wy4.class, getBaseComponent$paymentsdk_release());
        y8hVar.a(mxk.class, getDivKitComponent$paymentsdk_release());
        return y8hVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.payment.sdk.ui.ViewBindingActivityImpl
    public bqr0 getActivityViewModel() {
        return (bqr0) this.activityViewModel.getValue();
    }

    @Override // com.yandex.payment.sdk.ui.ViewBindingActivityImpl
    public View getBlurView() {
        return getBinding().b;
    }

    @Override // com.yandex.payment.sdk.ui.ViewBindingActivityImpl
    public int getContentContainerId() {
        return j9h0.content_layout;
    }

    @Override // com.yandex.payment.sdk.ui.ViewBindingActivityImpl
    public TextView getDebugView() {
        return getBinding().j;
    }

    @Override // com.yandex.payment.sdk.ui.BaseActivity
    /* renamed from: getDismissInterfaceReceiver$paymentsdk_release, reason: from getter */
    public BroadcastReceiver getDismissInterfaceReceiver() {
        return this.dismissInterfaceReceiver;
    }

    @Override // com.yandex.payment.sdk.ui.ViewBindingActivityImpl
    public int getExitContainerId() {
        return j9h0.exit_fragment_container;
    }

    @Override // com.yandex.payment.sdk.ui.ViewBindingActivityImpl
    public ConstraintLayout getMainContainer() {
        return getBinding().d;
    }

    @Override // com.yandex.payment.sdk.ui.ViewBindingActivityImpl
    public FrameLayout getSheetView() {
        return getBinding().h;
    }

    @Override // com.yandex.payment.sdk.ui.ViewBindingActivityImpl
    public ImageView getSlideView() {
        return getBinding().i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentActivity
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        zbq0 zbq0Var = new zbq0(this, getBaseComponent$paymentsdk_release(), getPaymentComponent(), new rv5(this, 2), new rv5(this, 3), new ddf(6, new a()), false);
        if (fragment instanceof jgm0) {
            ((jgm0) fragment).setCallback(zbq0Var);
            return;
        }
        if (fragment instanceof zcy) {
            ((zcy) fragment).setCallback(zbq0Var);
        } else if (fragment instanceof omo) {
            ((omo) fragment).setCallback(zbq0Var);
        } else if (fragment instanceof azj0) {
            ((azj0) fragment).setCallback(zbq0Var);
        }
    }

    @Override // com.yandex.payment.sdk.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        roa0 o = roa0.o(getLayoutInflater());
        setCurrentBinding(o);
        setContentView(o.a);
        initBinding();
        pub1.c(getOnBackPressedDispatcher(), this, new kv5(1, this));
        setupSheet();
        String stringExtra = getIntent().getStringExtra(BaseActivity.EXTRA_EMAIL);
        String stringExtra2 = getIntent().getStringExtra(BaseActivity.EXTRA_REDIRECT_URL);
        Fragment f = new xsf().f(stringExtra, new SbpOperation.BindSbpToken(stringExtra2), false);
        if (!apa1.e(FeatureFlag.DIV_KIT_MASTER_FLAG) || !apa1.e(FeatureFlag.DIV_KIT_SBP_FLAG)) {
            f = null;
        }
        if (f == null) {
            rgm0 rgm0Var = SbpFragment.Companion;
            SbpOperation.BindSbpToken bindSbpToken = new SbpOperation.BindSbpToken(stringExtra2);
            rgm0Var.getClass();
            f = rgm0.a(stringExtra, bindSbpToken, false);
            hideLoading$paymentsdk_release();
        }
        BaseActivity.replaceFragment$paymentsdk_release$default(this, f, true, 0, 4, null);
    }

    public final void showLoadingFragment$paymentsdk_release(Fragment fragment) {
        v40 E = getSupportFragmentManager().E(j9h0.loading_fragment_container);
        if (E != null) {
            ResultType resultType = (ResultType) fragment.requireArguments().getParcelable(ARG_RESULT_TYPE);
            zy11 zy11Var = null;
            if (resultType != null) {
                azj0 azj0Var = E instanceof azj0 ? (azj0) E : null;
                if (azj0Var != null) {
                    azj0Var.setupData(resultType);
                    zy11Var = zy11.a;
                }
            }
            if (zy11Var != null) {
                return;
            }
        }
        replaceFragment$paymentsdk_release(fragment, false, j9h0.loading_fragment_container);
    }

    @Override // com.yandex.payment.sdk.ui.BaseActivity
    public void tryCloseActivity() {
        cancelAndFinish();
    }
}
