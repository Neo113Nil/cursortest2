package xsna;

/* compiled from: StoryStatisticsStickersAdapter.kt */
/* loaded from: classes6.dex */
public final class dhm0 extends wx3 implements vic {
    @Override // xsna.qul, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        hfz hfzVar = this.h.f.get(i);
        if (hfzVar instanceof ual0) {
            return 1;
        }
        if (hfzVar instanceof zem0) {
            return 2;
        }
        if (hfzVar instanceof val0) {
            return 3;
        }
        return super.getItemViewType(i);
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
    }
}
