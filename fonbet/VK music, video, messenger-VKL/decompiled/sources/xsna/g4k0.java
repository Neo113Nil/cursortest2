package xsna;

/* compiled from: SmartCropEvent.kt */
/* loaded from: classes7.dex */
public interface g4k0 extends pk50 {

    /* compiled from: SmartCropEvent.kt */
    public static final class a implements g4k0 {
        public final boolean a;

        public a() {
            this(false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Exit(isInitError="), this.a, ')');
        }

        public a(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: SmartCropEvent.kt */
    public static final class b implements g4k0 {
        public final String a;
        public final boolean b;

        public b(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenPublishClipScreen(videoUrl=");
            sb.append(this.a);
            sb.append(", isSmartCrop=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }
}
