package com.yandex.payment.sdk.ui.challenger;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import androidx.transition.TransitionManager;
import com.yandex.payment.sdk.core.data.ConsoleLoggingMode;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.yandex.payment.sdk.core.data.SbpChallengeInfo;
import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import com.yandex.payment.sdk.model.data.AdditionalSettings;
import com.yandex.payment.sdk.model.data.WidthOnLargeScreen;
import com.yandex.payment.sdk.ui.BaseActivity;
import com.yandex.payment.sdk.ui.challenger.SbpChallengerActivity;
import defpackage.agm0;
import defpackage.apa1;
import defpackage.b99;
import defpackage.bgm0;
import defpackage.c950;
import defpackage.c99;
import defpackage.cgm0;
import defpackage.ckt;
import defpackage.cma1;
import defpackage.cof;
import defpackage.d99;
import defpackage.dgm0;
import defpackage.dy40;
import defpackage.egm0;
import defpackage.evu0;
import defpackage.f950;
import defpackage.hfm0;
import defpackage.hvg0;
import defpackage.i3y;
import defpackage.j9h0;
import defpackage.jfm0;
import defpackage.jl40;
import defpackage.kfm0;
import defpackage.ls31;
import defpackage.lvf;
import defpackage.msb1;
import defpackage.mx60;
import defpackage.n891;
import defpackage.ny61;
import defpackage.pub1;
import defpackage.pwf;
import defpackage.qoa0;
import defpackage.qv90;
import defpackage.rlh0;
import defpackage.rw4;
import defpackage.rwo;
import defpackage.ryh0;
import defpackage.sls;
import defpackage.sv90;
import defpackage.u870;
import defpackage.w511;
import defpackage.wy4;
import defpackage.xfm0;
import defpackage.xpa0;
import defpackage.y22;
import defpackage.yfm0;
import defpackage.yr31;
import defpackage.zfm0;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 D2\u00020\u0001:\u0002EFB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u0019\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010 \u001a\u00028\u0000\"\n\b\u0000\u0010\u001f\u0018\u0001*\u00020\u001e*\u00020\u0001H\u0082\b¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"H\u0014¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0004¢\u0006\u0004\b&\u0010\u0003J\u000f\u0010'\u001a\u00020\u0004H\u0014¢\u0006\u0004\b'\u0010\u0003J\u000f\u0010(\u001a\u00020\u0004H\u0014¢\u0006\u0004\b(\u0010\u0003J\u000f\u0010)\u001a\u00020\u0004H\u0014¢\u0006\u0004\b)\u0010\u0003R\u0018\u0010*\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001b\u00104\u001a\u00020/8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00108R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006G"}, d2 = {"Lcom/yandex/payment/sdk/ui/challenger/SbpChallengerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lzy11;", "backPressed", "Lqoa0;", "binding", "initBinding", "(Lqoa0;)V", "observeViewModel", "closePayment", "startTimer", "", "messageResId", "showSnackbarError", "(I)V", "Landroid/view/ViewGroup;", "container", "applyWidthOnLargeScreen", "(Landroid/view/ViewGroup;)V", "", "showBar", "performSnackBarTransition", "(Z)V", "showExitLayout", "performExitLayoutTransition", "Lxpa0;", "setupExitBinding", "(Lxpa0;)V", "Lyr31;", "VM", "viewModels", "(Landroidx/appcompat/app/AppCompatActivity;)Lyr31;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "cancelTimer", "onStart", "onStop", "onDestroy", "currentBinding", "Lqoa0;", "Lcom/yandex/payment/sdk/model/data/AdditionalSettings;", "additionalSettings", "Lcom/yandex/payment/sdk/model/data/AdditionalSettings;", "Lwy4;", "baseComponent$delegate", "Li3y;", "getBaseComponent$paymentsdk_release", "()Lwy4;", "baseComponent", "Legm0;", "activityViewModel$delegate", "getActivityViewModel", "()Legm0;", "activityViewModel", "Landroid/os/CountDownTimer;", "countDownTimer", "Landroid/os/CountDownTimer;", "getBinding", "()Lqoa0;", "isPaymentContext", "()Z", "getConfirmExitTitleRes", "()I", "confirmExitTitleRes", "Companion", "jfm0", "lvf", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SbpChallengerActivity extends AppCompatActivity {
    public static final int CHALLENGER_FAILED_RESULT_CODE = 1000;
    public static final int CHALLENGER_REQUEST_CODE = 1111;
    public static final jfm0 Companion = new jfm0();
    public static final String EXTRA_CHALLENGE_INFO_DATA = "CHALLENGE_INFO_DATA";
    public static final String EXTRA_MODULE_DATA = "MODULE_DATA";
    public static final String EXTRA_SBP_TOKEN_DATA = "SBP_TOKEN_DATA";
    public static final long TIMER_DURATION = 5000;
    public static final long TIMER_TICK = 1000;

    /* renamed from: activityViewModel$delegate, reason: from kotlin metadata */
    private final i3y activityViewModel;
    private AdditionalSettings additionalSettings;

    /* renamed from: baseComponent$delegate, reason: from kotlin metadata */
    private final i3y baseComponent;
    private CountDownTimer countDownTimer;
    private qoa0 currentBinding;

    public SbpChallengerActivity() {
        final int i = 0;
        this.baseComponent = a.a(new sls(this) { // from class: gfm0
            public final /* synthetic */ SbpChallengerActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                wy4 baseComponent_delegate$lambda$0;
                egm0 activityViewModel_delegate$lambda$0;
                int i2 = i;
                SbpChallengerActivity sbpChallengerActivity = this.b;
                switch (i2) {
                    case 0:
                        baseComponent_delegate$lambda$0 = SbpChallengerActivity.baseComponent_delegate$lambda$0(sbpChallengerActivity);
                        return baseComponent_delegate$lambda$0;
                    default:
                        activityViewModel_delegate$lambda$0 = SbpChallengerActivity.activityViewModel_delegate$lambda$0(sbpChallengerActivity);
                        return activityViewModel_delegate$lambda$0;
                }
            }
        });
        final int i2 = 1;
        this.activityViewModel = a.b(LazyThreadSafetyMode.NONE, new sls(this) { // from class: gfm0
            public final /* synthetic */ SbpChallengerActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                wy4 baseComponent_delegate$lambda$0;
                egm0 activityViewModel_delegate$lambda$0;
                int i22 = i2;
                SbpChallengerActivity sbpChallengerActivity = this.b;
                switch (i22) {
                    case 0:
                        baseComponent_delegate$lambda$0 = SbpChallengerActivity.baseComponent_delegate$lambda$0(sbpChallengerActivity);
                        return baseComponent_delegate$lambda$0;
                    default:
                        activityViewModel_delegate$lambda$0 = SbpChallengerActivity.activityViewModel_delegate$lambda$0(sbpChallengerActivity);
                        return activityViewModel_delegate$lambda$0;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final egm0 activityViewModel_delegate$lambda$0(SbpChallengerActivity sbpChallengerActivity) {
        return (egm0) new ls31(sbpChallengerActivity, new lvf(((pwf) sbpChallengerActivity.getBaseComponent$paymentsdk_release()).f(), ((pwf) sbpChallengerActivity.getBaseComponent$paymentsdk_release()).c())).b(egm0.class);
    }

    private final void applyWidthOnLargeScreen(ViewGroup container) {
        if (getResources().getDisplayMetrics().widthPixels >= getResources().getDimensionPixelSize(hvg0.paymentsdk_large_screen_width_threshold)) {
            AdditionalSettings additionalSettings = this.additionalSettings;
            WidthOnLargeScreen widthOnLargeScreen = additionalSettings != null ? additionalSettings.getWidthOnLargeScreen() : null;
            int i = -1;
            int i2 = widthOnLargeScreen == null ? -1 : kfm0.a[widthOnLargeScreen.ordinal()];
            if (i2 != -1) {
                if (i2 == 1) {
                    rw4 rw4Var = BaseActivity.Companion;
                    Resources resources = getResources();
                    rw4Var.getClass();
                    i = resources.getDimensionPixelSize(hvg0.paymentsdk_large_screen_compact_width);
                } else if (i2 != 2) {
                    w511.b();
                    return;
                }
            }
            container.getLayoutParams().width = i;
        }
    }

    private final void backPressed() {
        getActivityViewModel().Y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wy4 baseComponent_delegate$lambda$0(SbpChallengerActivity sbpChallengerActivity) {
        Bundle bundleExtra = sbpChallengerActivity.getIntent().getBundleExtra(EXTRA_MODULE_DATA);
        sbpChallengerActivity.additionalSettings = bundleExtra != null ? (AdditionalSettings) bundleExtra.getParcelable(BaseActivity.ADDITIONAL_SETTINGS) : null;
        msb1 msb1Var = msb1.x;
        Payer payer = bundleExtra != null ? (Payer) bundleExtra.getParcelable(BaseActivity.EXTRA_PAYER_DATA) : null;
        Merchant merchant = (Merchant) bundleExtra.getParcelable(BaseActivity.EXTRA_MERCHANT_DATA);
        AdditionalSettings additionalSettings = sbpChallengerActivity.additionalSettings;
        PaymentSdkEnvironment paymentSdkEnvironment = (PaymentSdkEnvironment) bundleExtra.getParcelable(BaseActivity.EXTRA_ENVIRONMENT);
        ConsoleLoggingMode consoleLoggingMode = (ConsoleLoggingMode) bundleExtra.getParcelable(BaseActivity.CONSOLE_LOGGING_MODE);
        String string = bundleExtra.getString(BaseActivity.EXTRA_LOGGER_KEY);
        if (string == null) {
            string = "";
        }
        return msb1Var.f(null, sbpChallengerActivity, consoleLoggingMode, merchant, payer, paymentSdkEnvironment, additionalSettings, string);
    }

    private final void closePayment() {
        setResult(1000);
        finish();
    }

    private final egm0 getActivityViewModel() {
        return (egm0) this.activityViewModel.getValue();
    }

    private final qoa0 getBinding() {
        qoa0 qoa0Var = this.currentBinding;
        if (qoa0Var != null) {
            return qoa0Var;
        }
        ny61.r("Binding is not initialized");
        return null;
    }

    private final int getConfirmExitTitleRes() {
        return isPaymentContext() ? ryh0.paymentsdk_cancel_payment_title : ryh0.paymentsdk_exit_title;
    }

    private final void initBinding(qoa0 binding) {
        setupExitBinding(binding.c);
        observeViewModel();
    }

    private final boolean isPaymentContext() {
        Intent intent = getIntent();
        return n891.o(intent != null ? Boolean.valueOf(intent.getBooleanExtra(BaseActivity.EXTRA_PAYMENT_CONTEXT, false)) : null);
    }

    private final void observeViewModel() {
        int i = 8;
        getActivityViewModel().c.f(this, new cof(i, new hfm0(this, 0)));
        getActivityViewModel().y.f(this, new cof(i, new hfm0(this, 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeViewModel$lambda$0(SbpChallengerActivity sbpChallengerActivity, f950 f950Var) {
        if (jl40.l(f950Var, c950.a)) {
            sbpChallengerActivity.closePayment();
        } else if (jl40.l(f950Var, c950.b)) {
            sbpChallengerActivity.performExitLayoutTransition(false);
        } else if (jl40.l(f950Var, c950.d)) {
            sbpChallengerActivity.performExitLayoutTransition(true);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeViewModel$lambda$1(SbpChallengerActivity sbpChallengerActivity, cgm0 cgm0Var) {
        if (cgm0Var instanceof xfm0) {
            sbpChallengerActivity.showSnackbarError(((xfm0) cgm0Var).a);
        } else if ((cgm0Var instanceof agm0) || (cgm0Var instanceof zfm0)) {
            sbpChallengerActivity.performSnackBarTransition(false);
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(sbpChallengerActivity.getSupportFragmentManager());
            aVar.h(j9h0.fragmentContainer, new SbpChallengerErrorFragment(), null);
            aVar.d();
        } else if (cgm0Var instanceof yfm0) {
            sbpChallengerActivity.closePayment();
        } else {
            if (!(cgm0Var instanceof bgm0)) {
                w511.b();
                return null;
            }
            sbpChallengerActivity.finish();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreate$lambda$1(SbpChallengerActivity sbpChallengerActivity, mx60 mx60Var) {
        sbpChallengerActivity.backPressed();
        return zy11.a;
    }

    private final void performExitLayoutTransition(boolean showExitLayout) {
        e eVar = new e();
        eVar.g(getBinding().e);
        if (showExitLayout) {
            eVar.x(j9h0.blurView, 0);
            eVar.e(j9h0.exitFrame, 3);
            eVar.i(j9h0.exitFrame, 4, 0, 4);
        } else {
            eVar.x(j9h0.blurView, 8);
            eVar.e(j9h0.exitFrame, 4);
            eVar.i(j9h0.exitFrame, 3, 0, 4);
        }
        eVar.b(getBinding().e);
        TransitionManager.a(null, getBinding().e);
    }

    private final void performSnackBarTransition(boolean showBar) {
        e eVar = new e();
        eVar.g(getBinding().d);
        if (showBar) {
            eVar.e(j9h0.snackBarLayout, 4);
            eVar.j(j9h0.snackBarLayout, 3, 0, 3, n891.k(16));
            startTimer();
        } else {
            eVar.e(j9h0.snackBarLayout, 3);
            eVar.i(j9h0.snackBarLayout, 4, 0, 3);
        }
        eVar.b(getBinding().d);
        TransitionManager.a(null, getBinding().d);
    }

    private final void setupExitBinding(xpa0 binding) {
        binding.e.setText(getConfirmExitTitleRes());
        final int i = 0;
        binding.d.setOnClickListener(new View.OnClickListener(this) { // from class: ifm0
            public final /* synthetic */ SbpChallengerActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                SbpChallengerActivity sbpChallengerActivity = this.b;
                switch (i2) {
                    case 0:
                        SbpChallengerActivity.setupExitBinding$lambda$0$0(sbpChallengerActivity, view);
                        break;
                    default:
                        SbpChallengerActivity.setupExitBinding$lambda$0$1(sbpChallengerActivity, view);
                        break;
                }
            }
        });
        final int i2 = 1;
        binding.c.setOnClickListener(new View.OnClickListener(this) { // from class: ifm0
            public final /* synthetic */ SbpChallengerActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                SbpChallengerActivity sbpChallengerActivity = this.b;
                switch (i22) {
                    case 0:
                        SbpChallengerActivity.setupExitBinding$lambda$0$0(sbpChallengerActivity, view);
                        break;
                    default:
                        SbpChallengerActivity.setupExitBinding$lambda$0$1(sbpChallengerActivity, view);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupExitBinding$lambda$0$0(SbpChallengerActivity sbpChallengerActivity, View view) {
        sbpChallengerActivity.getActivityViewModel().X();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupExitBinding$lambda$0$1(SbpChallengerActivity sbpChallengerActivity, View view) {
        sbpChallengerActivity.getActivityViewModel().Q();
    }

    private final void showSnackbarError(int messageResId) {
        getBinding().f.setText(messageResId);
        performSnackBarTransition(true);
    }

    private final void startTimer() {
        CountDownTimer countDownTimer = this.countDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.countDownTimer = new CountDownTimer() { // from class: com.yandex.payment.sdk.ui.challenger.SbpChallengerActivity$startTimer$1
            {
                super(5000L, 1000L);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                SbpChallengerActivity.this.cancelTimer();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long millisUntilFinished) {
            }
        }.start();
    }

    private final <VM extends yr31> VM viewModels(AppCompatActivity appCompatActivity) {
        new ls31(appCompatActivity, new lvf(((pwf) getBaseComponent$paymentsdk_release()).f(), ((pwf) getBaseComponent$paymentsdk_release()).c()));
        jl40.P();
        throw null;
    }

    public final void cancelTimer() {
        performSnackBarTransition(false);
        CountDownTimer countDownTimer = this.countDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.countDownTimer = null;
        }
    }

    public final wy4 getBaseComponent$paymentsdk_release() {
        return (wy4) this.baseComponent.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        View O;
        Pair pair;
        int a = ckt.a(this);
        setTheme(a);
        getApplicationContext().setTheme(a);
        super.onCreate(savedInstanceState);
        View inflate = getLayoutInflater().inflate(rlh0.paymentsdk_activity_challenger, (ViewGroup) null, false);
        int i = j9h0.blurView;
        View O2 = cma1.O(i, inflate);
        if (O2 != null && (O = cma1.O((i = j9h0.confirmExitContainer), inflate)) != null) {
            xpa0 o = xpa0.o(O);
            i = j9h0.container_layout;
            ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i, inflate);
            if (constraintLayout != null) {
                i = j9h0.exitFrame;
                if (((FrameLayout) cma1.O(i, inflate)) != null) {
                    i = j9h0.fragmentContainer;
                    if (((FrameLayout) cma1.O(i, inflate)) != null) {
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate;
                        i = j9h0.snackBarLayout;
                        if (((LinearLayout) cma1.O(i, inflate)) != null) {
                            i = j9h0.snackbarTextView;
                            TextView textView = (TextView) cma1.O(i, inflate);
                            if (textView != null) {
                                qoa0 qoa0Var = new qoa0(constraintLayout2, O2, o, constraintLayout, constraintLayout2, textView);
                                this.currentBinding = qoa0Var;
                                setContentView(constraintLayout2);
                                applyWidthOnLargeScreen(constraintLayout);
                                initBinding(qoa0Var);
                                pub1.c(getOnBackPressedDispatcher(), this, new hfm0(this, 2));
                                SbpChallengeInfo sbpChallengeInfo = (SbpChallengeInfo) getIntent().getParcelableExtra(EXTRA_CHALLENGE_INFO_DATA);
                                PaymentMethod.SbpToken sbpToken = (PaymentMethod.SbpToken) getIntent().getParcelableExtra(EXTRA_SBP_TOKEN_DATA);
                                if (sbpChallengeInfo == null || sbpToken == null) {
                                    return;
                                }
                                egm0 activityViewModel = getActivityViewModel();
                                rwo rwoVar = activityViewModel.x;
                                sv90 sv90Var = qv90.a;
                                String id = sbpToken.getId();
                                String verificationId = sbpChallengeInfo.getVerificationId();
                                sv90Var.getClass();
                                ((y22) rwoVar).a(sv90.m0(id, verificationId));
                                activityViewModel.z.m(new Pair(sbpToken, sbpChallengeInfo));
                                dy40 dy40Var = activityViewModel.A;
                                if (dgm0.a[sbpChallengeInfo.getMethod().ordinal()] == 1) {
                                    activityViewModel.a0(Long.valueOf(sbpChallengeInfo.getDenyResendUntil()));
                                    pair = new Pair(d99.c, new SbpChallengerViewModel$initConfig$1(1, activityViewModel, egm0.class, "verifySbpToken", "verifySbpToken(Ljava/lang/String;)V", 0));
                                } else {
                                    String format = sbpChallengeInfo.getFormat();
                                    if (format == null) {
                                        format = "";
                                    }
                                    pair = new Pair(evu0.H(format, Extension.DOT_CHAR, 0, false, 6) == 1 ? c99.c : b99.c, new SbpChallengerViewModel$initConfig$2(1, activityViewModel, egm0.class, "formatCode", "formatCode(Ljava/lang/String;)V", 0));
                                }
                                dy40Var.l(pair);
                                androidx.fragment.app.a aVar = new androidx.fragment.app.a(getSupportFragmentManager());
                                int i2 = j9h0.fragmentContainer;
                                SbpChallengerFragment.Companion.getClass();
                                aVar.h(i2, new SbpChallengerFragment(), null);
                                aVar.d();
                                return;
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((u870) ((pwf) getBaseComponent$paymentsdk_release()).g.get()).a();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        getWindow().setFlags(apa1.e(FeatureFlag.ALLOW_SCREEN_SHOT_FLAG) ? 0 : 8192, 8192);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        getWindow().setFlags(0, 8192);
    }
}
