package xsna;

import java.util.ArrayList;

/* compiled from: CameraQRUtils.kt */
/* loaded from: classes3.dex */
public final class pk9 {
    public static final String a;

    /* compiled from: CameraQRUtils.kt */
    public static final class a {
        public final int a;
        public final int b;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(this.a);
            sb.append('_');
            return vu5.b(sb, this.b, ')');
        }

        public a(int i) {
            this.a = -16777216;
            this.b = -1;
        }
    }

    /* compiled from: CameraQRUtils.kt */
    public interface b {
        void a(ArrayList<rne0> arrayList);

        void d();
    }

    static {
        new pk9();
        a = pk9.class.getSimpleName();
    }
}
