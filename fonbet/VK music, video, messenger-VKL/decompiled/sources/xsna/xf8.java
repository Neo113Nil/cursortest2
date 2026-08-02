package xsna;

/* compiled from: BroadcastFinishViewEvent.kt */
/* loaded from: classes7.dex */
public abstract class xf8 {

    /* compiled from: BroadcastFinishViewEvent.kt */
    public static final class a extends xf8 {
        public static final a a = new a();
    }

    /* compiled from: BroadcastFinishViewEvent.kt */
    public static final class b extends xf8 {
        public static final b a = new b();
    }

    /* compiled from: BroadcastFinishViewEvent.kt */
    public static final class c extends xf8 {
        public static final c a = new c();
    }

    /* compiled from: BroadcastFinishViewEvent.kt */
    public static final class d extends xf8 {
        public static final d a = new d();
    }

    /* compiled from: BroadcastFinishViewEvent.kt */
    public static final class e extends xf8 {
        public static final e a = new e();
    }

    /* compiled from: BroadcastFinishViewEvent.kt */
    public static final class f extends xf8 {
        public final qvw0 a;

        public f(qvw0 qvw0Var) {
            this.a = qvw0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenRecords(broadcastOwner=" + this.a + ')';
        }
    }

    /* compiled from: BroadcastFinishViewEvent.kt */
    public static final class g extends xf8 {
        public static final g a = new g();
    }

    /* compiled from: BroadcastFinishViewEvent.kt */
    public static final class h extends xf8 {
        public final boolean a;
        public final boolean b;

        public h(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.a == hVar.a && this.b == hVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShareStart(inStories=");
            sb.append(this.a);
            sb.append(", onWall=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: BroadcastFinishViewEvent.kt */
    public static final class i extends xf8 {
        public static final i a = new i();
    }
}
