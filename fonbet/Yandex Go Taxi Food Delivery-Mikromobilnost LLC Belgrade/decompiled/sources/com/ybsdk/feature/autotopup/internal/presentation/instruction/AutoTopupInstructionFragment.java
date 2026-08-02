package com.ybsdk.feature.autotopup.internal.presentation.instruction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.feature.autotopup.api.TwoFactorAuthResult;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.bw3;
import defpackage.cw3;
import defpackage.dcs;
import defpackage.dw3;
import defpackage.ew3;
import defpackage.f02;
import defpackage.hua1;
import defpackage.jl40;
import defpackage.lfx;
import defpackage.qas0;
import defpackage.tdr;
import defpackage.tn1;
import defpackage.uk11;
import defpackage.vv3;
import defpackage.w511;
import defpackage.xz51;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.z1x0;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/presentation/instruction/AutoTopupInstructionFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lxz51;", "Lew3;", "Lcom/ybsdk/feature/autotopup/internal/presentation/instruction/a;", "Ltdr;", "Lcw3;", "factory", "Luk11;", "secondFactorScreenProvider", "<init>", "(Lcw3;Luk11;)V", "createViewModel", "()Lcom/ybsdk/feature/autotopup/internal/presentation/instruction/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lxz51;", "Lqas0;", "sideEffect", "Lzy11;", "consumeSideEffect", "(Lqas0;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "viewState", "render", "(Lew3;)V", "Lcw3;", "Luk11;", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AutoTopupInstructionFragment extends BaseMvvmFragment<xz51, ew3, a> implements tdr {
    private final cw3 factory;
    private final uk11 secondFactorScreenProvider;

    public AutoTopupInstructionFragment(cw3 cw3Var, uk11 uk11Var) {
        super(Boolean.FALSE, null, null, null, a.class, 14, null);
        this.factory = cw3Var;
        this.secondFactorScreenProvider = uk11Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$1$lambda$0(AutoTopupInstructionFragment autoTopupInstructionFragment) {
        autoTopupInstructionFragment.getViewModel().b0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreate$lambda$2(AutoTopupInstructionFragment autoTopupInstructionFragment, String str, Bundle bundle) {
        TwoFactorAuthResult a = ((vv3) autoTopupInstructionFragment.secondFactorScreenProvider).a(bundle);
        if (a instanceof TwoFactorAuthResult.Success) {
            autoTopupInstructionFragment.getViewModel().c0(((TwoFactorAuthResult.Success) a).getVerificationToken());
        } else if (!jl40.l(a, TwoFactorAuthResult.Cancel.INSTANCE)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof bw3) {
            com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), ((bw3) sideEffect).a(), null, 12);
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
        return ((dw3) this.factory).a((AutoTopupInstructionParams) dcs.a(this));
    }

    @Override // defpackage.tdr
    public boolean fitNavigation() {
        return true;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public xz51 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        xz51 o = xz51.o(inflater);
        o.c.setOnCloseButtonClickListener(new f02(7, this));
        o.b.setPrimaryButtonOnClickListener(new AutoTopupInstructionFragment$getViewBinding$1$2(getViewModel()));
        return o;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hua1.g(this, "AUTO_TOPUP_REQUEST_KEY", new tn1(16, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(ew3 viewState) {
        ((xz51) getBinding()).b.render(viewState.a());
        setStatusBarColorModel(new z1x0(viewState.b()));
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
