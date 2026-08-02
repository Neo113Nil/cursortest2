package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.AdvertisementInfo;
import com.vk.music.player.LoopMode;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlayerAction;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.e;
import com.vk.music.stickyplayer.domain.PlayerUiMode;
import com.vk.toggle.features.MusicFeatures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import xsna.by40;
import xsna.k840;
import xsna.qy40;

/* compiled from: MusicPlayerFeature.kt */
/* loaded from: classes3.dex */
public final class xw40 extends e.a {
    public boolean b;
    public final /* synthetic */ rw40 c;

    /* compiled from: MusicPlayerFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoopMode.values().length];
            try {
                iArr[LoopMode.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoopMode.TRACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoopMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MusicPlayerFeature.kt */
    public static final class b implements gzs<s3q0> {
        public final /* synthetic */ rw40 b;
        public final /* synthetic */ List c;
        public final /* synthetic */ List d;
        public final /* synthetic */ rw40 e;

        public b(rw40 rw40Var, List list, List list2, rw40 rw40Var2) {
            this.b = rw40Var;
            this.c = list;
            this.d = list2;
            this.e = rw40Var2;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            sy40 sy40Var = (sy40) this.b.f.c;
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (PlayerTrack playerTrack : this.c) {
                if (hashSet.contains(playerTrack.f)) {
                    com.vk.metrics.eventtracking.b.a.q(new IllegalStateException("Duplicated UUIDs in playback queue " + playerTrack.f + " for track " + playerTrack.b.Fb()));
                } else {
                    arrayList.add(playerTrack);
                    hashSet.add(playerTrack.f);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (gza0 gza0Var : this.d) {
                if (!hashSet.contains(gza0Var.b)) {
                    arrayList2.add(gza0Var.b);
                    hashSet.add(gza0Var.b);
                }
            }
            if (!epx.f(sy40Var.f, arrayList)) {
                this.e.B = null;
            }
            if (!epx.f(sy40Var.f, arrayList) || !epx.f(sy40Var.g, arrayList2)) {
                this.e.T(new by40.h(arrayList, arrayList2));
            }
            return s3q0.a;
        }
    }

    public xw40(rw40 rw40Var) {
        this.c = rw40Var;
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void B1() {
        rw40 rw40Var = this.c;
        rw40Var.T(new by40.w(rw40Var.y.l()));
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void K1() {
        rw40 rw40Var = this.c;
        f4z f4zVar = rw40Var.w;
        u2b0 u2b0Var = rw40Var.y;
        int i = a.$EnumSwitchMapping$0[u2b0Var.getRepeatMode().ordinal()];
        if (i == 1) {
            f4zVar.b(qy40.a.h.b);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        MusicTrack b2 = u2b0Var.b();
        if (b2 == null || !jnj.d(b2.V)) {
            f4zVar.b(qy40.a.m.b);
        } else {
            f4zVar.b(qy40.a.d.b);
        }
    }

    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void N3(PlayState playState, com.vk.music.player.f fVar) {
        DownloadingState downloadingState;
        boolean z;
        boolean z2;
        AdvertisementInfo advertisementInfo;
        StartPlaySource startPlaySource;
        MusicTrack musicTrack;
        MusicTrack musicTrack2;
        rw40 rw40Var = this.c;
        a630 a630Var = rw40Var.g;
        u2b0 u2b0Var = rw40Var.y;
        if (fVar == null) {
            return;
        }
        PlayerTrack o0 = u2b0Var.o0();
        boolean i = a630Var.i(o0 != null ? o0.b : null);
        boolean i0 = a630Var.i0(o0 != null ? o0.b : null);
        boolean z3 = (o0 == null || (musicTrack2 = o0.b) == null || musicTrack2.P) ? false : true;
        if (o0 == null || (musicTrack = o0.b) == null || (downloadingState = musicTrack.J) == null) {
            downloadingState = DownloadingState.NotLoaded.b;
        }
        DownloadingState downloadingState2 = downloadingState;
        boolean A0 = u2b0Var.A0();
        boolean T0 = u2b0Var.T0();
        boolean E0 = u2b0Var.E0();
        boolean z0 = u2b0Var.z0();
        float l = u2b0Var.l();
        rw40Var.L.getClass();
        com.vk.music.player.d dVar = k840.a.f;
        boolean b2 = (dVar != null ? dVar : null).b();
        PlayerUiMode playerUiMode = !fVar.n() ? PlayerUiMode.ADVERTISEMENT : A0 ? PlayerUiMode.VK_MIX : T0 ? PlayerUiMode.PODCAST : E0 ? PlayerUiMode.AUDIOBOOK : z0 ? PlayerUiMode.RADIO : PlayerUiMode.MUSIC;
        boolean z4 = fVar.b().contains(PlayerAction.changeTrackNext) && fVar.n();
        boolean z5 = fVar.b().contains(PlayerAction.changeTrackPrev) && fVar.n();
        boolean U0 = fVar.n() ? u2b0Var.U0() : false;
        LoopMode repeatMode = fVar.n() ? u2b0Var.getRepeatMode() : LoopMode.NONE;
        int h = fVar.h();
        int d = fVar.d();
        int e = fVar.e();
        AdvertisementInfo c = fVar.c();
        int i2 = c != null ? c.b : 0;
        int i3 = e > 0 ? e : i2 > 0 ? i2 : 0;
        if (!this.b && !fVar.n()) {
            this.b = true;
            fVar.o(AdvertisementInfo.Action.VIEW);
        } else if (fVar.n()) {
            this.b = false;
        }
        sq3 sq3Var = (sq3) rw40Var.I.getValue();
        if (sq3Var != null) {
            sq3Var.a(fVar);
        }
        boolean z6 = false;
        PlayerUiMode playerUiMode2 = playerUiMode;
        StartPlaySource j = u2b0Var.j();
        if (playState == PlayState.PLAYING) {
            z = false;
            z6 = true;
        } else {
            z = false;
        }
        boolean z7 = !A0;
        AdvertisementInfo c2 = fVar.c();
        if (MusicFeatures.AUDIO_KIDS_MODE_PLAYER_UI.h() && rw40Var.l.isEnabled().getValue().booleanValue()) {
            z2 = true;
            startPlaySource = j;
            advertisementInfo = c2;
        } else {
            z2 = z;
            advertisementInfo = c2;
            startPlaySource = j;
        }
        rw40Var.T(new by40.g(playerUiMode2, o0, startPlaySource, i, i0, z3, z6, z5, z4, z7, i3, downloadingState2, advertisementInfo, U0, repeatMode, h, d, l, b2, z2));
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void W3(com.vk.music.player.f fVar) {
        if (fVar == null) {
            return;
        }
        rw40 rw40Var = this.c;
        com.vk.mvi.core.internal.executors.a.b(new ax40(rw40Var, fVar, rw40Var));
        rw40Var.T(new by40.u(fVar.h()));
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void n3() {
        rw40 rw40Var = this.c;
        f4z f4zVar = rw40Var.w;
        u2b0 u2b0Var = rw40Var.y;
        if (u2b0Var.U0()) {
            MusicTrack b2 = u2b0Var.b();
            if (b2 == null || !jnj.d(b2.V)) {
                f4zVar.b(qy40.a.k.b);
            } else {
                f4zVar.b(qy40.a.c.b);
            }
        }
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void o2(com.vk.music.player.f fVar) {
        if (fVar == null) {
            return;
        }
        rw40 rw40Var = this.c;
        com.vk.mvi.core.internal.executors.a.b(new ax40(rw40Var, fVar, rw40Var));
        rw40Var.T(new by40.c(fVar.d()));
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void y4(List<PlayerTrack> list) {
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        rw40 rw40Var = this.c;
        u2b0 u2b0Var = rw40Var.y;
        List unmodifiableList2 = Collections.unmodifiableList(new ArrayList(u2b0Var.d()));
        ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
        com.vk.mvi.core.internal.executors.a.b(new b(rw40Var, unmodifiableList, unmodifiableList2, rw40Var));
        com.vk.music.player.f H = u2b0Var.H();
        if (H != null) {
            rw40Var.T(new by40.f(H.b().contains(PlayerAction.changeTrackNext) && H.n()));
        }
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void z3() {
        rw40 rw40Var = this.c;
        u2b0 u2b0Var = rw40Var.y;
        com.vk.music.player.f H = u2b0Var.H();
        boolean z = false;
        boolean z2 = H != null && H.n();
        LoopMode repeatMode = z2 ? u2b0Var.getRepeatMode() : LoopMode.NONE;
        if (u2b0Var.U0() && z2) {
            z = true;
        }
        rw40Var.T(new by40.v(z, repeatMode));
    }
}
