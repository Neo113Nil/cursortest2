package xsna;

import androidx.recyclerview.widget.RecyclerView;
import xsna.dnt0;

/* compiled from: VideoPresenterExt.kt */
/* loaded from: classes17.dex */
public interface lnt0 extends dnt0.a {

    /* compiled from: VideoPresenterExt.kt */
    public static final class a {
        public final yg5 a;
        public final int b;

        public a(yg5 yg5Var, int i) {
            this.a = yg5Var;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AutoPlayInfo(autoPlay=");
            sb.append(this.a);
            sb.append(", index=");
            return vu5.b(sb, this.b, ')');
        }
    }

    RecyclerView getRecyclerView();

    xh5 i();

    a y4();
}
