package xsna;

import java.util.ArrayList;

/* compiled from: ProgressivePageSizeStrategy.kt */
/* loaded from: classes3.dex */
public final class c4e0 extends da90 {
    public final int c;
    public final int d;
    public final ArrayList e;

    /* compiled from: ProgressivePageSizeStrategy.kt */
    public static final class a {
        public final int a;
        public final float b;

        public a(int i, float f) {
            this.a = i;
            this.b = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Float.compare(this.b, aVar.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Stage(length=");
            sb.append(this.a);
            sb.append(", multiplier=");
            return xq.c(')', this.b, sb);
        }
    }

    public c4e0(ArrayList arrayList, int i, int i2) {
        this.c = i;
        this.d = i2;
        this.e = arrayList;
    }

    @Override // xsna.da90
    public final int a() {
        ArrayList arrayList = this.e;
        int i = 0;
        int i2 = ((a) arrayList.get(0)).a;
        while (i2 < this.b && i < arrayList.size() - 1) {
            i++;
            i2 += ((a) arrayList.get(i)).a;
        }
        return Math.min(this.d, (int) (this.c * ((a) arrayList.get(i)).b));
    }
}
