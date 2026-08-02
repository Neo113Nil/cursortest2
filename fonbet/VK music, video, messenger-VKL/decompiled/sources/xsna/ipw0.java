package xsna;

import android.view.View;
import com.vk.voip.ui.history.friends.ui.VoipHistoryFriendsFragment;
import xsna.bqw0;

/* compiled from: VoipHistoryFriendsAdapter.kt */
/* loaded from: classes7.dex */
public final class ipw0 extends sxm implements vel0 {
    public final VoipHistoryFriendsFragment.c i;

    public ipw0(VoipHistoryFriendsFragment.c cVar) {
        this.i = cVar;
        x0(bqw0.e.class, new n1g0(16));
        x0(bqw0.a.class, new wfl0(7));
        x0(bqw0.b.class, new ukv0(this, 6));
        x0(bqw0.d.class, new t3v(28));
        x0(bqw0.c.class, new n9m0(this, 26));
    }

    @Override // xsna.vel0
    public final boolean V(int i) {
        return this.h.get(i) instanceof bqw0.e;
    }

    @Override // xsna.vel0
    public final void l(View view) {
    }

    @Override // xsna.vel0
    public final void b0(int i, View view) {
    }

    @Override // xsna.vel0
    public final void o(int i, View view) {
    }
}
