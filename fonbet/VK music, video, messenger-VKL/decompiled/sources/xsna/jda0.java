package xsna;

import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: PhotoTagsViewState.kt */
/* loaded from: classes4.dex */
public final class jda0 implements ao50 {
    public final fi50 a;

    /* compiled from: PhotoTagsViewState.kt */
    public static final class a implements fm50<eda0> {
        public final yzt0<b> a;

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
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
            return tr.c(new StringBuilder("Data(tags="), this.a, ')');
        }
    }

    /* compiled from: PhotoTagsViewState.kt */
    public static final class b {
        public final List<tba0> a;
        public final Throwable b;

        public b(ListBuilder listBuilder, Throwable th) {
            this.a = listBuilder;
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            List<tba0> list = this.a;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            Throwable th = this.b;
            return hashCode + (th != null ? th.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ListState(items=");
            sb.append(this.a);
            sb.append(", error=");
            return oq.c(sb, this.b, ')');
        }
    }

    public jda0(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
