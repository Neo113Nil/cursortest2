package xsna;

import androidx.recyclerview.widget.m;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: StoryStatisticsViewersAdapter.kt */
/* loaded from: classes6.dex */
public final class pxm extends m.b {
    public final List<s3u0> b;
    public final List<s3u0> c;
    public final txm d;

    public pxm(List list, ListBuilder listBuilder, txm txmVar) {
        this.b = list;
        this.c = listBuilder;
        this.d = txmVar;
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areContentsTheSame(int i, int i2) {
        return this.d.areContentsTheSame(this.b.get(i), this.c.get(i2));
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areItemsTheSame(int i, int i2) {
        return this.d.areItemsTheSame(this.b.get(i), this.c.get(i2)) && i == i2;
    }

    @Override // androidx.recyclerview.widget.m.b
    public final Object getChangePayload(int i, int i2) {
        return this.d.getChangePayload(this.b.get(i), this.c.get(i2));
    }

    @Override // androidx.recyclerview.widget.m.b
    public final int getNewListSize() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.m.b
    public final int getOldListSize() {
        return this.b.size();
    }
}
