package xsna;

import java.io.File;

/* compiled from: NoiseSuppressorDependency.kt */
/* loaded from: classes7.dex */
public interface l570 {

    /* compiled from: NoiseSuppressorDependency.kt */
    public interface a extends AutoCloseable {
        int E2();

        int S0();

        int U1();

        b open();
    }

    /* compiled from: NoiseSuppressorDependency.kt */
    public static final class b {
        public final File a;
        public final String b;

        public b(File file, String str) {
            this.a = file;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenedModel(file=");
            sb.append(this.a);
            sb.append(", metaString=");
            return ho8.a(sb, this.b, ')');
        }
    }

    boolean a();

    void b();
}
