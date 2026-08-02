package com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.presentation;

import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.transfer.utils.PhoneInputTextWatcher;
import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.presentation.b;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.g;
import defpackage.atw;
import defpackage.bj01;
import defpackage.dcs;
import defpackage.eja1;
import defpackage.et20;
import defpackage.f73;
import defpackage.fbz;
import defpackage.ft20;
import defpackage.g700;
import defpackage.gt20;
import defpackage.hde;
import defpackage.hua1;
import defpackage.i3y;
import defpackage.k200;
import defpackage.kt20;
import defpackage.lcb1;
import defpackage.lfx;
import defpackage.lt20;
import defpackage.me1;
import defpackage.mox;
import defpackage.nnb1;
import defpackage.nt20;
import defpackage.ot20;
import defpackage.p361;
import defpackage.p500;
import defpackage.ps20;
import defpackage.qa3;
import defpackage.qas0;
import defpackage.qt20;
import defpackage.rfb1;
import defpackage.rje;
import defpackage.rt20;
import defpackage.sc20;
import defpackage.tya0;
import defpackage.ug01;
import defpackage.vh91;
import defpackage.vi01;
import defpackage.w511;
import defpackage.wsy;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zmg;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 C2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001DB\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010!\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\fH\u0016¢\u0006\u0004\b)\u0010$J\u0017\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u0003H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010-R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00107R\"\u0010<\u001a\u0010\u0012\f\u0012\n ;*\u0004\u0018\u00010:0:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/mobilepayments/screens/selectcontact/presentation/MobilePaymentSelectContactFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lp361;", "Lrt20;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/mobilepayments/screens/selectcontact/presentation/a;", "Lkt20;", "viewModelFactory", "Lug01;", "preferencesProvider", "<init>", "(Lkt20;Lug01;)V", "Lqt20;", "Lzy11;", "setAdapterElements", "(Lqt20;)V", "", "byUser", "requestContactsPermission", "(Z)V", "createViewModel", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/mobilepayments/screens/selectcontact/presentation/a;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lp361;", "onResume", "()V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "onDestroyView", "viewState", "render", "(Lrt20;)V", "Lkt20;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/mobilepayments/screens/selectcontact/presentation/MobilePaymentSelectContactInputScreenParams;", "screenParams$delegate", "Li3y;", "getScreenParams", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/mobilepayments/screens/selectcontact/presentation/MobilePaymentSelectContactInputScreenParams;", "screenParams", "Ltya0;", "permissionManager$delegate", "getPermissionManager", "()Ltya0;", "permissionManager", "Lqa3;", "", "kotlin.jvm.PlatformType", "listAdapter", "Lqa3;", "Landroidx/recyclerview/widget/h;", "listItemAnimator", "Landroidx/recyclerview/widget/h;", "previousViewState", "Lrt20;", "Companion", "gt20", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MobilePaymentSelectContactFragment extends BaseMvvmFragment<p361, rt20, a> {
    public static final gt20 Companion = new gt20();
    private static final int MAX_INPUT_LENGTH = 100;
    public static final String RESULT_KEY = "SELECT_CONTACT_RESULT_KEY";
    private static final int ZERO_POSITION = 0;
    private final qa3 listAdapter;
    private final h listItemAnimator;

    /* renamed from: permissionManager$delegate, reason: from kotlin metadata */
    private final i3y permissionManager;
    private rt20 previousViewState;

    /* renamed from: screenParams$delegate, reason: from kotlin metadata */
    private final i3y screenParams;
    private final kt20 viewModelFactory;

    public MobilePaymentSelectContactFragment(kt20 kt20Var, ug01 ug01Var) {
        super(Boolean.FALSE, null, null, null, a.class, 14, null);
        this.viewModelFactory = kt20Var;
        this.screenParams = dcs.c(this);
        this.permissionManager = kotlin.a.b(LazyThreadSafetyMode.NONE, new g700(23, this, ug01Var));
        this.listAdapter = new qa3(wsy.a, vi01.b(new sc20(5, this)), rfb1.i());
        this.listItemAnimator = new h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void consumeSideEffect$lambda$9$lambda$8(EditText editText) {
        editText.clearFocus();
        lcb1.d(editText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tya0 getPermissionManager() {
        return (tya0) this.permissionManager.getValue();
    }

    private final MobilePaymentSelectContactInputScreenParams getScreenParams() {
        return (MobilePaymentSelectContactInputScreenParams) this.screenParams.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$6$lambda$3(MobilePaymentSelectContactFragment mobilePaymentSelectContactFragment, String str) {
        mobilePaymentSelectContactFragment.getViewModel().k0(String.valueOf(str));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$6$lambda$5(MobilePaymentSelectContactFragment mobilePaymentSelectContactFragment) {
        mobilePaymentSelectContactFragment.getViewModel().i0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 listAdapter$lambda$1(MobilePaymentSelectContactFragment mobilePaymentSelectContactFragment, bj01 bj01Var, int i) {
        mobilePaymentSelectContactFragment.getViewModel().m0(bj01Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$7(MobilePaymentSelectContactFragment mobilePaymentSelectContactFragment) {
        a viewModel = mobilePaymentSelectContactFragment.getViewModel();
        Context context = mobilePaymentSelectContactFragment.getContext();
        viewModel.h0(context != null ? rje.f(context) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tya0 permissionManager_delegate$lambda$0(MobilePaymentSelectContactFragment mobilePaymentSelectContactFragment, ug01 ug01Var) {
        return vh91.c(mobilePaymentSelectContactFragment, hde.a(mobilePaymentSelectContactFragment.requireContext()), ((me1) ug01Var).b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g render$lambda$16$lambda$11(g gVar) {
        return g.a(gVar, null, null, false, null, null, null, null, false, null, null, null, false, null, null, false, 0, false, 0, 0, null, null, null, 33552379);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g render$lambda$16$lambda$14$lambda$13$lambda$12(qt20 qt20Var, g gVar) {
        return g.a(gVar, qt20Var.b().b(), null, true, null, null, null, null, false, null, qt20Var.b().a(), null, false, null, null, false, 0, false, 0, 0, null, null, null, 33551866);
    }

    private final void requestContactsPermission(boolean byUser) {
        eja1.s(this).c(new MobilePaymentSelectContactFragment$requestContactsPermission$1(this, byUser, null));
    }

    private final void setAdapterElements(qt20 qt20Var) {
        this.listAdapter.h(qt20Var.c(), new p500(25, qt20Var, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setAdapterElements$lambda$18(qt20 qt20Var, MobilePaymentSelectContactFragment mobilePaymentSelectContactFragment) {
        if (qt20Var.a()) {
            mobilePaymentSelectContactFragment.safePost(new et20(mobilePaymentSelectContactFragment, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 setAdapterElements$lambda$18$lambda$17(MobilePaymentSelectContactFragment mobilePaymentSelectContactFragment) {
        RecyclerView.e layoutManager = ((p361) mobilePaymentSelectContactFragment.getBinding()).c.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.l1(0);
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect.equals(zmg.j)) {
            EditText editText = ((p361) getBinding()).b.getEditText();
            editText.post(new atw(editText, 3));
        } else if (sideEffect.equals(zmg.k)) {
            ((p361) getBinding()).b.getEditText().requestFocus();
        } else if (sideEffect instanceof lt20) {
            requestContactsPermission(((lt20) sideEffect).a());
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
        return ((nt20) this.viewModelFactory).a(getScreenParams());
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public p361 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        p361 p = p361.p(inflater, container);
        p.c.setAdapter(this.listAdapter);
        this.listAdapter.g(EmptyList.a);
        LoadableInput loadableInput = p.b;
        PhoneInputTextWatcher phoneInputTextWatcher = new PhoneInputTextWatcher(loadableInput, new k200(29, this));
        EditText editText = loadableInput.getEditText();
        editText.addTextChangedListener(phoneInputTextWatcher);
        editText.setFilters((InputFilter[]) f73.s(editText.getFilters(), new InputFilter.LengthFilter(100)));
        p.d.setOnCloseButtonClickListener(new et20(this, 0));
        return p;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hua1.g(this, RESULT_KEY, new b(new MobilePaymentSelectContactFragment$onCreate$1(getViewModel()), new MobilePaymentSelectContactFragment$onCreate$2(getViewModel())));
        tya0 permissionManager = getPermissionManager();
        mox f0 = getViewModel().f0();
        if (((com.ybsdk.core.permissions.a) getPermissionManager()).a()) {
            f0 = null;
        }
        ((com.ybsdk.core.permissions.a) permissionManager).d(f0);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.previousViewState = null;
        super.onDestroyView();
        getViewModel().j0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((p361) getBinding()).o().post(new fbz(27, this));
        getViewModel().l0();
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getViewModel().o0(((com.ybsdk.core.permissions.a) getPermissionManager()).a(), savedInstanceState != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(rt20 viewState) {
        p361 p361Var = (p361) getBinding();
        RecyclerView recyclerView = p361Var.c;
        LoadableInput loadableInput = p361Var.b;
        h hVar = this.listItemAnimator;
        if (!nnb1.a(this.previousViewState, viewState)) {
            hVar = null;
        }
        recyclerView.setItemAnimator(hVar);
        int i = 0;
        if (viewState instanceof ot20) {
            this.listAdapter.g(((ot20) viewState).a());
            LoadableInput.render$default(loadableInput, false, new ps20(4), 1, null);
        } else {
            if (!(viewState instanceof qt20)) {
                w511.b();
                return;
            }
            qt20 qt20Var = (qt20) viewState;
            LoadableInput.render$default(loadableInput, false, new ft20(i, qt20Var), 1, null);
            setAdapterElements(qt20Var);
            if (this.previousViewState instanceof ot20) {
                getViewModel().g0();
            }
            getViewModel().l0();
        }
        this.previousViewState = viewState;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
