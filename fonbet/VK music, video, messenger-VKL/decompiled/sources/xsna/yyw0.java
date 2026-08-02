package xsna;

/* compiled from: VoipScreenSharePatch.kt */
/* loaded from: classes7.dex */
public abstract class yyw0 implements xl50 {

    /* compiled from: VoipScreenSharePatch.kt */
    public static final class a extends yyw0 {
        public final boolean b;

        public a(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("FastScreenSharePatch(isEnabled="), this.b, ')');
        }
    }

    /* compiled from: VoipScreenSharePatch.kt */
    public static final class b extends yyw0 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "Init(isFastScreenShare=false)";
        }
    }
}
