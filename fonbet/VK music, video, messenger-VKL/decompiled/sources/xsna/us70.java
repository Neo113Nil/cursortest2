package xsna;

/* compiled from: OfflineAudioBookChaptersMviAction.kt */
/* loaded from: classes3.dex */
public interface us70 extends lj50 {

    /* compiled from: OfflineAudioBookChaptersMviAction.kt */
    public static final class a implements us70 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1706878237;
        }

        public final String toString() {
            return "DeleteAllChapters";
        }
    }

    /* compiled from: OfflineAudioBookChaptersMviAction.kt */
    public static final class b implements us70 {
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
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("DeleteChapter(chapterId="), this.b, ')');
        }
    }

    /* compiled from: OfflineAudioBookChaptersMviAction.kt */
    public static final class c implements us70 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1544103227;
        }

        public final String toString() {
            return "NavigateUp";
        }
    }

    /* compiled from: OfflineAudioBookChaptersMviAction.kt */
    public static final class d implements us70 {
        public final String b;

        public d(String str) {
            this.b = str;
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
            return ho8.a(new StringBuilder("PlayChapter(chapterId="), this.b, ')');
        }
    }
}
