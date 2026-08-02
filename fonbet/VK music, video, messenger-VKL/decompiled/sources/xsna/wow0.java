package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.voip.ui.group_selector.VoipGroupSelectorConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.bpw0;
import xsna.cpw0;
import xsna.oow0;
import xsna.xow0;
import xsna.yow0;

/* compiled from: VoipGroupSelectorFeature.kt */
/* loaded from: classes7.dex */
public final class wow0 extends wk50<com.vk.voip.ui.group_selector.ui.b, cpw0, oow0, yow0> {
    public final VoipGroupSelectorConfig f;
    public final iq6 g;
    public final f4z<bpw0> h;
    public final f4z<xow0> i;

    public wow0(apw0 apw0Var, VoipGroupSelectorConfig voipGroupSelectorConfig, iq6 iq6Var) {
        super(oow0.b.b, apw0Var);
        this.f = voipGroupSelectorConfig;
        this.g = iq6Var;
        this.h = new f4z<>();
        this.i = new f4z<>();
    }

    @Override // xsna.wk50
    public final void N(cpw0 cpw0Var, oow0 oow0Var) {
        Object obj;
        cpw0 cpw0Var2 = cpw0Var;
        oow0 oow0Var2 = oow0Var;
        if (oow0Var2 instanceof oow0.b) {
            T(yow0.b.C4126b.b);
            int i = 13;
            a7f0.a.f(this, rsg0.w0(yfb.x(((vg20) this.g.b).c())).l(new hun0(new fxi0(i))).l(new uq80(new i9u0(this, 8), i)), new vow0(1, this, wow0.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0), new gqq0(this, 11), 1);
        } else if (oow0Var2 instanceof oow0.a) {
            if (!(((oow0.a) oow0Var2) instanceof oow0.a.C3458a)) {
                throw new NoWhenBranchMatchedException();
            }
            T(yow0.a.C4125a.b);
            s3q0 s3q0Var = s3q0.a;
        } else if (oow0Var2 instanceof oow0.f) {
            oow0.f fVar = (oow0.f) oow0Var2;
            if (cpw0Var2 instanceof cpw0.a) {
                if (fVar instanceof oow0.f.a) {
                    T(yow0.d.a.b);
                } else if (fVar instanceof oow0.f.b) {
                    T(yow0.d.b.b);
                } else {
                    if (!(fVar instanceof oow0.f.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Iterator<T> it = ((cpw0.a) cpw0Var2).b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (epx.f(((GroupsGroupFullDto) obj).P0(), ((oow0.f.c) fVar).b)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    GroupsGroupFullDto groupsGroupFullDto = (GroupsGroupFullDto) obj;
                    if (groupsGroupFullDto == null) {
                        throw new IllegalStateException("Selected group doesn't exist in state: " + fVar);
                    }
                    T(new yow0.d.c(groupsGroupFullDto));
                }
                s3q0 s3q0Var2 = s3q0.a;
            }
        } else if (oow0Var2 instanceof oow0.e) {
            oow0.e eVar = (oow0.e) oow0Var2;
            if (cpw0Var2 instanceof cpw0.a) {
                if (eVar instanceof oow0.e.c) {
                    T(yow0.c.C4130c.b);
                } else if (eVar instanceof oow0.e.a) {
                    T(yow0.c.a.b);
                } else {
                    if (!(eVar instanceof oow0.e.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String obj2 = drm0.p0(((oow0.e.b) eVar).b).toString();
                    List<GroupsGroupFullDto> list = ((cpw0.a) cpw0Var2).b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        GroupsGroupFullDto groupsGroupFullDto2 = (GroupsGroupFullDto) obj3;
                        String y1 = groupsGroupFullDto2.y1();
                        boolean z = false;
                        boolean z2 = y1 != null && drm0.D(y1, obj2, true);
                        String o2 = groupsGroupFullDto2.o2();
                        if (o2 != null && drm0.D(o2, obj2, true)) {
                            z = true;
                        }
                        if (z2 || z) {
                            arrayList.add(obj3);
                        }
                    }
                    T(new yow0.c.b(obj2, arrayList));
                }
                s3q0 s3q0Var3 = s3q0.a;
            }
        } else if (oow0Var2 instanceof oow0.d) {
            oow0.d dVar = (oow0.d) oow0Var2;
            if (cpw0Var2 instanceof cpw0.a) {
                if (!(dVar instanceof oow0.d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                cpw0.a.AbstractC2675a abstractC2675a = ((cpw0.a) cpw0Var2).c;
                boolean z3 = abstractC2675a instanceof cpw0.a.AbstractC2675a.C2676a;
                VoipGroupSelectorConfig voipGroupSelectorConfig = this.f;
                f4z<bpw0> f4zVar = this.h;
                if (z3) {
                    f4zVar.b(new bpw0.b(voipGroupSelectorConfig.b));
                } else if (abstractC2675a instanceof cpw0.a.AbstractC2675a.b) {
                    f4zVar.b(new bpw0.c(voipGroupSelectorConfig.b, ((cpw0.a.AbstractC2675a.b) abstractC2675a).a.P0()));
                } else {
                    f4zVar.b(new bpw0.a(voipGroupSelectorConfig.b));
                }
                s3q0 s3q0Var4 = s3q0.a;
            }
        } else {
            if (!(oow0Var2 instanceof oow0.c)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(((oow0.c) oow0Var2) instanceof oow0.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.i.b(xow0.a.a);
            s3q0 s3q0Var5 = s3q0.a;
        }
        s3q0 s3q0Var6 = s3q0.a;
    }
}
