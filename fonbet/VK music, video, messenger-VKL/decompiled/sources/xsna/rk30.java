package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.mk30;
import xsna.nsr0;

/* compiled from: MsgListAnimationDefault.kt */
/* loaded from: classes2.dex */
public final class rk30 extends androidx.recyclerview.widget.g {
    public static final int t = cn70.b(12);
    public static final List<Integer> u = e43.l(2, Integer.valueOf(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED));

    /* compiled from: MsgListAnimationDefault.kt */
    public interface a {
        Integer N4();

        boolean Z4();

        int b3();

        AdapterEntryType c2();

        AdapterEntryType c5();

        boolean q4();
    }

    public rk30() {
        this.c = 50L;
        this.d = 50L;
        this.f = 50L;
        this.e = 50L;
        this.g = false;
    }

    public static boolean H(RecyclerView.e0 e0Var) {
        if (e0Var != null && e0Var.getItemViewType() == AdapterEntryType.TYPE_REACTIONS.h()) {
            return true;
        }
        if (e0Var == null || e0Var.getItemViewType() != AdapterEntryType.TYPE_FWD_TIME.h()) {
            return e0Var != null && e0Var.getItemViewType() == AdapterEntryType.TYPE_VIEWS_AND_TIME.h();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.n0, androidx.recyclerview.widget.RecyclerView.l
    public final boolean b(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        if (cVar instanceof mk30.a) {
            h(e0Var2);
            return false;
        }
        boolean z = cVar instanceof mk30.c;
        int i = t;
        if (z && (H(e0Var2) || (e0Var2 != 0 && e0Var2.getItemViewType() == AdapterEntryType.TYPE_AUDIOMSG_TRANSCRIPT.h()))) {
            a aVar = e0Var2 instanceof a ? (a) e0Var2 : null;
            if (aVar != null ? aVar.q4() : false) {
                return x(e0Var, e0Var2, cVar.a, cVar.b, cVar2.a, cVar2.b + i);
            }
        }
        if (cVar instanceof mk30.b) {
            int itemViewType = e0Var2.getItemViewType();
            AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_AUDIOMSG;
            boolean z2 = true;
            if (itemViewType == adapterEntryType.h()) {
                boolean z3 = e0Var2 instanceof a;
                a aVar2 = z3 ? (a) e0Var2 : null;
                AdapterEntryType c5 = aVar2 != null ? aVar2.c5() : null;
                if (c5 == null || c5.h() != adapterEntryType.h()) {
                    a aVar3 = z3 ? (a) e0Var2 : null;
                    AdapterEntryType c52 = aVar3 != null ? aVar3.c5() : null;
                    if (c52 == null || c52.h() != AdapterEntryType.TYPE_AUDIOMSG_TRANSCRIPT.h()) {
                        z2 = false;
                    }
                }
                if (z2) {
                    a aVar4 = z3 ? (a) e0Var2 : null;
                    if (aVar4 != null ? aVar4.Z4() : false) {
                        return x(e0Var, e0Var2, cVar.a, cVar.b, cVar2.a, cVar2.b + i);
                    }
                }
            }
        }
        return super.b(e0Var, e0Var2, cVar, cVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final RecyclerView.l.c q(RecyclerView.a0 a0Var, RecyclerView.e0 e0Var, int i, List<Object> list) {
        Object obj;
        if (!u.contains(Integer.valueOf(i))) {
            return super.q(a0Var, e0Var, i, list);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!(next instanceof Iterable)) {
                next = Collections.singletonList(next);
            }
            g5g.y((Iterable) next, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (next2 instanceof nsr0.a.C3411a) {
                arrayList2.add(next2);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            obj = it3.next();
            int r0 = ((nsr0.a.C3411a) obj).a.r0();
            a aVar = e0Var instanceof a ? (a) e0Var : null;
            Integer N4 = aVar != null ? aVar.N4() : null;
            if (N4 != null && r0 == N4.intValue()) {
                break;
            }
        }
        nsr0.a.C3411a c3411a = (nsr0.a.C3411a) obj;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f fVar = c3411a != null ? c3411a.a : null;
        if (fVar == null) {
            return super.q(a0Var, e0Var, i, list);
        }
        boolean z = e0Var instanceof a;
        a aVar2 = z ? (a) e0Var : null;
        if ((aVar2 != null ? aVar2.b3() : 0) != fVar.c()) {
            mk30.a aVar3 = mk30.a.c;
            aVar3.a(e0Var);
            return aVar3;
        }
        a aVar4 = z ? (a) e0Var : null;
        AdapterEntryType c2 = aVar4 != null ? aVar4.c2() : null;
        utr0 utr0Var = fVar.o;
        if (c2 != (utr0Var != null ? utr0Var.b : null)) {
            mk30.c cVar = mk30.c.c;
            cVar.a(e0Var);
            return cVar;
        }
        a aVar5 = z ? (a) e0Var : null;
        AdapterEntryType c5 = aVar5 != null ? aVar5.c5() : null;
        utr0 utr0Var2 = fVar.p;
        if (c5 == (utr0Var2 != null ? utr0Var2.b : null)) {
            return super.q(a0Var, e0Var, i, list);
        }
        mk30.b bVar = mk30.b.c;
        bVar.a(e0Var);
        return bVar;
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.n0
    public final boolean w(RecyclerView.e0 e0Var) {
        if (H(e0Var) || e0Var.getItemViewType() == AdapterEntryType.TYPE_AUDIOMSG_TRANSCRIPT.h()) {
            h(e0Var);
            return false;
        }
        super.w(e0Var);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (r0.h() == r1.h()) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean z(RecyclerView.e0 e0Var) {
        int itemViewType = e0Var.getItemViewType();
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_AUDIOMSG_TRANSCRIPT;
        if (itemViewType == adapterEntryType.h()) {
            return y(e0Var, (int) e0Var.itemView.getX(), (int) e0Var.itemView.getY(), (int) e0Var.itemView.getX(), ((int) e0Var.itemView.getY()) + t);
        }
        if (H(e0Var)) {
            boolean z = e0Var instanceof a;
            a aVar = z ? (a) e0Var : null;
            AdapterEntryType c2 = aVar != null ? aVar.c2() : null;
            if (c2 == null || c2.h() != AdapterEntryType.TYPE_AUDIOMSG.h()) {
                a aVar2 = z ? (a) e0Var : null;
                AdapterEntryType c22 = aVar2 != null ? aVar2.c2() : null;
                if (c22 != null) {
                }
            }
            A(e0Var);
            return false;
        }
        super.z(e0Var);
        return true;
    }
}
