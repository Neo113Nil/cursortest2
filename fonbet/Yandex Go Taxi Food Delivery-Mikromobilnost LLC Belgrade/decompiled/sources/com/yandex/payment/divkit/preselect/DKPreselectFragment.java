package com.yandex.payment.divkit.preselect;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.view2.Div2View;
import com.yandex.payment.common.data.TextRes;
import com.yandex.payment.divkit.preselect.DKPreselectFragment;
import com.yandex.payment.divkit.usecases.l;
import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;
import com.yandex.xplat.payment.sdk.PsdkScreen;
import defpackage.apa1;
import defpackage.ave0;
import defpackage.bwe0;
import defpackage.cma1;
import defpackage.cwe0;
import defpackage.ds31;
import defpackage.dwe0;
import defpackage.dye;
import defpackage.dzf;
import defpackage.eja1;
import defpackage.es31;
import defpackage.ewe0;
import defpackage.fwe0;
import defpackage.gtq0;
import defpackage.gwe0;
import defpackage.hhq0;
import defpackage.htf;
import defpackage.i3y;
import defpackage.i891;
import defpackage.itf;
import defpackage.j9f;
import defpackage.j9h0;
import defpackage.jl40;
import defpackage.k5c;
import defpackage.kcq0;
import defpackage.ktf;
import defpackage.kvo;
import defpackage.l9h0;
import defpackage.m93;
import defpackage.mdh;
import defpackage.mpa0;
import defpackage.ncq0;
import defpackage.nx;
import defpackage.ny61;
import defpackage.o3a0;
import defpackage.omk;
import defpackage.ong0;
import defpackage.pwf;
import defpackage.q5z;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.qv90;
import defpackage.rs31;
import defpackage.rtf;
import defpackage.rwo;
import defpackage.sjh;
import defpackage.slf;
import defpackage.sls;
import defpackage.smk;
import defpackage.sv90;
import defpackage.tje;
import defpackage.tls;
import defpackage.tnb1;
import defpackage.u2l;
import defpackage.u3u;
import defpackage.ujk;
import defpackage.ulh0;
import defpackage.uue0;
import defpackage.uyj;
import defpackage.vv90;
import defpackage.w8f;
import defpackage.xry0;
import defpackage.xxk;
import defpackage.y22;
import defpackage.y8f;
import defpackage.yry0;
import defpackage.zmk;
import defpackage.zry0;
import defpackage.zy11;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 o2\u00020\u00012\u00020\u0002:\u0001pB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001a\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u0004J\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\"\u00109\u001a\u0002088\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u00104\u001a\u0004\bA\u0010BR\"\u0010E\u001a\u00020D8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010L\u001a\u00020K8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010S\u001a\u00020R8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010Z\u001a\u00020Y8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010a\u001a\u00020`8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u001b\u0010k\u001a\u00020g8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u00104\u001a\u0004\bi\u0010jR\u0014\u0010n\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006q"}, d2 = {"Lcom/yandex/payment/divkit/preselect/DKPreselectFragment;", "Landroidx/fragment/app/Fragment;", "Luue0;", "<init>", "()V", "Litf;", "callbacks", "Lzy11;", "setCallback", "(Litf;)V", "Lhtf;", ClidProvider.STATE, "setExternalButtonState", "(Lhtf;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "observeViewModel", "Lsmk;", "divDataForRendering", "observeDivData", "(Lsmk;)V", "Lgwe0;", "updateState", "(Lgwe0;)V", "", "url", "openUrl", "(Ljava/lang/String;)V", "Litf;", "Lmpa0;", "_binding", "Lmpa0;", "", "startPaymentAfterSelect", "Z", "Lcom/yandex/div/core/view2/Div2View;", "div2View", "Lcom/yandex/div/core/view2/Div2View;", "Lzry0;", "textProvider$delegate", "Li3y;", "getTextProvider", "()Lzry0;", "textProvider", "Lrtf;", "viewModelFactory", "Lrtf;", "getViewModelFactory", "()Lrtf;", "setViewModelFactory", "(Lrtf;)V", "Lcom/yandex/payment/divkit/preselect/f;", "viewModel$delegate", "getViewModel", "()Lcom/yandex/payment/divkit/preselect/f;", "viewModel", "Lujk;", "divConfiguration", "Lujk;", "getDivConfiguration", "()Lujk;", "setDivConfiguration", "(Lujk;)V", "Lu2l;", "parsingEnvironment", "Lu2l;", "getParsingEnvironment", "()Lu2l;", "setParsingEnvironment", "(Lu2l;)V", "Lnx;", "actionReceiver", "Lnx;", "getActionReceiver", "()Lnx;", "setActionReceiver", "(Lnx;)V", "Lrwo;", "eventReporter", "Lrwo;", "getEventReporter", "()Lrwo;", "setEventReporter", "(Lrwo;)V", "Lkcq0;", "mediator", "Lkcq0;", "getMediator", "()Lkcq0;", "setMediator", "(Lkcq0;)V", "Lcom/yandex/div/core/Div2Context;", "divContext$delegate", "getDivContext", "()Lcom/yandex/div/core/Div2Context;", "divContext", "getBinding", "()Lmpa0;", "binding", "Companion", "ktf", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DKPreselectFragment extends Fragment implements uue0 {
    public static final ktf Companion = new ktf();
    private static final String DEFAULT_PAYMENT_METHOD_ID = "DEFAULT_PAYMENT_METHOD_ID";
    private static final String ORDER_AMOUNT = "ORDER_AMOUNT";
    private static final String START_PAYMENT_AFTER_SELECT = "START_PAYMENT_AFTER_SELECT";
    private static final String URI_HOST_CLICK_ON_BACK_BUTTON = "back";
    private static final String URI_HOST_CLICK_ON_BIND_CARD = "bind_card_click";
    private static final String URI_HOST_CLICK_ON_PAY_BUTTON = "pay_button_click";
    private static final String URI_HOST_CLICK_ON_PROMO = "click_on_promo";
    private static final String URI_HOST_OPEN_LINK = "open_link";
    private static final String URI_HOST_SHOW_TOAST = "show_toast";
    private mpa0 _binding;
    public nx actionReceiver;
    private itf callbacks;
    private Div2View div2View;
    public ujk divConfiguration;

    /* renamed from: divContext$delegate, reason: from kotlin metadata */
    private final i3y divContext;
    public rwo eventReporter;
    public kcq0 mediator;
    public u2l parsingEnvironment;
    private boolean startPaymentAfterSelect;

    /* renamed from: textProvider$delegate, reason: from kotlin metadata */
    private final i3y textProvider;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;
    public rtf viewModelFactory;

    /* JADX WARN: Type inference failed for: r1v2, types: [com.yandex.payment.divkit.preselect.DKPreselectFragment$special$$inlined$viewModels$default$1] */
    public DKPreselectFragment() {
        final int i = 0;
        this.textProvider = kotlin.a.a(new sls(this) { // from class: jtf
            public final /* synthetic */ DKPreselectFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zry0 textProvider_delegate$lambda$0;
                hs31 viewModelFactory;
                Div2Context divContext_delegate$lambda$0;
                int i2 = i;
                DKPreselectFragment dKPreselectFragment = this.b;
                switch (i2) {
                    case 0:
                        textProvider_delegate$lambda$0 = DKPreselectFragment.textProvider_delegate$lambda$0(dKPreselectFragment);
                        return textProvider_delegate$lambda$0;
                    case 1:
                        viewModelFactory = dKPreselectFragment.getViewModelFactory();
                        return viewModelFactory;
                    default:
                        divContext_delegate$lambda$0 = DKPreselectFragment.divContext_delegate$lambda$0(dKPreselectFragment);
                        return divContext_delegate$lambda$0;
                }
            }
        });
        final int i2 = 1;
        sls slsVar = new sls(this) { // from class: jtf
            public final /* synthetic */ DKPreselectFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zry0 textProvider_delegate$lambda$0;
                hs31 viewModelFactory;
                Div2Context divContext_delegate$lambda$0;
                int i22 = i2;
                DKPreselectFragment dKPreselectFragment = this.b;
                switch (i22) {
                    case 0:
                        textProvider_delegate$lambda$0 = DKPreselectFragment.textProvider_delegate$lambda$0(dKPreselectFragment);
                        return textProvider_delegate$lambda$0;
                    case 1:
                        viewModelFactory = dKPreselectFragment.getViewModelFactory();
                        return viewModelFactory;
                    default:
                        divContext_delegate$lambda$0 = DKPreselectFragment.divContext_delegate$lambda$0(dKPreselectFragment);
                        return divContext_delegate$lambda$0;
                }
            }
        };
        final ?? r1 = new sls(this) { // from class: com.yandex.payment.divkit.preselect.DKPreselectFragment$special$$inlined$viewModels$default$1
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
        final i3y b = kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.payment.divkit.preselect.DKPreselectFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r1.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(f.class), new sls() { // from class: com.yandex.payment.divkit.preselect.DKPreselectFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar, new sls() { // from class: com.yandex.payment.divkit.preselect.DKPreselectFragment$special$$inlined$viewModels$default$4
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
        this.divContext = kotlin.a.a(new sls(this) { // from class: jtf
            public final /* synthetic */ DKPreselectFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zry0 textProvider_delegate$lambda$0;
                hs31 viewModelFactory;
                Div2Context divContext_delegate$lambda$0;
                int i22 = i3;
                DKPreselectFragment dKPreselectFragment = this.b;
                switch (i22) {
                    case 0:
                        textProvider_delegate$lambda$0 = DKPreselectFragment.textProvider_delegate$lambda$0(dKPreselectFragment);
                        return textProvider_delegate$lambda$0;
                    case 1:
                        viewModelFactory = dKPreselectFragment.getViewModelFactory();
                        return viewModelFactory;
                    default:
                        divContext_delegate$lambda$0 = DKPreselectFragment.divContext_delegate$lambda$0(dKPreselectFragment);
                        return divContext_delegate$lambda$0;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Div2Context divContext_delegate$lambda$0(DKPreselectFragment dKPreselectFragment) {
        return new Div2Context(dKPreselectFragment.requireActivity(), dKPreselectFragment.getDivConfiguration(), 0, dKPreselectFragment.getViewLifecycleOwner(), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mpa0 getBinding() {
        mpa0 mpa0Var = this._binding;
        if (mpa0Var != null) {
            return mpa0Var;
        }
        ny61.r("Required value was null.");
        return null;
    }

    private final Div2Context getDivContext() {
        return (Div2Context) this.divContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zry0 getTextProvider() {
        return (zry0) this.textProvider.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f getViewModel() {
        return (f) this.viewModel.getValue();
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
        rwo eventReporter = getEventReporter();
        sv90 sv90Var = qv90.a;
        PsdkScreen psdkScreen = PsdkScreen.DK_PRESELECT;
        sv90Var.getClass();
        ((y22) eventReporter).a(sv90.w0(psdkScreen));
        Div2View div2View3 = this.div2View;
        if (div2View3 != null) {
            div2View3.setData(n, new zmk(n.b));
        }
        Div2View div2View4 = this.div2View;
        if (div2View4 != null) {
            div2View4.post(new j9f(15, divDataForRendering, this));
        }
        itf itfVar = this.callbacks;
        if (itfVar == null) {
            itfVar = null;
        }
        PreselectActivity preselectActivity = ((com.yandex.payment.sdk.ui.preselect.a) itfVar).a;
        preselectActivity.hideLoading$paymentsdk_release();
        preselectActivity.removeFragment$paymentsdk_release(j9h0.loading_fragment_container);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeDivData$lambda$1(smk smkVar, DKPreselectFragment dKPreselectFragment) {
        for (Pair pair : smkVar.c) {
            String str = (String) pair.getFirst();
            String str2 = (String) pair.getSecond();
            Div2View div2View = dKPreselectFragment.div2View;
            if (div2View != null) {
                div2View.setVariable(str, str2);
            }
        }
    }

    private final void observeViewModel() {
        f viewModel = getViewModel();
        viewModel.getClass();
        tje.N(ds31.a(viewModel), uyj.a, null, new DKPreselectViewModel$observeBankEvents$1(viewModel, null), 2);
        tje.N(eja1.s(this), null, null, new DKPreselectFragment$observeViewModel$1(this, null), 3);
        tje.N(eja1.s(this), null, null, new DKPreselectFragment$observeViewModel$2(this, null), 3);
        tje.N(eja1.s(this), null, null, new DKPreselectFragment$observeViewModel$3(this, null), 3);
        tje.N(eja1.s(this), null, null, new DKPreselectFragment$observeViewModel$4(this, null), 3);
        tje.N(eja1.s(this), null, null, new DKPreselectFragment$observeViewModel$5(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openUrl(String url) {
        try {
            try {
                new slf().a().a(requireContext(), Uri.parse(url));
            } catch (ActivityNotFoundException unused) {
            }
        } catch (Exception unused2) {
            requireContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zry0 textProvider_delegate$lambda$0(DKPreselectFragment dKPreselectFragment) {
        itf itfVar = dKPreselectFragment.callbacks;
        if (itfVar == null) {
            itfVar = null;
        }
        ((com.yandex.payment.sdk.ui.preselect.a) itfVar).getClass();
        xry0 xry0Var = yry0.a;
        return tnb1.f(yry0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateState(gwe0 state) {
        if (state instanceof cwe0) {
            itf itfVar = this.callbacks;
            ((com.yandex.payment.sdk.ui.preselect.a) (itfVar != null ? itfVar : null)).q(false, new TextRes.IntRes(getTextProvider().d));
            return;
        }
        if (state instanceof dwe0) {
            itf itfVar2 = this.callbacks;
            ((com.yandex.payment.sdk.ui.preselect.a) (itfVar2 != null ? itfVar2 : null)).q(true, new TextRes.IntRes(getTextProvider().d));
            return;
        }
        if (state instanceof ewe0) {
            itf itfVar3 = this.callbacks;
            PreselectActivity preselectActivity = ((com.yandex.payment.sdk.ui.preselect.a) (itfVar3 != null ? itfVar3 : null)).a;
            preselectActivity.hideLoading$paymentsdk_release();
            preselectActivity.removeFragment$paymentsdk_release(j9h0.loading_fragment_container);
            return;
        }
        if (!(state instanceof fwe0)) {
            if (state instanceof bwe0) {
                itf itfVar4 = this.callbacks;
                bwe0 bwe0Var = (bwe0) state;
                ((com.yandex.payment.sdk.ui.preselect.a) (itfVar4 != null ? itfVar4 : null)).j(bwe0Var.a, bwe0Var.b);
                return;
            }
            return;
        }
        if (this.startPaymentAfterSelect) {
            itf itfVar5 = this.callbacks;
            if (itfVar5 == null) {
                itfVar5 = null;
            }
            ((com.yandex.payment.sdk.ui.preselect.a) itfVar5).q(true, new TextRes.IntRes(getTextProvider().d));
        }
        itf itfVar6 = this.callbacks;
        ((com.yandex.payment.sdk.ui.preselect.a) (itfVar6 != null ? itfVar6 : null)).m(new hhq0(((fwe0) state).a));
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

    public final rtf getViewModelFactory() {
        rtf rtfVar = this.viewModelFactory;
        if (rtfVar != null) {
            return rtfVar;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        boolean z;
        List list;
        super.onCreate(savedInstanceState);
        itf itfVar = this.callbacks;
        if (itfVar == null) {
            itfVar = null;
        }
        xxk xxkVar = (xxk) ((com.yandex.payment.sdk.ui.preselect.a) itfVar).b(this, xxk.class);
        requireActivity();
        requireActivity().getApplicationContext();
        requireActivity().getApplication();
        itf itfVar2 = this.callbacks;
        if (itfVar2 == null) {
            itfVar2 = null;
        }
        vv90 k = ((com.yandex.payment.sdk.ui.preselect.a) itfVar2).k();
        itf itfVar3 = this.callbacks;
        if (itfVar3 == null) {
            itfVar3 = null;
        }
        ((com.yandex.payment.sdk.ui.preselect.a) itfVar3).a.getDebrandingFlag$paymentsdk_release();
        k.getClass();
        new ave0();
        new ncq0();
        dzf dzfVar = (dzf) xxkVar;
        rwo rwoVar = dzfVar.g;
        this.viewModelFactory = new rtf(new l(new com.yandex.payment.divkit.repository.a(dzfVar.d(), rwoVar), new m93(dzfVar.a.getApplicationContext()), new u3u(), dzfVar.e(), rwoVar), rwoVar, dzfVar.e(), k);
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
        this.startPaymentAfterSelect = requireArguments().getBoolean(START_PAYMENT_AFTER_SELECT);
        tje.N(eja1.s(this), null, null, new DKPreselectFragment$onCreate$1(this, null), 3);
        final f viewModel = getViewModel();
        kcq0 mediator = getMediator();
        itf itfVar4 = this.callbacks;
        if (itfVar4 == null) {
            itfVar4 = null;
        }
        boolean z2 = !((com.yandex.payment.sdk.ui.preselect.a) itfVar4).a.getDebrandingFlag$paymentsdk_release() && apa1.e(FeatureFlag.YB_TOP_UP_FLAG);
        boolean h = i891.h(requireContext().getTheme(), ong0.paymentsdk_is_light_theme, true);
        itf itfVar5 = this.callbacks;
        if (itfVar5 == null) {
            itfVar5 = null;
        }
        boolean debrandingFlag$paymentsdk_release = ((com.yandex.payment.sdk.ui.preselect.a) itfVar5).a.getDebrandingFlag$paymentsdk_release();
        itf itfVar6 = this.callbacks;
        if (itfVar6 == null) {
            itfVar6 = null;
        }
        PreselectActivity preselectActivity = ((com.yandex.payment.sdk.ui.preselect.a) itfVar6).a;
        z = preselectActivity.useExternalPaymentMethods;
        PreselectActivity.a aVar = z ? preselectActivity.externalPaymentMethodsModel : null;
        itf itfVar7 = this.callbacks;
        if (itfVar7 == null) {
            itfVar7 = null;
        }
        list = ((com.yandex.payment.sdk.ui.preselect.a) itfVar7).a.methods;
        String string = requireArguments().getString(DEFAULT_PAYMENT_METHOD_ID);
        String string2 = requireArguments().getString(ORDER_AMOUNT);
        itf itfVar8 = this.callbacks;
        if (itfVar8 == null) {
            itfVar8 = null;
        }
        Map<String, String> legalUrlsMap = ((pwf) ((com.yandex.payment.sdk.ui.preselect.a) itfVar8).a.getBaseComponent$paymentsdk_release()).a().getLegalUrlsMap();
        viewModel.getClass();
        mediator.c = new dye(19, viewModel);
        viewModel.B = debrandingFlag$paymentsdk_release;
        viewModel.C = string;
        viewModel.A = mediator;
        viewModel.z = h;
        viewModel.y = z2;
        viewModel.M = string2;
        viewModel.N = legalUrlsMap;
        if (list == null) {
            r0 r0Var = viewModel.D;
            dwe0 dwe0Var = dwe0.a;
            if (aVar != null) {
                r0Var.getClass();
                r0Var.m(null, dwe0Var);
                tls tlsVar = new tls() { // from class: com.yandex.payment.divkit.preselect.b
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        f fVar = f.this;
                        tje.N(ds31.a(fVar), null, null, new DKPreselectViewModel$updatePaymentMethods$1(fVar, (List) obj, null), 3);
                        return zy11.a;
                    }
                };
                o3a0.c.a(zy11.a);
                aVar.a.add(tlsVar);
            } else {
                r0Var.getClass();
                r0Var.m(null, dwe0Var);
                k5c a2 = ds31.a(viewModel);
                sjh sjhVar = uyj.a;
                tje.N(a2, mdh.b, null, new DKPreselectViewModel$loadAvailableMethods$1(viewModel, null), 2);
            }
        } else {
            tje.N(ds31.a(viewModel), null, null, new DKPreselectViewModel$updatePaymentMethods$1(viewModel, list, null), 3);
        }
        observeViewModel();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(ulh0.paymentsdk_dk_preselect_fragment, container, false);
        LinearLayout linearLayout = (LinearLayout) inflate;
        int i = l9h0.divContainer;
        LinearLayout linearLayout2 = (LinearLayout) cma1.O(i, inflate);
        if (linearLayout2 != null) {
            i = l9h0.scroll_view;
            if (((FrameLayout) cma1.O(i, inflate)) != null) {
                this._binding = new mpa0(linearLayout, linearLayout, linearLayout2);
                return linearLayout;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        itf itfVar = this.callbacks;
        if (itfVar == null) {
            itfVar = null;
        }
        ((com.yandex.payment.sdk.ui.preselect.a) itfVar).n(false);
    }

    public final void setActionReceiver(nx nxVar) {
        this.actionReceiver = nxVar;
    }

    @Override // defpackage.uue0
    public void setCallback(itf callbacks) {
        this.callbacks = callbacks;
    }

    public final void setDivConfiguration(ujk ujkVar) {
        this.divConfiguration = ujkVar;
    }

    public final void setEventReporter(rwo rwoVar) {
        this.eventReporter = rwoVar;
    }

    @Override // defpackage.uue0
    public void setExternalButtonState(htf state) {
        Div2View div2View = this.div2View;
        if (div2View != null) {
            div2View.setVariable("select_method_screen_order_amount", NumberFormat.getNumberInstance().format(new BigDecimal(String.valueOf(state.a))));
        }
    }

    public final void setMediator(kcq0 kcq0Var) {
        this.mediator = kcq0Var;
    }

    public final void setParsingEnvironment(u2l u2lVar) {
        this.parsingEnvironment = u2lVar;
    }

    public final void setViewModelFactory(rtf rtfVar) {
        this.viewModelFactory = rtfVar;
    }
}
