package xsna;

import android.app.Activity;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import xsna.c63;
import xsna.k840;

/* compiled from: MusicStoriesPlayer.kt */
/* loaded from: classes3.dex */
public final class r850 extends c63.b {
    public boolean b;
    public final /* synthetic */ q850 c;

    public r850(q850 q850Var) {
        this.c = q850Var;
    }

    @Override // xsna.c63.b
    public final void u() {
        if (!o25.a().i().C || k840.a.i.b()) {
            return;
        }
        q850 q850Var = this.c;
        if (q850Var.d.e == PlayState.PLAYING) {
            this.b = true;
            q850Var.m(null, 1, false, false);
        }
    }

    @Override // xsna.c63.b
    public final void x(Activity activity) {
        if (this.b) {
            this.b = false;
            this.c.f(new PlaybackActionMeta(0, 0L, 2, null));
        }
    }
}
