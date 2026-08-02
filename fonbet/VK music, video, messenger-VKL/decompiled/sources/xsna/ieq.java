package xsna;

import one.video.player.error.OneVideoPlaybackException;

/* compiled from: ExternalErrorAction.kt */
/* loaded from: classes8.dex */
public interface ieq {

    /* compiled from: ExternalErrorAction.kt */
    public static final class a implements ieq {
    }

    /* compiled from: ExternalErrorAction.kt */
    public static final class b implements ieq {
    }

    /* compiled from: ExternalErrorAction.kt */
    public static final class c implements ieq {
        public final OneVideoPlaybackException a;

        public c(OneVideoPlaybackException oneVideoPlaybackException) {
            this.a = oneVideoPlaybackException;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowError(error=" + this.a + ")";
        }
    }
}
