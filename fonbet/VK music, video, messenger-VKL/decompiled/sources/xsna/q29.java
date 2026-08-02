package xsna;

/* compiled from: CallDebugOptions.kt */
/* loaded from: classes7.dex */
public final class q29 {
    public final a a;
    public final c b;

    /* compiled from: CallDebugOptions.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public a(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("JoinOptions(isJoinAsGroupEnabled=");
            sb.append(this.a);
            sb.append(", isJoinAsAnonymousEnabled=");
            sb.append(this.b);
            sb.append(", isJoinWithChangedNameEnabled=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: CallDebugOptions.kt */
    public static final class b {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("TestOptions(isCrashOnCameraCloseRequired="), this.a, ')');
        }
    }

    /* compiled from: CallDebugOptions.kt */
    public static final class c {
        public final boolean a;

        public c(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("UIOptions(isStereoUIEnabled="), this.a, ')');
        }
    }

    public q29(a aVar, c cVar) {
        this.a = aVar;
        this.b = cVar;
    }
}
