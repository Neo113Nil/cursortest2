package xsna;

import androidx.recyclerview.widget.RecyclerView;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: ProfileItemDecoration.kt */
/* loaded from: classes5.dex */
public final class cyd0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final RecyclerView.Adapter<?> a(RecyclerView recyclerView, int i) {
        RecyclerView.Adapter<?> L0;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        a920 a920Var = null;
        a920 a920Var2 = adapter instanceof a920 ? (a920) adapter : null;
        if (a920Var2 == null) {
            UsableRecyclerView usableRecyclerView = recyclerView instanceof UsableRecyclerView ? (UsableRecyclerView) recyclerView : null;
            RecyclerView.Adapter adapter2 = usableRecyclerView != null ? usableRecyclerView.getAdapter() : null;
            pd90 pd90Var = adapter2 instanceof pd90 ? (pd90) adapter2 : null;
            a920 a920Var3 = pd90Var != null ? pd90Var.c : null;
            if (a920Var3 instanceof a920) {
                a920Var = a920Var3;
            }
        } else {
            a920Var = a920Var2;
        }
        return (a920Var == null || (L0 = a920Var.L0(i)) == null) ? recyclerView.getAdapter() : L0;
    }
}
