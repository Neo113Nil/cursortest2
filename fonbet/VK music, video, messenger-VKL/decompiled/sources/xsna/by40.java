package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.reactions.Reaction;
import com.vk.music.player.AdvertisementInfo;
import com.vk.music.player.LoopMode;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.domain.state.LyricsScrollMode;
import com.vk.music.stickyplayer.domain.PlayerUiMode;
import com.vk.music.stickyplayer.domain.onboarding.OnboardingStrategy;
import java.util.ArrayList;

/* compiled from: MusicPlayerPatch.kt */
/* loaded from: classes3.dex */
public interface by40 extends xl50 {

    /* compiled from: MusicPlayerPatch.kt */
    public static final class a implements by40 {
        public final String b;

        public a(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("AudioOutputAdded(deviceName="), this.b, ')');
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    public static final class a0 implements by40 {
        public final boolean b;

        public a0(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a0) && this.b == ((a0) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SleepTimer(isTicking="), this.b, ')');
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    public static final class b implements by40 {
        public final String b;

        public b(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("AudioOutputRemoved(deviceName="), this.b, ')');
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    public static final class b0 implements by40 {
        public final MusicTrack b;
        public final MusicTrack c;
        public final boolean d;
        public final boolean e;

        public b0(MusicTrack musicTrack, MusicTrack musicTrack2, boolean z, boolean z2) {
            this.b = musicTrack;
            this.c = musicTrack2;
            this.d = z;
            this.e = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b0)) {
                return false;
            }
            b0 b0Var = (b0) obj;
            return epx.f(this.b, b0Var.b) && epx.f(this.c, b0Var.c) && this.d == b0Var.d && this.e == b0Var.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + qoy.b((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TrackAddedToMyMusic(oldTrack=");
            sb.append(this.b);
            sb.append(", newTrack=");
            sb.append(this.c);
            sb.append(", canAdd=");
            sb.append(this.d);
            sb.append(", canRemove=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    @vby
    public static final class c implements by40 {
        public final int b;

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return this.b == ((c) obj).b;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return uqi.a("BufferingProgress(bufferingProgress=", this.b, ')');
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    public static final class c0 implements by40 {
        public final boolean b;

        public c0(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c0) && this.b == ((c0) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("TrackMixLoading(isLoading="), this.b, ')');
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    public static final class d implements by40 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1997815355;
        }

        public final String toString() {
            return "ClearConcertChipUrl";
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    public static final class d0 implements by40 {
        public final int b;
        public final int c;

        public d0(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d0)) {
                return false;
            }
            d0 d0Var = (d0) obj;
            return this.b == d0Var.b && this.c == d0Var.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TrackMoved(from=");
            sb.append(this.b);
            sb.append(", to=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    @vby
    public static final class e implements by40 {
        public final LyricsScrollMode b;

        public /* synthetic */ e(LyricsScrollMode lyricsScrollMode) {
            this.b = lyricsScrollMode;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof e) {
                return this.b == ((e) obj).b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "CurrentLyricsScrollMode(mode=" + this.b + ')';
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    public static final class e0 implements by40 {
        public final MusicTrack b;
        public final MusicTrack c;
        public final boolean d;
        public final boolean e;

        public e0(MusicTrack musicTrack, MusicTrack musicTrack2, boolean z, boolean z2) {
            this.b = musicTrack;
            this.c = musicTrack2;
            this.d = z;
            this.e = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e0)) {
                return false;
            }
            e0 e0Var = (e0) obj;
            return epx.f(this.b, e0Var.b) && epx.f(this.c, e0Var.c) && this.d == e0Var.d && this.e == e0Var.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + qoy.b((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TrackRemovedFromMyMusic(oldTrack=");
            sb.append(this.b);
            sb.append(", newTrack=");
            sb.append(this.c);
            sb.append(", canAdd=");
            sb.append(this.d);
            sb.append(", canRemove=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    public static final class f implements by40 {
        public final boolean b;

        public f(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b == ((f) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("CurrentPermissions(canGoForward="), this.b, ')');
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    @vby
    public static final class f0 implements by40 {
        public final boolean b;

        public /* synthetic */ f0(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof f0) {
                return this.b == ((f0) obj).b;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return "TracksSaveAsPlaylistInProgress(isProgress=" + this.b + ')';
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    public static final class g implements by40 {
        public final PlayerUiMode b;
        public final PlayerTrack c;
        public final StartPlaySource d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        public final boolean k;
        public final int l;
        public final DownloadingState m;
        public final AdvertisementInfo n;
        public final boolean o;
        public final LoopMode p;
        public final int q;
        public final int r;
        public final float s;
        public final boolean t;
        public final boolean u;

        public g(PlayerUiMode playerUiMode, PlayerTrack playerTrack, StartPlaySource startPlaySource, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, DownloadingState downloadingState, AdvertisementInfo advertisementInfo, boolean z8, LoopMode loopMode, int i2, int i3, float f, boolean z9, boolean z10) {
            this.b = playerUiMode;
            this.c = playerTrack;
            this.d = startPlaySource;
            this.e = z;
            this.f = z2;
            this.g = z3;
            this.h = z4;
            this.i = z5;
            this.j = z6;
            this.k = z7;
            this.l = i;
            this.m = downloadingState;
            this.n = advertisementInfo;
            this.o = z8;
            this.p = loopMode;
            this.q = i2;
            this.r = i3;
            this.s = f;
            this.t = z9;
            this.u = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.b == gVar.b && epx.f(this.c, gVar.c) && epx.f(this.d, gVar.d) && this.e == gVar.e && this.f == gVar.f && this.g == gVar.g && this.h == gVar.h && this.i == gVar.i && this.j == gVar.j && this.k == gVar.k && this.l == gVar.l && epx.f(this.m, gVar.m) && epx.f(this.n, gVar.n) && this.o == gVar.o && this.p == gVar.p && this.q == gVar.q && this.r == gVar.r && Float.compare(this.s, gVar.s) == 0 && this.t == gVar.t && this.u == gVar.u;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            PlayerTrack playerTrack = this.c;
            int hashCode2 = (hashCode + (playerTrack == null ? 0 : playerTrack.hashCode())) * 31;
            StartPlaySource startPlaySource = this.d;
            int hashCode3 = (this.m.hashCode() + shy.a(this.l, qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((hashCode2 + (startPlaySource == null ? 0 : startPlaySource.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31)) * 31;
            AdvertisementInfo advertisementInfo = this.n;
            return Boolean.hashCode(this.u) + qoy.b(io.reactivex.rxjava3.subjects.b.a(this.s, shy.a(this.r, shy.a(this.q, (this.p.hashCode() + qoy.b((hashCode3 + (advertisementInfo != null ? advertisementInfo.hashCode() : 0)) * 31, 31, this.o)) * 31, 31), 31), 31), 31, this.t);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CurrentTrackInPlayer(playerUiMode=");
            sb.append(this.b);
            sb.append(", playerTrack=");
            sb.append(this.c);
            sb.append(", source=");
            sb.append(this.d);
            sb.append(", canAddAudio=");
            sb.append(this.e);
            sb.append(", canRemove=");
            sb.append(this.f);
            sb.append(", canDislike=");
            sb.append(this.g);
            sb.append(", isPlaying=");
            sb.append(this.h);
            sb.append(", canGoBack=");
            sb.append(this.i);
            sb.append(", canGoForward=");
            sb.append(this.j);
            sb.append(", canViewPlaybackQueue=");
            sb.append(this.k);
            sb.append(", duration=");
            sb.append(this.l);
            sb.append(", downloadingState=");
            sb.append(this.m);
            sb.append(", advertisementInfo=");
            sb.append(this.n);
            sb.append(", isShuffleOn=");
            sb.append(this.o);
            sb.append(", loopMode=");
            sb.append(this.p);
            sb.append(", playPositionSec=");
            sb.append(this.q);
            sb.append(", bufferingProgress=");
            sb.append(this.r);
            sb.append(", playbackSpeed=");
            sb.append(this.s);
            sb.append(", isSleepTimerTicking=");
            sb.append(this.t);
            sb.append(", isKidsModeEnabled=");
            return defpackage.q0.a(sb, this.u, ')');
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    public static final class g0 implements by40 {
        public final lac b;

        public g0(lac lacVar) {
            this.b = lacVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g0) && epx.f(this.b, ((g0) obj).b);
        }

        public final int hashCode() {
            lac lacVar = this.b;
            if (lacVar == null) {
                return 0;
            }
            return lacVar.hashCode();
        }

        public final String toString() {
            return "UpdateConcertChip(content=" + this.b + ')';
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    public static final class h implements by40 {
        public final ArrayList b;
        public final ArrayList c;

        public h(ArrayList arrayList, ArrayList arrayList2) {
            this.b = arrayList;
            this.c = arrayList2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.b.equals(hVar.b) && this.c.equals(hVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "CurrentTracklist(" + this.b.size() + ')';
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    public static final class i implements by40 {
        public final MusicTrack b;

        public i(MusicTrack musicTrack) {
            this.b = musicTrack;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return rq.c(new StringBuilder("DeleteTrack(track="), this.b, ')');
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    public static final class j implements by40 {
        public final boolean b;
        public final MusicTrack c;

        public j(MusicTrack musicTrack, boolean z) {
            this.b = z;
            this.c = musicTrack;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.b == jVar.b && this.c.equals(jVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DislikeTrack(disliked=");
            sb.append(this.b);
            sb.append(", track=");
            return rq.c(sb, this.c, ')');
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    public static final class k implements by40 {
        public final MusicTrack b;

        public k(MusicTrack musicTrack) {
            this.b = musicTrack;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.b, ((k) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return rq.c(new StringBuilder("DownloadTrack(track="), this.b, ')');
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    public static final class l implements by40 {
        public final boolean b;

        public l(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.b == ((l) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("InformerVisible(isInformerVisible="), this.b, ')');
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    public static final class m implements by40 {
        public final PlayerUiMode b;
        public final OnboardingStrategy c;
        public final boolean d;

        public m(PlayerUiMode playerUiMode, OnboardingStrategy onboardingStrategy, boolean z) {
            this.b = playerUiMode;
            this.c = onboardingStrategy;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return this.b == mVar.b && this.c == mVar.c && this.d == mVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitialPatch(playerUiMode=");
            sb.append(this.b);
            sb.append(", onboardingStrategy=");
            sb.append(this.c);
            sb.append(", isKidsModeEnabled=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    public static final class n implements by40 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            ((n) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "KidsMode(isKidsModeEnabled=false)";
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    public static final class o implements by40 {
        public static final o b = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -835027451;
        }

        public final String toString() {
            return "LyricsError";
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    @vby
    public static final class p implements by40 {
        public final da00 b;

        public /* synthetic */ p(da00 da00Var) {
            this.b = da00Var;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof p) {
                return epx.f(this.b, ((p) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "LyricsLoaded(content=" + this.b + ')';
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    public static final class q implements by40 {
        public static final q b = new q();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return -1781825031;
        }

        public final String toString() {
            return "LyricsLoading";
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    public static final class r implements by40 {
        public static final r b = new r();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof r);
        }

        public final int hashCode() {
            return 293240752;
        }

        public final String toString() {
            return "LyricsPlaceholder";
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    public static final class s implements by40 {
        public final AdvertisementInfo b;

        public s(AdvertisementInfo advertisementInfo) {
            this.b = advertisementInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && epx.f(this.b, ((s) obj).b);
        }

        public final int hashCode() {
            AdvertisementInfo advertisementInfo = this.b;
            if (advertisementInfo == null) {
                return 0;
            }
            return advertisementInfo.hashCode();
        }

        public final String toString() {
            return "NewAdInfo(advertisementInfo=" + this.b + ')';
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    @vby
    public static final class t implements by40 {
        public final boolean b;

        public /* synthetic */ t(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof t) {
                return this.b == ((t) obj).b;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return "OnboardingAnimationPlaying(isPlaying=" + this.b + ')';
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    @vby
    public static final class u implements by40 {
        public final int b;

        public final boolean equals(Object obj) {
            if (obj instanceof u) {
                return this.b == ((u) obj).b;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return uqi.a("PlayProgress(progress=", this.b, ')');
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    public static final class v implements by40 {
        public final boolean b;
        public final LoopMode c;

        public v(boolean z, LoopMode loopMode) {
            this.b = z;
            this.c = loopMode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return this.b == vVar.b && this.c == vVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            return "PlaybackParameters(isShuffleOn=" + this.b + ", loopMode=" + this.c + ')';
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    public static final class w implements by40 {
        public final float b;

        public w(float f) {
            this.b = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && Float.compare(this.b, ((w) obj).b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b);
        }

        public final String toString() {
            return xq.c(')', this.b, new StringBuilder("PlaybackSpeed(value="));
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    public static final class x implements by40 {
        public final MusicTrack b;

        public x(MusicTrack musicTrack) {
            this.b = musicTrack;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && this.b.equals(((x) obj).b);
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + qoy.b(this.b.hashCode() * 31, 31, false);
        }

        public final String toString() {
            return "RadioFollow(radioTrack=" + this.b + ", canAdd=false, canRemove=true)";
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    public static final class y implements by40 {
        public final MusicTrack b;

        public y(MusicTrack musicTrack) {
            this.b = musicTrack;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && this.b.equals(((y) obj).b);
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + qoy.b(this.b.hashCode() * 31, 31, true);
        }

        public final String toString() {
            return "RadioUnfollow(radioTrack=" + this.b + ", canAdd=true, canRemove=false)";
        }
    }

    /* compiled from: MusicPlayerPatch.kt */
    public static final class z implements by40 {
        public final Reaction b;
        public final MusicTrack c;

        public z(Reaction reaction, MusicTrack musicTrack) {
            this.b = reaction;
            this.c = musicTrack;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof z)) {
                return false;
            }
            z zVar = (z) obj;
            return epx.f(this.b, zVar.b) && epx.f(this.c, zVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SendReactionToTrack(reaction=");
            sb.append(this.b);
            sb.append(", track=");
            return rq.c(sb, this.c, ')');
        }
    }
}
