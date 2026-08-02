package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlayerMode;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.e;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import xsna.b26;
import xsna.rmb;

/* compiled from: ChatAudioPlayerComponent.kt */
/* loaded from: classes2.dex */
public final class qmb extends j8i {
    public final FragmentActivity i;
    public final b26.d j;
    public final fl4 k;
    public final u2b0 l;
    public final kkm m;
    public rmb n;
    public final a o = new a();

    /* compiled from: ChatAudioPlayerComponent.kt */
    public final class a extends e.a {
        public a() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, com.vk.music.player.f fVar) {
            MusicTrack f;
            MusicTrack f2;
            qmb qmbVar = qmb.this;
            rmb rmbVar = qmbVar.n;
            if (rmbVar != null) {
                boolean z = playState == PlayState.PLAYING;
                String str = (fVar == null || (f2 = fVar.f()) == null) ? null : f2.d;
                if (str == null) {
                    str = "";
                }
                String str2 = (fVar == null || (f = fVar.f()) == null) ? null : f.h;
                if (str2 == null) {
                    str2 = "";
                }
                rmbVar.a(new rmb.a.b(str, str2, z, qmbVar.l.x1() == PlayerMode.ADVERTISEMENT));
                float k = fVar != null ? fVar.k() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                String X0 = fVar != null ? qmb.X0(qmbVar, fVar) : null;
                rmbVar.a(new rmb.a.C3612a(k, X0 != null ? X0 : ""));
            }
            if (playState == PlayState.PLAYING) {
                b26.n(b26.this, b26.a.CHAT_AUDIO_PLAYER, true);
            }
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void W3(com.vk.music.player.f fVar) {
            qmb qmbVar = qmb.this;
            rmb rmbVar = qmbVar.n;
            if (rmbVar != null) {
                rmbVar.a(new rmb.a.C3612a(fVar.k(), qmb.X0(qmbVar, fVar)));
            }
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void y4(List<PlayerTrack> list) {
            b26 b26Var = b26.this;
            if (b26Var.i.l.b() != null) {
                b26.n(b26Var, b26.a.CHAT_AUDIO_PLAYER, true);
            } else {
                b26Var.g(b26.a.CHAT_AUDIO_PLAYER, true, 0L);
            }
        }
    }

    /* compiled from: ChatAudioPlayerComponent.kt */
    public final class b {
        public b() {
        }
    }

    public qmb(FragmentActivity fragmentActivity, b26.d dVar, fl4 fl4Var, u2b0 u2b0Var, kkm kkmVar) {
        this.i = fragmentActivity;
        this.j = dVar;
        this.k = fl4Var;
        this.l = u2b0Var;
        this.m = kkmVar;
    }

    public static final String X0(qmb qmbVar, com.vk.music.player.f fVar) {
        int h = fVar.h() / 1000;
        return String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(h / 60), Integer.valueOf(h % 60)}, 2));
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        rmb rmbVar = new rmb(layoutInflater, viewGroup, viewStub, new b(), this.m);
        this.n = rmbVar;
        u2b0 u2b0Var = this.l;
        this.o.N3(u2b0Var.m0(), u2b0Var.H());
        return rmbVar.c;
    }

    @Override // xsna.j8i
    public final void M0() {
        this.l.n0(this.o);
    }

    @Override // xsna.j8i
    public final void N0() {
        this.n = null;
    }
}
