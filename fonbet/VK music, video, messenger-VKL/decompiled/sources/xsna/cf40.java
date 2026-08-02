package xsna;

import com.vk.metrics.trackers.my.event.ForegroundEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.Set;

/* compiled from: MusicCheckpointStrategy.kt */
/* loaded from: classes3.dex */
public final class cf40 implements p9c {
    public final ForegroundEvent a = ForegroundEvent.MUSIC;
    public final Set<MobileOfficialAppsCoreNavStat$EventScreen> b = rl3.y0(new MobileOfficialAppsCoreNavStat$EventScreen[]{MobileOfficialAppsCoreNavStat$EventScreen.AUDIO, MobileOfficialAppsCoreNavStat$EventScreen.AUDIO_CATALOG, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_MY, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_OFFLINE_MY_MUSIC, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYLIST, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_OFFLINE_LIBRARY, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_OFFLINE_LIBRARY_PLAYLISTS, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYER_AUTOPLAY, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_SNIPPETS_LIST, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYER_CONTROLS, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYER_TRACK_LIST, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYLIST_FULL, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYLIST_ADD_TRACK, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYLIST_EDIT, MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_MUSIC, MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_MUSIC_SERVICE, MobileOfficialAppsCoreNavStat$EventScreen.PODCAST_PAGE, MobileOfficialAppsCoreNavStat$EventScreen.PODCAST_EPISODE, MobileOfficialAppsCoreNavStat$EventScreen.PODCAST_LIST, MobileOfficialAppsCoreNavStat$EventScreen.PODCAST_EPISODE_LIST, MobileOfficialAppsCoreNavStat$EventScreen.AUDIO_BOOK_PAGE});

    @Override // xsna.p9c
    public final ForegroundEvent a() {
        return this.a;
    }

    @Override // xsna.p9c
    public final boolean b(mt50 mt50Var) {
        return this.b.contains(mt50Var.a);
    }
}
