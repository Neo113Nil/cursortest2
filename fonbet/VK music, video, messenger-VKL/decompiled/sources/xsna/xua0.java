package xsna;

/* compiled from: PlayEventTrigger.kt */
/* loaded from: classes3.dex */
public abstract class xua0 {

    /* compiled from: PlayEventTrigger.kt */
    public static final class a extends xua0 {
        public static final a a = new a();

        public final String toString() {
            return "PlayEventTrigger.AutoProceed";
        }
    }

    /* compiled from: PlayEventTrigger.kt */
    public static final class b extends xua0 {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("PlayEventTrigger.AutoStart(dueToError="), this.a, ')');
        }
    }

    /* compiled from: PlayEventTrigger.kt */
    public static final class c extends xua0 {
        public final int a;

        public c(int i) {
            this.a = i;
        }

        public final String toString() {
            return vu5.b(new StringBuilder("PlayEventTrigger.FastPlay(type="), this.a, ')');
        }
    }

    /* compiled from: PlayEventTrigger.kt */
    public static final class d extends xua0 {
        public static final d a = new d();

        public final String toString() {
            return "PlayEventTrigger.Heartbeat";
        }
    }

    /* compiled from: PlayEventTrigger.kt */
    public static final class e extends xua0 {
        public static final e a = new e();

        public final String toString() {
            return "PlayEventTrigger.PlayButton";
        }
    }

    /* compiled from: PlayEventTrigger.kt */
    public static final class f extends xua0 {
        public static final f a = new f();

        public final String toString() {
            return "PlayEventTrigger.Repeat";
        }
    }

    /* compiled from: PlayEventTrigger.kt */
    public static final class g extends xua0 {
        public final int a;
        public final int b;

        public g(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlayEventTrigger.Seek(type=");
            sb.append(this.a);
            sb.append(", direction=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: PlayEventTrigger.kt */
    public static final class h extends xua0 {
        public static final h a = new h();

        public final String toString() {
            return "PlayEventTrigger.ShuffleButton";
        }
    }

    /* compiled from: PlayEventTrigger.kt */
    public static final class i extends xua0 {
        public final int a;

        public i(int i) {
            this.a = i;
        }

        public final String toString() {
            return vu5.b(new StringBuilder("PlayEventTrigger.Skip(type="), this.a, ')');
        }
    }

    /* compiled from: PlayEventTrigger.kt */
    public static final class j extends xua0 {
        public static final j a = new j();

        public final String toString() {
            return "PlayEventTrigger.Unknown";
        }
    }

    /* compiled from: PlayEventTrigger.kt */
    public static final class k extends xua0 {
        public final int a;

        public k(int i) {
            this.a = i;
        }

        public final String toString() {
            return vu5.b(new StringBuilder("PlayEventTrigger.Voice(type="), this.a, ')');
        }
    }
}
