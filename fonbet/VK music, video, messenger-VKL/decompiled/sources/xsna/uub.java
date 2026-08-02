package xsna;

import com.vk.im.engine.models.dialogs.DialogExt;

/* compiled from: ChatPreviewViewEvent.kt */
/* loaded from: classes18.dex */
public abstract class uub implements yn50 {

    /* compiled from: ChatPreviewViewEvent.kt */
    public static final class a extends uub {
        public final DialogExt a;
        public final u8m b;

        public a(DialogExt dialogExt, u8m u8mVar) {
            this.a = dialogExt;
            this.b = u8mVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OnDialogActionChoose(dialogExt=" + this.a + ", dialogAction=" + this.b + ')';
        }
    }
}
