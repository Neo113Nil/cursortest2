package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlayerTrack;
import com.vk.toggle.features.MusicFeatures;
import java.util.concurrent.ExecutorService;
import xsna.by40;
import xsna.qy40;

/* compiled from: MusicPlayerFeature.kt */
/* loaded from: classes3.dex */
public final class yw40 implements gzs<s3q0> {
    public final /* synthetic */ rw40 b;
    public final /* synthetic */ yj40 c;
    public final /* synthetic */ rw40 d;

    public yw40(rw40 rw40Var, yj40 yj40Var, rw40 rw40Var2) {
        this.b = rw40Var;
        this.c = yj40Var;
        this.d = rw40Var2;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        MusicTrack musicTrack;
        sy40 sy40Var = (sy40) this.b.f.c;
        PlayerTrack playerTrack = sy40Var.d;
        MusicTrack musicTrack2 = playerTrack != null ? playerTrack.b : null;
        yj40 yj40Var = this.c;
        if (yj40Var instanceof fa50) {
            rw40 rw40Var = this.d;
            fa50 fa50Var = (fa50) yj40Var;
            rw40Var.getClass();
            MusicTrack musicTrack3 = fa50Var.b;
            MusicTrack musicTrack4 = fa50Var.a;
            a630 a630Var = rw40Var.g;
            rw40Var.T(new by40.b0(musicTrack3, musicTrack4, a630Var.i(musicTrack4), a630Var.i0(musicTrack4)));
        } else if (yj40Var instanceof yd50) {
            rw40 rw40Var2 = this.d;
            yd50 yd50Var = (yd50) yj40Var;
            rw40Var2.getClass();
            MusicTrack musicTrack5 = yd50Var.c;
            MusicTrack musicTrack6 = yd50Var.a;
            a630 a630Var2 = rw40Var2.g;
            rw40Var2.T(new by40.e0(musicTrack5, musicTrack6, a630Var2.i(musicTrack6), a630Var2.i0(musicTrack6)));
        } else if (yj40Var instanceof hb50) {
            rw40 rw40Var3 = this.d;
            hb50 hb50Var = (hb50) yj40Var;
            int i = sy40Var.l;
            rw40Var3.getClass();
            if (epx.f(hb50Var.b, musicTrack2)) {
                hg40 Y = rw40Var3.Y(i, musicTrack2);
                MusicTrack musicTrack7 = hb50Var.b;
                i0q0.f(new com.vk.movika.sdk.base.logic.interactor.c(16, rw40Var3, Y));
                musicTrack2.P = true;
                rw40Var3.T(new by40.j(musicTrack2, true));
                i0q0.d(2000L, new e50(4, rw40Var3, musicTrack7));
            }
        } else if (yj40Var instanceof gb50) {
            rw40 rw40Var4 = this.d;
            gb50 gb50Var = (gb50) yj40Var;
            int i2 = sy40Var.l;
            rw40Var4.getClass();
            if (epx.f(gb50Var.b, musicTrack2)) {
                i0q0.f(new bfb(rw40Var4, rw40Var4.Y(i2, musicTrack2), gb50Var, 5));
                musicTrack2.P = false;
                rw40Var4.T(new by40.j(musicTrack2, false));
            } else {
                ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
                com.vk.mvi.core.internal.executors.a.b(new vw40(rw40Var4, gb50Var));
            }
        } else if (yj40Var instanceof ib50) {
            rw40 rw40Var5 = this.d;
            ib50 ib50Var = (ib50) yj40Var;
            rw40Var5.getClass();
            MusicTrack musicTrack8 = ib50Var.b;
            MusicTrack musicTrack9 = ib50Var.a;
            if (epx.f(musicTrack8, musicTrack2)) {
                rw40Var5.T(new by40.k(musicTrack9));
                if (epx.f(musicTrack8.J, DownloadingState.Downloaded.b) && epx.f(musicTrack9.J, DownloadingState.NotLoaded.b)) {
                    rw40Var5.w.b(musicTrack8.Mb() ? qy40.a.C3582a.b : jnj.d(musicTrack8.V) ? qy40.a.p.b : qy40.a.o.b);
                }
            }
        } else if (yj40Var instanceof gc50) {
            rw40 rw40Var6 = this.d;
            gc50 gc50Var = (gc50) yj40Var;
            rw40Var6.getClass();
            if (musicTrack2 != null && (musicTrack = (MusicTrack) gc50Var.a.get(musicTrack2.Fb())) != null) {
                rw40Var6.T(new by40.k(musicTrack));
            }
        } else if (yj40Var instanceof gcb0) {
            rw40 rw40Var7 = this.d;
            if (epx.f(((gcb0) yj40Var).a, rw40Var7.B)) {
                rw40Var7.B = null;
            }
        } else if (yj40Var instanceof ave0) {
            rw40 rw40Var8 = this.d;
            ave0 ave0Var = (ave0) yj40Var;
            b25 b25Var = rw40Var8.j;
            if (musicTrack2 != null && musicTrack2.Wb() && musicTrack2.b == ave0Var.a) {
                MusicTrack b = rw40Var8.y.b();
                if (b != null) {
                    b.c = b25Var.c();
                }
                rw40Var8.T(new by40.x(MusicTrack.zb(musicTrack2, 0, b25Var.c(), 0, 0, null, false, null, null, false, false, null, null, null, -1027, 1048575)));
            }
        } else if (yj40Var instanceof bve0) {
            rw40 rw40Var9 = this.d;
            bve0 bve0Var = (bve0) yj40Var;
            rw40Var9.getClass();
            if (musicTrack2 != null && musicTrack2.Wb() && musicTrack2.b == bve0Var.a) {
                MusicTrack b2 = rw40Var9.y.b();
                if (b2 != null) {
                    b2.c = UserId.d;
                }
                rw40Var9.T(new by40.y(MusicTrack.zb(musicTrack2, 0, UserId.d, 0, 0, null, true, null, null, false, false, null, null, null, -1027, 1048575)));
            }
        } else if (yj40Var instanceof igp0) {
            rw40 rw40Var10 = this.d;
            rw40Var10.getClass();
            rw40Var10.T(new by40.c0(((igp0) yj40Var).a));
        } else if (yj40Var instanceof hiy) {
            rw40 rw40Var11 = this.d;
            hiy hiyVar = (hiy) yj40Var;
            rw40Var11.getClass();
            if (MusicFeatures.AUDIO_KIDS_MODE_PLAYER_UI.h()) {
                hiyVar.getClass();
            }
            rw40Var11.T(new by40.n());
        }
        return s3q0.a;
    }
}
