package xsna;

import com.vk.dto.common.account.AudioAdConfig;

/* compiled from: PendingAudioAdState.kt */
/* loaded from: classes3.dex */
public interface mu90 {

    /* compiled from: PendingAudioAdState.kt */
    public static final class a implements mu90 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1984055073;
        }

        public final String toString() {
            return "None";
        }
    }

    /* compiled from: PendingAudioAdState.kt */
    public static final class b implements mu90 {
        public final g8x a;
        public final AudioAdConfig.Type b;

        public b(g8x g8xVar, AudioAdConfig.Type type) {
            this.a = g8xVar;
            this.b = type;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Ready(instreamAudioAd=" + this.a + ", adType=" + this.b + ')';
        }
    }
}
