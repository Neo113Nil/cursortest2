package xsna;

import com.vk.voip.ui.broadcast.list.ui.PastBroadcastsFragment;
import xsna.ro90;

/* compiled from: PastBroadcastsPagingScrollListener.kt */
/* loaded from: classes7.dex */
public final class mo90 implements df90 {
    public final PastBroadcastsFragment.d b;
    public final int c = 5;

    public mo90(PastBroadcastsFragment.d dVar) {
        this.b = dVar;
    }

    @Override // xsna.df90
    public final void e(int i, int i2, int i3, int i4) {
        if (i - this.c > i3 || i3 > i) {
            return;
        }
        this.b.a(ro90.b.a);
    }

    @Override // xsna.df90
    public final void l(int i) {
    }
}
