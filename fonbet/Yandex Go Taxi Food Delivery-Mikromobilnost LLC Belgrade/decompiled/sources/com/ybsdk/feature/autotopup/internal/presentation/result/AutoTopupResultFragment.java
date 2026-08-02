package com.ybsdk.feature.autotopup.internal.presentation.result;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import defpackage.bz3;
import defpackage.cz3;
import defpackage.dcs;
import defpackage.eo1;
import defpackage.evu0;
import defpackage.f02;
import defpackage.i3y;
import defpackage.lfx;
import defpackage.oc70;
import defpackage.pc70;
import defpackage.rbv;
import defpackage.v4b1;
import defpackage.vy3;
import defpackage.xy3;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zy11;
import defpackage.zz51;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/presentation/result/AutoTopupResultFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lzz51;", "Lcz3;", "Lcom/ybsdk/feature/autotopup/internal/presentation/result/b;", "Lxy3;", "viewModelFactory", "<init>", "(Lxy3;)V", "viewState", "Lzy11;", "renderBottomSheet", "(Lcz3;)V", "createViewModel", "()Lcom/ybsdk/feature/autotopup/internal/presentation/result/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lzz51;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "render", "Lxy3;", "Lcom/ybsdk/feature/autotopup/internal/presentation/result/AutoTopupResultParams;", "screenArguments$delegate", "Li3y;", "getScreenArguments", "()Lcom/ybsdk/feature/autotopup/internal/presentation/result/AutoTopupResultParams;", "screenArguments", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "bottomSheetDialogView", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AutoTopupResultFragment extends BaseMvvmFragment<zz51, cz3, b> {
    private BottomSheetDialogView bottomSheetDialogView;

    /* renamed from: screenArguments$delegate, reason: from kotlin metadata */
    private final i3y screenArguments;
    private final xy3 viewModelFactory;

    public AutoTopupResultFragment(xy3 xy3Var) {
        super(Boolean.FALSE, null, null, null, b.class, 14, null);
        this.viewModelFactory = xy3Var;
        this.screenArguments = dcs.c(this);
    }

    private final AutoTopupResultParams getScreenArguments() {
        return (AutoTopupResultParams) this.screenArguments.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(AutoTopupResultFragment autoTopupResultFragment, View view) {
        autoTopupResultFragment.getViewModel().h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(AutoTopupResultFragment autoTopupResultFragment, View view) {
        autoTopupResultFragment.getViewModel().i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$2(AutoTopupResultFragment autoTopupResultFragment) {
        autoTopupResultFragment.getViewModel().g0();
        return zy11.a;
    }

    private final void renderBottomSheet(cz3 viewState) {
        BottomSheetDialogView.State b = viewState.b();
        BottomSheetDialogView bottomSheetDialogView = this.bottomSheetDialogView;
        if (b == null) {
            if (bottomSheetDialogView != null) {
                bottomSheetDialogView.dismiss();
            }
            this.bottomSheetDialogView = null;
            return;
        }
        if (bottomSheetDialogView == null) {
            BottomSheetDialogView bottomSheetDialogView2 = new BottomSheetDialogView(requireContext(), null, 0, 6, null);
            bottomSheetDialogView2.onPrimaryAction(new vy3(this, 2));
            bottomSheetDialogView2.onDismiss(new eo1(25, this));
            BottomSheetDialogView.show$default(bottomSheetDialogView2, requireActivity(), null, 2, null);
            this.bottomSheetDialogView = bottomSheetDialogView2;
        }
        BottomSheetDialogView bottomSheetDialogView3 = this.bottomSheetDialogView;
        if (bottomSheetDialogView3 != null) {
            bottomSheetDialogView3.render(viewState.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderBottomSheet$lambda$7$lambda$5(AutoTopupResultFragment autoTopupResultFragment, View view) {
        autoTopupResultFragment.getViewModel().e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderBottomSheet$lambda$7$lambda$6(AutoTopupResultFragment autoTopupResultFragment, boolean z) {
        autoTopupResultFragment.getViewModel().d0();
        return zy11.a;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public b getFactoryOfViewModel() {
        return ((bz3) this.viewModelFactory).a(getScreenArguments());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((zz51) getBinding()).g.setOnClickListener(new vy3(this, 0));
        ((zz51) getBinding()).i.setOnClickListener(new vy3(this, 1));
        ((zz51) getBinding()).j.setOnCloseButtonClickListener(new f02(9, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(cz3 viewState) {
        zz51 zz51Var = (zz51) getBinding();
        rbv d = viewState.d();
        ImageView imageView = zz51Var.k;
        OperationProgressView operationProgressView = zz51Var.f;
        OperationProgressView operationProgressView2 = zz51Var.h;
        YbButtonView ybButtonView = zz51Var.i;
        YbButtonView ybButtonView2 = zz51Var.g;
        TextView textView = zz51Var.c;
        TextView textView2 = zz51Var.b;
        TextView textView3 = zz51Var.d;
        v4b1.k(d, imageView, null, null, 6);
        Text a = viewState.a();
        CharSequence a2 = a != null ? d.a(requireContext(), a) : null;
        boolean z = a2 == null || evu0.J(a2);
        Text j = viewState.j();
        textView3.setText(j != null ? d.a(requireContext(), j) : null);
        textView3.setVisibility(z ? 0 : 8);
        textView2.setVisibility(!z ? 0 : 8);
        Text a3 = viewState.a();
        textView2.setText(a3 != null ? d.a(requireContext(), a3) : null);
        textView.setVisibility(viewState.c() == null ? 4 : 0);
        Text c = viewState.c();
        textView.setText(c != null ? d.a(requireContext(), c) : null);
        ybButtonView2.setVisibility(viewState.f() != null ? 0 : 8);
        YbButtonView.a f = viewState.f();
        if (f != null) {
            ybButtonView2.render(f);
        }
        ybButtonView.setVisibility(viewState.h() != null ? 0 : 8);
        YbButtonView.a h = viewState.h();
        if (h != null) {
            ybButtonView.render(h);
        }
        operationProgressView2.render(viewState.g());
        operationProgressView.render(viewState.e());
        operationProgressView2.setVisibility(viewState.g().equals(pc70.a) ? 0 : 8);
        operationProgressView.setVisibility(!viewState.e().equals(oc70.a) ? 0 : 8);
        zz51Var.k.setVisibility(!viewState.i() ? 0 : 8);
        zz51Var.e.p().setVisibility(viewState.i() ? 0 : 8);
        renderBottomSheet(viewState);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public zz51 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return zz51.o(inflater, container);
    }
}
