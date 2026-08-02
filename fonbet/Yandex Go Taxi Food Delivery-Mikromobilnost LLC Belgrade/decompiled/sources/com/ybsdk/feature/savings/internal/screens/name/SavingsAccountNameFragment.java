package com.ybsdk.feature.savings.internal.screens.name;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountEditNameSaveResultError;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountEditNameSaveResultResult;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.g;
import defpackage.a861;
import defpackage.dcs;
import defpackage.eaj0;
import defpackage.h7m0;
import defpackage.i7m0;
import defpackage.k7m0;
import defpackage.l7m0;
import defpackage.lfx;
import defpackage.m7m0;
import defpackage.n7m0;
import defpackage.ohk0;
import defpackage.pz40;
import defpackage.qas0;
import defpackage.w511;
import defpackage.y8f;
import defpackage.yr31;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/savings/internal/screens/name/SavingsAccountNameFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "La861;", "Ln7m0;", "Lk7m0;", "Li7m0;", "factoryOfViewModel", "<init>", "(Li7m0;)V", "createViewModel", "()Lk7m0;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La861;", "Lzy11;", "onStart", "()V", "viewState", "render", "(Ln7m0;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Li7m0;", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SavingsAccountNameFragment extends BaseMvvmFragment<a861, n7m0, k7m0> {
    private final i7m0 factoryOfViewModel;

    public SavingsAccountNameFragment(i7m0 i7m0Var) {
        super(null, null, null, null, k7m0.class, 15, null);
        this.factoryOfViewModel = i7m0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$2$lambda$0(SavingsAccountNameFragment savingsAccountNameFragment, View view) {
        savingsAccountNameFragment.getViewModel().c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g render$lambda$3(n7m0 n7m0Var, g gVar) {
        return ((m7m0) n7m0Var).b();
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        super.consumeSideEffect(sideEffect);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public k7m0 getFactoryOfViewModel() {
        return ((l7m0) this.factoryOfViewModel).a((SavingsAccountNameParams) dcs.a(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public a861 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        a861 o = a861.o(inflater, container);
        o.b.setOnClickListener(new eaj0(5, this));
        o.c.getEditText().addTextChangedListener(new TextWatcher() { // from class: com.ybsdk.feature.savings.internal.screens.name.SavingsAccountNameFragment$getViewBinding$lambda$2$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                k7m0 viewModel;
                r0 r0Var;
                Object value;
                h7m0 h7m0Var;
                SavingsAccountNameValidationError savingsAccountNameValidationError;
                viewModel = SavingsAccountNameFragment.this.getViewModel();
                String obj = s != null ? s.toString() : null;
                if (obj == null) {
                    obj = "";
                }
                String str = obj;
                viewModel.getClass();
                pz40 Y = viewModel.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                    h7m0Var = (h7m0) value;
                    boolean b0 = viewModel.b0(str);
                    if (b0) {
                        viewModel.D.f0.I(SavingsEvents$SavingsAccountEditNameSaveResultResult.ERROR, SavingsEvents$SavingsAccountEditNameSaveResultError.TOO_LONG, str, null);
                        savingsAccountNameValidationError = SavingsAccountNameValidationError.TOO_LONG;
                    } else {
                        if (b0) {
                            w511.b();
                            return;
                        }
                        savingsAccountNameValidationError = null;
                    }
                } while (!r0Var.k(value, h7m0.a(h7m0Var, str, null, savingsAccountNameValidationError, false, 43)));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
        return o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ((a861) getBinding()).c.requestFocus();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(n7m0 viewState) {
        if (!(viewState instanceof m7m0)) {
            w511.b();
            return;
        }
        m7m0 m7m0Var = (m7m0) viewState;
        ((a861) getBinding()).e.setText(d.a(requireContext(), m7m0Var.d()));
        ((a861) getBinding()).d.setText(d.a(requireContext(), m7m0Var.c()));
        LoadableInput.render$default(((a861) getBinding()).c, false, new ohk0(29, viewState), 1, null);
        ((a861) getBinding()).b.render(m7m0Var.a());
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
