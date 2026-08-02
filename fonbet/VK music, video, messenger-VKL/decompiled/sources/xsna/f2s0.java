package xsna;

/* compiled from: VideoAttachUiModel.kt */
/* loaded from: classes17.dex */
public interface f2s0 {

    /* compiled from: VideoAttachUiModel.kt */
    public static final class a implements f2s0 {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
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
            return defpackage.q0.a(new StringBuilder("None(isLoading="), this.a, ')');
        }
    }

    /* compiled from: VideoAttachUiModel.kt */
    public static final class b implements f2s0 {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Selected(title=");
            sb.append(this.a);
            sb.append(", image=");
            return ho8.a(sb, this.b, ')');
        }
    }
}
