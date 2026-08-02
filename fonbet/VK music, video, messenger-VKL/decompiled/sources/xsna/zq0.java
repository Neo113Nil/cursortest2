package xsna;

import com.vk.api.generated.groups.dto.GroupsGetFriendsInvitationListResponseDto;
import com.vk.contacts.ContactSyncState;
import com.vk.stat.scheme.CommonMarketStat$TypeCtaButtonPositionType;
import kotlin.collections.EmptyList;
import xsna.kq0;
import xsna.t44;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class zq0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ zq0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(new kq0.d(((Boolean) obj).booleanValue()));
                break;
            case 1:
                q9x q9xVar = (q9x) obj;
                izs izsVar = this.c;
                if (izsVar != null) {
                    izsVar.invoke(Integer.valueOf((int) (q9xVar.a & 4294967295L)));
                }
                break;
            case 2:
                com.vk.contacts.c.b.I0(false);
                com.vk.contacts.c.i(ContactSyncState.NOT_PERMITTED);
                izs izsVar2 = this.c;
                if (izsVar2 != null) {
                    izsVar2.invoke(EmptyList.b);
                }
                break;
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                CommonMarketStat$TypeCtaButtonPositionType commonMarketStat$TypeCtaButtonPositionType = CommonMarketStat$TypeCtaButtonPositionType.DEFAULT;
                this.c.invoke(booleanValue ? new jjl0(commonMarketStat$TypeCtaButtonPositionType) : new ijl0(commonMarketStat$TypeCtaButtonPositionType));
                break;
            case 4:
                this.c.invoke((GroupsGetFriendsInvitationListResponseDto) obj);
                break;
            default:
                this.c.invoke(t44.g.c.b);
                break;
        }
        return s3q0.a;
    }
}
