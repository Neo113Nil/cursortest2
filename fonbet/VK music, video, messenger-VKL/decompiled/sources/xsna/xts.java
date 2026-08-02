package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseCropPhotoCropDto;
import com.vk.api.generated.base.dto.BaseCropPhotoDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.friends.dto.FriendsFriendStatusStatusDto;
import com.vk.api.generated.friends.dto.FriendsRecBlockButtonDto;
import com.vk.api.generated.friends.dto.FriendsRecDescriptionGenericDto;
import com.vk.api.generated.friends.dto.FriendsRequestsMutualDto;
import com.vk.api.generated.friends.dto.FriendsUserRecommendationsDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.MutualInfo;
import com.vk.dto.common.RecommendedProfile;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.CropPhoto;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.SocialButtonType;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FriendsUserRecommendationsDtoToRecommendedProfileDtoMapper.kt */
/* loaded from: classes3.dex */
public final class xts {
    public final bpn0 a = new bpn0(new d4(16));
    public final bpn0 b = new bpn0(new nh0(16));

    /* compiled from: FriendsUserRecommendationsDtoToRecommendedProfileDtoMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FriendsUserRecommendationsDto.SocialButtonTypeDto.values().length];
            try {
                iArr[FriendsUserRecommendationsDto.SocialButtonTypeDto.FOLLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FriendsUserRecommendationsDto.SocialButtonTypeDto.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final RecommendedProfile a(FriendsUserRecommendationsDto friendsUserRecommendationsDto) {
        MutualInfo mutualInfo;
        Image s;
        Image image;
        ArrayList arrayList;
        CropPhoto cropPhoto;
        ArrayList arrayList2;
        String w0;
        UserProfile userProfile = new UserProfile();
        userProfile.c = friendsUserRecommendationsDto.l0();
        userProfile.d = friendsUserRecommendationsDto.M();
        userProfile.f = friendsUserRecommendationsDto.w0();
        StringBuilder sb = new StringBuilder();
        String M = friendsUserRecommendationsDto.M();
        if (M != null && M.length() != 0) {
            sb.append(friendsUserRecommendationsDto.M());
        }
        if (sb.length() > 0 && (w0 = friendsUserRecommendationsDto.w0()) != null && w0.length() != 0) {
            sb.append(" ");
        }
        String w02 = friendsUserRecommendationsDto.w0();
        if (w02 != null && w02.length() != 0) {
            sb.append(friendsUserRecommendationsDto.w0());
        }
        userProfile.e = sb.toString();
        FriendsRequestsMutualDto N0 = friendsUserRecommendationsDto.N0();
        SocialButtonType socialButtonType = null;
        if (N0 != null) {
            Integer d = N0.d();
            List<UserId> e = N0.e();
            if (e != null) {
                List<UserId> list = e;
                arrayList2 = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(((UserId) it.next()).b));
                }
            } else {
                arrayList2 = null;
            }
            mutualInfo = new MutualInfo(d, arrayList2);
        } else {
            mutualInfo = null;
        }
        userProfile.d0 = mutualInfo;
        BaseSexDto s1 = friendsUserRecommendationsDto.s1();
        if (s1 != null) {
            ((sm6) this.a.getValue()).getClass();
            userProfile.i = sm6.a(s1);
        }
        String n1 = friendsUserRecommendationsDto.n1();
        if (n1 == null || n1.length() == 0) {
            s = k15.s(friendsUserRecommendationsDto.d1(), friendsUserRecommendationsDto.U0(), friendsUserRecommendationsDto.V0(), friendsUserRecommendationsDto.b1());
        } else {
            Serializer.c<Image> cVar = Image.CREATOR;
            s = Image.b.a(friendsUserRecommendationsDto.n1());
        }
        userProfile.O = s;
        String a2 = js5.a(200, friendsUserRecommendationsDto.n1());
        if (a2 == null && (a2 = friendsUserRecommendationsDto.V0()) == null && (a2 = friendsUserRecommendationsDto.U0()) == null) {
            a2 = friendsUserRecommendationsDto.d1();
        }
        userProfile.h = a2;
        String o1 = friendsUserRecommendationsDto.o1();
        userProfile.P = o1;
        if ((o1 == null || o1.length() == 0) && (image = userProfile.O) != null) {
            ArrayList arrayList3 = image.b;
            userProfile.P = arrayList3 != null ? ixj0.h(arrayList3) : null;
        }
        userProfile.g = friendsUserRecommendationsDto.n1();
        List<FriendsRecDescriptionGenericDto> G = friendsUserRecommendationsDto.G();
        bpn0 bpn0Var = this.b;
        if (G != null) {
            List<FriendsRecDescriptionGenericDto> list2 = G;
            srs srsVar = (srs) bpn0Var.getValue();
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(srsVar.a((FriendsRecDescriptionGenericDto) it2.next()));
            }
        } else {
            arrayList = null;
        }
        userProfile.E = arrayList;
        if (arrayList == null || arrayList.isEmpty()) {
            FriendsRecDescriptionGenericDto F = friendsUserRecommendationsDto.F();
            userProfile.E = F != null ? Collections.singletonList(((srs) bpn0Var.getValue()).a(F)) : null;
        }
        FriendsFriendStatusStatusDto a0 = friendsUserRecommendationsDto.a0();
        if (a0 == null) {
            a0 = FriendsFriendStatusStatusDto.NOT_A_FRIEND;
        }
        userProfile.v = a0.i();
        BaseBoolIntDto y1 = friendsUserRecommendationsDto.y1();
        BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
        boolean z = y1 == baseBoolIntDto;
        VerifyInfo verifyInfo = userProfile.B;
        verifyInfo.b = z;
        verifyInfo.c = friendsUserRecommendationsDto.x1() == baseBoolIntDto;
        userProfile.a0(friendsUserRecommendationsDto.n() == baseBoolIntDto);
        userProfile.J = friendsUserRecommendationsDto.r();
        BaseCropPhotoDto C = friendsUserRecommendationsDto.C();
        if (C != null) {
            bpn0 bpn0Var2 = xfa0.a;
            Photo a3 = xfa0.a(C.e());
            BaseCropPhotoCropDto d2 = C.d();
            cropPhoto = new CropPhoto(a3, new CropPhoto.Crop(d2.d(), d2.f(), d2.e(), d2.g()));
        } else {
            cropPhoto = null;
        }
        userProfile.Q = cropPhoto;
        FriendsRecBlockButtonDto g = friendsUserRecommendationsDto.g();
        userProfile.F = g != null ? ors.a(g) : null;
        FriendsUserRecommendationsDto.SocialButtonTypeDto t1 = friendsUserRecommendationsDto.t1();
        int i = t1 == null ? -1 : a.$EnumSwitchMapping$0[t1.ordinal()];
        if (i != -1) {
            if (i == 1) {
                socialButtonType = SocialButtonType.FOLLOW;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                socialButtonType = SocialButtonType.ADD;
            }
        }
        userProfile.e0 = socialButtonType;
        return new RecommendedProfile(userProfile);
    }
}
