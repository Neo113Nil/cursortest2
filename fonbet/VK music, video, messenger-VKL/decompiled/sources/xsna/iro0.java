package xsna;

import android.view.ViewGroup;
import com.vk.channels.impl.comments.e;
import com.vkontakte.android.R;

/* compiled from: ThreadShowMoreAdapterDelegate.kt */
/* loaded from: classes16.dex */
public final class iro0 extends p1u0<kro0> {
    public final e.a a;

    public iro0(e.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends kro0> b(ViewGroup viewGroup) {
        return new jro0(bwt0.I(R.layout.im_thread_show_more_item, viewGroup, false), this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof kro0;
    }
}
