package xsna;

import androidx.annotation.Nullable;
import com.ironsource.X3;

/* compiled from: SeekMap.java */
/* loaded from: classes12.dex */
public interface n3i0 {

    /* compiled from: SeekMap.java */
    public static final class a {
        public final p3i0 a;
        public final p3i0 b;

        public a(p3i0 p3i0Var, p3i0 p3i0Var2) {
            this.a = p3i0Var;
            this.b = p3i0Var2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a.equals(aVar.a) && this.b.equals(aVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder(X3.j.d);
            p3i0 p3i0Var = this.a;
            sb.append(p3i0Var);
            p3i0 p3i0Var2 = this.b;
            if (p3i0Var.equals(p3i0Var2)) {
                str = "";
            } else {
                str = ", " + p3i0Var2;
            }
            return i5s.a(sb, str, X3.j.e);
        }
    }

    /* compiled from: SeekMap.java */
    public static class b implements n3i0 {
        public final long a;
        public final a b;

        public b(long j) {
            this(j, 0L);
        }

        @Override // xsna.n3i0
        public final long getDurationUs() {
            return this.a;
        }

        @Override // xsna.n3i0
        public final a getSeekPoints(long j) {
            return this.b;
        }

        @Override // xsna.n3i0
        public final boolean isSeekable() {
            return false;
        }

        public b(long j, long j2) {
            this.a = j;
            p3i0 p3i0Var = j2 == 0 ? p3i0.c : new p3i0(0L, j2);
            this.b = new a(p3i0Var, p3i0Var);
        }
    }

    default boolean c() {
        return false;
    }

    long getDurationUs();

    a getSeekPoints(long j);

    boolean isSeekable();
}
