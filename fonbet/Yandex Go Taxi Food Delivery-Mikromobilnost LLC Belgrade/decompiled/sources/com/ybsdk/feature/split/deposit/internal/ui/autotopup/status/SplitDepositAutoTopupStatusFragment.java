package com.ybsdk.feature.split.deposit.internal.ui.autotopup.status;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.feature.split.deposit.internal.ui.b;
import defpackage.ce4;
import defpackage.dcs;
import defpackage.e3o0;
import defpackage.f24;
import defpackage.g24;
import defpackage.gas0;
import defpackage.h24;
import defpackage.hua1;
import defpackage.jds;
import defpackage.lfx;
import defpackage.pey;
import defpackage.qas0;
import defpackage.qst0;
import defpackage.t861;
import defpackage.tst0;
import defpackage.wst0;
import defpackage.xst0;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0011\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\fJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010$\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R$\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00101\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R$\u00104\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010,\u001a\u0004\b5\u0010.\"\u0004\b6\u00100¨\u00067"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/ui/autotopup/status/SplitDepositAutoTopupStatusFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lt861;", "Lxst0;", "Lcom/ybsdk/feature/split/deposit/internal/ui/autotopup/status/a;", "Lce4;", "Ltst0;", "viewModelFactory", "<init>", "(Ltst0;)V", "Lzy11;", "setUserReturnedObservers", "()V", "removeObservers", "Lcom/ybsdk/feature/split/deposit/internal/ui/b;", ClidProvider.STATE, "renderOperationProgress", "(Lcom/ybsdk/feature/split/deposit/internal/ui/b;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "createViewModel", "()Lcom/ybsdk/feature/split/deposit/internal/ui/autotopup/status/a;", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "onDestroy", "viewState", "render", "(Lxst0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lt861;", "", "onBackPressed", "()Z", "Ltst0;", "Landroidx/lifecycle/q;", "activityOnStopObserver", "Landroidx/lifecycle/q;", "getActivityOnStopObserver", "()Landroidx/lifecycle/q;", "setActivityOnStopObserver", "(Landroidx/lifecycle/q;)V", "fragmentViewOnStopObserver", "getFragmentViewOnStopObserver", "setFragmentViewOnStopObserver", "fragmentViewOnStartObserver", "getFragmentViewOnStartObserver", "setFragmentViewOnStartObserver", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SplitDepositAutoTopupStatusFragment extends BaseDivContextMvvmFragment<t861, xst0, a> implements ce4 {
    private q activityOnStopObserver;
    private q fragmentViewOnStartObserver;
    private q fragmentViewOnStopObserver;
    private final tst0 viewModelFactory;

    public SplitDepositAutoTopupStatusFragment(tst0 tst0Var) {
        super(Boolean.FALSE, null, null, null, a.class, 14, null);
        this.viewModelFactory = tst0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void consumeSideEffect$lambda$1(SplitDepositAutoTopupStatusFragment splitDepositAutoTopupStatusFragment, pey peyVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_STOP) {
            splitDepositAutoTopupStatusFragment.setUserReturnedObservers();
            q qVar = splitDepositAutoTopupStatusFragment.fragmentViewOnStopObserver;
            if (qVar != null) {
                splitDepositAutoTopupStatusFragment.getLifecycle().d(qVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 consumeSideEffect$lambda$4(SplitDepositAutoTopupStatusFragment splitDepositAutoTopupStatusFragment, String str, Bundle bundle) {
        ((a) splitDepositAutoTopupStatusFragment.getViewModel()).h0();
        return zy11.a;
    }

    private final void removeObservers() {
        q qVar = this.fragmentViewOnStopObserver;
        if (qVar != null) {
            getLifecycle().d(qVar);
        }
        q qVar2 = this.fragmentViewOnStartObserver;
        if (qVar2 != null) {
            getLifecycle().d(qVar2);
        }
        q qVar3 = this.activityOnStopObserver;
        if (qVar3 != null) {
            requireActivity().getLifecycle().d(qVar3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 render$lambda$16$lambda$15(SplitDepositAutoTopupStatusFragment splitDepositAutoTopupStatusFragment) {
        ((a) splitDepositAutoTopupStatusFragment.getViewModel()).f0();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderOperationProgress(b state) {
        ((t861) getBinding()).b.render(state);
    }

    private final void setUserReturnedObservers() {
        qst0 qst0Var = new qst0(this, 1);
        this.activityOnStopObserver = qst0Var;
        this.fragmentViewOnStartObserver = new qst0(this, 2);
        requireActivity().getLifecycle().a(qst0Var);
        q qVar = this.fragmentViewOnStartObserver;
        if (qVar != null) {
            getLifecycle().a(qVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setUserReturnedObservers$lambda$6(SplitDepositAutoTopupStatusFragment splitDepositAutoTopupStatusFragment, pey peyVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_STOP) {
            ((a) splitDepositAutoTopupStatusFragment.getViewModel()).b0();
            q qVar = splitDepositAutoTopupStatusFragment.activityOnStopObserver;
            if (qVar != null) {
                splitDepositAutoTopupStatusFragment.requireActivity().getLifecycle().d(qVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setUserReturnedObservers$lambda$9(SplitDepositAutoTopupStatusFragment splitDepositAutoTopupStatusFragment, pey peyVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            ((a) splitDepositAutoTopupStatusFragment.getViewModel()).c0();
            q qVar = splitDepositAutoTopupStatusFragment.activityOnStopObserver;
            if (qVar != null) {
                splitDepositAutoTopupStatusFragment.requireActivity().getLifecycle().d(qVar);
            }
            q qVar2 = splitDepositAutoTopupStatusFragment.fragmentViewOnStartObserver;
            if (qVar2 != null) {
                splitDepositAutoTopupStatusFragment.getLifecycle().d(qVar2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect.equals(h24.a)) {
            removeObservers();
            qst0 qst0Var = new qst0(this, 0);
            this.fragmentViewOnStopObserver = qst0Var;
            getLifecycle().a(qst0Var);
            if (((a) getViewModel()).i0()) {
                return;
            }
            removeObservers();
            return;
        }
        if (sideEffect instanceof f24) {
            Bundle bundle = new Bundle();
            bundle.putString(jds.a(), ((f24) sideEffect).a());
            hua1.f(bundle, this, "auto_topup_enable_success");
        } else if (sideEffect instanceof g24) {
            hua1.g(this, "navigating_away_after_method_selection_auto_topup", new e3o0(29, this));
            ((a) getViewModel()).j0(((g24) sideEffect).a());
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((wst0) this.viewModelFactory).a((SplitDepositAutoTopupStatusScreenParams) dcs.a(this));
    }

    public final q getActivityOnStopObserver() {
        return this.activityOnStopObserver;
    }

    public final q getFragmentViewOnStartObserver() {
        return this.fragmentViewOnStartObserver;
    }

    public final q getFragmentViewOnStopObserver() {
        return this.fragmentViewOnStopObserver;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [uc5] */
    @Override // com.ybsdk.core.presentation.BindingFragment
    public t861 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        t861 o = t861.o(inflater, container);
        o.b.setActionHandler(new SplitDepositAutoTopupStatusFragment$getViewBinding$1$1(getViewModel()));
        return o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ce4
    public boolean onBackPressed() {
        ((a) getViewModel()).e0();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        hua1.b(this, "navigating_away_after_method_selection_payment");
        hua1.b(this, "navigating_away_after_method_selection_auto_topup");
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        removeObservers();
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(xst0 viewState) {
        t861 t861Var = (t861) getBinding();
        renderOperationProgress(viewState.b());
        t861Var.c.setOnCloseButtonClickListener(new gas0(23, this));
        t861Var.b.updateLocalDivkitVariables(viewState.a());
    }

    public final void setActivityOnStopObserver(q qVar) {
        this.activityOnStopObserver = qVar;
    }

    public final void setFragmentViewOnStartObserver(q qVar) {
        this.fragmentViewOnStartObserver = qVar;
    }

    public final void setFragmentViewOnStopObserver(q qVar) {
        this.fragmentViewOnStopObserver = qVar;
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
