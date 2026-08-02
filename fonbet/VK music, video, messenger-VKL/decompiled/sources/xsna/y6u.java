package xsna;

import java.util.ArrayList;

/* compiled from: GoodPreviewPatch.kt */
/* loaded from: classes18.dex */
public abstract class y6u implements xl50 {

    /* compiled from: GoodPreviewPatch.kt */
    public static abstract class a extends y6u {

        /* compiled from: GoodPreviewPatch.kt */
        /* renamed from: xsna.y6u$a$a, reason: collision with other inner class name */
        public static final class C4080a extends a {
        }

        /* compiled from: GoodPreviewPatch.kt */
        public static final class b extends a {
            public static final b b = new b();
        }

        /* compiled from: GoodPreviewPatch.kt */
        public static final class c extends a {
            public static final c b = new c();
        }
    }

    /* compiled from: GoodPreviewPatch.kt */
    public static abstract class b extends y6u {

        /* compiled from: GoodPreviewPatch.kt */
        public static final class a extends b {
            public final int b;

            public a(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Cart(quantity="), this.b, ')');
            }
        }

        /* compiled from: GoodPreviewPatch.kt */
        /* renamed from: xsna.y6u$b$b, reason: collision with other inner class name */
        public static final class C4081b extends b {
            public final int b;

            public C4081b(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4081b) && this.b == ((C4081b) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Fave(quantity="), this.b, ')');
            }
        }
    }

    /* compiled from: GoodPreviewPatch.kt */
    public static abstract class c extends y6u {

        /* compiled from: GoodPreviewPatch.kt */
        public static final class a extends c {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1428033516;
            }

            public final String toString() {
                return "AddToCart";
            }
        }

        /* compiled from: GoodPreviewPatch.kt */
        public static final class b extends c {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -159325770;
            }

            public final String toString() {
                return "RemoveFromCart";
            }
        }

        /* compiled from: GoodPreviewPatch.kt */
        /* renamed from: xsna.y6u$c$c, reason: collision with other inner class name */
        public static final class C4082c extends c {
            public final boolean b;

            public C4082c(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4082c) && this.b == ((C4082c) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("ToggleFavorite(isFavorite="), this.b, ')');
            }
        }
    }

    /* compiled from: GoodPreviewPatch.kt */
    public static abstract class d extends y6u {

        /* compiled from: GoodPreviewPatch.kt */
        public static final class a extends d {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
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
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: GoodPreviewPatch.kt */
        public static final class b extends d {
            public static final b b = new b();
        }

        /* compiled from: GoodPreviewPatch.kt */
        public static final class c extends d {
            public final e6u b;

            public c(e6u e6uVar) {
                this.b = e6uVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Success(content=" + this.b + ')';
            }
        }
    }

    /* compiled from: GoodPreviewPatch.kt */
    public static abstract class e extends y6u {

        /* compiled from: GoodPreviewPatch.kt */
        public static final class a extends e {
        }

        /* compiled from: GoodPreviewPatch.kt */
        public static final class b extends e {
            public static final b b = new b();
        }

        /* compiled from: GoodPreviewPatch.kt */
        public static final class c extends e {
            public final ArrayList b;
            public final int c;

            public c(ArrayList arrayList, int i) {
                this.b = arrayList;
                this.c = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.b, cVar.b) && this.c == cVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Success(recommendations=");
                sb.append(this.b);
                sb.append(", loadedOffset=");
                return vu5.b(sb, this.c, ')');
            }
        }
    }

    /* compiled from: GoodPreviewPatch.kt */
    public static final class f extends y6u {
        public final k7u b;
        public final boolean c;
        public final boolean d;

        public f(k7u k7uVar, boolean z, boolean z2) {
            this.b = k7uVar;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.b, fVar.b) && this.c == fVar.c && this.d == fVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ToggleFaveSuccess(good=");
            sb.append(this.b);
            sb.append(", isFave=");
            sb.append(this.c);
            sb.append(", isRecommendation=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }
}
