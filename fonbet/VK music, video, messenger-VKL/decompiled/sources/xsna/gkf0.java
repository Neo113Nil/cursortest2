package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: RecyclerViewUtil.java */
/* loaded from: classes3.dex */
public final class gkf0 {
    public static int a(RecyclerView recyclerView) {
        Object layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return -1;
        }
        if (layoutManager instanceof hmr) {
            return ((hmr) layoutManager).d();
        }
        if (layoutManager.getClass() == LinearLayoutManager.class || (layoutManager instanceof LinearLayoutManager)) {
            return ((LinearLayoutManager) layoutManager).v();
        }
        return -1;
    }

    public static int b(RecyclerView recyclerView) {
        Object layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return -1;
        }
        if (layoutManager instanceof gmy) {
            return ((gmy) layoutManager).e();
        }
        if (layoutManager.getClass() == LinearLayoutManager.class || (layoutManager instanceof LinearLayoutManager)) {
            return ((LinearLayoutManager) layoutManager).x();
        }
        return -1;
    }
}
