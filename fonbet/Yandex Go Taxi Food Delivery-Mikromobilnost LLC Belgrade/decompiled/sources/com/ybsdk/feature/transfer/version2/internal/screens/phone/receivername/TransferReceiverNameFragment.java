package com.ybsdk.feature.transfer.version2.internal.screens.phone.receivername;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.core.transfer.utils.SimpleTextWatcher;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.partnerselection.api.SelectedPartner;
import com.ybsdk.feature.transfer.version2.api.PhoneInputSource;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneInputFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneSelectionResult;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.g;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.ce4;
import defpackage.dcs;
import defpackage.dl01;
import defpackage.dn01;
import defpackage.dzh0;
import defpackage.eyy;
import defpackage.g8e;
import defpackage.gao;
import defpackage.i3y;
import defpackage.j0t0;
import defpackage.jl01;
import defpackage.jl40;
import defpackage.l961;
import defpackage.lfx;
import defpackage.n0t0;
import defpackage.ntz0;
import defpackage.qas0;
import defpackage.ri01;
import defpackage.stz0;
import defpackage.unr0;
import defpackage.vmu0;
import defpackage.vn01;
import defpackage.w511;
import defpackage.wn01;
import defpackage.xn01;
import defpackage.xty0;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zgz0;
import defpackage.zn01;
import defpackage.zy11;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 (2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0002)*B\u0011\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/receivername/TransferReceiverNameFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Ll961;", "Lzn01;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/receivername/b;", "Lce4;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/receivername/a;", "viewModelFactory", "<init>", "(Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/receivername/a;)V", "Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/TransferPhoneSelectionResult;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "finishWithResult", "(Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/TransferPhoneSelectionResult;)V", "createViewModel", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/receivername/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ll961;", "viewState", "render", "(Lzn01;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "", "onBackPressed", "()Z", "Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/receivername/a;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/receivername/TransferReceiverNameFragment$Arguments;", "screenParams$delegate", "Li3y;", "getScreenParams", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/receivername/TransferReceiverNameFragment$Arguments;", "screenParams", "Companion", "Arguments", "vn01", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TransferReceiverNameFragment extends BaseMvvmFragment<l961, zn01, b> implements ce4 {
    public static final vn01 Companion = new vn01();
    public static final String RESULT_KEY = "TransferReceiverNameFragment.RESULT_KEY";

    /* renamed from: screenParams$delegate, reason: from kotlin metadata */
    private final i3y screenParams;
    private final a viewModelFactory;

    public TransferReceiverNameFragment(a aVar) {
        super(null, null, null, null, b.class, 15, null);
        this.viewModelFactory = aVar;
        this.screenParams = dcs.c(this);
    }

    private final void finishWithResult(TransferPhoneSelectionResult result) {
        if (jl40.l(result, TransferPhoneSelectionResult.Close.INSTANCE)) {
            getParentFragmentManager().l0(result.toBundle(), RESULT_KEY);
            getViewModel().c0();
        } else {
            if (!(result instanceof TransferPhoneSelectionResult.Success)) {
                w511.b();
                return;
            }
            FragmentManager parentFragmentManager = getParentFragmentManager();
            TransferPhoneInputFragment.Companion.getClass();
            parentFragmentManager.l0(result.toBundle(), dn01.a());
            getViewModel().f0();
        }
    }

    private final Arguments getScreenParams() {
        return (Arguments) this.screenParams.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$4$lambda$0(TransferReceiverNameFragment transferReceiverNameFragment) {
        if (!transferReceiverNameFragment.getViewModel().b0()) {
            transferReceiverNameFragment.finishWithResult(TransferPhoneSelectionResult.Close.INSTANCE);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g getViewBinding$lambda$4$lambda$1(g gVar) {
        return g.a(gVar, null, eyy.d, false, null, null, null, null, false, null, null, null, false, null, null, false, 0, false, 0, 0, null, null, null, 33554429);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$4$lambda$2(TransferReceiverNameFragment transferReceiverNameFragment, Editable editable) {
        transferReceiverNameFragment.getViewModel().d0(String.valueOf(editable));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$4$lambda$3(TransferReceiverNameFragment transferReceiverNameFragment, View view) {
        transferReceiverNameFragment.getViewModel().e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YbButtonView.a render$lambda$5(zn01 zn01Var, YbButtonView.a aVar) {
        return YbButtonView.a.a(aVar, null, null, zn01Var.d(), zn01Var.e(), 2559);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final g render$lambda$6(TransferReceiverNameFragment transferReceiverNameFragment, zn01 zn01Var, g gVar) {
        Editable text = ((l961) transferReceiverNameFragment.getBinding()).c.getEditText().getText();
        String obj = text != null ? text.toString() : null;
        if (obj == null) {
            obj = "";
        }
        return g.a(gVar, obj, null, !zn01Var.e(), null, null, null, null, zn01Var.b(), null, null, null, false, null, null, false, 0, false, 0, 0, null, null, null, 33554042);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        n0t0 d;
        if (sideEffect instanceof xn01) {
            xn01 xn01Var = (xn01) sideEffect;
            finishWithResult(new TransferPhoneSelectionResult.Success(xn01Var.b(), xn01Var.a()));
        } else if (sideEffect instanceof wn01) {
            wn01 wn01Var = (wn01) sideEffect;
            if (wn01Var.b() != null) {
                com.ybsdk.core.utils.text.b bVar = Text.Companion;
                String b = wn01Var.b().b();
                bVar.getClass();
                d = gao.d(new Text.Constant(b), com.ybsdk.core.utils.text.d.f(wn01Var.b().a()), wn01Var.d());
            } else {
                d = wn01Var.c() != null ? gao.d(g8e.i(Text.Companion, wn01Var.c()), com.ybsdk.core.utils.text.d.f(wn01Var.a()), wn01Var.d()) : gao.e(null, null, wn01Var.d(), 3);
            }
            com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), d, j0t0.c, 8);
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
        return ((d) this.viewModelFactory).a(getScreenParams());
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public l961 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        l961 o = l961.o(inflater, container);
        ToolbarView toolbarView = o.e;
        toolbarView.render(new stz0(new Text.Resource(dzh0.ybsdk_transfer_transfer_receiver_name_toolbar_title), null, null, null, null, new ntz0(0), false, null, null, null, null, null, 32734));
        toolbarView.setOnCloseButtonClickListener(new zgz0(24, this));
        LoadableInput loadableInput = o.c;
        LoadableInput.render$default(loadableInput, false, new ri01(28), 1, null);
        loadableInput.getEditText().addTextChangedListener(new SimpleTextWatcher(new jl01(6, this)));
        o.b.setOnClickListener(new vmu0(18, this));
        return o;
    }

    @Override // defpackage.ce4
    public boolean onBackPressed() {
        if (getViewModel().b0()) {
            return true;
        }
        finishWithResult(TransferPhoneSelectionResult.Close.INSTANCE);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(zn01 viewState) {
        CharSequence string;
        ((l961) getBinding()).b.render(new jl01(7, viewState));
        LoadableInput.render$default(((l961) getBinding()).c, false, new dl01(5, this, viewState), 1, null);
        TextView textView = ((l961) getBinding()).d;
        Text a = viewState.a();
        if (a == null || (string = com.ybsdk.core.utils.text.d.a(requireContext(), a)) == null) {
            string = getString(dzh0.ybsdk_transfer_transfer_receiver_name_hint);
        }
        textView.setText(string);
        xty0.f(((l961) getBinding()).d, viewState.c());
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJj\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b)\u0010\u001fJ\u0010\u0010*\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b*\u0010\u0019J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b8\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b9\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010%R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b<\u0010\u001f¨\u0006="}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/receivername/TransferReceiverNameFragment$Arguments;", "Lcom/ybsdk/core/navigation/ScreenParams;", "Lcom/ybsdk/feature/partnerselection/api/SelectedPartner;", "partner", "Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;", "inputSource", "", "agreementId", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "money", "comment", "transferSessionId", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "transferScenario", "destinationCountry", "<init>", "(Lcom/ybsdk/feature/partnerselection/api/SelectedPartner;Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/transfer/utils/TransferScenario;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/partnerselection/api/SelectedPartner;", "component2", "()Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "component5", "component6", "component7", "()Lcom/ybsdk/core/transfer/utils/TransferScenario;", "component8", "copy", "(Lcom/ybsdk/feature/partnerselection/api/SelectedPartner;Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/transfer/utils/TransferScenario;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/receivername/TransferReceiverNameFragment$Arguments;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/partnerselection/api/SelectedPartner;", "getPartner", "Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;", "getInputSource", "Ljava/lang/String;", "getAgreementId", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "getMoney", "getComment", "getTransferSessionId", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "getTransferScenario", "getDestinationCountry", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Arguments implements ScreenParams {
        public static final Parcelable.Creator<Arguments> CREATOR = new Creator();
        private final String agreementId;
        private final String comment;
        private final String destinationCountry;
        private final PhoneInputSource inputSource;
        private final MoneyEntity money;
        private final SelectedPartner partner;
        private final TransferScenario transferScenario;
        private final String transferSessionId;

        public Arguments(SelectedPartner selectedPartner, PhoneInputSource phoneInputSource, String str, MoneyEntity moneyEntity, String str2, String str3, TransferScenario transferScenario, String str4) {
            this.partner = selectedPartner;
            this.inputSource = phoneInputSource;
            this.agreementId = str;
            this.money = moneyEntity;
            this.comment = str2;
            this.transferSessionId = str3;
            this.transferScenario = transferScenario;
            this.destinationCountry = str4;
        }

        public static /* synthetic */ Arguments copy$default(Arguments arguments, SelectedPartner selectedPartner, PhoneInputSource phoneInputSource, String str, MoneyEntity moneyEntity, String str2, String str3, TransferScenario transferScenario, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                selectedPartner = arguments.partner;
            }
            if ((i & 2) != 0) {
                phoneInputSource = arguments.inputSource;
            }
            if ((i & 4) != 0) {
                str = arguments.agreementId;
            }
            if ((i & 8) != 0) {
                moneyEntity = arguments.money;
            }
            if ((i & 16) != 0) {
                str2 = arguments.comment;
            }
            if ((i & 32) != 0) {
                str3 = arguments.transferSessionId;
            }
            if ((i & 64) != 0) {
                transferScenario = arguments.transferScenario;
            }
            if ((i & 128) != 0) {
                str4 = arguments.destinationCountry;
            }
            TransferScenario transferScenario2 = transferScenario;
            String str5 = str4;
            String str6 = str2;
            String str7 = str3;
            return arguments.copy(selectedPartner, phoneInputSource, str, moneyEntity, str6, str7, transferScenario2, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final SelectedPartner getPartner() {
            return this.partner;
        }

        /* renamed from: component2, reason: from getter */
        public final PhoneInputSource getInputSource() {
            return this.inputSource;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAgreementId() {
            return this.agreementId;
        }

        /* renamed from: component4, reason: from getter */
        public final MoneyEntity getMoney() {
            return this.money;
        }

        /* renamed from: component5, reason: from getter */
        public final String getComment() {
            return this.comment;
        }

        /* renamed from: component6, reason: from getter */
        public final String getTransferSessionId() {
            return this.transferSessionId;
        }

        /* renamed from: component7, reason: from getter */
        public final TransferScenario getTransferScenario() {
            return this.transferScenario;
        }

        /* renamed from: component8, reason: from getter */
        public final String getDestinationCountry() {
            return this.destinationCountry;
        }

        public final Arguments copy(SelectedPartner partner, PhoneInputSource inputSource, String agreementId, MoneyEntity money, String comment, String transferSessionId, TransferScenario transferScenario, String destinationCountry) {
            return new Arguments(partner, inputSource, agreementId, money, comment, transferSessionId, transferScenario, destinationCountry);
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
            return jl40.l(this.partner, arguments.partner) && this.inputSource == arguments.inputSource && jl40.l(this.agreementId, arguments.agreementId) && jl40.l(this.money, arguments.money) && jl40.l(this.comment, arguments.comment) && jl40.l(this.transferSessionId, arguments.transferSessionId) && this.transferScenario == arguments.transferScenario && jl40.l(this.destinationCountry, arguments.destinationCountry);
        }

        public final String getAgreementId() {
            return this.agreementId;
        }

        public final String getComment() {
            return this.comment;
        }

        public final String getDestinationCountry() {
            return this.destinationCountry;
        }

        public final PhoneInputSource getInputSource() {
            return this.inputSource;
        }

        public final MoneyEntity getMoney() {
            return this.money;
        }

        public final SelectedPartner getPartner() {
            return this.partner;
        }

        public final TransferScenario getTransferScenario() {
            return this.transferScenario;
        }

        public final String getTransferSessionId() {
            return this.transferSessionId;
        }

        public int hashCode() {
            int hashCode = (this.inputSource.hashCode() + (this.partner.hashCode() * 31)) * 31;
            String str = this.agreementId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            MoneyEntity moneyEntity = this.money;
            int hashCode3 = (hashCode2 + (moneyEntity == null ? 0 : moneyEntity.hashCode())) * 31;
            String str2 = this.comment;
            int b = unr0.b((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.transferSessionId);
            TransferScenario transferScenario = this.transferScenario;
            int hashCode4 = (b + (transferScenario == null ? 0 : transferScenario.hashCode())) * 31;
            String str3 = this.destinationCountry;
            return hashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            SelectedPartner selectedPartner = this.partner;
            PhoneInputSource phoneInputSource = this.inputSource;
            String str = this.agreementId;
            MoneyEntity moneyEntity = this.money;
            String str2 = this.comment;
            String str3 = this.transferSessionId;
            TransferScenario transferScenario = this.transferScenario;
            String str4 = this.destinationCountry;
            StringBuilder sb = new StringBuilder("Arguments(partner=");
            sb.append(selectedPartner);
            sb.append(", inputSource=");
            sb.append(phoneInputSource);
            sb.append(", agreementId=");
            sb.append(str);
            sb.append(", money=");
            sb.append(moneyEntity);
            sb.append(", comment=");
            g8e.D(sb, str2, ", transferSessionId=", str3, ", transferScenario=");
            sb.append(transferScenario);
            sb.append(", destinationCountry=");
            sb.append(str4);
            sb.append(Extension.C_BRAKE);
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.partner, flags);
            dest.writeString(this.inputSource.name());
            dest.writeString(this.agreementId);
            dest.writeParcelable(this.money, flags);
            dest.writeString(this.comment);
            dest.writeString(this.transferSessionId);
            TransferScenario transferScenario = this.transferScenario;
            if (transferScenario == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(transferScenario.name());
            }
            dest.writeString(this.destinationCountry);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Arguments> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Arguments createFromParcel(Parcel parcel) {
                return new Arguments((SelectedPartner) parcel.readParcelable(Arguments.class.getClassLoader()), PhoneInputSource.valueOf(parcel.readString()), parcel.readString(), (MoneyEntity) parcel.readParcelable(Arguments.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TransferScenario.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Arguments[] newArray(int i) {
                return new Arguments[i];
            }
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
