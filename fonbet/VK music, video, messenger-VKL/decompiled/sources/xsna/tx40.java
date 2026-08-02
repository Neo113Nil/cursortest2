package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookPerson;
import com.vk.music.bottomsheets.audiobook.AudioBookBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.domain.model.MixData;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayerTrack;
import java.util.List;

/* compiled from: MusicPlayerNavigationEvent.kt */
/* loaded from: classes3.dex */
public interface tx40 {

    /* compiled from: MusicPlayerNavigationEvent.kt */
    public static final class a implements tx40 {
        public final long a;
        public final MusicTrack b;
        public final MusicPlaybackLaunchContext c;

        public a(long j, MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
            this.a = j;
            this.b = musicTrack;
            this.c = musicPlaybackLaunchContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
            MusicPlaybackLaunchContext musicPlaybackLaunchContext = this.c;
            return hashCode + (musicPlaybackLaunchContext == null ? 0 : musicPlaybackLaunchContext.b.hashCode());
        }

        public final String toString() {
            return "AddToPlaylist(playlistId=" + this.a + ", track=" + this.b + ", launchContext=" + this.c + ')';
        }
    }

    /* compiled from: MusicPlayerNavigationEvent.kt */
    public static final class b implements tx40 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2013798498;
        }

        public final String toString() {
            return "Collapse";
        }
    }

    /* compiled from: MusicPlayerNavigationEvent.kt */
    public static final class c implements tx40 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1040325941;
        }

        public final String toString() {
            return "Expand";
        }
    }

    /* compiled from: MusicPlayerNavigationEvent.kt */
    public static final class d implements tx40 {
        public final MusicTrack a;

        public d(MusicTrack musicTrack) {
            this.a = musicTrack;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return rq.c(new StringBuilder("OpenArtist(musicTrack="), this.a, ')');
        }
    }

    /* compiled from: MusicPlayerNavigationEvent.kt */
    public static final class e implements tx40 {
        public final AudioBook a;
        public final AudioBookBottomSheetLaunchPoint b;
        public final MusicPlaybackLaunchContext c;

        public e(AudioBook audioBook, AudioBookBottomSheetLaunchPoint audioBookBottomSheetLaunchPoint, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
            this.a = audioBook;
            this.b = audioBookBottomSheetLaunchPoint;
            this.c = musicPlaybackLaunchContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c);
        }

        public final int hashCode() {
            return this.c.b.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "OpenAudioBookMenu(audioBook=" + this.a + ", launchPoint=" + this.b + ", launchContext=" + this.c + ')';
        }
    }

    /* compiled from: MusicPlayerNavigationEvent.kt */
    public static final class f implements tx40 {
        public final List<AudioBookPerson> a;
        public final MusicPlaybackLaunchContext b;

        public f(List<AudioBookPerson> list, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
            this.a = list;
            this.b = musicPlaybackLaunchContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b);
        }

        public final int hashCode() {
            return this.b.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OpenAudioBookNarrator(people=" + this.a + ", launchContext=" + this.b + ')';
        }
    }

    /* compiled from: MusicPlayerNavigationEvent.kt */
    public static final class g implements tx40 {
        public final int a;
        public final MusicPlaybackLaunchContext b;

        public g(int i, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
            this.a = i;
            this.b = musicPlaybackLaunchContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && epx.f(this.b, gVar.b);
        }

        public final int hashCode() {
            return this.b.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "OpenAudiobook(audioBookId=" + this.a + ", launchContext=" + this.b + ')';
        }
    }

    /* compiled from: MusicPlayerNavigationEvent.kt */
    public static final class h implements tx40 {
        public final String a;
        public final String b;

        public h(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.a, hVar.a) && epx.f(this.b, hVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenCatalogSection(catalogSectionId=");
            sb.append(this.a);
            sb.append(", launchOrigin=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: MusicPlayerNavigationEvent.kt */
    public static final class i implements tx40 {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 740493297;
        }

        public final String toString() {
            return "OpenPlaybackSpeed";
        }
    }

    /* compiled from: MusicPlayerNavigationEvent.kt */
    public static final class j implements tx40 {
        public final boolean a;

        public j(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.a == ((j) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("OpenPlayerSettings(enableOnboarding="), this.a, ')');
        }
    }

    /* compiled from: MusicPlayerNavigationEvent.kt */
    public static final class k implements tx40 {
        public final UserId a;
        public final int b;
        public final String c;

        public k(UserId userId, int i, String str) {
            this.a = userId;
            this.b = i;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return epx.f(this.a, kVar.a) && this.b == kVar.b && epx.f(this.c, kVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenPlaylist(ownerId=");
            sb.append(this.a);
            sb.append(", playlistId=");
            sb.append(this.b);
            sb.append(", launchOrigin=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: MusicPlayerNavigationEvent.kt */
    public static final class l implements tx40 {
        public final UserId a;
        public final String b;

        public l(UserId userId, String str) {
            this.a = userId;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return epx.f(this.a, lVar.a) && epx.f(this.b, lVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenPodcast(ownerId=");
            sb.append(this.a);
            sb.append(", launchOrigin=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: MusicPlayerNavigationEvent.kt */
    public static final class m implements tx40 {
        public final UserId a;
        public final int b;
        public final String c;
        public final String d;

        public m(UserId userId, int i, String str, String str2) {
            this.a = userId;
            this.b = i;
            this.c = str;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return epx.f(this.a, mVar.a) && this.b == mVar.b && epx.f(this.c, mVar.c) && epx.f(this.d, mVar.d);
        }

        public final int hashCode() {
            int a = shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
            String str = this.c;
            return this.d.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenPodcastEpisode(ownerId=");
            sb.append(this.a);
            sb.append(", audioId=");
            sb.append(this.b);
            sb.append(", trackCode=");
            sb.append(this.c);
            sb.append(", launchOrigin=");
            return ho8.a(sb, this.d, ')');
        }
    }

    /* compiled from: MusicPlayerNavigationEvent.kt */
    public static final class n implements tx40 {
        public final PlayerTrack a;
        public final String b;

        public n(PlayerTrack playerTrack, String str) {
            this.a = playerTrack;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return epx.f(this.a, nVar.a) && epx.f(this.b, nVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenReactions(track=");
            sb.append(this.a);
            sb.append(", selectedId=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: MusicPlayerNavigationEvent.kt */
    public static final class o implements tx40 {
        public final MusicTrack a;

        public o(MusicTrack musicTrack) {
            this.a = musicTrack;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && epx.f(this.a, ((o) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return rq.c(new StringBuilder("OpenShareDialog(track="), this.a, ')');
        }
    }

    /* compiled from: MusicPlayerNavigationEvent.kt */
    public static final class p implements tx40 {
        public final String a;
        public final boolean b;

        public p(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return epx.f(this.a, pVar.a) && this.b == pVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenSimilar(trackMid=");
            sb.append(this.a);
            sb.append(", isKidsContext=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: MusicPlayerNavigationEvent.kt */
    public static final class q implements tx40 {
        public static final q a = new q();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return -2016606263;
        }

        public final String toString() {
            return "OpenSleepTimer";
        }
    }

    /* compiled from: MusicPlayerNavigationEvent.kt */
    public static final class r implements tx40 {
        public final PlayerTrack a;
        public final boolean b;
        public final boolean c;

        public r(PlayerTrack playerTrack, boolean z, boolean z2) {
            this.a = playerTrack;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return epx.f(this.a, rVar.a) && this.b == rVar.b && this.c == rVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenTrackMenu(playerTrack=");
            sb.append(this.a);
            sb.append(", forceDarkTheme=");
            sb.append(this.b);
            sb.append(", canSkipListening=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: MusicPlayerNavigationEvent.kt */
    public static final class s implements tx40 {
        public final String a;

        public s(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("OpenUrl(url="), this.a, ')');
        }
    }

    /* compiled from: MusicPlayerNavigationEvent.kt */
    public static final class t implements tx40 {
        public final PlayerTrack a;
        public final MixData b;

        public t(PlayerTrack playerTrack, MixData mixData) {
            this.a = playerTrack;
            this.b = mixData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return epx.f(this.a, tVar.a) && epx.f(this.b, tVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OpenVkMixConfiguration(track=" + this.a + ", mixData=" + this.b + ')';
        }
    }

    /* compiled from: MusicPlayerNavigationEvent.kt */
    public static final class u implements tx40 {
        public static final u a = new u();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof u);
        }

        public final int hashCode() {
            return 1894341168;
        }

        public final String toString() {
            return "ShowMaxLimitTracksInPlaylistBottomSheet";
        }
    }
}
