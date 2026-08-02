package xsna;

import androidx.recyclerview.widget.RecyclerView;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: MergableRecyclerAdapterExt.kt */
/* loaded from: classes8.dex */
public final class w820 {
    public static final RecyclerView.Adapter<?> a(RecyclerView recyclerView, int i) {
        UsableRecyclerView usableRecyclerView = recyclerView instanceof UsableRecyclerView ? (UsableRecyclerView) recyclerView : null;
        RecyclerView.Adapter adapter = usableRecyclerView != null ? usableRecyclerView.getAdapter() : null;
        pd90 pd90Var = adapter instanceof pd90 ? (pd90) adapter : null;
        Object obj = pd90Var != null ? pd90Var.c : null;
        a920 a920Var = obj instanceof a920 ? (a920) obj : null;
        if (a920Var == null) {
            return null;
        }
        return a920Var.L0(i);
    }
}
