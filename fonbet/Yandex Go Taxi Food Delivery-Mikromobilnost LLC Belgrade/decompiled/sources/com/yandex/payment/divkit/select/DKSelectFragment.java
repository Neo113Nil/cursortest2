package com.yandex.payment.divkit.select;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.view2.Div2View;
import com.yandex.payment.common.data.TextRes;
import com.yandex.payment.common.result.ResultScreenIdentifier;
import com.yandex.payment.divkit.cvv_confirm.CvvScreenArguments;
import com.yandex.payment.divkit.results.DKResultFragment;
import com.yandex.payment.divkit.select.DKSelectFragment;
import com.yandex.payment.divkit.usecases.p;
import com.yandex.payment.divkit.usecases.q;
import com.yandex.payment.divkit.usecases.r;
import com.yandex.payment.divkit.usecases.s;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.PaymentToken;
import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import com.yandex.payment.sdk.ui.BaseActivity;
import com.yandex.xplat.payment.sdk.NewCard;
import com.yandex.xplat.payment.sdk.PsdkScreen;
import defpackage.abe;
import defpackage.apa1;
import defpackage.aq80;
import defpackage.as31;
import defpackage.avf;
import defpackage.aye0;
import defpackage.cma1;
import defpackage.coq0;
import defpackage.do21;
import defpackage.dzf;
import defpackage.eeq0;
import defpackage.eja1;
import defpackage.es31;
import defpackage.feq0;
import defpackage.fi11;
import defpackage.geq0;
import defpackage.gtq0;
import defpackage.i3y;
import defpackage.i891;
import defpackage.ieq0;
import defpackage.j9f;
import defpackage.j9h0;
import defpackage.jeq0;
import defpackage.jl40;
import defpackage.k3v;
import defpackage.kcq0;
import defpackage.keq0;
import defpackage.kvo;
import defpackage.l9h0;
import defpackage.m3v;
import defpackage.m93;
import defpackage.mta1;
import defpackage.mvf;
import defpackage.ncq0;
import defpackage.nsi0;
import defpackage.nx;
import defpackage.ny61;
import defpackage.omk;
import defpackage.ong0;
import defpackage.ouf;
import defpackage.ouj0;
import defpackage.ov5;
import defpackage.pgk0;
import defpackage.pv5;
import defpackage.q5z;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.qv90;
import defpackage.qwf;
import defpackage.raq0;
import defpackage.rs31;
import defpackage.rwl;
import defpackage.rwo;
import defpackage.saq0;
import defpackage.sls;
import defpackage.smk;
import defpackage.sv90;
import defpackage.t89;
import defpackage.tc5;
import defpackage.tje;
import defpackage.tpr;
import defpackage.u2l;
import defpackage.u3u;
import defpackage.ujk;
import defpackage.ulh0;
import defpackage.uv90;
import defpackage.vfc;
import defpackage.vv90;
import defpackage.w511;
import defpackage.w8f;
import defpackage.wga0;
import defpackage.xc5;
import defpackage.xpv;
import defpackage.xry0;
import defpackage.xsf;
import defpackage.xxk;
import defpackage.y22;
import defpackage.y891;
import defpackage.y8f;
import defpackage.ydq0;
import defpackage.yry0;
import defpackage.zbq0;
import defpackage.zmk;
import defpackage.zry0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u009d\u00012\u00020\u00012\u00020\u0002:\u0002\u009e\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0002¢\u0006\u0004\b$\u0010\u0004J\u0011\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020%H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00072\u0006\u0010,\u001a\u00020%H\u0002¢\u0006\u0004\b/\u0010.J%\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020%2\f\u00102\u001a\b\u0012\u0004\u0012\u00020100H\u0002¢\u0006\u0004\b-\u00103J\u000f\u00104\u001a\u00020\u0007H\u0002¢\u0006\u0004\b4\u0010\u0004J\u000f\u00105\u001a\u00020\u0007H\u0002¢\u0006\u0004\b5\u0010\u0004J#\u00109\u001a\u00020\u00072\b\b\u0002\u00107\u001a\u0002062\b\b\u0002\u00108\u001a\u000206H\u0002¢\u0006\u0004\b9\u0010:J\u0013\u0010=\u001a\u00020<*\u00020;H\u0002¢\u0006\u0004\b=\u0010>J\u0013\u0010=\u001a\u00020<*\u00020?H\u0002¢\u0006\u0004\b=\u0010@R\u0016\u0010A\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010E\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010DR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010FR\u001b\u0010L\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\"\u0010T\u001a\u00020S8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001b\u0010^\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010I\u001a\u0004\b\\\u0010]R\"\u0010`\u001a\u00020_8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010g\u001a\u00020f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010n\u001a\u00020m8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010u\u001a\u00020t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR$\u0010|\u001a\u00020{8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R*\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R*\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R \u0010\u0094\u0001\u001a\u00030\u0090\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0091\u0001\u0010I\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R \u0010\u0099\u0001\u001a\u00030\u0095\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0096\u0001\u0010I\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0017\u0010\u009c\u0001\u001a\u00020P8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001¨\u0006\u009f\u0001"}, d2 = {"Lcom/yandex/payment/divkit/select/DKSelectFragment;", "Landroidx/fragment/app/Fragment;", "Lsaq0;", "<init>", "()V", "Lraq0;", "callbacks", "Lzy11;", "setCallback", "(Lraq0;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "Lsmk;", "divDataForRendering", "observeDivData", "(Lsmk;)V", "Ldo21;", "buildUserInput", "()Ldo21;", "Lkeq0;", ClidProvider.STATE, "updateState", "(Lkeq0;)V", "setupObservers", "", "getUserTypedEmail", "()Ljava/lang/String;", "Luv90;", "payment", "updatePayment", "(Luv90;)V", "url", "showWebView", "(Ljava/lang/String;)V", "openInBrowser", "", "Lfi11;", "trustedUrls", "(Ljava/lang/String;Ljava/util/List;)V", "cancelPayment", "setStateData", "", "showCancel", "waitForPay", "setStateLoading", "(ZZ)V", "Lydq0;", "Lcom/yandex/payment/divkit/cvv_confirm/CvvScreenArguments;", "mapToParams", "(Lydq0;)Lcom/yandex/payment/divkit/cvv_confirm/CvvScreenArguments;", "Lxpv;", "(Lxpv;)Lcom/yandex/payment/divkit/cvv_confirm/CvvScreenArguments;", "showFooterOnSelectOnly", "Z", "formattedSum", "Ljava/lang/String;", "sum", "Lraq0;", "Ltc5;", "activityViewModel$delegate", "Li3y;", "getActivityViewModel", "()Ltc5;", "activityViewModel", "Lcom/yandex/div/core/view2/Div2View;", "div2View", "Lcom/yandex/div/core/view2/Div2View;", "Lrwl;", "_binding", "Lrwl;", "Lmvf;", "viewModelFactory", "Lmvf;", "getViewModelFactory", "()Lmvf;", "setViewModelFactory", "(Lmvf;)V", "Lavf;", "viewModel$delegate", "getViewModel", "()Lavf;", "viewModel", "Lujk;", "divConfiguration", "Lujk;", "getDivConfiguration", "()Lujk;", "setDivConfiguration", "(Lujk;)V", "Lu2l;", "parsingEnvironment", "Lu2l;", "getParsingEnvironment", "()Lu2l;", "setParsingEnvironment", "(Lu2l;)V", "Lnx;", "actionReceiver", "Lnx;", "getActionReceiver", "()Lnx;", "setActionReceiver", "(Lnx;)V", "Lrwo;", "eventReporter", "Lrwo;", "getEventReporter", "()Lrwo;", "setEventReporter", "(Lrwo;)V", "Lkcq0;", "mediator", "Lkcq0;", "getMediator", "()Lkcq0;", "setMediator", "(Lkcq0;)V", "Louj0;", "resourceProvider", "Louj0;", "getResourceProvider", "()Louj0;", "setResourceProvider", "(Louj0;)V", "Lov5;", "resIdProvider", "Lov5;", "getResIdProvider", "()Lov5;", "setResIdProvider", "(Lov5;)V", "Lcom/yandex/div/core/Div2Context;", "divContext$delegate", "getDivContext", "()Lcom/yandex/div/core/Div2Context;", "divContext", "Lzry0;", "textProvider$delegate", "getTextProvider", "()Lzry0;", "textProvider", "getBinding", "()Lrwl;", "binding", "Companion", "ouf", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DKSelectFragment extends Fragment implements saq0 {
    private static final String ARG_DK_SELECT_VIEW_MODEL_REFACTORING_ENABLED = "ARG_DK_SELECT_VIEW_MODEL_REFACTORING_ENABLED";
    private static final String ARG_META_JSON = "ARG_META_JSON";
    private static final String ARG_PREFERRED_METHOD = "ARG_PREFERRED_METHOD";
    public static final ouf Companion = new ouf();
    private static final String URI_HOST_CLICK_ON_BACK_BUTTON = "back";
    private static final String URI_HOST_CLICK_ON_BIND_CARD = "bind_card_click";
    private static final String URI_HOST_CLICK_ON_PAY_BUTTON = "pay_button_click";
    private static final String URI_HOST_CLICK_ON_PROMO = "click_on_promo";
    private static final String URI_HOST_SHOW_TOAST = "show_toast";
    private rwl _binding;
    public nx actionReceiver;

    /* renamed from: activityViewModel$delegate, reason: from kotlin metadata */
    private final i3y activityViewModel;
    private raq0 callbacks;
    private Div2View div2View;
    public ujk divConfiguration;

    /* renamed from: divContext$delegate, reason: from kotlin metadata */
    private final i3y divContext;
    public rwo eventReporter;
    private String formattedSum;
    public kcq0 mediator;
    public u2l parsingEnvironment;
    public ov5 resIdProvider;
    public ouj0 resourceProvider;
    private boolean showFooterOnSelectOnly;
    private String sum;

    /* renamed from: textProvider$delegate, reason: from kotlin metadata */
    private final i3y textProvider;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;
    public mvf viewModelFactory;

    /* JADX WARN: Type inference failed for: r1v2, types: [com.yandex.payment.divkit.select.DKSelectFragment$special$$inlined$viewModels$default$1] */
    public DKSelectFragment() {
        super(ulh0.dk_select_fragment_layout);
        final int i = 0;
        this.activityViewModel = kotlin.a.a(new sls(this) { // from class: nuf
            public final /* synthetic */ DKSelectFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                tc5 activityViewModel_delegate$lambda$0;
                hs31 viewModelFactory;
                Div2Context divContext_delegate$lambda$0;
                zry0 textProvider_delegate$lambda$0;
                int i2 = i;
                DKSelectFragment dKSelectFragment = this.b;
                switch (i2) {
                    case 0:
                        activityViewModel_delegate$lambda$0 = DKSelectFragment.activityViewModel_delegate$lambda$0(dKSelectFragment);
                        return activityViewModel_delegate$lambda$0;
                    case 1:
                        viewModelFactory = dKSelectFragment.getViewModelFactory();
                        return viewModelFactory;
                    case 2:
                        divContext_delegate$lambda$0 = DKSelectFragment.divContext_delegate$lambda$0(dKSelectFragment);
                        return divContext_delegate$lambda$0;
                    default:
                        textProvider_delegate$lambda$0 = DKSelectFragment.textProvider_delegate$lambda$0(dKSelectFragment);
                        return textProvider_delegate$lambda$0;
                }
            }
        });
        final int i2 = 1;
        sls slsVar = new sls(this) { // from class: nuf
            public final /* synthetic */ DKSelectFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                tc5 activityViewModel_delegate$lambda$0;
                hs31 viewModelFactory;
                Div2Context divContext_delegate$lambda$0;
                zry0 textProvider_delegate$lambda$0;
                int i22 = i2;
                DKSelectFragment dKSelectFragment = this.b;
                switch (i22) {
                    case 0:
                        activityViewModel_delegate$lambda$0 = DKSelectFragment.activityViewModel_delegate$lambda$0(dKSelectFragment);
                        return activityViewModel_delegate$lambda$0;
                    case 1:
                        viewModelFactory = dKSelectFragment.getViewModelFactory();
                        return viewModelFactory;
                    case 2:
                        divContext_delegate$lambda$0 = DKSelectFragment.divContext_delegate$lambda$0(dKSelectFragment);
                        return divContext_delegate$lambda$0;
                    default:
                        textProvider_delegate$lambda$0 = DKSelectFragment.textProvider_delegate$lambda$0(dKSelectFragment);
                        return textProvider_delegate$lambda$0;
                }
            }
        };
        final ?? r1 = new sls(this) { // from class: com.yandex.payment.divkit.select.DKSelectFragment$special$$inlined$viewModels$default$1
            final /* synthetic */ Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return this.$this_viewModels;
            }
        };
        final i3y b = kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.payment.divkit.select.DKSelectFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r1.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(Object.class), new sls() { // from class: com.yandex.payment.divkit.select.DKSelectFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar, new sls() { // from class: com.yandex.payment.divkit.select.DKSelectFragment$special$$inlined$viewModels$default$4
            final /* synthetic */ sls $extrasProducer = null;

            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                y8f y8fVar;
                sls slsVar2 = this.$extrasProducer;
                if (slsVar2 != null && (y8fVar = (y8f) slsVar2.invoke()) != null) {
                    return y8fVar;
                }
                rs31 rs31Var = (rs31) i3y.this.getValue();
                q7u q7uVar = rs31Var instanceof q7u ? (q7u) rs31Var : null;
                return q7uVar != null ? q7uVar.getDefaultViewModelCreationExtras() : w8f.b;
            }
        });
        final int i3 = 2;
        this.divContext = kotlin.a.a(new sls(this) { // from class: nuf
            public final /* synthetic */ DKSelectFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                tc5 activityViewModel_delegate$lambda$0;
                hs31 viewModelFactory;
                Div2Context divContext_delegate$lambda$0;
                zry0 textProvider_delegate$lambda$0;
                int i22 = i3;
                DKSelectFragment dKSelectFragment = this.b;
                switch (i22) {
                    case 0:
                        activityViewModel_delegate$lambda$0 = DKSelectFragment.activityViewModel_delegate$lambda$0(dKSelectFragment);
                        return activityViewModel_delegate$lambda$0;
                    case 1:
                        viewModelFactory = dKSelectFragment.getViewModelFactory();
                        return viewModelFactory;
                    case 2:
                        divContext_delegate$lambda$0 = DKSelectFragment.divContext_delegate$lambda$0(dKSelectFragment);
                        return divContext_delegate$lambda$0;
                    default:
                        textProvider_delegate$lambda$0 = DKSelectFragment.textProvider_delegate$lambda$0(dKSelectFragment);
                        return textProvider_delegate$lambda$0;
                }
            }
        });
        final int i4 = 3;
        this.textProvider = kotlin.a.a(new sls(this) { // from class: nuf
            public final /* synthetic */ DKSelectFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                tc5 activityViewModel_delegate$lambda$0;
                hs31 viewModelFactory;
                Div2Context divContext_delegate$lambda$0;
                zry0 textProvider_delegate$lambda$0;
                int i22 = i4;
                DKSelectFragment dKSelectFragment = this.b;
                switch (i22) {
                    case 0:
                        activityViewModel_delegate$lambda$0 = DKSelectFragment.activityViewModel_delegate$lambda$0(dKSelectFragment);
                        return activityViewModel_delegate$lambda$0;
                    case 1:
                        viewModelFactory = dKSelectFragment.getViewModelFactory();
                        return viewModelFactory;
                    case 2:
                        divContext_delegate$lambda$0 = DKSelectFragment.divContext_delegate$lambda$0(dKSelectFragment);
                        return divContext_delegate$lambda$0;
                    default:
                        textProvider_delegate$lambda$0 = DKSelectFragment.textProvider_delegate$lambda$0(dKSelectFragment);
                        return textProvider_delegate$lambda$0;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tc5 activityViewModel_delegate$lambda$0(DKSelectFragment dKSelectFragment) {
        raq0 raq0Var = dKSelectFragment.callbacks;
        if (raq0Var == null) {
            raq0Var = null;
        }
        return ((zbq0) raq0Var).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final do21 buildUserInput() {
        return new do21(getUserTypedEmail(), true);
    }

    private final void cancelPayment() {
        raq0 raq0Var = this.callbacks;
        if (raq0Var == null) {
            raq0Var = null;
        }
        ((zbq0) raq0Var).G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Div2Context divContext_delegate$lambda$0(DKSelectFragment dKSelectFragment) {
        return new Div2Context(dKSelectFragment.requireActivity(), dKSelectFragment.getDivConfiguration(), 0, dKSelectFragment.getViewLifecycleOwner(), 4, null);
    }

    private final tc5 getActivityViewModel() {
        return (tc5) this.activityViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rwl getBinding() {
        rwl rwlVar = this._binding;
        if (rwlVar != null) {
            return rwlVar;
        }
        ny61.r("Required value was null.");
        return null;
    }

    private final Div2Context getDivContext() {
        return (Div2Context) this.divContext.getValue();
    }

    private final zry0 getTextProvider() {
        return (zry0) this.textProvider.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getUserTypedEmail() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final avf getViewModel() {
        return (avf) this.viewModel.getValue();
    }

    private final CvvScreenArguments mapToParams(ydq0 ydq0Var) {
        if (ydq0Var instanceof SelectScreenEvents$OpenCvv$ForceCvv) {
            return new CvvScreenArguments.ForceCvv(((SelectScreenEvents$OpenCvv$ForceCvv) ydq0Var).getCard());
        }
        if (ydq0Var instanceof SelectScreenEvents$OpenCvv$Challenge) {
            SelectScreenEvents$OpenCvv$Challenge selectScreenEvents$OpenCvv$Challenge = (SelectScreenEvents$OpenCvv$Challenge) ydq0Var;
            return new CvvScreenArguments.Challenge(selectScreenEvents$OpenCvv$Challenge.getDigits(), selectScreenEvents$OpenCvv$Challenge.getCardSystem(), selectScreenEvents$OpenCvv$Challenge.getCardSuffix());
        }
        w511.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeDivData(smk divDataForRendering) {
        getParsingEnvironment().e(divDataForRendering.a);
        kvo kvoVar = omk.i;
        omk n = gtq0.n(getParsingEnvironment(), divDataForRendering.b);
        Div2View div2View = this.div2View;
        if (div2View == null || !jl40.l(div2View.getParent(), getBinding().c)) {
            Div2View div2View2 = new Div2View(getDivContext(), null, 0, 6, null);
            div2View2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            div2View2.setId(View.generateViewId());
            this.div2View = div2View2;
        }
        if (getBinding().c.getChildCount() == 0) {
            getBinding().c.addView(this.div2View);
        }
        Div2View div2View3 = this.div2View;
        if (div2View3 != null) {
            div2View3.setData(n, new zmk(n.b));
        }
        Div2View div2View4 = this.div2View;
        if (div2View4 != null) {
            div2View4.post(new j9f(17, divDataForRendering, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeDivData$lambda$1(smk smkVar, DKSelectFragment dKSelectFragment) {
        for (Pair pair : smkVar.c) {
            String str = (String) pair.getFirst();
            String str2 = (String) pair.getSecond();
            Div2View div2View = dKSelectFragment.div2View;
            if (div2View != null) {
                div2View.setVariable(str, str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openInBrowser(String url) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStateData() {
        if (this.showFooterOnSelectOnly) {
            raq0 raq0Var = this.callbacks;
            if (raq0Var == null) {
                raq0Var = null;
            }
            ((zbq0) raq0Var).p(true);
        }
    }

    private final void setStateLoading(boolean showCancel, boolean waitForPay) {
        raq0 raq0Var = this.callbacks;
        if (raq0Var == null) {
            raq0Var = null;
        }
        TextRes.IntRes intRes = new TextRes.IntRes(getTextProvider().b);
        zbq0 zbq0Var = (zbq0) raq0Var;
        zbq0Var.getClass();
        DKResultFragment c = new xsf().c(false, showCancel, intRes, null, null, ResultScreenIdentifier.SelectMethodScreenLoading.INSTANCE);
        BaseActivity baseActivity = zbq0Var.a;
        baseActivity.replaceFragment$paymentsdk_release(c, false, j9h0.loading_fragment_container);
        baseActivity.showLoading$paymentsdk_release();
        if (this.showFooterOnSelectOnly) {
            raq0 raq0Var2 = this.callbacks;
            if (raq0Var2 == null) {
                raq0Var2 = null;
            }
            ((zbq0) raq0Var2).p(false);
        }
        if (waitForPay) {
            raq0 raq0Var3 = this.callbacks;
            ((zbq0) (raq0Var3 != null ? raq0Var3 : null)).m();
        }
    }

    public static /* synthetic */ void setStateLoading$default(DKSelectFragment dKSelectFragment, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        dKSelectFragment.setStateLoading(z, z2);
    }

    private final void setupObservers() {
        getViewModel().q();
        tje.N(eja1.s(this), null, null, new DKSelectFragment$setupObservers$1(this, null), 3);
        tje.N(eja1.s(this), null, null, new DKSelectFragment$setupObservers$2(this, null), 3);
        tje.N(eja1.s(this), null, null, new DKSelectFragment$setupObservers$3(this, null), 3);
        tje.N(eja1.s(this), null, null, new DKSelectFragment$setupObservers$4(this, null), 3);
        tje.N(eja1.s(this), null, null, new DKSelectFragment$setupObservers$5(this, null), 3);
        tje.N(eja1.s(this), null, null, new DKSelectFragment$setupObservers$6(this, null), 3);
        tje.N(eja1.s(this), null, null, new DKSelectFragment$setupObservers$7(this, null), 3);
        tje.N(eja1.s(this), null, null, new DKSelectFragment$setupObservers$8(this, null), 3);
    }

    private final void showWebView(String url) {
        raq0 raq0Var = this.callbacks;
        if (raq0Var == null) {
            raq0Var = null;
        }
        ((zbq0) raq0Var).j(url);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zry0 textProvider_delegate$lambda$0(DKSelectFragment dKSelectFragment) {
        raq0 raq0Var = dKSelectFragment.callbacks;
        if (raq0Var == null) {
            raq0Var = null;
        }
        return ((zbq0) raq0Var).J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePayment(uv90 payment) {
        wga0 wga0Var = (wga0) payment;
        this.formattedSum = mta1.d(requireContext(), wga0Var.g(), getEventReporter());
        this.sum = wga0Var.g().getTotal();
        raq0 raq0Var = this.callbacks;
        if (raq0Var == null) {
            raq0Var = null;
        }
        zbq0 zbq0Var = (zbq0) raq0Var;
        zbq0Var.B = wga0Var;
        xry0 xry0Var = yry0.a;
        yry0.a.getClass();
        if (zbq0Var.B == null) {
            zbq0Var.p(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateState(keq0 state) {
        if (state instanceof geq0) {
            geq0 geq0Var = (geq0) state;
            setStateLoading(geq0Var.b, geq0Var.a);
            return;
        }
        if (state instanceof ieq0) {
            raq0 raq0Var = this.callbacks;
            if (raq0Var == null) {
                raq0Var = null;
            }
            ((zbq0) raq0Var).L();
            rwo eventReporter = getEventReporter();
            sv90 sv90Var = qv90.a;
            PsdkScreen psdkScreen = PsdkScreen.DK_SELECT;
            sv90Var.getClass();
            ((y22) eventReporter).a(sv90.w0(psdkScreen));
            setStateData();
            return;
        }
        if (state instanceof jeq0) {
            new Handler(Looper.getMainLooper()).post(new j9f(18, this, (jeq0) state));
        } else if (state instanceof eeq0) {
            new Handler(Looper.getMainLooper()).post(new j9f(19, this, (eeq0) state));
        } else if (jl40.l(state, feq0.a)) {
            cancelPayment();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateState$lambda$0(DKSelectFragment dKSelectFragment, keq0 keq0Var) {
        ((xc5) dKSelectFragment.getActivityViewModel()).X();
        if (dKSelectFragment.showFooterOnSelectOnly) {
            raq0 raq0Var = dKSelectFragment.callbacks;
            if (raq0Var == null) {
                raq0Var = null;
            }
            ((zbq0) raq0Var).p(false);
        }
        raq0 raq0Var2 = dKSelectFragment.callbacks;
        if (raq0Var2 == null) {
            raq0Var2 = null;
        }
        ((zbq0) raq0Var2).K();
        raq0 raq0Var3 = dKSelectFragment.callbacks;
        ((zbq0) (raq0Var3 != null ? raq0Var3 : null)).r(((jeq0) keq0Var).a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateState$lambda$1(DKSelectFragment dKSelectFragment, keq0 keq0Var) {
        rwo eventReporter = dKSelectFragment.getEventReporter();
        sv90 sv90Var = qv90.a;
        eeq0 eeq0Var = (eeq0) keq0Var;
        String message = eeq0Var.a.getMessage();
        sv90Var.getClass();
        ((y22) eventReporter).a(y891.c("select_screen_error_shown", vfc.i(0, CRLReasonCodeExtension.REASON, message, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Показ ошибки на экране выбора метода оплаты: ".concat(message))));
        ((xc5) dKSelectFragment.getActivityViewModel()).X();
        if (dKSelectFragment.showFooterOnSelectOnly) {
            raq0 raq0Var = dKSelectFragment.callbacks;
            if (raq0Var == null) {
                raq0Var = null;
            }
            ((zbq0) raq0Var).p(false);
        }
        raq0 raq0Var2 = dKSelectFragment.callbacks;
        if (raq0Var2 == null) {
            raq0Var2 = null;
        }
        ((zbq0) raq0Var2).K();
        raq0 raq0Var3 = dKSelectFragment.callbacks;
        ((zbq0) (raq0Var3 != null ? raq0Var3 : null)).q(eeq0Var.a);
    }

    public final nx getActionReceiver() {
        nx nxVar = this.actionReceiver;
        if (nxVar != null) {
            return nxVar;
        }
        return null;
    }

    public final ujk getDivConfiguration() {
        ujk ujkVar = this.divConfiguration;
        if (ujkVar != null) {
            return ujkVar;
        }
        return null;
    }

    public final rwo getEventReporter() {
        rwo rwoVar = this.eventReporter;
        if (rwoVar != null) {
            return rwoVar;
        }
        return null;
    }

    public final kcq0 getMediator() {
        kcq0 kcq0Var = this.mediator;
        if (kcq0Var != null) {
            return kcq0Var;
        }
        return null;
    }

    public final u2l getParsingEnvironment() {
        u2l u2lVar = this.parsingEnvironment;
        if (u2lVar != null) {
            return u2lVar;
        }
        return null;
    }

    public final ov5 getResIdProvider() {
        ov5 ov5Var = this.resIdProvider;
        if (ov5Var != null) {
            return ov5Var;
        }
        return null;
    }

    public final ouj0 getResourceProvider() {
        ouj0 ouj0Var = this.resourceProvider;
        if (ouj0Var != null) {
            return ouj0Var;
        }
        return null;
    }

    public final mvf getViewModelFactory() {
        mvf mvfVar = this.viewModelFactory;
        if (mvfVar != null) {
            return mvfVar;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        boolean z = requireArguments().getBoolean(ARG_DK_SELECT_VIEW_MODEL_REFACTORING_ENABLED);
        raq0 raq0Var = this.callbacks;
        if (raq0Var == null) {
            raq0Var = null;
        }
        xxk xxkVar = (xxk) ((zbq0) raq0Var).b(this, xxk.class);
        raq0 raq0Var2 = this.callbacks;
        if (raq0Var2 == null) {
            raq0Var2 = null;
        }
        k3v k3vVar = (k3v) ((zbq0) raq0Var2).b(this, k3v.class);
        raq0 raq0Var3 = this.callbacks;
        if (raq0Var3 == null) {
            raq0Var3 = null;
        }
        t89 t89Var = (t89) ((zbq0) raq0Var3).b(this, t89.class);
        requireActivity();
        requireActivity().getApplicationContext();
        requireActivity().getApplication();
        raq0 raq0Var4 = this.callbacks;
        if (raq0Var4 == null) {
            raq0Var4 = null;
        }
        aq80 aq80Var = new aq80(((zbq0) raq0Var4).H());
        raq0 raq0Var5 = this.callbacks;
        if (raq0Var5 == null) {
            raq0Var5 = null;
        }
        vv90 k = ((zbq0) raq0Var5).k();
        raq0 raq0Var6 = this.callbacks;
        if (raq0Var6 == null) {
            raq0Var6 = null;
        }
        ((zbq0) raq0Var6).s();
        raq0 raq0Var7 = this.callbacks;
        if (raq0Var7 == null) {
            raq0Var7 = null;
        }
        zbq0 zbq0Var = (zbq0) raq0Var7;
        zbq0Var.getClass();
        pgk0 pgk0Var = new pgk0(18, zbq0Var);
        raq0 raq0Var8 = this.callbacks;
        if (raq0Var8 == null) {
            raq0Var8 = null;
        }
        ((zbq0) raq0Var8).getClass();
        pv5 pv5Var = new pv5();
        k.getClass();
        new as31();
        new ncq0();
        dzf dzfVar = (dzf) xxkVar;
        rwo rwoVar = dzfVar.g;
        com.yandex.payment.divkit.usecases.l lVar = new com.yandex.payment.divkit.usecases.l(new com.yandex.payment.divkit.repository.a(dzfVar.d(), rwoVar), new m93(dzfVar.a.getApplicationContext()), new u3u(), dzfVar.e(), rwoVar);
        abe e = dzfVar.e();
        com.yandex.payment.divkit.usecases.a aVar = new com.yandex.payment.divkit.usecases.a(new com.yandex.payment.divkit.usecases.m(rwoVar), rwoVar);
        com.yandex.payment.divkit.usecases.m mVar = new com.yandex.payment.divkit.usecases.m(rwoVar);
        qwf qwfVar = (qwf) k3vVar;
        PaymentToken paymentToken = (PaymentToken) qwfVar.a.b;
        q5z.i(paymentToken);
        m3v m3vVar = (m3v) qwfVar.b.L.get();
        q5z.h(m3vVar);
        com.yandex.payment.divkit.usecases.b bVar = new com.yandex.payment.divkit.usecases.b(paymentToken, m3vVar);
        tpr tprVar = (tpr) ((qwf) t89Var).b.M.get();
        q5z.h(tprVar);
        int i = 18;
        this.viewModelFactory = new mvf(lVar, rwoVar, e, aq80Var, k, aVar, mVar, bVar, tprVar, z, new com.yandex.payment.divkit.usecases.i(pgk0Var), new q(pgk0Var), new nsi0(k, rwoVar), new r(k, rwoVar), new s(new com.yandex.payment.divkit.usecases.m(rwoVar), rwoVar), new com.yandex.payment.divkit.usecases.n(rwoVar), new p(new aye0(2, k), dzfVar.e(), rwoVar), new coq0(rwoVar));
        ujk b = dzfVar.b();
        q5z.h(b);
        this.divConfiguration = b;
        u2l c = dzfVar.c();
        q5z.h(c);
        this.parsingEnvironment = c;
        nx a = dzfVar.a();
        q5z.h(a);
        this.actionReceiver = a;
        this.eventReporter = rwoVar;
        kcq0 kcq0Var = new kcq0();
        kcq0Var.y = rwoVar;
        this.mediator = kcq0Var;
        this.resourceProvider = dzfVar.e();
        this.resIdProvider = pv5Var;
        avf viewModel = getViewModel();
        raq0 raq0Var9 = this.callbacks;
        if (raq0Var9 == null) {
            raq0Var9 = null;
        }
        wga0 wga0Var = ((zbq0) raq0Var9).B;
        kcq0 mediator = getMediator();
        PaymentMethod paymentMethod = (PaymentMethod) requireArguments().getParcelable(ARG_PREFERRED_METHOD);
        raq0 raq0Var10 = this.callbacks;
        if (raq0Var10 == null) {
            raq0Var10 = null;
        }
        NewCard I = ((zbq0) raq0Var10).I();
        raq0 raq0Var11 = this.callbacks;
        if (raq0Var11 == null) {
            raq0Var11 = null;
        }
        String email = ((zbq0) raq0Var11).A.getEmail();
        raq0 raq0Var12 = this.callbacks;
        if (raq0Var12 == null) {
            raq0Var12 = null;
        }
        zbq0 zbq0Var2 = (zbq0) raq0Var12;
        zbq0Var2.getClass();
        pgk0 pgk0Var2 = new pgk0(i, zbq0Var2);
        raq0 raq0Var13 = this.callbacks;
        if (raq0Var13 == null) {
            raq0Var13 = null;
        }
        boolean z2 = !((zbq0) raq0Var13).s() && apa1.e(FeatureFlag.YB_TOP_UP_FLAG);
        boolean h = i891.h(requireContext().getTheme(), ong0.paymentsdk_is_light_theme, true);
        raq0 raq0Var14 = this.callbacks;
        if (raq0Var14 == null) {
            raq0Var14 = null;
        }
        boolean s = ((zbq0) raq0Var14).s();
        raq0 raq0Var15 = this.callbacks;
        if (raq0Var15 == null) {
            raq0Var15 = null;
        }
        viewModel.M(wga0Var, mediator, paymentMethod, email, I, pgk0Var2, h, z2, s, !((zbq0) raq0Var15).s() && apa1.e(FeatureFlag.ENABLE_CHECK_PAYMENT), requireArguments().getString(ARG_META_JSON));
        tje.N(eja1.s(this), null, null, new DKSelectFragment$onCreate$1(this, null), 3);
        setupObservers();
        raq0 raq0Var16 = this.callbacks;
        if (raq0Var16 == null) {
            raq0Var16 = null;
        }
        ((zbq0) raq0Var16).n(false);
        raq0 raq0Var17 = this.callbacks;
        if (((zbq0) (raq0Var17 == null ? null : raq0Var17)).C) {
            return;
        }
        this.showFooterOnSelectOnly = i891.h(requireActivity().getTheme(), ong0.paymentsdk_showFooterOnSelectOnly, false);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(ulh0.dk_select_fragment_layout, container, false);
        LinearLayout linearLayout = (LinearLayout) inflate;
        int i = l9h0.divContainer;
        LinearLayout linearLayout2 = (LinearLayout) cma1.O(i, inflate);
        if (linearLayout2 != null) {
            i = l9h0.scroll_view;
            if (((FrameLayout) cma1.O(i, inflate)) != null) {
                this._binding = new rwl(linearLayout, linearLayout, linearLayout2);
                return linearLayout;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        raq0 raq0Var = this.callbacks;
        if (raq0Var == null) {
            raq0Var = null;
        }
        if (!((zbq0) raq0Var).C) {
            kcq0 mediator = getMediator();
            mediator.x = EmptyList.a;
            mediator.a = null;
            mediator.b = null;
            mediator.c = null;
            mediator.w = null;
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        raq0 raq0Var = this.callbacks;
        if (raq0Var == null) {
            raq0Var = null;
        }
        ((zbq0) raq0Var).n(false);
        raq0 raq0Var2 = this.callbacks;
        if (((zbq0) (raq0Var2 == null ? null : raq0Var2)).C) {
            return;
        }
        if (raq0Var2 == null) {
            raq0Var2 = null;
        }
        ((zbq0) raq0Var2).p(true);
        raq0 raq0Var3 = this.callbacks;
        ((zbq0) (raq0Var3 != null ? raq0Var3 : null)).getClass();
        xry0 xry0Var = yry0.a;
        yry0.a.getClass();
    }

    public final void setActionReceiver(nx nxVar) {
        this.actionReceiver = nxVar;
    }

    @Override // defpackage.saq0
    public void setCallback(raq0 callbacks) {
        this.callbacks = callbacks;
    }

    public final void setDivConfiguration(ujk ujkVar) {
        this.divConfiguration = ujkVar;
    }

    public final void setEventReporter(rwo rwoVar) {
        this.eventReporter = rwoVar;
    }

    public final void setMediator(kcq0 kcq0Var) {
        this.mediator = kcq0Var;
    }

    public final void setParsingEnvironment(u2l u2lVar) {
        this.parsingEnvironment = u2lVar;
    }

    public final void setResIdProvider(ov5 ov5Var) {
        this.resIdProvider = ov5Var;
    }

    public final void setResourceProvider(ouj0 ouj0Var) {
        this.resourceProvider = ouj0Var;
    }

    public final void setViewModelFactory(mvf mvfVar) {
        this.viewModelFactory = mvfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showWebView(String url, List<? extends fi11> trustedUrls) {
        raq0 raq0Var = this.callbacks;
        if (raq0Var == null) {
            raq0Var = null;
        }
        ((zbq0) raq0Var).d(url, trustedUrls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CvvScreenArguments mapToParams(xpv xpvVar) {
        if (xpvVar instanceof IncomingChallengeEvent$OpenCvv$ForceCvv) {
            return new CvvScreenArguments.ForceCvv(((IncomingChallengeEvent$OpenCvv$ForceCvv) xpvVar).getCard());
        }
        if (xpvVar instanceof IncomingChallengeEvent$OpenCvv$Challenge) {
            IncomingChallengeEvent$OpenCvv$Challenge incomingChallengeEvent$OpenCvv$Challenge = (IncomingChallengeEvent$OpenCvv$Challenge) xpvVar;
            return new CvvScreenArguments.Challenge(incomingChallengeEvent$OpenCvv$Challenge.getDigits(), incomingChallengeEvent$OpenCvv$Challenge.getCardSystem(), incomingChallengeEvent$OpenCvv$Challenge.getCardSuffix());
        }
        w511.b();
        return null;
    }
}
