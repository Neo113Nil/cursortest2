package xsna;

import com.vk.clips.sdk.models.SdkFriendsInfo;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.models.SdkVerifyInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.FriendsInfo;
import com.vk.dto.common.Image;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.user.ImageStatus;
import com.vk.toggle.features.VideoFeatures;
import java.util.List;

/* compiled from: OwnerAdapter.kt */
/* loaded from: classes17.dex */
public final class o490 {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SdkOwner a(Owner owner) {
        SdkImages sdkImages;
        boolean z;
        Image image;
        UserId userId = owner.b;
        String str = owner.c;
        Serializer.c<Image> cVar = Image.CREATOR;
        SdkImages C = fz5.C(Image.b.a(owner.d));
        boolean i = owner.i(4);
        boolean i2 = owner.i(16);
        VerifyInfo verifyInfo = owner.f;
        boolean z2 = verifyInfo != null && verifyInfo.b;
        SdkVerifyInfo sdkVerifyInfo = verifyInfo != null ? new SdkVerifyInfo(verifyInfo.b, verifyInfo.c, verifyInfo.d, verifyInfo.e, verifyInfo.f, verifyInfo.g) : null;
        ImageStatus imageStatus = owner.k;
        if (imageStatus != null) {
            List<String> list = imageStatus.e;
            if (list == null || !list.contains("clips")) {
                imageStatus = null;
            }
            if (imageStatus != null && (image = imageStatus.d) != null) {
                sdkImages = fz5.C(image);
                boolean i3 = owner.i(8);
                Integer valueOf = Integer.valueOf(owner.t);
                FriendsInfo friendsInfo = owner.u;
                SdkFriendsInfo sdkFriendsInfo = friendsInfo != null ? new SdkFriendsInfo(friendsInfo.b, friendsInfo.c) : null;
                if (owner.w) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_AVATAR_LIVE_BADGE;
                    videoFeatures.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures)) {
                        z = true;
                        return new SdkOwner(userId, str, C, null, false, i, i2, z2, sdkVerifyInfo, sdkImages, null, owner, i3, valueOf, sdkFriendsInfo, z);
                    }
                }
                z = false;
                return new SdkOwner(userId, str, C, null, false, i, i2, z2, sdkVerifyInfo, sdkImages, null, owner, i3, valueOf, sdkFriendsInfo, z);
            }
        }
        sdkImages = null;
        boolean i32 = owner.i(8);
        Integer valueOf2 = Integer.valueOf(owner.t);
        FriendsInfo friendsInfo2 = owner.u;
        SdkFriendsInfo sdkFriendsInfo2 = friendsInfo2 != null ? new SdkFriendsInfo(friendsInfo2.b, friendsInfo2.c) : null;
        if (owner.w) {
        }
        z = false;
        return new SdkOwner(userId, str, C, null, false, i, i2, z2, sdkVerifyInfo, sdkImages, null, owner, i32, valueOf2, sdkFriendsInfo2, z);
    }
}
