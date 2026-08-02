package com.vkontakte.android.actionlinks.views.fragments;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import com.vk.core.fragments.FragmentImpl;
import xsna.dz20;
import xsna.mhy;
import xsna.tn9;

/* compiled from: WrappedView.kt */
/* loaded from: classes7.dex */
public class WrappedView extends FragmentImpl {
    public ItemsDialogWrapper N;
    public dz20 O;

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d
    public final void dismiss() {
        Window window;
        ItemsDialogWrapper itemsDialogWrapper = this.N;
        if (itemsDialogWrapper != null) {
            Dialog dialog = itemsDialogWrapper.s;
            mhy.d((dialog == null || (window = dialog.getWindow()) == null) ? null : window.getDecorView());
            ((Handler) itemsDialogWrapper.R.getValue()).postDelayed(new tn9(itemsDialogWrapper, 8), 300L);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        dz20 dz20Var = this.O;
        if (dz20Var != null) {
            dz20Var.Qc(getClass().getSimpleName());
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        dz20 dz20Var = this.O;
        if (dz20Var != null) {
            dz20Var.Ff(getClass().getSimpleName());
        }
    }
}
