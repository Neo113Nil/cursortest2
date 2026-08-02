package xsna;

import android.view.ViewGroup;
import com.vk.channels.impl.comments.e;
import com.vkontakte.android.R;

/* compiled from: ConnectionErrorAdapterDelegate.kt */
/* loaded from: classes16.dex */
public final class z3j extends p1u0<b4j> {
    public final e.a a;

    public z3j(e.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends b4j> b(ViewGroup viewGroup) {
        return new a4j(bwt0.I(R.layout.im_connection_error, viewGroup, false), this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof b4j;
    }
}
