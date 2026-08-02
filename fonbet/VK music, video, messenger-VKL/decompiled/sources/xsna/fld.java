package xsna;

import java.util.Collections;
import java.util.List;

/* compiled from: ClipsCategoryIdentifier.kt */
/* loaded from: classes16.dex */
public interface fld {

    /* compiled from: ClipsCategoryIdentifier.kt */
    public static final class a implements fld {
        public final List<Integer> a;

        public a(List<Integer> list) {
            this.a = list;
        }

        @Override // xsna.fld
        public final List<Integer> a() {
            return this.a;
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
            return ms9.a(')', new StringBuilder("ClipsCompositeIdentifier(values="), this.a);
        }
    }

    /* compiled from: ClipsCategoryIdentifier.kt */
    public static final class b implements fld {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        @Override // xsna.fld
        public final List<Integer> a() {
            return Collections.singletonList(Integer.valueOf(this.a));
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
            return vu5.b(new StringBuilder("ClipsSimpleIdentifier(value="), this.a, ')');
        }
    }

    List<Integer> a();
}
