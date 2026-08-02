package xsna;

import java.util.ArrayList;

/* compiled from: State.kt */
/* loaded from: classes16.dex */
public interface itk0 {

    /* compiled from: State.kt */
    public static final class a implements itk0 {
        public static final a a = new a();
    }

    /* compiled from: State.kt */
    public static final class b implements itk0 {
        public final int a;
        public final String b;
        public final ArrayList c;

        public b(String str, ArrayList arrayList, int i) {
            this.a = i;
            this.b = str;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b.equals(bVar.b) && this.c.equals(bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Poll(id=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", variants=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.c);
        }
    }
}
