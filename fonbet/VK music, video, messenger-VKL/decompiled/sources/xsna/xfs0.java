package xsna;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.wfs0;

/* compiled from: VideoDiscoveryCatalogScrollSensorDelegate.kt */
/* loaded from: classes7.dex */
public final class xfs0 {
    public static final Pair a(RecyclerView recyclerView, int i, List list) {
        int childCount = recyclerView.getChildCount();
        boolean z = true;
        boolean z2 = false;
        int i2 = -1;
        for (int i3 = 0; i3 < childCount; i3++) {
            RecyclerView.e0 childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i3));
            if (childViewHolder instanceof wfs0.a) {
                i2 = childViewHolder.itemView.getTop();
                z = false;
            }
        }
        if (z) {
            Integer num = null;
            if (list != null) {
                Iterator it = list.iterator();
                int i4 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i4 = -1;
                        break;
                    }
                    Object next = it.next();
                    if (i4 < 0) {
                        e43.t();
                        throw null;
                    }
                    if (((hfz) next) instanceof vfs0) {
                        break;
                    }
                    i4++;
                }
                if (i4 != -1) {
                    num = Integer.valueOf(i4);
                }
            }
            if (num != null && num.intValue() > i) {
                i2 = 1073741823;
                return new Pair(Boolean.valueOf(z2), Integer.valueOf(i2));
            }
        }
        z2 = z;
        return new Pair(Boolean.valueOf(z2), Integer.valueOf(i2));
    }

    public static final Pair<Boolean, Integer> b(RecyclerView recyclerView, List<? extends hfz> list) {
        int a = gkf0.a(recyclerView);
        Integer valueOf = Integer.valueOf(a);
        if (a == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            int b = gkf0.b(recyclerView);
            Integer valueOf2 = Integer.valueOf(b);
            if (b == -1) {
                valueOf2 = null;
            }
            if (valueOf2 != null) {
                return a(recyclerView, valueOf2.intValue(), list);
            }
        }
        return null;
    }
}
