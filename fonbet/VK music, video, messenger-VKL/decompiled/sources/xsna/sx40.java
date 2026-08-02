package xsna;

import com.vk.api.generated.artist.dto.ArtistArtistPromoDto;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.reactions.Reaction;
import com.vk.music.player.LoopMode;
import com.vk.music.stickyplayer.domain.CoverSwipeDirection;
import com.vk.music.stickyplayer.domain.PlayerContext;

/* compiled from: MusicPlayerMviAction.kt */
/* loaded from: classes3.dex */
public interface sx40 extends kj50 {

    /* compiled from: MusicPlayerMviAction.kt */
    public interface a extends sx40 {

        /* compiled from: MusicPlayerMviAction.kt */
        /* renamed from: xsna.sx40$a$a, reason: collision with other inner class name */
        public static final class C3698a implements a {
            public static final C3698a b = new C3698a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3698a);
            }

            public final int hashCode() {
                return 1260609933;
            }

            public final String toString() {
                return "ClickAdBanner";
            }
        }

        /* compiled from: MusicPlayerMviAction.kt */
        public static final class b implements a {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 207679315;
            }

            public final String toString() {
                return "ClickGotoButton";
            }
        }

        /* compiled from: MusicPlayerMviAction.kt */
        public static final class c implements a {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1584564961;
            }

            public final String toString() {
                return "DisableAd";
            }
        }

        /* compiled from: MusicPlayerMviAction.kt */
        public static final class d implements a {
            public final PlayerContext b;

            public d(PlayerContext playerContext) {
                this.b = playerContext;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.b == ((d) obj).b;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "OpenAdChoice(playerContext=" + this.b + ')';
            }
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class a0 implements sx40 {
        public static final a0 b = new a0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a0);
        }

        public final int hashCode() {
            return -276344323;
        }

        public final String toString() {
            return "SafeSaveTracksInQueueAsPlaylist";
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public interface b extends sx40 {

        /* compiled from: MusicPlayerMviAction.kt */
        public static final class a implements b {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1190115642;
            }

            public final String toString() {
                return "AddToPlaylist";
            }
        }

        /* compiled from: MusicPlayerMviAction.kt */
        /* renamed from: xsna.sx40$b$b, reason: collision with other inner class name */
        public static final class C3699b implements b {
            public final String b;

            public C3699b(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3699b) && epx.f(this.b, ((C3699b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Concerts(url="), this.b, ')');
            }
        }

        /* compiled from: MusicPlayerMviAction.kt */
        public static final class c implements b {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 101957822;
            }

            public final String toString() {
                return "ConfigureMix";
            }
        }

        /* compiled from: MusicPlayerMviAction.kt */
        public static final class d implements b {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 25093837;
            }

            public final String toString() {
                return "MarkAsListened";
            }
        }

        /* compiled from: MusicPlayerMviAction.kt */
        public static final class e implements b {
            public static final e b = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 1241324173;
            }

            public final String toString() {
                return "OpenAudioBook";
            }
        }

        /* compiled from: MusicPlayerMviAction.kt */
        public static final class f implements b {
            public static final f b = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 348726454;
            }

            public final String toString() {
                return "OpenAudioBookNarrator";
            }
        }

        /* compiled from: MusicPlayerMviAction.kt */
        public static final class g implements b {
            public static final g b = new g();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return -1247863754;
            }

            public final String toString() {
                return "OpenPlayerSettings";
            }
        }

        /* compiled from: MusicPlayerMviAction.kt */
        public static final class h implements b {
            public static final h b = new h();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return 1334442089;
            }

            public final String toString() {
                return "OpenPodcastEpisode";
            }
        }

        /* compiled from: MusicPlayerMviAction.kt */
        public static final class i implements b {
            public final boolean b;

            public i(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && this.b == ((i) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("ToggleDislike(isDisliked="), this.b, ')');
            }
        }

        /* compiled from: MusicPlayerMviAction.kt */
        public static final class j implements b {
            public final boolean b;

            public j(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && this.b == ((j) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("ToggleDownloadTrack(isDownloaded="), this.b, ')');
            }
        }

        /* compiled from: MusicPlayerMviAction.kt */
        public static final class k implements b {
            public static final k b = new k();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof k);
            }

            public final int hashCode() {
                return -1970917319;
            }

            public final String toString() {
                return "TrackMix";
            }
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class b0 implements sx40 {
        public static final b0 b = new b0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b0);
        }

        public final int hashCode() {
            return 1760760138;
        }

        public final String toString() {
            return "SaveTracksInQueueAsPlaylist";
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class c implements sx40 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 2070267896;
        }

        public final String toString() {
            return "ClosePlayer";
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    @vby
    public static final class c0 implements sx40 {
        public final int b;

        public final boolean equals(Object obj) {
            if (obj instanceof c0) {
                return this.b == ((c0) obj).b;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return uqi.a("Seek(percentPosition=", this.b, ')');
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class d implements sx40 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -82010354;
        }

        public final String toString() {
            return "Collapse";
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class d0 implements sx40 {
        public final Reaction b;
        public final MusicTrack c;

        public d0(Reaction reaction, MusicTrack musicTrack) {
            this.b = reaction;
            this.c = musicTrack;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d0)) {
                return false;
            }
            d0 d0Var = (d0) obj;
            return epx.f(this.b, d0Var.b) && epx.f(this.c, d0Var.c);
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

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class e implements sx40 {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 43879536;
        }

        public final String toString() {
            return "CopyLink";
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class e0 implements sx40 {
        public static final e0 b = new e0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e0);
        }

        public final int hashCode() {
            return -1427756819;
        }

        public final String toString() {
            return "SettingsChipsOnboardingCompleted";
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class f implements sx40 {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1227603515;
        }

        public final String toString() {
            return "Expand";
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class f0 implements sx40 {
        public final ArtistArtistPromoDto b;

        public f0(ArtistArtistPromoDto artistArtistPromoDto) {
            this.b = artistArtistPromoDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f0) && epx.f(this.b, ((f0) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ShowConcertChip(chipPromo=" + this.b + ')';
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class g implements sx40 {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1094856648;
        }

        public final String toString() {
            return "FastForward";
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class g0 implements sx40 {
        public final PlayerContext b;

        public g0(PlayerContext playerContext) {
            this.b = playerContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g0) && this.b == ((g0) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SkipNext(playerContext=" + this.b + ')';
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class h implements sx40 {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1852257007;
        }

        public final String toString() {
            return "HideConcertChip";
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class h0 implements sx40 {
        public final PlayerContext b;

        public h0(PlayerContext playerContext) {
            this.b = playerContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h0) && this.b == ((h0) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SkipPrev(playerContext=" + this.b + ')';
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class i implements sx40 {
        public static final i b = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 1437710297;
        }

        public final String toString() {
            return "InitialAction";
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class i0 implements sx40 {
        public final int b;
        public final CoverSwipeDirection c;

        public i0(int i, CoverSwipeDirection coverSwipeDirection) {
            this.b = i;
            this.c = coverSwipeDirection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i0)) {
                return false;
            }
            i0 i0Var = (i0) obj;
            return this.b == i0Var.b && this.c == i0Var.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            return "SkipToIndex(index=" + this.b + ", direction=" + this.c + ')';
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class j implements sx40 {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -925322242;
        }

        public final String toString() {
            return "ItemDragged";
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class j0 implements sx40 {
        public static final j0 b = new j0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j0);
        }

        public final int hashCode() {
            return -53428785;
        }

        public final String toString() {
            return "SleepTimer";
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class k implements sx40 {
        public final int b;
        public final int c;

        public k(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.b == kVar.b && this.c == kVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ItemMoved(from=");
            sb.append(this.b);
            sb.append(", to=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class k0 implements sx40 {
        public static final k0 b = new k0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k0);
        }

        public final int hashCode() {
            return -614876185;
        }

        public final String toString() {
            return "TextExpanded";
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    @vby
    public static final class l implements sx40 {
        public final String b;

        public /* synthetic */ l(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof l) {
                return epx.f(this.b, ((l) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return air.b(')', "JumpToTrack(uuid=", this.b);
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class l0 implements sx40 {
        public static final l0 b = new l0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l0);
        }

        public final int hashCode() {
            return 391158305;
        }

        public final String toString() {
            return "TextTabClick";
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class m implements sx40 {
        public static final m b = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -180895135;
        }

        public final String toString() {
            return "LoadMoreTracksInCurrentQueue";
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class m0 implements sx40 {
        public final boolean b;
        public final PlayerContext c;

        public m0(boolean z, PlayerContext playerContext) {
            this.b = z;
            this.c = playerContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m0)) {
                return false;
            }
            m0 m0Var = (m0) obj;
            return this.b == m0Var.b && this.c == m0Var.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            return "ToggleAddRemove(targetStateIsLiked=" + this.b + ", playerContext=" + this.c + ')';
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public interface n extends sx40 {

        /* compiled from: MusicPlayerMviAction.kt */
        public static final class a implements n {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -898544657;
            }

            public final String toString() {
                return "HideLyrics";
            }
        }

        /* compiled from: MusicPlayerMviAction.kt */
        public static final class b implements n {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1465390957;
            }

            public final String toString() {
                return "LoadLyrics";
            }
        }

        /* compiled from: MusicPlayerMviAction.kt */
        public static final class c implements n {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 723118378;
            }

            public final String toString() {
                return "ResetLyrics";
            }
        }

        /* compiled from: MusicPlayerMviAction.kt */
        @vby
        public static final class d implements n {
            public final boolean b;

            public final boolean equals(Object obj) {
                if (obj instanceof d) {
                    return this.b == ((d) obj).b;
                }
                return false;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return "Scroll(auto=" + this.b + ')';
            }
        }

        /* compiled from: MusicPlayerMviAction.kt */
        public static final class e implements n {
            public final int b;

            public e(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.b == ((e) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("SeekToLineStart(positionMs="), this.b, ')');
            }
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class n0 implements sx40 {
        public final LoopMode b;

        public n0(LoopMode loopMode) {
            this.b = loopMode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n0) && this.b == ((n0) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ToggleLoopMode(currentLoopMode=" + this.b + ')';
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class o implements sx40 {
        public static final o b = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -682349184;
        }

        public final String toString() {
            return "NoNetworkActionFail";
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class o0 implements sx40 {
        public final PlayerContext b;

        public o0(PlayerContext playerContext) {
            this.b = playerContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o0) && this.b == ((o0) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ToggleResumePause(playerContext=" + this.b + ')';
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    @vby
    public static final class p implements sx40 {
        public final boolean b;

        public final boolean equals(Object obj) {
            if (obj instanceof p) {
                return this.b == ((p) obj).b;
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

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class p0 implements sx40 {
        public static final p0 b = new p0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p0);
        }

        public final int hashCode() {
            return 34709075;
        }

        public final String toString() {
            return "ToggleResumePauseFromQueue";
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class q implements sx40 {
        public static final q b = new q();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return 1026113327;
        }

        public final String toString() {
            return "OpenCreatedPlaylist";
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    @vby
    public static final class q0 implements sx40 {
        public final boolean b;

        public final boolean equals(Object obj) {
            if (obj instanceof q0) {
                return this.b == ((q0) obj).b;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return "ToggleShuffle(isShuffleOn=" + this.b + ')';
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class r implements sx40 {
        public static final r b = new r();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof r);
        }

        public final int hashCode() {
            return 826626431;
        }

        public final String toString() {
            return "OpenReactions";
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class r0 implements sx40 {
        public final String b;

        public r0() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r0) && epx.f(this.b, ((r0) obj).b);
        }

        public final int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("TrackInfoClick(trackUuid="), this.b, ')');
        }

        public r0(String str) {
            this.b = str;
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class s implements sx40 {
        public static final s b = new s();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof s);
        }

        public final int hashCode() {
            return 607013596;
        }

        public final String toString() {
            return "OpenShareDialog";
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class s0 implements sx40 {
        public static final s0 b = new s0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof s0);
        }

        public final int hashCode() {
            return -765726848;
        }

        public final String toString() {
            return "TrackQueueExpanded";
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class t implements sx40 {
        public final PlayerContext b;
        public final String c;

        public t(PlayerContext playerContext, String str) {
            this.b = playerContext;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return this.b == tVar.b && epx.f(this.c, tVar.c);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenTrackMenu(playerContext=");
            sb.append(this.b);
            sb.append(", trackUuid=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class t0 implements sx40 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t0)) {
                return false;
            }
            ((t0) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "UndoDislike(track=null)";
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class u implements sx40 {
        public static final u b = new u();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof u);
        }

        public final int hashCode() {
            return 1191070763;
        }

        public final String toString() {
            return "PlaybackSpeed";
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class v implements sx40 {
        public static final v b = new v();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof v);
        }

        public final int hashCode() {
            return -74159335;
        }

        public final String toString() {
            return "PlayerHeaderClick";
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class w implements sx40 {
        public static final w b = new w();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof w);
        }

        public final int hashCode() {
            return 1487472651;
        }

        public final String toString() {
            return "PlayerOpenedInFullScreen";
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class x implements sx40 {
        public static final x b = new x();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof x);
        }

        public final int hashCode() {
            return -109059997;
        }

        public final String toString() {
            return "QueueTabClick";
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    @vby
    public static final class y implements sx40 {
        public final String b;

        public final boolean equals(Object obj) {
            if (obj instanceof y) {
                return epx.f(this.b, ((y) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return air.b(')', "RemoveTrackFromQueue(trackUUID=", this.b);
        }
    }

    /* compiled from: MusicPlayerMviAction.kt */
    public static final class z implements sx40 {
        public static final z b = new z();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof z);
        }

        public final int hashCode() {
            return 1582451804;
        }

        public final String toString() {
            return "Rewind";
        }
    }
}
