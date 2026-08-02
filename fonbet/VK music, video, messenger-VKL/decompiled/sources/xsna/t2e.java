package xsna;

import java.util.List;

/* compiled from: ClipsFastSharePopupState.kt */
/* loaded from: classes17.dex */
public interface t2e {

    /* compiled from: ClipsFastSharePopupState.kt */
    public static final class a implements t2e {
        public final List<f9j0> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends f9j0> list) {
            this.a = list;
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
            return ms9.a(')', new StringBuilder("Content(targets="), this.a);
        }
    }
}
