package com.ybsdk.feature.qr.payments.internal.screens.refresh.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.view.ImageToolbarView;
import com.ybsdk.widgets.common.ToolbarView;
import defpackage.adg0;
import defpackage.bdg0;
import defpackage.cdg0;
import defpackage.d5b0;
import defpackage.dcs;
import defpackage.ddg0;
import defpackage.edg0;
import defpackage.fdg0;
import defpackage.gdg0;
import defpackage.lfx;
import defpackage.rbv;
import defpackage.v4b1;
import defpackage.w461;
import defpackage.w511;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 ¨\u0006!"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/screens/refresh/presentation/QrRefreshFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lw461;", "Lgdg0;", "Lbdg0;", "Ladg0;", "viewModelFactory", "<init>", "(Ladg0;)V", "Lfdg0;", "toolbar", "", "renderToolbar", "(Lfdg0;)Ljava/lang/Object;", "createViewModel", "()Lbdg0;", "viewState", "Lzy11;", "render", "(Lgdg0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lw461;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Ladg0;", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class QrRefreshFragment extends BaseMvvmFragment<w461, gdg0, bdg0> {
    private final adg0 viewModelFactory;

    public QrRefreshFragment(adg0 adg0Var) {
        super(null, null, null, null, bdg0.class, 15, null);
        this.viewModelFactory = adg0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(QrRefreshFragment qrRefreshFragment, View view) {
        qrRefreshFragment.getViewModel().b0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object renderToolbar(fdg0 toolbar) {
        w461 w461Var = (w461) getBinding();
        ToolbarView toolbarView = w461Var.g;
        ImageToolbarView imageToolbarView = w461Var.e;
        boolean z = toolbar instanceof ddg0;
        toolbarView.setVisibility(z ? 0 : 8);
        boolean z2 = toolbar instanceof edg0;
        imageToolbarView.setVisibility(z2 ? 0 : 8);
        if (z) {
            w461Var.g.render(((ddg0) toolbar).a());
            return zy11.a;
        }
        if (z2) {
            return imageToolbarView.render(((edg0) toolbar).a());
        }
        w511.b();
        return null;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public bdg0 getFactoryOfViewModel() {
        return ((cdg0) this.viewModelFactory).a((QrRefreshArguments) dcs.a(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public w461 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        w461 o = w461.o(inflater, container);
        o.e.setOnCloseButtonClickListener(new QrRefreshFragment$getViewBinding$1$1(getViewModel()));
        return o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((w461) getBinding()).b.setOnClickListener(new d5b0(23, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(gdg0 viewState) {
        w461 w461Var = (w461) getBinding();
        setBackButtonVisible(viewState.e() instanceof ddg0);
        renderToolbar(viewState.e());
        w461Var.d.setVisibility(viewState.c() != null ? 0 : 8);
        rbv c = viewState.c();
        if (c != null) {
            v4b1.k(c, w461Var.d, null, null, 6);
        }
        w461Var.f.setText(d.a(requireContext(), viewState.d()));
        w461Var.c.setText(d.a(requireContext(), viewState.b()));
        w461Var.b.render(viewState.a());
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
