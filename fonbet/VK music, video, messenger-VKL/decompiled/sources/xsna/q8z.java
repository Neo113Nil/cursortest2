package xsna;

import xsna.us2;

/* compiled from: LinkAnnotation.kt */
/* loaded from: classes11.dex */
public abstract class q8z implements us2.a {

    /* compiled from: LinkAnnotation.kt */
    public static final class a extends q8z {
        public final String a;
        public final tjo0 b;
        public final i9z c;

        public a(String str, tjo0 tjo0Var, i9z i9zVar) {
            this.a = str;
            this.b = tjo0Var;
            this.c = i9zVar;
        }

        @Override // xsna.q8z
        public final i9z a() {
            return this.c;
        }

        @Override // xsna.q8z
        public final tjo0 b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            tjo0 tjo0Var = this.b;
            int hashCode2 = (hashCode + (tjo0Var != null ? tjo0Var.hashCode() : 0)) * 31;
            i9z i9zVar = this.c;
            return hashCode2 + (i9zVar != null ? i9zVar.hashCode() : 0);
        }

        public final String toString() {
            return ho8.a(new StringBuilder("LinkAnnotation.Clickable(tag="), this.a, ')');
        }
    }

    public abstract i9z a();

    public abstract tjo0 b();

    /* compiled from: LinkAnnotation.kt */
    public static final class b extends q8z {
        public final String a;
        public final tjo0 b;
        public final i9z c;

        public b(String str, tjo0 tjo0Var, i9z i9zVar) {
            this.a = str;
            this.b = tjo0Var;
            this.c = i9zVar;
        }

        @Override // xsna.q8z
        public final i9z a() {
            return this.c;
        }

        @Override // xsna.q8z
        public final tjo0 b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            tjo0 tjo0Var = this.b;
            int hashCode2 = (hashCode + (tjo0Var != null ? tjo0Var.hashCode() : 0)) * 31;
            i9z i9zVar = this.c;
            return hashCode2 + (i9zVar != null ? i9zVar.hashCode() : 0);
        }

        public final String toString() {
            return ho8.a(new StringBuilder("LinkAnnotation.Url(url="), this.a, ')');
        }

        public /* synthetic */ b(String str, tjo0 tjo0Var, ypm0 ypm0Var, int i) {
            this(str, (i & 2) != 0 ? null : tjo0Var, (i & 4) != 0 ? null : ypm0Var);
        }
    }
}
