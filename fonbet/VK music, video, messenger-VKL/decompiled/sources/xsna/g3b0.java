package xsna;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.MusicCountDownTimer;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlayerMode;
import com.vk.music.player.e;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioPlayerUiClickItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioSourceEnum;
import kotlin.NoWhenBranchMatchedException;
import xsna.h3b0;
import xsna.i3b0;
import xsna.j3b0;
import xsna.k840;

/* compiled from: PlayerSettingsMenuFeature.kt */
/* loaded from: classes3.dex */
public final class g3b0 extends wk50<m3b0, l3b0, h3b0, j3b0> {
    public final u750 f;
    public final CommonAudioStat$TypeAudioSourceEnum g;
    public final com.vk.music.player.d h;
    public final otp i;
    public final com.vk.music.pref.a j;
    public final boolean k;
    public final com.vk.music.audioeffect.a l;
    public final bpn0 m;
    public final bpn0 n;
    public final c o;
    public final b p;
    public final u2b0 q;
    public final a r;
    public final dt4 s;
    public final f4z t;

    /* compiled from: PlayerSettingsMenuFeature.kt */
    public static final class a extends e.a {
        public a() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, com.vk.music.player.f fVar) {
            g3b0.this.T(new j3b0.d(playState == PlayState.PLAYING || playState == PlayState.PAUSED));
        }
    }

    /* compiled from: PlayerSettingsMenuFeature.kt */
    public static final class b implements MusicCountDownTimer.a {
        public b() {
        }

        @Override // com.vk.music.player.MusicCountDownTimer.a
        public final void n0() {
            g3b0.this.T(new j3b0.e(0L));
        }

        @Override // com.vk.music.player.MusicCountDownTimer.a
        public final void s0(long j) {
            g3b0.this.T(new j3b0.e(Long.valueOf(j)));
        }

        @Override // com.vk.music.player.MusicCountDownTimer.a
        public final void u0() {
            g3b0.this.T(new j3b0.e(null));
        }
    }

    /* compiled from: PlayerSettingsMenuFeature.kt */
    public static final class c extends ContentObserver {
        public c(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            g3b0.this.T(new j3b0.f(((AudioManager) r0.m.getValue()).getStreamVolume(3) / r0.U()));
        }
    }

    public g3b0(h3b0 h3b0Var, k3b0 k3b0Var, u750 u750Var, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum, com.vk.music.player.d dVar, otp otpVar, com.vk.music.pref.a aVar, boolean z, com.vk.music.audioeffect.a aVar2) {
        super(h3b0Var, k3b0Var);
        this.f = u750Var;
        this.g = commonAudioStat$TypeAudioSourceEnum;
        this.h = dVar;
        this.i = otpVar;
        this.j = aVar;
        this.k = z;
        this.l = aVar2;
        this.m = new bpn0(new ia90(1));
        this.n = new bpn0(new m1y(this, 25));
        c cVar = new c(i0q0.a());
        this.o = cVar;
        b bVar = new b();
        this.p = bVar;
        u2b0 b2 = k840.a.g().b();
        this.q = b2;
        a aVar3 = new a();
        this.r = aVar3;
        this.s = new dt4(u750Var);
        this.t = new f4z();
        dVar.a(bVar);
        otpVar.g("player_menu_bottomsheet");
        b2.P0(aVar3, true);
        Context context = e43.a;
        (context == null ? null : context).getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, cVar);
    }

    @Override // xsna.wk50
    public final void N(l3b0 l3b0Var, h3b0 h3b0Var) {
        MusicTrack b2;
        h3b0 h3b0Var2 = h3b0Var;
        dt4 dt4Var = this.s;
        PlayerMode playerMode = dt4Var.b;
        u750 u750Var = dt4Var.a;
        boolean z = h3b0Var2 instanceof h3b0.b;
        if (z) {
            if (((h3b0.b) h3b0Var2).b) {
                u750Var.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_CROSSFADE_ON_SET, playerMode);
            } else {
                u750Var.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_CROSSFADE_OFF_SET, playerMode);
            }
        } else if (h3b0Var2 instanceof h3b0.c) {
            if (((h3b0.c) h3b0Var2).b) {
                u750Var.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_SOUND_NORMALIZED_ON_SET, playerMode);
            } else {
                u750Var.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_SOUND_NORMALIZED_OFF_SET, playerMode);
            }
        } else if (h3b0Var2.equals(h3b0.e.b)) {
            u750Var.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_EQUALIZER_SET, playerMode);
        } else if (h3b0Var2.equals(h3b0.f.b)) {
            u750Var.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_TIMER_SET, playerMode);
        } else if (h3b0Var2 instanceof h3b0.h) {
            u750Var.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_VOLUME_SET, playerMode);
        } else if (h3b0Var2 instanceof h3b0.a) {
            u750Var.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_CLOSE_SET, playerMode);
        }
        boolean equals = h3b0Var2.equals(h3b0.d.b);
        bpn0 bpn0Var = this.m;
        com.vk.music.pref.a aVar = this.j;
        boolean z2 = true;
        com.vk.music.audioeffect.a aVar2 = this.l;
        if (equals) {
            otp otpVar = this.i;
            boolean isEnabled = otpVar.isEnabled();
            boolean c2 = otpVar.c();
            ztp d = otpVar.d();
            float streamVolume = ((AudioManager) bpn0Var.getValue()).getStreamVolume(3) / U();
            boolean z0 = aVar.z0();
            boolean k = aVar2.k();
            boolean booleanValue = ((Boolean) aVar2.c().b.getValue()).booleanValue();
            if (!this.k && ((b2 = this.q.b()) == null || !b2.Tb())) {
                z2 = false;
            }
            T(new j3b0.b(isEnabled, c2, d, streamVolume, z0, k, booleanValue, z2));
            return;
        }
        boolean equals2 = h3b0Var2.equals(h3b0.a.b);
        f4z f4zVar = this.t;
        if (equals2) {
            f4zVar.b(i3b0.a.a);
            return;
        }
        if (h3b0Var2 instanceof h3b0.g) {
            ((AudioManager) bpn0Var.getValue()).setStreamVolume(3, (int) (((h3b0.g) h3b0Var2).b * U()), 1);
            T(new j3b0.f(((AudioManager) bpn0Var.getValue()).getStreamVolume(3) / U()));
            return;
        }
        if (h3b0Var2 instanceof h3b0.e) {
            this.f.K0(this.g);
            f4zVar.b(i3b0.b.a);
            return;
        }
        if (h3b0Var2 instanceof h3b0.f) {
            f4zVar.b(i3b0.c.a);
            return;
        }
        if (z) {
            boolean z3 = ((h3b0.b) h3b0Var2).b;
            aVar.I0(z3);
            T(new j3b0.a(z3));
        } else if (!(h3b0Var2 instanceof h3b0.c)) {
            if (!(h3b0Var2 instanceof h3b0.h)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            boolean z4 = ((h3b0.c) h3b0Var2).b;
            aVar2.e(z4);
            T(new j3b0.c(z4));
        }
    }

    public final int U() {
        return ((Number) this.n.getValue()).intValue();
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        this.h.c(this.p);
        this.i.f("player_menu_bottomsheet");
        this.q.n0(this.r);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        context.getContentResolver().unregisterContentObserver(this.o);
    }
}
