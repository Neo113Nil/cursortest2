package xsna;

import com.ironsource.X3;
import kotlin.jvm.internal.Lambda;
import xsna.q630;

/* compiled from: Modifier.kt */
/* loaded from: classes11.dex */
public final class bag implements q630 {
    public final q630 a;
    public final q630 b;

    /* compiled from: Modifier.kt */
    public static final class a extends Lambda implements wzs<String, q630.b, String> {
        public static final a i = new a(2);

        @Override // xsna.wzs
        public final String invoke(String str, q630.b bVar) {
            String str2 = str;
            q630.b bVar2 = bVar;
            if (str2.length() == 0) {
                return bVar2.toString();
            }
            return str2 + ", " + bVar2;
        }
    }

    public bag(q630 q630Var, q630 q630Var2) {
        this.a = q630Var;
        this.b = q630Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.q630
    public final <R> R a(R r, wzs<? super R, ? super q630.b, ? extends R> wzsVar) {
        return (R) this.b.a(this.a.a(r, wzsVar), wzsVar);
    }

    @Override // xsna.q630
    public final boolean b(izs<? super q630.b, Boolean> izsVar) {
        return this.a.b(izsVar) && this.b.b(izsVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bag)) {
            return false;
        }
        bag bagVar = (bag) obj;
        return epx.f(this.a, bagVar.a) && epx.f(this.b, bagVar.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder(X3.j.d), (String) a("", a.i), ']');
    }
}
