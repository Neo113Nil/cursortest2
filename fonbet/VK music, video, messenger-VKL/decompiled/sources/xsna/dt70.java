package xsna;

import com.vk.dto.music.Thumb;
import com.vk.dto.music.audiobook.AudioBooksChapterProgressStatus;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: OfflineAudioBookChaptersViewState.kt */
/* loaded from: classes3.dex */
public interface dt70 extends lm50 {

    /* compiled from: OfflineAudioBookChaptersViewState.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final int c;
        public final Object d;
        public final int e;
        public final bi40 f;

        public a(String str, String str2, int i, AudioBooksChapterProgressStatus audioBooksChapterProgressStatus, int i2, bi40 bi40Var) {
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = audioBooksChapterProgressStatus;
            this.e = i2;
            this.f = bi40Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d) && this.e == aVar.e && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + shy.a(this.e, (qow.a(this.d) + shy.a(this.c, urd0.a(this.a.hashCode() * 31, 31, this.b), 31)) * 31, 31);
        }

        public final String toString() {
            return "ChapterItem(id=" + this.a + ", title=" + this.b + ", progressTime=" + this.c + ", progressStatus=" + ((Object) qow.b(this.d)) + ", duration=" + this.e + ", downloadState=" + this.f + ')';
        }
    }

    /* compiled from: OfflineAudioBookChaptersViewState.kt */
    public static final class b implements dt70 {
        public final String b;
        public final Thumb c;
        public final List<a> d;
        public final c e;

        public b(String str, Thumb thumb, List<a> list, c cVar) {
            this.b = str;
            this.c = thumb;
            this.d = list;
            this.e = cVar;
        }

        @Override // xsna.dt70
        public final String d() {
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
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            Thumb thumb = this.c;
            return this.e.hashCode() + fw3.a((hashCode + (thumb == null ? 0 : thumb.hashCode())) * 31, 31, this.d);
        }

        public final String toString() {
            return "Content(audioBookTitle=" + this.b + ", audioBookCover=" + this.c + ", chapters=" + this.d + ", deleteAllInfo=" + this.e + ')';
        }
    }

    /* compiled from: OfflineAudioBookChaptersViewState.kt */
    public static final class c {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public c() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DeleteAllInfo(buttonTextRes=");
            sb.append(this.a);
            sb.append(", dialogTitleRes=");
            sb.append(this.b);
            sb.append(", dialogDescriptionRes=");
            sb.append(this.c);
            sb.append(", dialogNegativeButtonRes=");
            sb.append(this.d);
            sb.append(", dialogPositiveButtonRes=");
            return vu5.b(sb, this.e, ')');
        }

        public c(int i) {
            this.a = R.string.audio_book_chapters_delete_all;
            this.b = R.string.audio_book_chapters_delete_dialog_title;
            this.c = R.string.audio_book_chapters_delete_dialog_description;
            this.d = R.string.audio_book_chapters_delete_dialog_button_negative;
            this.e = R.string.audio_book_chapters_delete_dialog_button_positive;
        }
    }

    /* compiled from: OfflineAudioBookChaptersViewState.kt */
    public static final class d implements dt70 {
        public final String b;

        public d(String str) {
            this.b = str;
        }

        @Override // xsna.dt70
        public final String d() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Loading(audioBookTitle="), this.b, ')');
        }
    }

    String d();
}
