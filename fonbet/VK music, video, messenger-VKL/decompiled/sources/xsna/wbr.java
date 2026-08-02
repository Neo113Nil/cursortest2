package xsna;

import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.model.VisibleStyle;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.Map;
import kotlin.Pair;

/* compiled from: FillStrategy.kt */
/* loaded from: classes2.dex */
public abstract class wbr {
    public final Pair<k9x, a>[] a;

    /* compiled from: FillStrategy.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
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
            return Integer.hashCode(Integer.MAX_VALUE) + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Config(big=");
            sb.append(this.a);
            sb.append(", categories=");
            sb.append(this.b);
            sb.append(", dots=");
            return h5s.c(this.c, ", districts=2147483647)", sb);
        }
    }

    /* compiled from: FillStrategy.kt */
    public static class b extends wbr {
        public static final k9x b = new k9x(0, 30, 1);

        static {
            new k9x(1, 9, 1);
            new k9x(10, 15, 1);
            new k9x(15, 25, 1);
        }

        @Override // xsna.wbr
        public final boolean a(Map map, int i, BoundingBox boundingBox, int i2, c cVar) {
            int c = c(i2, i);
            if (c == 0 || c == Integer.MAX_VALUE) {
                return false;
            }
            cVar.V1();
            for (akt aktVar : map.values()) {
                int i3 = aktVar.d;
                if (VisibleStyle.j(i3) == VisibleStyle.j(i) && VisibleStyle.g(i3) == VisibleStyle.g(i) && boundingBox.u(aktVar.b)) {
                    cVar.y3();
                }
                if (cVar.compareTo(Integer.valueOf(c)) >= 0) {
                    break;
                }
            }
            return cVar.compareTo(Integer.valueOf(c)) >= 0;
        }

        @Override // xsna.wbr
        public final c.a b() {
            return new c.a();
        }

        @Override // xsna.wbr
        public final int d() {
            return Integer.MAX_VALUE;
        }

        @Override // xsna.wbr
        public final void e(c cVar) {
            cVar.y3();
        }

        @Override // xsna.wbr
        public final boolean f(c cVar, int i, int i2) {
            return cVar.compareTo(Integer.valueOf(c(i, i2))) >= 0;
        }

        @Override // xsna.wbr
        public final void g(c cVar, int i, int i2) {
            int c = c(i, i2);
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.d, new Object[]{"counter=" + cVar.lb() + " max=" + c});
        }

        public final String toString() {
            return b.class.getName();
        }
    }

    /* compiled from: FillStrategy.kt */
    public interface c extends Comparable<Number> {

        /* compiled from: FillStrategy.kt */
        public static final class a implements c {
            public int b;

            @Override // xsna.wbr.c
            public final void V1() {
                this.b = 0;
            }

            @Override // java.lang.Comparable
            public final int compareTo(Number number) {
                return epx.g(this.b, number.intValue());
            }

            @Override // xsna.wbr.c
            public final Integer lb() {
                return Integer.valueOf(this.b);
            }

            @Override // xsna.wbr.c
            public final void y3() {
                this.b = 1 + this.b;
            }
        }

        void V1();

        Integer lb();

        void y3();
    }

    public wbr() {
        throw null;
    }

    public wbr(Pair[] pairArr) {
        this.a = pairArr;
    }

    public abstract boolean a(Map map, int i, BoundingBox boundingBox, int i2, c cVar);

    public abstract c.a b();

    public final int c(int i, int i2) {
        a aVar;
        Pair<k9x, a>[] pairArr = this.a;
        int length = pairArr.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                aVar = null;
                break;
            }
            Pair<k9x, a> pair = pairArr[i4];
            k9x d = pair.d();
            aVar = pair.g();
            int i5 = d.b;
            if (i <= d.c && i5 <= i) {
                break;
            }
            i4++;
        }
        if (aVar == null) {
            return 0;
        }
        if (VisibleStyle.g(i2) && (VisibleStyle.l(i2) || VisibleStyle.C(i2))) {
            i3 = aVar.a;
        } else if (VisibleStyle.l(i2) && VisibleStyle.b(i2)) {
            i3 = aVar.b;
        } else if (VisibleStyle.p(i2)) {
            i3 = aVar.c;
        } else if (VisibleStyle.o(i2)) {
            i3 = Integer.MAX_VALUE;
        }
        int d2 = d();
        return i3 > d2 ? d2 : i3;
    }

    public abstract int d();

    public abstract void e(c cVar);

    public abstract boolean f(c cVar, int i, int i2);

    public abstract void g(c cVar, int i, int i2);
}
