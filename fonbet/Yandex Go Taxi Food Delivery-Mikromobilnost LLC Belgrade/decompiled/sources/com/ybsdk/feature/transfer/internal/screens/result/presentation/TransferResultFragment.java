package com.ybsdk.feature.transfer.internal.screens.result.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.ybsdk.core.design.animation.AnimUtils;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.transfer.api.TransferResultScreenParams;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.WidgetWithButtonView;
import com.ybsdk.widgets.common.WidgetWithSwitchView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.snackbar.SnackbarView;
import defpackage.as01;
import defpackage.bs01;
import defpackage.ca61;
import defpackage.cs01;
import defpackage.dcs;
import defpackage.evu0;
import defpackage.fyp0;
import defpackage.hbv;
import defpackage.jl40;
import defpackage.ki01;
import defpackage.ks01;
import defpackage.lfx;
import defpackage.ls01;
import defpackage.ms01;
import defpackage.n2v0;
import defpackage.ny61;
import defpackage.o451;
import defpackage.oc70;
import defpackage.p451;
import defpackage.ps01;
import defpackage.q451;
import defpackage.qas0;
import defpackage.qc70;
import defpackage.r451;
import defpackage.rbv;
import defpackage.rs01;
import defpackage.s451;
import defpackage.sls;
import defpackage.ss01;
import defpackage.stz0;
import defpackage.u601;
import defpackage.v4b1;
import defpackage.vmu0;
import defpackage.w511;
import defpackage.wp01;
import defpackage.wty0;
import defpackage.xty0;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zgz0;
import defpackage.zr01;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 V2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001WB\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u0019\u00100\u001a\u00020\u000f2\b\u0010$\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0004\b0\u00101J\u0019\u00103\u001a\u00020\u000f2\b\u0010$\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b3\u00104J\u0019\u00106\u001a\u00020\u000f2\b\u0010$\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\u000f2\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u000f2\u0006\u0010<\u001a\u000208H\u0002¢\u0006\u0004\b=\u0010;J\u0017\u0010@\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u0019\u0010D\u001a\u00020\u000f2\b\u0010C\u001a\u0004\u0018\u00010BH\u0002¢\u0006\u0004\bD\u0010EJ\u001d\u0010H\u001a\u00020\u000f*\u00020\u00122\b\b\u0002\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ!\u0010L\u001a\u00020\u000f*\u00020\u00122\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u000f0JH\u0002¢\u0006\u0004\bL\u0010MJ\u0013\u0010N\u001a\u00020\u000f*\u00020\u0012H\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u000fH\u0002¢\u0006\u0004\bP\u0010QR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010RR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010SR\u0018\u0010T\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006X"}, d2 = {"Lcom/ybsdk/feature/transfer/internal/screens/result/presentation/TransferResultFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lca61;", "Lss01;", "Lcom/ybsdk/feature/transfer/internal/screens/result/presentation/b;", "Lps01;", "viewModelFactory", "Lfyp0;", "secondFactorScreenProvider", "<init>", "(Lps01;Lfyp0;)V", "createViewModel", "()Lcom/ybsdk/feature/transfer/internal/screens/result/presentation/b;", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lca61;", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "viewState", "render", "(Lss01;)V", "Lstz0;", ClidProvider.STATE, "setToolbar", "(Lstz0;)V", "Lrbv;", "icon", "Lhbv;", "setIcon", "(Lrbv;)Lhbv;", "Lqc70;", "setStatusIcon", "(Lqc70;)V", "Lq451;", "setAutoTopupWidget", "(Lq451;)V", "Ls451;", "setAutoTopupSwitchWidget", "(Ls451;)V", "Lr451;", "setAutoTopupButtonWidget", "(Lr451;)V", "Lwty0;", "title", "setTitle", "(Lwty0;)V", "details", "setMessage", "", "comment", "setComment", "(Ljava/lang/String;)V", "Lcom/ybsdk/core/utils/text/Text;", "text", "setActionButtonText", "(Lcom/ybsdk/core/utils/text/Text;)V", "", "delay", "fadeIn", "(Landroid/view/View;J)V", "Lkotlin/Function0;", "onAnimationEnd", "fadeOutAnd", "(Landroid/view/View;Lsls;)V", "fadeOutAndGone", "(Landroid/view/View;)V", "updateProgressVerticalBias", "()V", "Lps01;", "Lfyp0;", "currentViewState", "Lss01;", "Companion", "cs01", "feature-transfer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TransferResultFragment extends BaseMvvmFragment<ca61, ss01, b> {
    public static final cs01 Companion = new cs01();
    private static final long FADE_OUT_DURATION = 200;
    public static final float VERTICAL_BIAS_WITHOUT_AUTO_TOPUP_OFFER = 0.37f;
    public static final float VERTICAL_BIAS_WITH_AUTO_TOPUP_OFFER = 0.63f;
    private ss01 currentViewState;
    private final fyp0 secondFactorScreenProvider;
    private final ps01 viewModelFactory;

    public TransferResultFragment(ps01 ps01Var, fyp0 fyp0Var) {
        super(Boolean.FALSE, null, null, null, b.class, 14, null);
        this.viewModelFactory = ps01Var;
        this.secondFactorScreenProvider = fyp0Var;
    }

    private final void fadeIn(View view, long j) {
        ViewPropertyAnimator f = AnimUtils.f(view);
        f.setStartDelay(j);
        f.setDuration(300L);
    }

    public static /* synthetic */ void fadeIn$default(TransferResultFragment transferResultFragment, View view, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        transferResultFragment.fadeIn(view, j);
    }

    private final void fadeOutAnd(View view, sls slsVar) {
        AnimUtils.h(view, this, new u601(2, slsVar)).setDuration(200L);
    }

    private final void fadeOutAndGone(View view) {
        AnimUtils.i(view, this).setDuration(200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(TransferResultFragment transferResultFragment, String str, Bundle bundle) {
        String a = ((ki01) transferResultFragment.secondFactorScreenProvider).a(bundle);
        if (a != null) {
            transferResultFragment.getViewModel().e0(a);
        } else {
            transferResultFragment.getRouter().e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(TransferResultFragment transferResultFragment, View view) {
        transferResultFragment.getViewModel().c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$2(TransferResultFragment transferResultFragment) {
        transferResultFragment.getRouter().e();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setActionButtonText(Text text) {
        ca61 ca61Var = (ca61) getBinding();
        int i = 0;
        if (text == null) {
            fadeOutAnd(ca61Var.b, new zr01(i, ca61Var, text));
        } else {
            ca61Var.b.render(new as01(text, i));
            fadeIn(ca61Var.b, 200L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setActionButtonText$lambda$17$lambda$15(ca61 ca61Var, Text text) {
        ca61Var.b.render(new as01(text, 1));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YbButtonView.a setActionButtonText$lambda$17$lambda$15$lambda$14(Text text, YbButtonView.a aVar) {
        return new YbButtonView.a(text, null, null, null, null, null, null, false, false, null, 4094);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YbButtonView.a setActionButtonText$lambda$17$lambda$16(Text text, YbButtonView.a aVar) {
        return new YbButtonView.a(text, null, null, null, null, null, null, false, false, null, 4094);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setAutoTopupButtonWidget(r451 state) {
        WidgetWithButtonView widgetWithButtonView = ((ca61) getBinding()).c;
        widgetWithButtonView.setVisibility(state != null ? 0 : 8);
        if (state == null) {
            return;
        }
        widgetWithButtonView.render(state);
        fadeIn$default(this, widgetWithButtonView, 0L, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setAutoTopupSwitchWidget(s451 state) {
        WidgetWithSwitchView widgetWithSwitchView = ((ca61) getBinding()).d;
        widgetWithSwitchView.setVisibility(state != null ? 0 : 8);
        if (state == null) {
            return;
        }
        widgetWithSwitchView.render(state);
        fadeIn$default(this, widgetWithSwitchView, 0L, 1, null);
    }

    private final void setAutoTopupWidget(q451 state) {
        if (state instanceof o451) {
            setAutoTopupButtonWidget(((o451) state).a());
        } else if (state instanceof p451) {
            setAutoTopupSwitchWidget(((p451) state).a());
        } else if (state != null) {
            w511.b();
            return;
        }
        updateProgressVerticalBias();
    }

    private final void setComment(String comment) {
        ca61 ca61Var = (ca61) getBinding();
        if (evu0.J(comment)) {
            fadeOutAndGone(ca61Var.g);
            return;
        }
        TextView textView = ca61Var.g;
        if (jl40.l(textView.getText(), comment)) {
            return;
        }
        textView.setVisibility(0);
        fadeOutAnd(textView, new wp01(1, ca61Var, comment, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setComment$lambda$13$lambda$12(ca61 ca61Var, String str, TransferResultFragment transferResultFragment) {
        ca61Var.g.setText(str);
        fadeIn$default(transferResultFragment, ca61Var.g, 0L, 1, null);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final hbv setIcon(rbv icon) {
        return v4b1.k(icon, ((ca61) getBinding()).k, null, null, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setMessage(wty0 details) {
        ca61 ca61Var = (ca61) getBinding();
        if (jl40.l(ca61Var.h.getText(), details.a())) {
            return;
        }
        fadeOutAnd(ca61Var.h, new bs01(ca61Var, details, this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setMessage$lambda$11$lambda$10(ca61 ca61Var, wty0 wty0Var, TransferResultFragment transferResultFragment) {
        ca61Var.h.setText(wty0Var.a());
        TextView textView = ca61Var.h;
        textView.setTextAppearance(wty0Var.b());
        xty0.f(textView, wty0Var.c());
        fadeIn$default(transferResultFragment, textView, 0L, 1, null);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setStatusIcon(qc70 state) {
        OperationProgressView operationProgressView = ((ca61) getBinding()).e;
        operationProgressView.setVisibility(jl40.l(state, oc70.a) ? 8 : 0);
        operationProgressView.render(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setTitle(wty0 title) {
        ca61 ca61Var = (ca61) getBinding();
        if (jl40.l(ca61Var.j.getText(), title.a())) {
            return;
        }
        fadeOutAnd(ca61Var.j, new bs01(ca61Var, title, this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setTitle$lambda$9$lambda$8(ca61 ca61Var, wty0 wty0Var, TransferResultFragment transferResultFragment) {
        ca61Var.j.setText(wty0Var.a());
        TextView textView = ca61Var.j;
        textView.setTextAppearance(wty0Var.b());
        xty0.f(textView, wty0Var.c());
        fadeIn$default(transferResultFragment, textView, 0L, 1, null);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setToolbar(stz0 state) {
        ((ca61) getBinding()).f.render(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateProgressVerticalBias() {
        ca61 ca61Var = (ca61) getBinding();
        boolean z = ca61Var.d.getVisibility() == 0 || ca61Var.c.getVisibility() == 0;
        ImageView imageView = ((ca61) getBinding()).k;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.verticalBias = z ? 0.63f : 0.37f;
        imageView.setLayoutParams(layoutParams2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof ms01) {
            ms01 ms01Var = (ms01) sideEffect;
            if (ms01Var instanceof ks01) {
                androidx.core.view.b.r(((ca61) getBinding()).o(), d.a(requireContext(), ((ks01) sideEffect).a()));
            } else if (ms01Var instanceof ls01) {
                SnackbarView.show$default(((ca61) getBinding()).i, ((ls01) sideEffect).a(), 0L, null, 6, null);
            } else {
                w511.b();
            }
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public b getFactoryOfViewModel() {
        return ((rs01) this.viewModelFactory).a((TransferResultScreenParams) dcs.a(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public ca61 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        ca61 p = ca61.p(inflater, container);
        p.d.setListener(new TransferResultFragment$getViewBinding$1$1(getViewModel()));
        p.c.setListener(new TransferResultFragment$getViewBinding$1$2(getViewModel()));
        return p;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getViewModel().d0();
        FragmentManager parentFragmentManager = getParentFragmentManager();
        this.secondFactorScreenProvider.getClass();
        parentFragmentManager.m0("request_key_authorization", this, new n2v0(28, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((ca61) getBinding()).b.setOnClickListener(new vmu0(21, this));
        ((ca61) getBinding()).f.setOnCloseButtonClickListener(new zgz0(27, this));
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(ss01 viewState) {
        setToolbar(viewState.h());
        setIcon(viewState.e());
        setStatusIcon(viewState.f());
        setTitle(viewState.g());
        setMessage(viewState.d());
        setComment(viewState.c());
        setActionButtonText(viewState.a());
        setAutoTopupWidget(viewState.b());
        this.currentViewState = viewState;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
