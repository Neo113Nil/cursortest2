package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.audiobook.AudioBook;

/* compiled from: DisplayAudioBookChaptersPatch.kt */
/* loaded from: classes3.dex */
public interface odn extends xl50 {

    /* compiled from: DisplayAudioBookChaptersPatch.kt */
    public static final class a implements odn {
        public final AudioBook b;
        public final boolean c;

        public a(AudioBook audioBook, boolean z) {
            this.b = audioBook;
            this.c = z;
        }
    }

    /* compiled from: DisplayAudioBookChaptersPatch.kt */
    public static final class b implements odn {
        public final boolean b;

        public b(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: DisplayAudioBookChaptersPatch.kt */
    public static final class c implements odn {
        public static final c b = new c();
    }

    /* compiled from: DisplayAudioBookChaptersPatch.kt */
    public static final class d implements odn {
        public final Throwable b;

        public d(Throwable th) {
            this.b = th;
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
            return oq.c(new StringBuilder("LoadingError(throwable="), this.b, ')');
        }
    }

    /* compiled from: DisplayAudioBookChaptersPatch.kt */
    public static final class e implements odn {
        public final boolean b;

        public e(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: DisplayAudioBookChaptersPatch.kt */
    public static final class f implements odn {
        public static final f b = new f();
    }

    /* compiled from: DisplayAudioBookChaptersPatch.kt */
    public static final class g implements odn {
        public final String b;
        public final DownloadingState c;

        public g(String str, DownloadingState downloadingState) {
            this.b = str;
            this.c = downloadingState;
        }
    }
}
