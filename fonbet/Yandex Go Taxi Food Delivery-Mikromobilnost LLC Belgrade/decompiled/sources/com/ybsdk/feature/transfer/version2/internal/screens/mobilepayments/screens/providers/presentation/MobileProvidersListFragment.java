package com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.presentation;

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
import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.presentation.MobileProvidersSelectionResult;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.g;
import defpackage.au20;
import defpackage.bj01;
import defpackage.bu20;
import defpackage.dcs;
import defpackage.f73;
import defpackage.ft20;
import defpackage.g700;
import defpackage.hu20;
import defpackage.i3y;
import defpackage.iu20;
import defpackage.ju20;
import defpackage.ku20;
import defpackage.lcb1;
import defpackage.lfx;
import defpackage.lrp0;
import defpackage.lu20;
import defpackage.mu20;
import defpackage.nnb1;
import defpackage.nu20;
import defpackage.p500;
import defpackage.ps20;
import defpackage.q361;
import defpackage.qa3;
import defpackage.qas0;
import defpackage.rfb1;
import defpackage.sc20;
import defpackage.vi01;
import defpackage.w511;
import defpackage.wsy;
import defpackage.x4c;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zmg;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 72\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00018B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\"\u0010'\u001a\u0010\u0012\f\u0012\n &*\u0004\u0018\u00010%0%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00069"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/mobilepayments/screens/providers/presentation/MobileProvidersListFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lq361;", "Lnu20;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/mobilepayments/screens/providers/presentation/a;", "Lhu20;", "viewModelFactory", "<init>", "(Lhu20;)V", "Lmu20;", "Lzy11;", "setAdapterElements", "(Lmu20;)V", "Lcom/ybsdk/feature/transfer/version2/internal/screens/mobilepayments/screens/providers/presentation/MobileProvidersSelectionResult;", TarifficatorScenarioActivity.RESULT_KEY, "finishWithResult", "(Lcom/ybsdk/feature/transfer/version2/internal/screens/mobilepayments/screens/providers/presentation/MobileProvidersSelectionResult;)V", "createViewModel", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/mobilepayments/screens/providers/presentation/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lq361;", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "onResume", "()V", "onDestroyView", "viewState", "render", "(Lnu20;)V", "Lhu20;", "Lqa3;", "", "kotlin.jvm.PlatformType", "listAdapter", "Lqa3;", "Landroidx/recyclerview/widget/h;", "itemListAnimator", "Landroidx/recyclerview/widget/h;", "Lcom/ybsdk/core/transfer/utils/SimpleTextWatcher;", "inputWatcher", "Lcom/ybsdk/core/transfer/utils/SimpleTextWatcher;", "previousViewState", "Lnu20;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/mobilepayments/screens/providers/presentation/MobileProvidersListParams;", "screensParams$delegate", "Li3y;", "getScreensParams", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/mobilepayments/screens/providers/presentation/MobileProvidersListParams;", "screensParams", "Companion", "bu20", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MobileProvidersListFragment extends BaseMvvmFragment<q361, nu20, a> {
    public static final bu20 Companion = new bu20();
    public static final String DEFAULT_MOBILE_PROVIDERS_RESULT_KEY = "DEFAULT_MOBILE_PROVIDERS_RESULT_KEY";
    private static final int MAX_INPUT_LENGTH = 100;
    private static final int ZERO_POSITION = 0;
    private final SimpleTextWatcher inputWatcher;
    private final h itemListAnimator;
    private final qa3 listAdapter;
    private nu20 previousViewState;

    /* renamed from: screensParams$delegate, reason: from kotlin metadata */
    private final i3y screensParams;
    private final hu20 viewModelFactory;

    public MobileProvidersListFragment(hu20 hu20Var) {
        super(Boolean.TRUE, null, null, null, a.class, 14, null);
        this.viewModelFactory = hu20Var;
        this.listAdapter = new qa3(wsy.a, vi01.b(new sc20(6, this)), rfb1.i());
        this.itemListAnimator = new h();
        this.inputWatcher = new SimpleTextWatcher(new ft20(2, this));
        this.screensParams = dcs.c(this);
    }

    private final void finishWithResult(MobileProvidersSelectionResult result) {
        Object failure;
        try {
            getParentFragmentManager().l0(result.toBundle(), getScreensParams().getResultKey());
            getRouter().e();
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            x4c.g("Failed to send RESULT_KEY result", a, null, Collections.singletonList(lrp0.r), 4);
        }
    }

    private final MobileProvidersListParams getScreensParams() {
        return (MobileProvidersListParams) this.screensParams.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$6$lambda$5$lambda$3(MobileProvidersListFragment mobileProvidersListFragment) {
        mobileProvidersListFragment.getViewModel().d0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$6$lambda$5$lambda$4(MobileProvidersListFragment mobileProvidersListFragment) {
        mobileProvidersListFragment.getViewModel().e0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 inputWatcher$lambda$1(MobileProvidersListFragment mobileProvidersListFragment, Editable editable) {
        mobileProvidersListFragment.getViewModel().f0(String.valueOf(editable));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 listAdapter$lambda$0(MobileProvidersListFragment mobileProvidersListFragment, bj01 bj01Var, int i) {
        mobileProvidersListFragment.getViewModel().c0(bj01Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$13$lambda$11$lambda$10(q361 q361Var, mu20 mu20Var) {
        LoadableInput.render$default(q361Var.c, false, new ft20(1, mu20Var), 1, null);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g render$lambda$13$lambda$11$lambda$10$lambda$9(mu20 mu20Var, g gVar) {
        return g.a(gVar, mu20Var.b(), null, true, null, null, null, null, false, null, null, null, false, null, null, false, 0, false, 0, 0, null, null, null, 16775162);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g render$lambda$13$lambda$8(g gVar) {
        return g.a(gVar, null, null, false, null, null, null, null, false, null, null, null, false, null, null, false, 0, false, 0, 0, null, null, null, 33552379);
    }

    private final void setAdapterElements(mu20 mu20Var) {
        this.listAdapter.h(mu20Var.c(), new p500(26, mu20Var, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setAdapterElements$lambda$15(mu20 mu20Var, MobileProvidersListFragment mobileProvidersListFragment) {
        if (mu20Var.a()) {
            mobileProvidersListFragment.safePost(new au20(mobileProvidersListFragment, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 setAdapterElements$lambda$15$lambda$14(MobileProvidersListFragment mobileProvidersListFragment) {
        RecyclerView.e layoutManager = ((q361) mobileProvidersListFragment.getBinding()).d.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.l1(0);
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect.equals(zmg.m)) {
            lcb1.d(((q361) getBinding()).c.getEditText());
            ((q361) getBinding()).c.getEditText().clearFocus();
        } else if (sideEffect instanceof iu20) {
            iu20 iu20Var = (iu20) sideEffect;
            finishWithResult(new MobileProvidersSelectionResult.Success(iu20Var.b(), iu20Var.a()));
        } else if (sideEffect.equals(zmg.n)) {
            ((q361) getBinding()).c.getEditText().requestFocus();
        } else if (sideEffect.equals(zmg.l)) {
            finishWithResult(MobileProvidersSelectionResult.Close.INSTANCE);
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((ju20) this.viewModelFactory).a(getScreensParams());
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public q361 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        q361 o = q361.o(inflater, container);
        EditText editText = o.c.getEditText();
        editText.addTextChangedListener(this.inputWatcher);
        editText.setFilters((InputFilter[]) f73.s(editText.getFilters(), new InputFilter.LengthFilter(100)));
        ErrorView errorView = o.b;
        errorView.setChangeVisibilityWithDelay(false);
        errorView.setPrimaryButtonOnClickListener(new au20(this, 1));
        errorView.setSecondaryButtonClickListener(new au20(this, 2));
        o.e.setOnCloseButtonClickListener(new MobileProvidersListFragment$getViewBinding$1$3(getViewModel()));
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
    public void render(nu20 viewState) {
        q361 q361Var = (q361) getBinding();
        setBackButtonVisible(getScreensParams().getBackVisible());
        RecyclerView recyclerView = q361Var.d;
        LoadableInput loadableInput = q361Var.c;
        ErrorView errorView = q361Var.b;
        h hVar = this.itemListAnimator;
        if (!nnb1.a(this.previousViewState, viewState)) {
            hVar = null;
        }
        recyclerView.setItemAnimator(hVar);
        errorView.render(null);
        boolean z = viewState instanceof lu20;
        q361Var.f.setVisibility(z ? 0 : 8);
        if (viewState instanceof ku20) {
            errorView.render(((ku20) viewState).a());
        } else if (z) {
            this.listAdapter.g(((lu20) viewState).a());
            LoadableInput.render$default(loadableInput, false, new ps20(5), 1, null);
        } else {
            if (!(viewState instanceof mu20)) {
                w511.b();
                return;
            }
            mu20 mu20Var = (mu20) viewState;
            q361Var.e.render(mu20Var.d());
            this.inputWatcher.ignoreEvents(new g700(24, q361Var, mu20Var));
            loadableInput.getEditText().requestFocus();
            setAdapterElements(mu20Var);
        }
        this.previousViewState = viewState;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
