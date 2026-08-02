package xsna;

import java.util.List;

/* compiled from: MusicSnippetsState.kt */
/* loaded from: classes3.dex */
public final class a750 implements km50 {
    public final a b;
    public final boolean c;
    public final Throwable d;

    /* compiled from: MusicSnippetsState.kt */
    public static final class a {
        public final List<nck0> a;

        public a(List<nck0> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("Content(snippetSections="), this.a);
        }
    }

    public a750() {
        this(0);
    }

    public static a750 a(a750 a750Var, a aVar, boolean z, Throwable th, int i) {
        if ((i & 1) != 0) {
            aVar = a750Var.b;
        }
        if ((i & 4) != 0) {
            th = a750Var.d;
        }
        a750Var.getClass();
        return new a750(aVar, z, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a750)) {
            return false;
        }
        a750 a750Var = (a750) obj;
        return epx.f(this.b, a750Var.b) && this.c == a750Var.c && epx.f(this.d, a750Var.d);
    }

    public final int hashCode() {
        a aVar = this.b;
        int b = qoy.b((aVar == null ? 0 : aVar.a.hashCode()) * 31, 31, this.c);
        Throwable th = this.d;
        return b + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicSnippetsState(content=");
        sb.append(this.b);
        sb.append(", isLoading=");
        sb.append(this.c);
        sb.append(", error=");
        return oq.c(sb, this.d, ')');
    }

    public /* synthetic */ a750(int i) {
        this(null, false, null);
    }

    public a750(a aVar, boolean z, Throwable th) {
        this.b = aVar;
        this.c = z;
        this.d = th;
    }
}
