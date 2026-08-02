package xsna;

import java.util.List;

/* compiled from: MessageViewsViewState.kt */
/* loaded from: classes2.dex */
public abstract class hd20 implements ao50 {

    /* compiled from: MessageViewsViewState.kt */
    public static final class a extends hd20 {
        public static final a a = new a();
    }

    /* compiled from: MessageViewsViewState.kt */
    public static final class b extends hd20 {
        public static final b a = new b();
    }

    /* compiled from: MessageViewsViewState.kt */
    public static final class c extends hd20 {
        public final int a;
        public final List<qtd0> b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(int i, List<? extends qtd0> list) {
            this.a = i;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MainState(totalCount=");
            sb.append(this.a);
            sb.append(", profiles=");
            return ms9.a(')', sb, this.b);
        }
    }
}
