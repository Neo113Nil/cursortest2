package xsna;

import com.vk.api.generated.friends.dto.FriendsAddResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RequestUserProfile;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment$receiver$1;
import com.vkontakte.android.data.FriendsUtils;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class njs implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ UserId c;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        UserId userId = this.c;
        switch (i) {
            case 0:
                RequestUserProfile requestUserProfile = (RequestUserProfile) obj;
                int i2 = FriendRequestsFragment$receiver$1.b;
                return Boolean.valueOf(epx.f(requestUserProfile != null ? requestUserProfile.c : null, userId));
            default:
                int i3 = ((FriendsAddResponseDto) obj).i();
                int i4 = 1;
                if (i3 != 1) {
                    if (i3 == 2) {
                        i4 = 3;
                    } else if (i3 != 4) {
                        i4 = 0;
                    }
                }
                FriendsUtils.d(i4, userId);
                return s3q0.a;
        }
    }
}
