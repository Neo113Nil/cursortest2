package xsna;

import com.vk.music.bottomsheets.audiobook.AudioBookChapterBottomSheetLaunchPoint;

/* compiled from: OfflineAudioBookChaptersMviEvent.kt */
/* loaded from: classes3.dex */
public interface at70 extends pk50 {

    /* compiled from: OfflineAudioBookChaptersMviEvent.kt */
    public static final class a implements at70 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1224568933;
        }

        public final String toString() {
            return "AllChaptersDeleted";
        }
    }

    /* compiled from: OfflineAudioBookChaptersMviEvent.kt */
    public static final class b implements at70 {
        public final AudioBookChapterBottomSheetLaunchPoint.RemoveDownload a;

        public b(AudioBookChapterBottomSheetLaunchPoint.RemoveDownload removeDownload) {
            this.a = removeDownload;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CancelDownload(launchPoint=" + this.a + ')';
        }
    }

    /* compiled from: OfflineAudioBookChaptersMviEvent.kt */
    public static final class c implements at70 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1371671109;
        }

        public final String toString() {
            return "Close";
        }
    }
}
