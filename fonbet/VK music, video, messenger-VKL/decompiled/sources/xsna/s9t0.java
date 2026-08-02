package xsna;

/* compiled from: VideoProgressState.kt */
/* loaded from: classes2.dex */
public abstract class s9t0 {

    /* compiled from: VideoProgressState.kt */
    public static final class a extends s9t0 {
        public static final a a = new a();
    }

    /* compiled from: VideoProgressState.kt */
    public static final class b extends s9t0 {
        public static final b a = new b();
    }

    /* compiled from: VideoProgressState.kt */
    public static final class c extends s9t0 {
        public static final c a = new c();
    }

    /* compiled from: VideoProgressState.kt */
    public static final class d extends s9t0 {
        public final int a;
        public final boolean b;
        public final boolean c;

        public d(int i, boolean z, boolean z2) {
            this.a = i;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(Integer.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Progress(percent=");
            sb.append(this.a);
            sb.append(", inProgress=");
            sb.append(this.b);
            sb.append(", isResumed=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: VideoProgressState.kt */
    public static final class e extends s9t0 {
        public static final e a = new e();
    }
}
