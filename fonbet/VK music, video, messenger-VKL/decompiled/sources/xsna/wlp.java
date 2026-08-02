package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: EngineViewHoldersProvider.kt */
/* loaded from: classes17.dex */
public final class wlp {
    public final q8e a;
    public final LinearLayoutManager b;

    public wlp(q8e q8eVar, LinearLayoutManager linearLayoutManager) {
        this.a = q8eVar;
        this.b = linearLayoutManager;
    }

    public final e9d a(int i) {
        Object findViewHolderForLayoutPosition = this.a.findViewHolderForLayoutPosition(i);
        if (findViewHolderForLayoutPosition == null || this.b.v() == -1 || !(findViewHolderForLayoutPosition instanceof e9d)) {
            return null;
        }
        return (e9d) findViewHolderForLayoutPosition;
    }
}
