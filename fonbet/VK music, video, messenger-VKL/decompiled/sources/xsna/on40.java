package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.music.player.analytics.api.mediascope.MusicMediaScopeAction;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.Set;

/* compiled from: MusicMediaScopeServiceImpl.kt */
/* loaded from: classes3.dex */
public final class on40 extends vf {
    public static final Set<MobileOfficialAppsCoreNavStat$EventScreen> g = rl3.y0(new MobileOfficialAppsCoreNavStat$EventScreen[]{MobileOfficialAppsCoreNavStat$EventScreen.AUDIO, MobileOfficialAppsCoreNavStat$EventScreen.AUDIO_CATALOG, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_MY, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_OFFLINE_MY_MUSIC, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYLIST, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_OFFLINE_LIBRARY, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_OFFLINE_LIBRARY_PLAYLISTS, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYER_AUTOPLAY, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_SNIPPETS_LIST, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYER_CONTROLS, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYER_TRACK_LIST, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYLIST_FULL, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYLIST_ADD_TRACK, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYLIST_EDIT, MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_MUSIC, MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_MUSIC_SERVICE, MobileOfficialAppsCoreNavStat$EventScreen.PODCAST_PAGE, MobileOfficialAppsCoreNavStat$EventScreen.PODCAST_EPISODE, MobileOfficialAppsCoreNavStat$EventScreen.PODCAST_LIST, MobileOfficialAppsCoreNavStat$EventScreen.PODCAST_EPISODE_LIST});
    public static final Set<MobileOfficialAppsCoreNavStat$EventScreen> h = rl3.y0(new MobileOfficialAppsCoreNavStat$EventScreen[]{MobileOfficialAppsCoreNavStat$EventScreen.CATALOG, MobileOfficialAppsCoreNavStat$EventScreen.DIALOG, MobileOfficialAppsCoreNavStat$EventScreen.DIALOG_MODAL, MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE_DIALOG});
    public final a f = new a();

    /* compiled from: MusicMediaScopeServiceImpl.kt */
    public static final class a implements m1q0 {
        public a() {
        }

        @Override // xsna.m1q0
        public final void a(UiTrackingScreen uiTrackingScreen, UiTrackingScreen uiTrackingScreen2) {
            boolean contains = on40.g.contains(on40.h.contains(uiTrackingScreen2.a) ? uiTrackingScreen.a : uiTrackingScreen2.a);
            on40 on40Var = on40.this;
            if (contains) {
                on40Var.f(MusicMediaScopeAction.SECTION);
            } else {
                on40Var.g(MusicMediaScopeAction.SECTION);
            }
        }
    }

    @Override // xsna.nn40
    public final void b() {
        UiTracker uiTracker = UiTracker.a;
        UiTracker.g(this.f);
    }

    @Override // xsna.nn40
    public final void c() {
        UiTracker uiTracker = UiTracker.a;
        UiTracker.a(this.f);
    }
}
