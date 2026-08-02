package xsna;

import com.vk.dto.music.MusicDynamicRestriction;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.music.audiobook.AudioBookPerson;
import com.vk.music.bottomsheets.audiobook.AudioBookChapterBottomSheetLaunchPoint;
import java.util.List;

/* compiled from: DisplayAudioBookChaptersEvent.kt */
/* loaded from: classes3.dex */
public interface idn {

    /* compiled from: DisplayAudioBookChaptersEvent.kt */
    public static final class a implements idn {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 607095297;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: DisplayAudioBookChaptersEvent.kt */
    public static final class b implements idn {
        public static final b a = new b();
    }

    /* compiled from: DisplayAudioBookChaptersEvent.kt */
    public static final class c implements idn {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 203797471;
        }

        public final String toString() {
            return "Download";
        }
    }

    /* compiled from: DisplayAudioBookChaptersEvent.kt */
    public static final class d implements idn {
        public final AudioBook a;
        public final AudioBookChapter b;

        public d(AudioBook audioBook, AudioBookChapter audioBookChapter) {
            this.a = audioBook;
            this.b = audioBookChapter;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DownloadChapter(audioBook=" + this.a + ", chapter=" + this.b + ')';
        }
    }

    /* compiled from: DisplayAudioBookChaptersEvent.kt */
    public static final class e implements idn {
        public static final e a = new e();
    }

    /* compiled from: DisplayAudioBookChaptersEvent.kt */
    public static final class f implements idn {
        public final AudioBook a;

        public f(AudioBook audioBook) {
            this.a = audioBook;
        }
    }

    /* compiled from: DisplayAudioBookChaptersEvent.kt */
    public static final class g implements idn {
        public final String a;

        public g(String str) {
            this.a = str;
        }
    }

    /* compiled from: DisplayAudioBookChaptersEvent.kt */
    public static final class h implements idn {
        public final int a;

        public h(int i) {
            this.a = i;
        }
    }

    /* compiled from: DisplayAudioBookChaptersEvent.kt */
    public static final class i extends q {
    }

    /* compiled from: DisplayAudioBookChaptersEvent.kt */
    public static final class j implements idn {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1835122628;
        }

        public final String toString() {
            return "ShowBookAddedToast";
        }
    }

    /* compiled from: DisplayAudioBookChaptersEvent.kt */
    public static final class k implements idn {
        public final AudioBookChapterBottomSheetLaunchPoint.RemoveDownload a;

        public k(AudioBookChapterBottomSheetLaunchPoint.RemoveDownload removeDownload) {
            this.a = removeDownload;
        }
    }

    /* compiled from: DisplayAudioBookChaptersEvent.kt */
    public static final class l implements idn {
        public final r1m a;

        public l(r1m r1mVar) {
            this.a = r1mVar;
        }
    }

    /* compiled from: DisplayAudioBookChaptersEvent.kt */
    @vby
    public static final class m implements idn {
        public final MusicDynamicRestriction a;

        public final boolean equals(Object obj) {
            if (obj instanceof m) {
                return epx.f(this.a, ((m) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowDynamicRestrictionPopup(restriction=" + this.a + ')';
        }
    }

    /* compiled from: DisplayAudioBookChaptersEvent.kt */
    public static final class n implements idn {
        public static final n a = new n();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return -1440721036;
        }

        public final String toString() {
            return "ShowFreeBottomSheet";
        }
    }

    /* compiled from: DisplayAudioBookChaptersEvent.kt */
    public static final class o implements idn {
        public static final o a = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -43178540;
        }

        public final String toString() {
            return "ShowKidsContentRestriction";
        }
    }

    /* compiled from: DisplayAudioBookChaptersEvent.kt */
    public static final class p extends q {
    }

    /* compiled from: DisplayAudioBookChaptersEvent.kt */
    public static abstract class q implements idn {
        public final List<AudioBookPerson> a;

        public q() {
            throw null;
        }

        public q(List list) {
            this.a = list;
        }
    }

    /* compiled from: DisplayAudioBookChaptersEvent.kt */
    public static final class r implements idn {
        public static final r a = new r();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof r);
        }

        public final int hashCode() {
            return -104612762;
        }

        public final String toString() {
            return "ShowVkMusicSubscribeBottomSheet";
        }
    }
}
