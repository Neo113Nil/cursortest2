package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseCropPhotoCropDto;
import com.vk.api.generated.base.dto.BaseCropPhotoDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.friends.dto.FriendsFriendStatusStatusDto;
import com.vk.api.generated.friends.dto.FriendsRecBlockButtonDto;
import com.vk.api.generated.friends.dto.FriendsRecBlockFooterDto;
import com.vk.api.generated.friends.dto.FriendsRecBlockFooterIconDto;
import com.vk.api.generated.friends.dto.FriendsRecBlockInfoCardDto;
import com.vk.api.generated.friends.dto.FriendsRecDescriptionGenericDto;
import com.vk.api.generated.friends.dto.FriendsRecProfileDto;
import com.vk.api.generated.friends.dto.FriendsRequestsMutualDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemDebugInfoDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemWallpostFeedbackDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.MutualInfo;
import com.vk.dto.common.RecommendedProfile;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.ProfilesRecommendations;
import com.vk.dto.photo.CropPhoto;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.ProfileDescription;
import com.vk.dto.user.SocialButtonType;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.DebugInfo;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: NewsfeedItemFriendsRecommendBlockDtoToProfilesRecommendationsMapper.kt */
/* loaded from: classes4.dex */
public final class vm60 {
    public static ProfilesRecommendations a(NewsfeedNewsfeedItemDto.NewsfeedItemFriendsRecommendBlockDto newsfeedItemFriendsRecommendBlockDto) {
        ProfilesRecommendations.Footer footer;
        ProfilesRecommendations.Footer.Icon icon;
        MutualInfo mutualInfo;
        Image s;
        ArrayList arrayList;
        ArrayList arrayList2;
        CropPhoto cropPhoto;
        ArrayList arrayList3;
        String l;
        String type = newsfeedItemFriendsRecommendBlockDto.getType();
        if (type == null) {
            type = "user_rec";
        }
        String str = type;
        String title = newsfeedItemFriendsRecommendBlockDto.getTitle();
        String j = newsfeedItemFriendsRecommendBlockDto.j();
        List<FriendsRecProfileDto> k = newsfeedItemFriendsRecommendBlockDto.k();
        int i = 10;
        ArrayList arrayList4 = new ArrayList(c5g.u(k, 10));
        Iterator<T> it = k.iterator();
        while (true) {
            DebugInfo debugInfo = null;
            SocialButtonType socialButtonType = null;
            if (!it.hasNext()) {
                ArrayList q = p4g.q(arrayList4);
                FriendsRecBlockInfoCardDto g = newsfeedItemFriendsRecommendBlockDto.g();
                ProfilesRecommendations.InfoCard a = g != null ? qrs.a(g) : null;
                FriendsRecBlockFooterDto f = newsfeedItemFriendsRecommendBlockDto.f();
                if (f != null) {
                    FriendsRecBlockFooterIconDto e = f.e();
                    if (e == null) {
                        icon = null;
                    } else {
                        if (prs.$EnumSwitchMapping$0[e.ordinal()] != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        icon = ProfilesRecommendations.Footer.Icon.CHEVRON;
                    }
                    footer = new ProfilesRecommendations.Footer(icon, wf6.b(f.d()), f.f());
                } else {
                    footer = null;
                }
                ProfilesRecommendations profilesRecommendations = new ProfilesRecommendations(str, title, j, q, 0, a, footer, null, new NewsEntry.TrackData(newsfeedItemFriendsRecommendBlockDto.r(), 0, 0L, false, false, null, null, 0, 254, null));
                NewsfeedItemWallpostFeedbackDto e2 = newsfeedItemFriendsRecommendBlockDto.e();
                profilesRecommendations.g = e2 != null ? nn60.a(e2) : null;
                Boolean l2 = newsfeedItemFriendsRecommendBlockDto.l();
                Boolean bool = Boolean.TRUE;
                profilesRecommendations.e = epx.f(l2, bool);
                NewsfeedItemDebugInfoDto d = newsfeedItemFriendsRecommendBlockDto.d();
                if (d != null) {
                    String d2 = d.d();
                    bpn0 bpn0Var = cqm0.a;
                    if (d2 == null) {
                        d2 = "";
                    }
                    String description = d.getDescription();
                    debugInfo = new DebugInfo(d2, description != null ? description : "");
                }
                profilesRecommendations.h = debugInfo;
                profilesRecommendations.c = epx.f(newsfeedItemFriendsRecommendBlockDto.i(), bool);
                return profilesRecommendations;
            }
            FriendsRecProfileDto friendsRecProfileDto = (FriendsRecProfileDto) it.next();
            new sm6();
            srs srsVar = new srs();
            UserProfile userProfile = new UserProfile();
            userProfile.c = friendsRecProfileDto.k();
            userProfile.d = friendsRecProfileDto.i();
            userProfile.f = friendsRecProfileDto.l();
            StringBuilder sb = new StringBuilder();
            String i2 = friendsRecProfileDto.i();
            if (i2 != null && i2.length() != 0) {
                sb.append(friendsRecProfileDto.i());
            }
            if (sb.length() > 0 && (l = friendsRecProfileDto.l()) != null && l.length() != 0) {
                sb.append(" ");
            }
            String l3 = friendsRecProfileDto.l();
            if (l3 != null && l3.length() != 0) {
                sb.append(friendsRecProfileDto.l());
            }
            userProfile.e = sb.toString();
            FriendsRequestsMutualDto n = friendsRecProfileDto.n();
            if (n != null) {
                Integer d3 = n.d();
                List<UserId> e3 = n.e();
                if (e3 != null) {
                    List<UserId> list = e3;
                    arrayList3 = new ArrayList(c5g.u(list, i));
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(Long.valueOf(((UserId) it2.next()).b));
                    }
                } else {
                    arrayList3 = null;
                }
                mutualInfo = new MutualInfo(d3, arrayList3);
            } else {
                mutualInfo = null;
            }
            userProfile.d0 = mutualInfo;
            BaseSexDto D = friendsRecProfileDto.D();
            if (D != null) {
                userProfile.i = sm6.a(D);
            }
            String C = friendsRecProfileDto.C();
            if (C == null || C.length() == 0) {
                s = k15.s(null, friendsRecProfileDto.o(), friendsRecProfileDto.p(), friendsRecProfileDto.u());
            } else {
                Serializer.c<Image> cVar = Image.CREATOR;
                s = Image.b.a(friendsRecProfileDto.C());
            }
            userProfile.O = s;
            String a2 = js5.a(200, friendsRecProfileDto.C());
            if (a2 == null && (a2 = friendsRecProfileDto.p()) == null) {
                a2 = friendsRecProfileDto.o();
            }
            userProfile.h = a2;
            String B = friendsRecProfileDto.B();
            userProfile.P = B;
            if (B == null || B.length() == 0) {
                Image image = userProfile.O;
                userProfile.P = (image == null || (arrayList = image.b) == null) ? null : ixj0.h(arrayList);
            }
            userProfile.g = friendsRecProfileDto.C();
            List<FriendsRecDescriptionGenericDto> g2 = friendsRecProfileDto.g();
            if (g2 != null) {
                List<FriendsRecDescriptionGenericDto> list2 = g2;
                arrayList2 = new ArrayList(c5g.u(list2, i));
                Iterator<T> it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(srsVar.a((FriendsRecDescriptionGenericDto) it3.next()));
                }
            } else {
                arrayList2 = null;
            }
            userProfile.E = arrayList2;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                String description2 = friendsRecProfileDto.getDescription();
                userProfile.E = description2 != null ? Collections.singletonList(new ProfileDescription(ProfileDescription.Type.TEXT, null, null, description2)) : null;
            }
            FriendsFriendStatusStatusDto j2 = friendsRecProfileDto.j();
            if (j2 == null) {
                j2 = FriendsFriendStatusStatusDto.NOT_A_FRIEND;
            }
            userProfile.v = j2.i();
            BaseBoolIntDto K = friendsRecProfileDto.K();
            BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
            boolean z = K == baseBoolIntDto;
            VerifyInfo verifyInfo = userProfile.B;
            verifyInfo.b = z;
            verifyInfo.c = friendsRecProfileDto.G() == baseBoolIntDto;
            userProfile.a0(friendsRecProfileDto.e() == baseBoolIntDto);
            userProfile.J = friendsRecProfileDto.r();
            BaseCropPhotoDto f2 = friendsRecProfileDto.f();
            if (f2 != null) {
                bpn0 bpn0Var2 = xfa0.a;
                Photo a3 = xfa0.a(f2.e());
                BaseCropPhotoCropDto d4 = f2.d();
                cropPhoto = new CropPhoto(a3, new CropPhoto.Crop(d4.d(), d4.f(), d4.e(), d4.g()));
            } else {
                cropPhoto = null;
            }
            userProfile.Q = cropPhoto;
            FriendsRecBlockButtonDto d5 = friendsRecProfileDto.d();
            userProfile.F = d5 != null ? ors.a(d5) : null;
            FriendsRecProfileDto.SocialButtonTypeDto F = friendsRecProfileDto.F();
            int i3 = F == null ? -1 : trs.$EnumSwitchMapping$0[F.ordinal()];
            if (i3 != -1) {
                if (i3 == 1) {
                    socialButtonType = SocialButtonType.FOLLOW;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    socialButtonType = SocialButtonType.ADD;
                }
            }
            userProfile.e0 = socialButtonType;
            arrayList4.add(new RecommendedProfile(userProfile));
            i = 10;
        }
    }
}
