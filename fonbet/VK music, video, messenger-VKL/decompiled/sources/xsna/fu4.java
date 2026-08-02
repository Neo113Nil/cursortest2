package xsna;

import com.vk.music.offline.configs.api.domain.model.ReactionsConfig;

/* compiled from: AudioReactionsPatch.kt */
/* loaded from: classes3.dex */
public interface fu4 extends xl50 {

    /* compiled from: AudioReactionsPatch.kt */
    public static final class a implements fu4 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -866103688;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: AudioReactionsPatch.kt */
    public static final class b implements fu4 {
        public final ReactionsConfig b;
        public final String c;

        public b(ReactionsConfig reactionsConfig, String str) {
            this.b = reactionsConfig;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(reactions=");
            sb.append(this.b);
            sb.append(", selectedReaction=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: AudioReactionsPatch.kt */
    public static final class c implements fu4 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1581317716;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
