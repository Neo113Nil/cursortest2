package xsna;

import java.util.ArrayList;

/* compiled from: CountersBlock.kt */
/* loaded from: classes16.dex */
public interface kyj {

    /* compiled from: CountersBlock.kt */
    public static final class a implements kyj {
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
            return bo.c(')', new StringBuilder("Loaded(counters="), this.a);
        }
    }

    /* compiled from: CountersBlock.kt */
    public static final class b implements kyj {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Loading(countersCount="), this.a, ')');
        }
    }
}
