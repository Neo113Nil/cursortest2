package xsna;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FullscreenOnboardingScope.kt */
/* loaded from: classes17.dex */
public final class jys implements gys {
    public final ArrayList a = new ArrayList();
    public final SnapshotStateList<q0l0> b = new SnapshotStateList<>();
    public final wh50 c = androidx.compose.runtime.k.b(null);
    public final wh50 d = androidx.compose.runtime.k.b(Boolean.FALSE);

    @Override // xsna.gys
    public final void a(List list, jai jaiVar) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            this.a.add(new q0l0(new jai(1858535103, new hys(this, jaiVar, obj, 0), true)));
            i = i2;
        }
    }

    @Override // xsna.gys
    public final mc90 b() {
        return (mc90) ((zak0) this.c).getValue();
    }
}
