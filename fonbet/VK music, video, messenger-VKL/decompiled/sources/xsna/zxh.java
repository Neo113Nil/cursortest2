package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import com.vk.toggle.features.SmbFeatures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CommunityReviewRepliesInteractor.kt */
/* loaded from: classes18.dex */
public final class zxh {
    public final pzh a;
    public final xhg0 b;
    public final fy2 c;
    public final qob d;
    public final nt8 e;
    public final UserId f;
    public final boolean g;
    public final ArrayList h;

    public zxh(pzh pzhVar, xhg0 xhg0Var, fy2 fy2Var, qob qobVar, nt8 nt8Var, UserId userId) {
        this.a = pzhVar;
        this.b = xhg0Var;
        this.c = fy2Var;
        this.d = qobVar;
        this.e = nt8Var;
        this.f = userId;
        SmbFeatures smbFeatures = SmbFeatures.REPLY_VIDEO_ATTACH;
        smbFeatures.getClass();
        this.g = com.vk.toggle.b.A.a(smbFeatures);
        List l = e43.l(UsersFieldsDto.IS_NFT, UsersFieldsDto.VERIFIED, UsersFieldsDto.IS_VERIFIED, UsersFieldsDto.TRENDING, UsersFieldsDto.FIRST_NAME_DAT, UsersFieldsDto.LAST_NAME_DAT, UsersFieldsDto.PHOTO_BASE);
        ArrayList arrayList = new ArrayList(c5g.u(l, 10));
        Iterator it = l.iterator();
        while (it.hasNext()) {
            arrayList.add(((UsersFieldsDto) it.next()).i());
        }
        this.h = arrayList;
    }
}
