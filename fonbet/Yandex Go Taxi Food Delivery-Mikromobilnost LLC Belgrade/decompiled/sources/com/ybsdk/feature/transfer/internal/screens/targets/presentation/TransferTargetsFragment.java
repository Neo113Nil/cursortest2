package com.ybsdk.feature.transfer.internal.screens.targets.presentation;

import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.transfer.utils.SimpleTextWatcher;
import com.ybsdk.feature.transfer.api.TransferTargetSelectionResult;
import com.ybsdk.feature.transfer.api.TransferYbScreenArguments;
import com.ybsdk.feature.transfer.internal.screens.common.widgets.TransferErrorView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.g;
import defpackage.au01;
import defpackage.bry;
import defpackage.bu01;
import defpackage.but0;
import defpackage.coc;
import defpackage.dcs;
import defpackage.ea61;
import defpackage.f73;
import defpackage.i3y;
import defpackage.jl01;
import defpackage.lcb1;
import defpackage.lfx;
import defpackage.nt01;
import defpackage.ot01;
import defpackage.qa3;
import defpackage.qas0;
import defpackage.qi01;
import defpackage.rfb1;
import defpackage.st01;
import defpackage.stz0;
import defpackage.t601;
import defpackage.tc01;
import defpackage.tt01;
import defpackage.ut01;
import defpackage.vt01;
import defpackage.w511;
import defpackage.wt01;
import defpackage.x4c;
import defpackage.xt01;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.yt01;
import defpackage.zp01;
import defpackage.zqy;
import defpackage.zr01;
import defpackage.zt01;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 /2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00010B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u000bJ!\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\"\u0010$\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\"0\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/ybsdk/feature/transfer/internal/screens/targets/presentation/TransferTargetsFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lea61;", "Lbu01;", "Lcom/ybsdk/feature/transfer/internal/screens/targets/presentation/b;", "Lst01;", "viewModelFactory", "<init>", "(Lst01;)V", "Lzy11;", "scrollToTop", "()V", "Lcom/ybsdk/feature/transfer/api/TransferTargetSelectionResult;", TarifficatorScenarioActivity.RESULT_KEY, "finishWithResult", "(Lcom/ybsdk/feature/transfer/api/TransferTargetSelectionResult;)V", "createViewModel", "()Lcom/ybsdk/feature/transfer/internal/screens/targets/presentation/b;", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lea61;", "viewState", "render", "(Lbu01;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Lst01;", "Lqa3;", "", "kotlin.jvm.PlatformType", "adapter", "Lqa3;", "Landroidx/recyclerview/widget/h;", "itemAnimator$delegate", "Li3y;", "getItemAnimator", "()Landroidx/recyclerview/widget/h;", "itemAnimator", "Lcom/ybsdk/core/transfer/utils/SimpleTextWatcher;", "inputWatcher", "Lcom/ybsdk/core/transfer/utils/SimpleTextWatcher;", "Companion", "ot01", "feature-transfer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TransferTargetsFragment extends BaseMvvmFragment<ea61, bu01, b> {
    public static final ot01 Companion = new ot01();
    private static final int MAX_LENGTH = 100;
    private static final int ZERO_POSITION = 0;
    private final qa3 adapter;
    private final SimpleTextWatcher inputWatcher;

    /* renamed from: itemAnimator$delegate, reason: from kotlin metadata */
    private final i3y itemAnimator;
    private final st01 viewModelFactory;

    public TransferTargetsFragment(st01 st01Var) {
        super(Boolean.FALSE, null, null, null, b.class, 14, null);
        this.viewModelFactory = st01Var;
        this.adapter = new qa3(qi01.a, zqy.a(new but0(26, this)), rfb1.i());
        this.itemAnimator = kotlin.a.a(new tc01(18));
        this.inputWatcher = new SimpleTextWatcher(new jl01(16, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 adapter$lambda$0(TransferTargetsFragment transferTargetsFragment, bry bryVar, int i) {
        transferTargetsFragment.getViewModel().e0(bryVar, i);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 consumeSideEffect$lambda$14(TransferTargetsFragment transferTargetsFragment, qas0 qas0Var) {
        transferTargetsFragment.getViewModel().b0(((ut01) qas0Var).b());
        return zy11.a;
    }

    private final void finishWithResult(TransferTargetSelectionResult result) {
        Object failure;
        try {
            getParentFragmentManager().l0(result.toBundle(), "request_select_target");
            getRouter().e();
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            x4c.g("Failed to send REQUEST_SELECT_BANK result", a, null, null, 12);
        }
    }

    private final h getItemAnimator() {
        return (h) this.itemAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$5$lambda$3(TransferTargetsFragment transferTargetsFragment) {
        transferTargetsFragment.finishWithResult(TransferTargetSelectionResult.Close.INSTANCE);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$5$lambda$4(TransferTargetsFragment transferTargetsFragment) {
        transferTargetsFragment.getViewModel().f0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 inputWatcher$lambda$2(TransferTargetsFragment transferTargetsFragment, Editable editable) {
        transferTargetsFragment.getViewModel().c0(String.valueOf(editable));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h itemAnimator_delegate$lambda$1() {
        return new h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$13$lambda$11$lambda$10(au01 au01Var, TransferTargetsFragment transferTargetsFragment) {
        if (au01Var.e()) {
            transferTargetsFragment.scrollToTop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$13$lambda$11$lambda$9(ea61 ea61Var, au01 au01Var) {
        LoadableInput.render$default(ea61Var.c, false, new jl01(15, au01Var), 1, null);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g render$lambda$13$lambda$11$lambda$9$lambda$8(au01 au01Var, g gVar) {
        return g.a(gVar, au01Var.c(), null, true, null, null, null, null, false, null, null, null, false, null, null, false, 0, false, 0, 0, null, null, null, 33554426);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g render$lambda$13$lambda$12(g gVar) {
        return g.a(gVar, null, null, false, null, null, null, null, false, null, null, null, false, null, null, false, 0, false, 0, 0, null, null, null, 33554427);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final stz0 render$lambda$13$lambda$6(bu01 bu01Var, stz0 stz0Var) {
        return stz0.a(stz0Var, null, null, null, null, null, bu01Var.a(), false, false, null, null, 0, 32735);
    }

    private final void scrollToTop() {
        safePost(new nt01(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 scrollToTop$lambda$15(TransferTargetsFragment transferTargetsFragment) {
        RecyclerView.e layoutManager = ((ea61) transferTargetsFragment.getBinding()).d.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.l1(0);
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof wt01) {
            wt01 wt01Var = (wt01) sideEffect;
            if (wt01Var instanceof ut01) {
                coc.a(this, ((ut01) sideEffect).a(), new zr01(1, this, sideEffect));
                return;
            }
            if (wt01Var instanceof vt01) {
                finishWithResult(new TransferTargetSelectionResult.Success(((vt01) sideEffect).a()));
                return;
            }
            if (wt01Var.equals(tt01.a)) {
                lcb1.d(((ea61) getBinding()).c.getEditText());
                ((ea61) getBinding()).c.getEditText().clearFocus();
            } else if (wt01Var.equals(tt01.b)) {
                ((ea61) getBinding()).c.getEditText().requestFocus();
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
        return ((xt01) this.viewModelFactory).a((TransferYbScreenArguments) dcs.a(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public ea61 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        ea61 o = ea61.o(inflater, container);
        o.d.setAdapter(this.adapter);
        this.adapter.g(EmptyList.a);
        LoadableInput loadableInput = o.c;
        loadableInput.getEditText().setFilters(loadableInput.getEditText().getFilters() == null ? new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(100)} : (InputFilter[]) f73.s(loadableInput.getEditText().getFilters(), new InputFilter.LengthFilter(100)));
        loadableInput.getEditText().addTextChangedListener(this.inputWatcher);
        o.e.setOnCloseButtonClickListener(new nt01(this, 0));
        o.b.setOnRetryClickListener(new nt01(this, 1));
        return o;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getViewModel().d0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(bu01 viewState) {
        ea61 ea61Var = (ea61) getBinding();
        setBackButtonVisible(viewState.isBackButtonVisible());
        TransferErrorView transferErrorView = ea61Var.b;
        LoadableInput loadableInput = ea61Var.c;
        boolean z = viewState instanceof yt01;
        transferErrorView.setVisibility(z ? 0 : 8);
        ea61Var.e.render(new jl01(17, viewState));
        int i = 7;
        if (!(viewState instanceof au01)) {
            if (viewState instanceof zt01) {
                this.adapter.g(((zt01) viewState).b());
                LoadableInput.render$default(loadableInput, false, new zp01(i), 1, null);
                return;
            } else if (z) {
                this.adapter.g(EmptyList.a);
                return;
            } else {
                w511.b();
                return;
            }
        }
        au01 au01Var = (au01) viewState;
        RecyclerView recyclerView = ea61Var.d;
        h itemAnimator = getItemAnimator();
        if (!au01Var.b()) {
            itemAnimator = null;
        }
        recyclerView.setItemAnimator(itemAnimator);
        this.inputWatcher.ignoreEvents(new zr01(2, ea61Var, au01Var));
        loadableInput.getEditText().requestFocus();
        try {
            this.adapter.h(au01Var.d(), new t601(i, au01Var, this));
        } catch (IllegalArgumentException unused) {
            x4c.g("Banks scrolling to top IllegalArgumentException", null, au01Var.d(), null, 10);
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
