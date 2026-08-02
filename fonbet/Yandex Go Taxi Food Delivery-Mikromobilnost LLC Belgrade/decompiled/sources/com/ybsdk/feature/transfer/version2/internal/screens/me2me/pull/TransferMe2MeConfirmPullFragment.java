package com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.transfer.utils.TransferToolbarView;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.version2.api.TransferTwoFactorScreenProvider$Request;
import com.ybsdk.feature.transfer.version2.api.TransferTwoFactorScreenProvider$TwoFactorResult;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.TransferMe2MeConfirmPullFragment;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.but0;
import defpackage.dcs;
import defpackage.em01;
import defpackage.fm01;
import defpackage.fu01;
import defpackage.gm01;
import defpackage.hu01;
import defpackage.hua1;
import defpackage.i3y;
import defpackage.im01;
import defpackage.jl01;
import defpackage.jl40;
import defpackage.lfx;
import defpackage.ntz0;
import defpackage.qas0;
import defpackage.qc70;
import defpackage.r501;
import defpackage.r8j0;
import defpackage.rtu;
import defpackage.s8j0;
import defpackage.sls;
import defpackage.t8j0;
import defpackage.tu01;
import defpackage.u8j0;
import defpackage.v4b1;
import defpackage.vmu0;
import defpackage.w511;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.z961;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0001B\u0019\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010%\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0014¢\u0006\u0004\b%\u0010&J!\u0010)\u001a\u00020\u00132\u0006\u0010(\u001a\u00020'2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0013H\u0016¢\u0006\u0004\b+\u0010\u0017J!\u0010,\u001a\u00020\u00132\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00132\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00103R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/me2me/pull/TransferMe2MeConfirmPullFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lz961;", "Lu8j0;", "Lem01;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/me2me/pull/TransferMe2MeConfirmPullViewState;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/me2me/pull/a;", "Lfm01;", "viewModelFactory", "Lhu01;", "twoFactorScreenProvider", "<init>", "(Lfm01;Lhu01;)V", "viewState", "", "isDataVisible", "(Lu8j0;)Z", "", "throwable", "Lzy11;", "renderError", "(Ljava/lang/Throwable;)V", "renderLoading", "()V", Constants.KEY_DATA, "renderData", "(Lem01;)V", "createViewModel", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/me2me/pull/a;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lz961;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "render", "(Lu8j0;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Lfm01;", "Lhu01;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/me2me/pull/TransferMe2MeConfirmPullScreenParams;", "screenParams$delegate", "Li3y;", "getScreenParams", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/me2me/pull/TransferMe2MeConfirmPullScreenParams;", "screenParams", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TransferMe2MeConfirmPullFragment extends BaseMvvmFragment<z961, u8j0, a> {

    /* renamed from: screenParams$delegate, reason: from kotlin metadata */
    private final i3y screenParams;
    private final hu01 twoFactorScreenProvider;
    private final fm01 viewModelFactory;

    public TransferMe2MeConfirmPullFragment(fm01 fm01Var, hu01 hu01Var) {
        super(Boolean.FALSE, null, null, null, a.class, 14, null);
        this.viewModelFactory = fm01Var;
        this.twoFactorScreenProvider = hu01Var;
        this.screenParams = dcs.c(this);
    }

    private final TransferMe2MeConfirmPullScreenParams getScreenParams() {
        return (TransferMe2MeConfirmPullScreenParams) this.screenParams.getValue();
    }

    private final boolean isDataVisible(u8j0 viewState) {
        return viewState.a() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreate$lambda$0(TransferMe2MeConfirmPullFragment transferMe2MeConfirmPullFragment, String str, Bundle bundle) {
        TransferTwoFactorScreenProvider$TwoFactorResult a = ((tu01) transferMe2MeConfirmPullFragment.twoFactorScreenProvider).a(bundle);
        if (a instanceof TransferTwoFactorScreenProvider$TwoFactorResult.VerificationToken) {
            transferMe2MeConfirmPullFragment.getViewModel().c0(((TransferTwoFactorScreenProvider$TwoFactorResult.VerificationToken) a).getVerificationToken());
        } else if (!jl40.l(a, TransferTwoFactorScreenProvider$TwoFactorResult.Cancel.INSTANCE) && a != null) {
            w511.b();
            return null;
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$5$lambda$1(TransferMe2MeConfirmPullFragment transferMe2MeConfirmPullFragment) {
        transferMe2MeConfirmPullFragment.getViewModel().f0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$5$lambda$2(TransferMe2MeConfirmPullFragment transferMe2MeConfirmPullFragment, View view) {
        transferMe2MeConfirmPullFragment.getViewModel().h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$5$lambda$3(TransferMe2MeConfirmPullFragment transferMe2MeConfirmPullFragment) {
        transferMe2MeConfirmPullFragment.getViewModel().i0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$5$lambda$4(TransferMe2MeConfirmPullFragment transferMe2MeConfirmPullFragment) {
        transferMe2MeConfirmPullFragment.getViewModel().e0();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderData(em01 data) {
        z961 z961Var = (z961) getBinding();
        TransferToolbarView transferToolbarView = z961Var.j;
        OperationProgressView operationProgressView = z961Var.h;
        data.getClass();
        transferToolbarView.setVisibility(0);
        z961Var.j.render(data.g());
        v4b1.k(data.c(), z961Var.f, null, null, 6);
        operationProgressView.setVisibility(data.e() == null ? 8 : 0);
        qc70 e = data.e();
        if (e != null) {
            operationProgressView.render(e);
        }
        z961Var.i.setText(data.f());
        z961Var.e.setText(data.b());
        z961Var.g.render(data.a());
        TextView textView = z961Var.d;
        String d = data.d();
        textView.setText(d != null ? rtu.a(new jl01(1, this), d) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderData$lambda$14$lambda$13(TransferMe2MeConfirmPullFragment transferMe2MeConfirmPullFragment, String str) {
        transferMe2MeConfirmPullFragment.getViewModel().g0(str);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderError(Throwable throwable) {
        z961 z961Var = (z961) getBinding();
        z961Var.b.render(r501.a(throwable, null, null, null, null, null, null, null, null, null, null, null, null, 65534));
        TransferToolbarView transferToolbarView = z961Var.j;
        transferToolbarView.setVisibility(0);
        transferToolbarView.render(new fu01(Text.Empty.INSTANCE, new ntz0(0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderLoading() {
        z961 z961Var = (z961) getBinding();
        z961Var.c.o().setVisibility(0);
        z961Var.c.o().startShimmer();
        TransferToolbarView transferToolbarView = z961Var.j;
        transferToolbarView.setVisibility(0);
        transferToolbarView.render(new fu01(Text.Empty.INSTANCE, new ntz0(0)));
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof gm01) {
            com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), ((gm01) sideEffect).a(), null, 12);
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
        return ((im01) this.viewModelFactory).a(getScreenParams());
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public z961 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return z961.o(getLayoutInflater(), container);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hua1.g(this, TransferTwoFactorScreenProvider$Request.CONFIRM_ME2ME_AUTO_PULL.getKey(), new but0(22, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getViewModel().j0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        z961 z961Var = (z961) getBinding();
        z961Var.d.setMovementMethod(LinkMovementMethod.getInstance());
        final int i = 0;
        z961Var.j.setOnCloseButtonClickListener(new sls(this) { // from class: dm01
            public final /* synthetic */ TransferMe2MeConfirmPullFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onViewCreated$lambda$5$lambda$1;
                zy11 onViewCreated$lambda$5$lambda$3;
                zy11 onViewCreated$lambda$5$lambda$4;
                int i2 = i;
                TransferMe2MeConfirmPullFragment transferMe2MeConfirmPullFragment = this.b;
                switch (i2) {
                    case 0:
                        onViewCreated$lambda$5$lambda$1 = TransferMe2MeConfirmPullFragment.onViewCreated$lambda$5$lambda$1(transferMe2MeConfirmPullFragment);
                        return onViewCreated$lambda$5$lambda$1;
                    case 1:
                        onViewCreated$lambda$5$lambda$3 = TransferMe2MeConfirmPullFragment.onViewCreated$lambda$5$lambda$3(transferMe2MeConfirmPullFragment);
                        return onViewCreated$lambda$5$lambda$3;
                    default:
                        onViewCreated$lambda$5$lambda$4 = TransferMe2MeConfirmPullFragment.onViewCreated$lambda$5$lambda$4(transferMe2MeConfirmPullFragment);
                        return onViewCreated$lambda$5$lambda$4;
                }
            }
        });
        z961Var.g.setOnClickListener(new vmu0(17, this));
        ErrorView errorView = z961Var.b;
        final int i2 = 1;
        errorView.setPrimaryButtonOnClickListener(new sls(this) { // from class: dm01
            public final /* synthetic */ TransferMe2MeConfirmPullFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onViewCreated$lambda$5$lambda$1;
                zy11 onViewCreated$lambda$5$lambda$3;
                zy11 onViewCreated$lambda$5$lambda$4;
                int i22 = i2;
                TransferMe2MeConfirmPullFragment transferMe2MeConfirmPullFragment = this.b;
                switch (i22) {
                    case 0:
                        onViewCreated$lambda$5$lambda$1 = TransferMe2MeConfirmPullFragment.onViewCreated$lambda$5$lambda$1(transferMe2MeConfirmPullFragment);
                        return onViewCreated$lambda$5$lambda$1;
                    case 1:
                        onViewCreated$lambda$5$lambda$3 = TransferMe2MeConfirmPullFragment.onViewCreated$lambda$5$lambda$3(transferMe2MeConfirmPullFragment);
                        return onViewCreated$lambda$5$lambda$3;
                    default:
                        onViewCreated$lambda$5$lambda$4 = TransferMe2MeConfirmPullFragment.onViewCreated$lambda$5$lambda$4(transferMe2MeConfirmPullFragment);
                        return onViewCreated$lambda$5$lambda$4;
                }
            }
        });
        final int i3 = 2;
        errorView.setSecondaryButtonClickListener(new sls(this) { // from class: dm01
            public final /* synthetic */ TransferMe2MeConfirmPullFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onViewCreated$lambda$5$lambda$1;
                zy11 onViewCreated$lambda$5$lambda$3;
                zy11 onViewCreated$lambda$5$lambda$4;
                int i22 = i3;
                TransferMe2MeConfirmPullFragment transferMe2MeConfirmPullFragment = this.b;
                switch (i22) {
                    case 0:
                        onViewCreated$lambda$5$lambda$1 = TransferMe2MeConfirmPullFragment.onViewCreated$lambda$5$lambda$1(transferMe2MeConfirmPullFragment);
                        return onViewCreated$lambda$5$lambda$1;
                    case 1:
                        onViewCreated$lambda$5$lambda$3 = TransferMe2MeConfirmPullFragment.onViewCreated$lambda$5$lambda$3(transferMe2MeConfirmPullFragment);
                        return onViewCreated$lambda$5$lambda$3;
                    default:
                        onViewCreated$lambda$5$lambda$4 = TransferMe2MeConfirmPullFragment.onViewCreated$lambda$5$lambda$4(transferMe2MeConfirmPullFragment);
                        return onViewCreated$lambda$5$lambda$4;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(u8j0 viewState) {
        z961 z961Var = (z961) getBinding();
        z961Var.c.o().setVisibility(8);
        z961Var.b.render(null);
        z961Var.i.setVisibility(isDataVisible(viewState) ? 0 : 8);
        z961Var.f.setVisibility(isDataVisible(viewState) ? 0 : 8);
        z961Var.e.setVisibility(isDataVisible(viewState) ? 0 : 8);
        z961Var.g.setVisibility(isDataVisible(viewState) ? 0 : 8);
        z961Var.d.setVisibility(isDataVisible(viewState) ? 0 : 8);
        if (viewState instanceof r8j0) {
            em01 em01Var = (em01) ((r8j0) viewState).a();
            if (em01Var != null) {
                renderData(em01Var);
                return;
            }
            return;
        }
        boolean z = viewState instanceof s8j0;
        if (!z) {
            if (viewState instanceof t8j0) {
                renderLoading();
                return;
            } else {
                w511.b();
                return;
            }
        }
        s8j0 s8j0Var = z ? (s8j0) viewState : null;
        Throwable d = s8j0Var != null ? s8j0Var.d() : null;
        if (d != null) {
            renderError(d);
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
