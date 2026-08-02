package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: CardMergeAdapter.java */
/* loaded from: classes7.dex */
public class lt9 extends a920 implements mf7, jjv0 {
    public lt9(RecyclerView.Adapter... adapterArr) {
        for (RecyclerView.Adapter adapter : adapterArr) {
            K0(adapter);
        }
    }

    public int e0(int i) {
        Object L0 = L0(i);
        if (L0 instanceof mf7) {
            return ((mf7) L0).e0(N0(i));
        }
        return 0;
    }

    @Override // xsna.jjv0
    public final int n1(int i) {
        Object L0 = L0(i);
        if (L0 instanceof jjv0) {
            return ((jjv0) L0).n1(N0(i));
        }
        return 0;
    }

    @Override // xsna.jjv0
    public final int t(int i) {
        Object L0 = L0(i);
        if (L0 instanceof jjv0) {
            return ((jjv0) L0).n1(N0(i));
        }
        return 0;
    }
}
