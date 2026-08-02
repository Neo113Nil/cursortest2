package xsna;

import kotlin.NoWhenBranchMatchedException;

/* compiled from: CourierMapState.kt */
/* loaded from: classes18.dex */
public abstract class jt0 {

    /* compiled from: CourierMapState.kt */
    public static final class c extends jt0 {
        public final String a;
        public final boolean b;
        public final boolean c;

        public c(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Selected(value=");
            sb.append(this.a);
            sb.append(", isCorrect=");
            sb.append(this.b);
            sb.append(", isExpanded=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    public final jt0 a(boolean z) {
        if (this instanceof c) {
            c cVar = (c) this;
            return new c(cVar.a, cVar.b, z);
        }
        if (this instanceof a) {
            return new a(z);
        }
        if (this instanceof b) {
            return new b(z);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: CourierMapState.kt */
    public static final class a extends jt0 {
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
            return defpackage.q0.a(new StringBuilder("Failed(isExpanded="), this.a, ')');
        }

        public a() {
            this(true);
        }
    }

    /* compiled from: CourierMapState.kt */
    public static final class b extends jt0 {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("OutOfBorders(isExpanded="), this.a, ')');
        }

        public b() {
            this(true);
        }
    }
}
