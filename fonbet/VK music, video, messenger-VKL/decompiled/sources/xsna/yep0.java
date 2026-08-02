package xsna;

import com.vk.music.player.PlayerTrack;
import java.util.Iterator;
import java.util.List;

/* compiled from: TrackActionHandler.kt */
/* loaded from: classes3.dex */
public final class yep0 {
    public final m840 a;
    public final agb0 b;
    public final uc4 c;
    public final kte0 d;
    public final List<izs<sx40, Boolean>> e = e43.l(new t9o0(4), new wep0(0), new hxm0(4), new xep0(0), new epj0(7), new awm0(4), new d7l0(7), new n0m0(6), new p6e0(9), new gky(29), new f6w(29));

    public yep0(m840 m840Var, agb0 agb0Var, uc4 uc4Var, kte0 kte0Var) {
        this.a = m840Var;
        this.b = agb0Var;
        this.c = uc4Var;
        this.d = kte0Var;
    }

    public final n10 a(PlayerTrack playerTrack) {
        if (playerTrack.b.Tb()) {
            return this.a;
        }
        if (playerTrack.b.Vb()) {
            return this.b;
        }
        if (playerTrack.b.Mb()) {
            return this.c;
        }
        if (playerTrack.b.Wb()) {
            return this.d;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r1 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(sy40 sy40Var, String str) {
        PlayerTrack playerTrack;
        Object obj;
        if (str != null) {
            Iterator<T> it = sy40Var.f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (epx.f(((PlayerTrack) obj).f, str)) {
                        break;
                    }
                }
            }
            playerTrack = (PlayerTrack) obj;
        }
        playerTrack = sy40Var.d;
        if (playerTrack == null) {
            return;
        }
        n10 a = a(playerTrack);
        if (a != null) {
            a.d(playerTrack.b);
        }
    }
}
