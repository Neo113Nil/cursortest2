package com.ybsdk.feature.transfer.version2.internal.screens.fund;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import com.ybsdk.feature.transfer.version2.internal.screens.fund.FundDocsNoticeFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.fund.model.FundDocsNoticeResult;
import com.ybsdk.widgets.common.TraceIdErrorView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.c;
import com.ybsdk.widgets.common.bottomsheet.d;
import com.ybsdk.widgets.common.bottomsheet.e;
import com.ybsdk.widgets.common.bottomsheet.f;
import com.ybsdk.widgets.common.bottomsheet.h;
import com.ybsdk.widgets.common.bottomsheet.l;
import defpackage.bdp;
import defpackage.dal;
import defpackage.dcs;
import defpackage.dnr;
import defpackage.dos;
import defpackage.eal;
import defpackage.eos;
import defpackage.fos;
import defpackage.gos;
import defpackage.hos;
import defpackage.hua1;
import defpackage.ios;
import defpackage.jos;
import defpackage.kao;
import defpackage.lfx;
import defpackage.lrp0;
import defpackage.lzz0;
import defpackage.n751;
import defpackage.ny61;
import defpackage.p1b;
import defpackage.p7b1;
import defpackage.qas0;
import defpackage.s1r;
import defpackage.tdr;
import defpackage.x4c;
import defpackage.y661;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.z1x0;
import defpackage.z661;
import defpackage.zns;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 /2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u00010B\u0011\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\rJ+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b&\u0010\rJ\u0017\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/fund/FundDocsNoticeFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Ly661;", "Ljos;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/fund/a;", "Ltdr;", "Ldos;", "factoryOfViewModel", "<init>", "(Ldos;)V", "viewState", "Lzy11;", "renderError", "(Ljos;)V", "renderLoading", "renderContent", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "()V", "createViewModel", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/fund/a;", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ly661;", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "render", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Ldos;", "Lz661;", "errorBinding", "Lz661;", "Companion", "zns", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FundDocsNoticeFragment extends BaseDivContextMvvmFragment<y661, jos, a> implements tdr {
    public static final zns Companion = new zns();
    public static final String RESULT_KEY = "RESULT_DROP_PRE_CONFIRM_ACTION";
    private z661 errorBinding;
    private final dos factoryOfViewModel;

    public FundDocsNoticeFragment(dos dosVar) {
        super(null, null, null, null, a.class, 15, null);
        this.factoryOfViewModel = dosVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$4$lambda$3(FundDocsNoticeFragment fundDocsNoticeFragment, boolean z) {
        ((a) fundDocsNoticeFragment.getViewModel()).c0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreateView$lambda$2$lambda$0(FundDocsNoticeFragment fundDocsNoticeFragment, View view) {
        ((a) fundDocsNoticeFragment.getViewModel()).d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreateView$lambda$2$lambda$1(FundDocsNoticeFragment fundDocsNoticeFragment, View view) {
        ((a) fundDocsNoticeFragment.getViewModel()).e0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderContent(jos viewState) {
        gos gosVar = viewState instanceof gos ? (gos) viewState : null;
        if (gosVar == null) {
            return;
        }
        ((y661) getBinding()).b.render(new BottomSheetDialogView.State((d) new f(new bdp(16, this, gosVar)), (YbButtonViewGroup.b) null, (h) null, false, (BottomSheetDialogView.State.Background) null, (l) null, (p1b) null, false, (c) null, false, (z1x0) null, (z1x0) null, false, false, 65534));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r7v1, types: [uc5] */
    public static final View renderContent$lambda$12(FundDocsNoticeFragment fundDocsNoticeFragment, gos gosVar) {
        YbDivView ybDivView = new YbDivView(fundDocsNoticeFragment.getDivContext(), null, 0, 6, null);
        YbDivView.setData$default(ybDivView, gosVar.a(), null, null, false, 14, null);
        ybDivView.setActionHandler(new FundDocsNoticeFragment$renderContent$1$1$1(fundDocsNoticeFragment.getViewModel()));
        return ybDivView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderError(jos viewState) {
        hos hosVar = viewState instanceof hos ? (hos) viewState : null;
        if (hosVar != null) {
            kao a = hosVar.a();
            z661 z661Var = this.errorBinding;
            if (z661Var == null) {
                return;
            }
            TraceIdErrorView traceIdErrorView = z661Var.d;
            String b = a.b();
            lzz0 lzz0Var = b != null ? new lzz0(b) : null;
            if (lzz0Var != null) {
                traceIdErrorView.render(lzz0Var);
            }
            z661Var.c.setText(com.ybsdk.core.utils.text.d.a(requireContext(), a.a()));
            int i = 8;
            traceIdErrorView.setVisibility(lzz0Var != null ? 0 : 8);
            ((y661) getBinding()).b.render(new BottomSheetDialogView.State((d) new e(null, null, new dnr(i, z661Var), 3), (YbButtonViewGroup.b) null, (h) null, false, (BottomSheetDialogView.State.Background) null, (l) null, (p1b) null, false, (c) null, false, (z1x0) null, (z1x0) null, false, false, 65534));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderLoading(jos viewState) {
        if (viewState instanceof ios) {
            ((y661) getBinding()).b.render(new BottomSheetDialogView.State((d) new f(new bdp(15, this, (ios) viewState)), (YbButtonViewGroup.b) null, (h) null, false, (BottomSheetDialogView.State.Background) null, (l) null, (p1b) null, false, (c) null, false, (z1x0) null, (z1x0) null, false, false, 65534));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View renderLoading$lambda$10(FundDocsNoticeFragment fundDocsNoticeFragment, jos josVar) {
        dal dalVar = DivSkeletonsView.Companion;
        Context requireContext = fundDocsNoticeFragment.requireContext();
        eal a = ((ios) josVar).a();
        dalVar.getClass();
        return dal.a(requireContext, a);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        Object failure;
        if (!(sideEffect instanceof eos)) {
            super.consumeSideEffect(sideEffect);
            return;
        }
        try {
            hua1.f(FundDocsNoticeResult.Accept.INSTANCE.toBundle(), this, RESULT_KEY);
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            x4c.g("Failed to send result from fund docs notice", a, null, Collections.singletonList(lrp0.l), 4);
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((fos) this.factoryOfViewModel).a((FundDocsNoticeParams) dcs.a(this));
    }

    @Override // defpackage.tdr
    public boolean fitNavigation() {
        return true;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public y661 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        y661 o = y661.o(inflater, container);
        o.b.onDismiss(new s1r(20, this));
        return o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        BottomSheetDialogView bottomSheetDialogView = ((y661) getBinding()).b;
        ViewGroup.LayoutParams layoutParams = bottomSheetDialogView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, p7b1.f(insets).d);
        bottomSheetDialogView.setLayoutParams(marginLayoutParams);
        return insets;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, com.ybsdk.core.presentation.BindingFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        z661 p = z661.p(inflater, container);
        final int i = 0;
        p.b.setOnClickListener(new View.OnClickListener(this) { // from class: yns
            public final /* synthetic */ FundDocsNoticeFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                FundDocsNoticeFragment fundDocsNoticeFragment = this.b;
                switch (i2) {
                    case 0:
                        FundDocsNoticeFragment.onCreateView$lambda$2$lambda$0(fundDocsNoticeFragment, view);
                        break;
                    default:
                        FundDocsNoticeFragment.onCreateView$lambda$2$lambda$1(fundDocsNoticeFragment, view);
                        break;
                }
            }
        });
        final int i2 = 1;
        p.e.setOnClickListener(new View.OnClickListener(this) { // from class: yns
            public final /* synthetic */ FundDocsNoticeFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                FundDocsNoticeFragment fundDocsNoticeFragment = this.b;
                switch (i22) {
                    case 0:
                        FundDocsNoticeFragment.onCreateView$lambda$2$lambda$0(fundDocsNoticeFragment, view);
                        break;
                    default:
                        FundDocsNoticeFragment.onCreateView$lambda$2$lambda$1(fundDocsNoticeFragment, view);
                        break;
                }
            }
        });
        this.errorBinding = p;
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.errorBinding = null;
        ((y661) getBinding()).b.revertSystemBarColors();
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((y661) getBinding()).b.updateSystemBarColors();
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(jos viewState) {
        renderError(viewState);
        renderLoading(viewState);
        renderContent(viewState);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
