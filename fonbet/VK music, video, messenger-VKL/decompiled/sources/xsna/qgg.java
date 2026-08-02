package xsna;

import android.content.Context;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupAdminLevelDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import xsna.nzb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class qgg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ qgg(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        GroupsGroupFullDto groupsGroupFullDto;
        GroupsGroupAdminLevelDto f;
        int i = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((nmb) obj5).P4(new pmb((ActionLink) obj4, ((Integer) obj).intValue()), new gmb(), new sbg((nzb.d) obj3, 2), new tbg((nzb.e) obj2, 1));
                break;
            case 1:
                kvg kvgVar = (kvg) obj5;
                Context context = (Context) obj4;
                UserId userId = (UserId) obj3;
                defpackage.r rVar = (defpackage.r) obj2;
                List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) obj).d();
                if (d != null && (groupsGroupFullDto = (GroupsGroupFullDto) j5g.Y(d)) != null && (f = groupsGroupFullDto.f()) != null) {
                    kvgVar.a(f.i(), context, userId);
                    rVar.invoke();
                    break;
                } else {
                    break;
                }
                break;
            default:
                int i2 = rfc0.a;
                q860 q860Var = new q860();
                q860Var.n((UserId) obj5, (String) obj4, (ArrayList) obj3, null);
                q860Var.p(-1, (Context) obj2);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ qgg(nmb nmbVar, ActionLink actionLink, int i, UserId userId, nzb.d dVar, nzb.e eVar) {
        this.b = 0;
        this.c = nmbVar;
        this.d = actionLink;
        this.e = dVar;
        this.f = eVar;
    }
}
