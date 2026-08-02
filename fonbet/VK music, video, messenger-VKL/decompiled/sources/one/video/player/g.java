package one.video.player;

import android.net.Uri;
import one.video.player.OneVideoPlayer;

/* compiled from: EmptyPlayerTransferListener.kt */
/* loaded from: classes8.dex */
public interface g extends OneVideoPlayer.f {
    @Override // one.video.player.OneVideoPlayer.f
    default void b(OneVideoPlayer oneVideoPlayer, String str, String str2) {
    }

    @Override // one.video.player.OneVideoPlayer.f
    default void c(OneVideoPlayer oneVideoPlayer, Uri uri, long j, boolean z) {
    }

    @Override // one.video.player.OneVideoPlayer.f
    default void d(OneVideoPlayer oneVideoPlayer, Uri uri, long j, boolean z) {
    }

    @Override // one.video.player.OneVideoPlayer.f
    default void e(OneVideoPlayer oneVideoPlayer, Uri uri, long j, boolean z) {
    }

    @Override // one.video.player.OneVideoPlayer.f
    default void a(OneVideoPlayer oneVideoPlayer, Uri uri, long j, boolean z, int i) {
    }
}
