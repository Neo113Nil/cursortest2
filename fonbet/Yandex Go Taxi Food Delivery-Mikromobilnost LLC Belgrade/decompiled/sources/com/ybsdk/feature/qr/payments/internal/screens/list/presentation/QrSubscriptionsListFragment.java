package com.ybsdk.feature.qr.payments.internal.screens.list.presentation;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.snackbar.SnackbarView;
import defpackage.d5b0;
import defpackage.dz2;
import defpackage.dzh0;
import defpackage.hbv;
import defpackage.i3y;
import defpackage.jib1;
import defpackage.k1v0;
import defpackage.lfx;
import defpackage.ow4;
import defpackage.p0v0;
import defpackage.qa3;
import defpackage.qas0;
import defpackage.r501;
import defpackage.rbv;
import defpackage.tfg0;
import defpackage.ufg0;
import defpackage.v4b1;
import defpackage.wz51;
import defpackage.xfg0;
import defpackage.y461;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0017\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010$\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000bH\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R)\u00100\u001a\u0010\u0012\f\u0012\n +*\u0004\u0018\u00010*0*0)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/screens/list/presentation/QrSubscriptionsListFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Ly461;", "Lk1v0;", "Lcom/ybsdk/feature/qr/payments/internal/screens/list/presentation/a;", "Lyvf0;", "listViewModel", "<init>", "(Lyvf0;)V", "Lp0v0;", "item", "Lzy11;", "showRemoveDialog", "(Lp0v0;)V", "viewState", "Lhbv;", "renderEmptyState", "(Lk1v0;)Lhbv;", "createViewModel", "()Lcom/ybsdk/feature/qr/payments/internal/screens/list/presentation/a;", "render", "(Lk1v0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ly461;", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "()V", "Lyvf0;", "Lqa3;", "", "kotlin.jvm.PlatformType", "adapter$delegate", "Li3y;", "getAdapter", "()Lqa3;", "adapter", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class QrSubscriptionsListFragment extends BaseMvvmFragment<y461, k1v0, a> {

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final i3y adapter;
    private final yvf0 listViewModel;

    public QrSubscriptionsListFragment(yvf0 yvf0Var) {
        super(null, null, null, null, a.class, 15, null);
        this.listViewModel = yvf0Var;
        this.adapter = kotlin.a.a(new xfg0(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qa3 adapter_delegate$lambda$0(QrSubscriptionsListFragment qrSubscriptionsListFragment) {
        return new qa3(tfg0.a, jib1.b(), jib1.c(new QrSubscriptionsListFragment$adapter$2$1(qrSubscriptionsListFragment.getViewModel())), jib1.d(new QrSubscriptionsListFragment$adapter$2$2(qrSubscriptionsListFragment)));
    }

    private final qa3 getAdapter() {
        return (qa3) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$4$lambda$2(QrSubscriptionsListFragment qrSubscriptionsListFragment) {
        qrSubscriptionsListFragment.getViewModel().e0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$4$lambda$3(QrSubscriptionsListFragment qrSubscriptionsListFragment, View view) {
        qrSubscriptionsListFragment.getViewModel().b0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final hbv renderEmptyState(k1v0 viewState) {
        ((y461) getBinding()).c.setVisibility(viewState.a() != null ? 0 : 8);
        if (viewState.a() != null) {
            ((y461) getBinding()).f.setText(d.a(requireContext(), viewState.a().c()));
            ((y461) getBinding()).d.setText(d.a(requireContext(), viewState.a().a()));
            rbv b = viewState.a().b();
            if (b != null) {
                return v4b1.k(b, ((y461) getBinding()).e, null, null, 6);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRemoveDialog(p0v0 item) {
        AlertDialog.a aVar = new AlertDialog.a(requireContext());
        aVar.d(getString(dzh0.ybsdk_qr_payment_remove_subscription_dialog_title, item.a()));
        showAlertDialog(aVar.setNegativeButton(dzh0.ybsdk_qr_payment_remove_subscription_dialog_cancel, new dz2(5)).setPositiveButton(dzh0.ybsdk_qr_payment_remove_subscription_dialog_confirm, new ow4(4, this, item)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRemoveDialog$lambda$5(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRemoveDialog$lambda$6(QrSubscriptionsListFragment qrSubscriptionsListFragment, p0v0 p0v0Var, DialogInterface dialogInterface, int i) {
        qrSubscriptionsListFragment.getViewModel().d0(p0v0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof ufg0) {
            SnackbarView.show$default(((y461) getBinding()).j, ((ufg0) sideEffect).a(), 0L, null, 6, null);
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
        return (a) this.listViewModel.get();
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public y461 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        y461 o = y461.o(inflater, container);
        o.i.setAdapter(getAdapter());
        getAdapter().g(EmptyList.a);
        o.g.setPrimaryButtonOnClickListener(new xfg0(this, 1));
        o.b.setOnClickListener(new d5b0(24, this));
        return o;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getViewModel().c0();
        super.onDestroyView();
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getViewModel().f0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(k1v0 viewState) {
        y461 y461Var = (y461) getBinding();
        if (viewState.c()) {
            y461Var.g.render(r501.a(viewState.b(), null, null, null, null, null, null, null, null, null, null, null, null, 65534));
            return;
        }
        ErrorView errorView = y461Var.g;
        wz51 wz51Var = y461Var.h;
        RecyclerView recyclerView = y461Var.i;
        errorView.render(null);
        getAdapter().g(viewState.d());
        y461Var.k.render(viewState.e());
        if (viewState.f()) {
            y461Var.c.setVisibility(4);
            recyclerView.setVisibility(4);
            wz51Var.p().setVisibility(0);
        } else {
            renderEmptyState(viewState);
            wz51Var.p().setVisibility(4);
            recyclerView.setVisibility(viewState.a() != null ? 8 : 0);
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
