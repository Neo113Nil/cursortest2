package com.yandex.payment.sdk.transportcards.ui;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.fragment.app.FragmentManager;
import com.yandex.payment.sdk.core.data.ConsoleLoggingMode;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.yandex.payment.sdk.model.data.AdditionalSettings;
import com.yandex.payment.sdk.transportcards.ui.TransportCardsActivity;
import com.yandex.payment.sdk.ui.BaseActivity;
import com.yandex.payment.sdk.ui.common.WebViewFragment;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.ahr;
import defpackage.b860;
import defpackage.b88;
import defpackage.c450;
import defpackage.d1d;
import defpackage.d450;
import defpackage.djr;
import defpackage.ds31;
import defpackage.e450;
import defpackage.eg01;
import defpackage.eja1;
import defpackage.eq41;
import defpackage.es31;
import defpackage.f450;
import defpackage.g450;
import defpackage.g8e;
import defpackage.gw00;
import defpackage.h450;
import defpackage.i111;
import defpackage.i3y;
import defpackage.i511;
import defpackage.iob1;
import defpackage.iu5;
import defpackage.izy;
import defpackage.j9h0;
import defpackage.jl40;
import defpackage.k751;
import defpackage.kpa1;
import defpackage.kux0;
import defpackage.l111;
import defpackage.lz40;
import defpackage.m50;
import defpackage.msb1;
import defpackage.mzu0;
import defpackage.n751;
import defpackage.np90;
import defpackage.nv90;
import defpackage.o111;
import defpackage.o751;
import defpackage.ong0;
import defpackage.ov90;
import defpackage.p111;
import defpackage.p751;
import defpackage.p7u;
import defpackage.pkr;
import defpackage.pv01;
import defpackage.pwf;
import defpackage.q211;
import defpackage.q751;
import defpackage.qoi0;
import defpackage.qv90;
import defpackage.rlh0;
import defpackage.rwo;
import defpackage.s011;
import defpackage.slf;
import defpackage.sls;
import defpackage.sv90;
import defpackage.swf;
import defpackage.t511;
import defpackage.tje;
import defpackage.tls;
import defpackage.u111;
import defpackage.u1w;
import defpackage.u40;
import defpackage.u870;
import defpackage.va90;
import defpackage.vb11;
import defpackage.vfc;
import defpackage.vmu0;
import defpackage.vuz;
import defpackage.w511;
import defpackage.wb20;
import defpackage.wy4;
import defpackage.y22;
import defpackage.y8f;
import defpackage.y8h;
import defpackage.ym11;
import defpackage.ypa0;
import defpackage.ywg0;
import defpackage.z011;
import defpackage.zy11;
import io.appmetrica.analytics.IReporter;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u0080\u00012\u00020\u00012\u00020\u0002:\u0002\u0081\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0004J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u0004J\u0019\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u0019R\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00103\u001a\u0002028\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010:\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R(\u0010B\u001a\b\u0012\u0004\u0012\u00020A0@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010I\u001a\u00020H8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010P\u001a\u00020O8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010W\u001a\u00020V8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010^\u001a\u00020]8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u0018\u0010e\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u001b\u0010k\u001a\u00020g8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010'\u001a\u0004\bi\u0010jR\u001b\u0010p\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010'\u001a\u0004\bn\u0010oR\u001c\u0010r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u001c\u0010t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010sR\u0017\u0010v\u001a\u00020u8\u0006¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010~\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007f¨\u0006\u0082\u0001"}, d2 = {"Lcom/yandex/payment/sdk/transportcards/ui/TransportCardsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lp7u;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "onDestroy", "Ld1d;", "componentDispatcher", "()Ld1d;", "Lb88;", "getCard3DSWebViewDelegateFactory", "()Lb88;", "setKeyboardInsets", "setupLoading", "registerRoutes", "", "url", "openUrl", "(Ljava/lang/String;)V", "showNfcDialog", "initNfcDialog", TarifficatorScenarioActivity.RESULT_KEY, "handleNfcDialogResult", "Li111;", "transportCardViewModelFactory", "Li111;", "getTransportCardViewModelFactory", "()Li111;", "setTransportCardViewModelFactory", "(Li111;)V", "Lu111;", "viewModel$delegate", "Li3y;", "getViewModel", "()Lu111;", "viewModel", "Lh450;", "nativeRoutesExecutor", "Lh450;", "getNativeRoutesExecutor", "()Lh450;", "setNativeRoutesExecutor", "(Lh450;)V", "Lizy;", "loadingHider", "Lizy;", "getLoadingHider", "()Lizy;", "setLoadingHider", "(Lizy;)V", "Lrwo;", "eventReporter", "Lrwo;", "getEventReporter", "()Lrwo;", "setEventReporter", "(Lrwo;)V", "Llz40;", "Lt011;", "transportEventFlow", "Llz40;", "getTransportEventFlow", "()Llz40;", "setTransportEventFlow", "(Llz40;)V", "Lt511;", "transportReadCardActionHandler", "Lt511;", "getTransportReadCardActionHandler", "()Lt511;", "setTransportReadCardActionHandler", "(Lt511;)V", "Lvb11;", "transportWriteBlocksActionHandler", "Lvb11;", "getTransportWriteBlocksActionHandler", "()Lvb11;", "setTransportWriteBlocksActionHandler", "(Lvb11;)V", "Li511;", "transportReadBlocksActionHandler", "Li511;", "getTransportReadBlocksActionHandler", "()Li511;", "setTransportReadBlocksActionHandler", "(Li511;)V", "Lq211;", "transportFinishNfcActionHandler", "Lq211;", "getTransportFinishNfcActionHandler", "()Lq211;", "setTransportFinishNfcActionHandler", "(Lq211;)V", "Lypa0;", "errorBinding", "Lypa0;", "Lwy4;", "baseComponent$delegate", "getBaseComponent", "()Lwy4;", "baseComponent", "Ls011;", "transportCardComponent$delegate", "getTransportCardComponent", "()Ls011;", "transportCardComponent", "Lm50;", "bindActivityLauncher", "Lm50;", "paymentActivityLauncher", "Lb860;", "nfcCallback", "Lb860;", "getNfcCallback", "()Lb860;", "Lcom/yandex/payment/sdk/transportcards/nfc/a;", "troikaNfcController", "Lcom/yandex/payment/sdk/transportcards/nfc/a;", "Lcom/yandex/payment/sdk/transportcards/ui/NfcDialogFragment;", "dialog", "Lcom/yandex/payment/sdk/transportcards/ui/NfcDialogFragment;", "Companion", "o111", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TransportCardsActivity extends AppCompatActivity implements p7u {
    public static final o111 Companion = new o111();
    public static final String EXTRA_IS_TRANSPORT_CARDS_FLOW = "EXTRA_IS_TRANSPORT_CARDS_FLOW";
    public static final int RESULT_ERROR = 2;

    /* renamed from: baseComponent$delegate, reason: from kotlin metadata */
    private final i3y baseComponent;
    private final m50 bindActivityLauncher;
    private NfcDialogFragment dialog;
    private ypa0 errorBinding;
    public rwo eventReporter;
    public izy loadingHider;
    public h450 nativeRoutesExecutor;
    private final b860 nfcCallback;
    private final m50 paymentActivityLauncher;

    /* renamed from: transportCardComponent$delegate, reason: from kotlin metadata */
    private final i3y transportCardComponent;
    public i111 transportCardViewModelFactory;
    public lz40 transportEventFlow;
    public q211 transportFinishNfcActionHandler;
    public i511 transportReadBlocksActionHandler;
    public t511 transportReadCardActionHandler;
    public vb11 transportWriteBlocksActionHandler;
    private final com.yandex.payment.sdk.transportcards.nfc.a troikaNfcController;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;

    public TransportCardsActivity() {
        final int i = 0;
        this.viewModel = new es31(qoi0.a(u111.class), new sls(this) { // from class: com.yandex.payment.sdk.transportcards.ui.TransportCardsActivity$special$$inlined$viewModels$default$2
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
        }, new sls(this) { // from class: k111
            public final /* synthetic */ TransportCardsActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                hs31 transportCardViewModelFactory;
                wy4 baseComponent_delegate$lambda$0;
                s011 transportCardComponent_delegate$lambda$0;
                int i2 = i;
                TransportCardsActivity transportCardsActivity = this.b;
                switch (i2) {
                    case 0:
                        transportCardViewModelFactory = transportCardsActivity.getTransportCardViewModelFactory();
                        return transportCardViewModelFactory;
                    case 1:
                        baseComponent_delegate$lambda$0 = TransportCardsActivity.baseComponent_delegate$lambda$0(transportCardsActivity);
                        return baseComponent_delegate$lambda$0;
                    default:
                        transportCardComponent_delegate$lambda$0 = TransportCardsActivity.transportCardComponent_delegate$lambda$0(transportCardsActivity);
                        return transportCardComponent_delegate$lambda$0;
                }
            }
        }, new sls(this) { // from class: com.yandex.payment.sdk.transportcards.ui.TransportCardsActivity$special$$inlined$viewModels$default$3
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
        final int i2 = 1;
        this.baseComponent = kotlin.a.a(new sls(this) { // from class: k111
            public final /* synthetic */ TransportCardsActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                hs31 transportCardViewModelFactory;
                wy4 baseComponent_delegate$lambda$0;
                s011 transportCardComponent_delegate$lambda$0;
                int i22 = i2;
                TransportCardsActivity transportCardsActivity = this.b;
                switch (i22) {
                    case 0:
                        transportCardViewModelFactory = transportCardsActivity.getTransportCardViewModelFactory();
                        return transportCardViewModelFactory;
                    case 1:
                        baseComponent_delegate$lambda$0 = TransportCardsActivity.baseComponent_delegate$lambda$0(transportCardsActivity);
                        return baseComponent_delegate$lambda$0;
                    default:
                        transportCardComponent_delegate$lambda$0 = TransportCardsActivity.transportCardComponent_delegate$lambda$0(transportCardsActivity);
                        return transportCardComponent_delegate$lambda$0;
                }
            }
        });
        final int i3 = 2;
        this.transportCardComponent = kotlin.a.a(new sls(this) { // from class: k111
            public final /* synthetic */ TransportCardsActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                hs31 transportCardViewModelFactory;
                wy4 baseComponent_delegate$lambda$0;
                s011 transportCardComponent_delegate$lambda$0;
                int i22 = i3;
                TransportCardsActivity transportCardsActivity = this.b;
                switch (i22) {
                    case 0:
                        transportCardViewModelFactory = transportCardsActivity.getTransportCardViewModelFactory();
                        return transportCardViewModelFactory;
                    case 1:
                        baseComponent_delegate$lambda$0 = TransportCardsActivity.baseComponent_delegate$lambda$0(transportCardsActivity);
                        return baseComponent_delegate$lambda$0;
                    default:
                        transportCardComponent_delegate$lambda$0 = TransportCardsActivity.transportCardComponent_delegate$lambda$0(transportCardsActivity);
                        return transportCardComponent_delegate$lambda$0;
                }
            }
        });
        this.bindActivityLauncher = registerForActivityResult(new iu5(), new u40(this) { // from class: m111
            public final /* synthetic */ TransportCardsActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.u40
            public final void a(Object obj) {
                int i4 = i;
                TransportCardsActivity transportCardsActivity = this.b;
                ov90 ov90Var = (ov90) obj;
                switch (i4) {
                    case 0:
                        TransportCardsActivity.bindActivityLauncher$lambda$0(transportCardsActivity, ov90Var);
                        break;
                    default:
                        TransportCardsActivity.paymentActivityLauncher$lambda$0(transportCardsActivity, ov90Var);
                        break;
                }
            }
        });
        this.paymentActivityLauncher = registerForActivityResult(new nv90(), new u40(this) { // from class: m111
            public final /* synthetic */ TransportCardsActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.u40
            public final void a(Object obj) {
                int i4 = i2;
                TransportCardsActivity transportCardsActivity = this.b;
                ov90 ov90Var = (ov90) obj;
                switch (i4) {
                    case 0:
                        TransportCardsActivity.bindActivityLauncher$lambda$0(transportCardsActivity, ov90Var);
                        break;
                    default:
                        TransportCardsActivity.paymentActivityLauncher$lambda$0(transportCardsActivity, ov90Var);
                        break;
                }
            }
        });
        eg01 eg01Var = new eg01(this);
        this.nfcCallback = eg01Var;
        this.troikaNfcController = new com.yandex.payment.sdk.transportcards.nfc.a(this, eg01Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wy4 baseComponent_delegate$lambda$0(TransportCardsActivity transportCardsActivity) {
        msb1 msb1Var = msb1.x;
        Intent intent = transportCardsActivity.getIntent();
        Payer payer = intent != null ? (Payer) intent.getParcelableExtra(BaseActivity.EXTRA_PAYER_DATA) : null;
        Merchant merchant = (Merchant) intent.getParcelableExtra(BaseActivity.EXTRA_MERCHANT_DATA);
        AdditionalSettings additionalSettings = (AdditionalSettings) intent.getParcelableExtra(BaseActivity.ADDITIONAL_SETTINGS);
        PaymentSdkEnvironment paymentSdkEnvironment = (PaymentSdkEnvironment) intent.getParcelableExtra(BaseActivity.EXTRA_ENVIRONMENT);
        ConsoleLoggingMode consoleLoggingMode = (ConsoleLoggingMode) intent.getParcelableExtra(BaseActivity.CONSOLE_LOGGING_MODE);
        String stringExtra = intent.getStringExtra(BaseActivity.EXTRA_LOGGER_KEY);
        if (stringExtra == null) {
            stringExtra = "";
        }
        return msb1Var.f(null, transportCardsActivity, consoleLoggingMode, merchant, payer, paymentSdkEnvironment, additionalSettings, stringExtra);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindActivityLauncher$lambda$0(TransportCardsActivity transportCardsActivity, ov90 ov90Var) {
        ((y22) transportCardsActivity.getEventReporter()).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Транспортные карты: Шторка привязки опустилась", "transport_bind_finish"));
        ahr ahrVar = transportCardsActivity.getViewModel().b;
        if (ahrVar != null) {
            ahr.a(ahrVar, gw00.e(new Pair("action", "bindClosed")));
        }
    }

    private final wy4 getBaseComponent() {
        return (wy4) this.baseComponent.getValue();
    }

    private final b88 getCard3DSWebViewDelegateFactory() {
        return new vuz();
    }

    private final s011 getTransportCardComponent() {
        return (s011) this.transportCardComponent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u111 getViewModel() {
        return (u111) this.viewModel.getValue();
    }

    private final void handleNfcDialogResult(String result) {
        if (jl40.l(result, NfcDialogFragment.RESULT_POSITIVE)) {
            startActivity(new Intent("android.settings.NFC_SETTINGS"));
        } else {
            jl40.l(result, NfcDialogFragment.RESULT_NEGATIVE);
        }
        this.dialog = null;
    }

    private final void initNfcDialog() {
        if (this.troikaNfcController.d()) {
            getSupportFragmentManager().m0(NfcDialogFragment.REQUEST_KEY, this, new l111(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initNfcDialog$lambda$0(TransportCardsActivity transportCardsActivity, String str, Bundle bundle) {
        transportCardsActivity.handleNfcDialogResult(bundle.getString(NfcDialogFragment.RESULT_KEY));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(TransportCardsActivity transportCardsActivity) {
        u111 viewModel = transportCardsActivity.getViewModel();
        ViewGroup viewGroup = (ViewGroup) transportCardsActivity.findViewById(j9h0.frameLayoutRoot);
        boolean isDebug = ((pwf) transportCardsActivity.getBaseComponent()).d().a.getIsDebug();
        boolean d = kpa1.d(transportCardsActivity);
        String stringExtra = transportCardsActivity.getIntent().getStringExtra(BaseActivity.EXTRA_TRANSPORT_CARD_DEEPLINK);
        String str = stringExtra == null ? "" : stringExtra;
        boolean d2 = transportCardsActivity.troikaNfcController.d();
        String stringExtra2 = transportCardsActivity.getIntent().getStringExtra(BaseActivity.EXTRA_TRANSPORT_CARD_BODY);
        String str2 = stringExtra2 != null ? stringExtra2 : "";
        mzu0 mzu0Var = new mzu0(transportCardsActivity);
        viewModel.getClass();
        tje.N(ds31.a(viewModel), null, null, new TransportCardsViewModel$init$1(str2, viewModel, transportCardsActivity, viewGroup, d, isDebug, str, d2, mzu0Var, null), 3);
    }

    private final void openUrl(String url) {
        try {
            try {
                new slf().a().a(this, Uri.parse(url));
            } catch (ActivityNotFoundException e) {
                rwo eventReporter = getEventReporter();
                sv90 sv90Var = qv90.a;
                String message = e.getMessage();
                sv90Var.getClass();
                ((y22) eventReporter).a(sv90.C(url, message));
            }
        } catch (Exception unused) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void paymentActivityLauncher$lambda$0(TransportCardsActivity transportCardsActivity, ov90 ov90Var) {
        ((y22) transportCardsActivity.getEventReporter()).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Транспортные карты: Шторка оплаты опустилась", "transport_payment_finish"));
        ahr ahrVar = transportCardsActivity.getViewModel().b;
        if (ahrVar != null) {
            ahr.a(ahrVar, gw00.e(new Pair("action", "paymentClosed")));
        }
    }

    private final void registerRoutes() {
        h450 nativeRoutesExecutor = getNativeRoutesExecutor();
        final int i = 0;
        tls tlsVar = new tls(this) { // from class: n111
            public final /* synthetic */ TransportCardsActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 registerRoutes$lambda$0$0;
                zy11 registerRoutes$lambda$0$1;
                zy11 registerRoutes$lambda$0$2;
                zy11 registerRoutes$lambda$0$3;
                zy11 registerRoutes$lambda$0$4;
                int i2 = i;
                TransportCardsActivity transportCardsActivity = this.b;
                switch (i2) {
                    case 0:
                        registerRoutes$lambda$0$0 = TransportCardsActivity.registerRoutes$lambda$0$0(transportCardsActivity, (f450) obj);
                        return registerRoutes$lambda$0$0;
                    case 1:
                        registerRoutes$lambda$0$1 = TransportCardsActivity.registerRoutes$lambda$0$1(transportCardsActivity, (c450) obj);
                        return registerRoutes$lambda$0$1;
                    case 2:
                        registerRoutes$lambda$0$2 = TransportCardsActivity.registerRoutes$lambda$0$2(transportCardsActivity, (e450) obj);
                        return registerRoutes$lambda$0$2;
                    case 3:
                        registerRoutes$lambda$0$3 = TransportCardsActivity.registerRoutes$lambda$0$3(transportCardsActivity, (g450) obj);
                        return registerRoutes$lambda$0$3;
                    default:
                        registerRoutes$lambda$0$4 = TransportCardsActivity.registerRoutes$lambda$0$4(transportCardsActivity, (d450) obj);
                        return registerRoutes$lambda$0$4;
                }
            }
        };
        final int i2 = 1;
        ym11.e(1, tlsVar);
        nativeRoutesExecutor.a.put(String.valueOf(qoi0.a(f450.class).d()), tlsVar);
        tls tlsVar2 = new tls(this) { // from class: n111
            public final /* synthetic */ TransportCardsActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 registerRoutes$lambda$0$0;
                zy11 registerRoutes$lambda$0$1;
                zy11 registerRoutes$lambda$0$2;
                zy11 registerRoutes$lambda$0$3;
                zy11 registerRoutes$lambda$0$4;
                int i22 = i2;
                TransportCardsActivity transportCardsActivity = this.b;
                switch (i22) {
                    case 0:
                        registerRoutes$lambda$0$0 = TransportCardsActivity.registerRoutes$lambda$0$0(transportCardsActivity, (f450) obj);
                        return registerRoutes$lambda$0$0;
                    case 1:
                        registerRoutes$lambda$0$1 = TransportCardsActivity.registerRoutes$lambda$0$1(transportCardsActivity, (c450) obj);
                        return registerRoutes$lambda$0$1;
                    case 2:
                        registerRoutes$lambda$0$2 = TransportCardsActivity.registerRoutes$lambda$0$2(transportCardsActivity, (e450) obj);
                        return registerRoutes$lambda$0$2;
                    case 3:
                        registerRoutes$lambda$0$3 = TransportCardsActivity.registerRoutes$lambda$0$3(transportCardsActivity, (g450) obj);
                        return registerRoutes$lambda$0$3;
                    default:
                        registerRoutes$lambda$0$4 = TransportCardsActivity.registerRoutes$lambda$0$4(transportCardsActivity, (d450) obj);
                        return registerRoutes$lambda$0$4;
                }
            }
        };
        ym11.e(1, tlsVar2);
        HashMap hashMap = nativeRoutesExecutor.a;
        hashMap.put(String.valueOf(qoi0.a(c450.class).d()), tlsVar2);
        final int i3 = 2;
        tls tlsVar3 = new tls(this) { // from class: n111
            public final /* synthetic */ TransportCardsActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 registerRoutes$lambda$0$0;
                zy11 registerRoutes$lambda$0$1;
                zy11 registerRoutes$lambda$0$2;
                zy11 registerRoutes$lambda$0$3;
                zy11 registerRoutes$lambda$0$4;
                int i22 = i3;
                TransportCardsActivity transportCardsActivity = this.b;
                switch (i22) {
                    case 0:
                        registerRoutes$lambda$0$0 = TransportCardsActivity.registerRoutes$lambda$0$0(transportCardsActivity, (f450) obj);
                        return registerRoutes$lambda$0$0;
                    case 1:
                        registerRoutes$lambda$0$1 = TransportCardsActivity.registerRoutes$lambda$0$1(transportCardsActivity, (c450) obj);
                        return registerRoutes$lambda$0$1;
                    case 2:
                        registerRoutes$lambda$0$2 = TransportCardsActivity.registerRoutes$lambda$0$2(transportCardsActivity, (e450) obj);
                        return registerRoutes$lambda$0$2;
                    case 3:
                        registerRoutes$lambda$0$3 = TransportCardsActivity.registerRoutes$lambda$0$3(transportCardsActivity, (g450) obj);
                        return registerRoutes$lambda$0$3;
                    default:
                        registerRoutes$lambda$0$4 = TransportCardsActivity.registerRoutes$lambda$0$4(transportCardsActivity, (d450) obj);
                        return registerRoutes$lambda$0$4;
                }
            }
        };
        ym11.e(1, tlsVar3);
        hashMap.put(String.valueOf(qoi0.a(e450.class).d()), tlsVar3);
        final int i4 = 3;
        tls tlsVar4 = new tls(this) { // from class: n111
            public final /* synthetic */ TransportCardsActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 registerRoutes$lambda$0$0;
                zy11 registerRoutes$lambda$0$1;
                zy11 registerRoutes$lambda$0$2;
                zy11 registerRoutes$lambda$0$3;
                zy11 registerRoutes$lambda$0$4;
                int i22 = i4;
                TransportCardsActivity transportCardsActivity = this.b;
                switch (i22) {
                    case 0:
                        registerRoutes$lambda$0$0 = TransportCardsActivity.registerRoutes$lambda$0$0(transportCardsActivity, (f450) obj);
                        return registerRoutes$lambda$0$0;
                    case 1:
                        registerRoutes$lambda$0$1 = TransportCardsActivity.registerRoutes$lambda$0$1(transportCardsActivity, (c450) obj);
                        return registerRoutes$lambda$0$1;
                    case 2:
                        registerRoutes$lambda$0$2 = TransportCardsActivity.registerRoutes$lambda$0$2(transportCardsActivity, (e450) obj);
                        return registerRoutes$lambda$0$2;
                    case 3:
                        registerRoutes$lambda$0$3 = TransportCardsActivity.registerRoutes$lambda$0$3(transportCardsActivity, (g450) obj);
                        return registerRoutes$lambda$0$3;
                    default:
                        registerRoutes$lambda$0$4 = TransportCardsActivity.registerRoutes$lambda$0$4(transportCardsActivity, (d450) obj);
                        return registerRoutes$lambda$0$4;
                }
            }
        };
        ym11.e(1, tlsVar4);
        hashMap.put(String.valueOf(qoi0.a(g450.class).d()), tlsVar4);
        final int i5 = 4;
        tls tlsVar5 = new tls(this) { // from class: n111
            public final /* synthetic */ TransportCardsActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 registerRoutes$lambda$0$0;
                zy11 registerRoutes$lambda$0$1;
                zy11 registerRoutes$lambda$0$2;
                zy11 registerRoutes$lambda$0$3;
                zy11 registerRoutes$lambda$0$4;
                int i22 = i5;
                TransportCardsActivity transportCardsActivity = this.b;
                switch (i22) {
                    case 0:
                        registerRoutes$lambda$0$0 = TransportCardsActivity.registerRoutes$lambda$0$0(transportCardsActivity, (f450) obj);
                        return registerRoutes$lambda$0$0;
                    case 1:
                        registerRoutes$lambda$0$1 = TransportCardsActivity.registerRoutes$lambda$0$1(transportCardsActivity, (c450) obj);
                        return registerRoutes$lambda$0$1;
                    case 2:
                        registerRoutes$lambda$0$2 = TransportCardsActivity.registerRoutes$lambda$0$2(transportCardsActivity, (e450) obj);
                        return registerRoutes$lambda$0$2;
                    case 3:
                        registerRoutes$lambda$0$3 = TransportCardsActivity.registerRoutes$lambda$0$3(transportCardsActivity, (g450) obj);
                        return registerRoutes$lambda$0$3;
                    default:
                        registerRoutes$lambda$0$4 = TransportCardsActivity.registerRoutes$lambda$0$4(transportCardsActivity, (d450) obj);
                        return registerRoutes$lambda$0$4;
                }
            }
        };
        ym11.e(1, tlsVar5);
        hashMap.put(String.valueOf(qoi0.a(d450.class).d()), tlsVar5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 registerRoutes$lambda$0$0(TransportCardsActivity transportCardsActivity, f450 f450Var) {
        i3y i3yVar = np90.a;
        String str = f450Var.a;
        String a = np90.a(str, transportCardsActivity);
        if (!f450Var.b) {
            a = null;
        }
        if (a != null) {
            str = a;
        }
        FragmentManager supportFragmentManager = transportCardsActivity.getSupportFragmentManager();
        androidx.fragment.app.a h = g8e.h(supportFragmentManager, supportFragmentManager);
        int i = j9h0.frameLayoutParent;
        eq41 eq41Var = WebViewFragment.Companion;
        b88 card3DSWebViewDelegateFactory = transportCardsActivity.getCard3DSWebViewDelegateFactory();
        PaymentSdkEnvironment paymentSdkEnvironment = ((pwf) transportCardsActivity.getBaseComponent()).d().a;
        eq41Var.getClass();
        WebViewFragment webViewFragment = new WebViewFragment(card3DSWebViewDelegateFactory);
        eq41Var.getClass();
        webViewFragment.setArguments(eq41.b(str, paymentSdkEnvironment, EmptyList.a, false, true));
        h.f(i, webViewFragment, null, 1);
        h.c(null);
        h.d();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 registerRoutes$lambda$0$1(TransportCardsActivity transportCardsActivity, c450 c450Var) {
        m50 m50Var = transportCardsActivity.bindActivityLauncher;
        Intent intent = transportCardsActivity.getIntent();
        intent.putExtra(BaseActivity.EXTRA_MERCHANT_DATA, c450Var.a);
        m50Var.a(intent.getExtras());
        ((y22) transportCardsActivity.getEventReporter()).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Транспортные карты: Поднялась шторка привязки", "transport_bind_start"));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 registerRoutes$lambda$0$2(TransportCardsActivity transportCardsActivity, e450 e450Var) {
        m50 m50Var = transportCardsActivity.paymentActivityLauncher;
        Intent intent = transportCardsActivity.getIntent();
        intent.putExtra(BaseActivity.EXTRA_PAYMENT_TOKEN, e450Var.b);
        intent.putExtra(BaseActivity.EXTRA_SELECTED_METHOD, e450Var.c);
        intent.putExtra(BaseActivity.EXTRA_MERCHANT_DATA, e450Var.a);
        m50Var.a(intent.getExtras());
        ((y22) transportCardsActivity.getEventReporter()).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Транспортные карты: Поднялась шторка оплаты", "transport_payment_start"));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 registerRoutes$lambda$0$3(TransportCardsActivity transportCardsActivity, g450 g450Var) {
        i3y i3yVar = np90.a;
        transportCardsActivity.openUrl(np90.a(g450Var.a, transportCardsActivity));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 registerRoutes$lambda$0$4(TransportCardsActivity transportCardsActivity, d450 d450Var) {
        Intent intent = d450Var.b;
        int i = p111.a[d450Var.a.ordinal()];
        if (i == 1) {
            transportCardsActivity.setResult(-1, intent);
        } else if (i == 2) {
            transportCardsActivity.setResult(2, intent);
        } else if (i == 3) {
            transportCardsActivity.setResult(0, intent);
        } else if (i != 4) {
            w511.b();
            return null;
        }
        transportCardsActivity.finish();
        return zy11.a;
    }

    private final void setKeyboardInsets() {
        View decorView = getWindow().getDecorView();
        l111 l111Var = new l111(this);
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.o(decorView, l111Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n751 setKeyboardInsets$lambda$0(TransportCardsActivity transportCardsActivity, View view, n751 n751Var) {
        ConstraintLayout constraintLayout;
        k751 k751Var = n751Var.a;
        u1w g = k751Var.g(8);
        u1w g2 = k751Var.g(1);
        u1w g3 = k751Var.g(2);
        int i = g.d;
        int i2 = g3.d;
        int i3 = i > i2 ? i - i2 : 0;
        ypa0 ypa0Var = transportCardsActivity.errorBinding;
        if (ypa0Var != null && (constraintLayout = ypa0Var.c) != null) {
            constraintLayout.setPadding(constraintLayout.getPaddingLeft(), g2.b, constraintLayout.getPaddingRight(), i2);
        }
        View findViewById = transportCardsActivity.findViewById(j9h0.frameLayoutRoot);
        findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), i3);
        return n751.b;
    }

    private final void setupLoading() {
        boolean d = kpa1.d(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(j9h0.frameLayoutLoading);
        ImageView imageView = (ImageView) findViewById(j9h0.imageViewBack);
        izy loadingHider = getLoadingHider();
        pv01 pv01Var = new pv01(1, frameLayout);
        loadingHider.b = false;
        loadingHider.a = pv01Var;
        ShimmerDrawable shimmerDrawable = new ShimmerDrawable(this);
        shimmerDrawable.setShimmer(d);
        shimmerDrawable.startShimmer();
        frameLayout.setBackground(shimmerDrawable);
        imageView.setImageResource(d ? ywg0.paymentsdk_ic_back_light : ywg0.paymentsdk_ic_back_dark);
        imageView.setOnClickListener(new vmu0(22, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupLoading$lambda$0(FrameLayout frameLayout) {
        frameLayout.setVisibility(8);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNfcDialog() {
        NfcDialogFragment nfcDialogFragment = this.dialog;
        if (nfcDialogFragment == null || !nfcDialogFragment.isVisible()) {
            NfcDialogFragment nfcDialogFragment2 = this.dialog;
            if (nfcDialogFragment2 == null || !nfcDialogFragment2.isAdded()) {
                ((y22) getEventReporter()).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Открытие диалогового окна для включения NFC", "nfc_show_dialog"));
                NfcDialogFragment nfcDialogFragment3 = new NfcDialogFragment();
                this.dialog = nfcDialogFragment3;
                nfcDialogFragment3.show(getSupportFragmentManager(), "NfcDialogFragmentTag");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s011 transportCardComponent_delegate$lambda$0(TransportCardsActivity transportCardsActivity) {
        return new swf(((pwf) transportCardsActivity.getBaseComponent()).a, new z011(), new pkr());
    }

    @Override // defpackage.p7u
    public d1d componentDispatcher() {
        y8h y8hVar = new y8h();
        y8hVar.a(wy4.class, getBaseComponent());
        y8hVar.a(s011.class, getTransportCardComponent());
        return y8hVar;
    }

    public final rwo getEventReporter() {
        rwo rwoVar = this.eventReporter;
        if (rwoVar != null) {
            return rwoVar;
        }
        return null;
    }

    public final izy getLoadingHider() {
        izy izyVar = this.loadingHider;
        if (izyVar != null) {
            return izyVar;
        }
        return null;
    }

    public final h450 getNativeRoutesExecutor() {
        h450 h450Var = this.nativeRoutesExecutor;
        if (h450Var != null) {
            return h450Var;
        }
        return null;
    }

    public final b860 getNfcCallback() {
        return this.nfcCallback;
    }

    public final i111 getTransportCardViewModelFactory() {
        i111 i111Var = this.transportCardViewModelFactory;
        if (i111Var != null) {
            return i111Var;
        }
        return null;
    }

    public final lz40 getTransportEventFlow() {
        lz40 lz40Var = this.transportEventFlow;
        if (lz40Var != null) {
            return lz40Var;
        }
        return null;
    }

    public final q211 getTransportFinishNfcActionHandler() {
        q211 q211Var = this.transportFinishNfcActionHandler;
        if (q211Var != null) {
            return q211Var;
        }
        return null;
    }

    public final i511 getTransportReadBlocksActionHandler() {
        i511 i511Var = this.transportReadBlocksActionHandler;
        if (i511Var != null) {
            return i511Var;
        }
        return null;
    }

    public final t511 getTransportReadCardActionHandler() {
        t511 t511Var = this.transportReadCardActionHandler;
        if (t511Var != null) {
            return t511Var;
        }
        return null;
    }

    public final vb11 getTransportWriteBlocksActionHandler() {
        vb11 vb11Var = this.transportWriteBlocksActionHandler;
        if (vb11Var != null) {
            return vb11Var;
        }
        return null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Resources.Theme theme = new ContextThemeWrapper(this, djr.a.a(this).l()).getTheme();
        int l = (iob1.c(theme, ong0.paymentsdk_is_light_theme) != null ? iob1.d(theme, ong0.paymentsdk_is_light_theme, true) ? FlexDefaultTheme.LIGHT : FlexDefaultTheme.DARK : kpa1.e(kpa1.a(this))).a(this).l();
        setTheme(l);
        getApplicationContext().setTheme(l);
        super.onCreate(savedInstanceState);
        setContentView(rlh0.paymentsdk_activity_transport_card);
        swf swfVar = (swf) getTransportCardComponent();
        swfVar.getClass();
        this.transportCardViewModelFactory = new i111(Collections.singletonMap(u111.class, swfVar.p));
        this.nativeRoutesExecutor = (h450) swfVar.g.get();
        this.loadingHider = (izy) swfVar.o.get();
        pwf pwfVar = swfVar.a;
        this.eventReporter = (rwo) pwfVar.i.get();
        this.transportEventFlow = (lz40) pwfVar.D.get();
        this.transportReadCardActionHandler = (t511) pwfVar.H.get();
        this.transportWriteBlocksActionHandler = (vb11) pwfVar.K.get();
        this.transportReadBlocksActionHandler = (i511) pwfVar.J.get();
        this.transportFinishNfcActionHandler = (q211) pwfVar.I.get();
        setupLoading();
        this.errorBinding = ypa0.o(getLayoutInflater());
        registerRoutes();
        this.troikaNfcController.c(getEventReporter(), eja1.s(this), getTransportEventFlow(), getTransportReadCardActionHandler(), getTransportReadBlocksActionHandler(), getTransportWriteBlocksActionHandler(), getTransportFinishNfcActionHandler());
        new Handler(Looper.getMainLooper()).post(new kux0(27, this));
        Window window = getWindow();
        va90 va90Var = new va90(findViewById(j9h0.frameLayoutRoot));
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new q751(window, va90Var) : i >= 30 ? new p751(window, va90Var) : new o751(window, va90Var)).U(kpa1.d(this));
        Window window2 = getWindow();
        va90 va90Var2 = new va90(findViewById(j9h0.frameLayoutRoot));
        int i2 = Build.VERSION.SDK_INT;
        (i2 >= 35 ? new q751(window2, va90Var2) : i2 >= 30 ? new p751(window2, va90Var2) : new o751(window2, va90Var2)).T(kpa1.d(this));
        setKeyboardInsets();
        initNfcDialog();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((u870) ((pwf) getBaseComponent()).g.get()).a();
        this.errorBinding = null;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IReporter a;
        wb20 wb20Var = wb20.d;
        if (wb20Var != null && (a = wb20Var.a()) != null) {
            a.pauseSession();
        }
        ((y22) ((pwf) getBaseComponent()).c()).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Приложение перешло в бэкграунд", "application_did_enter_background"));
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IReporter a;
        super.onResume();
        wb20 wb20Var = wb20.d;
        if (wb20Var != null && (a = wb20Var.a()) != null) {
            a.resumeSession();
        }
        ((y22) ((pwf) getBaseComponent()).c()).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Приложение перешло в форграунд", "application_did_enter_foreground"));
    }

    public final void setEventReporter(rwo rwoVar) {
        this.eventReporter = rwoVar;
    }

    public final void setLoadingHider(izy izyVar) {
        this.loadingHider = izyVar;
    }

    public final void setNativeRoutesExecutor(h450 h450Var) {
        this.nativeRoutesExecutor = h450Var;
    }

    public final void setTransportCardViewModelFactory(i111 i111Var) {
        this.transportCardViewModelFactory = i111Var;
    }

    public final void setTransportEventFlow(lz40 lz40Var) {
        this.transportEventFlow = lz40Var;
    }

    public final void setTransportFinishNfcActionHandler(q211 q211Var) {
        this.transportFinishNfcActionHandler = q211Var;
    }

    public final void setTransportReadBlocksActionHandler(i511 i511Var) {
        this.transportReadBlocksActionHandler = i511Var;
    }

    public final void setTransportReadCardActionHandler(t511 t511Var) {
        this.transportReadCardActionHandler = t511Var;
    }

    public final void setTransportWriteBlocksActionHandler(vb11 vb11Var) {
        this.transportWriteBlocksActionHandler = vb11Var;
    }
}
