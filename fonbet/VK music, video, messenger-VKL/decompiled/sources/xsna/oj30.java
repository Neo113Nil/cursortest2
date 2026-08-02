package xsna;

import com.vk.im.engine.internal.merge.messages.WeightStrategy;
import com.vk.im.engine.models.messages.Msg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: MsgHistoryFromLocalMergeTask.kt */
/* loaded from: classes2.dex */
public final class oj30 extends b920 {
    public final List<Msg> c;
    public final WeightStrategy d;
    public final izs<List<? extends Msg>, s3q0> e;

    static {
        WeightStrategy weightStrategy = WeightStrategy.AUTO;
    }

    public oj30(List list, WeightStrategy weightStrategy, defpackage.h0 h0Var) {
        this.c = list;
        this.d = weightStrategy;
        this.e = h0Var;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((Msg) it.next()).Mb()) {
                    throw new IllegalArgumentException("Expecting all msg to be local. Given: " + this.c);
                }
            }
        }
        if (this.c.isEmpty()) {
            return;
        }
        long j = ((Msg) j5g.Y(this.c)).c;
        List<Msg> list3 = this.c;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            return;
        }
        Iterator<T> it2 = list3.iterator();
        while (it2.hasNext()) {
            if (((Msg) it2.next()).c != j) {
                throw new IllegalArgumentException("Expecting all msg belong the same dialog. Given: " + this.c);
            }
        }
    }

    @Override // xsna.b920
    public final Object o(w2w w2wVar) {
        List<Msg> list = this.c;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        return (List) w2wVar.I0().u(new wh9(this, w2wVar, j5g.D0(new nj30(0), list), 5));
    }

    public oj30(Msg msg, WeightStrategy weightStrategy) {
        this(Collections.singletonList(msg), weightStrategy, null);
    }
}
