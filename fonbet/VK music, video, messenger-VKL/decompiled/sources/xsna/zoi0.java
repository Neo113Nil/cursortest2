package xsna;

import android.content.Context;
import android.support.v4.media.session.MediaSessionCompat;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.music.MusicTrack;
import com.vk.metrics.eventtracking.Event;
import com.vk.music.playerservice.impl.PlayerService;

/* compiled from: ServiceNotificationHelper.kt */
/* loaded from: classes3.dex */
public final class zoi0 extends sd50 {
    public final kza0 a;
    public final PlayerService b;
    public final u2b0 c;
    public final np40 d;
    public final com.vk.music.pref.a e;
    public final bx40 f;

    public zoi0(kza0 kza0Var, PlayerService playerService, u2b0 u2b0Var, np40 np40Var, com.vk.music.pref.a aVar, bx40 bx40Var) {
        this.a = kza0Var;
        this.b = playerService;
        this.c = u2b0Var;
        this.d = np40Var;
        this.e = aVar;
        this.f = bx40Var;
    }

    @Override // xsna.kd50.a
    public final void a(MusicTrack musicTrack, VKApiExecutionException vKApiExecutionException, boolean z) {
        if (z && vKApiExecutionException != null) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            rte0.z(context, vKApiExecutionException);
        }
        if (musicTrack == null || !this.c.y0(musicTrack)) {
            return;
        }
        c(musicTrack);
    }

    @Override // xsna.kd50.a
    public final void b(MusicTrack musicTrack) {
        if (musicTrack == null || !this.c.y0(musicTrack)) {
            return;
        }
        c(musicTrack);
    }

    public final void c(MusicTrack musicTrack) {
        boolean z = musicTrack == null;
        kza0 kza0Var = this.a;
        boolean z2 = kza0Var.getMediaSession() == null;
        if (z || z2) {
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            el3 el3Var = Event.b;
            Event.a b = h5s.b("show_player_notification_fail");
            b.a(Boolean.TRUE, "has_player");
            b.a(Boolean.valueOf(!z), "has_track");
            b.a(Boolean.valueOf(!z2), "has_media_session");
            b.i("FirebaseTracker");
            bVar.k(b.e());
            return;
        }
        com.vk.metrics.eventtracking.b bVar2 = com.vk.metrics.eventtracking.b.a;
        el3 el3Var2 = Event.b;
        Event.a aVar = new Event.a();
        aVar.g("about_to_show_player_notification");
        aVar.i("FirebaseTracker");
        bVar2.k(aVar.e());
        MediaSessionCompat mediaSession = kza0Var.getMediaSession();
        if (mediaSession == null || musicTrack == null) {
            return;
        }
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        this.d.a(context, new mp40(this, mediaSession, musicTrack, kza0Var.C().n(), kza0Var.getState().h(), new knd(), this.f.a));
    }
}
