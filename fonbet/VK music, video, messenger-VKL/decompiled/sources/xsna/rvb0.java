package xsna;

import java.util.ArrayList;

/* compiled from: PoolingContainer.kt */
/* loaded from: classes12.dex */
public final class rvb0 {
    public final ArrayList<qvb0> a = new ArrayList<>();

    public final void a(nut0 nut0Var) {
        this.a.add(nut0Var);
    }

    public final void b() {
        ArrayList<qvb0> arrayList = this.a;
        for (int h = e43.h(arrayList); -1 < h; h--) {
            arrayList.get(h).a();
        }
    }
}
