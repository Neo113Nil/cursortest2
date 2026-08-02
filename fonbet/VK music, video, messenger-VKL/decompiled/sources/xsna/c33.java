package xsna;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: AppCompatDialogFragment.java */
/* loaded from: classes11.dex */
public class c33 extends androidx.fragment.app.d {
    @Override // androidx.fragment.app.d
    public void Cn(@NonNull Dialog dialog, int i) {
        if (!(dialog instanceof b33)) {
            super.Cn(dialog, i);
            return;
        }
        b33 b33Var = (b33) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        b33Var.m(1);
    }

    @Override // androidx.fragment.app.d
    @NonNull
    public Dialog yn(@Nullable Bundle bundle) {
        return new b33(mo2getContext(), vn());
    }
}
