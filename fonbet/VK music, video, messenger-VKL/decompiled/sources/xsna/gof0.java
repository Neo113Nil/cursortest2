package xsna;

import com.vk.reefton.PlayerTypes;
import com.vk.reefton.Reef;
import com.vk.reefton.ReefEvent;
import com.vk.reefton.dto.ReefContentQuality;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;

/* compiled from: ReefOneVideoPlayerListener.kt */
/* loaded from: classes5.dex */
public final class gof0 {
    public final com.vk.reefton.b a;
    public OneVideoPlayer b;
    public final b c = new b();
    public final a d = new a();
    public final c e = new c();

    /* compiled from: ReefOneVideoPlayerListener.kt */
    public static final class a implements one.video.player.e {
        public a() {
        }

        @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
        public final void b(OneVideoPlayer oneVideoPlayer, int i, long j, long j2) {
            com.vk.reefton.b bVar = gof0.this.a;
            bVar.a(oneVideoPlayer.j());
            bVar.a.a(new ReefEvent.e(i, oneVideoPlayer.getCurrentPosition(), j, j2));
        }

        @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
        public final void h(OneVideoPlayer oneVideoPlayer, lk80 lk80Var, OneVideoPlayer.DataType dataType, er10 er10Var) {
            com.vk.reefton.b bVar = gof0.this.a;
            bVar.a(oneVideoPlayer.j());
            sht0 j = oneVideoPlayer.j();
            if (j != null) {
                bVar.a.a(new ReefEvent.o(j.b));
            }
        }
    }

    /* compiled from: ReefOneVideoPlayerListener.kt */
    public static final class b implements one.video.player.f {
        public b() {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void a(OneVideoPlayer.DiscontinuityReason discontinuityReason, OneVideoPlayer oneVideoPlayer, deb0 deb0Var, deb0 deb0Var2) {
            int i;
            com.vk.reefton.b bVar = gof0.this.a;
            if (discontinuityReason == OneVideoPlayer.DiscontinuityReason.SEEK) {
                bVar.a(oneVideoPlayer.j());
                bVar.a.a(new ReefEvent.v(oneVideoPlayer.getCurrentPosition(), oneVideoPlayer.getDuration()));
                return;
            }
            bVar.a(oneVideoPlayer.j());
            Reef reef = bVar.a;
            switch (k1n.$EnumSwitchMapping$0[discontinuityReason.ordinal()]) {
                case 1:
                    i = 0;
                    break;
                case 2:
                    i = 1;
                    break;
                case 3:
                    i = 2;
                    break;
                case 4:
                    i = 3;
                    break;
                case 5:
                    i = 4;
                    break;
                case 6:
                    i = 5;
                    break;
                case 7:
                    i = -1;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            reef.a(new ReefEvent.t(i, oneVideoPlayer.getCurrentPosition(), oneVideoPlayer.getDuration()));
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void e(BaseVideoPlayer baseVideoPlayer, one.video.player.tracks.c cVar) {
            com.vk.reefton.b bVar = gof0.this.a;
            Reef reef = bVar.a;
            bVar.a(baseVideoPlayer.j());
            if (cVar == null) {
                return;
            }
            er10 er10Var = cVar.c;
            String str = cVar.b;
            one.video.player.tracks.c cVar2 = bVar.e;
            if (epx.f(str, cVar2 != null ? cVar2.b : null)) {
                return;
            }
            cms0 cms0Var = (cms0) er10Var;
            reef.a(new ReefEvent.z(cms0Var.d, cms0Var.b().getHeight(), baseVideoPlayer.getDuration()));
            ReefContentQuality a = PlayerTypes.a(PlayerTypes.b(cms0Var.b().getWidth(), cms0Var.b().getHeight()));
            ReefEvent.PlayerQualityChange.Reason reason = ReefEvent.PlayerQualityChange.Reason.ACTUAL;
            Iterator<T> it = baseVideoPlayer.k0().iterator();
            one.video.player.tracks.c cVar3 = cVar;
            while (true) {
                er10 er10Var2 = cVar3.c;
                if (!it.hasNext()) {
                    cms0 cms0Var2 = (cms0) er10Var2;
                    reef.a(new ReefEvent.PlayerQualityChange(a, reason, PlayerTypes.a(PlayerTypes.b(cms0Var2.b().getWidth(), cms0Var2.b().getHeight()))));
                    bVar.e = cVar;
                    return;
                } else {
                    one.video.player.tracks.c cVar4 = (one.video.player.tracks.c) it.next();
                    cms0 cms0Var3 = (cms0) er10Var2;
                    if (((cms0) cVar4.c).b().getHeight() > cms0Var3.b().getHeight() || ((cms0) cVar4.c).b().getWidth() > cms0Var3.b().getWidth()) {
                        cVar3 = cVar4;
                    }
                }
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void h(OneVideoPlayer oneVideoPlayer) {
            com.vk.reefton.b bVar = gof0.this.a;
            bVar.a(oneVideoPlayer.j());
            bVar.a.a(new ReefEvent.r());
            bVar.b = -1L;
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void j(OneVideoPlayer oneVideoPlayer) {
            com.vk.reefton.b bVar = gof0.this.a;
            bVar.a(oneVideoPlayer.j());
            if (bVar.d) {
                return;
            }
            bVar.a.a(new ReefEvent.q(oneVideoPlayer.getCurrentPosition(), oneVideoPlayer.getDuration()));
            bVar.d = true;
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void q(OneVideoPlaybackException oneVideoPlaybackException, sht0 sht0Var, OneVideoPlayer oneVideoPlayer) {
            gof0.this.a.a.a(new ReefEvent.g(oneVideoPlaybackException));
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void r(OneVideoPlayer oneVideoPlayer) {
            com.vk.reefton.b bVar = gof0.this.a;
            Reef reef = bVar.a;
            if (bVar.d) {
                reef.a(new ReefEvent.p(oneVideoPlayer.getCurrentPosition(), oneVideoPlayer.getDuration()));
                bVar.d = false;
            }
            reef.b();
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void s(OneVideoPlayer oneVideoPlayer) {
            com.vk.reefton.b bVar = gof0.this.a;
            bVar.a(oneVideoPlayer.j());
            bVar.a.a(new ReefEvent.m(oneVideoPlayer.getCurrentPosition(), oneVideoPlayer.getDuration()));
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void v(OneVideoPlayer oneVideoPlayer) {
            com.vk.reefton.b bVar = gof0.this.a;
            bVar.a(oneVideoPlayer.j());
            bVar.a.a(new ReefEvent.l(oneVideoPlayer.getCurrentPosition(), oneVideoPlayer.getDuration()));
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void w(BaseVideoPlayer baseVideoPlayer) {
            com.vk.reefton.b bVar = gof0.this.a;
            Reef reef = bVar.a;
            reef.d();
            bVar.a(baseVideoPlayer.j());
            if (bVar.d) {
                return;
            }
            reef.a(new ReefEvent.q(baseVideoPlayer.getCurrentPosition(), baseVideoPlayer.getDuration()));
            bVar.d = true;
        }
    }

    /* compiled from: ReefOneVideoPlayerListener.kt */
    public static final class c implements OneVideoPlayer.d {
        public c() {
        }

        @Override // one.video.player.OneVideoPlayer.d
        public final void C(BaseVideoPlayer baseVideoPlayer, long j) {
            com.vk.reefton.b bVar = gof0.this.a;
            bVar.a(baseVideoPlayer.j());
            if (bVar.b != -1) {
                return;
            }
            bVar.b = j;
            bVar.a.a(new ReefEvent.s(j));
        }
    }

    public gof0(com.vk.reefton.b bVar) {
        this.a = bVar;
    }
}
