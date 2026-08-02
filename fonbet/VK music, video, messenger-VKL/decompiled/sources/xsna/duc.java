package xsna;

/* compiled from: ClipEditSdkVideoAttachVS.kt */
/* loaded from: classes17.dex */
public interface duc {

    /* compiled from: ClipEditSdkVideoAttachVS.kt */
    public static final class a implements duc {
        public static final a a = new a();
    }

    /* compiled from: ClipEditSdkVideoAttachVS.kt */
    public static final class b implements duc {
        public final boolean a;
        public final boolean b;

        public b(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Empty(isLoading=");
            sb.append(this.a);
            sb.append(", isClipAttachVideoEnabled=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: ClipEditSdkVideoAttachVS.kt */
    public static final class c implements duc {
        public final String a;
        public final String b;
        public final boolean c;

        public c(String str, String str2, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && this.c == cVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Selected(title=");
            sb.append(this.a);
            sb.append(", pictureUrl=");
            sb.append(this.b);
            sb.append(", isClipAttachVideoEnabled=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }
}
