package xsna;

import androidx.core.app.NotificationCompat;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.account.AudioAdConfig;
import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.data.b;
import xsna.mb4;

/* compiled from: AudioAdLoader.kt */
/* loaded from: classes3.dex */
public final class hb4 extends h8x {
    public final /* synthetic */ jb4 b;
    public final /* synthetic */ PlaybackLaunchMeta c;
    public final /* synthetic */ AudioAdConfig.Type d;
    public final /* synthetic */ MusicTrack e;
    public final /* synthetic */ lq9 f;

    public hb4(jb4 jb4Var, PlaybackLaunchMeta playbackLaunchMeta, AudioAdConfig.Type type, MusicTrack musicTrack, lq9 lq9Var) {
        this.b = jb4Var;
        this.c = playbackLaunchMeta;
        this.d = type;
        this.e = musicTrack;
        this.f = lq9Var;
    }

    @Override // xsna.g8x.d
    public final void c(g8x g8xVar) {
        mb4.a.a("not_received", null, this.c.b);
        g8xVar.e();
        this.f.resumeWith(null);
    }

    @Override // xsna.g8x.d
    public final void e(g8x g8xVar) {
        mb4.a.a("not_received", null, this.c.b);
        g8xVar.e();
        this.f.resumeWith(null);
    }

    @Override // xsna.g8x.d
    public final void f(g8x g8xVar) {
        boolean z;
        lq9 lq9Var = this.f;
        String str = (String) j5g.a0(g8xVar.f());
        jb4 jb4Var = this.b;
        PlaybackLaunchMeta playbackLaunchMeta = this.c;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = playbackLaunchMeta.b;
        b.d a = io.reactivex.rxjava3.processors.b.a("audio_ad", NotificationCompat.CATEGORY_EVENT, "received");
        a.b(musicPlaybackLaunchContext.t(), "section");
        a.b(str, "mt_type");
        bn40.b("MusicStats", "[VK_TRACKER]", "ADVERTISEMENT", a);
        a.e();
        Serializer.c<AudioAdConfig> cVar = AudioAdConfig.CREATOR;
        AudioAdConfig V = jb4Var.c.V();
        AudioAdConfig.Type type = this.d;
        String zb = playbackLaunchMeta.zb();
        if (this.e.v != null) {
            z = true;
        } else {
            BuildInfo.Client client = BuildInfo.a;
            VKApplication vKApplication = com.vk.core.apps.a.a;
            z = false;
        }
        String b = AudioAdConfig.a.b(V, type, zb, z);
        if (b == null) {
            lq9Var.resumeWith(g8xVar);
            return;
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"rejectReason ".concat(b)});
        }
        jb4Var.a.a(type.getId(), b, playbackLaunchMeta.b);
        g8xVar.e();
        lq9Var.resumeWith(null);
    }
}
