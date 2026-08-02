package xsna;

/* compiled from: VoipHistoryFriendsFeatureToastEvent.kt */
/* loaded from: classes7.dex */
public abstract class mpw0 {

    /* compiled from: VoipHistoryFriendsFeatureToastEvent.kt */
    public static final class a extends mpw0 {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("Error(throwable="), this.a, ')');
        }
    }
}
