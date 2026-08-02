package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.superapp.ui.SuperAppTilesRowLayoutManager;

/* compiled from: SuperAppUiViewedTimeChecker.kt */
/* loaded from: classes6.dex */
public final class rcn0<ItemKey> extends c2q0<ItemKey> {
    @Override // xsna.c2q0, xsna.jm6
    public final ItemKey c(RecyclerView.e0 e0Var) {
        if (e0Var instanceof ncn0) {
            return null;
        }
        return (ItemKey) super.c(e0Var);
    }

    @Override // xsna.c2q0
    public final boolean i(RecyclerView.o oVar) {
        return super.i(oVar) || (oVar instanceof SuperAppTilesRowLayoutManager) || (oVar instanceof l470);
    }
}
