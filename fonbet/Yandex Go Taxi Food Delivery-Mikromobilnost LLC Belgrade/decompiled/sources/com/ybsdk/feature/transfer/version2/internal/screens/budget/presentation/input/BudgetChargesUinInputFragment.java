package com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.input;

import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.ybsdk.core.transfer.utils.SimpleTextWatcher;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.g;
import defpackage.eal;
import defpackage.f73;
import defpackage.i061;
import defpackage.jp6;
import defpackage.kv5;
import defpackage.lfx;
import defpackage.lp6;
import defpackage.nks0;
import defpackage.r501;
import defpackage.r8j0;
import defpackage.rk6;
import defpackage.s8j0;
import defpackage.t8j0;
import defpackage.tf;
import defpackage.u8j0;
import defpackage.utb1;
import defpackage.w511;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00182\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001\u0019B\u0017\b\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00142\u0010\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/budget/presentation/input/BudgetChargesUinInputFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Li061;", "Lu8j0;", "Llp6;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/budget/presentation/input/BudgetChargesUinInputViewState;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/budget/presentation/input/a;", "Lyvf0;", "viewModelProvider", "<init>", "(Lyvf0;)V", "createViewModel", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/budget/presentation/input/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Li061;", "viewState", "Lzy11;", "render", "(Lu8j0;)V", "Lyvf0;", "Companion", "jp6", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BudgetChargesUinInputFragment extends BaseDivContextMvvmFragment<i061, u8j0, a> {
    private static final jp6 Companion = new jp6();

    @Deprecated
    public static final int MAX_INPUT_LENGTH = 50;
    private final yvf0 viewModelProvider;

    public BudgetChargesUinInputFragment(yvf0 yvf0Var) {
        super(null, 3, null, null, a.class, 13, null);
        this.viewModelProvider = yvf0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$5$lambda$2$lambda$1(BudgetChargesUinInputFragment budgetChargesUinInputFragment, Editable editable) {
        ((a) budgetChargesUinInputFragment.getViewModel()).e0(String.valueOf(editable));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getViewBinding$lambda$5$lambda$3(BudgetChargesUinInputFragment budgetChargesUinInputFragment, View view) {
        ((a) budgetChargesUinInputFragment.getViewModel()).b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$5$lambda$4(BudgetChargesUinInputFragment budgetChargesUinInputFragment) {
        ((a) budgetChargesUinInputFragment.getViewModel()).d0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g render$lambda$8$lambda$7$lambda$6(lp6 lp6Var, g gVar) {
        return lp6Var.b();
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return (a) this.viewModelProvider.get();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [uc5] */
    /* JADX WARN: Type inference failed for: r2v1, types: [uc5] */
    @Override // com.ybsdk.core.presentation.BindingFragment
    public i061 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        i061 o = i061.o(inflater, container);
        ErrorView errorView = o.d;
        errorView.setChangeVisibilityWithDelay(false);
        errorView.setPrimaryButtonOnClickListener(new BudgetChargesUinInputFragment$getViewBinding$1$1$1(getViewModel()));
        errorView.setSecondaryButtonClickListener(new BudgetChargesUinInputFragment$getViewBinding$1$1$2(getViewModel()));
        LoadableInput loadableInput = o.e;
        EditText editText = loadableInput.getEditText();
        editText.addTextChangedListener(new SimpleTextWatcher(new kv5(20, this)));
        editText.setFilters((InputFilter[]) f73.s(editText.getFilters(), new InputFilter.LengthFilter(50)));
        editText.setInputType(524288);
        o.b.setOnClickListener(new tf(27, this));
        loadableInput.setCanShowSoftInputOnFocus(false);
        utb1.d(o.f, loadableInput.getEditText());
        o.g.setOnRightImageClickListener(new rk6(3, this));
        return o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(u8j0 viewState) {
        i061 i061Var = (i061) getBinding();
        ErrorView errorView = i061Var.d;
        LoadableInput loadableInput = i061Var.e;
        errorView.render(null);
        DivSkeletonsView divSkeletonsView = i061Var.c;
        boolean z = viewState instanceof t8j0;
        divSkeletonsView.setVisibility(z ? 0 : 8);
        if (viewState instanceof s8j0) {
            i061Var.d.render(r501.a(((s8j0) viewState).d(), null, null, null, null, null, null, null, null, null, null, null, null, 65534));
            return;
        }
        if (z) {
            divSkeletonsView.render(new eal(nks0.b, false, null, 6));
            return;
        }
        if (!(viewState instanceof r8j0)) {
            w511.b();
            return;
        }
        lp6 lp6Var = (lp6) ((r8j0) viewState).e();
        LoadableInput.render$default(loadableInput, false, new kv5(19, lp6Var), 1, null);
        loadableInput.getEditText().requestFocus();
        i061Var.b.render(lp6Var.a());
        i061Var.g.render(lp6Var.c());
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
