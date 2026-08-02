package xsna;

import java.util.List;
import java.util.Map;

/* compiled from: ComposingGetAllCmd.kt */
/* loaded from: classes.dex */
public final class asi extends le6<Map<Long, ? extends List<? extends vh30>>> {
    @Override // xsna.le6
    public final Map<Long, ? extends List<? extends vh30>> e(w2w w2wVar) {
        return pn00.t(w2wVar.U0().a());
    }

    public final boolean equals(Object obj) {
        return obj instanceof asi;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return 1981633249;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ComposingGetAllCmd()";
    }
}
