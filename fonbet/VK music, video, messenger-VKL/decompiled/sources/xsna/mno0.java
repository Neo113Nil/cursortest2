package xsna;

import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.List;

/* compiled from: TextViewState.kt */
/* loaded from: classes2.dex */
public interface mno0 {

    /* compiled from: TextViewState.kt */
    @vby
    public static final class a implements mno0 {
        public final wzs<androidx.compose.runtime.a, Integer, us2> a;

        public /* synthetic */ a(wzs wzsVar) {
            this.a = wzsVar;
        }

        @Override // xsna.mno0
        public final c b(mno0 mno0Var) {
            return new c(this, mno0Var);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return epx.f(this.a, ((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "AnnotatedText(text=" + this.a + ')';
        }
    }

    /* compiled from: TextViewState.kt */
    public static final class b {
        public static d a() {
            return d.a;
        }

        @ozl
        public static a b(wzs wzsVar) {
            return new a(wzsVar);
        }

        public static e c(int i, int i2) {
            return new e(i, i2);
        }

        public static g d() {
            return new g(R.string.video_trailer_badge);
        }

        public static i e(String str) {
            return new i(str);
        }
    }

    /* compiled from: TextViewState.kt */
    public static final class c implements mno0 {
        public final mno0 a;
        public final mno0 b;

        public c(mno0 mno0Var, mno0 mno0Var2) {
            this.a = mno0Var;
            this.b = mno0Var2;
        }

        @Override // xsna.mno0
        public final c b(mno0 mno0Var) {
            return new c(this, mno0Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Concat(first=" + this.a + ", second=" + this.b + ')';
        }
    }

    /* compiled from: TextViewState.kt */
    public static final class d implements mno0 {
        public static final d a = new d();

        @Override // xsna.mno0
        public final c b(mno0 mno0Var) {
            return new c(this, mno0Var);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 757544833;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: TextViewState.kt */
    public static final class e implements mno0 {
        public final int a;
        public final int b;

        public e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // xsna.mno0
        public final c b(mno0 mno0Var) {
            return new c(this, mno0Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Plurals(resId=");
            sb.append(this.a);
            sb.append(", quantity=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: TextViewState.kt */
    public static final class f implements mno0 {
        public final int a;
        public final int b;
        public final List<Object> c;

        public f(int i, int i2, List<? extends Object> list) {
            this.a = i;
            this.b = i2;
            this.c = list;
        }

        @Override // xsna.mno0
        public final c b(mno0 mno0Var) {
            return new c(this, mno0Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && this.b == fVar.b && epx.f(this.c, fVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PluralsParams(resId=");
            sb.append(this.a);
            sb.append(", quantity=");
            sb.append(this.b);
            sb.append(", args=");
            return ms9.a(')', sb, this.c);
        }
    }

    /* compiled from: TextViewState.kt */
    public static final class g implements mno0 {
        public final int a;

        public g(int i) {
            this.a = i;
        }

        @Override // xsna.mno0
        public final c b(mno0 mno0Var) {
            return new c(this, mno0Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a == ((g) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Resource(resId="), this.a, ')');
        }
    }

    /* compiled from: TextViewState.kt */
    public static final class h implements mno0 {
        public final int a;
        public final List<Object> b;

        public h(int i, List<? extends Object> list) {
            this.a = i;
            this.b = list;
        }

        @Override // xsna.mno0
        public final c b(mno0 mno0Var) {
            return new c(this, mno0Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.a == hVar.a && epx.f(this.b, hVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ResourceParams(resId=");
            sb.append(this.a);
            sb.append(", args=");
            return ms9.a(')', sb, this.b);
        }
    }

    /* compiled from: TextViewState.kt */
    @vby
    public static final class i implements mno0 {
        public final String a;

        public /* synthetic */ i(String str) {
            this.a = str;
        }

        @Override // xsna.mno0
        public final c b(mno0 mno0Var) {
            return new c(this, mno0Var);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof i) {
                return epx.f(this.a, ((i) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return air.b(')', "SimpleText(text=", this.a);
        }
    }

    default String a(int i2, androidx.compose.runtime.a aVar) {
        String sb;
        aVar.K(-1080164355);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1080164355, i2, -1, "com.vk.libvideo.design.compose.utils.TextViewState.asString (TextViewState.kt:53)");
        }
        if (this instanceof a) {
            aVar.K(1344144193);
            sb = ((a) this).a.invoke(aVar, 0).c;
            aVar.j();
        } else if (equals(d.a)) {
            aVar.K(-1281177247);
            aVar.j();
            sb = "";
        } else if (this instanceof e) {
            aVar.K(1344145986);
            e eVar = (e) this;
            sb = d370.E(eVar.a, eVar.b, aVar);
            aVar.j();
        } else if (this instanceof f) {
            aVar.K(1344148248);
            f fVar = (f) this;
            Object[] array = fVar.c.toArray(new Object[0]);
            sb = d370.F(fVar.a, fVar.b, Arrays.copyOf(array, array.length), aVar, 0);
            aVar.j();
        } else if (this instanceof g) {
            aVar.K(1344150994);
            sb = d370.N(((g) this).a, 0, aVar);
            aVar.j();
        } else if (this instanceof h) {
            aVar.K(1344152776);
            h hVar = (h) this;
            Object[] array2 = hVar.b.toArray(new Object[0]);
            sb = d370.O(hVar.a, Arrays.copyOf(array2, array2.length), aVar);
            aVar.j();
        } else if (this instanceof i) {
            aVar.K(1344155073);
            aVar.j();
            sb = ((i) this).a;
        } else {
            if (!(this instanceof c)) {
                throw alb0.c(1344142745, aVar);
            }
            aVar.K(1344156065);
            StringBuilder sb2 = new StringBuilder();
            c cVar = (c) this;
            sb2.append(cVar.a.a(0, aVar));
            sb2.append(cVar.b.a(0, aVar));
            sb = sb2.toString();
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return sb;
    }

    default c b(mno0 mno0Var) {
        return new c(this, mno0Var);
    }

    default us2 c(androidx.compose.runtime.a aVar) {
        us2 us2Var;
        aVar.K(1933365793);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1933365793, 0, -1, "com.vk.libvideo.design.compose.utils.TextViewState.asAnnotatedString (TextViewState.kt:67)");
        }
        if (this instanceof a) {
            aVar.K(-1756308087);
            us2Var = ((a) this).a.invoke(aVar, 0);
            aVar.j();
        } else if (this instanceof c) {
            aVar.K(-1756306953);
            c cVar = (c) this;
            us2Var = cVar.a.c(aVar).e(cVar.b.c(aVar));
            aVar.j();
        } else {
            aVar.K(-1756304580);
            us2Var = new us2(a(0, aVar));
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return us2Var;
    }
}
