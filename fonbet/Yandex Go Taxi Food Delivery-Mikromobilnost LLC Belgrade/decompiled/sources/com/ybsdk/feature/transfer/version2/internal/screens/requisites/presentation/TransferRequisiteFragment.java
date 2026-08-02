package com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteResult;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.ba61;
import defpackage.ce4;
import defpackage.d8p;
import defpackage.dcs;
import defpackage.dr01;
import defpackage.el0;
import defpackage.er01;
import defpackage.fr01;
import defpackage.gr01;
import defpackage.h5a0;
import defpackage.hr01;
import defpackage.i3y;
import defpackage.ir01;
import defpackage.j5x0;
import defpackage.jl01;
import defpackage.jr01;
import defpackage.k5x0;
import defpackage.lcb1;
import defpackage.lfx;
import defpackage.lq01;
import defpackage.lr01;
import defpackage.mdq0;
import defpackage.mq01;
import defpackage.mr01;
import defpackage.qa3;
import defpackage.qas0;
import defpackage.saf;
import defpackage.sl;
import defpackage.uq01;
import defpackage.vq01;
import defpackage.w511;
import defpackage.wq01;
import defpackage.xm2;
import defpackage.xq01;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.ys0;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 /2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u00010B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R)\u0010.\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010(0(0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/TransferRequisiteFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lba61;", "Lmr01;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/b;", "Lmdq0;", "Lce4;", "Ldr01;", "factory", "<init>", "(Ldr01;)V", "createViewModel", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/b;", "Lqas0;", "sideEffect", "Lzy11;", "consumeSideEffect", "(Lqas0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lba61;", "viewState", "render", "(Lmr01;)V", "", "onBackPressed", "()Z", "", "position", "scrollToField", "(I)V", "Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/TransferRequisiteResult;", TarifficatorScenarioActivity.RESULT_KEY, "finishWithResult", "(Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/TransferRequisiteResult;)V", "Ldr01;", "Lqa3;", "Lsqj0;", "kotlin.jvm.PlatformType", "requisiteFormAdapter$delegate", "Li3y;", "getRequisiteFormAdapter", "()Lqa3;", "requisiteFormAdapter", "Companion", "xq01", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TransferRequisiteFragment extends BaseDivContextMvvmFragment<ba61, mr01, b> implements mdq0, ce4 {
    public static final xq01 Companion = new xq01();
    public static final String RESULT_KEY = "REQUISITE_TRANSFER_KEY";
    private final dr01 factory;

    /* renamed from: requisiteFormAdapter$delegate, reason: from kotlin metadata */
    private final i3y requisiteFormAdapter;

    public TransferRequisiteFragment(dr01 dr01Var) {
        super(Boolean.FALSE, null, null, null, b.class, 14, null);
        this.factory = dr01Var;
        this.requisiteFormAdapter = kotlin.a.b(LazyThreadSafetyMode.NONE, new wq01(1, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void finishWithResult(TransferRequisiteResult result) {
        getParentFragmentManager().l0(result.toBundle(), RESULT_KEY);
        ((b) getViewModel()).h0();
    }

    private final qa3 getRequisiteFormAdapter() {
        return (qa3) this.requisiteFormAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$9$lambda$7(TransferRequisiteFragment transferRequisiteFragment) {
        ((b) transferRequisiteFragment.getViewModel()).i0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$9$lambda$8(TransferRequisiteFragment transferRequisiteFragment, k5x0 k5x0Var) {
        ((b) transferRequisiteFragment.getViewModel()).o0(k5x0Var.a());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j5x0 render$lambda$13$lambda$11$lambda$10(j5x0 j5x0Var, j5x0 j5x0Var2) {
        return j5x0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$13$lambda$12(int i, TransferRequisiteFragment transferRequisiteFragment) {
        if (i != transferRequisiteFragment.getRequisiteFormAdapter().f().size()) {
            transferRequisiteFragment.scrollToField(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qa3 requisiteFormAdapter_delegate$lambda$6(TransferRequisiteFragment transferRequisiteFragment) {
        int i = 0;
        int i2 = 1;
        return new qa3(lq01.a(), lq01.e(new uq01(i, transferRequisiteFragment), new uq01(i2, transferRequisiteFragment)), lq01.f(new vq01(i2, transferRequisiteFragment)), lq01.c(new vq01(2, transferRequisiteFragment)), lq01.b(new wq01(i, transferRequisiteFragment)), lq01.d(new vq01(3, transferRequisiteFragment)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 requisiteFormAdapter_delegate$lambda$6$lambda$0(TransferRequisiteFragment transferRequisiteFragment, mq01 mq01Var, String str) {
        ((b) transferRequisiteFragment.getViewModel()).m0(mq01Var, str);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 requisiteFormAdapter_delegate$lambda$6$lambda$1(TransferRequisiteFragment transferRequisiteFragment, mq01 mq01Var, boolean z) {
        ((b) transferRequisiteFragment.getViewModel()).l0(mq01Var, z);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 requisiteFormAdapter_delegate$lambda$6$lambda$2(TransferRequisiteFragment transferRequisiteFragment, boolean z) {
        ((b) transferRequisiteFragment.getViewModel()).n0(z);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 requisiteFormAdapter_delegate$lambda$6$lambda$3(TransferRequisiteFragment transferRequisiteFragment, boolean z) {
        ((b) transferRequisiteFragment.getViewModel()).p0(z);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 requisiteFormAdapter_delegate$lambda$6$lambda$4(TransferRequisiteFragment transferRequisiteFragment) {
        ((b) transferRequisiteFragment.getViewModel()).j0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean requisiteFormAdapter_delegate$lambda$6$lambda$5(TransferRequisiteFragment transferRequisiteFragment, String str) {
        return ((b) transferRequisiteFragment.getViewModel()).k0(str);
    }

    private final void scrollToField(int position) {
        safePost(new ys0(this, position, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 scrollToField$lambda$14(TransferRequisiteFragment transferRequisiteFragment, int i) {
        View view;
        RecyclerView.e layoutManager = ((ba61) transferRequisiteFragment.getBinding()).b.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.l1(i);
        }
        x0 findViewHolderForLayoutPosition = ((ba61) transferRequisiteFragment.getBinding()).b.findViewHolderForLayoutPosition(i);
        if (findViewHolderForLayoutPosition != null && (view = findViewHolderForLayoutPosition.a) != null) {
            com.ybsdk.core.utils.ext.view.b.n(1, view);
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        jr01 jr01Var = sideEffect instanceof jr01 ? (jr01) sideEffect : null;
        if (jr01Var == null) {
            return;
        }
        if (jr01Var instanceof gr01) {
            finishWithResult(new TransferRequisiteResult.Success(((gr01) jr01Var).a()));
            return;
        }
        if (jr01Var instanceof hr01) {
            scrollToField(((hr01) jr01Var).a());
            return;
        }
        if (jr01Var instanceof ir01) {
            com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), ((ir01) jr01Var).a(), null, 12);
            return;
        }
        if (jr01Var.equals(er01.a)) {
            lcb1.d(((ba61) getBinding()).o());
            ((ba61) getBinding()).b.clearFocus();
        } else if (jr01Var.equals(fr01.a)) {
            finishWithResult(TransferRequisiteResult.Close.INSTANCE);
        } else {
            w511.b();
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public b getFactoryOfViewModel() {
        return ((lr01) this.factory).a((TransferRequisiteScreenParams) dcs.a(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public ba61 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        ba61 p = ba61.p(inflater, container);
        RecyclerView recyclerView = p.b;
        recyclerView.setAdapter(getRequisiteFormAdapter());
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new d8p(requireContext()));
        p.d.setOnCloseButtonClickListener(new wq01(2, this));
        p.c.setOnTabSelectedListener(new vq01(0, this));
        return p;
    }

    @Override // defpackage.mdq0
    public void onAddMethodClicked() {
    }

    @Override // defpackage.mdq0
    public void onAdditionalButtonClicked(el0 el0Var) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ce4
    public boolean onBackPressed() {
        ((b) getViewModel()).i0();
        return true;
    }

    @Override // defpackage.mdq0
    public void onBackPressedFromSbp() {
    }

    @Override // defpackage.mdq0
    public void onCreditPaymentMethodChanged(saf safVar) {
    }

    @Override // defpackage.mdq0
    public void onSbpMethodClicked() {
    }

    @Override // defpackage.mdq0
    public void onSbpWidgetClicked() {
    }

    @Override // defpackage.mdq0
    public void onSelectedAccountChanged(sl slVar) {
    }

    @Override // defpackage.mdq0
    public void onSelectedPaymentMethodChanged(h5a0 h5a0Var) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(mr01 viewState) {
        ba61 ba61Var = (ba61) getBinding();
        ba61Var.c.setVisibility(viewState.b() != null ? 0 : 8);
        ba61Var.d.render(viewState.c());
        j5x0 b = viewState.b();
        if (b != null) {
            ba61Var.c.render(new jl01(12, b));
        }
        getRequisiteFormAdapter().h(viewState.a(), new xm2(getRequisiteFormAdapter().f().size(), this));
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
