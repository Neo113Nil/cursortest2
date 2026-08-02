package com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.presentation;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.presentation.AutoPullsFragment;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.dzh0;
import defpackage.et3;
import defpackage.ft3;
import defpackage.fwn;
import defpackage.gt3;
import defpackage.ht3;
import defpackage.i3y;
import defpackage.ks3;
import defpackage.lfx;
import defpackage.qa3;
import defpackage.qas0;
import defpackage.r501;
import defpackage.r8j0;
import defpackage.rbv;
import defpackage.s8j0;
import defpackage.t8j0;
import defpackage.tf;
import defpackage.u8j0;
import defpackage.v1b1;
import defpackage.v4b1;
import defpackage.vz51;
import defpackage.w511;
import defpackage.ws3;
import defpackage.wz51;
import defpackage.xs3;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.yvf0;
import defpackage.zs3;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0001B\u0017\b\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\r2\u0010\u0010\u0012\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR)\u0010'\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010!0!0 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/me2me/list/presentation/AutoPullsFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lvz51;", "Lu8j0;", "Lht3;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/me2me/list/presentation/AutoPullsViewState;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/me2me/list/presentation/a;", "Lyvf0;", "listViewModel", "<init>", "(Lyvf0;)V", "Lks3;", "item", "Lzy11;", "showRemoveDialog", "(Lks3;)V", "createViewModel", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/me2me/list/presentation/a;", "viewState", "render", "(Lu8j0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lvz51;", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Lyvf0;", "Lqa3;", "", "kotlin.jvm.PlatformType", "adapter$delegate", "Li3y;", "getAdapter", "()Lqa3;", "adapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AutoPullsFragment extends BaseMvvmFragment<vz51, u8j0, a> {

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final i3y adapter;
    private final yvf0 listViewModel;

    public AutoPullsFragment(yvf0 yvf0Var) {
        super(null, null, null, null, a.class, 15, null);
        this.listViewModel = yvf0Var;
        this.adapter = kotlin.a.a(new xs3(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qa3 adapter_delegate$lambda$0(AutoPullsFragment autoPullsFragment) {
        return new qa3(ws3.a, v1b1.d(), v1b1.c(new AutoPullsFragment$adapter$2$1(autoPullsFragment)));
    }

    private final qa3 getAdapter() {
        return (qa3) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$5$lambda$3(AutoPullsFragment autoPullsFragment) {
        autoPullsFragment.getViewModel().e0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$5$lambda$4(AutoPullsFragment autoPullsFragment, View view) {
        autoPullsFragment.getViewModel().b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRemoveDialog(final ks3 item) {
        getViewModel().d0(item);
        AlertDialog.a aVar = new AlertDialog.a(requireContext());
        aVar.d(item.a());
        final int i = 0;
        final int i2 = 1;
        showAlertDialog(aVar.setNegativeButton(dzh0.ybsdk_transfer_auto_topup_bank_dialog_keep, new DialogInterface.OnClickListener(this) { // from class: ys3
            public final /* synthetic */ AutoPullsFragment b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                int i4 = i;
                ks3 ks3Var = item;
                AutoPullsFragment autoPullsFragment = this.b;
                switch (i4) {
                    case 0:
                        AutoPullsFragment.showRemoveDialog$lambda$6(autoPullsFragment, ks3Var, dialogInterface, i3);
                        break;
                    default:
                        AutoPullsFragment.showRemoveDialog$lambda$7(autoPullsFragment, ks3Var, dialogInterface, i3);
                        break;
                }
            }
        }).setPositiveButton(dzh0.ybsdk_transfer_auto_topup_bank_dialog_unlink, new DialogInterface.OnClickListener(this) { // from class: ys3
            public final /* synthetic */ AutoPullsFragment b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                int i4 = i2;
                ks3 ks3Var = item;
                AutoPullsFragment autoPullsFragment = this.b;
                switch (i4) {
                    case 0:
                        AutoPullsFragment.showRemoveDialog$lambda$6(autoPullsFragment, ks3Var, dialogInterface, i3);
                        break;
                    default:
                        AutoPullsFragment.showRemoveDialog$lambda$7(autoPullsFragment, ks3Var, dialogInterface, i3);
                        break;
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRemoveDialog$lambda$6(AutoPullsFragment autoPullsFragment, ks3 ks3Var, DialogInterface dialogInterface, int i) {
        autoPullsFragment.getViewModel().c0(ks3Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRemoveDialog$lambda$7(AutoPullsFragment autoPullsFragment, ks3 ks3Var, DialogInterface dialogInterface, int i) {
        autoPullsFragment.getViewModel().c0(ks3Var, true);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof zs3) {
            com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), ((zs3) sideEffect).a(), null, 12);
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
    public vz51 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        vz51 o = vz51.o(inflater, container);
        o.j.setAdapter(getAdapter());
        getAdapter().g(EmptyList.a);
        o.c.setPrimaryButtonOnClickListener(new xs3(this, 0));
        o.f.setOnClickListener(new tf(8, this));
        return o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(u8j0 viewState) {
        vz51 vz51Var = (vz51) getBinding();
        wz51 wz51Var = vz51Var.d;
        ErrorView errorView = vz51Var.c;
        AppCompatImageView appCompatImageView = vz51Var.h;
        wz51Var.p().setVisibility(8);
        Group group = vz51Var.b;
        group.setVisibility(8);
        RecyclerView recyclerView = vz51Var.j;
        recyclerView.setVisibility(8);
        if (viewState instanceof r8j0) {
            r8j0 r8j0Var = (r8j0) viewState;
            vz51Var.e.render(((ht3) r8j0Var.e()).b());
            et3 a = ((ht3) r8j0Var.e()).a();
            if (a instanceof ft3) {
                fwn a2 = ((ft3) a).a();
                group.setVisibility(0);
                rbv b = a2.b();
                if (b == null || v4b1.k(b, appCompatImageView, null, null, 6) == null) {
                    appCompatImageView.setImageDrawable(null);
                }
                vz51Var.i.setText(d.a(requireContext(), a2.c()));
                vz51Var.g.setText(d.a(requireContext(), a2.a()));
            } else if (!(a instanceof gt3)) {
                w511.b();
                return;
            } else {
                recyclerView.setVisibility(0);
                getAdapter().g(((gt3) a).a());
            }
        } else if (viewState instanceof s8j0) {
            errorView.render(r501.a(((s8j0) viewState).d(), null, null, null, null, null, null, null, null, null, null, null, null, 65534));
        } else {
            if (!(viewState instanceof t8j0)) {
                w511.b();
                return;
            }
            vz51Var.d.p().setVisibility(0);
        }
        errorView.setVisibility(viewState instanceof s8j0 ? 0 : 8);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
