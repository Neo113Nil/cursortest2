package xsna;

import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;
import xsna.hpb;

/* compiled from: ChatClipsTopBarDecorationViewState.kt */
/* loaded from: classes2.dex */
public final class npb implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    /* compiled from: ChatClipsTopBarDecorationViewState.kt */
    public static final class a implements fm50<hpb.a> {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -226045279;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: ChatClipsTopBarDecorationViewState.kt */
    public static final class b implements fm50<hpb.b> {
        public final yzt0<d> a;

        public b(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("Main(senderInfo="), this.a, ')');
        }
    }

    /* compiled from: ChatClipsTopBarDecorationViewState.kt */
    public static final class c implements fm50<hpb.c> {
        public final yzt0<DialogExt> a;

        public c(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("Recommendation(dialogExt="), this.a, ')');
        }
    }

    /* compiled from: ChatClipsTopBarDecorationViewState.kt */
    public static final class d {
        public final DialogExt a;
        public final Msg b;
        public final int c;

        public d(DialogExt dialogExt, Msg msg, int i) {
            this.a = dialogExt;
            this.b = msg;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && this.c == dVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + pn.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SenderInfo(dialog=");
            sb.append(this.a);
            sb.append(", msg=");
            sb.append(this.b);
            sb.append(", attachPosition=");
            return vu5.b(sb, this.c, ')');
        }
    }

    public npb(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }
}
