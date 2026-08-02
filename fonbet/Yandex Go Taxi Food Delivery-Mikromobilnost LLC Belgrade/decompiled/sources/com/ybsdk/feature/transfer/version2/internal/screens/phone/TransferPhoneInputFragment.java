package com.ybsdk.feature.transfer.version2.internal.screens.phone;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.core.transfer.utils.InternationalPhoneInputTextWatcher;
import com.ybsdk.core.transfer.utils.PhoneInputTextWatcher;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.partnerselection.api.SelectedPartner;
import com.ybsdk.feature.transfer.version2.api.CrossBorderScenario;
import com.ybsdk.feature.transfer.version2.api.PhoneInputSource;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneInputFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneSelectionResult;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.FullscreenStatusView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.g;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.afb0;
import defpackage.atw;
import defpackage.bfb0;
import defpackage.bj01;
import defpackage.bn01;
import defpackage.but0;
import defpackage.ce4;
import defpackage.cfb0;
import defpackage.dcs;
import defpackage.dn01;
import defpackage.eja1;
import defpackage.en01;
import defpackage.f73;
import defpackage.fn01;
import defpackage.g8e;
import defpackage.gao;
import defpackage.gf91;
import defpackage.gn01;
import defpackage.hde;
import defpackage.hua1;
import defpackage.i3y;
import defpackage.i5y0;
import defpackage.j0t0;
import defpackage.jl01;
import defpackage.jl40;
import defpackage.k961;
import defpackage.kux0;
import defpackage.lcb1;
import defpackage.lfx;
import defpackage.me1;
import defpackage.od8;
import defpackage.on01;
import defpackage.qa3;
import defpackage.qas0;
import defpackage.rfb1;
import defpackage.t601;
import defpackage.tc01;
import defpackage.tls;
import defpackage.tya0;
import defpackage.ug01;
import defpackage.unr0;
import defpackage.vh91;
import defpackage.vi01;
import defpackage.w511;
import defpackage.web0;
import defpackage.wsy;
import defpackage.x4c;
import defpackage.xeb0;
import defpackage.y8f;
import defpackage.yeb0;
import defpackage.yr31;
import defpackage.zeb0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000©\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0001J\b\u0000\u0018\u0000 U2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0002VWB\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010\u001eJ\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u0003H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010.\u001a\u00020\u00102\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J#\u00104\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u0001002\b\u00103\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00102\u0006\u00106\u001a\u00020$H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0010H\u0002¢\u0006\u0004\b9\u0010\u001eJ\u0017\u0010<\u001a\u00020\u00102\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010>R\u001b\u0010D\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\"\u0010H\u001a\u0010\u0012\f\u0012\n G*\u0004\u0018\u00010F0F0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u001b\u0010T\u001a\u00020P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010A\u001a\u0004\bR\u0010S¨\u0006X"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/TransferPhoneInputFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lk961;", "Lon01;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/c;", "Lce4;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/b;", "viewModelFactory", "Lug01;", "preferencesProvider", "<init>", "(Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/b;Lug01;)V", "createViewModel", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/c;", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lk961;", "onResume", "()V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "onDestroyView", "", "onBackPressed", "()Z", "viewState", "render", "(Lon01;)V", "Lcom/ybsdk/feature/partnerselection/api/SelectedPartner;", "partner", "Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;", "inputSource", "navigateToNameReceiverSuppressingBack", "(Lcom/ybsdk/feature/partnerselection/api/SelectedPartner;Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;)V", "", Constants.KEY_MESSAGE, "", "error", "showErrorSnackbar", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "byUser", "requestContactsPermission", "(Z)V", "scrollToTop", "Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/TransferPhoneSelectionResult;", TarifficatorScenarioActivity.RESULT_KEY, "finishWithResult", "(Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/TransferPhoneSelectionResult;)V", "Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/b;", "Ltya0;", "permissionManager$delegate", "Li3y;", "getPermissionManager", "()Ltya0;", "permissionManager", "Lqa3;", "", "kotlin.jvm.PlatformType", "adapter", "Lqa3;", "fn01", "backPressSuppressor", "Lfn01;", "Landroidx/fragment/app/FragmentManager$a;", "nameReceiverResumedCallback", "Landroidx/fragment/app/FragmentManager$a;", "Landroidx/recyclerview/widget/h;", "itemAnimator$delegate", "getItemAnimator", "()Landroidx/recyclerview/widget/h;", "itemAnimator", "Companion", "dn01", "Arguments", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TransferPhoneInputFragment extends BaseMvvmFragment<k961, on01, c> implements ce4 {
    private static final int MAX_LENGTH = 100;
    private static final int ZERO_POSITION = 0;
    private final qa3 adapter;
    private final fn01 backPressSuppressor;

    /* renamed from: itemAnimator$delegate, reason: from kotlin metadata */
    private final i3y itemAnimator;
    private FragmentManager.a nameReceiverResumedCallback;

    /* renamed from: permissionManager$delegate, reason: from kotlin metadata */
    private final i3y permissionManager;
    private final b viewModelFactory;
    public static final dn01 Companion = new dn01();
    private static final String RESULT_KEY = gf91.b();

    public TransferPhoneInputFragment(b bVar, ug01 ug01Var) {
        super(Boolean.FALSE, null, null, null, c.class, 14, null);
        this.viewModelFactory = bVar;
        this.permissionManager = kotlin.a.a(new i5y0(27, this, ug01Var));
        this.adapter = new qa3(wsy.a, vi01.b(new but0(23, this)), rfb1.i());
        this.backPressSuppressor = new fn01();
        this.itemAnimator = kotlin.a.a(new tc01(15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 adapter$lambda$1(TransferPhoneInputFragment transferPhoneInputFragment, bj01 bj01Var, int i) {
        transferPhoneInputFragment.getViewModel().x0(bj01Var, i);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void consumeSideEffect$lambda$17$lambda$16(EditText editText) {
        editText.requestFocus();
        lcb1.f(editText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void consumeSideEffect$lambda$19$lambda$18(EditText editText) {
        editText.clearFocus();
        lcb1.d(editText);
    }

    private final void finishWithResult(TransferPhoneSelectionResult result) {
        getParentFragmentManager().l0(result.toBundle(), RESULT_KEY);
        if (result.equals(TransferPhoneSelectionResult.Close.INSTANCE)) {
            getViewModel().p0();
        } else if (result instanceof TransferPhoneSelectionResult.Success) {
            getViewModel().o0();
        } else {
            w511.b();
        }
    }

    private final h getItemAnimator() {
        return (h) this.itemAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tya0 getPermissionManager() {
        return (tya0) this.permissionManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$14$lambda$10(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$14$lambda$11(TransferPhoneInputFragment transferPhoneInputFragment) {
        transferPhoneInputFragment.getViewModel().t0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$14$lambda$12(TransferPhoneInputFragment transferPhoneInputFragment) {
        transferPhoneInputFragment.getViewModel().u0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$14$lambda$13(TransferPhoneInputFragment transferPhoneInputFragment) {
        transferPhoneInputFragment.getViewModel().v0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$14$lambda$4(TransferPhoneInputFragment transferPhoneInputFragment, String str) {
        transferPhoneInputFragment.getViewModel().s0(String.valueOf(str));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$14$lambda$5(TransferPhoneInputFragment transferPhoneInputFragment, String str) {
        transferPhoneInputFragment.getViewModel().s0(String.valueOf(str));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$14$lambda$6(TransferPhoneInputFragment transferPhoneInputFragment) {
        transferPhoneInputFragment.getViewModel().q0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$14$lambda$7(TransferPhoneInputFragment transferPhoneInputFragment) {
        transferPhoneInputFragment.getViewModel().C0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$14$lambda$8(TransferPhoneInputFragment transferPhoneInputFragment) {
        transferPhoneInputFragment.getViewModel().n0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$14$lambda$9(TransferPhoneInputFragment transferPhoneInputFragment) {
        transferPhoneInputFragment.getViewModel().m0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h itemAnimator_delegate$lambda$2() {
        return new h();
    }

    private final void navigateToNameReceiverSuppressingBack(SelectedPartner partner, PhoneInputSource inputSource) {
        this.backPressSuppressor.h(true);
        gn01 gn01Var = new gn01(this);
        this.nameReceiverResumedCallback = gn01Var;
        getParentFragmentManager().d0(gn01Var, false);
        getViewModel().B0(partner, inputSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$15(TransferPhoneInputFragment transferPhoneInputFragment) {
        transferPhoneInputFragment.getViewModel().g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tya0 permissionManager_delegate$lambda$0(TransferPhoneInputFragment transferPhoneInputFragment, ug01 ug01Var) {
        return vh91.c(transferPhoneInputFragment, hde.a(transferPhoneInputFragment.requireContext()), ((me1) ug01Var).b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$22(on01 on01Var, TransferPhoneInputFragment transferPhoneInputFragment) {
        if (on01Var.i()) {
            transferPhoneInputFragment.scrollToTop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g render$lambda$23(on01 on01Var, g gVar) {
        return g.a(gVar, on01Var.e(), null, on01Var.k(), null, null, on01Var.c(), null, false, null, on01Var.d(), null, false, null, null, false, 0, false, 0, 0, null, null, null, 33553882);
    }

    private final void requestContactsPermission(boolean byUser) {
        eja1.s(this).c(new TransferPhoneInputFragment$requestContactsPermission$1(this, byUser, null));
    }

    private final void scrollToTop() {
        safePost(new bn01(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 scrollToTop$lambda$24(TransferPhoneInputFragment transferPhoneInputFragment) {
        RecyclerView.e layoutManager = ((k961) transferPhoneInputFragment.getBinding()).e.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.l1(0);
        }
        return zy11.a;
    }

    private final void showErrorSnackbar(String message, Throwable error) {
        Text.Constant g = com.ybsdk.core.utils.text.d.g(message);
        com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), g == null ? gao.e(null, null, error, 3) : gao.d(g, com.ybsdk.core.utils.text.d.f(message), error), j0t0.c, 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof cfb0) {
            cfb0 cfb0Var = (cfb0) sideEffect;
            if (cfb0Var instanceof yeb0) {
                requestContactsPermission(((yeb0) sideEffect).a());
                return;
            }
            if (cfb0Var instanceof zeb0) {
                zeb0 zeb0Var = (zeb0) sideEffect;
                showErrorSnackbar(zeb0Var.b(), zeb0Var.a());
                return;
            }
            if (cfb0Var instanceof bfb0) {
                showErrorSnackbar(null, ((bfb0) sideEffect).a());
                return;
            }
            if (cfb0Var.equals(web0.c)) {
                EditText editText = ((k961) getBinding()).c.getEditText();
                editText.post(new atw(editText, 5));
                return;
            }
            if (cfb0Var instanceof afb0) {
                afb0 afb0Var = (afb0) sideEffect;
                finishWithResult(new TransferPhoneSelectionResult.Success(afb0Var.b(), afb0Var.a()));
                return;
            }
            if (cfb0Var.equals(web0.a)) {
                EditText editText2 = ((k961) getBinding()).c.getEditText();
                editText2.post(new atw(editText2, 6));
            } else if (cfb0Var.equals(web0.b)) {
                finishWithResult(TransferPhoneSelectionResult.Close.INSTANCE);
            } else if (!(cfb0Var instanceof xeb0)) {
                w511.b();
            } else {
                xeb0 xeb0Var = (xeb0) sideEffect;
                navigateToNameReceiverSuppressingBack(xeb0Var.b(), xeb0Var.a());
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
    public c getFactoryOfViewModel() {
        return ((e) this.viewModelFactory).a((Arguments) dcs.a(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public k961 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        TextWatcher phoneInputTextWatcher;
        k961 o = k961.o(inflater, container);
        ErrorView errorView = o.b;
        FullscreenStatusView fullscreenStatusView = o.d;
        o.e.setAdapter(this.adapter);
        this.adapter.g(EmptyList.a);
        LoadableInput loadableInput = o.c;
        loadableInput.getEditText().setFilters(loadableInput.getEditText().getFilters() == null ? new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(100)} : (InputFilter[]) f73.s(loadableInput.getEditText().getFilters(), new InputFilter.LengthFilter(100)));
        int i = en01.a[((Arguments) dcs.a(this)).getPhoneSelectionScenario().ordinal()];
        final int i2 = 1;
        final int i3 = 0;
        if (i == 1) {
            phoneInputTextWatcher = new PhoneInputTextWatcher(loadableInput, new tls(this) { // from class: cn01
                public final /* synthetic */ TransferPhoneInputFragment b;

                {
                    this.b = this;
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    zy11 viewBinding$lambda$14$lambda$4;
                    zy11 viewBinding$lambda$14$lambda$5;
                    int i4 = i3;
                    TransferPhoneInputFragment transferPhoneInputFragment = this.b;
                    String str = (String) obj;
                    switch (i4) {
                        case 0:
                            viewBinding$lambda$14$lambda$4 = TransferPhoneInputFragment.getViewBinding$lambda$14$lambda$4(transferPhoneInputFragment, str);
                            return viewBinding$lambda$14$lambda$4;
                        default:
                            viewBinding$lambda$14$lambda$5 = TransferPhoneInputFragment.getViewBinding$lambda$14$lambda$5(transferPhoneInputFragment, str);
                            return viewBinding$lambda$14$lambda$5;
                    }
                }
            });
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            phoneInputTextWatcher = new InternationalPhoneInputTextWatcher(loadableInput, new tls(this) { // from class: cn01
                public final /* synthetic */ TransferPhoneInputFragment b;

                {
                    this.b = this;
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    zy11 viewBinding$lambda$14$lambda$4;
                    zy11 viewBinding$lambda$14$lambda$5;
                    int i4 = i2;
                    TransferPhoneInputFragment transferPhoneInputFragment = this.b;
                    String str = (String) obj;
                    switch (i4) {
                        case 0:
                            viewBinding$lambda$14$lambda$4 = TransferPhoneInputFragment.getViewBinding$lambda$14$lambda$4(transferPhoneInputFragment, str);
                            return viewBinding$lambda$14$lambda$4;
                        default:
                            viewBinding$lambda$14$lambda$5 = TransferPhoneInputFragment.getViewBinding$lambda$14$lambda$5(transferPhoneInputFragment, str);
                            return viewBinding$lambda$14$lambda$5;
                    }
                }
            });
        }
        loadableInput.getEditText().addTextChangedListener(phoneInputTextWatcher);
        o.f.setOnCloseButtonClickListener(new bn01(this, 3));
        errorView.setChangeVisibilityWithDelay(false);
        errorView.setPrimaryButtonOnClickListener(new bn01(this, 4));
        errorView.setSecondaryButtonClickListener(new bn01(this, 5));
        loadableInput.setOnClearIconClickListener(new bn01(this, 6));
        fullscreenStatusView.setOnClickListener(new od8(9));
        fullscreenStatusView.setCloseButtonAction(new bn01(this, 7));
        fullscreenStatusView.setPrimaryButtonAction(new bn01(this, i3));
        fullscreenStatusView.setSecondaryButtonAction(new bn01(this, i2));
        return o;
    }

    @Override // defpackage.ce4
    public boolean onBackPressed() {
        getViewModel().k0();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getViewModel().r0(((com.ybsdk.core.permissions.a) getPermissionManager()).a());
        tya0 permissionManager = getPermissionManager();
        c viewModel = getViewModel();
        if (((com.ybsdk.core.permissions.a) getPermissionManager()).a()) {
            viewModel = null;
        }
        ((com.ybsdk.core.permissions.a) permissionManager).d(viewModel);
        hua1.g(this, "SELECT_PARTNER_RESULT_KEY", new com.ybsdk.feature.partnerselection.api.a(new TransferPhoneInputFragment$onCreate$2(getViewModel()), new TransferPhoneInputFragment$onCreate$3(getViewModel()), 4));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        FragmentManager.a aVar = this.nameReceiverResumedCallback;
        if (aVar != null) {
            getParentFragmentManager().r0(aVar);
        }
        this.nameReceiverResumedCallback = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        requireView().post(new kux0(24, this));
        getViewModel().E0(((com.ybsdk.core.permissions.a) getPermissionManager()).a());
        getViewModel().w0();
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        requireActivity().getOnBackPressedDispatcher().a(getViewLifecycleOwner(), this.backPressSuppressor);
        getViewModel().A0(((com.ybsdk.core.permissions.a) getPermissionManager()).a(), savedInstanceState != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(on01 viewState) {
        RecyclerView recyclerView = ((k961) getBinding()).e;
        h itemAnimator = getItemAnimator();
        if (!viewState.a()) {
            itemAnimator = null;
        }
        recyclerView.setItemAnimator(itemAnimator);
        int i = 4;
        try {
            this.adapter.h(viewState.g(), new t601(i, viewState, this));
        } catch (IllegalArgumentException e) {
            x4c.g("Suggested ybs scrolling to top IllegalArgumentException", e, null, null, 12);
        }
        LoadableInput.render$default(((k961) getBinding()).c, false, new jl01(i, viewState), 1, null);
        if (viewState.h()) {
            ((k961) getBinding()).c.getEditText().requestFocus();
        }
        ((k961) getBinding()).b.render(viewState.b());
        ((k961) getBinding()).f.render(viewState.j());
        ((k961) getBinding()).d.setVisibility(viewState.f() == null ? 8 : 0);
        com.ybsdk.widgets.common.e f = viewState.f();
        if (f != null) {
            ((k961) getBinding()).d.render(f);
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010 J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0012\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010 J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010 J\u0010\u0010-\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b/\u00100J\u009a\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010 J\u0010\u00104\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b4\u0010\u001eJ\u001a\u00107\u001a\u00020\u00122\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b7\u00108R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b?\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b@\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\bA\u0010 R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\bB\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bD\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\bE\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\bF\u0010 R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010G\u001a\u0004\bH\u0010.R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010I\u001a\u0004\bJ\u00100R\u0011\u0010N\u001a\u00020K8F¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006O"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/TransferPhoneInputFragment$Arguments;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "agreementId", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "scenario", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "money", "comment", "phone", "transferType", "transferSessionId", "Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;", "phoneInputSource", "destinationCountry", "title", "Lcom/ybsdk/feature/transfer/version2/api/CrossBorderScenario;", "crossBorderScenario", "", "openedFromCrossBorderLanding", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/CrossBorderScenario;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/core/transfer/utils/TransferScenario;", "component3", "()Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "component4", "component5", "component6", "component7", "component8", "()Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;", "component9", "component10", "component11", "()Lcom/ybsdk/feature/transfer/version2/api/CrossBorderScenario;", "component12", "()Z", "copy", "(Ljava/lang/String;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/CrossBorderScenario;Z)Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/TransferPhoneInputFragment$Arguments;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAgreementId", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "getScenario", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "getMoney", "getComment", "getPhone", "getTransferType", "getTransferSessionId", "Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;", "getPhoneInputSource", "getDestinationCountry", "getTitle", "Lcom/ybsdk/feature/transfer/version2/api/CrossBorderScenario;", "getCrossBorderScenario", "Z", "getOpenedFromCrossBorderLanding", "Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/PhoneSelectionScenario;", "getPhoneSelectionScenario", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/PhoneSelectionScenario;", "phoneSelectionScenario", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Arguments implements ScreenParams {
        public static final Parcelable.Creator<Arguments> CREATOR = new Creator();
        private final String agreementId;
        private final String comment;
        private final CrossBorderScenario crossBorderScenario;
        private final String destinationCountry;
        private final MoneyEntity money;
        private final boolean openedFromCrossBorderLanding;
        private final String phone;
        private final PhoneInputSource phoneInputSource;
        private final TransferScenario scenario;
        private final String title;
        private final String transferSessionId;
        private final String transferType;

        public Arguments(String str, TransferScenario transferScenario, MoneyEntity moneyEntity, String str2, String str3, String str4, String str5, PhoneInputSource phoneInputSource, String str6, String str7, CrossBorderScenario crossBorderScenario, boolean z) {
            this.agreementId = str;
            this.scenario = transferScenario;
            this.money = moneyEntity;
            this.comment = str2;
            this.phone = str3;
            this.transferType = str4;
            this.transferSessionId = str5;
            this.phoneInputSource = phoneInputSource;
            this.destinationCountry = str6;
            this.title = str7;
            this.crossBorderScenario = crossBorderScenario;
            this.openedFromCrossBorderLanding = z;
        }

        public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, TransferScenario transferScenario, MoneyEntity moneyEntity, String str2, String str3, String str4, String str5, PhoneInputSource phoneInputSource, String str6, String str7, CrossBorderScenario crossBorderScenario, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = arguments.agreementId;
            }
            if ((i & 2) != 0) {
                transferScenario = arguments.scenario;
            }
            if ((i & 4) != 0) {
                moneyEntity = arguments.money;
            }
            if ((i & 8) != 0) {
                str2 = arguments.comment;
            }
            if ((i & 16) != 0) {
                str3 = arguments.phone;
            }
            if ((i & 32) != 0) {
                str4 = arguments.transferType;
            }
            if ((i & 64) != 0) {
                str5 = arguments.transferSessionId;
            }
            if ((i & 128) != 0) {
                phoneInputSource = arguments.phoneInputSource;
            }
            if ((i & 256) != 0) {
                str6 = arguments.destinationCountry;
            }
            if ((i & 512) != 0) {
                str7 = arguments.title;
            }
            if ((i & 1024) != 0) {
                crossBorderScenario = arguments.crossBorderScenario;
            }
            if ((i & 2048) != 0) {
                z = arguments.openedFromCrossBorderLanding;
            }
            CrossBorderScenario crossBorderScenario2 = crossBorderScenario;
            boolean z2 = z;
            String str8 = str6;
            String str9 = str7;
            String str10 = str5;
            PhoneInputSource phoneInputSource2 = phoneInputSource;
            String str11 = str3;
            String str12 = str4;
            return arguments.copy(str, transferScenario, moneyEntity, str2, str11, str12, str10, phoneInputSource2, str8, str9, crossBorderScenario2, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAgreementId() {
            return this.agreementId;
        }

        /* renamed from: component10, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component11, reason: from getter */
        public final CrossBorderScenario getCrossBorderScenario() {
            return this.crossBorderScenario;
        }

        /* renamed from: component12, reason: from getter */
        public final boolean getOpenedFromCrossBorderLanding() {
            return this.openedFromCrossBorderLanding;
        }

        /* renamed from: component2, reason: from getter */
        public final TransferScenario getScenario() {
            return this.scenario;
        }

        /* renamed from: component3, reason: from getter */
        public final MoneyEntity getMoney() {
            return this.money;
        }

        /* renamed from: component4, reason: from getter */
        public final String getComment() {
            return this.comment;
        }

        /* renamed from: component5, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        /* renamed from: component6, reason: from getter */
        public final String getTransferType() {
            return this.transferType;
        }

        /* renamed from: component7, reason: from getter */
        public final String getTransferSessionId() {
            return this.transferSessionId;
        }

        /* renamed from: component8, reason: from getter */
        public final PhoneInputSource getPhoneInputSource() {
            return this.phoneInputSource;
        }

        /* renamed from: component9, reason: from getter */
        public final String getDestinationCountry() {
            return this.destinationCountry;
        }

        public final Arguments copy(String agreementId, TransferScenario scenario, MoneyEntity money, String comment, String phone, String transferType, String transferSessionId, PhoneInputSource phoneInputSource, String destinationCountry, String title, CrossBorderScenario crossBorderScenario, boolean openedFromCrossBorderLanding) {
            return new Arguments(agreementId, scenario, money, comment, phone, transferType, transferSessionId, phoneInputSource, destinationCountry, title, crossBorderScenario, openedFromCrossBorderLanding);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Arguments)) {
                return false;
            }
            Arguments arguments = (Arguments) other;
            return jl40.l(this.agreementId, arguments.agreementId) && this.scenario == arguments.scenario && jl40.l(this.money, arguments.money) && jl40.l(this.comment, arguments.comment) && jl40.l(this.phone, arguments.phone) && jl40.l(this.transferType, arguments.transferType) && jl40.l(this.transferSessionId, arguments.transferSessionId) && this.phoneInputSource == arguments.phoneInputSource && jl40.l(this.destinationCountry, arguments.destinationCountry) && jl40.l(this.title, arguments.title) && this.crossBorderScenario == arguments.crossBorderScenario && this.openedFromCrossBorderLanding == arguments.openedFromCrossBorderLanding;
        }

        public final String getAgreementId() {
            return this.agreementId;
        }

        public final String getComment() {
            return this.comment;
        }

        public final CrossBorderScenario getCrossBorderScenario() {
            return this.crossBorderScenario;
        }

        public final String getDestinationCountry() {
            return this.destinationCountry;
        }

        public final MoneyEntity getMoney() {
            return this.money;
        }

        public final boolean getOpenedFromCrossBorderLanding() {
            return this.openedFromCrossBorderLanding;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final PhoneInputSource getPhoneInputSource() {
            return this.phoneInputSource;
        }

        public final PhoneSelectionScenario getPhoneSelectionScenario() {
            return this.scenario == TransferScenario.CROSS_BORDER ? PhoneSelectionScenario.CROSS_BORDER : PhoneSelectionScenario.REGULAR;
        }

        public final TransferScenario getScenario() {
            return this.scenario;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getTransferSessionId() {
            return this.transferSessionId;
        }

        public final String getTransferType() {
            return this.transferType;
        }

        public int hashCode() {
            String str = this.agreementId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            TransferScenario transferScenario = this.scenario;
            int hashCode2 = (hashCode + (transferScenario == null ? 0 : transferScenario.hashCode())) * 31;
            MoneyEntity moneyEntity = this.money;
            int hashCode3 = (hashCode2 + (moneyEntity == null ? 0 : moneyEntity.hashCode())) * 31;
            String str2 = this.comment;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.transferType;
            int b = unr0.b((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.transferSessionId);
            PhoneInputSource phoneInputSource = this.phoneInputSource;
            int hashCode6 = (b + (phoneInputSource == null ? 0 : phoneInputSource.hashCode())) * 31;
            String str5 = this.destinationCountry;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.title;
            return Boolean.hashCode(this.openedFromCrossBorderLanding) + ((this.crossBorderScenario.hashCode() + ((hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31)) * 31);
        }

        public String toString() {
            String str = this.agreementId;
            TransferScenario transferScenario = this.scenario;
            MoneyEntity moneyEntity = this.money;
            String str2 = this.comment;
            String str3 = this.phone;
            String str4 = this.transferType;
            String str5 = this.transferSessionId;
            PhoneInputSource phoneInputSource = this.phoneInputSource;
            String str6 = this.destinationCountry;
            String str7 = this.title;
            CrossBorderScenario crossBorderScenario = this.crossBorderScenario;
            boolean z = this.openedFromCrossBorderLanding;
            StringBuilder sb = new StringBuilder("Arguments(agreementId=");
            sb.append(str);
            sb.append(", scenario=");
            sb.append(transferScenario);
            sb.append(", money=");
            sb.append(moneyEntity);
            sb.append(", comment=");
            sb.append(str2);
            sb.append(", phone=");
            g8e.D(sb, str3, ", transferType=", str4, ", transferSessionId=");
            sb.append(str5);
            sb.append(", phoneInputSource=");
            sb.append(phoneInputSource);
            sb.append(", destinationCountry=");
            g8e.D(sb, str6, ", title=", str7, ", crossBorderScenario=");
            sb.append(crossBorderScenario);
            sb.append(", openedFromCrossBorderLanding=");
            sb.append(z);
            sb.append(Extension.C_BRAKE);
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.agreementId);
            TransferScenario transferScenario = this.scenario;
            if (transferScenario == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(transferScenario.name());
            }
            dest.writeParcelable(this.money, flags);
            dest.writeString(this.comment);
            dest.writeString(this.phone);
            dest.writeString(this.transferType);
            dest.writeString(this.transferSessionId);
            PhoneInputSource phoneInputSource = this.phoneInputSource;
            if (phoneInputSource == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(phoneInputSource.name());
            }
            dest.writeString(this.destinationCountry);
            dest.writeString(this.title);
            dest.writeString(this.crossBorderScenario.name());
            dest.writeInt(this.openedFromCrossBorderLanding ? 1 : 0);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Arguments> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Arguments createFromParcel(Parcel parcel) {
                return new Arguments(parcel.readString(), parcel.readInt() == 0 ? null : TransferScenario.valueOf(parcel.readString()), (MoneyEntity) parcel.readParcelable(Arguments.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? PhoneInputSource.valueOf(parcel.readString()) : null, parcel.readString(), parcel.readString(), CrossBorderScenario.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Arguments[] newArray(int i) {
                return new Arguments[i];
            }
        }

        public /* synthetic */ Arguments(String str, TransferScenario transferScenario, MoneyEntity moneyEntity, String str2, String str3, String str4, String str5, PhoneInputSource phoneInputSource, String str6, String str7, CrossBorderScenario crossBorderScenario, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, transferScenario, moneyEntity, str2, str3, str4, str5, phoneInputSource, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? CrossBorderScenario.PARTNER : crossBorderScenario, (i & 2048) != 0 ? false : z);
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
