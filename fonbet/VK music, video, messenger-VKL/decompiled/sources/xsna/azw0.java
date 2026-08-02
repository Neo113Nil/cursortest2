package xsna;

/* compiled from: VoipScreenShareState.kt */
/* loaded from: classes7.dex */
public abstract class azw0 implements km50 {

    /* compiled from: VoipScreenShareState.kt */
    public static final class a extends azw0 {
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
            return defpackage.q0.a(new StringBuilder("Content(isFastScreenShare="), this.b, ')');
        }
    }

    /* compiled from: VoipScreenShareState.kt */
    public static final class b extends azw0 {
        public static final b b = new b();
    }
}
