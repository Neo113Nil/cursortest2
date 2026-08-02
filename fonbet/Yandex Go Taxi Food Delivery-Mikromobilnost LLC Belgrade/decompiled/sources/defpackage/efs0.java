package defpackage;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes13.dex */
public final class efs0 {
    public final SparseArray a = new SparseArray();

    public final void a(int i, View view) {
        SparseArray sparseArray = this.a;
        Pair pair = (Pair) sparseArray.get(i, null);
        if (pair == null) {
            Pair pair2 = new Pair(5, new ArrayList());
            sparseArray.put(i, pair2);
            pair = pair2;
        }
        if (((List) pair.f()).size() < ((Number) pair.c()).intValue()) {
            ((List) pair.f()).add(view);
        }
    }

    public final View b(int i) {
        Pair pair = (Pair) this.a.get(i, null);
        if (pair == null || ((List) pair.f()).isEmpty()) {
            return null;
        }
        return (View) ((List) pair.f()).remove(scc.f((List) pair.f()));
    }
}
