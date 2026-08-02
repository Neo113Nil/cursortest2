package com.ybsdk.screens.registration.applicationstatus.presentation;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.widgets.common.ErrorView;
import defpackage.b761;
import defpackage.dcs;
import defpackage.lfx;
import defpackage.ny61;
import defpackage.oqi0;
import defpackage.rqi0;
import defpackage.sqi0;
import defpackage.tvg0;
import defpackage.y8f;
import defpackage.yr31;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/screens/registration/applicationstatus/presentation/RegistrationApplicationStatusFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lb761;", "Lsqi0;", "Lcom/ybsdk/screens/registration/applicationstatus/presentation/c;", "Loqi0;", "viewModelFactory", "<init>", "(Loqi0;)V", "createViewModel", "()Lcom/ybsdk/screens/registration/applicationstatus/presentation/c;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lb761;", "viewState", "Lzy11;", "render", "(Lsqi0;)V", "Loqi0;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RegistrationApplicationStatusFragment extends BaseMvvmFragment<b761, sqi0, c> {
    private final oqi0 viewModelFactory;

    public RegistrationApplicationStatusFragment(oqi0 oqi0Var) {
        super(null, null, null, null, c.class, 15, null);
        this.viewModelFactory = oqi0Var;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public c getFactoryOfViewModel() {
        return ((rqi0) this.viewModelFactory).a((RegistrationApplicationStatusScreenParams) dcs.a(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public b761 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        b761 o = b761.o(inflater, container);
        ErrorView errorView = o.b;
        errorView.setPrimaryButtonOnClickListener(new RegistrationApplicationStatusFragment$getViewBinding$1$1(getViewModel()));
        errorView.setSecondaryButtonClickListener(new RegistrationApplicationStatusFragment$getViewBinding$1$2(getViewModel()));
        return o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(sqi0 viewState) {
        com.ybsdk.core.utils.ext.view.b.c(((b761) getBinding()).c, viewState.d(), 0L, 8, 0L, null, 26);
        boolean z = viewState.d() && viewState.c() != null;
        boolean z2 = viewState.d() && viewState.b() != null;
        if (z || z2) {
            CircularProgressIndicator circularProgressIndicator = ((b761) getBinding()).c;
            ViewGroup.LayoutParams layoutParams = circularProgressIndicator.getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, getResources().getDimensionPixelSize(tvg0.ybsdk_margin_progress_view_bottom));
                circularProgressIndicator.setLayoutParams(marginLayoutParams);
            }
        }
        TextView textView = ((b761) getBinding()).e;
        textView.setVisibility(z ? 0 : 8);
        Text c = viewState.c();
        textView.setText(c != null ? d.a(requireContext(), c) : null);
        TextView textView2 = ((b761) getBinding()).d;
        com.ybsdk.core.utils.ext.view.b.c(textView2, z2, 0L, 8, 0L, null, 26);
        Text b = viewState.b();
        textView2.setText(b != null ? d.a(requireContext(), b) : null);
        ((b761) getBinding()).b.render(viewState.a());
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
