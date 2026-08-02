package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.managed_groups.ManagedGroupsCounters;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: GetManagedGroupsCountersCmd.kt */
/* loaded from: classes2.dex */
public final class nst extends le6<ManagedGroupsCounters> {
    public final Source b;
    public final boolean c = true;

    /* compiled from: GetManagedGroupsCountersCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.NETWORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.ACTUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public nst(Source source) {
        this.b = source;
    }

    public static ManagedGroupsCounters f(w2w w2wVar) {
        di00 count = w2wVar.I0().l().getCount();
        di00 f = w2wVar.I0().l().f();
        di00 c = w2wVar.I0().l().c();
        if (count == null && f == null && c == null) {
            ManagedGroupsCounters.e.getClass();
            return ManagedGroupsCounters.g;
        }
        int b = w2wVar.I0().system().b();
        boolean z = false;
        xpp xppVar = new xpp(Integer.valueOf(count != null ? count.a : 0), !(count != null && count.b == b));
        xpp xppVar2 = new xpp(Integer.valueOf(f != null ? f.a : 0), !(f != null && f.b == b));
        Integer valueOf = Integer.valueOf(c != null ? c.a : 0);
        if (c != null && c.b == b) {
            z = true;
        }
        return new ManagedGroupsCounters(xppVar, xppVar2, new xpp(valueOf, !z));
    }

    @Override // xsna.le6
    public final ManagedGroupsCounters e(w2w w2wVar) {
        ManagedGroupsCounters f;
        boolean a2 = w2wVar.I0().l().a();
        int i = a.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i == 1) {
            f = f(w2wVar);
        } else if (i == 2) {
            f = g(w2wVar);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f = f(w2wVar);
            Collection values = f.d.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    if (!((xpp) it.next()).b()) {
                        break;
                    }
                }
            }
            f = g(w2wVar);
        }
        if (!(!a2)) {
            return f;
        }
        ManagedGroupsCounters.b bVar = f.a;
        qcy<Object>[] qcyVarArr = ManagedGroupsCounters.f;
        qcy<Object> qcyVar = qcyVarArr[0];
        xpp a3 = bVar.a();
        ManagedGroupsCounters.b bVar2 = f.b;
        qcy<Object> qcyVar2 = qcyVarArr[1];
        return new ManagedGroupsCounters(a3, bVar2.a(), new xpp(0, false));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nst)) {
            return false;
        }
        nst nstVar = (nst) obj;
        return this.b == nstVar.b && this.c == nstVar.c;
    }

    public final ManagedGroupsCounters g(w2w w2wVar) {
        fi00 fi00Var = (fi00) bz2.c(new zi00(this.c), null);
        int b = w2wVar.I0().system().b();
        w2wVar.I0().l().h(new di00(fi00Var.a, b));
        xi00 l = w2wVar.I0().l();
        int i = fi00Var.b;
        l.i(new di00(i, b));
        xi00 l2 = w2wVar.I0().l();
        int i2 = fi00Var.c;
        l2.j(new di00(i2, b));
        w2wVar.e1(this, new f780(this));
        return new ManagedGroupsCounters(new xpp(Integer.valueOf(fi00Var.a), false), new xpp(Integer.valueOf(i), false), new xpp(Integer.valueOf(i2), false));
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("GetManagedGroupsCountersCmd(source=");
        sb.append(this.b);
        sb.append(", isAwaitNetwork=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
