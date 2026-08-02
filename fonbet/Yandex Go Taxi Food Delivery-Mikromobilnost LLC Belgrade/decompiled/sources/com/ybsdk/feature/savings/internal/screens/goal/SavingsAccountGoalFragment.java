package com.ybsdk.feature.savings.internal.screens.goal;

import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import com.ybsdk.core.formatter.FormatTextWatcher;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.utils.text.ThousandSeparatorTextWatcher;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.savings.internal.screens.goal.SavingsAccountGoalFragment;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.g;
import defpackage.bpu;
import defpackage.dcs;
import defpackage.k6m0;
import defpackage.l6m0;
import defpackage.l76;
import defpackage.lfx;
import defpackage.m6m0;
import defpackage.n6m0;
import defpackage.ohk0;
import defpackage.p6m0;
import defpackage.q6m0;
import defpackage.qas0;
import defpackage.r6m0;
import defpackage.t6m0;
import defpackage.tls;
import defpackage.w511;
import defpackage.y761;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/savings/internal/screens/goal/SavingsAccountGoalFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Ly761;", "Lt6m0;", "Lp6m0;", "Lk6m0;", "factoryOfViewModel", "<init>", "(Lk6m0;)V", "createViewModel", "()Lp6m0;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ly761;", "viewState", "Lzy11;", "render", "(Lt6m0;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Lk6m0;", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SavingsAccountGoalFragment extends BaseMvvmFragment<y761, t6m0, p6m0> {
    private final k6m0 factoryOfViewModel;

    public SavingsAccountGoalFragment(k6m0 k6m0Var) {
        super(null, 3, null, null, p6m0.class, 13, null);
        this.factoryOfViewModel = k6m0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$3$lambda$0(SavingsAccountGoalFragment savingsAccountGoalFragment, Editable editable) {
        savingsAccountGoalFragment.getViewModel().f0(editable.toString());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$3$lambda$1(y761 y761Var, SavingsAccountGoalFragment savingsAccountGoalFragment, View view, boolean z) {
        if (z) {
            y761Var.g.setInputConnection(y761Var.d.getEditText().onCreateInputConnection(new EditorInfo()));
        } else {
            savingsAccountGoalFragment.getViewModel().e0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$3$lambda$2(y761 y761Var, SavingsAccountGoalFragment savingsAccountGoalFragment, View view, boolean z) {
        if (z) {
            y761Var.g.setInputConnection(y761Var.b.getEditText().onCreateInputConnection(new EditorInfo()));
        } else {
            savingsAccountGoalFragment.getViewModel().d0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g render$lambda$4(t6m0 t6m0Var, g gVar) {
        return ((r6m0) t6m0Var).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g render$lambda$5(t6m0 t6m0Var, g gVar) {
        return ((r6m0) t6m0Var).a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof n6m0) {
            y761 y761Var = (y761) getBinding();
            n6m0 n6m0Var = (n6m0) sideEffect;
            if (n6m0Var instanceof l6m0) {
                y761Var.b.wiggle();
            } else if (n6m0Var instanceof m6m0) {
                y761Var.d.wiggle();
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
    public p6m0 getFactoryOfViewModel() {
        return ((q6m0) this.factoryOfViewModel).a((SavingsAccountGoalParams) dcs.a(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public y761 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        final y761 o = y761.o(inflater, container);
        YbButtonViewGroup ybButtonViewGroup = o.c;
        ybButtonViewGroup.setPrimaryButtonOnClickListener(new SavingsAccountGoalFragment$getViewBinding$1$1(getViewModel()));
        ybButtonViewGroup.setSecondaryButtonClickListener(new SavingsAccountGoalFragment$getViewBinding$1$2(getViewModel()));
        LoadableInput loadableInput = o.d;
        final int i = 0;
        loadableInput.setCanShowSoftInputOnFocus(false);
        new FormatTextWatcher(l76.k(6, false, bpu.a()), loadableInput.getEditText(), null, false, new SavingsAccountGoalFragment$getViewBinding$1$3(getViewModel()), 12, null);
        LoadableInput loadableInput2 = o.b;
        loadableInput2.setCanShowSoftInputOnFocus(false);
        loadableInput2.getEditText().addTextChangedListener(new ThousandSeparatorTextWatcher(new ohk0(27, this)));
        loadableInput.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: h6m0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                int i2 = i;
                SavingsAccountGoalFragment savingsAccountGoalFragment = this;
                y761 y761Var = o;
                switch (i2) {
                    case 0:
                        SavingsAccountGoalFragment.getViewBinding$lambda$3$lambda$1(y761Var, savingsAccountGoalFragment, view, z);
                        break;
                    default:
                        SavingsAccountGoalFragment.getViewBinding$lambda$3$lambda$2(y761Var, savingsAccountGoalFragment, view, z);
                        break;
                }
            }
        });
        final int i2 = 1;
        loadableInput2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: h6m0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                int i22 = i2;
                SavingsAccountGoalFragment savingsAccountGoalFragment = this;
                y761 y761Var = o;
                switch (i22) {
                    case 0:
                        SavingsAccountGoalFragment.getViewBinding$lambda$3$lambda$1(y761Var, savingsAccountGoalFragment, view, z);
                        break;
                    default:
                        SavingsAccountGoalFragment.getViewBinding$lambda$3$lambda$2(y761Var, savingsAccountGoalFragment, view, z);
                        break;
                }
            }
        });
        return o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(final t6m0 viewState) {
        if (viewState instanceof r6m0) {
            r6m0 r6m0Var = (r6m0) viewState;
            ((y761) getBinding()).f.setText(d.a(requireContext(), r6m0Var.e()));
            ((y761) getBinding()).e.setText(d.a(requireContext(), r6m0Var.d()));
            final int i = 0;
            final int i2 = 1;
            LoadableInput.render$default(((y761) getBinding()).d, false, new tls() { // from class: g6m0
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    g render$lambda$4;
                    g render$lambda$5;
                    int i3 = i;
                    t6m0 t6m0Var = viewState;
                    g gVar = (g) obj;
                    switch (i3) {
                        case 0:
                            render$lambda$4 = SavingsAccountGoalFragment.render$lambda$4(t6m0Var, gVar);
                            return render$lambda$4;
                        default:
                            render$lambda$5 = SavingsAccountGoalFragment.render$lambda$5(t6m0Var, gVar);
                            return render$lambda$5;
                    }
                }
            }, 1, null);
            LoadableInput.render$default(((y761) getBinding()).b, false, new tls() { // from class: g6m0
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    g render$lambda$4;
                    g render$lambda$5;
                    int i3 = i2;
                    t6m0 t6m0Var = viewState;
                    g gVar = (g) obj;
                    switch (i3) {
                        case 0:
                            render$lambda$4 = SavingsAccountGoalFragment.render$lambda$4(t6m0Var, gVar);
                            return render$lambda$4;
                        default:
                            render$lambda$5 = SavingsAccountGoalFragment.render$lambda$5(t6m0Var, gVar);
                            return render$lambda$5;
                    }
                }
            }, 1, null);
            ((y761) getBinding()).c.render(r6m0Var.b());
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
