package xsna;

import com.vk.im.engine.models.messages.Msg;
import java.util.Collection;

/* compiled from: MessagesDeleteMergeTaskLogic.kt */
/* loaded from: classes2.dex */
public final class zd20<Args> {
    public final Args a;
    public final ae20<Args> b;
    public final boolean c;
    public final boolean d;

    /* compiled from: MessagesDeleteMergeTaskLogic.kt */
    public static final class a {
        public final lj30 a;
        public final lj30 b;
        public final lj30 c;

        public a(lj30 lj30Var, lj30 lj30Var2, lj30 lj30Var3) {
            this.a = lj30Var;
            this.b = lj30Var2;
            this.c = lj30Var3;
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
            lj30 lj30Var = this.a;
            int hashCode = (lj30Var == null ? 0 : lj30Var.hashCode()) * 31;
            lj30 lj30Var2 = this.b;
            int hashCode2 = (hashCode + (lj30Var2 == null ? 0 : lj30Var2.hashCode())) * 31;
            lj30 lj30Var3 = this.c;
            return hashCode2 + (lj30Var3 != null ? lj30Var3.hashCode() : 0);
        }

        public final String toString() {
            return "HistoryEntryInfo(exact=" + this.a + ", before=" + this.b + ", after=" + this.c + ')';
        }
    }

    public zd20(Args args, ae20<Args> ae20Var, boolean z, boolean z2) {
        this.a = args;
        this.b = ae20Var;
        this.c = z;
        this.d = z2;
    }

    public final Collection<Msg> a(w2w w2wVar) {
        return (Collection) w2wVar.I0().u(new xgv(this, 12));
    }

    public final a b(Args args, gkx0 gkx0Var) {
        ae20<Args> ae20Var = this.b;
        lj30 e = ae20Var.e(args, gkx0Var);
        uz50<lj30> o = ae20Var.o(args, gkx0Var);
        return new a(e, o.a, o.b);
    }
}
