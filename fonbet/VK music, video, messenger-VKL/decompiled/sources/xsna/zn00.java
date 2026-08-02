package xsna;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: MarkReactionsAsReadCmd.kt */
/* loaded from: classes2.dex */
public final class zn00 extends iuz {
    public final long b;
    public final List<Integer> c;

    public zn00(long j, List<Integer> list) {
        this.b = j;
        this.c = list;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-reactions-read-changes-local";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn00)) {
            return false;
        }
        zn00 zn00Var = (zn00) obj;
        return this.b == zn00Var.b && epx.f(this.c, zn00Var.c);
    }

    @Override // xsna.iuz
    public final long h() {
        return this.b;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    @Override // xsna.iuz
    public final void i(w2w w2wVar) {
        Set R0 = j5g.R0(this.c);
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        w2wVar.O0().l(new jbo(this, R0, ref$BooleanRef, 3));
        if (ref$BooleanRef.element) {
            return;
        }
        w2wVar.O0().a(new yn00(R0, this.b));
    }

    @Override // xsna.iuz
    public final boolean j(w2w w2wVar) {
        xgl0 I0 = w2wVar.I0();
        final long j = this.b;
        final List<Integer> list = this.c;
        return ((Boolean) I0.u(new izs() { // from class: xsna.f6f0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                boolean z;
                hpm e = ((xgl0) obj).b().e();
                long j2 = j;
                com.vk.im.engine.models.dialogs.b c = e.c(j2);
                if (c != null) {
                    List list2 = list;
                    List list3 = list2;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            if (!c.V.contains(Integer.valueOf(((Number) it.next()).intValue()))) {
                                e.c.a(Long.valueOf(j2), new mom(list2, 0), new yte(1, e, hpm.class, "updateLocallyReadReactions", "updateLocallyReadReactions(Lcom/vk/im/engine/models/dialogs/DialogStorageModel;)V", 0, 4));
                                z = true;
                                break;
                            }
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            }
        })).booleanValue();
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("MarkReactionsAsReadCmd(dialogId=");
        sb.append(this.b);
        sb.append(", cnvIds=");
        return ms9.a(')', sb, this.c);
    }
}
