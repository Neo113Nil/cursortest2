package xsna;

import android.view.ActionMode;

/* compiled from: Effects.kt */
/* loaded from: classes11.dex */
public final class cd2 implements kgn {
    public final /* synthetic */ uc2 a;

    public cd2(uc2 uc2Var) {
        this.a = uc2Var;
    }

    @Override // xsna.kgn
    public final void dispose() {
        uc2 uc2Var = this.a;
        ibk0 ibk0Var = uc2Var.e;
        cak0 cak0Var = ibk0Var.h;
        if (cak0Var != null) {
            cak0Var.dispose();
        }
        ibk0Var.a();
        ActionMode actionMode = uc2Var.h;
        if (actionMode != null) {
            actionMode.finish();
        }
        uc2Var.h = null;
    }
}
