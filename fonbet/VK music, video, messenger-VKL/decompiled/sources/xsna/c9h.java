package xsna;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: CommunityLiveCoverUpdateDispatcher.kt */
/* loaded from: classes5.dex */
public final class c9h implements ggz {
    public final List<gwh<?, ?>> b;
    public final RecyclerView.Adapter<?> c;
    public final int d;
    public final int e;

    public c9h(r8h r8hVar, List list, RecyclerView.Adapter adapter) {
        this.b = list;
        this.c = adapter;
        int i = r8hVar.c;
        int min = Math.min(i - (list.size() / 2), i - 2);
        int max = Math.max((list.size() / 2) + i, i + 2);
        this.d = min / list.size();
        this.e = max / list.size();
    }

    @Override // xsna.ggz
    public final void onChanged(int i, int i2, Object obj) {
        int i3 = this.d;
        int i4 = this.e;
        if (i3 > i4) {
            return;
        }
        while (true) {
            this.c.notifyItemRangeChanged((this.b.size() * i3) + i, i2, obj);
            if (i3 == i4) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // xsna.ggz
    public final void onInserted(int i, int i2) {
        int i3 = this.d;
        int i4 = this.e;
        if (i3 > i4) {
            return;
        }
        while (true) {
            this.c.notifyItemRangeInserted((this.b.size() * i3) + i, i2);
            if (i3 == i4) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // xsna.ggz
    public final void onMoved(int i, int i2) {
        int i3 = this.d;
        int i4 = this.e;
        if (i3 > i4) {
            return;
        }
        while (true) {
            List<gwh<?, ?>> list = this.b;
            this.c.notifyItemMoved((list.size() * i3) + i, (list.size() * i3) + i2);
            if (i3 == i4) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // xsna.ggz
    public final void onRemoved(int i, int i2) {
        int i3 = this.d;
        int i4 = this.e;
        if (i3 > i4) {
            return;
        }
        while (true) {
            this.c.notifyItemRangeRemoved((this.b.size() * i3) + i, i2);
            if (i3 == i4) {
                return;
            } else {
                i3++;
            }
        }
    }
}
