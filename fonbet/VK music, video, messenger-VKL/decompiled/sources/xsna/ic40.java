package xsna;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.podcast.PodcastInfo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.domain.model.MixData;
import com.vk.music.bottomsheets.domain.model.OnboardingInfoEntity;
import com.vk.music.bottomsheets.domain.model.PromoInfoEntity;
import com.vk.music.bottomsheets.tracker.MusicBottomSheetActionTracker;
import com.vk.music.common.MusicPlaybackLaunchContext;
import xsna.ec40;
import xsna.f0p;

/* compiled from: MusicBottomSheetLauncher.kt */
/* loaded from: classes.dex */
public interface ic40 extends qd4 {
    static /* synthetic */ void j(ic40 ic40Var, Activity activity, Playlist playlist, MusicPlaybackLaunchContext musicPlaybackLaunchContext, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, NewsEntry newsEntry, int i) {
        if ((i & 8) != 0) {
            musicBottomSheetLaunchPoint = null;
        }
        ic40Var.s(activity, playlist, musicPlaybackLaunchContext, musicBottomSheetLaunchPoint, (i & 32) != 0 ? null : "DisplayMusicPlaylistFragment", (i & 128) != 0 ? null : newsEntry);
    }

    static /* synthetic */ void r(ic40 ic40Var, Activity activity, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext, MusicBottomSheetActionTracker musicBottomSheetActionTracker, boolean z, boolean z2, String str, String str2, int i) {
        String str3;
        ic40 ic40Var2;
        Activity activity2;
        MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint2;
        MusicTrack musicTrack2;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext2 = (i & 8) != 0 ? MusicPlaybackLaunchContext.d : musicPlaybackLaunchContext;
        MusicBottomSheetActionTracker musicBottomSheetActionTracker2 = (i & 16) != 0 ? null : musicBottomSheetActionTracker;
        boolean z3 = (i & 32) != 0 ? false : z;
        boolean z4 = (i & 64) != 0 ? false : z2;
        String str4 = (i & 128) != 0 ? null : str;
        if ((i & 256) != 0) {
            str3 = null;
            activity2 = activity;
            musicBottomSheetLaunchPoint2 = musicBottomSheetLaunchPoint;
            musicTrack2 = musicTrack;
            ic40Var2 = ic40Var;
        } else {
            str3 = str2;
            ic40Var2 = ic40Var;
            activity2 = activity;
            musicBottomSheetLaunchPoint2 = musicBottomSheetLaunchPoint;
            musicTrack2 = musicTrack;
        }
        ic40Var2.n(activity2, musicBottomSheetLaunchPoint2, musicTrack2, musicPlaybackLaunchContext2, musicBottomSheetActionTracker2, z3, z4, str4, str3);
    }

    default void b(FragmentActivity fragmentActivity, boolean z) {
    }

    default void g(Activity activity, boolean z) {
    }

    default void f(Activity activity, Playlist playlist, ec40.a aVar) {
    }

    default void h(Activity activity, int i, PromoInfoEntity promoInfoEntity) {
    }

    default void k(Activity activity, OnboardingInfoEntity onboardingInfoEntity, String str) {
    }

    default void m(Activity activity, Playlist playlist, f0p.e.a aVar) {
    }

    default void a(Activity activity, u2b0 u2b0Var, PodcastInfo podcastInfo, izs<? super Integer, s3q0> izsVar) {
    }

    default void c(Activity activity, MixData mixData, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, boolean z) {
    }

    default void q(Activity activity, String str, twi0 twi0Var, MusicBottomSheetLaunchPoint.Player.Full full) {
    }

    default void i(Activity activity, boolean z, boolean z2, boolean z3, boolean z4) {
    }

    default void l(Activity activity, MusicPlaybackLaunchContext musicPlaybackLaunchContext, Playlist playlist, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, MusicBottomSheetActionTracker musicBottomSheetActionTracker) {
    }

    default void s(Activity activity, Playlist playlist, MusicPlaybackLaunchContext musicPlaybackLaunchContext, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, String str, NewsEntry newsEntry) {
    }

    default void e(MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, MusicPlaybackLaunchContext musicPlaybackLaunchContext, ms1 ms1Var, g9o g9oVar, u2b0 u2b0Var, MusicTrack musicTrack, a630 a630Var, boolean z, Activity activity) {
    }

    default void n(Activity activity, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext, MusicBottomSheetActionTracker musicBottomSheetActionTracker, boolean z, boolean z2, String str, String str2) {
    }
}
