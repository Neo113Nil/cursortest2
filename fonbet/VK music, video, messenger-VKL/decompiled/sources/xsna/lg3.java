package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;
import xsna.fi3;

/* compiled from: ArchiveChannelItemAdapterDelegate.kt */
/* loaded from: classes15.dex */
public final class lg3 extends p1u0<fi3.b> {
    public final m0g0 a;

    public lg3(m0g0 m0g0Var) {
        this.a = m0g0Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends fi3.b> b(ViewGroup viewGroup) {
        return new og3(tf3.b(viewGroup, R.layout.im_archive_channel_item, viewGroup, false), this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof fi3.b;
    }
}
