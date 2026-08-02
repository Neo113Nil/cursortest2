package xsna;

/* compiled from: CallDebugMenuPatch.kt */
/* loaded from: classes7.dex */
public interface f29 extends xl50 {

    /* compiled from: CallDebugMenuPatch.kt */
    public static final class a implements f29 {
        public final String b;

        public a(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("SetCallId(callId="), this.b, ')');
        }
    }

    /* compiled from: CallDebugMenuPatch.kt */
    public static final class b implements f29 {
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
            return defpackage.q0.a(new StringBuilder("SetDebugAppSettingsVisible(isVisible="), this.b, ')');
        }
    }

    /* compiled from: CallDebugMenuPatch.kt */
    public static final class c implements f29 {
        public final boolean b;

        public c(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetHeadersBoundsVisible(isHeadersBoundsVisible="), this.b, ')');
        }
    }

    /* compiled from: CallDebugMenuPatch.kt */
    public static final class d implements f29 {
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public d(boolean z, boolean z2, boolean z3) {
            this.b = z;
            this.c = z2;
            this.d = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.b == dVar.b && this.c == dVar.c && this.d == dVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetJoinAsOptions(isJoinAsGroupEnabled=");
            sb.append(this.b);
            sb.append(", isJoinAsAnonymousEnabled=");
            sb.append(this.c);
            sb.append(", isJoinWithChangedNameEnabled=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: CallDebugMenuPatch.kt */
    public static final class e implements f29 {
        public final boolean b;

        public e(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b == ((e) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetTestOptions(isCrashOnCameraCloseRequired="), this.b, ')');
        }
    }

    /* compiled from: CallDebugMenuPatch.kt */
    public static final class f implements f29 {
        public final boolean b;

        public f(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b == ((f) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetUiOptions(isStereoUiEnabled="), this.b, ')');
        }
    }
}
