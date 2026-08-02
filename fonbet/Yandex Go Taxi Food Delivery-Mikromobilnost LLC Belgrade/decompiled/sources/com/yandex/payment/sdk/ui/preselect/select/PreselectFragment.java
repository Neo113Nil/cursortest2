package com.yandex.payment.sdk.ui.preselect.select;

import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.ui.ViewBindingActivityImpl;
import com.yandex.payment.sdk.ui.ViewBindingFragmentImpl;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;
import com.yandex.payment.sdk.ui.preselect.select.PreselectFragment;
import com.yandex.payment.sdk.ui.view.HeaderView;
import com.yandex.payment.sdk.ui.view.ProgressResultView;
import com.yandex.payment.sdk.ui.view.payment.SelectPaymentAdapter$AdapterMode;
import com.yandex.xplat.common.YSError;
import com.yandex.xplat.payment.sdk.NetworkServiceRetryingStrategy;
import defpackage.bqr0;
import defpackage.bx5;
import defpackage.ckt;
import defpackage.cof;
import defpackage.cvy0;
import defpackage.dn60;
import defpackage.dpb1;
import defpackage.dy40;
import defpackage.es31;
import defpackage.hhq0;
import defpackage.i3y;
import defpackage.iho;
import defpackage.iob1;
import defpackage.j9h0;
import defpackage.jwe0;
import defpackage.jx90;
import defpackage.k7d0;
import defpackage.kbs;
import defpackage.kwe0;
import defpackage.l7b1;
import defpackage.lng0;
import defpackage.ls31;
import defpackage.lwe0;
import defpackage.md51;
import defpackage.mwe0;
import defpackage.n891;
import defpackage.njf0;
import defpackage.nu5;
import defpackage.nwe0;
import defpackage.ny61;
import defpackage.o3a0;
import defpackage.ojf0;
import defpackage.ong0;
import defpackage.owe0;
import defpackage.p7u;
import defpackage.pwe0;
import defpackage.pwf;
import defpackage.qoi0;
import defpackage.qv90;
import defpackage.qwe0;
import defpackage.rnf;
import defpackage.rv10;
import defpackage.rwe0;
import defpackage.rwo;
import defpackage.ryh0;
import defpackage.sls;
import defpackage.sv90;
import defpackage.t0p;
import defpackage.tls;
import defpackage.tv5;
import defpackage.ucq0;
import defpackage.vcq0;
import defpackage.vfc;
import defpackage.vpa0;
import defpackage.vue0;
import defpackage.vv90;
import defpackage.vw90;
import defpackage.w511;
import defpackage.wnb0;
import defpackage.wy4;
import defpackage.xcq0;
import defpackage.xry0;
import defpackage.xue0;
import defpackage.y22;
import defpackage.y4a0;
import defpackage.y891;
import defpackage.y8f;
import defpackage.y8h;
import defpackage.yry0;
import defpackage.yue0;
import defpackage.yv90;
import defpackage.zue0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 K2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003\u001bLMB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\t2\b\b\u0001\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\t2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010)\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b)\u0010*J!\u0010,\u001a\u00020\t2\u0006\u0010+\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0012H\u0016¢\u0006\u0004\b/\u0010\u0015J'\u00103\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u00107\u001a\u0004\bG\u0010HR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010J¨\u0006N"}, d2 = {"Lcom/yandex/payment/sdk/ui/preselect/select/PreselectFragment;", "Lcom/yandex/payment/sdk/ui/ViewBindingFragmentImpl;", "Lvpa0;", "Lucq0;", "<init>", "()V", "", "debrandingEnabled", "()Z", "Lzy11;", "observeChanges", "", "getPaymentButtonText", "()Ljava/lang/String;", "Lqwe0;", ClidProvider.STATE, "setState", "(Lqwe0;)V", "", "textResId", "showLoading", "(I)V", "", "Lcom/yandex/payment/sdk/core/data/PaymentMethod;", "methods", "updateMethods", "(Ljava/util/List;)V", "Lyue0;", "callbacks", "setSelectCallbacks$paymentsdk_release", "(Lyue0;)V", "setSelectCallbacks", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onCreate", "(Landroid/os/Bundle;)V", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "position", "onSelectPaymentMethod", "isValid", "Lrnf;", "cvnInput", "onChangeCvn", "(IZLrnf;)V", "Lbqr0;", "activityViewModel$delegate", "Li3y;", "getActivityViewModel", "()Lbqr0;", "activityViewModel", "Lrwe0;", "viewModel", "Lrwe0;", "Lxcq0;", "adapter", "Lxcq0;", "startPaymentAfterSelect", "Z", "defaultPaymentMethodId", "Ljava/lang/String;", "Lrwo;", "eventReporter$delegate", "getEventReporter", "()Lrwo;", "eventReporter", "Lyue0;", "Companion", "zue0", "xue0", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PreselectFragment extends ViewBindingFragmentImpl<vpa0> implements ucq0 {
    public static final xue0 Companion = new xue0();
    private static final String DEFAULT_PAYMENT_METHOD_ID = "DEFAULT_PAYMENT_METHOD_ID";
    private static final String START_PAYMENT_AFTER_SELECT = "START_PAYMENT_AFTER_SELECT";
    private xcq0 adapter;
    private yue0 callbacks;
    private String defaultPaymentMethodId;
    private boolean startPaymentAfterSelect;
    private rwe0 viewModel;

    /* renamed from: activityViewModel$delegate, reason: from kotlin metadata */
    private final i3y activityViewModel = new es31(qoi0.a(bqr0.class), new sls(this) { // from class: com.yandex.payment.sdk.ui.preselect.select.PreselectFragment$special$$inlined$activityViewModels$default$1
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.$this_activityViewModels = this;
        }

        @Override // defpackage.sls
        public final Object invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }, new sls(this) { // from class: com.yandex.payment.sdk.ui.preselect.select.PreselectFragment$special$$inlined$activityViewModels$default$3
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.$this_activityViewModels = this;
        }

        @Override // defpackage.sls
        public final Object invoke() {
            return this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
        }
    }, new sls(this) { // from class: com.yandex.payment.sdk.ui.preselect.select.PreselectFragment$special$$inlined$activityViewModels$default$2
        final /* synthetic */ sls $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.$this_activityViewModels = this;
        }

        @Override // defpackage.sls
        public final Object invoke() {
            y8f y8fVar;
            sls slsVar = this.$extrasProducer;
            return (slsVar == null || (y8fVar = (y8f) slsVar.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : y8fVar;
        }
    });

    /* renamed from: eventReporter$delegate, reason: from kotlin metadata */
    private final i3y eventReporter = a.a(new vue0(this, 0));

    private final boolean debrandingEnabled() {
        FragmentActivity activity = getActivity();
        ViewBindingActivityImpl viewBindingActivityImpl = activity instanceof ViewBindingActivityImpl ? (ViewBindingActivityImpl) activity : null;
        return n891.o(viewBindingActivityImpl != null ? Boolean.valueOf(viewBindingActivityImpl.getDebrandingFlag$paymentsdk_release()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rwo eventReporter_delegate$lambda$0(PreselectFragment preselectFragment) {
        return ((pwf) ((wy4) ((y8h) ((p7u) dpb1.c(preselectFragment)).componentDispatcher()).b(wy4.class))).c();
    }

    private final bqr0 getActivityViewModel() {
        return (bqr0) this.activityViewModel.getValue();
    }

    private final rwo getEventReporter() {
        return (rwo) this.eventReporter.getValue();
    }

    private final String getPaymentButtonText() {
        return this.startPaymentAfterSelect ? getString(ryh0.paymentsdk_pay_title) : getString(ryh0.paymentsdk_select_method_button);
    }

    private final void observeChanges() {
        rwe0 rwe0Var = this.viewModel;
        if (rwe0Var == null) {
            rwe0Var = null;
        }
        final int i = 0;
        int i2 = 6;
        rwe0Var.z.f(getViewLifecycleOwner(), new cof(i2, new tls(this) { // from class: wue0
            public final /* synthetic */ PreselectFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 observeChanges$lambda$0;
                zy11 observeChanges$lambda$1;
                int i3 = i;
                PreselectFragment preselectFragment = this.b;
                switch (i3) {
                    case 0:
                        observeChanges$lambda$0 = PreselectFragment.observeChanges$lambda$0(preselectFragment, (List) obj);
                        return observeChanges$lambda$0;
                    default:
                        observeChanges$lambda$1 = PreselectFragment.observeChanges$lambda$1(preselectFragment, (qwe0) obj);
                        return observeChanges$lambda$1;
                }
            }
        }));
        rwe0 rwe0Var2 = this.viewModel;
        final int i3 = 1;
        (rwe0Var2 != null ? rwe0Var2 : null).A.f(getViewLifecycleOwner(), new cof(i2, new tls(this) { // from class: wue0
            public final /* synthetic */ PreselectFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 observeChanges$lambda$0;
                zy11 observeChanges$lambda$1;
                int i32 = i3;
                PreselectFragment preselectFragment = this.b;
                switch (i32) {
                    case 0:
                        observeChanges$lambda$0 = PreselectFragment.observeChanges$lambda$0(preselectFragment, (List) obj);
                        return observeChanges$lambda$0;
                    default:
                        observeChanges$lambda$1 = PreselectFragment.observeChanges$lambda$1(preselectFragment, (qwe0) obj);
                        return observeChanges$lambda$1;
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeChanges$lambda$0(PreselectFragment preselectFragment, List list) {
        preselectFragment.updateMethods(list);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeChanges$lambda$1(PreselectFragment preselectFragment, qwe0 qwe0Var) {
        preselectFragment.setState(qwe0Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$0(PreselectFragment preselectFragment) {
        rwe0 rwe0Var = preselectFragment.viewModel;
        if (rwe0Var == null) {
            rwe0Var = null;
        }
        rwe0Var.a0();
        return zy11.a;
    }

    private final void setState(qwe0 state) {
        n891.b(getBinding().a, (ViewGroup) requireView().getRootView().findViewById(j9h0.container_layout));
        if (state instanceof lwe0) {
            showLoading(((lwe0) state).a);
            return;
        }
        if (state instanceof jwe0) {
            yue0 yue0Var = this.callbacks;
            ((com.yandex.payment.sdk.ui.preselect.a) (yue0Var != null ? yue0Var : null)).p(((jwe0) state).a);
            return;
        }
        if (state instanceof mwe0) {
            getBinding().f.setVisibility(8);
            getBinding().b.setVisibility(0);
            mwe0 mwe0Var = (mwe0) state;
            int i = 2;
            int i2 = 1;
            if (mwe0Var.c) {
                getBinding().b.setActionButton(Integer.valueOf(ryh0.paymentsdk_unbind_edit_button), new vue0(this, i2));
            } else {
                HeaderView.setActionButton$default(getBinding().b, null, null, 2, null);
            }
            getBinding().h.setVisibility(0);
            yue0 yue0Var2 = this.callbacks;
            if (yue0Var2 == null) {
                yue0Var2 = null;
            }
            ((com.yandex.payment.sdk.ui.preselect.a) yue0Var2).n(true);
            yue0 yue0Var3 = this.callbacks;
            if (yue0Var3 == null) {
                yue0Var3 = null;
            }
            ((com.yandex.payment.sdk.ui.preselect.a) yue0Var3).B(new vue0(this, i));
            xcq0 xcq0Var = this.adapter;
            xcq0.i(xcq0Var != null ? xcq0Var : null, mwe0Var.a, mwe0Var.b, 4);
            return;
        }
        if (state instanceof pwe0) {
            getBinding().f.setVisibility(8);
            getBinding().b.setVisibility(0);
            getBinding().b.setActionButton(Integer.valueOf(ryh0.paymentsdk_unbind_done_button), new vue0(this, 3));
            getBinding().h.setVisibility(0);
            yue0 yue0Var4 = this.callbacks;
            if (yue0Var4 == null) {
                yue0Var4 = null;
            }
            ((com.yandex.payment.sdk.ui.preselect.a) yue0Var4).n(false);
            xcq0 xcq0Var2 = this.adapter;
            if (xcq0Var2 == null) {
                xcq0Var2 = null;
            }
            xcq0.i(xcq0Var2, ((pwe0) state).a, null, 6);
            return;
        }
        if (state instanceof nwe0) {
            if (this.startPaymentAfterSelect) {
                xry0 xry0Var = yry0.a;
                showLoading(yry0.a.n);
            }
            yue0 yue0Var5 = this.callbacks;
            ((com.yandex.payment.sdk.ui.preselect.a) (yue0Var5 != null ? yue0Var5 : null)).m(new hhq0(((nwe0) state).a));
            return;
        }
        if (!(state instanceof owe0)) {
            if (!(state instanceof kwe0)) {
                w511.b();
                return;
            }
            yue0 yue0Var6 = this.callbacks;
            kwe0 kwe0Var = (kwe0) state;
            ((com.yandex.payment.sdk.ui.preselect.a) (yue0Var6 != null ? yue0Var6 : null)).j(kwe0Var.a, kwe0Var.b);
            return;
        }
        getBinding().f.setVisibility(0);
        ProgressResultView progressResultView = getBinding().f;
        xry0 xry0Var2 = yry0.a;
        progressResultView.setState(new ojf0(yry0.a.k));
        getBinding().b.setVisibility(8);
        getBinding().h.setVisibility(8);
        yue0 yue0Var7 = this.callbacks;
        if (yue0Var7 == null) {
            yue0Var7 = null;
        }
        ((com.yandex.payment.sdk.ui.preselect.a) yue0Var7).n(false);
        yue0 yue0Var8 = this.callbacks;
        yue0 yue0Var9 = yue0Var8 != null ? yue0Var8 : null;
        PaymentMethod paymentMethod = ((owe0) state).a;
        ((com.yandex.payment.sdk.ui.preselect.a) yue0Var9).getClass();
        o3a0.d.a(paymentMethod);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setState$lambda$0(PreselectFragment preselectFragment) {
        rwe0 rwe0Var = preselectFragment.viewModel;
        if (rwe0Var == null) {
            rwe0Var = null;
        }
        rwe0Var.a0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setState$lambda$1(PreselectFragment preselectFragment) {
        rwo eventReporter = preselectFragment.getEventReporter();
        qv90.a.getClass();
        ((y22) eventReporter).a(sv90.D());
        rwe0 rwe0Var = preselectFragment.viewModel;
        if (rwe0Var == null) {
            rwe0Var = null;
        }
        xcq0 xcq0Var = preselectFragment.adapter;
        if (xcq0Var == null) {
            xcq0Var = null;
        }
        PaymentMethod a = l7b1.a(xcq0Var.A);
        if (rwe0Var.C.contains(a)) {
            rwe0Var.A.l(new nwe0(a));
            return zy11.a;
        }
        kbs.g("Invalid state. Selected method is empty.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setState$lambda$2(PreselectFragment preselectFragment) {
        rwe0 rwe0Var = preselectFragment.viewModel;
        if (rwe0Var == null) {
            rwe0Var = null;
        }
        rwe0Var.X();
        return zy11.a;
    }

    private final void showLoading(int textResId) {
        getBinding().f.setVisibility(0);
        getBinding().f.setState(new njf0(textResId, true));
        getBinding().b.setVisibility(8);
        getBinding().h.setVisibility(8);
        yue0 yue0Var = this.callbacks;
        if (yue0Var == null) {
            yue0Var = null;
        }
        ((com.yandex.payment.sdk.ui.preselect.a) yue0Var).n(false);
    }

    private final void updateMethods(List<? extends PaymentMethod> methods) {
        yue0 yue0Var = this.callbacks;
        if (yue0Var == null) {
            yue0Var = null;
        }
        ((com.yandex.payment.sdk.ui.preselect.a) yue0Var).t(methods);
    }

    @Override // defpackage.ucq0
    public void onChangeCvn(int position, boolean isValid, rnf cvnInput) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        boolean z;
        super.onCreate(savedInstanceState);
        this.startPaymentAfterSelect = requireArguments().getBoolean(START_PAYMENT_AFTER_SELECT);
        this.defaultPaymentMethodId = requireArguments().getString(DEFAULT_PAYMENT_METHOD_ID);
        Application application = requireActivity().getApplication();
        vv90 f = ((pwf) ((wy4) ((y8h) ((p7u) dpb1.c(this)).componentDispatcher()).b(wy4.class))).f();
        Handler handler = new Handler(Looper.getMainLooper());
        String str = this.defaultPaymentMethodId;
        yue0 yue0Var = this.callbacks;
        if (yue0Var == null) {
            yue0Var = null;
        }
        PreselectActivity preselectActivity = ((com.yandex.payment.sdk.ui.preselect.a) yue0Var).a;
        z = preselectActivity.useExternalPaymentMethods;
        this.viewModel = (rwe0) new ls31(this, new zue0(application, f, handler, str, z ? preselectActivity.externalPaymentMethodsModel : null, getEventReporter())).b(rwe0.class);
        TypedValue c = iob1.c(requireContext().getTheme(), lng0.paymentsdk_paymentCellElements);
        if (c == null) {
            ny61.g("No integer for passed attribute");
            return;
        }
        int i = c.data;
        if (i >= SelectPaymentAdapter$AdapterMode.values().length) {
            ny61.g("Wrong enum value for AdapterMode");
            return;
        }
        SelectPaymentAdapter$AdapterMode selectPaymentAdapter$AdapterMode = SelectPaymentAdapter$AdapterMode.values()[i];
        cvy0 cvy0Var = ckt.a;
        xcq0 xcq0Var = new xcq0(this, new dn60(ckt.a(requireContext()), 11, (byte) 0), iob1.d(requireContext().getTheme(), ong0.paymentsdk_is_light_theme, true), selectPaymentAdapter$AdapterMode, getEventReporter());
        this.adapter = xcq0Var;
        xcq0Var.C = debrandingEnabled();
        xcq0 xcq0Var2 = this.adapter;
        (xcq0Var2 != null ? xcq0Var2 : null).setHasStableIds(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vpa0 o = vpa0.o(inflater, container);
        setCurrentBinding(o);
        return o.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ucq0
    public void onSelectPaymentMethod(int position) {
        getBinding().g.scrollToPosition(position);
        rwe0 rwe0Var = this.viewModel;
        if (rwe0Var == null) {
            rwe0Var = null;
        }
        final int i = 1;
        if (!(rwe0Var.A.d() instanceof pwe0)) {
            rwe0Var.Y((PaymentMethod) rwe0Var.C.get(position), true);
            return;
        }
        Object d = rwe0Var.A.d();
        pwe0 pwe0Var = d instanceof pwe0 ? (pwe0) d : null;
        if (pwe0Var == null) {
            kbs.g("Trying to unbind in invalid state");
            return;
        }
        dy40 dy40Var = rwe0Var.A;
        xry0 xry0Var = yry0.a;
        dy40Var.l(new lwe0(yry0.a.l));
        PaymentMethod a = l7b1.a((vcq0) pwe0Var.a.get(position));
        Object[] objArr = 0;
        final y4a0 y4a0Var = new y4a0(rwe0Var, a, false, 23);
        if (a instanceof PaymentMethod.Card) {
            ((yv90) rwe0Var.b).j.e(((PaymentMethod.Card) a).getId(), y4a0Var);
            return;
        }
        if (!(a instanceof PaymentMethod.SbpToken)) {
            kbs.g("Trying to unbind non-card method");
            return;
        }
        nu5 nu5Var = ((yv90) rwe0Var.b).j;
        String id = ((PaymentMethod.SbpToken) a).getId();
        bx5 bx5Var = nu5Var.b;
        tv5 tv5Var = new tv5(id, 2);
        rwo rwoVar = bx5Var.l;
        qv90.a.getClass();
        iho c = y891.c("unbind_sbp_token", vfc.i(0, "sbp_token_id", id, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Отвязать СБП токен ".concat(id)));
        md51 f = bx5Var.f.a.f(tv5Var, new rv10(25), NetworkServiceRetryingStrategy.retryOnce);
        ((y22) rwoVar).b(c, f);
        final Object[] objArr2 = objArr == true ? 1 : 0;
        f.h(new tls() { // from class: ku5
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i2 = objArr2;
                zy11 zy11Var = zy11.a;
                y4a0 y4a0Var2 = y4a0Var;
                switch (i2) {
                    case 0:
                        n891.n(new l95(16, y4a0Var2));
                        break;
                    default:
                        n891.n(new mw2(29, y4a0Var2, (YSError) obj));
                        break;
                }
                return zy11Var;
            }
        }).c(new tls() { // from class: ku5
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i2 = i;
                zy11 zy11Var = zy11.a;
                y4a0 y4a0Var2 = y4a0Var;
                switch (i2) {
                    case 0:
                        n891.n(new l95(16, y4a0Var2));
                        break;
                    default:
                        n891.n(new mw2(29, y4a0Var2, (YSError) obj));
                        break;
                }
                return zy11Var;
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        List list;
        super.onViewCreated(view, savedInstanceState);
        int i = 0;
        HeaderView.setBackButton$default(getBinding().b, false, null, 2, null);
        getBinding().b.setCloseButton(true, new PreselectFragment$onViewCreated$1(0, getActivityViewModel(), bqr0.class, "showConfirmDialog", "showConfirmDialog()V", 0));
        getBinding().f.setExitButtonCallback(new PreselectFragment$onViewCreated$2(0, getActivityViewModel(), bqr0.class, "showConfirmDialog", "showConfirmDialog()V", 0));
        getBinding().f.setBrandIconVisible(!debrandingEnabled());
        HeaderView headerView = getBinding().b;
        xry0 xry0Var = yry0.a;
        headerView.setTitleText(Integer.valueOf(yry0.a.b));
        getBinding().b.setActionButton(Integer.valueOf(ryh0.paymentsdk_unbind_edit_button), new vue0(this, 4));
        getBinding().b.setBrandIconVisible(debrandingEnabled() ? false : iob1.d(view.getContext().getTheme(), lng0.paymentsdk_selectShowBrandIcon, true));
        getBinding().d.setVisibility(8);
        getBinding().e.setVisibility(8);
        getBinding().c.setVisibility(8);
        RecyclerView recyclerView = getBinding().g;
        xcq0 xcq0Var = this.adapter;
        if (xcq0Var == null) {
            xcq0Var = null;
        }
        recyclerView.setAdapter(xcq0Var);
        getBinding().g.setLayoutManager(new LinearLayoutManager(getContext()));
        getBinding().g.setHasFixedSize(true);
        if (!o3a0.e.a.e()) {
            yue0 yue0Var = this.callbacks;
            if (yue0Var == null) {
                yue0Var = null;
            }
            vw90.D(yue0Var, getPaymentButtonText(), null, 6);
            yue0 yue0Var2 = this.callbacks;
            if (yue0Var2 == null) {
                yue0Var2 = null;
            }
            ((com.yandex.payment.sdk.ui.preselect.a) yue0Var2).v(new jx90(i));
        }
        rwe0 rwe0Var = this.viewModel;
        if (rwe0Var == null) {
            rwe0Var = null;
        }
        yue0 yue0Var3 = this.callbacks;
        list = ((com.yandex.payment.sdk.ui.preselect.a) (yue0Var3 != null ? yue0Var3 : null)).a.methods;
        rwe0Var.getClass();
        rwe0Var.C = new ArrayList();
        if (list == null) {
            t0p t0pVar = rwe0Var.x;
            dy40 dy40Var = rwe0Var.A;
            if (t0pVar != null) {
                dy40Var.l(new lwe0(yry0.a.n));
                t0p t0pVar2 = rwe0Var.x;
                k7d0 k7d0Var = new k7d0(25, rwe0Var);
                PreselectActivity.a aVar = (PreselectActivity.a) t0pVar2;
                aVar.getClass();
                o3a0.c.a(zy11.a);
                aVar.a.add(k7d0Var);
            } else {
                dy40Var.l(new lwe0(yry0.a.n));
                rwe0Var.B.submit(new wnb0(29, rwe0Var));
            }
        } else {
            ArrayList arrayList = new ArrayList(list);
            rwe0Var.C = arrayList;
            if (arrayList.size() == 1) {
                rwe0Var.Y((PaymentMethod) kotlin.collections.a.P(rwe0Var.C), false);
            } else {
                rwe0Var.X();
            }
        }
        observeChanges();
    }

    public final void setSelectCallbacks$paymentsdk_release(yue0 callbacks) {
        this.callbacks = callbacks;
    }
}
