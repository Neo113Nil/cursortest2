package xsna;

import android.os.Bundle;
import com.vk.dto.music.MusicDynamicRestriction;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistLink;
import com.vkontakte.android.R;
import xsna.fsv;

/* compiled from: PlaylistsController.java */
/* loaded from: classes3.dex */
public final class kfb0 extends fsv.a<Playlist> {
    public final /* synthetic */ lfb0 b;

    public kfb0(lfb0 lfb0Var) {
        this.b = lfb0Var;
    }

    @Override // xsna.fsv
    public final void Ig(int i, Object obj) {
        Playlist playlist = (Playlist) obj;
        if (playlist == null) {
            return;
        }
        if (playlist.Fb()) {
            MusicDynamicRestriction musicDynamicRestriction = playlist.z;
            if (musicDynamicRestriction != null) {
                cvk.w(musicDynamicRestriction.b, false);
                return;
            } else {
                cvk.u(playlist.Eb() ? R.string.music_album_blocked : R.string.music_playlist_blocked, false);
                return;
            }
        }
        long Db = playlist.Db();
        lfb0 lfb0Var = this.b;
        if (Db == lfb0Var.j.M().longValue()) {
            cvk.u(R.string.music_editing_playlist, false);
            return;
        }
        if (playlist.f != null) {
            Playlist playlist2 = new Playlist(playlist);
            PlaylistLink playlistLink = playlist.f;
            playlist2.b = playlistLink.b;
            playlist2.c = playlistLink.c;
            playlist2.x = playlistLink.d;
            playlist2.f = null;
            playlist2.t = true;
            playlist2.g = new PlaylistLink(playlist.b, playlist.c);
            playlist = playlist2;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("PlaylistMusicController.arg.playlist", playlist);
        lfb0Var.un(mbb0.class, bundle);
    }
}
