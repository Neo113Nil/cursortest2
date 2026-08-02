package xsna;

import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import java.util.List;
import xsna.my;

/* compiled from: ActionButtonsViewState.kt */
/* loaded from: classes4.dex */
public interface ry<T extends my> extends fm50<T> {

    /* compiled from: ActionButtonsViewState.kt */
    public static final class a implements ry<Object> {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1890323263;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: ActionButtonsViewState.kt */
    public static final class b implements ry<my.a> {
        public final yzt0<List<xu>> a;
        public final yzt0<ActionButton> b;

        public b(h0u0 h0u0Var, h0u0 h0u0Var2) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
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
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Selection(actions=");
            sb.append(this.a);
            sb.append(", selectedAction=");
            return tr.c(sb, this.b, ')');
        }
    }
}
