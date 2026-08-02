package xsna;

import java.util.ArrayList;

/* compiled from: AntispamSideEffect.kt */
/* loaded from: classes14.dex */
public interface ew2 {

    /* compiled from: AntispamSideEffect.kt */
    public static final class a implements ew2 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -731430134;
        }

        public final String toString() {
            return "CloseDialog";
        }
    }

    /* compiled from: AntispamSideEffect.kt */
    public static final class b implements ew2 {
        public final ArrayList a;

        public b(ArrayList arrayList) {
            this.a = arrayList;
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
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("SubmitResult(actions="), this.a);
        }
    }
}
