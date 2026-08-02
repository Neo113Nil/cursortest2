package xsna;

import java.util.ArrayList;

/* compiled from: FastShareUiState.kt */
/* loaded from: classes6.dex */
public interface amq {

    /* compiled from: FastShareUiState.kt */
    public static final class a implements amq {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -730995889;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: FastShareUiState.kt */
    public static final class b implements amq {
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
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("Success(items="), this.a);
        }
    }
}
