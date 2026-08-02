package xsna;

import java.util.List;
import xsna.ojm0;

/* compiled from: StoryTemplateViewState.kt */
/* loaded from: classes6.dex */
public final class sjm0 implements ao50 {
    public final fi50 a;

    /* compiled from: StoryTemplateViewState.kt */
    public static final class a implements fm50<ojm0> {
        public final yzt0<ojm0.b> a;
        public final yzt0<List<ejm0>> b;
        public final yzt0<Boolean> c;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
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
            return this.c.hashCode() + sr.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(showSkeleton=");
            sb.append(this.a);
            sb.append(", templatesItem=");
            sb.append(this.b);
            sb.append(", error=");
            return tr.c(sb, this.c, ')');
        }
    }

    public sjm0(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
