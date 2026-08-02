package xsna;

import com.vk.libvideo.autoplay.background.controller.a;
import com.vk.stat.scheme.SchemeStat$TypeVideoBackgroundListeningItem;

/* compiled from: VideoNotificationMediaSessionCallback.kt */
/* loaded from: classes2.dex */
public final class pys0 extends zss0 {
    public final a.c b;

    public pys0(a.b bVar) {
        this.b = bVar;
    }

    @Override // xsna.zss0, android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onFastForward() {
        super.onFastForward();
        yg5 yg5Var = this.a;
        if (yg5Var != null) {
            this.b.b(yg5Var, true, Math.min(yg5Var.getDuration(), yg5Var.getPosition() + 10000));
        }
    }

    @Override // xsna.zss0, android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPause() {
        super.onPause();
        yg5 yg5Var = this.a;
        if (yg5Var != null) {
            this.b.a(yg5Var, SchemeStat$TypeVideoBackgroundListeningItem.EventType.END);
        }
    }

    @Override // xsna.zss0, android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPlay() {
        super.onPlay();
        yg5 yg5Var = this.a;
        if (yg5Var != null) {
            this.b.a(yg5Var, SchemeStat$TypeVideoBackgroundListeningItem.EventType.START);
        }
    }

    @Override // xsna.zss0, android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onRewind() {
        super.onRewind();
        yg5 yg5Var = this.a;
        if (yg5Var != null) {
            this.b.b(yg5Var, true, Math.max(0L, yg5Var.getPosition() - 10000));
        }
    }

    @Override // xsna.zss0, android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSeekTo(long j) {
        super.onSeekTo(j);
        yg5 yg5Var = this.a;
        if (yg5Var != null) {
            this.b.b(yg5Var, false, j);
        }
    }
}
