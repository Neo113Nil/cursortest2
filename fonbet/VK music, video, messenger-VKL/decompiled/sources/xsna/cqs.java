package xsna;

import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.friends.dto.FriendsGetFieldsResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.serialize.Serializer;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class cqs implements izs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ dqs c;

    public /* synthetic */ cqs(boolean z, dqs dqsVar) {
        this.b = z;
        this.c = dqsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z = this.b;
        dqs dqsVar = this.c;
        FriendsGetFieldsResponseDto friendsGetFieldsResponseDto = (FriendsGetFieldsResponseDto) obj;
        int i = z ? dqsVar.e : dqsVar.f;
        List<UsersUserFullDto> d = friendsGetFieldsResponseDto.d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        for (UsersUserFullDto usersUserFullDto : d) {
            Serializer.c<ProfileFriendItem> cVar = ProfileFriendItem.CREATOR;
            arrayList.add(ProfileFriendItem.a.b(usersUserFullDto));
        }
        return new VkPaginationList(arrayList, friendsGetFieldsResponseDto.getCount(), i < friendsGetFieldsResponseDto.getCount(), i);
    }
}
