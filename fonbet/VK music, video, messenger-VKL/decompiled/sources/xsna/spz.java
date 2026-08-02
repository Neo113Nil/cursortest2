package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: LoadMoreAdapterDelegate.kt */
/* loaded from: classes16.dex */
public final class spz extends p1u0<xpz> {

    /* compiled from: LoadMoreAdapterDelegate.kt */
    public static final class a extends vfz<xpz> {
        @Override // xsna.vfz
        public final /* bridge */ /* synthetic */ void W5(xpz xpzVar) {
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends xpz> b(ViewGroup viewGroup) {
        return new a(bwt0.I(R.layout.im_channel_item_load_more_view, viewGroup, false));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof xpz;
    }
}
