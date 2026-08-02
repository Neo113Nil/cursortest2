package xsna;

import java.util.ArrayList;

/* loaded from: classes9.dex */
public abstract class t7x0 {

    public static final class a extends t7x0 {
        public static final a a = new a();
    }

    public static final class b extends t7x0 {
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
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("Sent(values="), this.a);
        }
    }
}
