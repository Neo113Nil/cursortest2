package xsna;

import com.ironsource.X3;
import com.vk.api.base.Document;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFilterDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.geo.GeoLocation;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.posting.DonutPostingSettings;
import com.vk.dto.privacy.ListFriends;
import com.vk.dto.user.UserProfile;
import com.vk.newsfeed.api.posting.dto.PosterSettings;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.newsfeed.impl.requests.SearchGetHintsWithAttachments;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.s1r0;

/* compiled from: GetPostingSettings.kt */
/* loaded from: classes4.dex */
public final class ptt extends awi<olc0> {
    public final UserId s;
    public final boolean t;
    public final boolean u = true;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final List<UserId> y;

    public ptt(UserId userId, boolean z, boolean z2, boolean z3, boolean z4, List list) {
        this.s = userId;
        this.t = z;
        this.v = z2;
        this.w = z3;
        this.x = z4;
        this.y = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0387  */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v7, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r4v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [org.json.JSONArray] */
    @Override // xsna.xz2, xsna.nx2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(l7r0 l7r0Var) {
        int i;
        JSONObject jSONObject;
        ?? r10;
        List list;
        ?? r102;
        JSONObject jSONObject2;
        SearchGetHintsWithAttachments.Response response;
        VKList vKList;
        PosterSettings posterSettings;
        int i2;
        DonutPostingSettings donutPostingSettings;
        JSONObject optJSONObject;
        ArrayList arrayList;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        ?? jSONObject3 = new JSONObject();
        ?? r5 = (JSONObject) yfb.z(xqu.e(new zqu(), null, Collections.singletonList(GroupsFilterDto.EDITOR), e43.l(GroupsFieldsDto.WALL, GroupsFieldsDto.CAN_POST_DONUT), 20, 81), new gt(24)).f(l7r0Var);
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = r5.getJSONArray("items");
        if (jSONArray2 != null) {
            int length = jSONArray2.length();
            i = 0;
            for (int i3 = 0; i3 < length; i3++) {
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i3);
                if (epx.f(jSONObject4.optString("deactivated"), "banned")) {
                    i++;
                } else {
                    jSONArray.put(jSONObject4);
                }
            }
        } else {
            i = 0;
        }
        r5.put("items", jSONArray);
        jSONObject3.put("groups", r5);
        jSONObject3.put("deactivatedCount", i);
        boolean z = this.t;
        UserId userId = this.s;
        if (z) {
            jSONObject3.put("settings", (JSONObject) yfb.z(lax0.k(new max0(), userId, null, 14), new gt(24)).f(l7r0Var));
        }
        jSONObject3.put("mentions", new SearchGetHintsWithAttachments(null, 100, e43.l("photo_base", X3.j.D, "verified", "trending", "is_nft", "is_nft_photo")).F0(l7r0Var));
        if (this.u) {
            jSONObject3.put("bestFriends", (JSONObject) yfb.z(jgz.h(new jgz(10), e43.l(UsersFieldsDto.PHOTO_BASE, UsersFieldsDto.IS_NFT), 10), new gt(24)).f(l7r0Var));
        }
        if (this.v) {
            jSONObject3.put("listsFriends", (JSONObject) yfb.z(nts.f(new ots(), userId, 6), new gt(24)).f(l7r0Var));
        }
        if (this.w) {
            List l = e43.l(UsersFieldsDto.PHOTO_BASE, UsersFieldsDto.IS_NFT);
            List<UserId> list2 = (58 & 1) != 0 ? null : this.y;
            if ((58 & 4) != 0) {
                l = null;
            }
            jSONObject3.put("forbiddenFriends", (JSONArray) yfb.z(s1r0.a.b(list2, null, l, null, null), new vt1(28)).f(l7r0Var));
        }
        if (this.x) {
            List singletonList = Collections.singletonList(userId);
            if ((62 & 1) != 0) {
                singletonList = null;
            }
            jSONObject = null;
            jSONObject3.put("isProfileClosed", ((UsersUserFullDto) j5g.Y((List) yfb.x(s1r0.a.b(singletonList, null, null, null, null)).f(l7r0Var))).T2());
        } else {
            jSONObject = null;
        }
        JSONObject optJSONObject4 = jSONObject3.optJSONObject("settings");
        SearchGetHintsWithAttachments.Response a = SearchGetHintsWithAttachments.a.a(jSONObject3.optJSONObject("mentions"));
        VkPaginationList a2 = tav0.a(jSONObject3.optJSONObject("bestFriends"), new leq(28));
        JSONObject optJSONObject5 = jSONObject3.optJSONObject("listsFriends");
        ?? optJSONArray3 = optJSONObject5 != null ? optJSONObject5.optJSONArray("items") : jSONObject;
        Serializer.c<ListFriends> cVar = ListFriends.CREATOR;
        if (optJSONArray3 != 0) {
            r10 = new ArrayList(optJSONArray3.length());
            int length2 = optJSONArray3.length();
            for (int i4 = 0; i4 < length2; i4++) {
                JSONObject optJSONObject6 = optJSONArray3.optJSONObject(i4);
                if (optJSONObject6 != null) {
                    r10.add(ListFriends.a.a(optJSONObject6));
                }
            }
        } else {
            r10 = jSONObject;
        }
        if (r10 == 0 || (list = j5g.O0(r10)) == null) {
            list = EmptyList.b;
        }
        List list3 = list;
        JSONArray optJSONArray4 = jSONObject3.optJSONArray("forbiddenFriends");
        if (optJSONArray4 != null) {
            r102 = new ArrayList(optJSONArray4.length());
            int length3 = optJSONArray4.length();
            for (int i5 = 0; i5 < length3; i5++) {
                JSONObject jSONObject5 = optJSONArray4.getJSONObject(i5);
                Serializer.c<ProfileFriendItem> cVar2 = ProfileFriendItem.CREATOR;
                r102.add(ProfileFriendItem.a.a(jSONObject5));
            }
        } else {
            r102 = EmptyList.b;
        }
        List list4 = r102;
        boolean optBoolean = jSONObject3.optBoolean("isProfileClosed");
        JSONObject optJSONObject7 = optJSONObject4 != null ? optJSONObject4.optJSONObject("attachments") : jSONObject;
        boolean optBoolean2 = optJSONObject7 != null ? optJSONObject7.optBoolean("is_online_booking_attachment_available") : false;
        boolean optBoolean3 = optJSONObject7 != null ? optJSONObject7.optBoolean("is_market_link_attachment_available") : false;
        boolean optBoolean4 = optJSONObject7 != null ? optJSONObject7.optBoolean("is_message_to_bc_attachment_available", false) : false;
        VKList vKList2 = new VKList(jSONObject3.optJSONObject("groups"), Group.z0);
        tav0.b(jSONObject3.optJSONObject("music"), MusicTrack.e0);
        JSONObject optJSONObject8 = jSONObject3.optJSONObject("videos");
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (optJSONObject8 == null || (optJSONArray2 = optJSONObject8.optJSONArray("profiles")) == null) {
                jSONObject2 = jSONObject3;
                response = a;
                vKList = vKList2;
            } else {
                int length4 = optJSONArray2.length();
                vKList = vKList2;
                int i6 = 0;
                JSONObject jSONObject6 = jSONObject3;
                while (i6 < length4) {
                    int i7 = length4;
                    try {
                        JSONObject jSONObject7 = optJSONArray2.getJSONObject(i6);
                        int i8 = i6;
                        jSONObject2 = jSONObject6;
                        response = a;
                        try {
                            UserId userId2 = new UserId(jSONObject7.optLong("id"));
                            String str = jSONObject7.optString("first_name") + ' ' + jSONObject7.optString("last_name");
                            String optString = jSONObject7.optString("photo_base", jSONObject7.optString("photo_200", jSONObject7.optString("photo_100", jSONObject7.optString("photo_50"))));
                            linkedHashMap.put(userId2, str);
                            linkedHashMap2.put(userId2, optString);
                            i6 = i8 + 1;
                            length4 = i7;
                            jSONObject6 = jSONObject2;
                            a = response;
                        } catch (Exception unused) {
                            new VkPaginationList(new ArrayList(), 0, false, 0, 14, null);
                            JSONObject jSONObject8 = jSONObject2;
                            tav0.b(jSONObject8.optJSONObject("docs"), Document.u);
                            tav0.b(jSONObject8.optJSONObject("places"), GeoLocation.o);
                            SearchGetHintsWithAttachments.Response response2 = response;
                            VkPaginationList<UserProfile> vkPaginationList = response2.b;
                            List<Attachment> list5 = response2.c;
                            Serializer.c<PosterSettings> cVar3 = PosterSettings.CREATOR;
                            posterSettings = PosterSettings.a.a(optJSONObject4.optJSONObject("poster"));
                            i2 = 80;
                            if (optJSONObject4 != null) {
                                i2 = optJSONObject2.optInt("question_max_length", 80);
                            }
                            int i9 = i2;
                            if (optJSONObject4 != null) {
                            }
                            donutPostingSettings = null;
                            return new olc0(vKList, vkPaginationList, list5, posterSettings, i9, donutPostingSettings, a2, list3, list4, optBoolean, optBoolean2, optBoolean3, optBoolean4);
                        }
                    } catch (Exception unused2) {
                        jSONObject2 = jSONObject6;
                        response = a;
                        new VkPaginationList(new ArrayList(), 0, false, 0, 14, null);
                        JSONObject jSONObject82 = jSONObject2;
                        tav0.b(jSONObject82.optJSONObject("docs"), Document.u);
                        tav0.b(jSONObject82.optJSONObject("places"), GeoLocation.o);
                        SearchGetHintsWithAttachments.Response response22 = response;
                        VkPaginationList<UserProfile> vkPaginationList2 = response22.b;
                        List<Attachment> list52 = response22.c;
                        Serializer.c<PosterSettings> cVar32 = PosterSettings.CREATOR;
                        posterSettings = PosterSettings.a.a(optJSONObject4.optJSONObject("poster"));
                        i2 = 80;
                        if (optJSONObject4 != null) {
                        }
                        int i92 = i2;
                        if (optJSONObject4 != null) {
                        }
                        donutPostingSettings = null;
                        return new olc0(vKList, vkPaginationList2, list52, posterSettings, i92, donutPostingSettings, a2, list3, list4, optBoolean, optBoolean2, optBoolean3, optBoolean4);
                    }
                }
                jSONObject2 = jSONObject6;
                response = a;
            }
            if (optJSONObject8 != null && (optJSONObject3 = optJSONObject8.optJSONObject("groups")) != null && (optJSONArray = optJSONObject3.optJSONArray("groups")) != null) {
                int length5 = optJSONArray.length();
                int i10 = 0;
                while (i10 < length5) {
                    JSONObject jSONObject9 = optJSONArray.getJSONObject(i10);
                    int i11 = length5;
                    int i12 = i10;
                    UserId userId3 = new UserId(-jSONObject9.optLong("id"));
                    String optString2 = jSONObject9.optString("name");
                    String optString3 = jSONObject9.optString("photo_base", jSONObject9.optString("photo_200", jSONObject9.optString("photo_100", jSONObject9.optString("photo_50"))));
                    linkedHashMap.put(userId3, optString2);
                    linkedHashMap2.put(userId3, optString3);
                    i10 = i12 + 1;
                    length5 = i11;
                }
            }
            tav0.a(optJSONObject8, new a5(25, linkedHashMap, linkedHashMap2));
        } catch (Exception unused3) {
            jSONObject2 = jSONObject3;
            response = a;
            vKList = vKList2;
        }
        JSONObject jSONObject822 = jSONObject2;
        tav0.b(jSONObject822.optJSONObject("docs"), Document.u);
        tav0.b(jSONObject822.optJSONObject("places"), GeoLocation.o);
        SearchGetHintsWithAttachments.Response response222 = response;
        VkPaginationList<UserProfile> vkPaginationList22 = response222.b;
        List<Attachment> list522 = response222.c;
        try {
            Serializer.c<PosterSettings> cVar322 = PosterSettings.CREATOR;
            posterSettings = PosterSettings.a.a(optJSONObject4.optJSONObject("poster"));
        } catch (Exception unused4) {
            posterSettings = null;
        }
        i2 = 80;
        if (optJSONObject4 != null && (optJSONObject2 = optJSONObject4.optJSONObject("voting")) != null) {
            i2 = optJSONObject2.optInt("question_max_length", 80);
        }
        int i922 = i2;
        if (optJSONObject4 != null || (optJSONObject = optJSONObject4.optJSONObject("donut")) == null) {
            donutPostingSettings = null;
        } else {
            Serializer.c<DonutPostingSettings> cVar4 = DonutPostingSettings.CREATOR;
            JSONArray optJSONArray5 = optJSONObject.optJSONArray("durations");
            if (optJSONArray5 != null) {
                arrayList = new ArrayList(optJSONArray5.length());
                int length6 = optJSONArray5.length();
                for (int i13 = 0; i13 < length6; i13++) {
                    JSONObject optJSONObject9 = optJSONArray5.optJSONObject(i13);
                    if (optJSONObject9 != null) {
                        arrayList.add(new DonutPostingSettings.Duration(optJSONObject9.optInt("id"), optJSONObject9.optString("name")));
                    }
                }
            } else {
                arrayList = null;
            }
            donutPostingSettings = new DonutPostingSettings(arrayList);
        }
        return new olc0(vKList, vkPaginationList22, list522, posterSettings, i922, donutPostingSettings, a2, list3, list4, optBoolean, optBoolean2, optBoolean3, optBoolean4);
    }
}
