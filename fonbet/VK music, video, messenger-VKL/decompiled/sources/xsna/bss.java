package xsna;

import android.text.TextUtils;
import com.vk.api.friends.FriendsGetRecommendations;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.RecommendedProfile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.ProfilesRecommendations;
import com.vk.dto.photo.CropPhoto;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.toggle.features.FeedFeatures;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;

/* compiled from: FriendsRecommendationsPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class bss extends de {
    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        ArrayList<RecommendedProfile> arrayList;
        NewsEntry newsEntry = u1c0Var.a;
        ProfilesRecommendations profilesRecommendations = newsEntry instanceof ProfilesRecommendations ? (ProfilesRecommendations) newsEntry : null;
        if (profilesRecommendations == null || (arrayList = profilesRecommendations.l) == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // xsna.de
    public final ktc0 c0(u1c0 u1c0Var, int i) {
        ArrayList<RecommendedProfile> arrayList;
        RecommendedProfile recommendedProfile;
        UserProfile d;
        CropPhoto cropPhoto;
        NewsEntry newsEntry = u1c0Var.a;
        ProfilesRecommendations profilesRecommendations = newsEntry instanceof ProfilesRecommendations ? (ProfilesRecommendations) newsEntry : null;
        if (profilesRecommendations == null || (arrayList = profilesRecommendations.l) == null || (recommendedProfile = (RecommendedProfile) j5g.b0(i, arrayList)) == null || (d = recommendedProfile.d()) == null || (cropPhoto = d.Q) == null) {
            return null;
        }
        CropPhoto.Crop crop = cropPhoto.c;
        bik bikVar = new bik();
        bikVar.f(cn70.b(Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE), cn70.b(280));
        bikVar.g(crop.b, crop.d, crop.c, crop.e);
        return bikVar;
    }

    @Override // xsna.de
    public final String d0(u1c0 u1c0Var, int i) {
        ArrayList<RecommendedProfile> arrayList;
        RecommendedProfile recommendedProfile;
        UserProfile d;
        ImageSize Cb;
        ImageSize b;
        String str;
        NewsEntry newsEntry = u1c0Var.a;
        ProfilesRecommendations profilesRecommendations = newsEntry instanceof ProfilesRecommendations ? (ProfilesRecommendations) newsEntry : null;
        if (profilesRecommendations == null || (arrayList = profilesRecommendations.l) == null || (recommendedProfile = (RecommendedProfile) j5g.b0(i, arrayList)) == null || (d = recommendedProfile.d()) == null) {
            return null;
        }
        CropPhoto cropPhoto = d.Q;
        if (cropPhoto != null && (b = cropPhoto.b(cn70.b(280))) != null && (str = b.d.d) != null) {
            return str;
        }
        Image image = d.O;
        return (image == null || (Cb = image.Cb(cn70.b(280), false, false)) == null) ? d.h : Cb.d.d;
    }

    @Override // xsna.de
    public final io.reactivex.rxjava3.core.q e0(String str, NewsEntry newsEntry) {
        if (!(newsEntry instanceof ProfilesRecommendations)) {
            return null;
        }
        FeedFeatures feedFeatures = FeedFeatures.FEED_CODEGEN_NEWSFEED;
        feedFeatures.getClass();
        if (com.vk.toggle.b.A.a(feedFeatures)) {
            ProfilesRecommendations profilesRecommendations = (ProfilesRecommendations) newsEntry;
            ots otsVar = new ots();
            String str2 = profilesRecommendations.i;
            String str3 = profilesRecommendations.p;
            String str4 = profilesRecommendations.q.b;
            int i = profilesRecommendations.m;
            dz2 x = yfb.x(nts.i(otsVar, 20, null, str, str2, str4, i > 0 ? new UserId(i) : null, str3, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE));
            x.n = true;
            int i2 = 15;
            return rsg0.l0(x, null, 3).U(new qs6(new r3h(profilesRecommendations, i2), i2)).a0(asu0.a.d());
        }
        ProfilesRecommendations profilesRecommendations2 = (ProfilesRecommendations) newsEntry;
        FriendsGetRecommendations friendsGetRecommendations = new FriendsGetRecommendations(profilesRecommendations2.i, null, 20);
        if (!TextUtils.isEmpty(str)) {
            friendsGetRecommendations.K("ref", str);
        }
        String str5 = profilesRecommendations2.p;
        if (!TextUtils.isEmpty(str5)) {
            friendsGetRecommendations.K("reason", str5);
        }
        String str6 = profilesRecommendations2.q.b;
        if (!TextUtils.isEmpty(str6)) {
            friendsGetRecommendations.K("track_code", str6);
        }
        int i3 = profilesRecommendations2.m;
        if (i3 != 0) {
            friendsGetRecommendations.C(i3, "friend_id");
        }
        friendsGetRecommendations.n = true;
        return rsg0.l0(friendsGetRecommendations, null, 3).U(new u5(new bhh(profilesRecommendations2, 19), 15)).a0(asu0.a.d());
    }

    @Override // xsna.de
    public final io.reactivex.rxjava3.core.q<NewsEntry> f0(u1c0 u1c0Var) {
        return e0(u1c0Var.l, u1c0Var.b);
    }

    @Override // xsna.de
    public final boolean l0() {
        return true;
    }
}
