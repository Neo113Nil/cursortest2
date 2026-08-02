package com.yandex.payment.sdk.ui.payment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.yandex.passport.internal.a0;
import com.yandex.payment.common.data.TextRes;
import com.yandex.payment.common.result.ResultType;
import com.yandex.payment.sdk.core.data.OrderInfo;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.PaymentToken;
import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import com.yandex.payment.sdk.model.data.PersonalInfoVisibility;
import com.yandex.payment.sdk.transportcards.ui.TransportCardsActivity;
import com.yandex.payment.sdk.ui.BaseActivity;
import com.yandex.payment.sdk.ui.ViewBindingActivityImpl;
import com.yandex.payment.sdk.ui.common.YB2FAObservingWebViewFragment;
import com.yandex.payment.sdk.ui.payment.common.ContinuePaymentFragment;
import com.yandex.payment.sdk.ui.payment.newbind.NewBindFragment;
import com.yandex.payment.sdk.ui.payment.select.SelectFragment;
import com.yandex.payment.sdk.ui.view.OnSwipeTouchListener;
import com.yandex.payment.sdk.ui.view.payment.PaymentButtonView;
import com.yandex.xplat.payment.sdk.ServiceStatusForAnalytics;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.a99;
import defpackage.apa1;
import defpackage.aqa0;
import defpackage.ay90;
import defpackage.azj0;
import defpackage.b88;
import defpackage.bga0;
import defpackage.bqr0;
import defpackage.c950;
import defpackage.cf4;
import defpackage.d1d;
import defpackage.ddf;
import defpackage.eyf0;
import defpackage.f950;
import defpackage.i3y;
import defpackage.iob1;
import defpackage.j73;
import defpackage.j9h0;
import defpackage.jgm0;
import defpackage.lng0;
import defpackage.ls31;
import defpackage.mv90;
import defpackage.mx60;
import defpackage.mxk;
import defpackage.n891;
import defpackage.np90;
import defpackage.ny61;
import defpackage.omo;
import defpackage.oy80;
import defpackage.oy90;
import defpackage.p7u;
import defpackage.pub1;
import defpackage.pwf;
import defpackage.px90;
import defpackage.qv90;
import defpackage.qwf;
import defpackage.r720;
import defpackage.r991;
import defpackage.roa0;
import defpackage.saq0;
import defpackage.sv90;
import defpackage.u290;
import defpackage.uu5;
import defpackage.uv90;
import defpackage.v40;
import defpackage.vvb1;
import defpackage.vyj0;
import defpackage.w511;
import defpackage.wga0;
import defpackage.wke;
import defpackage.wy4;
import defpackage.xbq0;
import defpackage.xry0;
import defpackage.xsf;
import defpackage.y8h;
import defpackage.yj70;
import defpackage.yry0;
import defpackage.zbq0;
import defpackage.zcy;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.a;

@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001d\u0010\u0007J\u0019\u0010 \u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\"\u0010\u0007J\u0017\u0010%\u001a\u00020\u00162\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b%\u0010&J)\u0010+\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010#H\u0014¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00162\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b1\u0010\u0018J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020#2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J#\u0010?\u001a\u00020\u00162\b\b\u0001\u0010=\u001a\u00020'2\n\b\u0001\u0010>\u001a\u0004\u0018\u00010'¢\u0006\u0004\b?\u0010@J\u001f\u0010?\u001a\u00020\u00162\u0006\u0010A\u001a\u00020-2\b\u0010B\u001a\u0004\u0018\u00010-¢\u0006\u0004\b?\u0010CJ/\u0010?\u001a\u00020\u00162\u0006\u0010A\u001a\u00020D2\n\b\u0001\u0010>\u001a\u0004\u0018\u00010'2\n\b\u0001\u0010E\u001a\u0004\u0018\u00010'H\u0000¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u001fH\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0016H\u0002¢\u0006\u0004\bJ\u0010\u0007J\u001b\u0010K\u001a\u00020\u00142\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0004\bK\u0010LJ\u0011\u0010M\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u001fH\u0002¢\u0006\u0004\bO\u0010IJ\u000f\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u0016H\u0002¢\u0006\u0004\bS\u0010\u0007R\u0018\u0010U\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001b\u0010[\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u001b\u0010`\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010X\u001a\u0004\b^\u0010_R\u0018\u0010b\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010d\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010g\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR$\u0010l\u001a\u0010\u0012\u0004\u0012\u00020j\u0012\u0004\u0012\u00020k\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u001a\u0010o\u001a\u00020n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u0014\u0010u\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0014\u0010y\u001a\u00020v8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0014\u0010{\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010tR\u0014\u0010~\u001a\u00020T8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}¨\u0006\u007f"}, d2 = {"Lcom/yandex/payment/sdk/ui/payment/PaymentActivity;", "Lcom/yandex/payment/sdk/ui/ViewBindingActivityImpl;", "Lbqr0;", "Lroa0;", "Lp7u;", "Leyf0;", "<init>", "()V", "Landroid/widget/FrameLayout;", "getSheetView", "()Landroid/widget/FrameLayout;", "Landroid/widget/TextView;", "getDebugView", "()Landroid/widget/TextView;", "Landroid/view/View;", "getBlurView", "()Landroid/view/View;", "Landroid/widget/ImageView;", "getSlideView", "()Landroid/widget/ImageView;", "Landroidx/fragment/app/Fragment;", "fragment", "Lzy11;", "onAttachFragment", "(Landroidx/fragment/app/Fragment;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "hideActivityViews$paymentsdk_release", "hideActivityViews", "", "shouldRestorePayment", "(Landroid/os/Bundle;)Z", "tryCloseActivity", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "", "requestCode", "resultCode", Constants.KEY_DATA, "onActivityResult", "(IILandroid/content/Intent;)V", "", "metaJson", "restoreSelectFragment", "(Ljava/lang/String;)V", "showLoadingFragment$paymentsdk_release", "showLoadingFragment", "Lb88;", "getCard3DSWebViewDelegateFactory", "()Lb88;", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "getLicenseLinkIntent", "(Landroid/net/Uri;)Landroid/content/Intent;", "Ld1d;", "componentDispatcher", "()Ld1d;", "titleRes", "subtitleRes", "showSnackBar", "(ILjava/lang/Integer;)V", "title", "subtitle", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/yandex/payment/common/data/TextRes;", "iconRes", "showSnackBar$paymentsdk_release", "(Lcom/yandex/payment/common/data/TextRes;Ljava/lang/Integer;Ljava/lang/Integer;)V", "restorePayment", "()Z", "backPressed", "getSelectFragment", "(Ljava/lang/String;)Landroidx/fragment/app/Fragment;", "canGoBackFromSbpFragment", "()Ljava/lang/Boolean;", "isSheetOpen", "Lzbq0;", "getOrCreateCallbacks", "()Lzbq0;", "cancelAndFinish", "Laqa0;", "_snackBarBinding", "Laqa0;", "activityViewModel$delegate", "Li3y;", "getActivityViewModel", "()Lbqr0;", "activityViewModel", "Lay90;", "paymentComponent$delegate", "getPaymentComponent", "()Lay90;", "paymentComponent", "Lcom/yandex/payment/sdk/core/data/PaymentMethod;", "selectedMethod", "Lcom/yandex/payment/sdk/core/data/PaymentMethod;", "fragmentCallbacks", "Lzbq0;", "Lwke;", "continueCallbacks", "Lwke;", "Lkotlin/Pair;", "Lpx90;", "Lbga0;", "lastPaymentHolders", "Lkotlin/Pair;", "Landroid/content/BroadcastReceiver;", "dismissInterfaceReceiver", "Landroid/content/BroadcastReceiver;", "getDismissInterfaceReceiver$paymentsdk_release", "()Landroid/content/BroadcastReceiver;", "getContentContainerId", "()I", "contentContainerId", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getMainContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "mainContainer", "getExitContainerId", "exitContainerId", "getSnackBarBinding", "()Laqa0;", "snackBarBinding", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class PaymentActivity extends ViewBindingActivityImpl<bqr0, roa0> implements p7u, eyf0 {
    private aqa0 _snackBarBinding;
    private wke continueCallbacks;
    private zbq0 fragmentCallbacks;
    private Pair<px90, bga0> lastPaymentHolders;
    private PaymentMethod selectedMethod;

    /* renamed from: activityViewModel$delegate, reason: from kotlin metadata */
    private final i3y activityViewModel = a.b(LazyThreadSafetyMode.NONE, new mv90(this, 0));

    /* renamed from: paymentComponent$delegate, reason: from kotlin metadata */
    private final i3y paymentComponent = a.a(new mv90(this, 1));
    private final BroadcastReceiver dismissInterfaceReceiver = new BroadcastReceiver() { // from class: com.yandex.payment.sdk.ui.payment.PaymentActivity$dismissInterfaceReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PaymentActivity.this.cancelAndFinish();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final bqr0 activityViewModel_delegate$lambda$0(PaymentActivity paymentActivity) {
        return (bqr0) new ls31(paymentActivity, new r720(1, ((pwf) paymentActivity.getBaseComponent$paymentsdk_release()).c())).b(bqr0.class);
    }

    private final void backPressed() {
        qv90.a.getClass();
        reportEvent(sv90.h());
        if (isSheetOpen()) {
            getActivityViewModel().Y();
            return;
        }
        if (getSupportFragmentManager().K() <= 1) {
            getActivityViewModel().Y();
            return;
        }
        Boolean canGoBackFromSbpFragment = canGoBackFromSbpFragment();
        if (canGoBackFromSbpFragment == null || canGoBackFromSbpFragment.booleanValue()) {
            getSupportFragmentManager().V();
        } else {
            getActivityViewModel().Y();
        }
    }

    private final Boolean canGoBackFromSbpFragment() {
        v40 E = getSupportFragmentManager().E(j9h0.fragment_container);
        cf4 cf4Var = E instanceof cf4 ? (cf4) E : null;
        if (cf4Var != null) {
            return Boolean.valueOf(cf4Var.onBackPressed());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelAndFinish() {
        oy90 oy90Var = (oy90) ((qwf) getPaymentComponent()).c.get();
        if (oy90Var.l) {
            uv90 uv90Var = oy90Var.j;
            if (uv90Var == null) {
                uv90Var = null;
            }
            wga0 wga0Var = (wga0) uv90Var;
            wga0Var.b.a();
            wga0Var.i.invoke();
        }
        finishWithResult$paymentsdk_release();
    }

    private final zbq0 getOrCreateCallbacks() {
        zbq0 zbq0Var = this.fragmentCallbacks;
        if (zbq0Var != null) {
            return zbq0Var;
        }
        zbq0 zbq0Var2 = new zbq0(this, getBaseComponent$paymentsdk_release(), getPaymentComponent(), new mv90(this, 2), new mv90(this, 3), new ddf(6, this), getIntent().getBooleanExtra(TransportCardsActivity.EXTRA_IS_TRANSPORT_CARDS_FLOW, false));
        this.fragmentCallbacks = zbq0Var2;
        return zbq0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView getOrCreateCallbacks$lambda$0(PaymentActivity paymentActivity) {
        return paymentActivity.getBinding().e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaymentButtonView getOrCreateCallbacks$lambda$1(PaymentActivity paymentActivity) {
        return paymentActivity.getBinding().f;
    }

    private final ay90 getPaymentComponent() {
        return (ay90) this.paymentComponent.getValue();
    }

    private final Fragment getSelectFragment(String metaJson) {
        xsf xsfVar = new xsf();
        if ((!apa1.e(FeatureFlag.DIV_KIT_MASTER_FLAG) || !apa1.e(FeatureFlag.DIV_KIT_SELECT_FLAG)) && !kotlin.collections.a.G(j73.f0(new PaymentMethod[]{PaymentMethod.Split.INSTANCE, PaymentMethod.ChallengePollingMethod.INSTANCE}), this.selectedMethod)) {
            xsfVar = null;
        }
        PaymentMethod paymentMethod = this.selectedMethod;
        if (xsfVar != null) {
            return xsfVar.g(paymentMethod, metaJson, apa1.e(FeatureFlag.DK_SELECT_VIEW_MODEL_REFACTORING));
        }
        xbq0 xbq0Var = SelectFragment.Companion;
        PersonalInfoVisibility personalInfoVisibility = (PersonalInfoVisibility) ((pwf) getBaseComponent$paymentsdk_release()).p.get();
        xbq0Var.getClass();
        return xbq0.a(paymentMethod, personalInfoVisibility);
    }

    public static /* synthetic */ Fragment getSelectFragment$default(PaymentActivity paymentActivity, String str, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: getSelectFragment");
            return null;
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return paymentActivity.getSelectFragment(str);
    }

    private final aqa0 getSnackBarBinding() {
        aqa0 aqa0Var = this._snackBarBinding;
        if (aqa0Var != null) {
            return aqa0Var;
        }
        ny61.r("Required value was null.");
        return null;
    }

    private final boolean isSheetOpen() {
        f950 f950Var = (f950) getActivityViewModel().c.d();
        if (n891.o(f950Var != null ? Boolean.valueOf(f950Var.equals(c950.d)) : null)) {
            return true;
        }
        f950 f950Var2 = (f950) getActivityViewModel().c.d();
        return n891.o(f950Var2 != null ? Boolean.valueOf(f950Var2.equals(c950.e)) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreate$lambda$1(PaymentActivity paymentActivity, mx60 mx60Var) {
        paymentActivity.backPressed();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ay90 paymentComponent_delegate$lambda$0(PaymentActivity paymentActivity) {
        wy4 baseComponent$paymentsdk_release = paymentActivity.getBaseComponent$paymentsdk_release();
        return new qwf(((pwf) baseComponent$paymentsdk_release).a, new oy80(6, (PaymentToken) paymentActivity.getIntent().getParcelableExtra(BaseActivity.EXTRA_PAYMENT_TOKEN), (OrderInfo) paymentActivity.getIntent().getParcelableExtra(BaseActivity.EXTRA_ORDER_INFO)));
    }

    private final boolean restorePayment() {
        Pair<px90, bga0> pair = this.lastPaymentHolders;
        if (pair == null) {
            r991.b = null;
            r991.c = null;
            return false;
        }
        this.continueCallbacks = new wke(getOrCreateCallbacks(), pair);
        BaseActivity.replaceFragment$paymentsdk_release$default(this, new ContinuePaymentFragment(), true, 0, 4, null);
        return true;
    }

    @Override // defpackage.p7u
    public d1d componentDispatcher() {
        y8h y8hVar = new y8h();
        y8hVar.a(wy4.class, getBaseComponent$paymentsdk_release());
        y8hVar.a(mxk.class, getDivKitComponent$paymentsdk_release());
        y8hVar.a(ay90.class, getPaymentComponent());
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

    @Override // defpackage.eyf0
    public b88 getCard3DSWebViewDelegateFactory() {
        return new yj70(this);
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

    public Intent getLicenseLinkIntent(Uri uri) {
        return new Intent("android.intent.action.VIEW", uri).putExtra("com.android.browser.application_id", getApplicationContext().getPackageName());
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

    public final void hideActivityViews$paymentsdk_release() {
        roa0 binding = getBinding();
        binding.f.setVisibility(8);
        binding.c.setVisibility(8);
        binding.i.setVisibility(8);
    }

    @Override // com.yandex.payment.sdk.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != 38215 || np90.b() == null) {
            return;
        }
        Long valueOf = (requestCode == 38215 && resultCode == -1 && data != null) ? Long.valueOf(a0.e(data.getExtras()).a.getValue()) : null;
        if (valueOf != null) {
            putExtraToResult("PASSPORT_UID", valueOf.longValue());
            finishWithResult$paymentsdk_release();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentActivity
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        zbq0 orCreateCallbacks = getOrCreateCallbacks();
        if (fragment instanceof SelectFragment) {
            ((SelectFragment) fragment).setSelectCallbacks$paymentsdk_release(orCreateCallbacks);
            return;
        }
        if (fragment instanceof NewBindFragment) {
            ((NewBindFragment) fragment).setBindCallbacks$paymentsdk_release(orCreateCallbacks);
            return;
        }
        if (fragment instanceof ContinuePaymentFragment) {
            ((ContinuePaymentFragment) fragment).setContinuePaymentCallbacks(this.continueCallbacks);
            return;
        }
        if (fragment instanceof saq0) {
            ((saq0) fragment).setCallback(orCreateCallbacks);
            return;
        }
        if (fragment instanceof jgm0) {
            ((jgm0) fragment).setCallback(orCreateCallbacks);
            return;
        }
        if (fragment instanceof YB2FAObservingWebViewFragment) {
            ((YB2FAObservingWebViewFragment) fragment).setYBChallengeCallback(orCreateCallbacks);
            return;
        }
        if (fragment instanceof omo) {
            ((omo) fragment).setCallback(orCreateCallbacks);
            return;
        }
        if (fragment instanceof uu5) {
            ((uu5) fragment).setBindCallback(orCreateCallbacks);
            return;
        }
        if (fragment instanceof zcy) {
            ((zcy) fragment).setCallback(orCreateCallbacks);
        } else if (fragment instanceof azj0) {
            ((azj0) fragment).setCallback(orCreateCallbacks);
        } else if (fragment instanceof a99) {
            ((a99) fragment).setCallback(orCreateCallbacks);
        }
    }

    @Override // com.yandex.payment.sdk.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        zbq0 orCreateCallbacks = getOrCreateCallbacks();
        if (shouldRestorePayment(savedInstanceState)) {
            orCreateCallbacks.C = true;
            vvb1.I = true;
        }
        setCurrentBinding(roa0.o(getLayoutInflater()));
        super.onCreate(savedInstanceState);
        roa0 currentBinding = getCurrentBinding();
        if (currentBinding != null) {
            this._snackBarBinding = aqa0.o(currentBinding.g);
            setContentView(currentBinding.a);
            initBinding();
        }
        pub1.c(getOnBackPressedDispatcher(), this, new u290(12, this));
        setupSheet();
        setupSheet();
        getBinding().e.setGravity(iob1.d(getTheme(), lng0.paymentsdk_bindCenterFooterText, false) ? 1 : 8388611);
        this.selectedMethod = (PaymentMethod) getIntent().getParcelableExtra(BaseActivity.EXTRA_SELECTED_METHOD);
        ConstraintLayout constraintLayout = getSnackBarBinding().e;
        final Context context = constraintLayout.getContext();
        constraintLayout.setOnTouchListener(new OnSwipeTouchListener(context) { // from class: com.yandex.payment.sdk.ui.payment.PaymentActivity$onCreate$3$1
            @Override // com.yandex.payment.sdk.ui.view.OnSwipeTouchListener
            public boolean onSwipeTop() {
                PaymentActivity paymentActivity = PaymentActivity.this;
                ViewBindingActivityImpl.performSnackBarTransition$default(paymentActivity, false, paymentActivity.getBinding().g, 0L, 4, null);
                return true;
            }
        });
        cleanBackStack$paymentsdk_release();
        if (restorePayment()) {
            return;
        }
        BaseActivity.replaceFragment$paymentsdk_release$default(this, getSelectFragment$default(this, null, 1, null), true, 0, 4, null);
    }

    @Override // com.yandex.payment.sdk.ui.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.getBooleanExtra(BaseActivity.EXTRA_UPDATE_PAY_BUTTON_TEXT, false)) {
            getOrCreateCallbacks().getClass();
            xry0 xry0Var = yry0.a;
            yry0.a.getClass();
            yry0.a.getClass();
        }
    }

    public final void restoreSelectFragment(String metaJson) {
        this.selectedMethod = null;
        cleanBackStack$paymentsdk_release();
        BaseActivity.replaceFragment$paymentsdk_release$default(this, getSelectFragment(metaJson), true, 0, 4, null);
    }

    @Override // com.yandex.payment.sdk.ui.BaseActivity
    public boolean shouldRestorePayment(Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            return false;
        }
        Pair<px90, bga0> pair = !((PaymentToken) getIntent().getParcelableExtra(BaseActivity.EXTRA_PAYMENT_TOKEN)).getToken().equals(r991.b) ? null : r991.c;
        this.lastPaymentHolders = pair;
        return pair != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showLoadingFragment$paymentsdk_release(Fragment fragment) {
        v40 E = getSupportFragmentManager().E(j9h0.loading_fragment_container);
        if (E != null) {
            ResultType resultType = (ResultType) fragment.requireArguments().getParcelable("ARG_RESULT_TYPE");
            zy11 zy11Var = null;
            if (resultType != null) {
                vyj0 vyj0Var = fragment instanceof vyj0 ? (vyj0) fragment : null;
                vyj0 vyj0Var2 = E instanceof vyj0 ? (vyj0) E : null;
                if (vyj0Var2 != null) {
                    vyj0Var2.setButtonsActions(vyj0Var != null ? vyj0Var.getMainButtonAction() : null, vyj0Var != null ? vyj0Var.getExtraButtonAction() : null, vyj0Var != null ? vyj0Var.getBackButtonAction() : null);
                }
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

    public final void showSnackBar(String title, String subtitle) {
        getSnackBarBinding().d.setText(title);
        TextView textView = getSnackBarBinding().c;
        textView.setVisibility(subtitle != null ? 0 : 8);
        if (subtitle != null) {
            textView.setText(subtitle);
        }
        ViewBindingActivityImpl.performSnackBarTransition$default(this, true, getBinding().g, 0L, 4, null);
    }

    public final void showSnackBar$paymentsdk_release(TextRes title, Integer subtitleRes, Integer iconRes) {
        String string;
        if (title instanceof TextRes.StringText) {
            string = ((TextRes.StringText) title).getText();
        } else {
            if (!(title instanceof TextRes.IntRes)) {
                w511.b();
                return;
            }
            string = getString(((TextRes.IntRes) title).getResId());
        }
        getSnackBarBinding().d.setText(string);
        bindImage$paymentsdk_release(getSnackBarBinding().b, iconRes);
        n891.c(getSnackBarBinding().c, subtitleRes);
        View view = getSnackBarBinding().a;
        String string2 = subtitleRes != null ? getString(subtitleRes.intValue()) : null;
        if (string2 == null) {
            string2 = "";
        }
        view.announceForAccessibility(string + " " + string2);
        ViewBindingActivityImpl.performSnackBarTransition$default(this, true, getBinding().g, 0L, 4, null);
    }

    @Override // com.yandex.payment.sdk.ui.BaseActivity
    public void tryCloseActivity() {
        reportEvent(sv90.j(qv90.a, ServiceStatusForAnalytics.dismissed));
        cancelAndFinish();
    }

    public final void showSnackBar(int titleRes, Integer subtitleRes) {
        getSnackBarBinding().d.setText(titleRes);
        n891.c(getSnackBarBinding().c, subtitleRes);
        ViewBindingActivityImpl.performSnackBarTransition$default(this, true, getBinding().g, 0L, 4, null);
    }
}
