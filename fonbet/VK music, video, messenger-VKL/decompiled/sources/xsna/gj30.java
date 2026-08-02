package xsna;

import android.util.ArraySet;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.messages.Msg;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* compiled from: MsgHistory.kt */
/* loaded from: classes2.dex */
public final class gj30 extends x7v<Msg, gj30> {
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    /* compiled from: MsgHistory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MsgIdType.values().length];
            try {
                iArr[MsgIdType.LOCAL_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MsgIdType.CNV_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public gj30() {
        this(0);
    }

    @Override // xsna.x7v
    public final boolean g() {
        return this.e;
    }

    @Override // xsna.x7v
    public final boolean h() {
        return this.d;
    }

    @Override // xsna.x7v
    public final boolean i() {
        return this.c;
    }

    @Override // xsna.x7v
    public final boolean j() {
        return this.b;
    }

    public final boolean r(MsgIdType msgIdType, int i) {
        int i2 = a.$EnumSwitchMapping$0[msgIdType.ordinal()];
        if (i2 == 1) {
            List<Msg> k = k();
            if ((k instanceof Collection) && k.isEmpty()) {
                return false;
            }
            Iterator<T> it = k.iterator();
            while (it.hasNext()) {
                if (((Msg) it.next()).b == i) {
                }
            }
            return false;
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        List<Msg> k2 = k();
        if ((k2 instanceof Collection) && k2.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = k2.iterator();
        while (it2.hasNext()) {
            if (((Msg) it2.next()).d == i) {
            }
        }
        return false;
        return true;
    }

    public final boolean s(int i) {
        if (!k().isEmpty()) {
            Msg msg = (Msg) j5g.a0(k());
            int i2 = msg != null ? msg.d : 0;
            Msg msg2 = (Msg) j5g.k0(k());
            int i3 = msg2 != null ? msg2.d : 0;
            if (i2 <= i && i <= i3) {
                return true;
            }
        }
        return false;
    }

    public final int t(int i) {
        if (k().isEmpty()) {
            return -1;
        }
        int size = k().size();
        for (int i2 = 0; i2 < size; i2++) {
            gtx0 gtx0Var = (Msg) k().get(i2);
            if ((gtx0Var instanceof com.vk.im.engine.models.messages.a) && ((com.vk.im.engine.models.messages.a) gtx0Var).vb(i)) {
                return i2;
            }
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgHistory{firstWeight=");
        Msg msg = (Msg) j5g.a0(k());
        sb.append(msg != null ? msg.p : null);
        sb.append(", lastWeight=");
        Msg msg2 = (Msg) j5g.k0(k());
        sb.append(msg2 != null ? msg2.p : null);
        sb.append(", expired=");
        sb.append(d());
        sb.append(", hasHistoryBeforeCached=");
        sb.append(this.b);
        sb.append(", hasHistoryBefore=");
        sb.append(this.c);
        sb.append(", hasHistoryAfterCached=");
        sb.append(this.d);
        sb.append(", hasHistoryAfter=");
        sb.append(this.e);
        sb.append(", size=");
        sb.append(size());
        sb.append('}');
        return sb.toString();
    }

    public final void u(Msg msg) {
        Iterator<Number> it = d().iterator();
        while (it.hasNext()) {
            Number next = it.next();
            int i = msg.b;
            if ((next instanceof Integer) && i == next.intValue()) {
                it.remove();
            }
        }
        Iterator<Msg> it2 = k().iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i2 = -1;
                break;
            } else if (it2.next().b == msg.b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            k().set(i2, msg);
        }
    }

    public gj30(Iterable<? extends Msg> iterable, Set<? extends Number> set, boolean z, boolean z2, boolean z3, boolean z4) {
        super(j5g.Q(iterable), z2, z, z4, z3);
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        g5g.y(iterable, k());
        d().addAll(set);
    }

    public gj30(gj30 gj30Var) {
        this(gj30Var.k(), gj30Var.d(), gj30Var.b, gj30Var.c, gj30Var.d, gj30Var.e);
        k().clear();
        d().clear();
        this.c = false;
        this.b = false;
        this.e = false;
        this.d = false;
        k().addAll(gj30Var.k());
        d().addAll((ArraySet<? extends Number>) gj30Var.d());
        this.e = gj30Var.e;
        this.d = gj30Var.d;
        this.c = gj30Var.c;
        this.b = gj30Var.b;
    }

    public gj30(int i) {
        this(EmptyList.b, EmptySet.b, false, false, false, false);
    }
}
