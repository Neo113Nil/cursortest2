package xsna;

import androidx.compose.runtime.snapshots.SnapshotStateList;

/* compiled from: Effects.kt */
/* loaded from: classes11.dex */
public final class ci2 implements kgn {
    public final /* synthetic */ SnapshotStateList a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ mi2 c;

    public ci2(SnapshotStateList snapshotStateList, Object obj, mi2 mi2Var) {
        this.a = snapshotStateList;
        this.b = obj;
        this.c = mi2Var;
    }

    @Override // xsna.kgn
    public final void dispose() {
        SnapshotStateList snapshotStateList = this.a;
        Object obj = this.b;
        snapshotStateList.remove(obj);
        this.c.e.n(obj);
    }
}
