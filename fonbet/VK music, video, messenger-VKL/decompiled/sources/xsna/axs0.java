package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: VideoMsgGetAllStencilsFromCacheCmd.kt */
/* loaded from: classes2.dex */
public final class axs0 extends le6<List<? extends e0l0>> {
    @Override // xsna.le6
    public final List<? extends e0l0> e(w2w w2wVar) {
        List<j0l0> all = w2wVar.I0().x().getAll();
        ArrayList arrayList = new ArrayList(c5g.u(all, 10));
        for (j0l0 j0l0Var : all) {
            arrayList.add(new e0l0(j0l0Var.a, j0l0Var.b));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        return obj instanceof axs0;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return 0;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "VideoMsgGetAllStencilsFromCacheCmd";
    }
}
