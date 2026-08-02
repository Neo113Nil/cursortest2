package xsna;

/* compiled from: CallDebugMenuAction.kt */
/* loaded from: classes7.dex */
public interface w19 extends kj50 {

    /* compiled from: CallDebugMenuAction.kt */
    public static final class a implements w19 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1533769309;
        }

        public final String toString() {
            return "CrashApplication";
        }
    }

    /* compiled from: CallDebugMenuAction.kt */
    public static final class b implements w19 {
        public final boolean b;

        public b(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("CrashOnCameraClose(isEnabled="), this.b, ')');
        }
    }

    /* compiled from: CallDebugMenuAction.kt */
    public static final class c implements w19 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1748886234;
        }

        public final String toString() {
            return "FlushOneLogger";
        }
    }

    /* compiled from: CallDebugMenuAction.kt */
    public static final class d implements w19 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1532333498;
        }

        public final String toString() {
            return "ForceP2PRelay";
        }
    }

    /* compiled from: CallDebugMenuAction.kt */
    public static final class e implements w19 {
        public static final e b = new e();
    }

    /* compiled from: CallDebugMenuAction.kt */
    public static final class f implements w19 {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1488519600;
        }

        public final String toString() {
            return "OpenCollectDumpFragment";
        }
    }

    /* compiled from: CallDebugMenuAction.kt */
    public static final class g implements w19 {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 882797245;
        }

        public final String toString() {
            return "ReportConversationError";
        }
    }

    /* compiled from: CallDebugMenuAction.kt */
    public static final class h implements w19 {
        public final boolean b;

        public h(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.b == ((h) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetHeadersBoundsVisible(isVisible="), this.b, ')');
        }
    }

    /* compiled from: CallDebugMenuAction.kt */
    public static final class i implements w19 {
        public final boolean b;

        public i(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.b == ((i) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetJoinAsAnonymousEnabled(isEnabled="), this.b, ')');
        }
    }

    /* compiled from: CallDebugMenuAction.kt */
    public static final class j implements w19 {
        public final boolean b;

        public j(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.b == ((j) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetJoinAsGroupEnabled(isEnabled="), this.b, ')');
        }
    }

    /* compiled from: CallDebugMenuAction.kt */
    public static final class k implements w19 {
        public final boolean b;

        public k(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.b == ((k) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetJoinWithChangedNameEnabled(isEnabled="), this.b, ')');
        }
    }

    /* compiled from: CallDebugMenuAction.kt */
    public static final class l implements w19 {
        public final boolean b;

        public l(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.b == ((l) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetStereoUiEnabled(isEnabled="), this.b, ')');
        }
    }
}
