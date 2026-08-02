package com.ybsdk.feature.savings.internal.screens.close;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView;
import defpackage.a4m0;
import defpackage.b4m0;
import defpackage.c4m0;
import defpackage.d4m0;
import defpackage.dcs;
import defpackage.e4m0;
import defpackage.lfx;
import defpackage.n751;
import defpackage.ny61;
import defpackage.qas0;
import defpackage.tdr;
import defpackage.v761;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.z1x0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0011\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00132\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'¨\u0006("}, d2 = {"Lcom/ybsdk/feature/savings/internal/screens/close/SavingsAccountCloseFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lv761;", "Le4m0;", "Lb4m0;", "Ltdr;", "La4m0;", "factoryOfViewModel", "<init>", "(La4m0;)V", "", "fitsSystemWindow", "()Z", "createViewModel", "()Lb4m0;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lv761;", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "viewState", "render", "(Le4m0;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "La4m0;", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SavingsAccountCloseFragment extends BaseMvvmFragment<v761, e4m0, b4m0> implements tdr {
    private final a4m0 factoryOfViewModel;

    public SavingsAccountCloseFragment(a4m0 a4m0Var) {
        super(null, null, null, null, b4m0.class, 15, null);
        this.factoryOfViewModel = a4m0Var;
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
    public b4m0 getFactoryOfViewModel() {
        return ((c4m0) this.factoryOfViewModel).a((SavingsAccountCloseParams) dcs.a(this));
    }

    @Override // defpackage.tdr
    public boolean fitNavigation() {
        return true;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.xdr
    public boolean fitsSystemWindow() {
        return false;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public v761 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        v761 p = v761.p(inflater, container);
        p.o().setPrimaryButtonOnClickListener(new SavingsAccountCloseFragment$getViewBinding$1$1(getViewModel()));
        p.o().setSecondaryButtonClickListener(new SavingsAccountCloseFragment$getViewBinding$1$2(getViewModel()));
        return p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        CommunicationFullScreenView o = ((v761) getBinding()).o();
        ViewGroup.LayoutParams layoutParams = o.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, insets.a.h(2).d);
        o.setLayoutParams(marginLayoutParams);
        return insets;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setStatusBarColorModel(new z1x0(new ColorModel.Raw(0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(e4m0 viewState) {
        if (viewState instanceof d4m0) {
            d4m0 d4m0Var = (d4m0) viewState;
            ((v761) getBinding()).o().render(d4m0Var.a());
            setStatusBarColorModel(new z1x0(d4m0Var.b()));
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
