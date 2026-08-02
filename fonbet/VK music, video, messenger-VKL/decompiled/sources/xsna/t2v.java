package xsna;

import com.vk.api.generated.friends.dto.FriendsSearchResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.serialize.Serializer;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class t2v implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ String c;

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                FriendsSearchResponseDto friendsSearchResponseDto = (FriendsSearchResponseDto) obj;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (List) obj2) {
                    if (drm0.D(((ProfileFriendItem) obj3).h, str, true)) {
                        arrayList.add(obj3);
                    }
                }
                EmptyList emptyList = EmptyList.b;
                List<UsersUserFullDto> d = friendsSearchResponseDto.d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
                for (UsersUserFullDto usersUserFullDto : d) {
                    Serializer.c<ProfileFriendItem> cVar = ProfileFriendItem.CREATOR;
                    arrayList2.add(ProfileFriendItem.a.b(usersUserFullDto));
                }
                return new cts(emptyList, j5g.R(j5g.u0(arrayList2, arrayList)));
            default:
                ((Integer) obj2).getClass();
                com.vk.profile.design.view.profileheader.b.a(str, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }
}
