package xsna;

import xsna.tlo0;

/* compiled from: CourierMapViewState.kt */
/* loaded from: classes18.dex */
public abstract class it0 {
    public final boolean a;

    /* compiled from: CourierMapViewState.kt */
    public static final class a extends it0 {
        public final tlo0.f b;
        public final ht0 c;
        public final boolean d;

        public a(tlo0.f fVar, ht0 ht0Var, boolean z) {
            super(z);
            this.b = fVar;
            this.c = ht0Var;
            this.d = z;
        }

        @Override // xsna.it0
        public final boolean a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b.equals(aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Error(message=");
            sb.append((Object) qow.b(this.b));
            sb.append(", actionButton=");
            sb.append(this.c);
            sb.append(", isExpanded=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: CourierMapViewState.kt */
    public static final class b extends it0 {
        public static final b b = new b(false);
    }

    /* compiled from: CourierMapViewState.kt */
    public static final class c extends it0 {
        public final String b;
        public final qow<tlo0> c;
        public final boolean d;
        public final boolean e;

        public c() {
            throw null;
        }

        public c(String str, qow qowVar, boolean z, boolean z2) {
            super(z2);
            this.b = str;
            this.c = qowVar;
            this.d = z;
            this.e = z2;
        }

        @Override // xsna.it0
        public final boolean a() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && this.d == cVar.d && this.e == cVar.e;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            qow<tlo0> qowVar = this.c;
            return Boolean.hashCode(this.e) + qoy.b((hashCode + (qowVar == null ? 0 : qow.a(qowVar.a))) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Selected(address=");
            sb.append(this.b);
            sb.append(", error=");
            sb.append(this.c);
            sb.append(", isButtonEnabled=");
            sb.append(this.d);
            sb.append(", isExpanded=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }

    public it0(boolean z) {
        this.a = z;
    }

    public boolean a() {
        return this.a;
    }
}
