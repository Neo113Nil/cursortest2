package xsna;

import java.util.List;

/* compiled from: VoipSelectVideoTabState.kt */
/* loaded from: classes7.dex */
public abstract class c1x0 implements km50 {

    /* compiled from: VoipSelectVideoTabState.kt */
    public static final class a extends c1x0 {
        public final List<p3x0> b;
        public final a990<String> c;

        public a(List<p3x0> list, a990<String> a990Var) {
            this.b = list;
            this.c = a990Var;
        }

        public static a a(a aVar, a990 a990Var) {
            List<p3x0> list = aVar.b;
            aVar.getClass();
            return new a(list, a990Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "Content(items=" + this.b + ", pageContent=" + this.c + ')';
        }
    }

    /* compiled from: VoipSelectVideoTabState.kt */
    public static final class b extends c1x0 {
        public final Throwable b;

        public b(Throwable th) {
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("Error(error="), this.b, ')');
        }
    }

    /* compiled from: VoipSelectVideoTabState.kt */
    public static final class c extends c1x0 {
        public static final c b = new c();
    }
}
