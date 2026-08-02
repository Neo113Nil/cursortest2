package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.voip.ui.group_selector.VoipGroupSelectorConfig;
import com.vk.voip.ui.group_selector.ui.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cpw0;

/* compiled from: VoipGroupSelectorReducer.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class zow0 extends FunctionReferenceImpl implements izs<cpw0, b.a> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final b.a invoke(cpw0 cpw0Var) {
        EmptyList emptyList;
        b.a.f c2050b;
        cpw0 cpw0Var2 = cpw0Var;
        qow0 qow0Var = (qow0) this.receiver;
        VoipGroupSelectorConfig voipGroupSelectorConfig = qow0Var.a;
        boolean z = voipGroupSelectorConfig.f;
        boolean z2 = voipGroupSelectorConfig.g;
        if (cpw0Var2 instanceof cpw0.c) {
            return b.a.c.a;
        }
        if (cpw0Var2 instanceof cpw0.d) {
            return b.a.e.a;
        }
        if (cpw0Var2 instanceof cpw0.b) {
            return new b.a.C2046b(((cpw0.b) cpw0Var2).b);
        }
        if (!(cpw0Var2 instanceof cpw0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        cpw0.a aVar = (cpw0.a) cpw0Var2;
        cpw0.e eVar = aVar.d;
        cpw0.a.AbstractC2675a abstractC2675a = aVar.c;
        List<GroupsGroupFullDto> list = aVar.b;
        boolean z3 = eVar instanceof cpw0.e.a;
        if (z3) {
            if (list.isEmpty()) {
                emptyList = EmptyList.b;
            } else {
                ArrayList arrayList = new ArrayList();
                if (z2) {
                    arrayList.add(new b.a.d.C2047a(abstractC2675a == null));
                }
                if (z) {
                    arrayList.add(qow0Var.a(aVar));
                }
                g5g.y(qow0.b(aVar, list), arrayList);
                emptyList = arrayList;
            }
        } else {
            if (!(eVar instanceof cpw0.e.b)) {
                throw new NoWhenBranchMatchedException();
            }
            cpw0.e.b bVar = (cpw0.e.b) eVar;
            if (bVar.b.isEmpty()) {
                emptyList = EmptyList.b;
            } else {
                ArrayList arrayList2 = new ArrayList();
                boolean z4 = bVar.a.length() == 0;
                if (z4 && z2) {
                    arrayList2.add(new b.a.d.C2047a(abstractC2675a == null));
                }
                if (z4 && z) {
                    arrayList2.add(qow0Var.a(aVar));
                }
                g5g.y(qow0.b(aVar, bVar.b), arrayList2);
                emptyList = arrayList2;
            }
        }
        if (z3) {
            c2050b = b.a.f.C2049a.a;
        } else {
            if (!(eVar instanceof cpw0.e.b)) {
                throw new NoWhenBranchMatchedException();
            }
            c2050b = new b.a.f.C2050b(((cpw0.e.b) eVar).a);
        }
        return new b.a.g(emptyList, c2050b, new b.a.C2045a(abstractC2675a != null || z || z2));
    }
}
