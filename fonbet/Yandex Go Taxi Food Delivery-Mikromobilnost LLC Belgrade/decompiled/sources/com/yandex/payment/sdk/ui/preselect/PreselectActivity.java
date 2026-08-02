package com.yandex.payment.sdk.ui.preselect;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.yandex.payment.common.data.TextRes;
import com.yandex.payment.common.result.ResultScreenIdentifier;
import com.yandex.payment.common.result.ResultType;
import com.yandex.payment.divkit.preselect.DKPreselectFragment;
import com.yandex.payment.sdk.core.data.OrderInfo;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.PaymentToken;
import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import com.yandex.payment.sdk.model.data.PaymentTokenError;
import com.yandex.payment.sdk.model.data.PersonalInfoVisibility;
import com.yandex.payment.sdk.model.data.PreselectButtonState;
import com.yandex.payment.sdk.model.data.ResultScreenClosing;
import com.yandex.payment.sdk.ui.BaseActivity;
import com.yandex.payment.sdk.ui.ViewBindingActivityImpl;
import com.yandex.payment.sdk.ui.common.ResultFragment;
import com.yandex.payment.sdk.ui.payment.common.ContinuePaymentFragment;
import com.yandex.payment.sdk.ui.payment.license.LicenseFragment;
import com.yandex.payment.sdk.ui.payment.select.SelectFragment;
import com.yandex.payment.sdk.ui.preselect.newbind.PreselectNewBindFragment;
import com.yandex.payment.sdk.ui.preselect.select.PreselectFragment;
import com.yandex.payment.sdk.ui.view.OnSwipeTouchListener;
import com.yandex.payment.sdk.ui.view.payment.PaymentButtonView;
import com.yandex.xplat.payment.sdk.ServiceStatusForAnalytics;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.a8a0;
import defpackage.apa1;
import defpackage.aqa0;
import defpackage.ay90;
import defpackage.azj0;
import defpackage.b88;
import defpackage.bga0;
import defpackage.bqr0;
import defpackage.cma1;
import defpackage.d1d;
import defpackage.ddf;
import defpackage.eyf0;
import defpackage.htf;
import defpackage.i3y;
import defpackage.ihq0;
import defpackage.iu11;
import defpackage.ix90;
import defpackage.j9h0;
import defpackage.jgm0;
import defpackage.jhq0;
import defpackage.jx90;
import defpackage.k4o;
import defpackage.k7d0;
import defpackage.ls31;
import defpackage.mta1;
import defpackage.mx60;
import defpackage.mxk;
import defpackage.n891;
import defpackage.nmo;
import defpackage.nw70;
import defpackage.ny61;
import defpackage.o3a0;
import defpackage.ogb1;
import defpackage.omo;
import defpackage.oy80;
import defpackage.p7u;
import defpackage.pub1;
import defpackage.pwf;
import defpackage.px90;
import defpackage.que0;
import defpackage.qv90;
import defpackage.qwf;
import defpackage.r720;
import defpackage.r991;
import defpackage.rlh0;
import defpackage.rue0;
import defpackage.ryh0;
import defpackage.saq0;
import defpackage.soa0;
import defpackage.sue0;
import defpackage.sv90;
import defpackage.t0p;
import defpackage.tls;
import defpackage.tue0;
import defpackage.uue0;
import defpackage.v40;
import defpackage.v5c0;
import defpackage.vvb1;
import defpackage.w511;
import defpackage.wke;
import defpackage.wsf;
import defpackage.wy4;
import defpackage.xbq0;
import defpackage.xcy;
import defpackage.xry0;
import defpackage.xsf;
import defpackage.xue0;
import defpackage.y22;
import defpackage.y8h;
import defpackage.yry0;
import defpackage.zbq0;
import defpackage.zcy;
import defpackage.zdz;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000¶\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u0000 §\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\b\u0080\u0001¨\u0001©\u0001ª\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u001b\u0010\u0019J\u0019\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0013H\u0016¢\u0006\u0004\b-\u0010\u0007J#\u00101\u001a\u00020\u00132\b\b\u0001\u0010/\u001a\u00020.2\n\b\u0001\u00100\u001a\u0004\u0018\u00010.¢\u0006\u0004\b1\u00102J\u001f\u00101\u001a\u00020\u00132\u0006\u00104\u001a\u0002032\b\u00105\u001a\u0004\u0018\u000103¢\u0006\u0004\b1\u00106J\u0017\u00108\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b7\u0010\u0015J/\u00101\u001a\u00020\u00132\u0006\u00104\u001a\u0002092\n\b\u0001\u00100\u001a\u0004\u0018\u00010.2\n\b\u0001\u0010:\u001a\u0004\u0018\u00010.H\u0000¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u001cH\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0013H\u0002¢\u0006\u0004\b?\u0010\u0007J\u0017\u0010B\u001a\u00020\u00132\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ\u0011\u0010E\u001a\u0004\u0018\u00010DH\u0002¢\u0006\u0004\bE\u0010FJ\u0011\u0010H\u001a\u0004\u0018\u00010GH\u0002¢\u0006\u0004\bH\u0010IJ\u0011\u0010K\u001a\u0004\u0018\u00010JH\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bQ\u0010RJ\u000f\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bT\u0010UJ\u0019\u0010W\u001a\u0004\u0018\u00010V2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\bW\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u001b\u0010`\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001e\u0010c\u001a\n\u0012\u0004\u0012\u00020b\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010g\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010fR\u0018\u0010h\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010k\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010n\u001a\u00020m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010p\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010fR\u0018\u0010r\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010u\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR$\u0010x\u001a\u0004\u0018\u00010w8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u0018\u0010~\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001c\u0010\u0081\u0001\u001a\u00070\u0080\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001b\u0010\u0083\u0001\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001b\u0010\u0085\u0001\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001b\u0010\u0087\u0001\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001c\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R*\u0010\u008f\u0001\u001a\u0013\u0012\u0005\u0012\u00030\u008d\u0001\u0012\u0005\u0012\u00030\u008e\u0001\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R \u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0010X\u0090\u0004¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001d\u0010+\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010]\u001a\u0005\b\u0097\u0001\u0010,R\u0016\u0010\u0098\u0001\u001a\u0002038\u0002X\u0082D¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010iR\u001b\u0010\u0099\u0001\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0017\u0010\u009d\u0001\u001a\u00020.8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010¡\u0001\u001a\u00030\u009e\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0017\u0010£\u0001\u001a\u00020.8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¢\u0001\u0010\u009c\u0001R\u0017\u0010¦\u0001\u001a\u00020Y8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001¨\u0006«\u0001"}, d2 = {"Lcom/yandex/payment/sdk/ui/preselect/PreselectActivity;", "Lcom/yandex/payment/sdk/ui/ViewBindingActivityImpl;", "Lbqr0;", "Lsoa0;", "Lp7u;", "Leyf0;", "<init>", "()V", "Landroid/view/View;", "getBlurView", "()Landroid/view/View;", "Landroid/widget/ImageView;", "getSlideView", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", "getDebugView", "()Landroid/widget/TextView;", "Landroidx/fragment/app/Fragment;", "fragment", "Lzy11;", "onAttachFragment", "(Landroidx/fragment/app/Fragment;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "", "shouldRestorePayment", "(Landroid/os/Bundle;)Z", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "Lb88;", "getCard3DSWebViewDelegateFactory", "()Lb88;", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "getLicenseLinkIntent", "(Landroid/net/Uri;)Landroid/content/Intent;", "Ld1d;", "componentDispatcher", "()Ld1d;", "tryCloseActivity", "", "titleRes", "subtitleRes", "showSnackBar", "(ILjava/lang/Integer;)V", "", "title", "subtitle", "(Ljava/lang/String;Ljava/lang/String;)V", "showLoadingFragment$paymentsdk_release", "showLoadingFragment", "Lcom/yandex/payment/common/data/TextRes;", "iconRes", "showSnackBar$paymentsdk_release", "(Lcom/yandex/payment/common/data/TextRes;Ljava/lang/Integer;Ljava/lang/Integer;)V", "restorePayment", "()Z", "backPressed", "Lcom/yandex/payment/sdk/model/data/PreselectButtonState;", ClidProvider.STATE, "updatePreselectButton", "(Lcom/yandex/payment/sdk/model/data/PreselectButtonState;)V", "Lcom/yandex/payment/sdk/ui/preselect/newbind/PreselectNewBindFragment;", "getPreselectNewBindFragmentIfCurrent", "()Lcom/yandex/payment/sdk/ui/preselect/newbind/PreselectNewBindFragment;", "Ltue0;", "getPreselectDKBindFragmentIfCurrent", "()Ltue0;", "Luue0;", "getDKPreselectFragmentIfCurrent", "()Luue0;", "Lnmo;", "getOrCreateExitCallbacks", "()Lnmo;", "Lxcy;", "getOrCreateLicenseCallbacks", "()Lxcy;", "Lzbq0;", "getOrCreateSelectCallbacks", "()Lzbq0;", "Lay90;", "getPaymentComponent", "(Landroid/content/Intent;)Lay90;", "Laqa0;", "_snackBarBinding", "Laqa0;", "activityViewModel$delegate", "Li3y;", "getActivityViewModel", "()Lbqr0;", "activityViewModel", "", "Lcom/yandex/payment/sdk/core/data/PaymentMethod;", "methods", "Ljava/util/List;", "startPaymentAfterSelect", "Z", "bindNewCardBeforePayment", "defaultPaymentMethodId", "Ljava/lang/String;", "Lcom/yandex/payment/sdk/ui/preselect/PreselectActivity$PreselectAndPayStage;", "stage", "Lcom/yandex/payment/sdk/ui/preselect/PreselectActivity$PreselectAndPayStage;", "Lcom/yandex/payment/sdk/ui/preselect/PreselectActivity$a;", "externalPaymentMethodsModel", "Lcom/yandex/payment/sdk/ui/preselect/PreselectActivity$a;", "useExternalPaymentMethods", "Lcom/yandex/payment/sdk/core/data/PaymentToken;", "paymentToken", "Lcom/yandex/payment/sdk/core/data/PaymentToken;", "Lcom/yandex/payment/sdk/core/data/OrderInfo;", "orderInfo", "Lcom/yandex/payment/sdk/core/data/OrderInfo;", "Ljhq0;", "selectedMethod", "Ljhq0;", "getSelectedMethod", "()Ljhq0;", "setSelectedMethod", "(Ljhq0;)V", "preselectButtonState", "Lcom/yandex/payment/sdk/model/data/PreselectButtonState;", "Lcom/yandex/payment/sdk/ui/preselect/a;", "preselectFragmentCallbacks", "Lcom/yandex/payment/sdk/ui/preselect/a;", "selectFragmentCallbacks", "Lzbq0;", "exitCallbacks", "Lnmo;", "licenseCallbacks", "Lxcy;", "Lwke;", "continueCallbacks", "Lwke;", "Lkotlin/Pair;", "Lpx90;", "Lbga0;", "lastPaymentHolders", "Lkotlin/Pair;", "Landroid/content/BroadcastReceiver;", "dismissInterfaceReceiver", "Landroid/content/BroadcastReceiver;", "getDismissInterfaceReceiver$paymentsdk_release", "()Landroid/content/BroadcastReceiver;", "componentDispatcher$delegate", "getComponentDispatcher", "ARG_RESULT_TYPE", "paymentComponent", "Lay90;", "getContentContainerId", "()I", "contentContainerId", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getMainContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "mainContainer", "getExitContainerId", "exitContainerId", "getSnackBarBinding", "()Laqa0;", "snackBarBinding", "Companion", "PreselectAndPayStage", "a", "rue0", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class PreselectActivity extends ViewBindingActivityImpl<bqr0, soa0> implements p7u, eyf0 {
    private static final rue0 Companion = new rue0();

    @Deprecated
    public static final String ORDER_INFO_KEY = "ORDER_INFO_KEY";

    @Deprecated
    public static final String PAYMENT_TOKEN_KEY = "PAYMENT_TOKEN_KEY";
    private aqa0 _snackBarBinding;
    private boolean bindNewCardBeforePayment;
    private wke continueCallbacks;
    private String defaultPaymentMethodId;
    private nmo exitCallbacks;
    private Pair<px90, bga0> lastPaymentHolders;
    private xcy licenseCallbacks;
    private List<? extends PaymentMethod> methods;
    private OrderInfo orderInfo;
    private ay90 paymentComponent;
    private PaymentToken paymentToken;
    private PreselectButtonState preselectButtonState;
    private zbq0 selectFragmentCallbacks;
    private jhq0 selectedMethod;
    private boolean startPaymentAfterSelect;
    private boolean useExternalPaymentMethods;

    /* renamed from: activityViewModel$delegate, reason: from kotlin metadata */
    private final i3y activityViewModel = kotlin.a.b(LazyThreadSafetyMode.NONE, new que0(this, 2));
    private PreselectAndPayStage stage = PreselectAndPayStage.PRESELECT;
    private a externalPaymentMethodsModel = new a();
    private final com.yandex.payment.sdk.ui.preselect.a preselectFragmentCallbacks = new com.yandex.payment.sdk.ui.preselect.a(this);
    private final BroadcastReceiver dismissInterfaceReceiver = new BroadcastReceiver() { // from class: com.yandex.payment.sdk.ui.preselect.PreselectActivity$dismissInterfaceReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PreselectActivity.this.finishWithResult$paymentsdk_release();
        }
    };

    /* renamed from: componentDispatcher$delegate, reason: from kotlin metadata */
    private final i3y componentDispatcher = kotlin.a.a(new que0(this, 3));
    private final String ARG_RESULT_TYPE = "ARG_RESULT_TYPE";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/payment/sdk/ui/preselect/PreselectActivity$PreselectAndPayStage;", "", "PRESELECT", "WAITING_FOR_TOKEN", "PAY", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PreselectAndPayStage {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PreselectAndPayStage[] $VALUES;
        public static final PreselectAndPayStage PAY;
        public static final PreselectAndPayStage PRESELECT;
        public static final PreselectAndPayStage WAITING_FOR_TOKEN;

        static {
            PreselectAndPayStage preselectAndPayStage = new PreselectAndPayStage("PRESELECT", 0);
            PRESELECT = preselectAndPayStage;
            PreselectAndPayStage preselectAndPayStage2 = new PreselectAndPayStage("WAITING_FOR_TOKEN", 1);
            WAITING_FOR_TOKEN = preselectAndPayStage2;
            PreselectAndPayStage preselectAndPayStage3 = new PreselectAndPayStage("PAY", 2);
            PAY = preselectAndPayStage3;
            PreselectAndPayStage[] preselectAndPayStageArr = {preselectAndPayStage, preselectAndPayStage2, preselectAndPayStage3};
            $VALUES = preselectAndPayStageArr;
            $ENTRIES = kotlin.enums.a.a(preselectAndPayStageArr);
        }

        public static PreselectAndPayStage valueOf(String str) {
            return (PreselectAndPayStage) Enum.valueOf(PreselectAndPayStage.class, str);
        }

        public static PreselectAndPayStage[] values() {
            return (PreselectAndPayStage[]) $VALUES.clone();
        }
    }

    public static final class a implements t0p {
        public final ArrayList a = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bqr0 activityViewModel_delegate$lambda$0(PreselectActivity preselectActivity) {
        return (bqr0) new ls31(preselectActivity, new r720(1, ((pwf) preselectActivity.getBaseComponent$paymentsdk_release()).c())).b(bqr0.class);
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
    public static final y8h componentDispatcher_delegate$lambda$0(PreselectActivity preselectActivity) {
        y8h y8hVar = new y8h();
        y8hVar.a(wy4.class, preselectActivity.getBaseComponent$paymentsdk_release());
        y8hVar.a(mxk.class, preselectActivity.getDivKitComponent$paymentsdk_release());
        ay90 paymentComponent = preselectActivity.getPaymentComponent(preselectActivity.getIntent());
        if (paymentComponent != null) {
            y8hVar.a(ay90.class, paymentComponent);
        }
        return y8hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d1d getComponentDispatcher() {
        return (d1d) this.componentDispatcher.getValue();
    }

    private final uue0 getDKPreselectFragmentIfCurrent() {
        v40 E = getSupportFragmentManager().E(j9h0.fragment_container);
        if (E instanceof uue0) {
            return (uue0) E;
        }
        return null;
    }

    private final nmo getOrCreateExitCallbacks() {
        nmo nmoVar = this.exitCallbacks;
        if (nmoVar != null) {
            return nmoVar;
        }
        nw70 nw70Var = new nw70(28, this);
        this.exitCallbacks = nw70Var;
        return nw70Var;
    }

    private final xcy getOrCreateLicenseCallbacks() {
        xcy xcyVar = this.licenseCallbacks;
        if (xcyVar != null) {
            return xcyVar;
        }
        v5c0 v5c0Var = new v5c0(8, this);
        this.licenseCallbacks = v5c0Var;
        return v5c0Var;
    }

    private final zbq0 getOrCreateSelectCallbacks() {
        zbq0 zbq0Var = this.selectFragmentCallbacks;
        if (zbq0Var != null) {
            return zbq0Var;
        }
        PaymentToken paymentToken = this.paymentToken;
        if (paymentToken == null) {
            LinkedHashMap linkedHashMap = zdz.a;
            ogb1.b("Preselect and pay failed on payment restore");
            ny61.r("No token for payment restore");
            return null;
        }
        wy4 baseComponent$paymentsdk_release = getBaseComponent$paymentsdk_release();
        int i = 6;
        zbq0 zbq0Var2 = new zbq0(this, getBaseComponent$paymentsdk_release(), new qwf(((pwf) baseComponent$paymentsdk_release).a, new oy80(i, paymentToken, this.orderInfo)), new que0(this, 0), new que0(this, 1), new ddf(i, this), false);
        this.selectFragmentCallbacks = zbq0Var2;
        return zbq0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView getOrCreateSelectCallbacks$lambda$0(PreselectActivity preselectActivity) {
        return preselectActivity.getBinding().e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaymentButtonView getOrCreateSelectCallbacks$lambda$1(PreselectActivity preselectActivity) {
        return preselectActivity.getBinding().f;
    }

    private final ay90 getPaymentComponent(Intent intent) {
        qwf qwfVar;
        ay90 ay90Var = this.paymentComponent;
        if (ay90Var != null) {
            return ay90Var;
        }
        PaymentToken paymentToken = (PaymentToken) intent.getParcelableExtra(BaseActivity.EXTRA_PAYMENT_TOKEN);
        if (paymentToken != null) {
            wy4 baseComponent$paymentsdk_release = getBaseComponent$paymentsdk_release();
            qwfVar = new qwf(((pwf) baseComponent$paymentsdk_release).a, new oy80(6, paymentToken, (OrderInfo) intent.getParcelableExtra(BaseActivity.EXTRA_ORDER_INFO)));
        } else {
            qwfVar = null;
        }
        this.paymentComponent = qwfVar;
        return qwfVar;
    }

    private final tue0 getPreselectDKBindFragmentIfCurrent() {
        v40 E = getSupportFragmentManager().E(j9h0.fragment_container);
        if (E instanceof tue0) {
            return (tue0) E;
        }
        return null;
    }

    private final PreselectNewBindFragment getPreselectNewBindFragmentIfCurrent() {
        Fragment E = getSupportFragmentManager().E(j9h0.fragment_container);
        if (E instanceof PreselectNewBindFragment) {
            return (PreselectNewBindFragment) E;
        }
        return null;
    }

    private final aqa0 getSnackBarBinding() {
        aqa0 aqa0Var = this._snackBarBinding;
        if (aqa0Var != null) {
            return aqa0Var;
        }
        ny61.r("Required value was null.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreate$lambda$1(PreselectActivity preselectActivity, mx60 mx60Var) {
        preselectActivity.backPressed();
        return zy11.a;
    }

    private final boolean restorePayment() {
        Pair<px90, bga0> pair = this.lastPaymentHolders;
        if (pair == null) {
            r991.b = null;
            r991.c = null;
            return false;
        }
        this.continueCallbacks = new wke(getOrCreateSelectCallbacks(), pair);
        BaseActivity.replaceFragment$paymentsdk_release$default(this, new ContinuePaymentFragment(), true, 0, 4, null);
        return true;
    }

    private final void updatePreselectButton(PreselectButtonState state) {
        this.preselectFragmentCallbacks.v(state.getActive() ? new jx90(0) : ix90.a);
        this.preselectFragmentCallbacks.u(getString(ryh0.paymentsdk_pay_title), mta1.c(this, state.getTotal(), "RUB", ((pwf) getBaseComponent$paymentsdk_release()).c()), state.getSubTotal() == null ? null : mta1.c(this, state.getSubTotal().doubleValue(), "RUB", ((pwf) getBaseComponent$paymentsdk_release()).c()));
    }

    @Override // defpackage.p7u
    public d1d componentDispatcher() {
        return getComponentDispatcher();
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
        return new sue0(0, this);
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
        return getBinding().d;
    }

    public final jhq0 getSelectedMethod() {
        return this.selectedMethod;
    }

    @Override // com.yandex.payment.sdk.ui.ViewBindingActivityImpl
    public ImageView getSlideView() {
        return getBinding().h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentActivity
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment instanceof PreselectFragment) {
            ((PreselectFragment) fragment).setSelectCallbacks$paymentsdk_release(this.preselectFragmentCallbacks);
            return;
        }
        if (fragment instanceof PreselectNewBindFragment) {
            ((PreselectNewBindFragment) fragment).setBindCallbacks$paymentsdk_release(this.preselectFragmentCallbacks);
            return;
        }
        if (fragment instanceof SelectFragment) {
            ((SelectFragment) fragment).setSelectCallbacks$paymentsdk_release(getOrCreateSelectCallbacks());
            return;
        }
        if (fragment instanceof LicenseFragment) {
            ((LicenseFragment) fragment).setCallback(getOrCreateSelectCallbacks());
            return;
        }
        if (fragment instanceof saq0) {
            ((saq0) fragment).setCallback(getOrCreateSelectCallbacks());
            return;
        }
        if (fragment instanceof jgm0) {
            ((jgm0) fragment).setCallback(getOrCreateSelectCallbacks());
            return;
        }
        if (fragment instanceof ContinuePaymentFragment) {
            ((ContinuePaymentFragment) fragment).setContinuePaymentCallbacks(this.continueCallbacks);
            return;
        }
        if (fragment instanceof omo) {
            ((omo) fragment).setCallback(getOrCreateExitCallbacks());
            return;
        }
        if (fragment instanceof zcy) {
            ((zcy) fragment).setCallback(getOrCreateLicenseCallbacks());
            return;
        }
        if (fragment instanceof tue0) {
            ((tue0) fragment).setPreselectCallback(this.preselectFragmentCallbacks);
        } else if (fragment instanceof uue0) {
            ((uue0) fragment).setCallback(this.preselectFragmentCallbacks);
        } else if (fragment instanceof azj0) {
            ((azj0) fragment).setCallback(this.preselectFragmentCallbacks);
        }
    }

    @Override // com.yandex.payment.sdk.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        View O;
        Fragment fragment = null;
        this.paymentToken = savedInstanceState != null ? (PaymentToken) savedInstanceState.getParcelable(PAYMENT_TOKEN_KEY) : null;
        this.orderInfo = savedInstanceState != null ? (OrderInfo) savedInstanceState.getParcelable(ORDER_INFO_KEY) : null;
        if (shouldRestorePayment(savedInstanceState)) {
            getOrCreateSelectCallbacks().C = true;
            vvb1.I = true;
        }
        super.onCreate(savedInstanceState);
        View inflate = getLayoutInflater().inflate(rlh0.paymentsdk_activity_preselect, (ViewGroup) null, false);
        int i = j9h0.blur_view;
        View O2 = cma1.O(i, inflate);
        if (O2 != null) {
            i = j9h0.challenge_fragment;
            if (((FrameLayout) cma1.O(i, inflate)) != null && (O = cma1.O((i = j9h0.close_area), inflate)) != null) {
                i = j9h0.container_layout;
                ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i, inflate);
                if (constraintLayout != null) {
                    i = j9h0.content_layout;
                    if (((LinearLayout) cma1.O(i, inflate)) != null) {
                        i = j9h0.exit_fragment_container;
                        if (((FrameLayout) cma1.O(i, inflate)) != null) {
                            i = j9h0.fragment_container;
                            if (((FrameLayout) cma1.O(i, inflate)) != null) {
                                i = j9h0.license_agreement;
                                TextView textView = (TextView) cma1.O(i, inflate);
                                if (textView != null) {
                                    i = j9h0.loading_fragment_container;
                                    if (((FrameLayout) cma1.O(i, inflate)) != null) {
                                        i = j9h0.preselect_button;
                                        PaymentButtonView paymentButtonView = (PaymentButtonView) cma1.O(i, inflate);
                                        if (paymentButtonView != null) {
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate;
                                            i = j9h0.slide_view;
                                            ImageView imageView = (ImageView) cma1.O(i, inflate);
                                            if (imageView != null) {
                                                i = j9h0.textViewDebug;
                                                TextView textView2 = (TextView) cma1.O(i, inflate);
                                                if (textView2 != null) {
                                                    setCurrentBinding(new soa0(constraintLayout2, O2, O, constraintLayout, textView, paymentButtonView, constraintLayout2, imageView, textView2));
                                                    this._snackBarBinding = aqa0.o(constraintLayout2);
                                                    setContentView(constraintLayout2);
                                                    initBinding();
                                                    pub1.c(getOnBackPressedDispatcher(), this, new k7d0(24, this));
                                                    setupSheet();
                                                    this.startPaymentAfterSelect = getIntent().getBooleanExtra(BaseActivity.START_PAYMENT_AFTER_SELECT, false);
                                                    this.bindNewCardBeforePayment = getIntent().getBooleanExtra(BaseActivity.BIND_NEW_CARD_BEFORE_PAYMENT, false);
                                                    this.defaultPaymentMethodId = getIntent().getStringExtra(BaseActivity.EXTRA_DEFAULT_PAYMENT_METHOD);
                                                    ConstraintLayout constraintLayout3 = getSnackBarBinding().e;
                                                    final Context context = constraintLayout3.getContext();
                                                    constraintLayout3.setOnTouchListener(new OnSwipeTouchListener(context) { // from class: com.yandex.payment.sdk.ui.preselect.PreselectActivity$onCreate$3$1
                                                        @Override // com.yandex.payment.sdk.ui.view.OnSwipeTouchListener
                                                        public boolean onSwipeTop() {
                                                            PreselectActivity preselectActivity = PreselectActivity.this;
                                                            ViewBindingActivityImpl.performSnackBarTransition$default(preselectActivity, false, preselectActivity.getBinding().g, 0L, 4, null);
                                                            return true;
                                                        }
                                                    });
                                                    ArrayList g = a8a0.g(getIntent().getParcelableArrayExtra(BaseActivity.PRESELECT_PROVIDED_PAYMENT_METHODS));
                                                    this.methods = g;
                                                    if (g != null && o3a0.c.a.e()) {
                                                        this.useExternalPaymentMethods = true;
                                                    }
                                                    Intent intent = getIntent();
                                                    this.preselectButtonState = intent != null ? (PreselectButtonState) intent.getParcelableExtra(BaseActivity.EXTRA_PRESELECT_BUTTON_STATE) : null;
                                                    cleanBackStack$paymentsdk_release();
                                                    if (restorePayment()) {
                                                        return;
                                                    }
                                                    xsf xsfVar = new xsf();
                                                    boolean z = this.startPaymentAfterSelect;
                                                    String str = this.defaultPaymentMethodId;
                                                    PreselectButtonState preselectButtonState = this.preselectButtonState;
                                                    DKPreselectFragment d = xsfVar.d(str, z, preselectButtonState != null ? Double.valueOf(preselectButtonState.getTotal()) : null);
                                                    if (apa1.e(FeatureFlag.DIV_KIT_MASTER_FLAG) && apa1.e(FeatureFlag.DIV_KIT_PRESELECT_FLAG)) {
                                                        fragment = d;
                                                    }
                                                    if (fragment == null) {
                                                        xue0 xue0Var = PreselectFragment.Companion;
                                                        boolean z2 = this.startPaymentAfterSelect;
                                                        String str2 = this.defaultPaymentMethodId;
                                                        xue0Var.getClass();
                                                        fragment = xue0.a(str2, z2);
                                                    }
                                                    BaseActivity.replaceFragment$paymentsdk_release$default(this, fragment, true, 0, 4, null);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // com.yandex.payment.sdk.ui.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        PreselectActivity preselectActivity;
        Fragment a2;
        Fragment a3;
        ay90 paymentComponent = getPaymentComponent(intent);
        if (paymentComponent != null) {
            ((y8h) getComponentDispatcher()).a(ay90.class, paymentComponent);
        }
        super.onNewIntent(intent);
        PaymentToken paymentToken = (PaymentToken) intent.getParcelableExtra(BaseActivity.EXTRA_PAYMENT_TOKEN);
        if (paymentToken != null) {
            ((y22) ((pwf) getBaseComponent$paymentsdk_release()).t.get()).b.b("payment_token", paymentToken.getToken());
        } else {
            paymentToken = null;
        }
        OrderInfo orderInfo = (OrderInfo) intent.getParcelableExtra(BaseActivity.EXTRA_ORDER_INFO);
        PaymentTokenError paymentTokenError = (PaymentTokenError) intent.getParcelableExtra(BaseActivity.EXTRA_PAYMENT_TOKEN_ERROR);
        jhq0 jhq0Var = this.selectedMethod;
        ArrayList g = a8a0.g(intent.getParcelableArrayExtra(BaseActivity.PRESELECT_PROVIDED_PAYMENT_METHODS));
        if (jhq0Var == null) {
            if (this.useExternalPaymentMethods && g != null) {
                ArrayList arrayList = this.externalPaymentMethodsModel.a;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((tls) it.next()).invoke(g);
                }
                arrayList.clear();
                return;
            }
            PreselectButtonState preselectButtonState = (PreselectButtonState) intent.getParcelableExtra(BaseActivity.EXTRA_PRESELECT_BUTTON_STATE);
            if (preselectButtonState != null) {
                if (!apa1.e(FeatureFlag.DIV_KIT_MASTER_FLAG) || !apa1.e(FeatureFlag.DIV_KIT_BIND_FLAG)) {
                    PreselectNewBindFragment preselectNewBindFragmentIfCurrent = getPreselectNewBindFragmentIfCurrent();
                    if (preselectNewBindFragmentIfCurrent != null) {
                        preselectNewBindFragmentIfCurrent.setExternalButtonState$paymentsdk_release(preselectButtonState);
                        return;
                    } else {
                        updatePreselectButton(preselectButtonState);
                        return;
                    }
                }
                tue0 preselectDKBindFragmentIfCurrent = getPreselectDKBindFragmentIfCurrent();
                if (preselectDKBindFragmentIfCurrent != null) {
                    preselectButtonState.getActive();
                    preselectDKBindFragmentIfCurrent.setExternalButtonState(new htf(preselectButtonState.getTotal()));
                }
                uue0 dKPreselectFragmentIfCurrent = getDKPreselectFragmentIfCurrent();
                if (dKPreselectFragmentIfCurrent != null) {
                    preselectButtonState.getActive();
                    dKPreselectFragmentIfCurrent.setExternalButtonState(new htf(preselectButtonState.getTotal()));
                    return;
                }
                return;
            }
            return;
        }
        if (paymentToken != null) {
            this.paymentToken = paymentToken;
            this.orderInfo = orderInfo;
            zbq0 orCreateSelectCallbacks = getOrCreateSelectCallbacks();
            boolean z = jhq0Var instanceof ihq0;
            if (z && apa1.e(FeatureFlag.DIV_KIT_MASTER_FLAG) && apa1.e(FeatureFlag.DIV_KIT_BIND_FLAG)) {
                tue0 preselectDKBindFragmentIfCurrent2 = getPreselectDKBindFragmentIfCurrent();
                if (preselectDKBindFragmentIfCurrent2 != null) {
                    preselectDKBindFragmentIfCurrent2.continuePaying(paymentToken, orCreateSelectCallbacks);
                }
            } else if (z) {
                PreselectNewBindFragment preselectNewBindFragmentIfCurrent2 = getPreselectNewBindFragmentIfCurrent();
                if (preselectNewBindFragmentIfCurrent2 != null) {
                    preselectNewBindFragmentIfCurrent2.continuePaying$paymentsdk_release(paymentToken, orCreateSelectCallbacks);
                }
            } else {
                xsf xsfVar = new xsf();
                if (!apa1.e(FeatureFlag.DIV_KIT_MASTER_FLAG) || !apa1.e(FeatureFlag.DIV_KIT_SELECT_FLAG)) {
                    xsfVar = null;
                }
                if (xsfVar != null) {
                    a3 = xsfVar.g(jhq0Var.getMethod(), null, false);
                } else {
                    xbq0 xbq0Var = SelectFragment.Companion;
                    PaymentMethod method = jhq0Var.getMethod();
                    PersonalInfoVisibility personalInfoVisibility = (PersonalInfoVisibility) ((pwf) getBaseComponent$paymentsdk_release()).p.get();
                    xbq0Var.getClass();
                    a3 = xbq0.a(method, personalInfoVisibility);
                }
                preselectActivity = this;
                BaseActivity.replaceFragment$paymentsdk_release$default(preselectActivity, a3, false, 0, 6, null);
            }
            preselectActivity = this;
        } else {
            preselectActivity = this;
            if (paymentTokenError != null) {
                PaymentKitError.Kind kind = PaymentKitError.Kind.unknown;
                PaymentKitError.Trigger trigger = PaymentKitError.Trigger.internal;
                String localizedMessage = paymentTokenError.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "Unable to obtain purchase token";
                }
                PaymentKitError paymentKitError = new PaymentKitError(kind, trigger, null, null, localizedMessage, null);
                preselectActivity.saveActivityResultError$paymentsdk_release(paymentKitError);
                ResultScreenClosing resultScreenClosing = ((pwf) preselectActivity.getBaseComponent$paymentsdk_release()).a().getResultScreenClosing();
                if (apa1.e(FeatureFlag.DIV_KIT_MASTER_FLAG) && apa1.e(FeatureFlag.DIV_KIT_RESULT_FLAG)) {
                    xsf xsfVar2 = new xsf();
                    xry0 xry0Var = yry0.a;
                    TextRes.IntRes intRes = new TextRes.IntRes(iu11.b(paymentKitError, yry0.a.o));
                    TextRes.IntRes intRes2 = resultScreenClosing.getShowButton() ? new TextRes.IntRes(ryh0.paymentsdk_login_done) : null;
                    Integer a4 = iu11.a(paymentKitError);
                    a2 = wsf.a(xsfVar2, intRes, intRes2, a4 != null ? new TextRes.IntRes(a4.intValue()) : null, null, resultScreenClosing.getDelayToAutoHide(), new ResultScreenIdentifier.PreselectFailure(paymentKitError));
                } else {
                    com.yandex.payment.sdk.ui.common.a aVar = ResultFragment.Companion;
                    xry0 xry0Var2 = yry0.a;
                    int b = iu11.b(paymentKitError, yry0.a.o);
                    Integer a5 = iu11.a(paymentKitError);
                    aVar.getClass();
                    a2 = com.yandex.payment.sdk.ui.common.a.a(b, a5, resultScreenClosing);
                }
                Fragment fragment = a2;
                preselectActivity.hideLoading$paymentsdk_release();
                BaseActivity.replaceFragment$paymentsdk_release$default(preselectActivity, fragment, false, 0, 6, null);
            }
        }
        preselectActivity.stage = PreselectAndPayStage.PAY;
    }

    @Override // com.yandex.payment.sdk.ui.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable(PAYMENT_TOKEN_KEY, this.paymentToken);
        outState.putParcelable(ORDER_INFO_KEY, this.orderInfo);
    }

    public final void setSelectedMethod(jhq0 jhq0Var) {
        this.selectedMethod = jhq0Var;
    }

    @Override // com.yandex.payment.sdk.ui.BaseActivity
    public boolean shouldRestorePayment(Bundle savedInstanceState) {
        PaymentToken paymentToken;
        if (savedInstanceState == null || (paymentToken = (PaymentToken) savedInstanceState.getParcelable(PAYMENT_TOKEN_KEY)) == null) {
            return false;
        }
        Pair<px90, bga0> pair = !paymentToken.getToken().equals(r991.b) ? null : r991.c;
        this.lastPaymentHolders = pair;
        return pair != null;
    }

    public final void showLoadingFragment$paymentsdk_release(Fragment fragment) {
        v40 E = getSupportFragmentManager().E(j9h0.loading_fragment_container);
        if (E != null) {
            ResultType resultType = (ResultType) fragment.requireArguments().getParcelable(this.ARG_RESULT_TYPE);
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
        finishWithResult$paymentsdk_release();
    }

    public final void showSnackBar(int titleRes, Integer subtitleRes) {
        getSnackBarBinding().d.setText(titleRes);
        n891.c(getSnackBarBinding().c, subtitleRes);
        ViewBindingActivityImpl.performSnackBarTransition$default(this, true, getBinding().g, 0L, 4, null);
    }
}
