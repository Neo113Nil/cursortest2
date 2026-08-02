package xsna;

import android.app.Activity;
import com.vk.video.playlist.playlistscreen.PlaylistScreenArgs;
import com.vk.video.playlist.playlistscreen.ui.PlaylistScreenFragment;

/* compiled from: PlaylistLauncherImpl.kt */
/* loaded from: classes6.dex */
public final class pab0 implements oab0 {
    @Override // xsna.oab0
    public final void a(Activity activity, PlaylistScreenArgs playlistScreenArgs) {
        PlaylistScreenFragment.a aVar = new PlaylistScreenFragment.a(PlaylistScreenFragment.class, null, null);
        aVar.j.putParcelable("arguments", playlistScreenArgs);
        aVar.k(activity);
    }
}
