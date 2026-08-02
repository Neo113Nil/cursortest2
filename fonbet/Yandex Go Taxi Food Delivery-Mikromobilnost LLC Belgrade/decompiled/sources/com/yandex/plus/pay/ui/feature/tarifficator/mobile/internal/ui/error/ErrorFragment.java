package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import com.yandex.plus.home.common.utils.PlusClickableSpan;
import com.yandex.plus.home.common.utils.c;
import com.yandex.plus.pay.ui.common.api.ui.view.ProgressView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.ErrorContentView;
import com.yandex.plus.pay.ui.core.mobile.haptic.HapticType;
import com.yandex.plus.pay.ui.core.mobile.view.accordion.PlusPayAccordionView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.ErrorFragment;
import defpackage.aah0;
import defpackage.agc0;
import defpackage.b64;
import defpackage.cs31;
import defpackage.d2d0;
import defpackage.dzm;
import defpackage.e2d0;
import defpackage.es31;
import defpackage.evu0;
import defpackage.fs31;
import defpackage.gci0;
import defpackage.ho91;
import defpackage.hs31;
import defpackage.i3y;
import defpackage.jmh0;
import defpackage.kgx;
import defpackage.kmm0;
import defpackage.mx60;
import defpackage.mz90;
import defpackage.o7o;
import defpackage.oz90;
import defpackage.p7o;
import defpackage.pbd0;
import defpackage.ph91;
import defpackage.pub1;
import defpackage.q7u;
import defpackage.qir;
import defpackage.qoi0;
import defpackage.r6o;
import defpackage.rs31;
import defpackage.s23;
import defpackage.scc;
import defpackage.sls;
import defpackage.sng0;
import defpackage.sz90;
import defpackage.t23;
import defpackage.t6c;
import defpackage.ttz0;
import defpackage.u9o;
import defpackage.v3a1;
import defpackage.v9o;
import defpackage.vng;
import defpackage.w511;
import defpackage.w6o;
import defpackage.w7d0;
import defpackage.w8f;
import defpackage.w9o;
import defpackage.wv5;
import defpackage.xu5;
import defpackage.y8f;
import defpackage.ywv;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/error/ErrorFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lw9o;", ClidProvider.STATE, "Lr6o;", "errorContentViewController", "Lzy11;", "setScreenState", "(Lw9o;Lr6o;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lw6o;", "dependencies$delegate", "Li3y;", "getDependencies", "()Lw6o;", "dependencies", "Lttz0;", "toolbarViewModel$delegate", "getToolbarViewModel", "()Lttz0;", "toolbarViewModel", "Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/error/a;", "viewModel$delegate", "getViewModel", "()Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/error/a;", "viewModel", "Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/error/ErrorContentView;", "errorContentView$delegate", "Lxu5;", "getErrorContentView", "()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/error/ErrorContentView;", "errorContentView", "Lcom/yandex/plus/pay/ui/common/api/ui/view/ProgressView;", "progressView$delegate", "getProgressView", "()Lcom/yandex/plus/pay/ui/common/api/ui/view/ProgressView;", "progressView", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ErrorFragment extends Fragment {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("errorContentView", 0, "getErrorContentView()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/error/ErrorContentView;", ErrorFragment.class), b64.x(qoi0.a, ErrorFragment.class, "progressView", "getProgressView()Lcom/yandex/plus/pay/ui/common/api/ui/view/ProgressView;", 0)};

    /* renamed from: dependencies$delegate, reason: from kotlin metadata */
    private final i3y dependencies;

    /* renamed from: errorContentView$delegate, reason: from kotlin metadata */
    private final xu5 errorContentView;

    /* renamed from: progressView$delegate, reason: from kotlin metadata */
    private final xu5 progressView;

    /* renamed from: toolbarViewModel$delegate, reason: from kotlin metadata */
    private final i3y toolbarViewModel;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;

    /* JADX WARN: Type inference failed for: r3v0, types: [com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.ErrorFragment$special$$inlined$viewModels$default$1] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.ErrorFragment$special$$inlined$viewModels$default$6] */
    public ErrorFragment() {
        super(jmh0.pay_sdk_fragment_tarifficator_error);
        final int i = 0;
        this.dependencies = kotlin.a.a(new sls(this) { // from class: l7o
            public final /* synthetic */ ErrorFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                w6o dependencies_delegate$lambda$0;
                hs31 hs31Var;
                hs31 viewModel_delegate$lambda$2;
                int i2 = i;
                ErrorFragment errorFragment = this.b;
                switch (i2) {
                    case 0:
                        dependencies_delegate$lambda$0 = ErrorFragment.dependencies_delegate$lambda$0(errorFragment);
                        return dependencies_delegate$lambda$0;
                    case 1:
                        hs31Var = ErrorFragment.toolbarViewModel_delegate$lambda$1(errorFragment);
                        return hs31Var;
                    default:
                        viewModel_delegate$lambda$2 = ErrorFragment.viewModel_delegate$lambda$2(errorFragment);
                        return viewModel_delegate$lambda$2;
                }
            }
        });
        final int i2 = 1;
        sls slsVar = new sls(this) { // from class: l7o
            public final /* synthetic */ ErrorFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                w6o dependencies_delegate$lambda$0;
                hs31 hs31Var;
                hs31 viewModel_delegate$lambda$2;
                int i22 = i2;
                ErrorFragment errorFragment = this.b;
                switch (i22) {
                    case 0:
                        dependencies_delegate$lambda$0 = ErrorFragment.dependencies_delegate$lambda$0(errorFragment);
                        return dependencies_delegate$lambda$0;
                    case 1:
                        hs31Var = ErrorFragment.toolbarViewModel_delegate$lambda$1(errorFragment);
                        return hs31Var;
                    default:
                        viewModel_delegate$lambda$2 = ErrorFragment.viewModel_delegate$lambda$2(errorFragment);
                        return viewModel_delegate$lambda$2;
                }
            }
        };
        final ?? r3 = new sls(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.ErrorFragment$special$$inlined$viewModels$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final i3y b = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.ErrorFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r3.invoke();
            }
        });
        this.toolbarViewModel = new es31(qoi0.a(ttz0.class), new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.ErrorFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.ErrorFragment$special$$inlined$viewModels$default$4
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
                y8f defaultViewModelCreationExtras = q7uVar != null ? q7uVar.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? w8f.b : defaultViewModelCreationExtras;
            }
        });
        final int i3 = 2;
        sls slsVar2 = new sls(this) { // from class: l7o
            public final /* synthetic */ ErrorFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                w6o dependencies_delegate$lambda$0;
                hs31 hs31Var;
                hs31 viewModel_delegate$lambda$2;
                int i22 = i3;
                ErrorFragment errorFragment = this.b;
                switch (i22) {
                    case 0:
                        dependencies_delegate$lambda$0 = ErrorFragment.dependencies_delegate$lambda$0(errorFragment);
                        return dependencies_delegate$lambda$0;
                    case 1:
                        hs31Var = ErrorFragment.toolbarViewModel_delegate$lambda$1(errorFragment);
                        return hs31Var;
                    default:
                        viewModel_delegate$lambda$2 = ErrorFragment.viewModel_delegate$lambda$2(errorFragment);
                        return viewModel_delegate$lambda$2;
                }
            }
        };
        final ?? r32 = new sls(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.ErrorFragment$special$$inlined$viewModels$default$6
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
        final i3y b2 = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.ErrorFragment$special$$inlined$viewModels$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r32.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(a.class), new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.ErrorFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar2, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.ErrorFragment$special$$inlined$viewModels$default$9
            final /* synthetic */ sls $extrasProducer = null;

            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                y8f y8fVar;
                sls slsVar3 = this.$extrasProducer;
                if (slsVar3 != null && (y8fVar = (y8f) slsVar3.invoke()) != null) {
                    return y8fVar;
                }
                rs31 rs31Var = (rs31) i3y.this.getValue();
                q7u q7uVar = rs31Var instanceof q7u ? (q7u) rs31Var : null;
                y8f defaultViewModelCreationExtras = q7uVar != null ? q7uVar.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? w8f.b : defaultViewModelCreationExtras;
            }
        });
        this.errorContentView = new xu5(new o7o(this, i), new p7o(this, aah0.error_content_view, i));
        this.progressView = new xu5(new o7o(this, i2), new p7o(this, aah0.error_progress_view, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w6o dependencies_delegate$lambda$0(ErrorFragment errorFragment) {
        ArrayList b = ho91.b(errorFragment);
        Iterator it = b.iterator();
        while (it.hasNext()) {
            d2d0 dependencies = ((e2d0) it.next()).getDependencies();
            if (dependencies instanceof w6o) {
                return (w6o) dependencies;
            }
        }
        qir.o(w6o.class, b);
        return null;
    }

    private final w6o getDependencies() {
        return (w6o) this.dependencies.getValue();
    }

    private final ErrorContentView getErrorContentView() {
        return (ErrorContentView) this.errorContentView.a($$delegatedProperties[0]);
    }

    private final ProgressView getProgressView() {
        return (ProgressView) this.progressView.a($$delegatedProperties[1]);
    }

    private final ttz0 getToolbarViewModel() {
        return (ttz0) this.toolbarViewModel.getValue();
    }

    private final a getViewModel() {
        return (a) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$3(ErrorFragment errorFragment, mx60 mx60Var) {
        errorFragment.getViewModel().B.a();
        return zy11.a;
    }

    private static final zy11 onViewCreated$lambda$5$lambda$4(s23 s23Var) {
        t23.a aVar = (t23.a) s23Var;
        aVar.c();
        aVar.b();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScreenState(w9o state, final r6o errorContentViewController) {
        if (!(state instanceof u9o)) {
            if (!(state instanceof v9o)) {
                w511.b();
                return;
            } else {
                getProgressView().setVisibility(0);
                getErrorContentView().setVisibility(8);
                return;
            }
        }
        getProgressView().setVisibility(8);
        getErrorContentView().setVisibility(0);
        u9o u9oVar = (u9o) state;
        final oz90 oz90Var = u9oVar.a;
        TextView e = errorContentViewController.e();
        i3y i3yVar = errorContentViewController.l;
        String str = oz90Var.a;
        v3a1.c(e, str);
        TextView d = errorContentViewController.d();
        String str2 = oz90Var.b;
        v3a1.c(d, str2);
        NestedScrollView c = errorContentViewController.c();
        if (!c.isLaidOut() || c.isLayoutRequested()) {
            c.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.ErrorContentViewController$setContent$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    String str3 = oz90.this.a;
                    if (str3 != null && !evu0.J(str3)) {
                        r6o r6oVar = errorContentViewController;
                        kgx[] kgxVarArr = r6o.r;
                        r6oVar.c().scrollTo(errorContentViewController.b().getScrollX(), errorContentViewController.e().getTop());
                        return;
                    }
                    String str4 = oz90.this.b;
                    if (str4 == null || evu0.J(str4)) {
                        return;
                    }
                    r6o r6oVar2 = errorContentViewController;
                    kgx[] kgxVarArr2 = r6o.r;
                    r6oVar2.c().scrollTo(errorContentViewController.b().getScrollX(), errorContentViewController.d().getTop());
                }
            });
        } else if (str != null && !evu0.J(str)) {
            errorContentViewController.c().scrollTo(errorContentViewController.b().getScrollX(), errorContentViewController.e().getTop());
        } else if (str2 != null && !evu0.J(str2)) {
            errorContentViewController.c().scrollTo(errorContentViewController.b().getScrollX(), errorContentViewController.d().getTop());
        }
        sz90 sz90Var = oz90Var.e;
        wv5 wv5Var = errorContentViewController.f;
        int i = 6;
        if (sz90Var != null) {
            ((PlusPayAccordionView) wv5Var.a(r6o.r[6])).setVisibility(0);
            ((TextView) ((w7d0) i3yVar.getValue()).b.a(w7d0.e[0])).setText(sz90Var.a);
            w7d0 w7d0Var = (w7d0) i3yVar.getValue();
            String str3 = sz90Var.b;
            TextView a = w7d0Var.a();
            Spanned fromHtml = Html.fromHtml(str3, 63);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
            Object[] spans = fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
            int i2 = 0;
            while (i2 < spans.length) {
                int i3 = i2 + 1;
                try {
                    Object obj = spans[i2];
                    int i4 = i;
                    Iterator it = scc.g(new PlusClickableSpan(false, new agc0(i, w7d0Var, (URLSpan) obj)), new ForegroundColorSpan(vng.p(sng0.pay_sdk_highlightTextColor, w7d0Var.a().getContext()))).iterator();
                    while (it.hasNext()) {
                        spannableStringBuilder.setSpan(it.next(), fromHtml.getSpanStart(obj), fromHtml.getSpanEnd(obj), 0);
                    }
                    spannableStringBuilder.removeSpan(obj);
                    i = i4;
                    i2 = i3;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    w511.i(e2.getMessage());
                    return;
                }
            }
            a.setText(spannableStringBuilder);
        } else {
            ((PlusPayAccordionView) wv5Var.a(r6o.r[6])).setVisibility(8);
        }
        pbd0 pbd0Var = (pbd0) errorContentViewController.m.getValue();
        String str4 = oz90Var.f.a;
        mz90 mz90Var = oz90Var.g;
        String str5 = mz90Var != null ? mz90Var.a : null;
        wv5 wv5Var2 = pbd0Var.c;
        kgx[] kgxVarArr = pbd0.e;
        v3a1.c((Button) wv5Var2.a(kgxVarArr[0]), str4);
        v3a1.c((Button) pbd0Var.d.a(kgxVarArr[1]), str5);
        v3a1.c(errorContentViewController.a(), oz90Var.c);
        errorContentViewController.a().setContentDescription(oz90Var.d);
        v3a1.c((TextView) errorContentViewController.h.a(r6o.r[8]), u9oVar.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 toolbarViewModel_delegate$lambda$1(ErrorFragment errorFragment) {
        return ((kmm0) errorFragment.getDependencies()).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 viewModel_delegate$lambda$2(ErrorFragment errorFragment) {
        cs31[] cs31VarArr = (cs31[]) Arrays.copyOf(new cs31[]{new cs31(a.class, new fs31(((kmm0) errorFragment.getDependencies()).b, 2))}, 1);
        return new ywv((cs31[]) Arrays.copyOf(cs31VarArr, cs31VarArr.length));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        pub1.c(requireActivity().getOnBackPressedDispatcher(), getViewLifecycleOwner(), new dzm(8, this));
        r6o r6oVar = new r6o(getErrorContentView(), ((kmm0) getDependencies()).a.q, ((kmm0) getDependencies()).a.j, ((kmm0) getDependencies()).a.s, new ErrorFragment$onViewCreated$errorContentViewController$1(0, getViewModel(), a.class, "onCloseButtonClick", "onCloseButtonClick()V", 0), new ErrorFragment$onViewCreated$errorContentViewController$2(0, getViewModel(), a.class, "onPrimaryButtonClick", "onPrimaryButtonClick()V", 0), new ErrorFragment$onViewCreated$errorContentViewController$3(0, getViewModel(), a.class, "onSecondaryButtonClick", "onSecondaryButtonClick()V", 0));
        t23 t23Var = new t23();
        t6c t6cVar = new t6c(2, r6oVar);
        t23.a aVar = new t23.a();
        onViewCreated$lambda$5$lambda$4(aVar);
        t23Var.a.put(t6cVar, aVar);
        t23Var.a(view);
        gci0 gci0Var = getToolbarViewModel().b;
        Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        c.b(g.a(gci0Var, lifecycle, state), com.yandex.plus.home.common.utils.a.c(this), new ErrorFragment$onViewCreated$3(r6oVar, null));
        c.b(g.a(getViewModel().F, getViewLifecycleOwner().getLifecycle(), state), com.yandex.plus.home.common.utils.a.c(this), new ErrorFragment$onViewCreated$4(this, r6oVar, null));
        if (savedInstanceState == null) {
            ph91.c(view, HapticType.ERROR);
        }
    }
}
