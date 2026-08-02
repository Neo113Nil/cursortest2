package xsna;

import xsna.tlo0;

/* compiled from: CountersBlock.kt */
/* loaded from: classes16.dex */
public final class zwj {
    public final b a;
    public final a b;
    public final gzs<s3q0> c;

    /* compiled from: CountersBlock.kt */
    public static final class a {
        public final tlo0.h a;
        public final com.vk.core.compose.component.semantics.a b;

        public a(tlo0.h hVar, com.vk.core.compose.component.semantics.a aVar) {
            this.a = hVar;
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.a.hashCode() * 31);
        }

        public final String toString() {
            return "Count(text=" + this.a + ", semanticsConfiguration=" + this.b + ')';
        }
    }

    /* compiled from: CountersBlock.kt */
    public static final class b {
        public final tlo0.h a;
        public final com.vk.core.compose.component.semantics.a b;

        public b(tlo0.h hVar, com.vk.core.compose.component.semantics.a aVar) {
            this.a = hVar;
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.a.hashCode() * 31);
        }

        public final String toString() {
            return "Title(text=" + this.a + ", semanticsConfiguration=" + this.b + ')';
        }
    }

    public zwj(b bVar, a aVar, gzs<s3q0> gzsVar) {
        this.a = bVar;
        this.b = aVar;
        this.c = gzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwj)) {
            return false;
        }
        zwj zwjVar = (zwj) obj;
        return epx.f(this.a, zwjVar.a) && epx.f(this.b, zwjVar.b) && epx.f(this.c, zwjVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        gzs<s3q0> gzsVar = this.c;
        return hashCode + (gzsVar == null ? 0 : gzsVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Counter(title=");
        sb.append(this.a);
        sb.append(", count=");
        sb.append(this.b);
        sb.append(", onClick=");
        return uf3.d(sb, this.c, ')');
    }
}
