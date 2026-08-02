package com.ybsdk.feature.transactions.impl.ui.screens.transaction.divkit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import defpackage.dcs;
import defpackage.eja1;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.l8x;
import defpackage.lfx;
import defpackage.ojl;
import defpackage.pjl;
import defpackage.qc70;
import defpackage.qjl;
import defpackage.rr51;
import defpackage.tje;
import defpackage.w661;
import defpackage.wqj;
import defpackage.y8f;
import defpackage.yr31;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/ybsdk/feature/transactions/impl/ui/screens/transaction/divkit/DivTransactionInfoFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lw661;", "Lqjl;", "Lcom/ybsdk/feature/transactions/impl/ui/screens/transaction/divkit/a;", "Lojl;", "viewModelFactory", "<init>", "(Lojl;)V", "createViewModel", "()Lcom/ybsdk/feature/transactions/impl/ui/screens/transaction/divkit/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lw661;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "viewState", "render", "(Lqjl;)V", "Lojl;", "Lcom/ybsdk/feature/transactions/impl/ui/screens/transaction/divkit/DivTransactionScreenParams;", "screenParams$delegate", "Li3y;", "getScreenParams", "()Lcom/ybsdk/feature/transactions/impl/ui/screens/transaction/divkit/DivTransactionScreenParams;", "screenParams", "Ll8x;", "loadingDelayJob", "Ll8x;", "Lqc70;", "prevProgressState", "Lqc70;", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DivTransactionInfoFragment extends BaseDivContextMvvmFragment<w661, qjl, a> {
    private l8x loadingDelayJob;
    private qc70 prevProgressState;

    /* renamed from: screenParams$delegate, reason: from kotlin metadata */
    private final i3y screenParams;
    private final ojl viewModelFactory;

    public DivTransactionInfoFragment(ojl ojlVar) {
        super(null, null, null, null, a.class, 15, null);
        this.viewModelFactory = ojlVar;
        this.screenParams = dcs.c(this);
    }

    private final DivTransactionScreenParams getScreenParams() {
        return (DivTransactionScreenParams) this.screenParams.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$1$lambda$0(qjl qjlVar, w661 w661Var) {
        rr51 a = qjlVar.a();
        if (a != null) {
            YbDivView.setData$default(w661Var.b, a, null, null, false, 14, null);
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((pjl) this.viewModelFactory).a(getScreenParams());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [uc5] */
    /* JADX WARN: Type inference failed for: r0v1, types: [uc5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [uc5] */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((w661) getBinding()).b.setActionHandler(new DivTransactionInfoFragment$onViewCreated$1(getViewModel()));
        ((w661) getBinding()).c.setPrimaryButtonOnClickListener(new DivTransactionInfoFragment$onViewCreated$2(getViewModel()));
        ((w661) getBinding()).c.setSecondaryButtonClickListener(new DivTransactionInfoFragment$onViewCreated$3(getViewModel()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(qjl viewState) {
        w661 w661Var = (w661) getBinding();
        w661Var.b.setVisibility(viewState.a() != null ? 0 : 8);
        requireView().post(new wqj(4, viewState, w661Var));
        w661Var.c.render(viewState.b());
        if (jl40.l(this.prevProgressState, viewState.c())) {
            return;
        }
        this.prevProgressState = viewState.c();
        l8x l8xVar = this.loadingDelayJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.loadingDelayJob = tje.N(eja1.s(this), null, null, new DivTransactionInfoFragment$render$1$2(viewState, w661Var, null), 3);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public w661 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return w661.o(inflater);
    }
}
