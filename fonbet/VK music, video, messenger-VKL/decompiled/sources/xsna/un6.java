package xsna;

import android.app.Activity;
import com.vk.music.player.PlaybackActionMeta;
import xsna.c63;

/* compiled from: BaseSnippetPlayer.kt */
/* loaded from: classes3.dex */
public final class un6 extends c63.b {
    public boolean b;
    public final /* synthetic */ dx40 c;
    public final /* synthetic */ vn6 d;

    public un6(fck0 fck0Var, dx40 dx40Var, vn6 vn6Var) {
        this.c = dx40Var;
        this.d = vn6Var;
    }

    @Override // xsna.c63.b
    public final void u() {
        if (this.c.getState().j()) {
            this.b = true;
            this.d.j(1);
        }
    }

    @Override // xsna.c63.b
    public final void x(Activity activity) {
        if (this.b) {
            this.b = false;
            this.d.m(new PlaybackActionMeta(0, 0L, 2, null));
        }
    }
}
