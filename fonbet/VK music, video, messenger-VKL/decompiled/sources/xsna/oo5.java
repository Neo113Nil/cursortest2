package xsna;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.dto.common.ClipVideoFile;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.music.player.playback.PlayableType;
import com.vk.music.player.playback.PlaybackLaunchMeta;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class oo5 implements io.reactivex.rxjava3.core.a0, pcs {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ oo5(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        FragmentManager fragmentManager = (FragmentManager) this.b;
        ClipsPlaylistsComponent clipsPlaylistsComponent = ((c0p) this.c).a;
        SdkVideoFile sdkVideoFile = ((ikd) this.d).a;
        ClipsPlaylist clipsPlaylist = (ClipsPlaylist) bundle.getParcelable("playlist_deselected");
        if (clipsPlaylist != null) {
            clipsPlaylistsComponent.b().a(clipsPlaylist, k15.A(sdkVideoFile));
        }
        ClipsPlaylist clipsPlaylist2 = (ClipsPlaylist) bundle.getParcelable("playlist_selected");
        if (clipsPlaylist2 != null) {
            clipsPlaylistsComponent.b().b(clipsPlaylist2, (ClipVideoFile) k15.A(sdkVideoFile));
        }
        fragmentManager.f("playlist_request_result");
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        MusicPlaybackLaunchContext musicPlaybackLaunchContext;
        PlaybackLaunchMeta playbackLaunchMeta = (PlaybackLaunchMeta) this.b;
        StartPlayVkMixSource startPlayVkMixSource = (StartPlayVkMixSource) this.c;
        com.vk.music.player.a aVar = (com.vk.music.player.a) this.d;
        if (playbackLaunchMeta == null || (musicPlaybackLaunchContext = playbackLaunchMeta.b) == null) {
            musicPlaybackLaunchContext = MusicPlaybackLaunchContext.A;
        }
        MusicPlaybackLaunchContext musicPlaybackLaunchContext2 = musicPlaybackLaunchContext;
        new h4v0(aVar.b, new com.vk.music.player.playback.e(startPlayVkMixSource, new PlaybackLaunchMeta(musicPlaybackLaunchContext2, "", PlayableType.MUSIC_TRACK, startPlayVkMixSource.b, null))).p(new sc5(yVar, startPlayVkMixSource, musicPlaybackLaunchContext2, 1));
    }
}
