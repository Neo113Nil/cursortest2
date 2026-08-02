package xsna;

import com.vk.voip.userid.CallsUserId;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a59;
import xsna.a990;
import xsna.avw0;
import xsna.big;
import xsna.op90;
import xsna.rp90;

/* compiled from: VoipPastCallsReducer.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class yuw0 extends FunctionReferenceImpl implements izs<avw0.a, m59> {
    @Override // xsna.izs
    public final m59 invoke(avw0.a aVar) {
        op90.b.a.AbstractC3462a c3464b;
        hfz c3461a;
        avw0.a aVar2 = aVar;
        uuw0 uuw0Var = (uuw0) this.receiver;
        uuw0Var.getClass();
        ListBuilder e = e43.e();
        rp90 rp90Var = aVar2.b;
        a990<Long> a990Var = aVar2.c;
        LinkedHashMap linkedHashMap = rp90Var.d;
        List<a59> list = rp90Var.a;
        rp90.b bVar = rp90Var.f;
        if (bVar instanceof rp90.b.a) {
            c3464b = op90.b.a.AbstractC3462a.C3463a.a;
        } else if (bVar instanceof rp90.b.d) {
            c3464b = op90.b.a.AbstractC3462a.d.a;
        } else if (bVar instanceof rp90.b.c) {
            c3464b = op90.b.a.AbstractC3462a.c.a;
        } else {
            if (!(bVar instanceof rp90.b.C3620b)) {
                throw new NoWhenBranchMatchedException();
            }
            CallsUserId callsUserId = ((rp90.b.C3620b) bVar).a;
            w49 w49Var = (w49) linkedHashMap.get(callsUserId);
            if (w49Var == null) {
                throw new IllegalStateException("Group must exist in state: " + callsUserId);
            }
            c3464b = new op90.b.a.AbstractC3462a.C3464b(w49Var.a, w49Var.b);
        }
        e.add(new op90.b(new op90.b.a(!linkedHashMap.isEmpty(), c3464b), list.isEmpty()));
        List<a59> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (a59 a59Var : list2) {
            jp90 jp90Var = uuw0Var.a.a;
            if (a59Var instanceof a59.e) {
                a59.e eVar = (a59.e) a59Var;
                c3461a = new op90.a.b(jp90Var.a(rp90Var, a59Var), gp90.a(rp90Var, a59Var), lp90.a(rp90Var, a59Var), ip90.a(rp90Var, a59Var), eVar.a, eVar, uo90.a(rp90Var, a59Var));
            } else {
                if (!(a59Var instanceof a59.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                a59.c cVar = (a59.c) a59Var;
                c3461a = new op90.a.C3461a(jp90Var.a(rp90Var, a59Var), gp90.a(rp90Var, a59Var), lp90.a(rp90Var, a59Var), ip90.a(rp90Var, a59Var), cVar.a, cVar, cVar.c.size(), uo90.a(rp90Var, a59Var));
            }
            arrayList.add(c3461a);
        }
        e.addAll(arrayList);
        a990.a aVar3 = a990Var.c;
        if (aVar3 instanceof a990.a.b) {
            if (list.isEmpty()) {
                e.add(op90.c.b);
            }
        } else if (aVar3 instanceof a990.a.c) {
            e.add(big.d.b);
        } else {
            if (!(aVar3 instanceof a990.a.C2530a)) {
                throw new NoWhenBranchMatchedException();
            }
            e.add(new big.c(((a990.a.C2530a) aVar3).a));
        }
        return new m59(e.g(), a990Var.d instanceof a990.b.C2531b);
    }
}
