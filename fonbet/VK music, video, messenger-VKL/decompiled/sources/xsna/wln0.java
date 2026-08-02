package xsna;

import java.util.ArrayList;

/* compiled from: SwipeGroupManager.kt */
/* loaded from: classes16.dex */
public final class wln0 {
    public final on2 a = new on2();
    public final ArrayList b = new ArrayList();

    /* compiled from: SwipeGroupManager.kt */
    public static final class a {
        public final long a;
        public final long b;
        public final int c;

        public a() {
            this(0L, 7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + bh10.a(Long.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SwipeAnimationParams(durationMs=");
            sb.append(this.a);
            sb.append(", startDelayMs=");
            sb.append(this.b);
            sb.append(", inactiveVisibility=");
            return vu5.b(sb, this.c, ')');
        }

        public a(long j, int i) {
            j = (i & 2) != 0 ? 0L : j;
            int i2 = (i & 4) == 0 ? 8 : 4;
            this.a = 400L;
            this.b = j;
            this.c = i2;
        }
    }

    public final void a(rmn0 rmn0Var) {
        rmn0Var.a = this.a;
        this.b.add(rmn0Var);
    }
}
