package xsna;

import androidx.compose.runtime.snapshots.SnapshotStateList;

/* compiled from: ContextMenuUi.kt */
/* loaded from: classes11.dex */
public final class boj {
    public final SnapshotStateList<yzs<mnj, androidx.compose.runtime.a, Integer, s3q0>> a = new SnapshotStateList<>();

    public static void b(boj bojVar, wzs wzsVar, jai jaiVar, gzs gzsVar, int i) {
        if ((i & 8) != 0) {
            jaiVar = null;
        }
        bojVar.a.add(new jai(-1789283891, new ynj(wzsVar, bojVar, jaiVar, gzsVar), true));
    }

    public final void a(mnj mnjVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-798501095);
        int i2 = (M.J(mnjVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-798501095, i2, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.Content (ContextMenuUi.kt:255)");
            }
            SnapshotStateList<yzs<mnj, androidx.compose.runtime.a, Integer, s3q0>> snapshotStateList = this.a;
            int size = snapshotStateList.size();
            for (int i3 = 0; i3 < size; i3++) {
                snapshotStateList.get(i3).invoke(mnjVar, M, Integer.valueOf(i2 & 14));
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mog(this, mnjVar, i, 1);
        }
    }
}
