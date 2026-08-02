package xsna;

import android.os.Handler;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.e;
import com.vk.music.player.error.VkPlayerException;
import com.vk.music.playerservice.impl.PlayerService;
import java.util.List;

/* compiled from: ServicePlayerListener.kt */
/* loaded from: classes3.dex */
public final class api0 extends e.a {
    public final PlayerService b;
    public final zoi0 c;
    public final mc40 d;
    public final d6e0 e;
    public final u2b0 f;

    public api0(PlayerService playerService, zoi0 zoi0Var, mc40 mc40Var, d6e0 d6e0Var, u2b0 u2b0Var) {
        this.b = playerService;
        this.c = zoi0Var;
        this.d = mc40Var;
        this.e = d6e0Var;
        this.f = u2b0Var;
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void B1() {
        dy4.p.B1();
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void K1() {
        dy4.p.K1();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N3(PlayState playState, com.vk.music.player.f fVar) {
        boolean z;
        ych0 ych0Var;
        boolean z2;
        PlayerService playerService = this.b;
        bn40.f("ServicePlayerListener onStateChanged, state = " + playState);
        if (playState == PlayState.STOPPED) {
            pu5 pu5Var = playerService.r;
            Handler handler = playerService.e;
            if (handler != null) {
                handler.removeCallbacks(pu5Var);
            }
            if (playerService.g || ((Boolean) playerService.s.getValue()).booleanValue()) {
                Handler handler2 = playerService.e;
                if (handler2 != null) {
                    handler2.post(pu5Var);
                }
            } else {
                Handler handler3 = playerService.e;
                if (handler3 != null) {
                    handler3.postDelayed(pu5Var, 5000L);
                }
            }
        } else {
            MusicTrack f = fVar != null ? fVar.f() : null;
            if (fVar != null) {
                String str = fVar.a;
                fVar.a = "";
                if (str.equals("new")) {
                    z = true;
                    this.c.c(f);
                    ych0 ych0Var2 = playerService.l;
                    ych0Var = ych0Var2 != null ? ych0Var2 : null;
                    if (ych0Var.g && e2b0.o0(ych0Var.b.u) == PlayState.PLAYING) {
                        ych0Var.g = false;
                        if (!ych0Var.b.U()) {
                            r6m.a.getClass();
                            if (!r6m.b) {
                                z2 = false;
                                ych0Var.f = z2;
                                if (z2) {
                                    ych0Var.c = false;
                                } else {
                                    ych0Var.E();
                                }
                            }
                        }
                        z2 = true;
                        ych0Var.f = z2;
                        if (z2) {
                        }
                    }
                    this.d.c(f);
                    if (playState == PlayState.PLAYING && z) {
                        this.e.a(f);
                    }
                }
            }
            z = false;
            this.c.c(f);
            ych0 ych0Var22 = playerService.l;
            if (ych0Var22 != null) {
            }
            if (ych0Var.g) {
                ych0Var.g = false;
                if (!ych0Var.b.U()) {
                }
                z2 = true;
                ych0Var.f = z2;
                if (z2) {
                }
            }
            this.d.c(f);
            if (playState == PlayState.PLAYING) {
                this.e.a(f);
            }
        }
        dy4.p.N3(playState, fVar);
        playerService.m();
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void W3(com.vk.music.player.f fVar) {
        dy4.p.W3(fVar);
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void n3() {
        dy4.p.n3();
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void o2(com.vk.music.player.f fVar) {
        dy4.p.o2(fVar);
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final boolean t3(VkPlayerException vkPlayerException) {
        return dy4.p.t3(vkPlayerException);
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void y4(List<PlayerTrack> list) {
        dy4.p.y4(list);
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void z3() {
        this.c.c(this.f.b());
        dy4 dy4Var = dy4.p;
        dy4Var.getClass();
        pro0.e(new ey4(dy4Var));
        this.b.m();
    }
}
