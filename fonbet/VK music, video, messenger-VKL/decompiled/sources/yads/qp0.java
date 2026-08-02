package yads;

import androidx.media3.common.PlaybackException;
import java.util.LinkedHashMap;
import kotlin.Pair;
import xsna.jza0;

/* loaded from: classes10.dex */
public final class qp0 implements jza0.b {
    public boolean a;
    public boolean b;
    public boolean c;
    public final /* synthetic */ sp0 d;

    public qp0(sp0 sp0Var) {
        this.d = sp0Var;
    }

    @Override // xsna.jza0.b
    public final void onIsPlayingChanged(boolean z) {
        if (!z) {
            if (this.b) {
                return;
            }
            this.c = true;
            sp0 sp0Var = this.d;
            og3 og3Var = sp0Var.k;
            gg3 gg3Var = sp0Var.j;
            if (og3Var == null || gg3Var == null) {
                return;
            }
            og3Var.i();
            return;
        }
        if (!this.a) {
            sp0 sp0Var2 = this.d;
            og3 og3Var2 = sp0Var2.k;
            gg3 gg3Var2 = sp0Var2.j;
            if (og3Var2 == null || gg3Var2 == null) {
                return;
            }
            this.a = true;
            og3Var2.c();
            return;
        }
        if (this.c) {
            this.c = false;
            sp0 sp0Var3 = this.d;
            og3 og3Var3 = sp0Var3.k;
            gg3 gg3Var3 = sp0Var3.j;
            if (og3Var3 == null || gg3Var3 == null) {
                return;
            }
            og3Var3.f();
        }
    }

    @Override // xsna.jza0.b
    public final void onPlaybackStateChanged(int i) {
        if (i == 2) {
            this.b = true;
            sp0 sp0Var = this.d;
            og3 og3Var = sp0Var.k;
            gg3 gg3Var = sp0Var.j;
            if (og3Var == null || gg3Var == null) {
                return;
            }
            og3Var.b();
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            this.a = false;
            sp0 sp0Var2 = this.d;
            og3 og3Var2 = sp0Var2.k;
            gg3 gg3Var2 = sp0Var2.j;
            if (og3Var2 == null || gg3Var2 == null) {
                return;
            }
            og3Var2.d();
            return;
        }
        ((ad2) this.d.g.b).a();
        sp0 sp0Var3 = this.d;
        og3 og3Var3 = sp0Var3.k;
        gg3 gg3Var3 = sp0Var3.j;
        if (og3Var3 != null && gg3Var3 != null) {
            og3Var3.h();
        }
        if (this.b) {
            this.b = false;
            sp0 sp0Var4 = this.d;
            og3 og3Var4 = sp0Var4.k;
            gg3 gg3Var4 = sp0Var4.j;
            if (og3Var4 == null || gg3Var4 == null) {
                return;
            }
            og3Var4.a();
        }
    }

    @Override // xsna.jza0.b
    public final void onPlayerError(PlaybackException playbackException) {
        sp0 sp0Var = this.d;
        p72 p72Var = sp0Var.h;
        p72 p72Var2 = sp0Var.i;
        Pair pair = (p72Var == null || p72Var2 == null) ? null : new Pair(p72Var, p72Var2);
        if (pair != null && !sp0Var.l.contains(pair)) {
            this.d.l.add(pair);
            this.d.a((gg3) pair.j());
            return;
        }
        this.a = false;
        ((ad2) this.d.g.b).a();
        this.d.a.stop();
        String message = playbackException.getMessage();
        uj3 uj3Var = this.d.c;
        gp2 a = uj3Var.b.a();
        a.b(message, "error_message");
        uj3Var.a.a(new fp2(dp2.l.a(), new LinkedHashMap(a.a), a.b));
        sp0 sp0Var2 = this.d;
        og3 og3Var = sp0Var2.k;
        gg3 gg3Var = sp0Var2.j;
        if (og3Var == null || gg3Var == null) {
            return;
        }
        sp0Var2.d.getClass();
        og3Var.a(new ng3(p62.a(playbackException), playbackException));
    }
}
