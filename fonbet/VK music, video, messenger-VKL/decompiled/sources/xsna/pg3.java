package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;
import xsna.fi3;

/* compiled from: ArchiveChannelLoadMoreAdapterDelegate.kt */
/* loaded from: classes15.dex */
public final class pg3 extends p1u0<fi3.c> {

    /* compiled from: ArchiveChannelLoadMoreAdapterDelegate.kt */
    public static final class a extends vfz<fi3.c> {
        @Override // xsna.vfz
        public final /* bridge */ /* synthetic */ void W5(fi3.c cVar) {
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends fi3.c> b(ViewGroup viewGroup) {
        return new a(bwt0.I(R.layout.im_archive_channel_load_more_item, viewGroup, false));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof fi3.c;
    }
}
