package xsna;

import android.content.Context;

/* compiled from: SingleTabInfo.kt */
/* loaded from: classes16.dex */
public final class iwj0 {
    public final b a;
    public final a b;
    public final String c;
    public final izs<Context, s3q0> d;

    /* compiled from: SingleTabInfo.kt */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* compiled from: SingleTabInfo.kt */
    public static final class b {
        public final int a;

        public b(int i) {
            this.a = i;
        }
    }

    public iwj0() {
        throw null;
    }

    public iwj0(b bVar, a aVar, String str, izs izsVar, int i) {
        bVar = (i & 1) != 0 ? null : bVar;
        str = (i & 4) != 0 ? null : str;
        this.a = bVar;
        this.b = aVar;
        this.c = str;
        this.d = izsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwj0)) {
            return false;
        }
        iwj0 iwj0Var = (iwj0) obj;
        return epx.f(this.a, iwj0Var.a) && epx.f(this.b, iwj0Var.b) && epx.f(this.c, iwj0Var.c) && epx.f(this.d, iwj0Var.d);
    }

    public final int hashCode() {
        b bVar = this.a;
        int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.c;
        return this.d.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SingleTabInfo(title=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", contentDescription=");
        sb.append(this.c);
        sb.append(", onClick=");
        return up.c(sb, this.d, ')');
    }
}
