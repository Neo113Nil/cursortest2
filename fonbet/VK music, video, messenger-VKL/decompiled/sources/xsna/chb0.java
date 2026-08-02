package xsna;

import android.content.Context;
import android.text.TextUtils;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlayState;
import com.vk.music.player.e;

/* compiled from: PodcastEpisodeHeaderViewHolder.kt */
/* loaded from: classes3.dex */
public final class chb0 extends e.a {
    public final /* synthetic */ bhb0 b;

    /* compiled from: PodcastEpisodeHeaderViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayState.values().length];
            try {
                iArr[PlayState.PLAYING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayState.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public chb0(bhb0 bhb0Var) {
        this.b = bhb0Var;
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void N3(PlayState playState, com.vk.music.player.f fVar) {
        MusicTrack f = fVar != null ? fVar.f() : null;
        bhb0 bhb0Var = this.b;
        if (f == null || !epx.f(bhb0Var.z, fVar.f())) {
            bhb0Var.A = false;
            bhb0Var.l6();
        } else {
            bhb0Var.A = playState == PlayState.PLAYING;
            bhb0Var.l6();
        }
        a(playState, fVar);
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void W3(com.vk.music.player.f fVar) {
        a(this.b.n.l.m0(), fVar);
    }

    public final void a(PlayState playState, com.vk.music.player.f fVar) {
        long j;
        long j2;
        Episode episode;
        int h;
        Episode episode2;
        MusicTrack f = fVar != null ? fVar.f() : null;
        bhb0 bhb0Var = this.b;
        if (f == null || !epx.f(bhb0Var.z, fVar.f()) || fVar.e() <= 0) {
            MusicTrack musicTrack = bhb0Var.z;
            long j3 = musicTrack != null ? musicTrack.f * 1000 : 0L;
            j = (musicTrack == null || (episode = musicTrack.w) == null) ? 0L : episode.d;
            j2 = j3;
        } else {
            j2 = fVar.e();
            int i = playState == null ? -1 : a.$EnumSwitchMapping$0[playState.ordinal()];
            if (i == 1 || i == 2) {
                h = fVar.h();
            } else {
                MusicTrack f2 = fVar.f();
                if (f2 == null || (episode2 = f2.w) == null) {
                    h = fVar.h();
                } else {
                    j = episode2.d;
                }
            }
            j = h;
        }
        Context context = e43.a;
        String c = pq3.c(context != null ? context : null, j2, j);
        if (TextUtils.equals(c, bhb0Var.B)) {
            return;
        }
        bhb0Var.B = c;
        bhb0Var.l6();
    }
}
