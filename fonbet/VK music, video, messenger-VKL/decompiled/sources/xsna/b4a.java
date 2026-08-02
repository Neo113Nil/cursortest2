package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;

/* compiled from: CatalogDecorationUtils.kt */
/* loaded from: classes16.dex */
public final class b4a {
    public static lca a(RecyclerView.Adapter adapter) {
        if (adapter instanceof lca) {
            return (lca) adapter;
        }
        if (adapter instanceof pd90) {
            return a(((pd90) adapter).c);
        }
        if (!(adapter instanceof androidx.recyclerview.widget.z)) {
            return null;
        }
        ((androidx.recyclerview.widget.z) adapter).getClass();
        return a(null);
    }

    public static UIBlock b(int i, RecyclerView.Adapter adapter) {
        if (adapter instanceof lca) {
            return (UIBlock) ((lca) adapter).c.c(i);
        }
        if (adapter instanceof pd90) {
            return b(i, a(adapter));
        }
        if (!(adapter instanceof androidx.recyclerview.widget.z)) {
            return null;
        }
        ((androidx.recyclerview.widget.z) adapter).getClass();
        throw null;
    }

    public static int c(RecyclerView.Adapter adapter) {
        if (adapter instanceof lca) {
            return ((lca) adapter).getItemCount();
        }
        if (adapter instanceof pd90) {
            return c(((pd90) adapter).c);
        }
        if (!(adapter instanceof androidx.recyclerview.widget.z)) {
            return 0;
        }
        ((androidx.recyclerview.widget.z) adapter).getClass();
        return Integer.MAX_VALUE;
    }
}
