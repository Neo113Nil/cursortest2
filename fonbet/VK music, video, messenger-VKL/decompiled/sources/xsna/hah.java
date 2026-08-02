package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import com.vk.profile.community.members.api.CommunityMembersFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: CommunityMembersInteractor.kt */
/* loaded from: classes5.dex */
public final class hah {
    public final boolean a;
    public final ovj b;
    public final ArrayList c;
    public final ArrayList d;
    public final List<UsersFieldsDto> e;
    public final ArrayList f;
    public final ArrayList g;

    public hah(boolean z) {
        ovj b = hqu0.b();
        this.a = z;
        this.b = b;
        this.c = new ArrayList();
        this.d = new ArrayList();
        List<UsersFieldsDto> l = e43.l(UsersFieldsDto.PHOTO_BASE, UsersFieldsDto.FIRST_NAME_ACC, UsersFieldsDto.LAST_NAME_ACC);
        this.e = l;
        List<UsersFieldsDto> list = l;
        this.f = j5g.u0(Collections.singletonList(UsersFieldsDto.IS_DON), list);
        this.g = j5g.u0(Collections.singletonList(UsersFieldsDto.ONLINE_INFO), list);
    }

    public final Object a(UserId userId, CommunityMembersFilter communityMembersFilter, String str, ContinuationImpl continuationImpl) {
        return myc0.k(this.b, new gah(communityMembersFilter, this, userId, 100, str, null), continuationImpl);
    }
}
