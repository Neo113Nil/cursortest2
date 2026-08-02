package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;

/* compiled from: ClassifiedsUiScreenTimeTracker.kt */
/* loaded from: classes16.dex */
public final class hhc extends c2q0<fhc> {
    public final k00 u;

    public hhc(RecyclerView recyclerView, ihc ihcVar, boolean z, k00 k00Var) {
        super(recyclerView, ihcVar, z, (oac) null, new ghc(com.vk.metrics.eventtracking.b.a), 24);
        this.u = k00Var;
    }

    @Override // xsna.c2q0, xsna.jm6
    public final Object c(RecyclerView.e0 e0Var) {
        UIBlock uIBlock;
        Integer num;
        if (!(e0Var instanceof tca) || (uIBlock = ((tca) e0Var).n) == null || (num = (Integer) this.u.invoke(uIBlock)) == null) {
            return null;
        }
        return new fhc(num.intValue(), uIBlock);
    }
}
