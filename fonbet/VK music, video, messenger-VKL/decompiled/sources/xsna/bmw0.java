package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.views.avatars.a;
import com.vk.voip.ui.change_name.VoipChangeNameConfig;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.emw0;
import xsna.imw0;

/* compiled from: VoipChangeNameReducer.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class bmw0 extends FunctionReferenceImpl implements izs<emw0, imw0.a> {
    @Override // xsna.izs
    public final imw0.a invoke(emw0 emw0Var) {
        String str;
        imw0.a.b bVar;
        emw0 emw0Var2 = emw0Var;
        VoipChangeNameConfig voipChangeNameConfig = ((jmw0) this.receiver).a;
        if (emw0Var2 instanceof emw0.c) {
            return imw0.a.e.a;
        }
        if (emw0Var2 instanceof emw0.b) {
            return new imw0.a.c(((emw0.b) emw0Var2).b);
        }
        if (!(emw0Var2 instanceof emw0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        emw0.a aVar = (emw0.a) emw0Var2;
        emw0.a.b bVar2 = aVar.c;
        cn cnVar = aVar.d;
        ArrayList arrayList = new ArrayList();
        boolean z = bVar2 instanceof emw0.a.b.C2825b;
        String str2 = cnVar.b;
        a.b.C1179b c1179b = new a.b.C1179b(str2);
        Serializer.c<ImageList> cVar = ImageList.CREATOR;
        arrayList.add(new imw0.a.d.b(ImageList.a.c(-1, -1, cnVar.c), c1179b, cnVar.b, z, cnVar.j));
        List<GroupsGroupFullDto> list = aVar.b;
        boolean z2 = false;
        if (!list.isEmpty()) {
            List<GroupsGroupFullDto> list2 = list;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            for (GroupsGroupFullDto groupsGroupFullDto : list2) {
                boolean z3 = (bVar2 instanceof emw0.a.b.c) && epx.f(((emw0.a.b.c) bVar2).a, groupsGroupFullDto);
                UserId P0 = groupsGroupFullDto.P0();
                Serializer.c<ImageList> cVar2 = ImageList.CREATOR;
                ImageList a = ImageList.a.a(groupsGroupFullDto.V1());
                String y1 = groupsGroupFullDto.y1();
                arrayList2.add(new imw0.a.d.c(P0, a, y1 == null ? "" : y1, z3, epx.f(groupsGroupFullDto.N3(), Boolean.TRUE)));
            }
            g5g.y(arrayList2, arrayList);
        }
        boolean b = o25.b(o25.a());
        if (voipChangeNameConfig.f && !b) {
            arrayList.add(new imw0.a.d.C3066a(bVar2 instanceof emw0.a.b.C2824a));
        }
        String str3 = aVar.e;
        boolean z4 = aVar.f;
        tlo0 d = z ? oq.d(tlo0.Companion, str2) : bVar2 instanceof emw0.a.b.C2824a ? tq.h(tlo0.Companion, R.string.voip_change_name_anonym_title) : tq.h(tlo0.Companion, R.string.join_to_call_by_link_name);
        if (o25.a().b()) {
            if (str2.length() > 12) {
                str2 = str2.substring(0, 12).concat("...");
            }
            str = str2;
        } else {
            str = "";
        }
        emw0.a.AbstractC2822a abstractC2822a = aVar.h;
        if (abstractC2822a instanceof emw0.a.AbstractC2822a.b) {
            bVar = imw0.a.b.C3065b.a;
        } else {
            if (!(abstractC2822a instanceof emw0.a.AbstractC2822a.C2823a)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = imw0.a.b.C3064a.a;
        }
        boolean z5 = bVar2 instanceof emw0.a.b.C2824a;
        imw0.a.C3063a c3063a = new imw0.a.C3063a(str3, z4, d, str, bVar, !z5 || aVar.e.length() > 0, (z5 || voipChangeNameConfig.g) && !o25.b(o25.a()));
        boolean z6 = aVar.g;
        VoipChangeNameConfig.OpenedFrom openedFrom = voipChangeNameConfig.i;
        if (openedFrom instanceof VoipChangeNameConfig.OpenedFrom.JoinScreen) {
            z2 = true;
        } else if (!(openedFrom instanceof VoipChangeNameConfig.OpenedFrom.ActiveCall)) {
            throw new NoWhenBranchMatchedException();
        }
        return new imw0.a.f(arrayList, c3063a, z6, z2);
    }
}
