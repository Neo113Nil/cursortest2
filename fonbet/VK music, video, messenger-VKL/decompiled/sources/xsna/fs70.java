package xsna;

import com.vk.ecomm.verifiedseller.impl.screens.obtainverification.model.ObtainVerificationScreenContent;

/* compiled from: ObtainVerificationRender.kt */
/* loaded from: classes18.dex */
public interface fs70 extends fm50<bs70> {

    /* compiled from: ObtainVerificationRender.kt */
    public static final class a implements fs70 {
        public static final a a = new a();
    }

    /* compiled from: ObtainVerificationRender.kt */
    public static final class b implements fs70 {
        public final yzt0<Throwable> a;
        public final yzt0<Boolean> b;
        public final yzt0<ObtainVerificationScreenContent> c;

        public b(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
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
            return this.c.hashCode() + sr.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Main(error=");
            sb.append(this.a);
            sb.append(", isLoading=");
            sb.append(this.b);
            sb.append(", content=");
            return tr.c(sb, this.c, ')');
        }
    }
}
