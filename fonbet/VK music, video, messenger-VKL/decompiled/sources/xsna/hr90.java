package xsna;

/* compiled from: PauseEventTrigger.kt */
/* loaded from: classes3.dex */
public abstract class hr90 {

    /* compiled from: PauseEventTrigger.kt */
    public static final class a extends hr90 {
        public static final a a = new a();

        public final String toString() {
            return "PauseEventTrigger.Error";
        }
    }

    /* compiled from: PauseEventTrigger.kt */
    public static final class b extends hr90 {
        public static final b a = new b();

        public final String toString() {
            return "PauseEventTrigger.PauseButton";
        }
    }

    /* compiled from: PauseEventTrigger.kt */
    public static final class c extends hr90 {
        public static final c a = new c();

        public final String toString() {
            return "PauseEventTrigger.Paywall";
        }
    }

    /* compiled from: PauseEventTrigger.kt */
    public static final class d extends hr90 {
        public static final d a = new d();

        public final String toString() {
            return "PauseEventTrigger.PlaybackDiscontinuity";
        }
    }

    /* compiled from: PauseEventTrigger.kt */
    public static final class e extends hr90 {
        public static final e a = new e();

        public final String toString() {
            return "PauseEventTrigger.Restore";
        }
    }

    /* compiled from: PauseEventTrigger.kt */
    public static final class f extends hr90 {
        public static final f a = new f();

        public final String toString() {
            return "PauseEventTrigger.Rewind";
        }
    }

    /* compiled from: PauseEventTrigger.kt */
    public static final class g extends hr90 {
        public final int a;
        public final int b;

        public g(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PauseEventTrigger.Seek(type=");
            sb.append(this.a);
            sb.append(", direction=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: PauseEventTrigger.kt */
    public static final class h extends hr90 {
        public static final h a = new h();

        public final String toString() {
            return "PauseEventTrigger.System";
        }
    }

    /* compiled from: PauseEventTrigger.kt */
    public static final class i extends hr90 {
        public static final i a = new i();

        public final String toString() {
            return "PauseEventTrigger.Unknown";
        }
    }

    /* compiled from: PauseEventTrigger.kt */
    public static final class j extends hr90 {
        public static final j a = new j();

        public final String toString() {
            return "PauseEventTrigger.Voice";
        }
    }
}
