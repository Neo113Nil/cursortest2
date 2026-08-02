package com.yandex.payment.sdk.ui.bind;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.yandex.payment.divkit.bind.BindType;
import com.yandex.payment.divkit.bind.DKBindCardFragment;
import com.yandex.payment.sdk.core.camerascanner.CameraCardScannerProvider;
import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import com.yandex.payment.sdk.ui.BaseActivity;
import com.yandex.payment.sdk.ui.ViewBindingActivityImpl;
import com.yandex.payment.sdk.ui.newbind.NewBindFragment;
import com.yandex.payment.sdk.ui.view.OnSwipeTouchListener;
import com.yandex.xplat.payment.sdk.ServiceStatusForAnalytics;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.apa1;
import defpackage.aqa0;
import defpackage.azj0;
import defpackage.b88;
import defpackage.bqr0;
import defpackage.d1d;
import defpackage.dgo;
import defpackage.ev5;
import defpackage.eyf0;
import defpackage.f560;
import defpackage.hh5;
import defpackage.i3y;
import defpackage.j24;
import defpackage.j9h0;
import defpackage.jxi;
import defpackage.l95;
import defpackage.ls31;
import defpackage.mx60;
import defpackage.mxk;
import defpackage.ny61;
import defpackage.omo;
import defpackage.ou5;
import defpackage.p7u;
import defpackage.poa0;
import defpackage.pu5;
import defpackage.pub1;
import defpackage.pwf;
import defpackage.qv90;
import defpackage.r720;
import defpackage.sv90;
import defpackage.uu5;
import defpackage.vvb1;
import defpackage.wwg;
import defpackage.wy4;
import defpackage.xsf;
import defpackage.y8h;
import defpackage.yv90;
import defpackage.zcy;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.a;

@Metadata(d1 = {"\u0000¡\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u00016\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u00013B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u0007J\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010\u0007J\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u001b\u0010/\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u000603R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010:\u001a\u0002098\u0010X\u0090\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010C¨\u0006K"}, d2 = {"Lcom/yandex/payment/sdk/ui/bind/BindCardActivity;", "Lcom/yandex/payment/sdk/ui/ViewBindingActivityImpl;", "Lbqr0;", "Lpoa0;", "Lp7u;", "Leyf0;", "<init>", "()V", "Lzy11;", "backPressed", "cancelAndFinish", "Landroid/widget/FrameLayout;", "getSheetView", "()Landroid/widget/FrameLayout;", "Landroid/widget/TextView;", "getDebugView", "()Landroid/widget/TextView;", "Landroid/view/View;", "getBlurView", "()Landroid/view/View;", "Landroid/widget/ImageView;", "getSlideView", "()Landroid/widget/ImageView;", "Landroidx/fragment/app/Fragment;", "fragment", "onAttachFragment", "(Landroidx/fragment/app/Fragment;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "tryCloseActivity", "Lb88;", "getCard3DSWebViewDelegateFactory", "()Lb88;", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "Landroid/content/Intent;", "getLicenseLinkIntent", "(Landroid/net/Uri;)Landroid/content/Intent;", "Ld1d;", "componentDispatcher", "()Ld1d;", "activityViewModel$delegate", "Li3y;", "getActivityViewModel", "()Lbqr0;", "activityViewModel", "Laqa0;", "_snackBarBinding", "Laqa0;", "Lou5;", "fragmentCallbacks", "Lou5;", "pu5", "licenseCallbacks", "Lpu5;", "Landroid/content/BroadcastReceiver;", "dismissInterfaceReceiver", "Landroid/content/BroadcastReceiver;", "getDismissInterfaceReceiver$paymentsdk_release", "()Landroid/content/BroadcastReceiver;", "getSnackBarBinding", "()Laqa0;", "snackBarBinding", "", "getContentContainerId", "()I", "contentContainerId", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getMainContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "mainContainer", "getExitContainerId", "exitContainerId", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class BindCardActivity extends ViewBindingActivityImpl<bqr0, poa0> implements p7u, eyf0 {
    private aqa0 _snackBarBinding;

    /* renamed from: activityViewModel$delegate, reason: from kotlin metadata */
    private final i3y activityViewModel = a.b(LazyThreadSafetyMode.NONE, new l95(17, this));
    private final ou5 fragmentCallbacks = new ou5(this);
    private final pu5 licenseCallbacks = new pu5(this);
    private final BroadcastReceiver dismissInterfaceReceiver = new BroadcastReceiver() { // from class: com.yandex.payment.sdk.ui.bind.BindCardActivity$dismissInterfaceReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BindCardActivity.this.cancelAndFinish();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final bqr0 activityViewModel_delegate$lambda$0(BindCardActivity bindCardActivity) {
        return (bqr0) new ls31(bindCardActivity, new r720(1, ((pwf) bindCardActivity.getBaseComponent$paymentsdk_release()).c())).b(bqr0.class);
    }

    private final void backPressed() {
        qv90.a.getClass();
        reportEvent(sv90.h());
        if (getSupportFragmentManager().K() > 1) {
            getSupportFragmentManager().V();
        } else {
            getActivityViewModel().Y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelAndFinish() {
        Object obj = dgo.a;
        ev5 a = dgo.a(((pwf) getBaseComponent$paymentsdk_release()).b());
        if (a != null) {
            a.a(vvb1.J);
        }
        ((yv90) ((pwf) getBaseComponent$paymentsdk_release()).f()).j.c();
        finishWithResult$paymentsdk_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final aqa0 getSnackBarBinding() {
        aqa0 aqa0Var = this._snackBarBinding;
        if (aqa0Var != null) {
            return aqa0Var;
        }
        ny61.r("Required value was null.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreate$lambda$1(BindCardActivity bindCardActivity, mx60 mx60Var) {
        bindCardActivity.backPressed();
        return zy11.a;
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
        return getBinding().c;
    }

    @Override // defpackage.eyf0
    public b88 getCard3DSWebViewDelegateFactory() {
        return new hh5(3, this);
    }

    @Override // com.yandex.payment.sdk.ui.ViewBindingActivityImpl
    public int getContentContainerId() {
        return j9h0.content_layout;
    }

    @Override // com.yandex.payment.sdk.ui.ViewBindingActivityImpl
    public TextView getDebugView() {
        return getBinding().i;
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

    public Intent getLicenseLinkIntent(Uri uri) {
        return new Intent("android.intent.action.VIEW", uri).putExtra("com.android.browser.application_id", getApplicationContext().getPackageName());
    }

    @Override // com.yandex.payment.sdk.ui.ViewBindingActivityImpl
    public ConstraintLayout getMainContainer() {
        return getBinding().e;
    }

    @Override // com.yandex.payment.sdk.ui.ViewBindingActivityImpl
    public FrameLayout getSheetView() {
        return getBinding().g;
    }

    @Override // com.yandex.payment.sdk.ui.ViewBindingActivityImpl
    public ImageView getSlideView() {
        return getBinding().h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentActivity
    @jxi
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment instanceof NewBindFragment) {
            ((NewBindFragment) fragment).setBindCallbacks$paymentsdk_release(this.fragmentCallbacks);
            return;
        }
        if (fragment instanceof omo) {
            ((omo) fragment).setCallback(this.fragmentCallbacks);
            return;
        }
        if (fragment instanceof uu5) {
            ((uu5) fragment).setBindCallback(this.fragmentCallbacks);
        } else if (fragment instanceof zcy) {
            ((zcy) fragment).setCallback(this.licenseCallbacks);
        } else if (fragment instanceof azj0) {
            ((azj0) fragment).setCallback(this.fragmentCallbacks);
        }
    }

    @Override // com.yandex.payment.sdk.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Fragment newBindFragment;
        super.onCreate(savedInstanceState);
        poa0 o = poa0.o(getLayoutInflater());
        setCurrentBinding(o);
        this._snackBarBinding = aqa0.o(o.f);
        setContentView(o.a);
        initBinding();
        pub1.c(getOnBackPressedDispatcher(), this, new j24(29, this));
        setupSheet();
        ConstraintLayout constraintLayout = getSnackBarBinding().e;
        final Context context = constraintLayout.getContext();
        constraintLayout.setOnTouchListener(new OnSwipeTouchListener(context) { // from class: com.yandex.payment.sdk.ui.bind.BindCardActivity$onCreate$3$1
            @Override // com.yandex.payment.sdk.ui.view.OnSwipeTouchListener
            public boolean onSwipeTop() {
                BindCardActivity bindCardActivity = BindCardActivity.this;
                ViewBindingActivityImpl.performSnackBarTransition$default(bindCardActivity, false, bindCardActivity.getBinding().f, 0L, 4, null);
                return true;
            }
        });
        AccessibilityManager accessibilityManager = (AccessibilityManager) getApplicationContext().getSystemService("accessibility");
        getSupportFragmentManager().a0(-1, 1);
        xsf xsfVar = new xsf();
        if (!apa1.e(FeatureFlag.DIV_KIT_MASTER_FLAG) || !apa1.e(FeatureFlag.DIV_KIT_BIND_FLAG)) {
            xsfVar = null;
        }
        if (xsfVar != null) {
            String stringExtra = getIntent().getStringExtra(BaseActivity.EXTRA_VERIFY_CARD_ID);
            CameraCardScannerProvider cameraCardScannerProvider = (CameraCardScannerProvider) getIntent().getParcelableExtra(BaseActivity.EXTRA_CAMERA_CARD_SCANNER);
            boolean z = apa1.e(FeatureFlag.ENABLE_NFC_FLAG) && !accessibilityManager.isEnabled();
            boolean e = apa1.e(FeatureFlag.ENABLE_CARD_SCANNER_FLAG);
            DKBindCardFragment.Companion.getClass();
            newBindFragment = new DKBindCardFragment();
            newBindFragment.setArguments(wwg.g(new Pair("ARG_BIND_TYPE", new BindType.OnlyBind(stringExtra, cameraCardScannerProvider, z, false, e, 8, null))));
        } else {
            f560 f560Var = NewBindFragment.Companion;
            String stringExtra2 = getIntent().getStringExtra(BaseActivity.EXTRA_VERIFY_CARD_ID);
            CameraCardScannerProvider cameraCardScannerProvider2 = (CameraCardScannerProvider) getIntent().getParcelableExtra(BaseActivity.EXTRA_CAMERA_CARD_SCANNER);
            f560Var.getClass();
            newBindFragment = new NewBindFragment();
            newBindFragment.setArguments(wwg.g(new Pair("ARG_VERIFY_CARD_ID", stringExtra2), new Pair("CAMERA_CARD_SCANNER_PROVIDER", cameraCardScannerProvider2)));
        }
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(getSupportFragmentManager());
        aVar.c(null);
        aVar.h(j9h0.fragment_container, newBindFragment, null);
        aVar.l(true, true);
    }

    @Override // com.yandex.payment.sdk.ui.BaseActivity
    public void tryCloseActivity() {
        reportEvent(sv90.j(qv90.a, ServiceStatusForAnalytics.dismissed));
        cancelAndFinish();
    }
}
