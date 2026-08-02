package xsna;

import androidx.compose.runtime.snapshots.SnapshotApplyConflictException;

/* compiled from: Snapshot.kt */
/* loaded from: classes11.dex */
public abstract class eak0 {

    /* compiled from: Snapshot.kt */
    public static final class a extends eak0 {
        public final uh50 a;

        public a(uh50 uh50Var) {
            this.a = uh50Var;
        }

        @Override // xsna.eak0
        public final void a() {
            uh50 uh50Var = this.a;
            uh50Var.c();
            throw new SnapshotApplyConflictException(uh50Var);
        }
    }

    public abstract void a();

    /* compiled from: Snapshot.kt */
    public static final class b extends eak0 {
        public static final b a = new b();

        @Override // xsna.eak0
        public final void a() {
        }
    }
}
