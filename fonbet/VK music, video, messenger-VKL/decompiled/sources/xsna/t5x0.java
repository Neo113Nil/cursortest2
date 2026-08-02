package xsna;

/* compiled from: VoipVmojiEvent.kt */
/* loaded from: classes7.dex */
public interface t5x0 {

    /* compiled from: VoipVmojiEvent.kt */
    public static final class a implements t5x0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1296551814;
        }

        public final String toString() {
            return "VmojiLibNotReadyError";
        }
    }

    /* compiled from: VoipVmojiEvent.kt */
    public static final class b implements t5x0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 425855272;
        }

        public final String toString() {
            return "WrongCharacterError";
        }
    }
}
