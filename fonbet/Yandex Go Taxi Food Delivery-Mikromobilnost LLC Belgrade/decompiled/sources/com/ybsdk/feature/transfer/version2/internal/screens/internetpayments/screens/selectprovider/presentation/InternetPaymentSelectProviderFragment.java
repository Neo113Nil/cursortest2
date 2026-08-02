package com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.presentation;

import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.transfer.utils.SimpleTextWatcher;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.presentation.InternetPaymentSelectProviderResult;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.g;
import defpackage.atw;
import defpackage.auw;
import defpackage.bj01;
import defpackage.bns;
import defpackage.buw;
import defpackage.dcs;
import defpackage.f73;
import defpackage.gau;
import defpackage.i3y;
import defpackage.lcb1;
import defpackage.lfx;
import defpackage.lrp0;
import defpackage.ltw;
import defpackage.mgu;
import defpackage.mtw;
import defpackage.nnb1;
import defpackage.ntw;
import defpackage.qa3;
import defpackage.qas0;
import defpackage.r7v;
import defpackage.rfb1;
import defpackage.s161;
import defpackage.vi01;
import defpackage.vtw;
import defpackage.w511;
import defpackage.wsy;
import defpackage.wtw;
import defpackage.x4c;
import defpackage.xtw;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.ytw;
import defpackage.zmg;
import defpackage.ztw;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 42\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00015B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\"\u0010-\u001a\u0010\u0012\f\u0012\n ,*\u0004\u0018\u00010+0+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/internetpayments/screens/selectprovider/presentation/InternetPaymentSelectProviderFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Ls161;", "Lbuw;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/internetpayments/screens/selectprovider/presentation/b;", "Lvtw;", "viewModelFactory", "<init>", "(Lvtw;)V", "Lauw;", "Lzy11;", "setAdapterElements", "(Lauw;)V", "Lcom/ybsdk/feature/transfer/version2/internal/screens/internetpayments/screens/selectprovider/presentation/InternetPaymentSelectProviderResult;", TarifficatorScenarioActivity.RESULT_KEY, "finishWithResult", "(Lcom/ybsdk/feature/transfer/version2/internal/screens/internetpayments/screens/selectprovider/presentation/InternetPaymentSelectProviderResult;)V", "createViewModel", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/internetpayments/screens/selectprovider/presentation/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ls161;", "viewState", "render", "(Lbuw;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "onResume", "()V", "onDestroyView", "Lvtw;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/internetpayments/screens/selectprovider/presentation/InternetPaymentSelectProviderScreenParams;", "screenParams$delegate", "Li3y;", "getScreenParams", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/internetpayments/screens/selectprovider/presentation/InternetPaymentSelectProviderScreenParams;", "screenParams", "Lqa3;", "", "kotlin.jvm.PlatformType", "listAdapter", "Lqa3;", "Landroidx/recyclerview/widget/h;", "itemListAnimator", "Landroidx/recyclerview/widget/h;", "previousViewState", "Lbuw;", "Companion", "ntw", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InternetPaymentSelectProviderFragment extends BaseMvvmFragment<s161, buw, b> {
    public static final ntw Companion = new ntw();
    private static final int MAX_INPUT_LENGTH = 100;
    public static final String RESULT_KEY = "InternetPaymentSelectProvider";
    private static final int ZERO_POSITION = 0;
    private final h itemListAnimator;
    private final qa3 listAdapter;
    private buw previousViewState;

    /* renamed from: screenParams$delegate, reason: from kotlin metadata */
    private final i3y screenParams;
    private final vtw viewModelFactory;

    public InternetPaymentSelectProviderFragment(vtw vtwVar) {
        super(Boolean.FALSE, null, null, null, b.class, 14, null);
        this.viewModelFactory = vtwVar;
        this.screenParams = dcs.c(this);
        this.listAdapter = new qa3(wsy.a, vi01.b(new bns(17, this)), rfb1.i());
        this.itemListAnimator = new h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void consumeSideEffect$lambda$14$lambda$13(EditText editText) {
        lcb1.d(editText);
        editText.clearFocus();
    }

    private final void finishWithResult(InternetPaymentSelectProviderResult result) {
        Object failure;
        try {
            getParentFragmentManager().l0(result.toBundle(), RESULT_KEY);
            getRouter().e();
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            x4c.g("Failed to send InternetPaymentSelectProvider result", a, null, Collections.singletonList(lrp0.n), 4);
        }
    }

    private final InternetPaymentSelectProviderScreenParams getScreenParams() {
        return (InternetPaymentSelectProviderScreenParams) this.screenParams.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$6$lambda$2$lambda$1(InternetPaymentSelectProviderFragment internetPaymentSelectProviderFragment, s161 s161Var, Editable editable) {
        internetPaymentSelectProviderFragment.getViewModel().f0(String.valueOf(editable));
        s161Var.c.getEditText().requestFocus();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$6$lambda$5$lambda$3(InternetPaymentSelectProviderFragment internetPaymentSelectProviderFragment) {
        internetPaymentSelectProviderFragment.getViewModel().d0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$6$lambda$5$lambda$4(InternetPaymentSelectProviderFragment internetPaymentSelectProviderFragment) {
        internetPaymentSelectProviderFragment.getViewModel().e0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 listAdapter$lambda$0(InternetPaymentSelectProviderFragment internetPaymentSelectProviderFragment, bj01 bj01Var, int i) {
        internetPaymentSelectProviderFragment.getViewModel().c0(bj01Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g render$lambda$12$lambda$10$lambda$9(auw auwVar, g gVar) {
        return g.a(gVar, auwVar.b(), null, true, null, null, null, null, false, null, null, null, false, null, null, false, 0, false, 0, 0, null, null, null, 16775162);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g render$lambda$12$lambda$8(g gVar) {
        return g.a(gVar, null, null, false, null, null, null, null, false, null, null, null, false, null, null, false, 0, false, 0, 0, null, null, null, 33552379);
    }

    private final void setAdapterElements(auw auwVar) {
        this.listAdapter.h(auwVar.c(), new r7v(10, auwVar, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setAdapterElements$lambda$16(auw auwVar, InternetPaymentSelectProviderFragment internetPaymentSelectProviderFragment) {
        if (auwVar.a()) {
            internetPaymentSelectProviderFragment.safePost(new ltw(internetPaymentSelectProviderFragment, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 setAdapterElements$lambda$16$lambda$15(InternetPaymentSelectProviderFragment internetPaymentSelectProviderFragment) {
        RecyclerView.e layoutManager = ((s161) internetPaymentSelectProviderFragment.getBinding()).d.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.l1(0);
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect.equals(zmg.d)) {
            EditText editText = ((s161) getBinding()).c.getEditText();
            editText.post(new atw(editText, 2));
        } else if (sideEffect.equals(zmg.e)) {
            ((s161) getBinding()).c.getEditText().requestFocus();
        } else if (sideEffect instanceof wtw) {
            finishWithResult(new InternetPaymentSelectProviderResult.Success(((wtw) sideEffect).a()));
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
        return ((xtw) this.viewModelFactory).a(getScreenParams());
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public s161 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        s161 o = s161.o(inflater, container);
        EditText editText = o.c.getEditText();
        editText.addTextChangedListener(new SimpleTextWatcher(new mgu(18, this, o)));
        editText.setFilters((InputFilter[]) f73.s(editText.getFilters(), new InputFilter.LengthFilter(100)));
        ErrorView errorView = o.b;
        errorView.setChangeVisibilityWithDelay(false);
        errorView.setPrimaryButtonOnClickListener(new ltw(this, 0));
        errorView.setSecondaryButtonClickListener(new ltw(this, 1));
        o.e.setOnCloseButtonClickListener(new InternetPaymentSelectProviderFragment$getViewBinding$1$3(getViewModel()));
        this.listAdapter.g(EmptyList.a);
        o.d.setAdapter(this.listAdapter);
        return o;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.previousViewState = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getViewModel().b0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(buw viewState) {
        s161 s161Var = (s161) getBinding();
        RecyclerView recyclerView = s161Var.d;
        ErrorView errorView = s161Var.b;
        LoadableInput loadableInput = s161Var.c;
        h hVar = this.itemListAnimator;
        if (!nnb1.a(this.previousViewState, viewState)) {
            hVar = null;
        }
        recyclerView.setItemAnimator(hVar);
        errorView.render(null);
        boolean z = viewState instanceof ztw;
        int i = 0;
        s161Var.f.setVisibility(z ? 0 : 8);
        if (viewState instanceof ytw) {
            errorView.render(((ytw) viewState).a());
        } else if (z) {
            this.listAdapter.g(((ztw) viewState).a());
            LoadableInput.render$default(loadableInput, false, new mtw(i), 1, null);
        } else {
            if (!(viewState instanceof auw)) {
                w511.b();
                return;
            }
            auw auwVar = (auw) viewState;
            s161Var.e.render(auwVar.d());
            LoadableInput.render$default(loadableInput, false, new gau(29, auwVar), 1, null);
            loadableInput.getEditText().requestFocus();
            setAdapterElements(auwVar);
        }
        this.previousViewState = viewState;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
