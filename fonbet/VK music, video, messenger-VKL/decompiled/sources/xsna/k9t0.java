package xsna;

/* compiled from: VideoProfileToolbarViewState.kt */
/* loaded from: classes6.dex */
public abstract class k9t0 {

    /* compiled from: VideoProfileToolbarViewState.kt */
    public static final class a extends k9t0 {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public a(boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loading(isNavigationBackButtonVisible=");
            sb.append(this.a);
            sb.append(", settingsVisible=");
            sb.append(this.b);
            sb.append(", shareVisible=");
            sb.append(this.c);
            sb.append(", searchVisible=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: VideoProfileToolbarViewState.kt */
    public static final class b extends k9t0 {
        public final boolean a;
        public final String b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;

        public b(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
            this.a = z;
            this.b = str;
            this.c = z2;
            this.d = z3;
            this.e = z4;
            this.f = z5;
            this.g = z6;
            this.h = z7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h;
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            String str = this.b;
            return Boolean.hashCode(this.h) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Visible(isNavigationBackButtonVisible=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", moreVisible=");
            sb.append(this.c);
            sb.append(", settingsVisible=");
            sb.append(this.d);
            sb.append(", shareVisible=");
            sb.append(this.e);
            sb.append(", searchVisible=");
            sb.append(this.f);
            sb.append(", isAnonymousState=");
            sb.append(this.g);
            sb.append(", isErrorState=");
            return defpackage.q0.a(sb, this.h, ')');
        }
    }
}
