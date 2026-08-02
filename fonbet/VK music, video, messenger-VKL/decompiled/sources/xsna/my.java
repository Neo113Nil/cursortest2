package xsna;

import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import java.util.List;

/* compiled from: ActionButtonsState.kt */
/* loaded from: classes4.dex */
public interface my extends km50 {

    /* compiled from: ActionButtonsState.kt */
    public static final class a implements my {
        public final List<ActionButton> b;
        public final ActionButton c;
        public final hy d;

        public a(List<ActionButton> list, ActionButton actionButton, hy hyVar) {
            this.b = list;
            this.c = actionButton;
            this.d = hyVar;
        }

        public static a a(a aVar, ActionButton actionButton, hy hyVar, int i) {
            List<ActionButton> list = aVar.b;
            if ((i & 2) != 0) {
                actionButton = aVar.c;
            }
            if ((i & 4) != 0) {
                hyVar = aVar.d;
            }
            aVar.getClass();
            return new a(list, actionButton, hyVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            ActionButton actionButton = this.c;
            return Boolean.hashCode(this.d.a) + ((hashCode + (actionButton == null ? 0 : actionButton.hashCode())) * 31);
        }

        public final String toString() {
            return "Selection(actions=" + this.b + ", selected=" + this.c + ", hints=" + this.d + ')';
        }
    }
}
