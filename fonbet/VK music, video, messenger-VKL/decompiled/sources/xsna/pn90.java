package xsna;

import com.vk.voip.ui.asr.ui.list.PastAsrListFragment;
import xsna.hn90;

/* compiled from: PastAsrPagingScrollListener.kt */
/* loaded from: classes7.dex */
public final class pn90 implements df90 {
    public final PastAsrListFragment.c b;
    public final int c = 20;

    public pn90(PastAsrListFragment.c cVar) {
        this.b = cVar;
    }

    @Override // xsna.df90
    public final void e(int i, int i2, int i3, int i4) {
        if (i - this.c > i3 || i3 > i) {
            return;
        }
        this.b.a(hn90.d.a);
    }

    @Override // xsna.df90
    public final void l(int i) {
    }
}
