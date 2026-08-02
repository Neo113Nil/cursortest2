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
public final /* synthetic */ class xx6 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ xx6(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        FriendsGetFieldsResponseDto friendsGetFieldsResponseDto = (FriendsGetFieldsResponseDto) obj;
        List<UsersUserFullDto> d = friendsGetFieldsResponseDto.d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        for (UsersUserFullDto usersUserFullDto : d) {
            Serializer.c<ProfileFriendItem> cVar = ProfileFriendItem.CREATOR;
            arrayList.add(ProfileFriendItem.a.b(usersUserFullDto));
        }
        int count = friendsGetFieldsResponseDto.getCount();
        int i = this.b;
        return new VkPaginationList(arrayList, count, this.c + i < friendsGetFieldsResponseDto.getCount(), i);
    }
}
