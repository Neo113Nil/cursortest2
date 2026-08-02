package com.google.android.material.textfield;

import android.util.SparseArray;
import defpackage.dfz0;
import defpackage.z2i0;

/* loaded from: classes11.dex */
public final class f {
    public final SparseArray a = new SparseArray();
    public final EndCompoundLayout b;
    public final int c;
    public final int d;

    public f(EndCompoundLayout endCompoundLayout, dfz0 dfz0Var) {
        this.b = endCompoundLayout;
        this.c = dfz0Var.b.getResourceId(z2i0.TextInputLayout_endIconDrawable, 0);
        this.d = dfz0Var.b.getResourceId(z2i0.TextInputLayout_passwordToggleDrawable, 0);
    }
}
