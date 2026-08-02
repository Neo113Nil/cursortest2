package xsna;

import java.util.List;

/* compiled from: ViewsHistoryData.kt */
/* loaded from: classes2.dex */
public abstract class e4u0 implements frz {

    /* compiled from: ViewsHistoryData.kt */
    public static final class a extends e4u0 {
        public static final a b = new a();

        @Override // xsna.frz
        public final boolean c() {
            return false;
        }

        @Override // xsna.frz
        public final int getSize() {
            return 0;
        }
    }

    /* compiled from: ViewsHistoryData.kt */
    public static final class b extends e4u0 {
        public final int b;
        public final List<qtd0> c;
        public final int d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(int i, List<? extends qtd0> list) {
            this.b = i;
            this.c = list;
            this.d = list.size();
        }

        @Override // xsna.frz
        public final boolean c() {
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && epx.f(this.c, bVar.c);
        }

        @Override // xsna.frz
        public final int getSize() {
            return this.d;
        }

        public final int hashCode() {
            return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewsHistoryPageData(totalCount=");
            sb.append(this.b);
            sb.append(", profiles=");
            return ms9.a(')', sb, this.c);
        }
    }
}
