package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.voip.ui.group_selector.VoipGroupSelectorConfig;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.cpw0;
import xsna.yow0;

/* compiled from: VoipGroupSelectorReducer.kt */
/* loaded from: classes7.dex */
public final class apw0 extends dm50<com.vk.voip.ui.group_selector.ui.b, yow0, cpw0> {
    public final qow0 d;

    public apw0(VoipGroupSelectorConfig voipGroupSelectorConfig, b25 b25Var) {
        super(cpw0.d.b);
        this.d = new qow0(voipGroupSelectorConfig, b25Var);
    }

    @Override // xsna.dm50
    public final cpw0 c(cpw0 cpw0Var, yow0 yow0Var) {
        cpw0 cpw0Var2 = cpw0Var;
        yow0 yow0Var2 = yow0Var;
        cpw0.a.AbstractC2675a abstractC2675a = null;
        if (yow0Var2 instanceof yow0.b) {
            yow0.b bVar = (yow0.b) yow0Var2;
            if (bVar instanceof yow0.b.C4126b) {
                return cpw0.d.b;
            }
            if (bVar instanceof yow0.b.a) {
                return new cpw0.b(((yow0.b.a) bVar).b);
            }
            if (!(bVar instanceof yow0.b.c)) {
                throw new NoWhenBranchMatchedException();
            }
            yow0.b.c cVar = (yow0.b.c) bVar;
            List<GroupsGroupFullDto> list = cVar.b;
            yow0.b.c.a aVar = cVar.c;
            if (aVar instanceof yow0.b.c.a.C4129c) {
                abstractC2675a = new cpw0.a.AbstractC2675a.b(((yow0.b.c.a.C4129c) aVar).a);
            } else if (aVar instanceof yow0.b.c.a.C4128b) {
                abstractC2675a = cpw0.a.AbstractC2675a.C2676a.a;
            }
            return new cpw0.a(list, abstractC2675a, cpw0.e.a.a);
        }
        if (yow0Var2 instanceof yow0.a) {
            if (epx.f((yow0.a) yow0Var2, yow0.a.C4125a.b)) {
                return cpw0.c.b;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (yow0Var2 instanceof yow0.d) {
            yow0.d dVar = (yow0.d) yow0Var2;
            if (cpw0Var2 instanceof cpw0.a) {
                if (dVar instanceof yow0.d.a) {
                    return cpw0.a.a((cpw0.a) cpw0Var2, null, null, 5);
                }
                if (dVar instanceof yow0.d.b) {
                    return cpw0.a.a((cpw0.a) cpw0Var2, cpw0.a.AbstractC2675a.C2676a.a, null, 5);
                }
                if (dVar instanceof yow0.d.c) {
                    return cpw0.a.a((cpw0.a) cpw0Var2, new cpw0.a.AbstractC2675a.b(((yow0.d.c) dVar).b), null, 5);
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (!(yow0Var2 instanceof yow0.c)) {
                throw new NoWhenBranchMatchedException();
            }
            yow0.c cVar2 = (yow0.c) yow0Var2;
            if (cpw0Var2 instanceof cpw0.a) {
                if (cVar2 instanceof yow0.c.C4130c) {
                    cpw0.a aVar2 = (cpw0.a) cpw0Var2;
                    return cpw0.a.a(aVar2, null, new cpw0.e.b("", aVar2.b), 3);
                }
                if (cVar2 instanceof yow0.c.a) {
                    return cpw0.a.a((cpw0.a) cpw0Var2, null, cpw0.e.a.a, 3);
                }
                if (!(cVar2 instanceof yow0.c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                yow0.c.b bVar2 = (yow0.c.b) cVar2;
                return cpw0.a.a((cpw0.a) cpw0Var2, null, new cpw0.e.b(bVar2.b, bVar2.c), 3);
            }
        }
        return cpw0Var2;
    }

    @Override // xsna.dm50
    public final com.vk.voip.ui.group_selector.ui.b d() {
        return new com.vk.voip.ui.group_selector.ui.b(e(new u5p0(this, 21)));
    }

    @Override // xsna.dm50
    public final void h(cpw0 cpw0Var, com.vk.voip.ui.group_selector.ui.b bVar) {
        f(bVar.a, cpw0Var);
    }
}
