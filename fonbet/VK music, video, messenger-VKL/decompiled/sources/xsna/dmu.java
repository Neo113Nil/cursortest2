package xsna;

import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.subscription.api.SubscribeStatus;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class dmu implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ UserId c;

    public /* synthetic */ dmu(UserId userId, int i) {
        this.b = i;
        this.c = userId;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        GroupsGroupFullDto groupsGroupFullDto;
        switch (this.b) {
            case 0:
                List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) obj).d();
                if (d == null || (groupsGroupFullDto = d.get(0)) == null) {
                    throw new IllegalStateException(b4q.b(this.c, "No group returned by id: "));
                }
                return groupsGroupFullDto;
            default:
                t6g0 t6g0Var = t6g0.b;
                t6g0.b().a();
                xwk.e().T().m().b(new kym0(SubscribeStatus.MEMBER_STATUS_MEMBER, this.c, null, null, 12));
                return s3q0.a;
        }
    }
}
