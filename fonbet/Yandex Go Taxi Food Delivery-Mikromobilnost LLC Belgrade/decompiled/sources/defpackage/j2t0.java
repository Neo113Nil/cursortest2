package defpackage;

import androidx.compose.runtime.snapshots.SnapshotApplyConflictException;

/* loaded from: classes.dex */
public final class j2t0 extends qke {
    public final mz40 t;

    public j2t0(mz40 mz40Var) {
        this.t = mz40Var;
    }

    @Override // defpackage.qke
    public final void g() {
        mz40 mz40Var = this.t;
        mz40Var.c();
        throw new SnapshotApplyConflictException(mz40Var);
    }
}
