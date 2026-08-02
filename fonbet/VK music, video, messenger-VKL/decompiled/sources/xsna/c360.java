package xsna;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;

/* compiled from: NetworkErrorResolver.kt */
/* loaded from: classes2.dex */
public final class c360 implements owp {
    public final a a;
    public int b;
    public boolean c;

    /* compiled from: NetworkErrorResolver.kt */
    public static final class a {
        public static final a c = new a(5, true);
        public static final a d = new a(0, true);
        public static final a e = new a(0, false);
        public final int a;
        public final boolean b;

        public a(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Config(retryCount=");
            sb.append(this.a);
            sb.append(", needShowLostNetworkSnackbar=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    public c360(a aVar) {
        this.a = aVar;
    }

    @Override // xsna.owp
    public final List<avp> a(Throwable th, m7q m7qVar, long j) {
        a aVar = this.a;
        if (aVar.a <= this.b || !tjs0.a(th)) {
            return EmptyList.b;
        }
        this.b++;
        ListBuilder e = e43.e();
        e.add(new ova0(0L));
        if (aVar.b && !this.c) {
            this.c = true;
            e.add(mij0.a);
        }
        return e.g();
    }

    @Override // xsna.owp
    public final void reset() {
        this.b = 0;
        this.c = false;
    }
}
