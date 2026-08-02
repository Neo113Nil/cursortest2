package xsna;

/* compiled from: StopEventTrigger.kt */
/* loaded from: classes3.dex */
public abstract class agl0 {

    /* compiled from: StopEventTrigger.kt */
    public static final class a extends agl0 {
        public static final a a = new a();

        public final String toString() {
            return "StopEventTrigger.ChangeSource";
        }
    }

    /* compiled from: StopEventTrigger.kt */
    public static final class b extends agl0 {
        public static final b a = new b();

        public final String toString() {
            return "StopEventTrigger.Close";
        }
    }

    /* compiled from: StopEventTrigger.kt */
    public static final class c extends agl0 {
        public static final c a = new c();

        public final String toString() {
            return "StopEventTrigger.Completed";
        }
    }

    /* compiled from: StopEventTrigger.kt */
    public static final class d extends agl0 {
        public static final d a = new d();

        public final String toString() {
            return "StopEventTrigger.Error";
        }
    }

    /* compiled from: StopEventTrigger.kt */
    public static final class e extends agl0 {
        public static final e a = new e();

        public final String toString() {
            return "StopEventTrigger.Repeat";
        }
    }

    /* compiled from: StopEventTrigger.kt */
    public static final class f extends agl0 {
        public final int a;

        public f(int i) {
            this.a = i;
        }

        public final String toString() {
            return vu5.b(new StringBuilder("StopEventTrigger.Skip(type="), this.a, ')');
        }
    }

    /* compiled from: StopEventTrigger.kt */
    public static final class g extends agl0 {
        public static final g a = new g();

        public final String toString() {
            return "StopEventTrigger.Unknown";
        }
    }
}
