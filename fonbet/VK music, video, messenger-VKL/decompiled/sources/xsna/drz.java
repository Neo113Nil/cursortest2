package xsna;

import xsna.frz;

/* compiled from: Loader.kt */
/* loaded from: classes3.dex */
public interface drz<Data extends frz> {

    /* compiled from: Loader.kt */
    public static final class a<D> {
        public final D a;
        public final boolean b;

        public a(D d, boolean z) {
            this.a = d;
            this.b = z;
        }

        public static a a(a aVar, Object obj) {
            boolean z = aVar.b;
            aVar.getClass();
            return new a(obj, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            D d = this.a;
            return Boolean.hashCode(this.b) + ((d == null ? 0 : d.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(data=");
            sb.append(this.a);
            sb.append(", hasMore=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    void a(int i);

    void b(String str);

    io.reactivex.rxjava3.core.q<a<Data>> getState();

    void onDestroy();
}
