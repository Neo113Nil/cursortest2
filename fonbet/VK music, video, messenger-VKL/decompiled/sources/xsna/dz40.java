package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.Thumb;
import com.vk.dto.music.reactions.Reaction;
import com.vk.music.player.LoopMode;
import com.vk.music.player.domain.state.LyricsScrollMode;
import com.vk.music.stickyplayer.domain.lyrics.TabLyricsMode;
import com.vk.music.stickyplayer.domain.onboarding.OnboardingStrategy;
import com.vk.music.stickyplayer.presentation.components.BigPlayerBottomSheetValue;
import com.vk.music.stickyplayer.presentation.components.ParentBottomSheetState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.gfp0;

/* compiled from: MusicPlayerViewState.kt */
/* loaded from: classes3.dex */
public final class dz40 implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;
    public final fi50 d;

    /* compiled from: MusicPlayerViewState.kt */
    public static final class a {
        public final Set a;
        public final e b;
        public final boolean c;
        public final boolean d;
        public final boolean e;

        public a(Set set, e eVar, boolean z, boolean z2, boolean z3) {
            this.a = set;
            this.b = eVar;
            this.c = z;
            this.d = z2;
            this.e = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + qoy.b(qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ActionsPanelData(chips=");
            sb.append((Object) ipw.a(this.a));
            sb.append(", chipsOnboardingData=");
            sb.append(this.b);
            sb.append(", skipAnimation=");
            sb.append(this.c);
            sb.append(", isKidsModeEnabled=");
            sb.append(this.d);
            sb.append(", isSleepTimerTicking=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: MusicPlayerViewState.kt */
    public static final class b implements fm50<sy40> {
        public final f a;
        public final yzt0<g> b;
        public final yzt0<h> c;
        public final yzt0<gfp0.a> d;
        public final yzt0<c> e;
        public final yzt0<ipw<d>> f;
        public final m g;
        public final yzt0<n.a> h;
        public final yzt0<Boolean> i;
        public final yzt0<OnboardingStrategy> j;

        public b(f fVar, h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, m mVar, h0u0 h0u0Var6, h0u0 h0u0Var7, h0u0 h0u0Var8) {
            this.a = fVar;
            this.b = h0u0Var;
            this.c = h0u0Var2;
            this.d = h0u0Var3;
            this.e = h0u0Var4;
            this.f = h0u0Var5;
            this.g = mVar;
            this.h = h0u0Var6;
            this.i = h0u0Var7;
            this.j = h0u0Var8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && epx.f(this.h, bVar.h) && epx.f(this.i, bVar.i) && epx.f(this.j, bVar.j);
        }

        public final int hashCode() {
            return this.j.hashCode() + sr.a(this.i, sr.a(this.h, (this.g.hashCode() + sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31)) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioBookRender(commonData=");
            sb.append(this.a);
            sb.append(", covers=");
            sb.append(this.b);
            sb.append(", headerData=");
            sb.append(this.c);
            sb.append(", currentTrackData=");
            sb.append(this.d);
            sb.append(", audioPermissions=");
            sb.append(this.e);
            sb.append(", chips=");
            sb.append(this.f);
            sb.append(", playbackControlData=");
            sb.append(this.g);
            sb.append(", playbackQueue=");
            sb.append(this.h);
            sb.append(", isOnboardingAnimationPlaying=");
            sb.append(this.i);
            sb.append(", onboardingStrategy=");
            return tr.c(sb, this.j, ')');
        }
    }

    /* compiled from: MusicPlayerViewState.kt */
    public static final class c {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public c(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioPermissions(canAdd=");
            sb.append(this.a);
            sb.append(", canRemove=");
            sb.append(this.b);
            sb.append(", canDislike=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: MusicPlayerViewState.kt */
    public interface d {

        /* compiled from: MusicPlayerViewState.kt */
        public static final class a implements d {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 685630039;
            }

            public final String toString() {
                return "AddToPlaylist";
            }
        }

        /* compiled from: MusicPlayerViewState.kt */
        public static final class b implements d {
            public final boolean a;
            public final String b;
            public final String c;

            public b(boolean z, String str, String str2) {
                this.a = z;
                this.b = str;
                this.c = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + urd0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Concerts(isVisible=");
                sb.append(this.a);
                sb.append(", caption=");
                sb.append(this.b);
                sb.append(", url=");
                return ho8.a(sb, this.c, ')');
            }
        }

        /* compiled from: MusicPlayerViewState.kt */
        public static final class c implements d {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1519093720;
            }

            public final String toString() {
                return "ConfigureVkMix";
            }
        }

        /* compiled from: MusicPlayerViewState.kt */
        /* renamed from: xsna.dz40$d$d, reason: collision with other inner class name */
        public static final class C2771d implements d {
            public final boolean a;
            public final boolean b;

            public C2771d(boolean z, boolean z2) {
                this.a = z;
                this.b = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2771d)) {
                    return false;
                }
                C2771d c2771d = (C2771d) obj;
                return this.a == c2771d.a && this.b == c2771d.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Dislike(isDisliked=");
                sb.append(this.a);
                sb.append(", hasKidsContext=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: MusicPlayerViewState.kt */
        public interface e extends d {

            /* compiled from: MusicPlayerViewState.kt */
            public static final class a implements e {
                public final DownloadingState a;

                public a(DownloadingState downloadingState) {
                    this.a = downloadingState;
                }

                @Override // xsna.dz40.d.e
                public final int b() {
                    DownloadingState.Downloaded downloaded = DownloadingState.Downloaded.b;
                    DownloadingState downloadingState = this.a;
                    if (downloadingState.equals(downloaded) || downloadingState.equals(DownloadingState.PartlyDownloaded.b) || downloadingState.equals(DownloadingState.Corrupted.b)) {
                        return R.string.music_talkback_downloaded_audio_book_chapter;
                    }
                    if (downloadingState.equals(DownloadingState.NotLoaded.b)) {
                        return R.string.music_talkback_download_audio_book_chapter;
                    }
                    if (downloadingState.equals(DownloadingState.PendingDownload.b)) {
                        return R.string.music_talkback_pending_downloading_audio_book_chapter;
                    }
                    if (downloadingState instanceof DownloadingState.Downloading) {
                        return R.string.music_talkback_downloading_audio_book_chapter;
                    }
                    throw new NoWhenBranchMatchedException();
                }

                @Override // xsna.dz40.d.e
                public final Object c() {
                    return this.a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && this.a.equals(((a) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "Chapter(downloadingState=" + ((Object) qow.b(this.a)) + ')';
                }
            }

            /* compiled from: MusicPlayerViewState.kt */
            public static final class b implements e {
                public final Object a;
                public final Integer b;
                public final boolean c;

                public b(DownloadingState downloadingState, Integer num, boolean z) {
                    this.a = downloadingState;
                    this.b = num;
                    this.c = z;
                }

                @Override // xsna.dz40.d.e
                public final Integer a() {
                    return this.b;
                }

                @Override // xsna.dz40.d.e
                public final int b() {
                    boolean z = this.c;
                    Object obj = this.a;
                    if (z) {
                        DownloadingState downloadingState = (DownloadingState) obj;
                        if (epx.f(downloadingState, DownloadingState.Downloaded.b) || epx.f(downloadingState, DownloadingState.PartlyDownloaded.b) || epx.f(downloadingState, DownloadingState.Corrupted.b)) {
                            return R.string.music_kids_talkback_downloaded_track;
                        }
                        if (epx.f(downloadingState, DownloadingState.NotLoaded.b)) {
                            return R.string.music_kids_talkback_download_track;
                        }
                        if (epx.f(downloadingState, DownloadingState.PendingDownload.b)) {
                            return R.string.music_kids_talkback_pending_downloading_track;
                        }
                        if (downloadingState instanceof DownloadingState.Downloading) {
                            return R.string.music_kids_talkback_downloading_track;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    DownloadingState downloadingState2 = (DownloadingState) obj;
                    if (epx.f(downloadingState2, DownloadingState.Downloaded.b) || epx.f(downloadingState2, DownloadingState.PartlyDownloaded.b) || epx.f(downloadingState2, DownloadingState.Corrupted.b)) {
                        return R.string.music_talkback_downloaded_track;
                    }
                    if (epx.f(downloadingState2, DownloadingState.NotLoaded.b)) {
                        return R.string.music_talkback_download_track;
                    }
                    if (epx.f(downloadingState2, DownloadingState.PendingDownload.b)) {
                        return R.string.music_talkback_pending_downloading_track;
                    }
                    if (downloadingState2 instanceof DownloadingState.Downloading) {
                        return R.string.music_talkback_downloading_track;
                    }
                    throw new NoWhenBranchMatchedException();
                }

                @Override // xsna.dz40.d.e
                public final Object c() {
                    return this.a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c;
                }

                public final int hashCode() {
                    int a = qow.a(this.a) * 31;
                    Integer num = this.b;
                    return Boolean.hashCode(this.c) + ((a + (num == null ? 0 : num.hashCode())) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Music(downloadingState=");
                    sb.append((Object) qow.b(this.a));
                    sb.append(", textRes=");
                    sb.append(this.b);
                    sb.append(", hasKidsContext=");
                    return defpackage.q0.a(sb, this.c, ')');
                }
            }

            default Integer a() {
                DownloadingState downloadingState = (DownloadingState) c();
                if (downloadingState.equals(DownloadingState.Downloaded.b) || downloadingState.equals(DownloadingState.PartlyDownloaded.b) || downloadingState.equals(DownloadingState.Corrupted.b)) {
                    return null;
                }
                if (downloadingState.equals(DownloadingState.NotLoaded.b)) {
                    return Integer.valueOf(R.string.music_player_button_download_track_title);
                }
                if ((downloadingState instanceof DownloadingState.Downloading) || downloadingState.equals(DownloadingState.PendingDownload.b)) {
                    return Integer.valueOf(R.string.music_player_button_downloading_track_title);
                }
                throw new NoWhenBranchMatchedException();
            }

            int b();

            Object c();
        }

        /* compiled from: MusicPlayerViewState.kt */
        public static final class f implements d {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 1327132421;
            }

            public final String toString() {
                return "GoToAudioBook";
            }
        }

        /* compiled from: MusicPlayerViewState.kt */
        public static final class g implements d {
            public static final g a = new g();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return -1587117778;
            }

            public final String toString() {
                return "GoToAudioBookNarrator";
            }
        }

        /* compiled from: MusicPlayerViewState.kt */
        public static final class h implements d {
            public static final h a = new h();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return 409382641;
            }

            public final String toString() {
                return "GoToPodcastEpisode";
            }
        }

        /* compiled from: MusicPlayerViewState.kt */
        public static final class i implements d {
            public static final i a = new i();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof i);
            }

            public final int hashCode() {
                return -1956332196;
            }

            public final String toString() {
                return "MarkAsListened";
            }
        }

        /* compiled from: MusicPlayerViewState.kt */
        public static final class j implements d {
            public static final j a = new j();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            public final int hashCode() {
                return -576021029;
            }

            public final String toString() {
                return "PlayerSettings";
            }
        }

        /* compiled from: MusicPlayerViewState.kt */
        public static final class k implements d {
            public final boolean a;

            public k(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && this.a == ((k) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("TrackMix(isLoading="), this.a, ')');
            }
        }
    }

    /* compiled from: MusicPlayerViewState.kt */
    public static final class e {
        public final ParentBottomSheetState a;
        public final BigPlayerBottomSheetValue b;
        public final boolean c;
        public final boolean d;
        public final boolean e;

        public /* synthetic */ e(ParentBottomSheetState parentBottomSheetState, BigPlayerBottomSheetValue bigPlayerBottomSheetValue, boolean z) {
            this(parentBottomSheetState, bigPlayerBottomSheetValue, z, false, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.d == eVar.d && this.e == eVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + qoy.b(qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChipsOnboardingData(parentCollapseState=");
            sb.append(this.a);
            sb.append(", bottomSheetState=");
            sb.append(this.b);
            sb.append(", isAnimationNeedToPlay=");
            sb.append(this.c);
            sb.append(", hasMusicSubscription=");
            sb.append(this.d);
            sb.append(", isRestrictedXiaomi=");
            return defpackage.q0.a(sb, this.e, ')');
        }

        public e(ParentBottomSheetState parentBottomSheetState, BigPlayerBottomSheetValue bigPlayerBottomSheetValue, boolean z, boolean z2, boolean z3) {
            this.a = parentBottomSheetState;
            this.b = bigPlayerBottomSheetValue;
            this.c = z;
            this.d = z2;
            this.e = z3;
        }
    }

    /* compiled from: MusicPlayerViewState.kt */
    public static final class f {
        public final yzt0<Integer> a;
        public final yzt0<Integer> b;
        public final yzt0<Integer> c;
        public final yzt0<Boolean> d;
        public final yzt0<Boolean> e;
        public final yzt0<Boolean> f;
        public final yzt0<Boolean> g;
        public final yzt0<Boolean> h;
        public final yzt0<Boolean> i;

        public f(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7, h0u0 h0u0Var8, h0u0 h0u0Var9) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
            this.f = h0u0Var6;
            this.g = h0u0Var7;
            this.h = h0u0Var8;
            this.i = h0u0Var9;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c) && epx.f(this.d, fVar.d) && epx.f(this.e, fVar.e) && epx.f(this.f, fVar.f) && epx.f(this.g, fVar.g) && epx.f(this.h, fVar.h) && epx.f(this.i, fVar.i);
        }

        public final int hashCode() {
            return this.i.hashCode() + sr.a(this.h, sr.a(this.g, sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CommonRenderData(durationSec=");
            sb.append(this.a);
            sb.append(", playPositionSec=");
            sb.append(this.b);
            sb.append(", bufferingPercent=");
            sb.append(this.c);
            sb.append(", isPlaying=");
            sb.append(this.d);
            sb.append(", canGoBack=");
            sb.append(this.e);
            sb.append(", canGoForward=");
            sb.append(this.f);
            sb.append(", canViewPlaybackQueue=");
            sb.append(this.g);
            sb.append(", isKidsModeEnabled=");
            sb.append(this.h);
            sb.append(", isInformerVisible=");
            return tr.c(sb, this.i, ')');
        }
    }

    /* compiled from: MusicPlayerViewState.kt */
    public static final class g {
        public final ArrayList a;
        public final int b;
        public final boolean c;

        public g(ArrayList arrayList, int i, boolean z) {
            this.a = arrayList;
            this.b = i;
            this.c = z;
        }

        public final String a() {
            return (String) j5g.b0(this.b, new wow(this.a));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a.equals(gVar.a) && this.b == gVar.b && this.c == gVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Covers(images=");
            kr.d(this.a, sb, ", currentIndex=");
            sb.append(this.b);
            sb.append(", isRepeatListOn=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: MusicPlayerViewState.kt */
    public interface h {

        /* compiled from: MusicPlayerViewState.kt */
        public static final class a implements h {
            public final int a;
            public final String b;
            public final boolean c;

            public a(int i, String str, boolean z) {
                this.a = i;
                this.b = str;
                this.c = z;
            }

            @Override // xsna.dz40.h
            public final boolean a() {
                return this.c;
            }

            @Override // xsna.dz40.h
            public final int b() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c;
            }

            @Override // xsna.dz40.h
            public final String getTitle() {
                return this.b;
            }

            public final int hashCode() {
                int hashCode = Integer.hashCode(this.a) * 31;
                String str = this.b;
                return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Default(sourceRes=");
                sb.append(this.a);
                sb.append(", title=");
                sb.append(this.b);
                sb.append(", isHeaderClickable=");
                return defpackage.q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: MusicPlayerViewState.kt */
        public static final class b implements h {
            public final int a;
            public final String b;
            public final boolean c;
            public final String d;

            public b(int i, String str, boolean z, String str2) {
                this.a = i;
                this.b = str;
                this.c = z;
                this.d = str2;
            }

            @Override // xsna.dz40.h
            public final boolean a() {
                return this.c;
            }

            @Override // xsna.dz40.h
            public final int b() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && epx.f(this.b, bVar.b) && this.c == bVar.c && epx.f(this.d, bVar.d);
            }

            @Override // xsna.dz40.h
            public final String getTitle() {
                return this.b;
            }

            public final int hashCode() {
                int hashCode = Integer.hashCode(this.a) * 31;
                String str = this.b;
                return Integer.hashCode(R.string.music_player_header_output_source) + urd0.a(qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("WithDevice(sourceRes=");
                sb.append(this.a);
                sb.append(", title=");
                sb.append(this.b);
                sb.append(", isHeaderClickable=");
                sb.append(this.c);
                sb.append(", deviceArg=");
                return i5s.a(sb, this.d, ", titleSourceRes=2131959809)");
            }
        }

        boolean a();

        int b();

        String getTitle();
    }

    /* compiled from: MusicPlayerViewState.kt */
    public static final class i implements fm50<sy40> {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -586764687;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: MusicPlayerViewState.kt */
    public static final class j {
        public final LyricsScrollMode a;
        public final TabLyricsMode b;
        public final Object c;
        public final int d;
        public final boolean e;

        public j(LyricsScrollMode lyricsScrollMode, TabLyricsMode tabLyricsMode, List list, int i, boolean z) {
            this.a = lyricsScrollMode;
            this.b = tabLyricsMode;
            this.c = list;
            this.d = i;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.a == jVar.a && this.b == jVar.b && this.c.equals(jVar.c) && this.d == jVar.d && this.e == jVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + shy.a(this.d, vul0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31);
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.List] */
        public final String toString() {
            StringBuilder sb = new StringBuilder("LyricsData(scrollMode=");
            sb.append(this.a);
            sb.append(", lyricsMode=");
            sb.append(this.b);
            sb.append(", items=");
            sb.append((Object) wow.c(this.c));
            sb.append(", indexOfActiveLine=");
            sb.append(this.d);
            sb.append(", isStaticText=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: MusicPlayerViewState.kt */
    public static final class k {
        public final boolean a;
        public final Boolean b;
        public final LoopMode c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final wh50<Boolean> g;
        public final boolean h;
        public final boolean i;

        public k(boolean z, Boolean bool, LoopMode loopMode, boolean z2, boolean z3, boolean z4, wh50<Boolean> wh50Var, boolean z5, boolean z6) {
            this.a = z;
            this.b = bool;
            this.c = loopMode;
            this.d = z2;
            this.e = z3;
            this.f = z4;
            this.g = wh50Var;
            this.h = z5;
            this.i = z6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.a == kVar.a && epx.f(this.b, kVar.b) && this.c == kVar.c && this.d == kVar.d && this.e == kVar.e && this.f == kVar.f && epx.f(this.g, kVar.g) && this.h == kVar.h && this.i == kVar.i;
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            Boolean bool = this.b;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            LoopMode loopMode = this.c;
            return Boolean.hashCode(this.i) + qoy.b((this.g.hashCode() + qoy.b(qoy.b(qoy.b((hashCode2 + (loopMode != null ? loopMode.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MusicBigPlayerControlsData(isPlaying=");
            sb.append(this.a);
            sb.append(", isShuffleOn=");
            sb.append(this.b);
            sb.append(", loopMode=");
            sb.append(this.c);
            sb.append(", canGoBack=");
            sb.append(this.d);
            sb.append(", canGoForward=");
            sb.append(this.e);
            sb.append(", isAdvertisement=");
            sb.append(this.f);
            sb.append(", isDragged=");
            sb.append(this.g);
            sb.append(", isKidsModeEnabled=");
            sb.append(this.h);
            sb.append(", hasKidsContext=");
            return defpackage.q0.a(sb, this.i, ')');
        }
    }

    /* compiled from: MusicPlayerViewState.kt */
    public static final class l implements fm50<sy40> {
        public final f a;
        public final yzt0<g> b;
        public final yzt0<h> c;
        public final yzt0<gfp0.b> d;
        public final yzt0<c> e;
        public final yzt0<Boolean> f;
        public final yzt0<LoopMode> g;
        public final yzt0<n.b> h;
        public final yzt0<Boolean> i;
        public final yzt0<ipw<d>> j;
        public final yzt0<j> k;
        public final yzt0<Boolean> l;
        public final yzt0<OnboardingStrategy> m;
        public final yzt0<Boolean> n;

        public l(f fVar, h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7, h0u0 h0u0Var8, h0u0 h0u0Var9, h0u0 h0u0Var10, h0u0 h0u0Var11, h0u0 h0u0Var12, h0u0 h0u0Var13) {
            this.a = fVar;
            this.b = h0u0Var;
            this.c = h0u0Var2;
            this.d = h0u0Var3;
            this.e = h0u0Var4;
            this.f = h0u0Var5;
            this.g = h0u0Var6;
            this.h = h0u0Var7;
            this.i = h0u0Var8;
            this.j = h0u0Var9;
            this.k = h0u0Var10;
            this.l = h0u0Var11;
            this.m = h0u0Var12;
            this.n = h0u0Var13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return epx.f(this.a, lVar.a) && epx.f(this.b, lVar.b) && epx.f(this.c, lVar.c) && epx.f(this.d, lVar.d) && epx.f(this.e, lVar.e) && epx.f(this.f, lVar.f) && epx.f(this.g, lVar.g) && epx.f(this.h, lVar.h) && epx.f(this.i, lVar.i) && epx.f(this.j, lVar.j) && epx.f(this.k, lVar.k) && epx.f(this.l, lVar.l) && epx.f(this.m, lVar.m) && epx.f(this.n, lVar.n);
        }

        public final int hashCode() {
            return this.n.hashCode() + sr.a(this.m, sr.a(this.l, sr.a(this.k, sr.a(this.j, sr.a(this.i, sr.a(this.h, sr.a(this.g, sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MusicRender(commonData=");
            sb.append(this.a);
            sb.append(", covers=");
            sb.append(this.b);
            sb.append(", headerData=");
            sb.append(this.c);
            sb.append(", currentTrackData=");
            sb.append(this.d);
            sb.append(", audioPermissions=");
            sb.append(this.e);
            sb.append(", isShuffleOn=");
            sb.append(this.f);
            sb.append(", loopMode=");
            sb.append(this.g);
            sb.append(", playbackQueue=");
            sb.append(this.h);
            sb.append(", isVkMix=");
            sb.append(this.i);
            sb.append(", chips=");
            sb.append(this.j);
            sb.append(", lyricsData=");
            sb.append(this.k);
            sb.append(", isOnboardingAnimationPlaying=");
            sb.append(this.l);
            sb.append(", onboardingStrategy=");
            sb.append(this.m);
            sb.append(", isSleepTimerTicking=");
            return tr.c(sb, this.n, ')');
        }
    }

    /* compiled from: MusicPlayerViewState.kt */
    public static final class m {
        public final yzt0<Float> a;
        public final yzt0<Boolean> b;

        public m(h0u0 h0u0Var, h0u0 h0u0Var2) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return epx.f(this.a, mVar.a) && epx.f(this.b, mVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlaybackControlData(playbackSpeed=");
            sb.append(this.a);
            sb.append(", isSleepTimerTicking=");
            return tr.c(sb, this.b, ')');
        }
    }

    /* compiled from: MusicPlayerViewState.kt */
    public interface n {

        /* compiled from: MusicPlayerViewState.kt */
        public static final class a implements n {
            public final ArrayList a;
            public final List b;

            public a(ArrayList arrayList, List list) {
                this.a = arrayList;
                this.b = list;
            }

            @Override // xsna.dz40.n
            public final List a() {
                return this.a;
            }

            @Override // xsna.dz40.n
            public final List c() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a.equals(aVar.a) && epx.f(this.b, aVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AudioBook(tracklist=");
                kr.d(this.a, sb, ", notLoadedIds=");
                return jr.a(')', sb, this.b);
            }
        }

        /* compiled from: MusicPlayerViewState.kt */
        public static final class b implements n, f {
            public final ArrayList a;
            public final List b;
            public final e c;

            public b(ArrayList arrayList, List list, e eVar) {
                this.a = arrayList;
                this.b = list;
                this.c = eVar;
            }

            @Override // xsna.dz40.n
            public final List a() {
                return this.a;
            }

            @Override // xsna.dz40.n.f
            public final e b() {
                return this.c;
            }

            @Override // xsna.dz40.n
            public final List c() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a.equals(bVar.a) && epx.f(this.b, bVar.b) && this.c.equals(bVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + fw3.a(this.a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Music(tracklist=");
                kr.d(this.a, sb, ", notLoadedIds=");
                mr.c(", saveAsPlaylistButtonState=", sb, this.b);
                sb.append(this.c);
                sb.append(')');
                return sb.toString();
            }
        }

        /* compiled from: MusicPlayerViewState.kt */
        public static final class c implements n {
            public final ArrayList a;
            public final List b;

            public c(ArrayList arrayList, List list) {
                this.a = arrayList;
                this.b = list;
            }

            @Override // xsna.dz40.n
            public final List a() {
                return this.a;
            }

            @Override // xsna.dz40.n
            public final List c() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a.equals(cVar.a) && epx.f(this.b, cVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Podcast(tracklist=");
                kr.d(this.a, sb, ", notLoadedIds=");
                return jr.a(')', sb, this.b);
            }
        }

        /* compiled from: MusicPlayerViewState.kt */
        public static final class d implements n {
            public final ArrayList a;
            public final List b;

            public d(ArrayList arrayList, List list) {
                this.a = arrayList;
                this.b = list;
            }

            @Override // xsna.dz40.n
            public final List a() {
                return this.a;
            }

            @Override // xsna.dz40.n
            public final List c() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.a.equals(dVar.a) && epx.f(this.b, dVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Radio(tracklist=");
                kr.d(this.a, sb, ", notLoadedIds=");
                return jr.a(')', sb, this.b);
            }
        }

        /* compiled from: MusicPlayerViewState.kt */
        public static final class e {
            public final boolean a;
            public final boolean b;

            public e(boolean z, boolean z2) {
                this.a = z;
                this.b = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return this.a == eVar.a && this.b == eVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SaveAsPlaylistButtonState(isEnabled=");
                sb.append(this.a);
                sb.append(", isSaveInProgress=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: MusicPlayerViewState.kt */
        public interface f {
            e b();
        }

        List a();

        List c();
    }

    /* compiled from: MusicPlayerViewState.kt */
    public interface o {

        /* compiled from: MusicPlayerViewState.kt */
        public static final class a implements o {
            public final String a;
            public final Thumb b;
            public final String c;
            public final String d;

            public a(String str, Thumb thumb, String str2, String str3) {
                this.a = str;
                this.b = thumb;
                this.c = str2;
                this.d = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
            }

            @Override // xsna.dz40.o
            public final String m() {
                return this.a;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AudioBook(uniqueId=");
                sb.append(this.a);
                sb.append(", image=");
                sb.append(this.b);
                sb.append(", title=");
                sb.append(this.c);
                sb.append(", subtitle=");
                return ho8.a(sb, this.d, ')');
            }
        }

        /* compiled from: MusicPlayerViewState.kt */
        public static final class b implements o {
            public final String a;
            public final Thumb b;
            public final String c;
            public final String d;
            public final boolean e;
            public final Reaction f;

            public b(String str, Thumb thumb, String str2, String str3, boolean z, Reaction reaction) {
                this.a = str;
                this.b = thumb;
                this.c = str2;
                this.d = str3;
                this.e = z;
                this.f = reaction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && this.e == bVar.e && epx.f(this.f, bVar.f);
            }

            public final int hashCode() {
                int b = qoy.b(urd0.a(urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
                Reaction reaction = this.f;
                return b + (reaction == null ? 0 : reaction.hashCode());
            }

            @Override // xsna.dz40.o
            public final String m() {
                return this.a;
            }

            public final String toString() {
                return "Music(uniqueId=" + this.a + ", image=" + this.b + ", title=" + this.c + ", subtitle=" + this.d + ", isExplicit=" + this.e + ", reaction=" + this.f + ')';
            }
        }

        /* compiled from: MusicPlayerViewState.kt */
        public static final class c implements o {
            public final String a;
            public final Thumb b;
            public final String c;
            public final String d;
            public final String e;
            public final boolean f;

            public c(String str, Thumb thumb, String str2, String str3, String str4, boolean z) {
                this.a = str;
                this.b = thumb;
                this.c = str2;
                this.d = str3;
                this.e = str4;
                this.f = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e) && this.f == cVar.f;
            }

            public final int hashCode() {
                int a = urd0.a(urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
                String str = this.e;
                return Boolean.hashCode(this.f) + ((a + (str == null ? 0 : str.hashCode())) * 31);
            }

            @Override // xsna.dz40.o
            public final String m() {
                return this.a;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Podcast(uniqueId=");
                sb.append(this.a);
                sb.append(", image=");
                sb.append(this.b);
                sb.append(", title=");
                sb.append(this.c);
                sb.append(", subtitle=");
                sb.append(this.d);
                sb.append(", extraSubtitle=");
                sb.append(this.e);
                sb.append(", isExplicit=");
                return defpackage.q0.a(sb, this.f, ')');
            }
        }

        /* compiled from: MusicPlayerViewState.kt */
        public static final class d implements o {
            public final String a;
            public final Thumb b;
            public final String c;

            public d(String str, Thumb thumb, String str2) {
                this.a = str;
                this.b = thumb;
                this.c = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            @Override // xsna.dz40.o
            public final String m() {
                return this.a;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Radio(uniqueId=");
                sb.append(this.a);
                sb.append(", image=");
                sb.append(this.b);
                sb.append(", title=");
                return ho8.a(sb, this.c, ')');
            }
        }

        String m();
    }

    /* compiled from: MusicPlayerViewState.kt */
    public static final class p implements fm50<sy40> {
        public final f a;
        public final yzt0<g> b;
        public final yzt0<h> c;
        public final yzt0<gfp0.c> d;
        public final yzt0<c> e;
        public final yzt0<ipw<d>> f;
        public final m g;
        public final yzt0<n.c> h;
        public final yzt0<Boolean> i;
        public final yzt0<OnboardingStrategy> j;

        public p(f fVar, h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, m mVar, h0u0 h0u0Var6, h0u0 h0u0Var7, h0u0 h0u0Var8) {
            this.a = fVar;
            this.b = h0u0Var;
            this.c = h0u0Var2;
            this.d = h0u0Var3;
            this.e = h0u0Var4;
            this.f = h0u0Var5;
            this.g = mVar;
            this.h = h0u0Var6;
            this.i = h0u0Var7;
            this.j = h0u0Var8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return epx.f(this.a, pVar.a) && epx.f(this.b, pVar.b) && epx.f(this.c, pVar.c) && epx.f(this.d, pVar.d) && epx.f(this.e, pVar.e) && epx.f(this.f, pVar.f) && epx.f(this.g, pVar.g) && epx.f(this.h, pVar.h) && epx.f(this.i, pVar.i) && epx.f(this.j, pVar.j);
        }

        public final int hashCode() {
            return this.j.hashCode() + sr.a(this.i, sr.a(this.h, (this.g.hashCode() + sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31)) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PodcastRender(commonData=");
            sb.append(this.a);
            sb.append(", covers=");
            sb.append(this.b);
            sb.append(", headerData=");
            sb.append(this.c);
            sb.append(", currentTrackData=");
            sb.append(this.d);
            sb.append(", audioPermissions=");
            sb.append(this.e);
            sb.append(", chips=");
            sb.append(this.f);
            sb.append(", playbackControlData=");
            sb.append(this.g);
            sb.append(", playbackQueue=");
            sb.append(this.h);
            sb.append(", isOnboardingAnimationPlaying=");
            sb.append(this.i);
            sb.append(", onboardingStrategy=");
            return tr.c(sb, this.j, ')');
        }
    }

    /* compiled from: MusicPlayerViewState.kt */
    public static final class q {
        public final yzt0<Boolean> a;
        public final yzt0<Boolean> b;
        public final yzt0<Boolean> c;
        public final yzt0<Boolean> d;

        public q(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return epx.f(this.a, qVar.a) && epx.f(this.b, qVar.b) && epx.f(this.c, qVar.c) && epx.f(this.d, qVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RadioCommonRenderData(isPlaying=");
            sb.append(this.a);
            sb.append(", canGoBack=");
            sb.append(this.b);
            sb.append(", canGoForward=");
            sb.append(this.c);
            sb.append(", isInformerVisible=");
            return tr.c(sb, this.d, ')');
        }
    }

    /* compiled from: MusicPlayerViewState.kt */
    public static final class r implements fm50<sy40> {
        public final q a;
        public final yzt0<g> b;
        public final yzt0<h> c;
        public final yzt0<gfp0.d> d;
        public final yzt0<c> e;
        public final yzt0<OnboardingStrategy> f;
        public final yzt0<n.d> g;

        public r(q qVar, h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6) {
            this.a = qVar;
            this.b = h0u0Var;
            this.c = h0u0Var2;
            this.d = h0u0Var3;
            this.e = h0u0Var4;
            this.f = h0u0Var5;
            this.g = h0u0Var6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return epx.f(this.a, rVar.a) && epx.f(this.b, rVar.b) && epx.f(this.c, rVar.c) && epx.f(this.d, rVar.d) && epx.f(this.e, rVar.e) && epx.f(this.f, rVar.f) && epx.f(this.g, rVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RadioRender(commonData=");
            sb.append(this.a);
            sb.append(", covers=");
            sb.append(this.b);
            sb.append(", headerData=");
            sb.append(this.c);
            sb.append(", currentRadioData=");
            sb.append(this.d);
            sb.append(", audioPermissions=");
            sb.append(this.e);
            sb.append(", onboardingStrategy=");
            sb.append(this.f);
            sb.append(", playbackQueue=");
            return tr.c(sb, this.g, ')');
        }
    }

    /* compiled from: MusicPlayerViewState.kt */
    public static final class s {
        public final List a;

        public s(List list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && epx.f(this.a, ((s) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return jr.a(')', new StringBuilder("RadioTabSheetData(tabs="), this.a);
        }
    }

    /* compiled from: MusicPlayerViewState.kt */
    public static final class t implements fm50<sy40> {
        public final f a;
        public final yzt0<g> b;
        public final yzt0<h> c;
        public final yzt0<gfp0.b> d;
        public final yzt0<c> e;
        public final yzt0<Boolean> f;
        public final yzt0<LoopMode> g;
        public final yzt0<n.b> h;
        public final yzt0<Boolean> i;
        public final yzt0<Boolean> j;
        public final yzt0<j> k;
        public final yzt0<Boolean> l;

        public t(f fVar, h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7, h0u0 h0u0Var8, h0u0 h0u0Var9, h0u0 h0u0Var10, h0u0 h0u0Var11) {
            this.a = fVar;
            this.b = h0u0Var;
            this.c = h0u0Var2;
            this.d = h0u0Var3;
            this.e = h0u0Var4;
            this.f = h0u0Var5;
            this.g = h0u0Var6;
            this.h = h0u0Var7;
            this.i = h0u0Var8;
            this.j = h0u0Var9;
            this.k = h0u0Var10;
            this.l = h0u0Var11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return epx.f(this.a, tVar.a) && epx.f(this.b, tVar.b) && epx.f(this.c, tVar.c) && epx.f(this.d, tVar.d) && epx.f(this.e, tVar.e) && epx.f(this.f, tVar.f) && epx.f(this.g, tVar.g) && epx.f(this.h, tVar.h) && epx.f(this.i, tVar.i) && epx.f(this.j, tVar.j) && epx.f(this.k, tVar.k) && epx.f(this.l, tVar.l);
        }

        public final int hashCode() {
            return this.l.hashCode() + sr.a(this.k, sr.a(this.j, sr.a(this.i, sr.a(this.h, sr.a(this.g, sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RedesignMusicRender(commonData=");
            sb.append(this.a);
            sb.append(", covers=");
            sb.append(this.b);
            sb.append(", headerData=");
            sb.append(this.c);
            sb.append(", currentTrackData=");
            sb.append(this.d);
            sb.append(", audioPermissions=");
            sb.append(this.e);
            sb.append(", isShuffleOn=");
            sb.append(this.f);
            sb.append(", loopMode=");
            sb.append(this.g);
            sb.append(", playbackQueue=");
            sb.append(this.h);
            sb.append(", isVkMix=");
            sb.append(this.i);
            sb.append(", isDislike=");
            sb.append(this.j);
            sb.append(", lyricsData=");
            sb.append(this.k);
            sb.append(", isSleepTimerTicking=");
            return tr.c(sb, this.l, ')');
        }
    }

    /* compiled from: MusicPlayerViewState.kt */
    public static final class u {
        public final List a;
        public final v b;
        public final w c;

        public u(List list, v vVar, w wVar) {
            this.a = list;
            this.b = vVar;
            this.c = wVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return epx.f(this.a, uVar.a) && epx.f(this.b, uVar.b) && epx.f(this.c, uVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TabSheetData(tabs=");
            mr.c(", tabSheetOnboardingData=", sb, this.a);
            sb.append(this.b);
            sb.append(", trackListData=");
            sb.append(this.c);
            sb.append(')');
            return sb.toString();
        }
    }

    /* compiled from: MusicPlayerViewState.kt */
    public static final class v {
        public final ParentBottomSheetState a;
        public final float b;
        public final boolean c;

        public v(ParentBottomSheetState parentBottomSheetState, float f, boolean z) {
            this.a = parentBottomSheetState;
            this.b = f;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return this.a == vVar.a && Float.compare(this.b, vVar.b) == 0 && this.c == vVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + io.reactivex.rxjava3.subjects.b.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TabSheetOnboardingData(parentCollapseState=");
            sb.append(this.a);
            sb.append(", sheetCollapsedOffset=");
            sb.append(this.b);
            sb.append(", isSheetAnimationNeedToPlay=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: MusicPlayerViewState.kt */
    public static final class w {
        public final int a;
        public final int b;

        public w() {
            this(0, 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            w wVar = (w) obj;
            return this.a == wVar.a && this.b == wVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TrackListData(tracklistSize=");
            sb.append(this.a);
            sb.append(", notLoadedTrackSize=");
            return vu5.b(sb, this.b, ')');
        }

        public w(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public dz40(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3, fi50 fi50Var4) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
        this.d = fi50Var4;
    }
}
