package xsna;

import com.vk.music.bottomsheets.audiobook.presentation.model.AudioBookModel;

/* compiled from: AudioBookBottomSheetPatch.kt */
/* loaded from: classes3.dex */
public interface rd4 extends xl50 {

    /* compiled from: AudioBookBottomSheetPatch.kt */
    public static final class a implements rd4 {
        public final AudioBookModel b;

        public a(AudioBookModel audioBookModel) {
            this.b = audioBookModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Init(audiobook=" + this.b + ')';
        }
    }
}
