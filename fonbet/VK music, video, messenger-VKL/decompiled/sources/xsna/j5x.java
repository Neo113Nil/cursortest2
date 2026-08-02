package xsna;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* compiled from: InspectorDialogFragment.kt */
/* loaded from: classes18.dex */
public final class j5x extends androidx.fragment.app.d {
    public static boolean y;
    public final izs<Context, View> x;

    /* JADX WARN: Multi-variable type inference failed */
    public j5x(izs<? super Context, ? extends View> izsVar) {
        this.x = izsVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View invoke = this.x.invoke(kn());
        if (viewGroup != null) {
            viewGroup.addView(invoke, new ViewGroup.LayoutParams(-1, -1));
        }
        return invoke;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        y = false;
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        y = true;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = this.s;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -2);
        }
        y = true;
    }
}
