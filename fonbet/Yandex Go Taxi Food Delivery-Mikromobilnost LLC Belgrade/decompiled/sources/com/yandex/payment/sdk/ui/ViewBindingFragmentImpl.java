package com.yandex.payment.sdk.ui;

import androidx.fragment.app.Fragment;
import defpackage.ny61;
import defpackage.zo31;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\u0005R$\u0010\b\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/yandex/payment/sdk/ui/ViewBindingFragmentImpl;", "Lzo31;", "VB", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lzy11;", "onDestroyView", "currentBinding", "Lzo31;", "getCurrentBinding", "()Lzo31;", "setCurrentBinding", "(Lzo31;)V", "getBinding", "binding", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ViewBindingFragmentImpl<VB extends zo31> extends Fragment {
    private VB currentBinding;

    public final VB getBinding() {
        VB vb = this.currentBinding;
        if (vb != null) {
            return vb;
        }
        ny61.t("Binding is not initialized");
        return null;
    }

    public final VB getCurrentBinding() {
        return this.currentBinding;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.currentBinding = null;
    }

    public final void setCurrentBinding(VB vb) {
        this.currentBinding = vb;
    }
}
