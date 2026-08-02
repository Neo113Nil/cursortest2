package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookPerson;
import com.vk.dto.music.audiobook.AudioBookPersonRole;
import com.vk.dto.podcast.PodcastInfo;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.audiobook.AudioBookBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.audiobook.AudioBookChapterBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.audiobook.AudioBookPersonBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.domain.model.MixData;
import com.vk.music.bottomsheets.domain.model.OnboardingInfoEntity;
import com.vk.music.bottomsheets.domain.model.PromoInfoEntity;
import com.vk.music.bottomsheets.tracker.MusicBottomSheetActionTracker;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.track.MusicTrackId;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import xsna.ec40;
import xsna.f0p;
import xsna.y050;

/* compiled from: AudioBridge.kt */
/* loaded from: classes.dex */
public interface fl4 {
    public static final /* synthetic */ int a = 0;

    static {
        int i = a.a;
    }

    static /* synthetic */ void p(fl4 fl4Var, Activity activity, MusicPlaybackLaunchContext musicPlaybackLaunchContext, Playlist playlist, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, p9a p9aVar, int i) {
        if ((i & 8) != 0) {
            musicBottomSheetLaunchPoint = MusicBottomSheetLaunchPoint.App.b;
        }
        MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint2 = musicBottomSheetLaunchPoint;
        if ((i & 16) != 0) {
            p9aVar = null;
        }
        fl4Var.j(activity, musicPlaybackLaunchContext, playlist, musicBottomSheetLaunchPoint2, p9aVar);
    }

    static /* synthetic */ void y(fl4 fl4Var, Context context, VideoFile videoFile, SearchStatsLoggingInfo searchStatsLoggingInfo, int i) {
        if ((i & 4) != 0) {
            searchStatsLoggingInfo = null;
        }
        fl4Var.K(context, videoFile, searchStatsLoggingInfo);
    }

    default void A() {
        rdi.E();
    }

    default void B() {
        rdi.E();
    }

    default io.reactivex.rxjava3.disposables.c C(Context context, List<? extends Pair<String, ? extends List<Integer>>> list, int i, Object obj) {
        io.reactivex.rxjava3.disposables.f fVar = new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);
        rdi.F(fVar);
        return fVar;
    }

    default io.reactivex.rxjava3.disposables.c D(String str, gzs gzsVar, boolean z) {
        io.reactivex.rxjava3.disposables.f fVar = new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);
        rdi.F(fVar);
        return fVar;
    }

    default void E(Activity activity, UserId userId) {
        rdi.E();
    }

    default void G(Context context, int i, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        rdi.E();
    }

    default void H(Context context, Artist artist) {
        rdi.E();
    }

    default void I(Context context, Playlist playlist, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        rdi.E();
    }

    default void J(Activity activity, UserId userId, MusicPlaybackLaunchContext musicPlaybackLaunchContext, String str) {
        rdi.E();
    }

    default void K(Context context, VideoFile videoFile, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        rdi.E();
    }

    default void L(Activity activity, VideoFile videoFile) {
        rdi.E();
    }

    default void M(Context context, String str, SearchStatsLoggingInfo searchStatsLoggingInfo, Boolean bool) {
        rdi.E();
    }

    default void N(Activity activity) {
        rdi.E();
    }

    default void O(Context context, UserId userId, int i, MusicPlaybackLaunchContext musicPlaybackLaunchContext, MusicTrack.AssistantData assistantData) {
        rdi.E();
    }

    default void P() {
        rdi.E();
    }

    default void Q(Context context) {
        rdi.E();
    }

    y050 U();

    r24 a();

    wk40 g();

    default boolean h() {
        return false;
    }

    default void i(Context context) {
        rdi.E();
    }

    default void j(Activity activity, MusicPlaybackLaunchContext musicPlaybackLaunchContext, Playlist playlist, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, MusicBottomSheetActionTracker musicBottomSheetActionTracker) {
        rdi.E();
    }

    default void k(Activity activity, MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext, String str) {
        rdi.E();
    }

    default void l(Context context, String str) {
        rdi.E();
    }

    default void m(Activity activity, MusicTrack musicTrack, boolean z, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        rdi.E();
    }

    default void n(Context context) {
        rdi.E();
    }

    default void o(Context context, int i, MusicPlaybackLaunchContext musicPlaybackLaunchContext, String str) {
        rdi.E();
    }

    default void q(Activity activity, String str, String str2) {
        rdi.E();
    }

    default void r(Activity activity, MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        rdi.E();
    }

    default void s(Context context, int i, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        rdi.E();
    }

    default void t(Activity activity) {
        rdi.E();
    }

    default void u(Context context, Playlist playlist) {
        rdi.E();
    }

    default void v(Context context, UserId userId, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        rdi.E();
    }

    ic40 w();

    default void x(Context context, boolean z) {
        rdi.E();
    }

    a550 z();

    /* compiled from: AudioBridge.kt */
    public static final class a {
        public static final /* synthetic */ int a = 0;

        static {
            new C2880a();
        }

        /* compiled from: AudioBridge.kt */
        /* renamed from: xsna.fl4$a$a, reason: collision with other inner class name */
        public static final class C2880a implements fl4 {
            public final d b = new d();
            public final C2881a c = new C2881a();
            public final b d = new b();
            public final c e = new c();
            public final y050 f = y050.a.a.getSTUB();

            /* compiled from: AudioBridge.kt */
            /* renamed from: xsna.fl4$a$a$a, reason: collision with other inner class name */
            public static final class C2881a implements r24 {
                @Override // xsna.r24
                public final Intent a(Context context, ArrayList<MusicTrackId> arrayList, ArrayList<MusicTrackId> arrayList2, UserId userId) {
                    return new Intent();
                }

                @Override // xsna.r24
                public final ArrayList b(Intent intent) {
                    return null;
                }

                @Override // xsna.r24
                public final ArrayList c(Intent intent) {
                    return null;
                }
            }

            @Override // xsna.fl4
            public final void A() {
                rdi.E();
            }

            @Override // xsna.fl4
            public final void B() {
                rdi.E();
            }

            @Override // xsna.fl4
            public final void E(Activity activity, UserId userId) {
                rdi.E();
            }

            @Override // xsna.fl4
            public final void G(Context context, int i, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
                rdi.E();
            }

            @Override // xsna.fl4
            public final void H(Context context, Artist artist) {
                rdi.E();
            }

            @Override // xsna.fl4
            public final void I(Context context, Playlist playlist, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
                rdi.E();
            }

            @Override // xsna.fl4
            public final void J(Activity activity, UserId userId, MusicPlaybackLaunchContext musicPlaybackLaunchContext, String str) {
                rdi.E();
            }

            @Override // xsna.fl4
            public final void K(Context context, VideoFile videoFile, SearchStatsLoggingInfo searchStatsLoggingInfo) {
                rdi.E();
            }

            @Override // xsna.fl4
            public final void L(Activity activity, VideoFile videoFile) {
                rdi.E();
            }

            @Override // xsna.fl4
            public final void M(Context context, String str, SearchStatsLoggingInfo searchStatsLoggingInfo, Boolean bool) {
                rdi.E();
            }

            @Override // xsna.fl4
            public final void N(Activity activity) {
                rdi.E();
            }

            @Override // xsna.fl4
            public final void O(Context context, UserId userId, int i, MusicPlaybackLaunchContext musicPlaybackLaunchContext, MusicTrack.AssistantData assistantData) {
                rdi.E();
            }

            @Override // xsna.fl4
            public final void P() {
                rdi.E();
            }

            @Override // xsna.fl4
            public final void Q(Context context) {
                rdi.E();
            }

            @Override // xsna.fl4
            public final y050 U() {
                return this.f;
            }

            @Override // xsna.fl4
            public final r24 a() {
                return this.c;
            }

            @Override // xsna.fl4
            public final wk40 g() {
                return this.e;
            }

            @Override // xsna.fl4
            public final boolean h() {
                return false;
            }

            @Override // xsna.fl4
            public final void i(Context context) {
                rdi.E();
            }

            @Override // xsna.fl4
            public final void j(Activity activity, MusicPlaybackLaunchContext musicPlaybackLaunchContext, Playlist playlist, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, MusicBottomSheetActionTracker musicBottomSheetActionTracker) {
                rdi.E();
            }

            @Override // xsna.fl4
            public final void k(Activity activity, MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext, String str) {
                rdi.E();
            }

            @Override // xsna.fl4
            public final void l(Context context, String str) {
                rdi.E();
            }

            @Override // xsna.fl4
            public final void m(Activity activity, MusicTrack musicTrack, boolean z, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
                rdi.E();
            }

            @Override // xsna.fl4
            public final void n(Context context) {
                rdi.E();
            }

            @Override // xsna.fl4
            public final void o(Context context, int i, MusicPlaybackLaunchContext musicPlaybackLaunchContext, String str) {
                rdi.E();
            }

            @Override // xsna.fl4
            public final void q(Activity activity, String str, String str2) {
                rdi.E();
            }

            @Override // xsna.fl4
            public final void r(Activity activity, MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
                rdi.E();
            }

            @Override // xsna.fl4
            public final void s(Context context, int i, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
                rdi.E();
            }

            @Override // xsna.fl4
            public final void t(Activity activity) {
                rdi.E();
            }

            @Override // xsna.fl4
            public final void u(Context context, Playlist playlist) {
                rdi.E();
            }

            @Override // xsna.fl4
            public final void v(Context context, UserId userId, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
                rdi.E();
            }

            @Override // xsna.fl4
            public final ic40 w() {
                return this.d;
            }

            @Override // xsna.fl4
            public final void x(Context context, boolean z) {
                rdi.E();
            }

            @Override // xsna.fl4
            public final a550 z() {
                return this.b;
            }

            /* compiled from: AudioBridge.kt */
            /* renamed from: xsna.fl4$a$a$b */
            public static final class b implements ic40 {
                @Override // xsna.ic40
                public final void b(FragmentActivity fragmentActivity, boolean z) {
                }

                @Override // xsna.ic40
                public final void g(Activity activity, boolean z) {
                }

                @Override // xsna.qd4
                public final void u(Activity activity, AudioBookChapterBottomSheetLaunchPoint.RemoveDownload removeDownload) {
                }

                @Override // xsna.ic40
                public final void f(Activity activity, Playlist playlist, ec40.a aVar) {
                }

                @Override // xsna.ic40
                public final void h(Activity activity, int i, PromoInfoEntity promoInfoEntity) {
                }

                @Override // xsna.ic40
                public final void k(Activity activity, OnboardingInfoEntity onboardingInfoEntity, String str) {
                }

                @Override // xsna.ic40
                public final void m(Activity activity, Playlist playlist, f0p.e.a aVar) {
                }

                @Override // xsna.ic40
                public final void a(Activity activity, u2b0 u2b0Var, PodcastInfo podcastInfo, izs<? super Integer, s3q0> izsVar) {
                }

                @Override // xsna.ic40
                public final void c(Activity activity, MixData mixData, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, boolean z) {
                }

                @Override // xsna.ic40
                public final void q(Activity activity, String str, twi0 twi0Var, MusicBottomSheetLaunchPoint.Player.Full full) {
                }

                @Override // xsna.qd4
                public final void d(Activity activity, String str, String str2, AudioBookPersonRole audioBookPersonRole, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
                }

                @Override // xsna.ic40
                public final void i(Activity activity, boolean z, boolean z2, boolean z3, boolean z4) {
                }

                @Override // xsna.ic40
                public final void l(Activity activity, MusicPlaybackLaunchContext musicPlaybackLaunchContext, Playlist playlist, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, MusicBottomSheetActionTracker musicBottomSheetActionTracker) {
                }

                @Override // xsna.qd4
                public final void o(Activity activity, AudioBook audioBook, AudioBookBottomSheetLaunchPoint audioBookBottomSheetLaunchPoint, MusicPlaybackLaunchContext musicPlaybackLaunchContext, boolean z) {
                }

                @Override // xsna.qd4
                public final void p(Activity activity, AudioBookPersonBottomSheetLaunchPoint audioBookPersonBottomSheetLaunchPoint, List<AudioBookPerson> list, AudioBookPerson audioBookPerson, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
                }

                @Override // xsna.ic40
                public final void s(Activity activity, Playlist playlist, MusicPlaybackLaunchContext musicPlaybackLaunchContext, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, String str, NewsEntry newsEntry) {
                }

                @Override // xsna.ic40
                public final void e(MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, MusicPlaybackLaunchContext musicPlaybackLaunchContext, ms1 ms1Var, g9o g9oVar, u2b0 u2b0Var, MusicTrack musicTrack, a630 a630Var, boolean z, Activity activity) {
                }

                @Override // xsna.ic40
                public final void n(Activity activity, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext, MusicBottomSheetActionTracker musicBottomSheetActionTracker, boolean z, boolean z2, String str, String str2) {
                }
            }

            /* compiled from: AudioBridge.kt */
            /* renamed from: xsna.fl4$a$a$c */
            public static final class c implements wk40 {
                @Override // xsna.wk40
                public final void a(Context context, String str) {
                }

                @Override // xsna.wk40
                public final void c(Context context, Playlist playlist) {
                }

                @Override // xsna.wk40
                public final void e(Context context, UserId userId, String str) {
                }

                @Override // xsna.wk40
                public final void b(Context context, String str, String str2, String str3, SearchStatsLoggingInfo searchStatsLoggingInfo) {
                }

                @Override // xsna.wk40
                public final void f(Context context, UserId userId, String str, String str2, boolean z) {
                }
            }

            /* compiled from: AudioBridge.kt */
            /* renamed from: xsna.fl4$a$a$d */
            public static final class d implements a550 {
                @Override // xsna.a550
                public final void a(Context context, UserId userId, int i, String str, String str2, String str3, boolean z, String str4) {
                }
            }
        }
    }
}
