package xsna;

import xsna.dt1;
import xsna.ty6;

/* compiled from: TextFieldDefaults.kt */
/* loaded from: classes11.dex */
public abstract class kgo0 {

    /* compiled from: TextFieldDefaults.kt */
    public static final class a extends kgo0 {
        public final dt1.b a;

        public a() {
            dt1.a.getClass();
            this.a = dt1.a.n;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Above(alignment=" + this.a + ')';
        }
    }

    /* compiled from: TextFieldDefaults.kt */
    public static final class b extends kgo0 {
        public final ty6.a a;
        public final ty6.a b;

        public b() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            bVar.getClass();
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return Float.hashCode(this.b.a) + io.reactivex.rxjava3.subjects.b.a(this.a.a, Boolean.hashCode(false) * 31, 31);
        }

        public final String toString() {
            return "Attached(alwaysMinimize=false, minimizedAlignment=" + this.a + ", expandedAlignment=" + this.b + ')';
        }

        public b(int i) {
            dt1.a aVar = dt1.a;
            aVar.getClass();
            ty6.a aVar2 = dt1.a.n;
            aVar.getClass();
            this.a = aVar2;
            this.b = aVar2;
        }
    }
}
