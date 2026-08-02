package one.video.player.error;

import one.video.player.error.OneVideoPlaybackException;

/* compiled from: OneVideoUnexpectedException.kt */
/* loaded from: classes8.dex */
public class OneVideoUnexpectedException extends RuntimeException {
    private final a stuckExceptionInfo;

    /* compiled from: OneVideoUnexpectedException.kt */
    public static final class a {
        public final OneVideoPlaybackException.StuckType a;
        public final int b;

        public a(OneVideoPlaybackException.StuckType stuckType, int i) {
            this.a = stuckType;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "StuckInfo(type=" + this.a + ", timeoutMs=" + this.b + ")";
        }
    }

    public a d() {
        return this.stuckExceptionInfo;
    }
}
