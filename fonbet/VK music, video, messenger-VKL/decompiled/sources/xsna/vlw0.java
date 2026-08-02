package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.voip.ui.change_name.VoipChangeNameConfig;
import com.vk.voip.ui.change_name.ui.result.VoipChangeNameResult;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.a7f0;
import xsna.amw0;
import xsna.dmw0;
import xsna.emw0;
import xsna.tlw0;
import xsna.zlw0;

/* compiled from: VoipChangeNameFeature.kt */
/* loaded from: classes7.dex */
public final class vlw0 extends wk50<imw0, emw0, tlw0, amw0> {
    public final VoipChangeNameConfig f;
    public final iq6 g;
    public final jsa h;
    public final j79 i;
    public final fhw0 j;
    public final f4z<dmw0> k;
    public final f4z<zlw0> l;
    public final f4z<fmw0> m;

    public vlw0(cmw0 cmw0Var, VoipChangeNameConfig voipChangeNameConfig, iq6 iq6Var, jsa jsaVar, j79 j79Var, fhw0 fhw0Var) {
        super(tlw0.b.b, cmw0Var);
        this.f = voipChangeNameConfig;
        this.g = iq6Var;
        this.h = jsaVar;
        this.i = j79Var;
        this.j = fhw0Var;
        this.k = new f4z<>();
        this.l = new f4z<>();
        this.m = new f4z<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ba, code lost:
    
        if (r3 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bd, code lost:
    
        r9 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ea, code lost:
    
        if (r3 == null) goto L44;
     */
    @Override // xsna.wk50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(emw0 emw0Var, tlw0 tlw0Var) {
        String str;
        String str2;
        emw0 emw0Var2 = emw0Var;
        tlw0 tlw0Var2 = tlw0Var;
        boolean z = tlw0Var2 instanceof tlw0.b;
        int i = 1;
        Object obj = null;
        VoipChangeNameConfig voipChangeNameConfig = this.f;
        jsa jsaVar = this.h;
        str = "";
        if (z) {
            fhw0 fhw0Var = this.j;
            int i2 = 13;
            if (!fhw0Var.isInitialized()) {
                io.reactivex.rxjava3.kotlin.c.d(fhw0Var.a(), new hsv0(this, 4), new lw3(L.a, 13));
            } else if (voipChangeNameConfig.e) {
                T(amw0.a.d.b);
                a7f0.a.f(this, rsg0.w0(yfb.x(((vg20) this.g.b).c())).l(new hun0(new fxi0(i2))).l(new h8e0(new egt0(this, 10), 6)), new s55(1, this, vlw0.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 17), new kfw0(this, 2), 1);
            } else {
                cn o = o25.a().o();
                VoipChangeNameConfig.PreselectedUser preselectedUser = voipChangeNameConfig.d;
                VoipChangeNameConfig.OpenedFrom openedFrom = voipChangeNameConfig.i;
                if (preselectedUser instanceof VoipChangeNameConfig.PreselectedUser.User) {
                    String a = jsaVar.a();
                    if (a == null) {
                        a = o25.a().o().b;
                    }
                    str = a;
                    if (!(openedFrom instanceof VoipChangeNameConfig.OpenedFrom.JoinScreen)) {
                        if (!(openedFrom instanceof VoipChangeNameConfig.OpenedFrom.ActiveCall)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str2 = ((VoipChangeNameConfig.OpenedFrom.ActiveCall) openedFrom).b;
                    }
                    T(new amw0.a.b(o, str, U(EmptyList.b)));
                } else {
                    if (preselectedUser instanceof VoipChangeNameConfig.PreselectedUser.Anonym) {
                        String str3 = ((VoipChangeNameConfig.PreselectedUser.Anonym) preselectedUser).b;
                        str = (str3 == null && (str3 = jsaVar.b.c().getString("anonym_name", null)) == null) ? "" : str3;
                        if (!(openedFrom instanceof VoipChangeNameConfig.OpenedFrom.JoinScreen)) {
                            if (!(openedFrom instanceof VoipChangeNameConfig.OpenedFrom.ActiveCall)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str2 = ((VoipChangeNameConfig.OpenedFrom.ActiveCall) openedFrom).b;
                        }
                    }
                    T(new amw0.a.b(o, str, U(EmptyList.b)));
                }
            }
        } else if (tlw0Var2 instanceof tlw0.e) {
            tlw0.e eVar = (tlw0.e) tlw0Var2;
            if (emw0Var2 instanceof emw0.a) {
                if (eVar instanceof tlw0.e.b) {
                    String a2 = jsaVar.a();
                    if (a2 == null) {
                        a2 = ((emw0.a) emw0Var2).d.b;
                    }
                    T(new amw0.c.b(a2));
                } else if (eVar instanceof tlw0.e.c) {
                    Iterator<T> it = ((emw0.a) emw0Var2).b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (epx.f(((GroupsGroupFullDto) next).P0(), ((tlw0.e.c) eVar).b)) {
                            obj = next;
                            break;
                        }
                    }
                    GroupsGroupFullDto groupsGroupFullDto = (GroupsGroupFullDto) obj;
                    if (groupsGroupFullDto == null) {
                        throw new IllegalStateException("Selected group doesn't exist in state: " + eVar);
                    }
                    T(new amw0.c.C2555c(groupsGroupFullDto));
                } else {
                    if (!(eVar instanceof tlw0.e.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String string = jsaVar.b.c().getString("anonym_name", null);
                    T(new amw0.c.a(string != null ? string : ""));
                }
                s3q0 s3q0Var = s3q0.a;
            }
        } else if (tlw0Var2 instanceof tlw0.a) {
            tlw0.a aVar = (tlw0.a) tlw0Var2;
            if (emw0Var2 instanceof emw0.a) {
                if (aVar instanceof tlw0.a.b) {
                    T(new amw0.d(((tlw0.a.b) aVar).b));
                } else {
                    if (!(aVar instanceof tlw0.a.C3757a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    T(new amw0.d(""));
                }
            }
        } else if (tlw0Var2 instanceof tlw0.c.a) {
            this.l.b(zlw0.a.a);
        } else {
            if (!(tlw0Var2 instanceof tlw0.d)) {
                throw new NoWhenBranchMatchedException();
            }
            if (emw0Var2 instanceof emw0.a) {
                emw0.a aVar2 = (emw0.a) emw0Var2;
                String str4 = aVar2.e;
                emw0.a.b bVar = aVar2.c;
                boolean z2 = bVar instanceof emw0.a.b.C2825b;
                j79 j79Var = this.i;
                if (z2) {
                    if (str4.length() <= 0 || str4.equals(aVar2.d.b)) {
                        str4 = null;
                    }
                    if (str4 != null) {
                        a7f0.a.f(this, j79Var.b(str4), new r5i0(11, this, str4), null, 5);
                    } else {
                        a7f0.a.d(this, rsg0.Z(yfb.x(qd9.a(jsaVar.a, voipChangeNameConfig.b.b, null, 62))).q(asu0.a.c()).g(new gsa(jsaVar, 0)), null, new aer0(this, 12), new uvs0(this, 8), 1);
                    }
                    s3q0 s3q0Var2 = s3q0.a;
                } else if (bVar instanceof emw0.a.b.c) {
                    this.k.b(new dmw0.c(voipChangeNameConfig.c, new VoipChangeNameResult(new VoipChangeNameResult.JoinAs.Group(fkq0.e(((emw0.a.b.c) bVar).a.P0())))));
                    s3q0 s3q0Var3 = s3q0.a;
                } else if (bVar instanceof emw0.a.b.C2824a) {
                    a7f0.a.f(this, j79Var.b(str4), new tot0(i, this, aVar2), null, 5);
                    s3q0 s3q0Var4 = s3q0.a;
                }
            }
        }
        s3q0 s3q0Var5 = s3q0.a;
    }

    public final amw0.a.c U(List<GroupsGroupFullDto> list) {
        Object obj;
        VoipChangeNameConfig voipChangeNameConfig = this.f;
        VoipChangeNameConfig.PreselectedUser preselectedUser = voipChangeNameConfig.d;
        boolean z = preselectedUser instanceof VoipChangeNameConfig.PreselectedUser.User;
        jsa jsaVar = this.h;
        if (z) {
            VoipChangeNameConfig.OpenedFrom openedFrom = voipChangeNameConfig.i;
            if (openedFrom instanceof VoipChangeNameConfig.OpenedFrom.ActiveCall) {
                String str = ((VoipChangeNameConfig.OpenedFrom.ActiveCall) openedFrom).b;
                if (str == null && (str = jsaVar.a()) == null) {
                    str = o25.a().o().b;
                }
                return new amw0.a.c.b(str);
            }
            if (!(openedFrom instanceof VoipChangeNameConfig.OpenedFrom.JoinScreen)) {
                throw new NoWhenBranchMatchedException();
            }
            String a = jsaVar.a();
            if (a == null) {
                a = o25.a().o().b;
            }
            return new amw0.a.c.b(a);
        }
        if (!(preselectedUser instanceof VoipChangeNameConfig.PreselectedUser.Group)) {
            if (preselectedUser instanceof VoipChangeNameConfig.PreselectedUser.Anonym) {
                String str2 = ((VoipChangeNameConfig.PreselectedUser.Anonym) preselectedUser).b;
                if (str2 == null) {
                    str2 = jsaVar.b.c().getString("anonym_name", null);
                }
                return new amw0.a.c.C2552a(str2);
            }
            String a2 = jsaVar.a();
            if (a2 == null) {
                a2 = o25.a().o().b;
            }
            return new amw0.a.c.b(a2);
        }
        UserId a3 = fkq0.a(((VoipChangeNameConfig.PreselectedUser.Group) preselectedUser).b);
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (fkq0.a(((GroupsGroupFullDto) obj).P0()).equals(a3)) {
                break;
            }
        }
        GroupsGroupFullDto groupsGroupFullDto = (GroupsGroupFullDto) obj;
        if (groupsGroupFullDto != null) {
            return new amw0.a.c.C2553c(groupsGroupFullDto);
        }
        return null;
    }

    public final dmw0.b V(String str) {
        return new dmw0.b(this.f.c, new VoipChangeNameResult(new VoipChangeNameResult.JoinAs.CurrentUser(str)));
    }
}
