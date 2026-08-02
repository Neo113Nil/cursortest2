package xsna;

/* compiled from: BroadcastPreviewSimpleViewModel.kt */
/* loaded from: classes7.dex */
public abstract class di8 {

    /* compiled from: BroadcastPreviewSimpleViewModel.kt */
    public static final class a extends di8 {
        public final qvw0 a;
        public final long b;
        public final boolean c;
        public final boolean d;

        public a(qvw0 qvw0Var, long j, boolean z, boolean z2) {
            this.a = qvw0Var;
            this.b = j;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            qvw0 qvw0Var = this.a;
            return Boolean.hashCode(this.d) + qoy.b(bh10.a((qvw0Var == null ? 0 : qvw0Var.hashCode()) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Active(initiator=");
            sb.append(this.a);
            sb.append(", startTimeMs=");
            sb.append(this.b);
            sb.append(", isRecord=");
            sb.append(this.c);
            sb.append(", canFinish=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: BroadcastPreviewSimpleViewModel.kt */
    public static final class b extends di8 {
        public static final b a = new b();
    }

    /* compiled from: BroadcastPreviewSimpleViewModel.kt */
    public static final class c extends di8 {
        public static final c a = new c();
    }

    /* compiled from: BroadcastPreviewSimpleViewModel.kt */
    public static final class d extends di8 {
        public static final d a = new d();
    }
}
