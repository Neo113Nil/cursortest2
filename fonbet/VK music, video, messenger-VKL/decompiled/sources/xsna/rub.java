package xsna;

import android.view.MotionEvent;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.DialogExt;

/* compiled from: ChatPreviewViewAction.kt */
/* loaded from: classes18.dex */
public abstract class rub implements kj50 {

    /* compiled from: ChatPreviewViewAction.kt */
    public static final class a extends rub {
        public static final a b = new a();
    }

    /* compiled from: ChatPreviewViewAction.kt */
    public static final class b extends rub {
        public final DialogExt b;
        public final lse0 c;

        public b(DialogExt dialogExt, lse0 lse0Var) {
            this.b = dialogExt;
            this.c = lse0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "PreviewQuickAction(dialogExt=" + this.b + ", quickAction=" + this.c + ')';
        }
    }

    /* compiled from: ChatPreviewViewAction.kt */
    public static final class c extends rub {
        public final Peer b;
        public final io.reactivex.rxjava3.core.q<MotionEvent> c;

        public c(Peer peer, io.reactivex.rxjava3.core.q<MotionEvent> qVar) {
            this.b = peer;
            this.c = qVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Long.hashCode(this.b.b) * 31);
        }

        public final String toString() {
            return "PreviewRequest(peer=" + this.b + ", touchEvents=" + this.c + ')';
        }
    }
}
