package xsna;

import java.util.List;

/* compiled from: ActionHandlerResult.kt */
/* loaded from: classes8.dex */
public interface o10 {

    /* compiled from: ActionHandlerResult.kt */
    @vby
    public static final class a implements o10 {
        public final aqj0 a;

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return epx.f(this.a, ((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Full(state=" + this.a + ")";
        }
    }

    /* compiled from: ActionHandlerResult.kt */
    @vby
    public static final class b implements o10 {
        public final List<x0u0> a;

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return epx.f(this.a, ((b) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return wq.c("Patch(list=", ")", this.a);
        }
    }
}
