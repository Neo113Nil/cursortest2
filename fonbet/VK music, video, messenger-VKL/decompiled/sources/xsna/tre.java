package xsna;

import java.util.ArrayList;

/* compiled from: ClipsPlaylistUiReorderState.kt */
/* loaded from: classes16.dex */
public interface tre {

    /* compiled from: ClipsPlaylistUiReorderState.kt */
    public static final class a implements tre {
        public final ArrayList a;

        public a(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("InReorder(lastList="), this.a);
        }
    }

    /* compiled from: ClipsPlaylistUiReorderState.kt */
    public static final class b implements tre {
        public static final b a = new b();
    }
}
