package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.voip.ui.change_name.VoipChangeNameConfig;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.amw0;
import xsna.emw0;

/* compiled from: VoipChangeNameReducer.kt */
/* loaded from: classes7.dex */
public final class cmw0 extends dm50<imw0, amw0, emw0> {
    public final jmw0 d;

    public cmw0(VoipChangeNameConfig voipChangeNameConfig) {
        super(emw0.c.b);
        this.d = new jmw0(voipChangeNameConfig);
    }

    public static emw0.a.b i(amw0.a.c cVar) {
        if (cVar instanceof amw0.a.c.C2553c) {
            return new emw0.a.b.c(((amw0.a.c.C2553c) cVar).a);
        }
        if (cVar instanceof amw0.a.c.b) {
            return emw0.a.b.C2825b.a;
        }
        if (cVar instanceof amw0.a.c.C2552a) {
            return emw0.a.b.C2824a.a;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r10 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        r6 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        if (r10 != null) goto L19;
     */
    @Override // xsna.dm50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final emw0 c(emw0 emw0Var, amw0 amw0Var) {
        String str;
        String str2;
        emw0 emw0Var2 = emw0Var;
        amw0 amw0Var2 = amw0Var;
        String str3 = "";
        if (amw0Var2 instanceof amw0.a) {
            amw0.a aVar = (amw0.a) amw0Var2;
            if (aVar instanceof amw0.a.d) {
                return emw0.c.b;
            }
            if (aVar instanceof amw0.a.C2551a) {
                return new emw0.b(((amw0.a.C2551a) aVar).b);
            }
            if (!(aVar instanceof amw0.a.e)) {
                throw new NoWhenBranchMatchedException();
            }
            amw0.a.e eVar = (amw0.a.e) aVar;
            amw0.a.c cVar = eVar.c;
            List<GroupsGroupFullDto> list = eVar.b;
            emw0.a.b i = i(cVar);
            boolean z = cVar instanceof amw0.a.c.C2553c;
            if (z) {
                str = ((amw0.a.c.C2553c) cVar).a.y1();
            } else {
                if (cVar instanceof amw0.a.c.b) {
                    str3 = ((amw0.a.c.b) cVar).a;
                } else if (cVar instanceof amw0.a.c.C2552a) {
                    str = ((amw0.a.c.C2552a) cVar).a;
                }
                str2 = str3;
            }
            return new emw0.a(list, i, eVar.d, str2, !z);
        }
        if (amw0Var2 instanceof amw0.a.b) {
            amw0.a.b bVar = (amw0.a.b) amw0Var2;
            return new emw0.a(EmptyList.b, i(bVar.d), bVar.b, bVar.c, true);
        }
        if (amw0Var2 instanceof amw0.c) {
            amw0.c cVar2 = (amw0.c) amw0Var2;
            if (emw0Var2 instanceof emw0.a) {
                if (cVar2 instanceof amw0.c.b) {
                    return emw0.a.a((emw0.a) emw0Var2, emw0.a.b.C2825b.a, ((amw0.c.b) cVar2).b, true, false, null, 101);
                }
                if (!(cVar2 instanceof amw0.c.C2555c)) {
                    if (cVar2 instanceof amw0.c.a) {
                        return emw0.a.a((emw0.a) emw0Var2, emw0.a.b.C2824a.a, ((amw0.c.a) cVar2).b, true, false, null, 101);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                emw0.a aVar2 = (emw0.a) emw0Var2;
                GroupsGroupFullDto groupsGroupFullDto = ((amw0.c.C2555c) cVar2).b;
                emw0.a.b.c cVar3 = new emw0.a.b.c(groupsGroupFullDto);
                String y1 = groupsGroupFullDto.y1();
                return emw0.a.a(aVar2, cVar3, y1 == null ? "" : y1, false, false, null, 101);
            }
        } else if (amw0Var2 instanceof amw0.d) {
            amw0.d dVar = (amw0.d) amw0Var2;
            if (emw0Var2 instanceof emw0.a) {
                return emw0.a.a((emw0.a) emw0Var2, null, dVar.b, false, false, emw0.a.AbstractC2822a.C2823a.a, 55);
            }
        } else if (amw0Var2 instanceof amw0.b.C2554b) {
            amw0.b.C2554b c2554b = (amw0.b.C2554b) amw0Var2;
            if (emw0Var2 instanceof emw0.a) {
                return emw0.a.a((emw0.a) emw0Var2, null, null, false, c2554b.b, null, 95);
            }
        } else if (amw0Var2 instanceof amw0.b.c) {
            if (emw0Var2 instanceof emw0.a) {
                return emw0.a.a((emw0.a) emw0Var2, null, null, false, false, emw0.a.AbstractC2822a.b.a, 63);
            }
        } else {
            if (!(amw0Var2 instanceof amw0.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (emw0Var2 instanceof emw0.a) {
                return emw0.a.a((emw0.a) emw0Var2, null, null, false, false, emw0.a.AbstractC2822a.C2823a.a, 63);
            }
        }
        return emw0Var2;
    }

    @Override // xsna.dm50
    public final imw0 d() {
        return new imw0(e(new kyq0(this, 13)));
    }

    @Override // xsna.dm50
    public final void h(emw0 emw0Var, imw0 imw0Var) {
        f(imw0Var.a, emw0Var);
    }
}
