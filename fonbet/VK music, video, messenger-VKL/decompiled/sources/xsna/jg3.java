package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;
import xsna.fh3;
import xsna.fi3;

/* compiled from: ArchiveBannerAdapterDelegate.kt */
/* loaded from: classes15.dex */
public final class jg3 extends p1u0<fi3.a> {
    public final fh3.c a;
    public final boolean b;

    public jg3(fh3.c cVar, boolean z) {
        this.a = cVar;
        this.b = z;
    }

    @Override // xsna.p1u0
    public final vfz<? extends fi3.a> b(ViewGroup viewGroup) {
        return new kg3(tf3.b(viewGroup, R.layout.im_archive_banner_item, viewGroup, false), this.a, this.b);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof fi3.a;
    }
}
