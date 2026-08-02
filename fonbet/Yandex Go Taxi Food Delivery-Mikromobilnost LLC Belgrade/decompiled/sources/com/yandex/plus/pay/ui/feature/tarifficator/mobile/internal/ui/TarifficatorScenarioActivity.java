package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui;

import android.R;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.core.config.Environment;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.metrica.utils.e;
import com.yandex.plus.pay.ui.common.api.PlusPayOverrideConfigurationActivity;
import com.yandex.plus.pay.ui.common.api.log.PlusPayLogLayoutInflaterFactory;
import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.PlusTarifficatorMobileArguments;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.PlusTarifficatorMobileResult;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.b;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.PresaleFragment;
import com.yandex.plus.ui.core.theme.PlusTheme;
import defpackage.a33;
import defpackage.alc;
import defpackage.arx0;
import defpackage.bad0;
import defpackage.bb1;
import defpackage.bc;
import defpackage.bdt;
import defpackage.brx0;
import defpackage.cdt;
import defpackage.crx0;
import defpackage.cs31;
import defpackage.d1i0;
import defpackage.d2d0;
import defpackage.d5b0;
import defpackage.drx0;
import defpackage.e2d0;
import defpackage.es31;
import defpackage.eu90;
import defpackage.fdh;
import defpackage.ffx;
import defpackage.fjh;
import defpackage.ftb;
import defpackage.fu90;
import defpackage.gbd0;
import defpackage.gmh0;
import defpackage.hj;
import defpackage.ho91;
import defpackage.hs31;
import defpackage.hwa0;
import defpackage.i3y;
import defpackage.ind0;
import defpackage.j73;
import defpackage.jlc;
import defpackage.jmh0;
import defpackage.jmm0;
import defpackage.jnd0;
import defpackage.kdd0;
import defpackage.kgx;
import defpackage.kmm0;
import defpackage.ldd0;
import defpackage.ll5;
import defpackage.m0p;
import defpackage.mdd0;
import defpackage.mj31;
import defpackage.mkn;
import defpackage.mx60;
import defpackage.n4u0;
import defpackage.ndd0;
import defpackage.ny61;
import defpackage.ovg0;
import defpackage.oy80;
import defpackage.ped0;
import defpackage.pgz;
import defpackage.pmm0;
import defpackage.pub1;
import defpackage.qc20;
import defpackage.qnd0;
import defpackage.qoi0;
import defpackage.rnd0;
import defpackage.s5w0;
import defpackage.skd0;
import defpackage.sls;
import defpackage.snd0;
import defpackage.syq0;
import defpackage.t23;
import defpackage.tnd0;
import defpackage.u570;
import defpackage.vbi0;
import defpackage.vng;
import defpackage.vt20;
import defpackage.w511;
import defpackage.xt20;
import defpackage.y8f;
import defpackage.ydj;
import defpackage.ywv;
import defpackage.zy11;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.a;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0004R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\u0006\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001d\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/TarifficatorScenarioActivity;", "Lcom/yandex/plus/pay/ui/common/api/PlusPayOverrideConfigurationActivity;", "Le2d0;", "<init>", "()V", "Ljmm0;", "component", "Lzy11;", "setupDebugMenu", "(Ljmm0;)V", "Lqnd0;", "findTarifficatorComponent", "()Lqnd0;", "Lsyq0;", "sessionController", "bindAnalyticsSession", "(Lsyq0;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResumeFragments", "onPause", "finish", "", "isActivityRecreatedAfterApplicationDeath", "Z", "Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/api/PlusTarifficatorMobileArguments;", "args$delegate", "Li3y;", "getArgs", "()Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/api/PlusTarifficatorMobileArguments;", "args", "component$delegate", "Lvbi0;", "getComponent", "()Ljmm0;", "Lcrx0;", "navigator$delegate", "getNavigator", "()Lcrx0;", "navigator", "Ldrx0;", "viewModel$delegate", "getViewModel", "()Ldrx0;", "viewModel", "Ld2d0;", "getDependencies", "()Ld2d0;", "dependencies", "Companion", "brx0", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TarifficatorScenarioActivity extends PlusPayOverrideConfigurationActivity implements e2d0 {
    static final /* synthetic */ kgx[] $$delegatedProperties;
    public static final String ARGS_KEY = "args";
    public static final brx0 Companion;
    public static final String RESULT_KEY = "result";
    private static final String SCENARIO_LOG_TAG = "Tarifficator";

    /* renamed from: args$delegate, reason: from kotlin metadata */
    private final i3y args;

    /* renamed from: component$delegate, reason: from kotlin metadata */
    private final vbi0 component;
    private boolean isActivityRecreatedAfterApplicationDeath;

    /* renamed from: navigator$delegate, reason: from kotlin metadata */
    private final i3y navigator;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl("component", 0, "getComponent()Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/common/di/ScenarioComponent;", TarifficatorScenarioActivity.class);
        qoi0.a.getClass();
        $$delegatedProperties = new kgx[]{propertyReference1Impl};
        Companion = new brx0();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [arx0] */
    public TarifficatorScenarioActivity() {
        super(jmh0.pay_sdk_activity_tarifficator);
        final int i = 0;
        this.args = a.a(new sls(this) { // from class: arx0
            public final /* synthetic */ TarifficatorScenarioActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                PlusTarifficatorMobileArguments args_delegate$lambda$0;
                jmm0 component_delegate$lambda$1;
                crx0 navigator_delegate$lambda$2;
                hs31 viewModel_delegate$lambda$3;
                int i2 = i;
                TarifficatorScenarioActivity tarifficatorScenarioActivity = this.b;
                switch (i2) {
                    case 0:
                        args_delegate$lambda$0 = TarifficatorScenarioActivity.args_delegate$lambda$0(tarifficatorScenarioActivity);
                        return args_delegate$lambda$0;
                    case 1:
                        component_delegate$lambda$1 = TarifficatorScenarioActivity.component_delegate$lambda$1(tarifficatorScenarioActivity);
                        return component_delegate$lambda$1;
                    case 2:
                        navigator_delegate$lambda$2 = TarifficatorScenarioActivity.navigator_delegate$lambda$2(tarifficatorScenarioActivity);
                        return navigator_delegate$lambda$2;
                    default:
                        viewModel_delegate$lambda$3 = TarifficatorScenarioActivity.viewModel_delegate$lambda$3(tarifficatorScenarioActivity);
                        return viewModel_delegate$lambda$3;
                }
            }
        });
        final int i2 = 1;
        this.component = new oy80(this, (arx0) new sls(this) { // from class: arx0
            public final /* synthetic */ TarifficatorScenarioActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                PlusTarifficatorMobileArguments args_delegate$lambda$0;
                jmm0 component_delegate$lambda$1;
                crx0 navigator_delegate$lambda$2;
                hs31 viewModel_delegate$lambda$3;
                int i22 = i2;
                TarifficatorScenarioActivity tarifficatorScenarioActivity = this.b;
                switch (i22) {
                    case 0:
                        args_delegate$lambda$0 = TarifficatorScenarioActivity.args_delegate$lambda$0(tarifficatorScenarioActivity);
                        return args_delegate$lambda$0;
                    case 1:
                        component_delegate$lambda$1 = TarifficatorScenarioActivity.component_delegate$lambda$1(tarifficatorScenarioActivity);
                        return component_delegate$lambda$1;
                    case 2:
                        navigator_delegate$lambda$2 = TarifficatorScenarioActivity.navigator_delegate$lambda$2(tarifficatorScenarioActivity);
                        return navigator_delegate$lambda$2;
                    default:
                        viewModel_delegate$lambda$3 = TarifficatorScenarioActivity.viewModel_delegate$lambda$3(tarifficatorScenarioActivity);
                        return viewModel_delegate$lambda$3;
                }
            }
        });
        final int i3 = 2;
        this.navigator = a.a(new sls(this) { // from class: arx0
            public final /* synthetic */ TarifficatorScenarioActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                PlusTarifficatorMobileArguments args_delegate$lambda$0;
                jmm0 component_delegate$lambda$1;
                crx0 navigator_delegate$lambda$2;
                hs31 viewModel_delegate$lambda$3;
                int i22 = i3;
                TarifficatorScenarioActivity tarifficatorScenarioActivity = this.b;
                switch (i22) {
                    case 0:
                        args_delegate$lambda$0 = TarifficatorScenarioActivity.args_delegate$lambda$0(tarifficatorScenarioActivity);
                        return args_delegate$lambda$0;
                    case 1:
                        component_delegate$lambda$1 = TarifficatorScenarioActivity.component_delegate$lambda$1(tarifficatorScenarioActivity);
                        return component_delegate$lambda$1;
                    case 2:
                        navigator_delegate$lambda$2 = TarifficatorScenarioActivity.navigator_delegate$lambda$2(tarifficatorScenarioActivity);
                        return navigator_delegate$lambda$2;
                    default:
                        viewModel_delegate$lambda$3 = TarifficatorScenarioActivity.viewModel_delegate$lambda$3(tarifficatorScenarioActivity);
                        return viewModel_delegate$lambda$3;
                }
            }
        });
        final int i4 = 3;
        this.viewModel = new es31(qoi0.a(drx0.class), new sls(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity$special$$inlined$viewModels$default$2
            final /* synthetic */ ComponentActivity $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return this.$this_viewModels.getViewModelStore();
            }
        }, new sls(this) { // from class: arx0
            public final /* synthetic */ TarifficatorScenarioActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                PlusTarifficatorMobileArguments args_delegate$lambda$0;
                jmm0 component_delegate$lambda$1;
                crx0 navigator_delegate$lambda$2;
                hs31 viewModel_delegate$lambda$3;
                int i22 = i4;
                TarifficatorScenarioActivity tarifficatorScenarioActivity = this.b;
                switch (i22) {
                    case 0:
                        args_delegate$lambda$0 = TarifficatorScenarioActivity.args_delegate$lambda$0(tarifficatorScenarioActivity);
                        return args_delegate$lambda$0;
                    case 1:
                        component_delegate$lambda$1 = TarifficatorScenarioActivity.component_delegate$lambda$1(tarifficatorScenarioActivity);
                        return component_delegate$lambda$1;
                    case 2:
                        navigator_delegate$lambda$2 = TarifficatorScenarioActivity.navigator_delegate$lambda$2(tarifficatorScenarioActivity);
                        return navigator_delegate$lambda$2;
                    default:
                        viewModel_delegate$lambda$3 = TarifficatorScenarioActivity.viewModel_delegate$lambda$3(tarifficatorScenarioActivity);
                        return viewModel_delegate$lambda$3;
                }
            }
        }, new sls(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity$special$$inlined$viewModels$default$3
            final /* synthetic */ sls $extrasProducer = null;
            final /* synthetic */ ComponentActivity $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                y8f y8fVar;
                sls slsVar = this.$extrasProducer;
                return (slsVar == null || (y8fVar = (y8f) slsVar.invoke()) == null) ? this.$this_viewModels.getDefaultViewModelCreationExtras() : y8fVar;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlusTarifficatorMobileArguments args_delegate$lambda$0(TarifficatorScenarioActivity tarifficatorScenarioActivity) {
        PlusTarifficatorMobileArguments plusTarifficatorMobileArguments;
        Intent intent = tarifficatorScenarioActivity.getIntent();
        if (intent != null && (plusTarifficatorMobileArguments = (PlusTarifficatorMobileArguments) ((Parcelable) ffx.P(intent, "args", PlusTarifficatorMobileArguments.class))) != null) {
            return plusTarifficatorMobileArguments;
        }
        ny61.r("TarifficatorScenarioActivity must be created with contract");
        return null;
    }

    private final void bindAnalyticsSession(syq0 sessionController) {
        getLifecycle().a(new fdh(3, sessionController));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jmm0 component_delegate$lambda$1(TarifficatorScenarioActivity tarifficatorScenarioActivity) {
        PlusTarifficatorMobileArguments args = tarifficatorScenarioActivity.getArgs();
        m0p m0pVar = ((snd0) ((qnd0) rnd0.c.a(ho91.c(tarifficatorScenarioActivity)))).a;
        eu90 eu90Var = m0pVar.y;
        fu90 fu90Var = m0pVar.z;
        ped0 ped0Var = m0pVar.m;
        final bc bcVar = new bc();
        bcVar.a = eu90Var;
        bcVar.b = fu90Var;
        bcVar.c = ped0Var;
        final int i = 0;
        bcVar.w = a.a(new sls() { // from class: o42
            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                bc bcVar2 = bcVar;
                switch (i2) {
                    case 0:
                        return new q42(bcVar2);
                    default:
                        return new u7d0((fu90) bcVar2.b);
                }
            }
        });
        final int i2 = 1;
        bcVar.x = a.a(new sls() { // from class: o42
            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                bc bcVar2 = bcVar;
                switch (i22) {
                    case 0:
                        return new q42(bcVar2);
                    default:
                        return new u7d0((fu90) bcVar2.b);
                }
            }
        });
        pmm0 pmm0Var = new pmm0(bcVar, args, m0pVar.a, m0pVar.c, m0pVar.d, m0pVar.e, m0pVar.f, m0pVar.l, m0pVar.m, m0pVar.q, m0pVar.r, m0pVar.g, m0pVar.i, m0pVar.j, m0pVar.k, m0pVar.s, m0pVar.t, m0pVar.h, m0pVar.u, m0pVar.v, m0pVar.w, m0pVar.x, m0pVar.A, m0pVar.B, m0pVar.o, m0pVar.n);
        return new kmm0(pmm0Var, new mj31(1, pmm0Var, bcVar, args));
    }

    private final qnd0 findTarifficatorComponent() {
        Object failure;
        try {
            failure = (qnd0) rnd0.c.a(ho91.c(this));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            skd0.c(PlusLogTag.BILLING, "PlusTarifficatorMobileComponent is not found!", a);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (qnd0) failure;
    }

    private final PlusTarifficatorMobileArguments getArgs() {
        return (PlusTarifficatorMobileArguments) this.args.getValue();
    }

    private final jmm0 getComponent() {
        return (jmm0) this.component.getValue(this, $$delegatedProperties[0]);
    }

    private final crx0 getNavigator() {
        return (crx0) this.navigator.getValue();
    }

    private final drx0 getViewModel() {
        return (drx0) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final crx0 navigator_delegate$lambda$2(TarifficatorScenarioActivity tarifficatorScenarioActivity) {
        return new crx0(tarifficatorScenarioActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreate$lambda$4(TarifficatorScenarioActivity tarifficatorScenarioActivity, mx60 mx60Var) {
        if (tarifficatorScenarioActivity.getSupportFragmentManager().K() == 0) {
            tarifficatorScenarioActivity.getViewModel().x.a();
        } else {
            tarifficatorScenarioActivity.getSupportFragmentManager().V();
        }
        return zy11.a;
    }

    private final void setupDebugMenu(jmm0 component) {
        com.yandex.plus.domain.auth.impl.a aVar = ((kmm0) component).a.k;
        pmm0 pmm0Var = ((kmm0) component).a;
        Environment environment = pmm0Var.f;
        tnd0 tnd0Var = pmm0Var.x;
        if (environment != Environment.TESTING) {
            Object value = aVar.h.getValue();
            hj hjVar = value instanceof hj ? (hj) value : null;
            if (!(hjVar != null ? hjVar.c : false)) {
                return;
            }
        }
        if (ffx.K(((vt20) ((xt20) tnd0Var.a.a())).u)) {
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content);
            View inflate = LayoutInflater.from(this).inflate(gmh0.pay_sdk_view_debug_button, viewGroup, false);
            t23 t23Var = new t23();
            a33 a33Var = a33.b;
            t23.a aVar2 = new t23.a();
            aVar2.c();
            aVar2.b();
            t23Var.a.put(a33Var, aVar2);
            t23Var.a(inflate);
            bb1.L(inflate, new d5b0(10, this));
            viewGroup.addView(inflate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 viewModel_delegate$lambda$3(TarifficatorScenarioActivity tarifficatorScenarioActivity) {
        cs31[] cs31VarArr = (cs31[]) Arrays.copyOf(new cs31[]{new cs31(drx0.class, new b(((kmm0) tarifficatorScenarioActivity.getComponent()).b, 0))}, 1);
        return new ywv((cs31[]) Arrays.copyOf(cs31VarArr, cs31VarArr.length));
    }

    @Override // android.app.Activity
    public void finish() {
        Parcelable paymentSuccess;
        if (this.isActivityRecreatedAfterApplicationDeath) {
            super.finish();
            return;
        }
        drx0 viewModel = getViewModel();
        bdt bdtVar = viewModel.c;
        ind0 a = viewModel.b.a.a();
        PlusTarifficatorMobileArguments plusTarifficatorMobileArguments = ((cdt) bdtVar).a;
        PlusTarifficatorPurchase c = a.c();
        PlusTarifficatorPurchase.Status status = c.getStatus();
        if (status instanceof PlusTarifficatorPurchase.Status.NotFinished) {
            paymentSuccess = PlusTarifficatorMobileResult.PaymentCancel.INSTANCE;
        } else if (status instanceof PlusTarifficatorPurchase.Status.Error) {
            paymentSuccess = new PlusTarifficatorMobileResult.PaymentError(((PlusTarifficatorPurchase.Status.Error) status).getReason(), plusTarifficatorMobileArguments.getScreensToSkip().contains(PlusTarifficatorMobileArguments.Screen.ERROR));
        } else {
            if (!(status instanceof PlusTarifficatorPurchase.Status.Success)) {
                w511.b();
                return;
            }
            paymentSuccess = new PlusTarifficatorMobileResult.PaymentSuccess(c.getOffer(), plusTarifficatorMobileArguments.getScreensToSkip().contains(PlusTarifficatorMobileArguments.Screen.SUCCESS));
        }
        setResult(-1, new Intent().putExtra(RESULT_KEY, paymentSuccess));
        super.finish();
    }

    @Override // defpackage.e2d0
    public d2d0 getDependencies() {
        return getComponent();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        qnd0 findTarifficatorComponent = findTarifficatorComponent();
        final int i = 0;
        final int i2 = 1;
        if (findTarifficatorComponent == null) {
            skd0.e(PlusLogTag.BILLING, "TarifficatorScenarioActivity is recreated after application death");
            this.isActivityRecreatedAfterApplicationDeath = true;
            super.onCreate(savedInstanceState);
            setResult(0);
            finish();
            return;
        }
        m0p m0pVar = ((snd0) findTarifficatorComponent).a;
        syq0 i3 = ((e) m0pVar.p).i();
        if (i3 != null) {
            bindAnalyticsSession(i3);
        }
        gbd0 gbd0Var = m0pVar.h;
        Locale locale = m0pVar.i.getLocale();
        PlusTheme plusTheme = (PlusTheme) ((n4u0) ((qc20) gbd0Var).a).getValue();
        int i4 = d1i0.PaySDK_Theme_Plus_DayNight;
        TypedValue typedValue = new TypedValue();
        getResources().getValue(ovg0.pay_sdk_mobile_content_scale_factor, typedValue, true);
        overrideConfiguration(locale, plusTheme, i4, typedValue.getFloat());
        mkn.b(this);
        mdd0 mdd0Var = m0pVar.l;
        fjh fjhVar = new fjh(2, mdd0Var);
        getLifecycle().a(fjhVar);
        getSupportFragmentManager().q.add(new ydj(i2, fjhVar));
        final kdd0 kdd0Var = new kdd0();
        kdd0Var.a = mdd0Var;
        kdd0Var.b = this;
        kdd0Var.c = a.a(new sls() { // from class: jdd0
            @Override // defpackage.sls
            public final Object invoke() {
                int i5 = i;
                kdd0 kdd0Var2 = kdd0Var;
                switch (i5) {
                    case 0:
                        return (ConnectivityManager) ((TarifficatorScenarioActivity) kdd0Var2.b).getSystemService("connectivity");
                    default:
                        return new ConnectivityManager.NetworkCallback("Tarifficator", (mdd0) kdd0Var2.a, (ConnectivityManager) ((i3y) kdd0Var2.c).getValue()) { // from class: com.yandex.plus.pay.ui.common.api.log.PlusPayLogNetworkListener$NetworkCallback
                            private final ConnectivityManager connectivityManager;
                            private final mdd0 logger;
                            private final String tag;

                            {
                                this.tag = r1;
                                this.logger = r2;
                                this.connectivityManager = r3;
                            }

                            @Override // android.net.ConnectivityManager.NetworkCallback
                            public void onAvailable(Network network) {
                                String str;
                                super.onAvailable(network);
                                NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(network);
                                if (networkCapabilities != null) {
                                    str = kotlin.collections.a.X(j73.A(new String[]{networkCapabilities.hasTransport(1) ? "WiFi" : null, networkCapabilities.hasTransport(0) ? "Cellular" : null, networkCapabilities.hasTransport(3) ? "Ethernet" : null, networkCapabilities.hasTransport(4) ? "VPN" : null}), " + ", null, null, null, 62);
                                } else {
                                    str = "Unknown";
                                }
                                mdd0 mdd0Var2 = this.logger;
                                String str2 = this.tag;
                                LogPriority logPriority = LogPriority.INFO;
                                mdd0Var2.getClass();
                                ((ndd0) mdd0Var2).a(logPriority, str2, "Network connection is available with type ".concat(str));
                            }

                            @Override // android.net.ConnectivityManager.NetworkCallback
                            public void onLost(Network network) {
                                super.onLost(network);
                                mdd0 mdd0Var2 = this.logger;
                                String str = this.tag;
                                LogPriority logPriority = LogPriority.INFO;
                                mdd0Var2.e(logPriority);
                                mdd0Var2.a(logPriority, str, "Network connection is lost");
                            }
                        };
                }
            }
        });
        kdd0Var.d = a.a(new sls() { // from class: jdd0
            @Override // defpackage.sls
            public final Object invoke() {
                int i5 = i2;
                kdd0 kdd0Var2 = kdd0Var;
                switch (i5) {
                    case 0:
                        return (ConnectivityManager) ((TarifficatorScenarioActivity) kdd0Var2.b).getSystemService("connectivity");
                    default:
                        return new ConnectivityManager.NetworkCallback("Tarifficator", (mdd0) kdd0Var2.a, (ConnectivityManager) ((i3y) kdd0Var2.c).getValue()) { // from class: com.yandex.plus.pay.ui.common.api.log.PlusPayLogNetworkListener$NetworkCallback
                            private final ConnectivityManager connectivityManager;
                            private final mdd0 logger;
                            private final String tag;

                            {
                                this.tag = r1;
                                this.logger = r2;
                                this.connectivityManager = r3;
                            }

                            @Override // android.net.ConnectivityManager.NetworkCallback
                            public void onAvailable(Network network) {
                                String str;
                                super.onAvailable(network);
                                NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(network);
                                if (networkCapabilities != null) {
                                    str = kotlin.collections.a.X(j73.A(new String[]{networkCapabilities.hasTransport(1) ? "WiFi" : null, networkCapabilities.hasTransport(0) ? "Cellular" : null, networkCapabilities.hasTransport(3) ? "Ethernet" : null, networkCapabilities.hasTransport(4) ? "VPN" : null}), " + ", null, null, null, 62);
                                } else {
                                    str = "Unknown";
                                }
                                mdd0 mdd0Var2 = this.logger;
                                String str2 = this.tag;
                                LogPriority logPriority = LogPriority.INFO;
                                mdd0Var2.getClass();
                                ((ndd0) mdd0Var2).a(logPriority, str2, "Network connection is available with type ".concat(str));
                            }

                            @Override // android.net.ConnectivityManager.NetworkCallback
                            public void onLost(Network network) {
                                super.onLost(network);
                                mdd0 mdd0Var2 = this.logger;
                                String str = this.tag;
                                LogPriority logPriority = LogPriority.INFO;
                                mdd0Var2.e(logPriority);
                                mdd0Var2.a(logPriority, str, "Network connection is lost");
                            }
                        };
                }
            }
        });
        getLifecycle().a(new ldd0(kdd0Var));
        getLayoutInflater().setFactory2(new PlusPayLogLayoutInflaterFactory(SCENARIO_LOG_TAG, mdd0Var, new PlusPayUiKitInflaterFactory(gbd0Var)));
        super.onCreate(savedInstanceState);
        if (this.isActivityRecreatedAfterApplicationDeath) {
            return;
        }
        setupDebugMenu(getComponent());
        bad0 a = ((kmm0) getComponent()).a.a();
        a.getClass();
        a.b = new WeakReference(this);
        pub1.c(getOnBackPressedDispatcher(), this, new s5w0(16, this));
        drx0 viewModel = getViewModel();
        jnd0 jnd0Var = viewModel.b;
        if (viewModel.C) {
            return;
        }
        viewModel.C = true;
        hwa0 hwa0Var = (hwa0) viewModel.B;
        pgz pgzVar = hwa0Var.e;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "PerformanceSessionImpl", "onStartFlow()");
        }
        ((com.yandex.plus.core.benchmark.b) ((ll5) hwa0Var.i.getValue())).b();
        ((com.yandex.plus.core.benchmark.b) ((ll5) hwa0Var.f.getValue())).b();
        Bundle bundle = (Bundle) viewModel.A.b.a("SAVED_BUNDLE");
        PlusTarifficatorPurchase plusTarifficatorPurchase = bundle != null ? (PlusTarifficatorPurchase) ((Parcelable) vng.u(bundle, PlusTarifficatorPurchase.class, "CURRENT_PURCHASE")) : null;
        ArrayList v = bundle != null ? vng.v(bundle, PlusTarifficatorPurchase.class, "PURCHASES_HISTORY") : null;
        if (plusTarifficatorPurchase != null && v != null) {
            jnd0Var.a.a = ind0.a(jnd0Var.a.a(), plusTarifficatorPurchase, v, 25);
        } else {
            if (!((Boolean) viewModel.y.invoke()).booleanValue()) {
                ((u570) viewModel.w).a(jnd0Var.a.a().b);
                return;
            }
            ftb ftbVar = viewModel.x;
            ftbVar.getClass();
            ftbVar.c(new PresaleFragment(), "Presale");
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        ((jlc) ((kmm0) getComponent()).a.B.getValue()).a = null;
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onResumeFragments() {
        super.onResumeFragments();
        jlc jlcVar = (jlc) ((kmm0) getComponent()).a.B.getValue();
        crx0 navigator = getNavigator();
        jlcVar.a = navigator;
        ArrayList arrayList = jlcVar.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            navigator.a((alc[]) it.next());
        }
        arrayList.clear();
    }
}
