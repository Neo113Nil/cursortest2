package com.ybsdk.feature.transactions.impl.ui.screens.list;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.widgets.common.ErrorView;
import defpackage.bg01;
import defpackage.but0;
import defpackage.cg01;
import defpackage.dcs;
import defpackage.dg01;
import defpackage.e7n;
import defpackage.f861;
import defpackage.gg01;
import defpackage.gsx;
import defpackage.hc5;
import defpackage.hg01;
import defpackage.i3y;
import defpackage.ig01;
import defpackage.jg01;
import defpackage.lfx;
import defpackage.lsb1;
import defpackage.n2v0;
import defpackage.nsb1;
import defpackage.ola1;
import defpackage.qas0;
import defpackage.qf01;
import defpackage.spl;
import defpackage.w511;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR!\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/ybsdk/feature/transactions/impl/ui/screens/list/TransactionsFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lf861;", "Ljg01;", "Lcom/ybsdk/feature/transactions/impl/ui/screens/list/a;", "Lbg01;", "factoryOfViewModel", "<init>", "(Lbg01;)V", "createViewModel", "()Lcom/ybsdk/feature/transactions/impl/ui/screens/list/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lf861;", "Lzy11;", "onDestroyView", "()V", "viewState", "render", "(Ljg01;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Lbg01;", "Le7n;", "Lgc5;", "adapter$delegate", "Li3y;", "getAdapter", "()Le7n;", "adapter", "Lgsx;", "lastItemScrollListener$delegate", "getLastItemScrollListener", "()Lgsx;", "lastItemScrollListener", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TransactionsFragment extends BaseDivContextMvvmFragment<f861, jg01, a> {

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final i3y adapter;
    private final bg01 factoryOfViewModel;

    /* renamed from: lastItemScrollListener$delegate, reason: from kotlin metadata */
    private final i3y lastItemScrollListener;

    public TransactionsFragment(bg01 bg01Var) {
        super(null, null, null, null, a.class, 15, null);
        this.factoryOfViewModel = bg01Var;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.adapter = kotlin.a.b(lazyThreadSafetyMode, new qf01(this, 0));
        this.lastItemScrollListener = kotlin.a.b(lazyThreadSafetyMode, new qf01(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r6v1, types: [uc5] */
    public static final e7n adapter_delegate$lambda$1(TransactionsFragment transactionsFragment) {
        return new e7n(hc5.a(), ola1.c(new but0(20, transactionsFragment)), lsb1.c(new TransactionsFragment$adapter$2$2(transactionsFragment.getViewModel())), nsb1.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean adapter_delegate$lambda$1$lambda$0(TransactionsFragment transactionsFragment, Uri uri, spl splVar) {
        return ((a) transactionsFragment.getViewModel()).c0(uri);
    }

    private final e7n getAdapter() {
        return (e7n) this.adapter.getValue();
    }

    private final gsx getLastItemScrollListener() {
        return (gsx) this.lastItemScrollListener.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gsx lastItemScrollListener_delegate$lambda$3(TransactionsFragment transactionsFragment) {
        return new gsx(new qf01(transactionsFragment, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 lastItemScrollListener_delegate$lambda$3$lambda$2(TransactionsFragment transactionsFragment) {
        ((a) transactionsFragment.getViewModel()).d0();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof cg01) {
            ((f861) getBinding()).e.setRefreshing(((cg01) sideEffect).a());
        } else {
            super.consumeSideEffect(sideEffect);
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((dg01) this.factoryOfViewModel).a((TransactionsParams) dcs.a(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [uc5] */
    /* JADX WARN: Type inference failed for: r3v1, types: [uc5] */
    @Override // com.ybsdk.core.presentation.BindingFragment
    public f861 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        f861 o = f861.o(inflater, container);
        RecyclerView recyclerView = o.g;
        recyclerView.setAdapter(getAdapter());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.Q = false;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addOnScrollListener(getLastItemScrollListener());
        o.e.setOnRefreshListener(new n2v0(26, (a) getViewModel()));
        ErrorView errorView = o.c;
        errorView.setPrimaryButtonOnClickListener(new TransactionsFragment$getViewBinding$1$3(getViewModel()));
        errorView.setSecondaryButtonClickListener(new TransactionsFragment$getViewBinding$1$4(getViewModel()));
        return o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ((f861) getBinding()).g.removeOnScrollListener(getLastItemScrollListener());
        ((f861) getBinding()).g.setAdapter(null);
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(jg01 viewState) {
        boolean z = viewState instanceof ig01;
        ((f861) getBinding()).d.p().setVisibility((!z || ((f861) getBinding()).e.isRefreshing()) ? 8 : 0);
        boolean z2 = viewState instanceof gg01;
        ((f861) getBinding()).b.setVisibility(z2 ? 0 : 8);
        boolean z3 = viewState instanceof hg01;
        if (z3) {
            ((f861) getBinding()).c.render(((hg01) viewState).a());
        } else if (!z) {
            if (!z2) {
                w511.b();
                return;
            } else {
                gg01 gg01Var = (gg01) viewState;
                ((f861) getBinding()).f.render(gg01Var.a());
                getAdapter().g(gg01Var.b());
            }
        }
        ((f861) getBinding()).c.setVisibility(z3 ? 0 : 8);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
