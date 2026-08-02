package xsna;

import android.text.TextUtils;
import android.util.ArrayMap;
import androidx.core.app.NotificationCompat;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.common.links.LinksParserData;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.GroupsSuggestions;
import com.vk.dto.common.Image;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.community.ReBookingBannerData;
import com.vk.dto.community.entries.widget.Widget;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupAgeMark;
import com.vk.dto.group.GroupChannelBlock;
import com.vk.dto.group.GroupChannelInfo;
import com.vk.dto.group.GroupContentSectionsData;
import com.vk.dto.group.GroupContentTabSetting;
import com.vk.dto.group.GroupContentTabType;
import com.vk.dto.group.GroupLeaveMode;
import com.vk.dto.group.GroupMarketInfo;
import com.vk.dto.group.creation_onboarding.GroupCreationOnboarding;
import com.vk.dto.group.primaryblock.GroupsPrimaryBlockSettings;
import com.vk.dto.group.primaryblock.GroupsPrimaryBlockViewSettings;
import com.vk.dto.music.Artist;
import com.vk.dto.profile.Address;
import com.vk.dto.profile.CatchUpBanner;
import com.vk.dto.profile.CommunityInternalMenu$Companion$MenuItemType;
import com.vk.dto.profile.Donut;
import com.vk.dto.stories.entities.PromoInfo;
import com.vk.dto.stories.model.SimpleStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.deactivation.Deactivation;
import com.vk.dto.user.deactivation.DeactivationWithMessage;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.z4h;

/* compiled from: GetFullCommunity.java */
/* loaded from: classes15.dex */
public final class nrt extends prt<ExtendedCommunityProfile> {
    public final UserId v;
    public final zcp w;
    public final qdz x;
    public final aay<UserProfile> y;

    public nrt(UserId userId, String str, boolean z, qj4 qj4Var, b9 b9Var, String str2, aay aayVar) {
        super(userId, "execute.getFullGroupNewNew", z, qj4Var, b9Var);
        this.w = fwx0.c();
        this.x = xwk.d();
        this.y = aayVar;
        F(fkq0.e(userId), "group_id");
        C(63, "func_v");
        this.v = userId;
        if (!TextUtils.isEmpty(str)) {
            K("source", str);
        }
        C(1, "photo_sizes");
        C(1, "skip_hidden");
        C(15, "good_count");
        if (!TextUtils.isEmpty(str2)) {
            K("additional_fields", str2);
        }
        C(1, "need_market_albums");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList<ExtendedUserProfile.Link> N0(JSONArray jSONArray, Boolean bool) throws JSONException {
        String str;
        ArrayList<ExtendedUserProfile.Link> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            ExtendedUserProfile.Link link = new ExtendedUserProfile.Link();
            link.b = jSONObject.getString("url");
            String string = jSONObject.getString("name");
            link.c = string;
            if (string == null || string.length() == 0) {
                link.c = link.b;
            }
            link.d = jSONObject.optString(CampaignEx.JSON_KEY_DESC, "");
            String a = cqm0.a(jSONObject.optString("photo_base"));
            if (a != null) {
                a = js5.a(480, a);
            }
            String a2 = cqm0.a(jSONObject.optString("photo_200"));
            String a3 = cqm0.a(jSONObject.optString("photo_100"));
            String a4 = cqm0.a(jSONObject.optString("photo_50"));
            String str2 = null;
            if (iah0.f().density > 1.0f) {
                String[] strArr = {a, a3, a2, a4};
                for (int i2 = 0; i2 < 4; i2++) {
                    str = strArr[i2];
                    if (str != null) {
                        str2 = str;
                        break;
                    }
                }
                link.e = str2;
                if (str2 == null && bool.booleanValue()) {
                    int i3 = iah0.f().density <= 1.0f ? 100 : 50;
                    link.e = link.b.contains("//" + a0a.d + DomExceptionUtils.SEPARATOR) ? "https://" + a0a.d + "/images/lnkouter" + i3 + ".gif" : "https://" + a0a.d + "/images/lnkinner" + i3 + ".gif";
                }
                arrayList.add(link);
            } else {
                String[] strArr2 = {a, a4, a3, a2};
                for (int i4 = 0; i4 < 4; i4++) {
                    str = strArr2[i4];
                    if (str != null) {
                        str2 = str;
                        break;
                    }
                }
                link.e = str2;
                if (str2 == null) {
                    if (iah0.f().density <= 1.0f) {
                    }
                    if (link.b.contains("//" + a0a.d + DomExceptionUtils.SEPARATOR)) {
                    }
                    link.e = link.b.contains("//" + a0a.d + DomExceptionUtils.SEPARATOR) ? "https://" + a0a.d + "/images/lnkouter" + i3 + ".gif" : "https://" + a0a.d + "/images/lnkinner" + i3 + ".gif";
                }
                arrayList.add(link);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.ArrayList] */
    public static void P0(JSONObject jSONObject, ExtendedCommunityProfile extendedCommunityProfile) {
        ReBookingBannerData reBookingBannerData;
        ExtendedCommunityProfile extendedCommunityProfile2;
        ?? r10;
        ReBookingBannerData.RecordData recordData;
        JSONArray optJSONArray = jSONObject.optJSONArray("yclients_repeat_records");
        Serializer.c<ReBookingBannerData> cVar = ReBookingBannerData.CREATOR;
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                Serializer.c<ReBookingBannerData.RecordData> cVar2 = ReBookingBannerData.RecordData.CREATOR;
                int optInt = jSONObject2.optInt("id");
                Serializer.c<ReBookingBannerData.RecordData.Staff> cVar3 = ReBookingBannerData.RecordData.Staff.CREATOR;
                JSONObject optJSONObject = jSONObject2.optJSONObject("staff");
                ReBookingBannerData.RecordData.Staff staff = optJSONObject == null ? null : new ReBookingBannerData.RecordData.Staff(optJSONObject.optInt("id"), optJSONObject.optString("name"), optJSONObject.optString("avatar"));
                if (staff == null) {
                    recordData = null;
                } else {
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("services");
                    if (optJSONArray2 != null) {
                        r10 = new ArrayList(optJSONArray2.length());
                        int length2 = optJSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            JSONObject jSONObject3 = optJSONArray2.getJSONObject(i2);
                            Serializer.c<ReBookingBannerData.RecordData.Service> cVar4 = ReBookingBannerData.RecordData.Service.CREATOR;
                            r10.add(new ReBookingBannerData.RecordData.Service(jSONObject3.optInt("id"), jSONObject3.optString("title")));
                        }
                    } else {
                        r10 = 0;
                    }
                    if (r10 == 0) {
                        r10 = EmptyList.b;
                    }
                    recordData = new ReBookingBannerData.RecordData(optInt, staff, r10, jSONObject2.optString("services_count_text"));
                }
                if (recordData != null) {
                    arrayList.add(recordData);
                }
            }
            if (!arrayList.isEmpty()) {
                reBookingBannerData = new ReBookingBannerData(arrayList);
                extendedCommunityProfile2 = extendedCommunityProfile;
                extendedCommunityProfile2.H2 = reBookingBannerData;
            }
        }
        extendedCommunityProfile2 = extendedCommunityProfile;
        reBookingBannerData = null;
        extendedCommunityProfile2.H2 = reBookingBannerData;
    }

    @Override // xsna.prt
    public final ExtendedCommunityProfile F0() {
        return new ExtendedCommunityProfile();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x06b3  */
    @Override // xsna.prt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K0(ExtendedCommunityProfile extendedCommunityProfile, JSONObject jSONObject) throws JSONException {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Map map;
        GroupsPrimaryBlockSettings groupsPrimaryBlockSettings;
        GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark communityTrustMark;
        ArrayList arrayList;
        List list;
        JSONArray jSONArray;
        int i;
        int i2;
        Image image;
        JSONObject jSONObject2;
        JSONArray optJSONArray;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        UserId userId;
        int i3;
        JSONObject optJSONObject;
        LinkedHashMap linkedHashMap5;
        JSONArray jSONArray2;
        int i4;
        String str10;
        String str11;
        int i5;
        JSONArray optJSONArray2;
        ExtendedCommunityProfile extendedCommunityProfile2 = extendedCommunityProfile;
        if (!jSONObject.has("profiles") || (optJSONArray2 = jSONObject.optJSONArray("profiles")) == null) {
            linkedHashMap = null;
        } else {
            linkedHashMap = new LinkedHashMap();
            int length = optJSONArray2.length();
            for (int i6 = 0; i6 < length; i6++) {
                JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i6);
                if (optJSONObject2 != null) {
                    UserProfile a = this.y.a(optJSONObject2);
                    if (a == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    linkedHashMap.put(a.c, a);
                }
            }
        }
        LinksParserData linksParserData = new LinksParserData(779);
        UserProfile userProfile = extendedCommunityProfile2.a;
        userProfile.c = this.v;
        userProfile.e = jSONObject.getString("name");
        extendedCommunityProfile2.a.g = jSONObject.optString("photo_base");
        extendedCommunityProfile2.a.c0 = jSONObject.optString("thumb_hash", null);
        extendedCommunityProfile2.a.h = we7.q(jSONObject, iah0.f().density, z230.a);
        extendedCommunityProfile2.a.Y = jSONObject.optBoolean("is_nft_photo");
        extendedCommunityProfile2.j = jSONObject.optString("photo_base", jSONObject.optString("photo_400", jSONObject.optString("photo_200", jSONObject.optString("photo_100"))));
        extendedCommunityProfile2.r0 = jSONObject.optString("activity");
        String str12 = "status";
        JSONObject optJSONObject3 = jSONObject.optJSONObject("status");
        qdz qdzVar = this.x;
        zcp zcpVar = this.w;
        if (optJSONObject3 != null) {
            extendedCommunityProfile2.k = jSONObject.getJSONObject("status").optString("text");
            zcpVar.a(qdzVar.a().d(extendedCommunityProfile2.k, linksParserData));
        }
        String optString = jSONObject.optString("description");
        extendedCommunityProfile2.O0 = optString;
        if (optString != null) {
            extendedCommunityProfile2.X0 = zcpVar.a(qdzVar.a().d(extendedCommunityProfile2.O0, linksParserData));
            extendedCommunityProfile2.Y0 = zcpVar.a(qdzVar.a().d(extendedCommunityProfile2.O0.replace("\n", " ").trim(), linksParserData));
        }
        extendedCommunityProfile2.T = jSONObject.optInt("start_date");
        extendedCommunityProfile2.U = jSONObject.optInt("finish_date");
        extendedCommunityProfile2.V = jSONObject.optString("site");
        extendedCommunityProfile2.s2 = jSONObject.optInt("is_admin", 0) > 0;
        extendedCommunityProfile2.a0 = jSONObject.optInt("admin_level");
        extendedCommunityProfile2.b0 = jSONObject.optString("audio_artist_id");
        extendedCommunityProfile2.c0 = jSONObject.optString("audio_curator_id");
        extendedCommunityProfile2.a.B.Bb(jSONObject);
        extendedCommunityProfile2.e0 = jSONObject.optInt("can_message") == 1;
        if (jSONObject.has("deactivated")) {
            String optString2 = jSONObject.optString("deactivated");
            String optString3 = jSONObject.optString("deactivated_message");
            String optString4 = jSONObject.optString("deactivated_type");
            DeactivationWithMessage.a aVar = new DeactivationWithMessage.a();
            aVar.b(optString2);
            aVar.b = optString3;
            Deactivation.Type.Companion.getClass();
            aVar.e = epx.f(optString4, "geo_blocked") ? Deactivation.Type.GEO_BLOCKED : epx.f(optString4, "banned") ? Deactivation.Type.BANNED : null;
            extendedCommunityProfile2.q = aVar.a();
        }
        if (jSONObject.has("ban_info")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("ban_info");
            ExtendedUserProfile.e eVar = new ExtendedUserProfile.e();
            extendedCommunityProfile2.k1 = eVar;
            eVar.a = jSONObject3.optString("comment");
            extendedCommunityProfile2.k1.c = jSONObject3.optInt("reason");
            extendedCommunityProfile2.k1.b = jSONObject3.optInt("end_date");
        }
        if (jSONObject.has("invited_by_user")) {
            extendedCommunityProfile2.z1 = new UserProfile(jSONObject.getJSONObject("invited_by_user"));
        } else if (jSONObject.has("invited_by_group")) {
            extendedCommunityProfile2.z1 = new Group(jSONObject.getJSONObject("invited_by_group"));
        }
        if (jSONObject.isNull("country_name") || jSONObject.isNull("city_name")) {
            linkedHashMap2 = linkedHashMap;
            str = "admin_level";
            str2 = "text";
        } else {
            ArrayList arrayList2 = new ArrayList();
            if (jSONObject.has("country_name")) {
                arrayList2.add(jSONObject.getString("country_name"));
            }
            if (jSONObject.has("city_name")) {
                arrayList2.add(0, jSONObject.getString("city_name"));
            }
            linkedHashMap2 = linkedHashMap;
            if (jSONObject.has("place")) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("place");
                if (jSONObject4.has(RTCStatsConstants.KEY_ADDRESS)) {
                    arrayList2.add(0, jSONObject4.getString(RTCStatsConstants.KEY_ADDRESS));
                }
                str = "admin_level";
                str2 = "text";
                extendedCommunityProfile2.W = jSONObject4.optDouble("latitude", -9000.0d);
                extendedCommunityProfile2.X = jSONObject4.optDouble("longitude", -9000.0d);
            } else {
                str = "admin_level";
                str2 = "text";
                extendedCommunityProfile2.X = -9000.0d;
                extendedCommunityProfile2.W = -9000.0d;
            }
            extendedCommunityProfile2.s0 = TextUtils.join(", ", arrayList2);
        }
        extendedCommunityProfile2.a1 = jSONObject.optInt("is_member");
        extendedCommunityProfile2.Z = jSONObject.getInt("is_closed");
        extendedCommunityProfile2.f0 = jSONObject.optInt("can_see_all_posts") == 1;
        jSONObject.optInt("can_see_archived_posts");
        extendedCommunityProfile2.a1 = jSONObject.optInt("member_status", extendedCommunityProfile2.a1);
        extendedCommunityProfile2.d1 = jSONObject.optBoolean("can_subscribe_podcasts", false) && ((i5 = extendedCommunityProfile2.a1) == 3 || i5 == 1);
        extendedCommunityProfile2.e1 = jSONObject.optBoolean("is_subscribed_podcasts", false);
        if (extendedCommunityProfile2.a1 == 3) {
            extendedCommunityProfile2.a1 = 0;
        }
        if ("group".equals(jSONObject.getString("type"))) {
            extendedCommunityProfile2.Y = 0;
        }
        if (NotificationCompat.CATEGORY_EVENT.equals(jSONObject.getString("type"))) {
            extendedCommunityProfile2.Y = 1;
        }
        if ("page".equals(jSONObject.getString("type"))) {
            extendedCommunityProfile2.Y = 2;
        }
        extendedCommunityProfile2.g0 = jSONObject.optInt("can_post") == 1;
        extendedCommunityProfile2.h0 = jSONObject.optInt("can_suggest") == 1;
        if (jSONObject.has("photo_avg_color")) {
            extendedCommunityProfile2.n = jSONObject.getString("photo_avg_color");
        }
        if (jSONObject.has("wiki_page")) {
            extendedCommunityProfile2.u0 = jSONObject.getString("wiki_page");
        }
        String str13 = "links";
        if (jSONObject.has("links")) {
            extendedCommunityProfile2.G = N0(jSONObject.getJSONArray("links"), Boolean.TRUE);
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("contacts");
        String str14 = "";
        if (optJSONArray3 != null) {
            extendedCommunityProfile2.H = new ArrayList<>();
            JSONArray optJSONArray4 = jSONObject.optJSONArray("contacts_profiles");
            HashMap hashMap = new HashMap();
            str3 = "can_post";
            LinkedHashMap linkedHashMap6 = linkedHashMap2;
            if (optJSONArray4 != null) {
                int i7 = 0;
                while (i7 < optJSONArray4.length()) {
                    UserProfile userProfile2 = new UserProfile(optJSONArray4.getJSONObject(i7));
                    hashMap.put(userProfile2.c, userProfile2);
                    i7++;
                    str13 = str13;
                }
            }
            str4 = str13;
            linkedHashMap2 = linkedHashMap6;
            if (linkedHashMap6 != null) {
                hashMap.putAll(linkedHashMap2);
            }
            int i8 = 0;
            while (i8 < optJSONArray3.length()) {
                JSONObject optJSONObject4 = optJSONArray3.optJSONObject(i8);
                if (optJSONObject4 != null) {
                    ExtendedUserProfile.Contact contact = new ExtendedUserProfile.Contact();
                    i4 = i8;
                    contact.c = optJSONObject4.optString(CampaignEx.JSON_KEY_DESC, str14);
                    if (optJSONObject4.has("user_id")) {
                        str10 = str14;
                        str11 = str12;
                        contact.b = (UserProfile) hashMap.get(new UserId(optJSONObject4.getLong("user_id")));
                    } else {
                        str10 = str14;
                        str11 = str12;
                    }
                    contact.d = optJSONObject4.optString("email", null);
                    contact.e = optJSONObject4.optString("phone", null);
                    if (contact.b == null) {
                        String str15 = contact.d;
                        if (str15 != null) {
                            int length2 = str15.length();
                            int i9 = 0;
                            while (i9 < length2) {
                                int codePointAt = str15.codePointAt(i9);
                                if (!Character.isWhitespace(codePointAt)) {
                                    break;
                                } else {
                                    i9 += Character.charCount(codePointAt);
                                }
                            }
                        }
                        String str16 = contact.e;
                        if (str16 != null) {
                            int length3 = str16.length();
                            int i10 = 0;
                            while (i10 < length3) {
                                int codePointAt2 = str16.codePointAt(i10);
                                if (!Character.isWhitespace(codePointAt2)) {
                                    break;
                                } else {
                                    i10 += Character.charCount(codePointAt2);
                                }
                            }
                        }
                        String str17 = contact.c;
                        if (str17 != null) {
                            int length4 = str17.length();
                            int i11 = 0;
                            while (i11 < length4) {
                                int codePointAt3 = str17.codePointAt(i11);
                                if (Character.isWhitespace(codePointAt3)) {
                                    i11 += Character.charCount(codePointAt3);
                                }
                            }
                        }
                    }
                    extendedCommunityProfile2.H.add(contact);
                    break;
                } else {
                    i4 = i8;
                    str10 = str14;
                    str11 = str12;
                }
                i8 = i4 + 1;
                str12 = str11;
                str14 = str10;
            }
        } else {
            str3 = "can_post";
            str4 = "links";
        }
        String str18 = str14;
        String str19 = str12;
        JSONObject optJSONObject5 = jSONObject.optJSONObject("events");
        if (optJSONObject5 != null) {
            JSONArray optJSONArray5 = optJSONObject5.optJSONArray("events_info");
            Group.b bVar = Group.z0;
            if (optJSONArray5 == null) {
                linkedHashMap5 = null;
            } else {
                linkedHashMap5 = new LinkedHashMap();
                int length5 = optJSONArray5.length();
                int i12 = 0;
                while (i12 < length5) {
                    JSONObject optJSONObject6 = optJSONArray5.optJSONObject(i12);
                    if (optJSONObject6 != null) {
                        bVar.getClass();
                        jSONArray2 = optJSONArray5;
                        Group group = new Group(optJSONObject6);
                        linkedHashMap5.put(group.c, group);
                    } else {
                        jSONArray2 = optJSONArray5;
                    }
                    i12++;
                    optJSONArray5 = jSONArray2;
                }
            }
            if (linkedHashMap5 != null && linkedHashMap5.size() > 0) {
                ArrayList arrayList3 = new ArrayList();
                JSONArray optJSONArray6 = optJSONObject5.optJSONArray("event_ids");
                if (optJSONArray6 != null) {
                    for (int i13 = 0; i13 < optJSONArray6.length(); i13++) {
                        Group group2 = (Group) linkedHashMap5.get(Integer.valueOf(optJSONArray6.optInt(i13)));
                        if (group2 != null) {
                            arrayList3.add(group2);
                        }
                    }
                }
            }
        }
        JSONArray optJSONArray7 = jSONObject.optJSONArray("artists");
        if (optJSONArray7 != null && optJSONArray7.length() > 0) {
            ArrayList<Artist> arrayList4 = new ArrayList<>();
            for (int i14 = 0; i14 < optJSONArray7.length(); i14++) {
                JSONObject optJSONObject7 = optJSONArray7.optJSONObject(i14);
                if (optJSONObject7 != null) {
                    arrayList4.add(new Artist(optJSONObject7));
                }
            }
            extendedCommunityProfile2.l2 = arrayList4;
        }
        JSONObject optJSONObject8 = jSONObject.optJSONObject("members_preview");
        if (optJSONObject8 != null) {
            JSONArray optJSONArray8 = optJSONObject8.optJSONArray("friends_ids");
            if (optJSONArray8 != null && linkedHashMap2 != null) {
                extendedCommunityProfile2.I = new ArrayList<>();
                for (int i15 = 0; i15 < optJSONArray8.length(); i15++) {
                    UserProfile userProfile3 = (UserProfile) linkedHashMap2.get(new UserId(optJSONArray8.optLong(i15)));
                    if (userProfile3 != null) {
                        extendedCommunityProfile2.I.add(userProfile3);
                    }
                }
            }
            JSONArray optJSONArray9 = optJSONObject8.optJSONArray("members_ids");
            if (optJSONArray9 != null && linkedHashMap2 != null) {
                extendedCommunityProfile2.Q2 = new ArrayList();
                for (int i16 = 0; i16 < optJSONArray9.length(); i16++) {
                    UserProfile userProfile4 = (UserProfile) linkedHashMap2.get(new UserId(optJSONArray9.optLong(i16)));
                    if (userProfile4 != null) {
                        extendedCommunityProfile2.Q2.add(userProfile4);
                    }
                }
            }
        }
        JSONObject optJSONObject9 = jSONObject.optJSONObject("widget");
        if (optJSONObject9 != null && optJSONObject9.optInt("type", -1) != -1) {
            extendedCommunityProfile2.w1 = Widget.a.a(optJSONObject9);
        }
        JSONObject optJSONObject10 = jSONObject.optJSONObject("wall");
        if (optJSONObject10 != null) {
            z = false;
            extendedCommunityProfile2.d0 = optJSONObject10.optInt("value", 0);
        } else {
            z = false;
            extendedCommunityProfile2.d0 = jSONObject.optInt("wall", 0);
        }
        extendedCommunityProfile2.E1 = jSONObject.optBoolean("using_vkpay_market_app", z);
        extendedCommunityProfile2.F1 = jSONObject.optBoolean("has_market_app", z);
        JSONObject optJSONObject11 = jSONObject.optJSONObject("addresses");
        if (optJSONObject11 != null) {
            if (optJSONObject11.has("items")) {
                ArrayList<Address> Ab = Address.Ab(optJSONObject11);
                if (Ab != null && !Ab.isEmpty()) {
                    extendedCommunityProfile2.W1 = Ab.get(0);
                }
            } else {
                JSONObject optJSONObject12 = optJSONObject11.optJSONObject("main_address");
                if (optJSONObject11.optBoolean("is_enabled") && optJSONObject12 != null) {
                    extendedCommunityProfile2.W1 = new Address(optJSONObject12);
                }
            }
            extendedCommunityProfile2.Z1 = optJSONObject11.optInt("count");
            extendedCommunityProfile2.a2 = optJSONObject11.optBoolean("has_addresses", false);
        }
        JSONObject optJSONObject13 = jSONObject.optJSONObject("action_button");
        if (optJSONObject13 != null) {
            ja9 ja9Var = new ja9();
            String optString5 = optJSONObject13.optString("action_type");
            if (optString5 != null) {
                switch (optString5.hashCode()) {
                    case -1699113812:
                        str5 = "count";
                        if (optString5.equals("open_group_app")) {
                            i3 = 6;
                            break;
                        }
                        i3 = -1;
                        break;
                    case -1472831294:
                        str5 = "count";
                        if (optString5.equals("open_internal_url")) {
                            i3 = 4;
                            break;
                        }
                        i3 = -1;
                        break;
                    case -706023217:
                        str5 = "count";
                        if (optString5.equals("service_booking")) {
                            i3 = 7;
                            break;
                        }
                        i3 = -1;
                        break;
                    case -504325460:
                        str5 = "count";
                        if (optString5.equals("open_app")) {
                            i3 = 5;
                            break;
                        }
                        i3 = -1;
                        break;
                    case -504306182:
                        str5 = "count";
                        if (optString5.equals("open_url")) {
                            i3 = 3;
                            break;
                        }
                        i3 = -1;
                        break;
                    case 548631606:
                        str5 = "count";
                        if (optString5.equals("call_vk")) {
                            i3 = 2;
                            break;
                        }
                        i3 = -1;
                        break;
                    case 814528549:
                        str5 = "count";
                        if (optString5.equals("send_email")) {
                            i3 = 0;
                            break;
                        }
                        i3 = -1;
                        break;
                    case 1928092749:
                        str5 = "count";
                        if (optString5.equals("call_phone")) {
                            i3 = 1;
                            break;
                        }
                        i3 = -1;
                        break;
                }
                ja9Var.a = i3;
                ja9Var.b = optJSONObject13.optString("title");
                optJSONObject = optJSONObject13.optJSONObject("target");
                if (optJSONObject == null) {
                    str6 = "is_enabled";
                    str7 = "items";
                    ja9Var.c = new UserId(optJSONObject.optLong("user_id"));
                    ja9Var.e = optJSONObject.optString("email");
                    ja9Var.f = optJSONObject.optString("phone");
                    ja9Var.g = optJSONObject.optString("url");
                    optJSONObject.optString("schema");
                    ja9Var.d = optJSONObject.optInt("app_id");
                    ja9Var.h = optJSONObject.optBoolean("is_internal");
                    ja9Var.i = optJSONObject.optString("google_store_url");
                } else {
                    str6 = "is_enabled";
                    str7 = "items";
                }
                extendedCommunityProfile2.X1 = ja9Var;
            }
            str5 = "count";
            i3 = -1;
            ja9Var.a = i3;
            ja9Var.b = optJSONObject13.optString("title");
            optJSONObject = optJSONObject13.optJSONObject("target");
            if (optJSONObject == null) {
            }
            extendedCommunityProfile2.X1 = ja9Var;
        } else {
            str5 = "count";
            str6 = "is_enabled";
            str7 = "items";
        }
        extendedCommunityProfile2.t0 = jSONObject.optString("phone");
        int optInt = jSONObject.optInt("start_date", 0);
        extendedCommunityProfile2.Y1 = optInt;
        if (optInt > 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(1, extendedCommunityProfile2.Y1 / 10000);
            calendar.set(2, ((extendedCommunityProfile2.Y1 % 10000) / 100) - 1);
            calendar.set(5, extendedCommunityProfile2.Y1 % 100);
            extendedCommunityProfile2.Y1 = (int) (calendar.getTimeInMillis() / 1000);
        }
        boolean z2 = jSONObject.optInt("is_messages_blocked", 1) == 0;
        extendedCommunityProfile2.c2 = z2;
        extendedCommunityProfile2.a.I = z2;
        extendedCommunityProfile2.J1 = jSONObject.optBoolean("has_live_cover", false);
        if (jSONObject.has("live_covers")) {
            JSONObject jSONObject5 = jSONObject.getJSONObject("live_covers");
            extendedCommunityProfile2.e2 = jSONObject5.optBoolean("is_scalable", false);
            str8 = str7;
            if (jSONObject5.has(str8) && (optJSONArray = (jSONObject2 = jSONObject5.getJSONObject(str8)).optJSONArray(str8)) != null) {
                JSONArray optJSONArray10 = jSONObject2.optJSONArray("profiles");
                UserProfile.b bVar2 = UserProfile.g0;
                if (optJSONArray10 == null) {
                    linkedHashMap3 = null;
                } else {
                    linkedHashMap3 = new LinkedHashMap();
                    int length6 = optJSONArray10.length();
                    for (int i17 = 0; i17 < length6; i17++) {
                        JSONObject optJSONObject14 = optJSONArray10.optJSONObject(i17);
                        if (optJSONObject14 != null) {
                            Object a2 = bVar2.a(optJSONObject14);
                            linkedHashMap3.put(((UserProfile) a2).c, a2);
                        }
                    }
                }
                JSONArray optJSONArray11 = jSONObject2.optJSONArray("groups");
                Group.b bVar3 = Group.z0;
                if (optJSONArray11 == null) {
                    linkedHashMap4 = null;
                } else {
                    linkedHashMap4 = new LinkedHashMap();
                    int length7 = optJSONArray11.length();
                    for (int i18 = 0; i18 < length7; i18++) {
                        JSONObject optJSONObject15 = optJSONArray11.optJSONObject(i18);
                        if (optJSONObject15 != null) {
                            bVar3.getClass();
                            Group group3 = new Group(optJSONObject15);
                            linkedHashMap4.put(group3.c, group3);
                        }
                    }
                }
                ArrayMap r = tci.r(jSONObject);
                Serializer.c<StoriesContainer> cVar = SimpleStoriesContainer.CREATOR;
                ArrayList Vb = StoryEntry.Vb(optJSONArray, linkedHashMap3, linkedHashMap4, r);
                StoryEntry storyEntry = (StoryEntry) j5g.a0(Vb);
                if (storyEntry == null || (userId = storyEntry.d) == null) {
                    userId = UserId.d;
                }
                PromoInfo promoInfo = storyEntry != null ? storyEntry.t : null;
                SimpleStoriesContainer simpleStoriesContainer = new SimpleStoriesContainer(fkq0.b(userId) ? new StoryOwner.Community((Group) linkedHashMap4.get(fkq0.e(userId)), promoInfo) : new StoryOwner.User((UserProfile) linkedHashMap3.get(userId), promoInfo), Vb, null, false, 12, null);
                boolean z3 = true;
                ArrayList<StoriesContainer> arrayList5 = new ArrayList<>(1);
                Iterator<StoryEntry> it = simpleStoriesContainer.g.iterator();
                while (it.hasNext()) {
                    VideoFile videoFile = it.next().n;
                    if (videoFile != null) {
                        videoFile.setCover(z3);
                    }
                    z3 = true;
                }
                arrayList5.add(simpleStoriesContainer);
                extendedCommunityProfile2.d2 = arrayList5;
            }
        } else {
            str8 = str7;
        }
        JSONObject optJSONObject16 = jSONObject.optJSONObject("online_status");
        if (optJSONObject16 != null) {
            mp80 mp80Var = new mp80();
            str9 = str19;
            String optString6 = optJSONObject16.optString(str9);
            if (optString6 != null) {
                int hashCode = optString6.hashCode();
                if (hashCode != -1012222381) {
                    if (hashCode != -311712082) {
                        if (hashCode == 3387192 && optString6.equals("none")) {
                            mp80Var.a = 0;
                        }
                    } else if (optString6.equals("answer_mark")) {
                        mp80Var.a = 2;
                    }
                } else if (optString6.equals(eok.ONLINE_EXTRAS_KEY)) {
                    mp80Var.a = 1;
                }
            }
            mp80Var.b = optJSONObject16.optInt("minutes");
            extendedCommunityProfile2.f2 = mp80Var;
        } else {
            str9 = str19;
        }
        JSONObject optJSONObject17 = jSONObject.optJSONObject("menu");
        if (optJSONObject17 != null) {
            JSONArray optJSONArray12 = optJSONObject17.optJSONArray(str8);
            if (optJSONArray12 != null) {
                arrayList = new ArrayList(optJSONArray12.length());
                int length8 = optJSONArray12.length();
                int i19 = 0;
                while (i19 < length8) {
                    JSONObject optJSONObject18 = optJSONArray12.optJSONObject(i19);
                    if (optJSONObject18 != null) {
                        JSONArray optJSONArray13 = optJSONObject18.optJSONArray("cover");
                        String optString7 = optJSONObject18.optString("type");
                        jSONArray = optJSONArray12;
                        CommunityInternalMenu$Companion$MenuItemType communityInternalMenu$Companion$MenuItemType = epx.f(optString7, MBridgeConstans.DYNAMIC_VIEW_WX_APP) ? CommunityInternalMenu$Companion$MenuItemType.BUSINESS_APP : CommunityInternalMenu$Companion$MenuItemType.REGULAR;
                        String optString8 = optJSONObject18.optString("title");
                        String obj = drm0.p0(optJSONObject18.optString("url")).toString();
                        int optInt2 = optJSONObject18.optInt("id");
                        if (optJSONArray13 != null) {
                            i = length8;
                            i2 = i19;
                            image = new Image(optJSONArray13, null, 2, null);
                        } else {
                            i = length8;
                            i2 = i19;
                            image = null;
                        }
                        arrayList.add(new z4h.a(optInt2, optString7, optString8, obj, image, optJSONObject18.optInt("counter"), communityInternalMenu$Companion$MenuItemType, optJSONObject18.optBoolean("is_hidden"), 256));
                    } else {
                        jSONArray = optJSONArray12;
                        i = length8;
                        i2 = i19;
                    }
                    i19 = i2 + 1;
                    optJSONArray12 = jSONArray;
                    length8 = i;
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null || (list = j5g.O0(arrayList)) == null) {
                list = EmptyList.b;
            }
            extendedCommunityProfile2.g2 = new z4h(list, optJSONObject17.optBoolean("is_hidden"), optJSONObject17.optBoolean("can_add"), null);
        }
        JSONObject optJSONObject19 = jSONObject.optJSONObject("donut");
        if (optJSONObject19 != null) {
            Serializer.c<Donut> cVar2 = Donut.CREATOR;
            extendedCommunityProfile2.t2 = Donut.a.a(optJSONObject19);
        }
        extendedCommunityProfile2.L1 = jSONObject.optInt("can_post_donut", 0) == 1;
        JSONObject optJSONObject20 = jSONObject.optJSONObject("warning_notification");
        if (optJSONObject20 != null) {
            extendedCommunityProfile2.h2 = new hbx0(optJSONObject20);
        }
        extendedCommunityProfile2.k2 = jSONObject.optInt(str) > 1;
        extendedCommunityProfile2.i2 = jSONObject.optInt("unread_conversation_count");
        JSONObject optJSONObject21 = jSONObject.optJSONObject("ads_easy_promote");
        if (optJSONObject21 != null) {
            extendedCommunityProfile2.j2 = new ExtendedCommunityProfile.a(optJSONObject21);
        }
        JSONObject optJSONObject22 = jSONObject.optJSONObject("ads_market_easy_promote");
        if (optJSONObject22 != null) {
            extendedCommunityProfile2.R = new ExtendedUserProfile.b(optJSONObject22);
        }
        JSONObject optJSONObject23 = jSONObject.optJSONObject("ads_market_services_easy_promote");
        if (optJSONObject23 != null) {
            extendedCommunityProfile2.S = new ExtendedUserProfile.b(optJSONObject23);
        }
        extendedCommunityProfile2.x = jSONObject.optBoolean("can_see_members", true);
        extendedCommunityProfile2.m2 = jSONObject.optInt("can_report", 0) == 1;
        JSONObject optJSONObject24 = jSONObject.optJSONObject("chats_status");
        if (optJSONObject24 != null) {
            optJSONObject24.optBoolean(str6);
            optJSONObject24.optInt(str5);
            optJSONObject24.optInt("activity_count");
        }
        JSONObject optJSONObject25 = jSONObject.optJSONObject("suggestions_permanent");
        if (optJSONObject25 != null) {
            Serializer.c<GroupsSuggestions> cVar3 = GroupsSuggestions.CREATOR;
            map = null;
            extendedCommunityProfile2.o2 = GroupsSuggestions.a.a(optJSONObject25, null);
        } else {
            map = null;
        }
        JSONObject optJSONObject26 = jSONObject.optJSONObject("suggestions_on_subscribe");
        if (optJSONObject26 != null) {
            Serializer.c<GroupsSuggestions> cVar4 = GroupsSuggestions.CREATOR;
            extendedCommunityProfile2.n2 = GroupsSuggestions.a.a(optJSONObject26, map);
        }
        extendedCommunityProfile2.p2 = jSONObject.optInt("has_suggestions", 0) == 1;
        boolean optBoolean = jSONObject.optBoolean("is_market_cart_enabled", false);
        extendedCommunityProfile2.q2 = optBoolean;
        if (optBoolean) {
            extendedCommunityProfile2.r2 = jSONObject.optInt("totalCartQuantity");
        }
        JSONObject optJSONObject27 = jSONObject.optJSONObject("header_catch_up_link");
        if (optJSONObject27 != null) {
            Serializer.c<CatchUpBanner> cVar5 = CatchUpBanner.CREATOR;
            extendedCommunityProfile2.v2 = CatchUpBanner.a.a(optJSONObject27);
        }
        extendedCommunityProfile2.x2 = jSONObject.optString("is_business", str18).equals("1");
        extendedCommunityProfile2.y2 = jSONObject.optBoolean("is_business_category", false);
        extendedCommunityProfile2.w2 = jSONObject.optInt("can_upload_clip") == 1;
        extendedCommunityProfile2.y1 = jSONObject.optInt("can_upload_story") == 1;
        JSONObject optJSONObject28 = jSONObject.optJSONObject("extended_market");
        if (optJSONObject28 != null) {
            optJSONObject28.optInt(str9);
            optJSONObject28.optString("title");
            optJSONObject28.optString(str2);
            optJSONObject28.optString("ok_button");
            optJSONObject28.optString("back_button");
        }
        JSONObject optJSONObject29 = jSONObject.optJSONObject("recommended_tips_widget");
        extendedCommunityProfile2.G2 = (optJSONObject29 == null || optJSONObject29.optBoolean("section_hidden")) ? map : new zwg(optJSONObject29.optInt("tips_total"), optJSONObject29.optInt("tips_completed"), optJSONObject29.optString("widget_img_url"), optJSONObject29.optString("widget_img_url_dark"));
        P0(jSONObject, extendedCommunityProfile2);
        JSONObject optJSONObject30 = jSONObject.optJSONObject("banner_ads_main_client");
        if (optJSONObject30 != null) {
            Serializer.c<CatchUpBanner> cVar6 = CatchUpBanner.CREATOR;
            extendedCommunityProfile2.I2 = CatchUpBanner.a.a(optJSONObject30);
        }
        jSONObject.optBoolean("business_community_tooltips");
        extendedCommunityProfile2.z2 = jSONObject.optBoolean("is_government_organization");
        int optInt3 = jSONObject.optInt("trust_mark", 0);
        extendedCommunityProfile2.A2 = optInt3 == GroupsGroupFullDto.TrustMarkDto.IS_NCO_ORGANIZATION.i() || optInt3 == GroupsGroupFullDto.TrustMarkDto.NCO_ORGANIZATION_AND_OTHERS.i();
        extendedCommunityProfile2.B2 = optInt3 == GroupsGroupFullDto.TrustMarkDto.NCO_ORGANIZATION_AND_OTHERS.i();
        JSONObject optJSONObject31 = jSONObject.optJSONObject(CampaignEx.JSON_KEY_STAR);
        if (optJSONObject31 != null) {
            ExtendedCommunityProfile.d dVar = new ExtendedCommunityProfile.d(optJSONObject31);
            extendedCommunityProfile2.C2 = dVar;
            extendedCommunityProfile2.Z0.put("reviews", dVar.b);
        }
        JSONObject optJSONObject32 = jSONObject.optJSONObject("name_history");
        if (optJSONObject32 != null) {
            extendedCommunityProfile2.F2 = new st50(optJSONObject32);
        }
        JSONObject optJSONObject33 = jSONObject.optJSONObject("market");
        if (optJSONObject33 != null) {
            GroupMarketInfo groupMarketInfo = (GroupMarketInfo) GroupMarketInfo.j.a(optJSONObject33);
            extendedCommunityProfile2.J2 = groupMarketInfo;
            GroupMarketInfo.CommunityTrustMarks communityTrustMarks = groupMarketInfo.i;
            if (communityTrustMarks != null && (communityTrustMark = communityTrustMarks.x) != null) {
                communityTrustMark.f = N0(optJSONObject33.optJSONObject("trust_marks").optJSONObject(str4).optJSONArray("links_item"), Boolean.FALSE);
            }
        }
        JSONObject optJSONObject34 = jSONObject.optJSONObject("creation_onboarding");
        if (optJSONObject34 != null) {
            Serializer.c<GroupCreationOnboarding> cVar7 = GroupCreationOnboarding.CREATOR;
            extendedCommunityProfile2.K2 = GroupCreationOnboarding.a.a(optJSONObject34);
        }
        String optString9 = jSONObject.optString("market_shop_conditions_state");
        GroupMarketInfo.b bVar4 = GroupMarketInfo.b.C0909b.f;
        if (!epx.f(optString9, bVar4.a)) {
            bVar4 = GroupMarketInfo.b.f.f;
            if (!epx.f(optString9, bVar4.a)) {
                bVar4 = GroupMarketInfo.b.c.f;
                if (!epx.f(optString9, bVar4.a)) {
                    bVar4 = GroupMarketInfo.b.d.f;
                    if (!epx.f(optString9, bVar4.a)) {
                        bVar4 = GroupMarketInfo.b.e.f;
                        if (!epx.f(optString9, bVar4.a)) {
                            bVar4 = GroupMarketInfo.b.a.f;
                        }
                    }
                }
            }
        }
        extendedCommunityProfile2.M2 = bVar4;
        extendedCommunityProfile2.N2 = GroupLeaveMode.a(jSONObject.optString("leave_mode"));
        extendedCommunityProfile2.O2 = GroupAgeMark.a(jSONObject.optInt("age_mark"));
        extendedCommunityProfile2.P2 = jSONObject.optBoolean("is_market_online_booking_action_button_enabled");
        JSONObject optJSONObject35 = jSONObject.optJSONObject("strikes_info");
        if (optJSONObject35 != null) {
            extendedCommunityProfile2.R2 = new ExtendedCommunityProfile.g(optJSONObject35);
        }
        JSONObject optJSONObject36 = jSONObject.optJSONObject("strikes_restrictions");
        if (optJSONObject36 != null) {
            Iterator<String> keys = optJSONObject36.keys();
            ArrayList arrayList6 = new ArrayList();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    arrayList6.add(new ExtendedCommunityProfile.StrikesRestriction(ExtendedCommunityProfile.StrikesRestriction.StrikeRestrictionType.valueOf(cqm0.n(next)), optJSONObject36.getJSONObject(next)));
                } catch (Throwable unused) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.e, new Object[]{go9.b("Unknown StrikeRestrictionType: ", next)});
                    }
                }
            }
            extendedCommunityProfile2.S2 = arrayList6;
        }
        jSONObject.optBoolean("is_yclients_tooltip_active", false);
        extendedCommunityProfile2.T2 = jSONObject.optString("url");
        JSONArray optJSONArray14 = jSONObject.optJSONArray("tabs");
        if (optJSONArray14 != null) {
            ArrayList arrayList7 = new ArrayList();
            for (int i20 = 0; i20 < optJSONArray14.length(); i20++) {
                GroupContentTabSetting.a aVar2 = GroupContentTabSetting.j;
                JSONObject jSONObject6 = optJSONArray14.getJSONObject(i20);
                aVar2.getClass();
                arrayList7.add(new GroupContentTabSetting(jSONObject6));
            }
            extendedCommunityProfile2.U2 = arrayList7;
        }
        JSONObject optJSONObject37 = jSONObject.optJSONObject("content_sections_data");
        if (optJSONObject37 != null) {
            GroupContentSectionsData groupContentSectionsData = new GroupContentSectionsData(optJSONObject37.optString("first_section_name"));
            GroupContentTabType.Companion.getClass();
            extendedCommunityProfile2.V2 = GroupContentTabType.a.a(groupContentSectionsData.b);
        }
        JSONObject optJSONObject38 = jSONObject.optJSONObject("primary_block");
        if (optJSONObject38 != null) {
            Serializer.c<GroupsPrimaryBlockSettings> cVar8 = GroupsPrimaryBlockSettings.CREATOR;
            JSONObject optJSONObject39 = optJSONObject38.optJSONObject("tab");
            if (optJSONObject39 == null) {
                groupsPrimaryBlockSettings = map;
            } else {
                GroupContentTabSetting.j.getClass();
                GroupContentTabSetting groupContentTabSetting = new GroupContentTabSetting(optJSONObject39);
                JSONObject optJSONObject40 = optJSONObject38.optJSONObject("view_settings");
                groupsPrimaryBlockSettings = new GroupsPrimaryBlockSettings(groupContentTabSetting, optJSONObject40 != null ? new GroupsPrimaryBlockViewSettings(f370.A("title", optJSONObject40), f370.A("market_section_settings_link", optJSONObject40)) : map);
            }
            extendedCommunityProfile2.L2 = groupsPrimaryBlockSettings;
        }
        JSONObject optJSONObject41 = jSONObject.optJSONObject("channel_button");
        if (optJSONObject41 != null) {
            extendedCommunityProfile2.W2 = new ExtendedCommunityProfile.f(optJSONObject41);
        }
        JSONObject optJSONObject42 = jSONObject.optJSONObject("channel_block");
        if (optJSONObject42 != null) {
            Serializer.c<GroupChannelBlock> cVar9 = GroupChannelBlock.CREATOR;
            extendedCommunityProfile2.X2 = GroupChannelBlock.a.a(optJSONObject42);
        }
        JSONObject optJSONObject43 = jSONObject.optJSONObject("channel_info");
        if (optJSONObject43 != null) {
            Serializer.c<GroupChannelInfo> cVar10 = GroupChannelInfo.CREATOR;
            extendedCommunityProfile2.Y2 = new GroupChannelInfo(optJSONObject43.optBoolean(str3), optJSONObject43.optBoolean("has_posts"), optJSONObject43.optString("channel_url"));
        }
        extendedCommunityProfile2.Z2 = jSONObject.optBoolean("is_confirmed_business", false);
        extendedCommunityProfile2.a3 = jSONObject.optBoolean("is_golden_marked_business", false);
        JSONObject optJSONObject44 = jSONObject.optJSONObject("city");
        if (optJSONObject44 != null) {
            extendedCommunityProfile2.b2 = new ExtendedCommunityProfile.c(optJSONObject44);
        }
        JSONArray optJSONArray15 = jSONObject.optJSONArray("enabled_features");
        if (optJSONArray15 == null) {
            extendedCommunityProfile2.b3 = false;
            extendedCommunityProfile2.c3 = false;
            return;
        }
        ArrayList arrayList8 = new ArrayList();
        for (int i21 = 0; i21 < optJSONArray15.length(); i21++) {
            arrayList8.add(optJSONArray15.optString(i21));
        }
        extendedCommunityProfile2.b3 = arrayList8.contains("admin_receive_monetization_payouts");
        extendedCommunityProfile2.c3 = arrayList8.contains("ozon_adblog_onboarding_enabled");
    }
}
