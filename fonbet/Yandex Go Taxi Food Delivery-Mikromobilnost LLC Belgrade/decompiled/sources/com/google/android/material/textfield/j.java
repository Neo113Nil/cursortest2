package com.google.android.material.textfield;

/* loaded from: classes11.dex */
public final class j implements Runnable {
    public final /* synthetic */ TextInputLayout a;

    public j(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EndCompoundLayout endCompoundLayout;
        endCompoundLayout = this.a.endLayout;
        endCompoundLayout.checkEndIcon();
    }
}
