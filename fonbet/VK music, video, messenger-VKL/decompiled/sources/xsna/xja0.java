package xsna;

/* compiled from: PictureInPictureFeatureState.kt */
/* loaded from: classes7.dex */
public abstract class xja0 {

    /* compiled from: PictureInPictureFeatureState.kt */
    public static final class a extends xja0 {
        public final kr5 a;
        public final CharSequence b;
        public final CharSequence c;
        public final cjk0 d;
        public final cjk0 e;
        public final boolean f;

        public a(kr5 kr5Var, String str, String str2, cjk0 cjk0Var, cjk0 cjk0Var2, boolean z) {
            this.a = kr5Var;
            this.b = str;
            this.c = str2;
            this.d = cjk0Var;
            this.e = cjk0Var2;
            this.f = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && this.f == aVar.f;
        }

        public final int hashCode() {
            int hashCode = (this.d.hashCode() + u11.c(u11.c(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
            cjk0 cjk0Var = this.e;
            return Boolean.hashCode(this.f) + ((hashCode + (cjk0Var == null ? 0 : cjk0Var.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Active(avatar=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append((Object) this.b);
            sb.append(", status=");
            sb.append((Object) this.c);
            sb.append(", myself=");
            sb.append(this.d);
            sb.append(", speaker=");
            sb.append(this.e);
            sb.append(", isBroadcastActive=");
            return defpackage.q0.a(sb, this.f, ')');
        }
    }

    /* compiled from: PictureInPictureFeatureState.kt */
    public static final class b extends xja0 {
        public static final b a = new b();
    }
}
