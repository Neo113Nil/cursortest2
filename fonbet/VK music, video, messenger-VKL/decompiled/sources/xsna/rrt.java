package xsna;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.users.dto.UsersContentTypeDto;
import com.vk.api.generated.users.dto.UsersTabCollectionDto;
import com.vk.api.generated.users.dto.UsersTabSpecialValuesDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.gift.GiftItem;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.TrackableOwner;
import com.vk.dto.newsfeed.entries.FriendsBlock;
import com.vk.dto.newsfeed.entries.ProfilesRecommendations;
import com.vk.dto.profile.FollowersBlock;
import com.vk.dto.profile.MutualFriendsBlock;
import com.vk.dto.profile.RequestsBlock;
import com.vk.dto.user.SocialButtonType;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.UserSex;
import com.vk.dto.user.deactivation.DeactivationWithMessage;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vkontakte.android.api.ProfileContentTab;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ytd0;

/* compiled from: GetFullUserProfile.java */
/* loaded from: classes15.dex */
public final class rrt extends prt<ExtendedUserProfile> {
    public final b v;
    public final a w;

    /* compiled from: GetFullUserProfile.java */
    public interface a {
    }

    /* compiled from: GetFullUserProfile.java */
    public interface b {
    }

    public rrt(UserId userId, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, t7 t7Var, bl blVar, rf1 rf1Var, sj4 sj4Var, boolean z5) {
        super(userId, "execute.getFullProfileNewNew", z, t7Var, blVar);
        this.v = rf1Var;
        this.w = sj4Var;
        UserId c = !fkq0.c(userId) ? vx2.d.c() : userId;
        F(c, "user_id");
        C(52, "func_v");
        R("current_user", z5);
        this.s = c;
        if (!TextUtils.isEmpty(str2)) {
            K("source", str2);
        }
        if (z2) {
            R("need_friends_block", true);
            K("friends_block_ref", "profile_friends_block");
        }
        if (z3) {
            R("need_subscriptions_block", true);
        }
        K("user_fields", fo8.a(TextUtils.join(StringUtils.COMMA, new String[]{"video_live", "screen_name", "contacts", "counters", "relatives", "sex", "bdate", "photo_base", "can_post", "can_write_private_message", "can_call", "activity", eok.ONLINE_EXTRAS_KEY, "online_info", "universities", "schools", "can_see_all_posts", "last_seen", "relation", "connections", "interests", "movies", "tv", "books", "games", "about", "city", "country", "quotes", "hometown", "first_name_dat", "last_name_dat", "first_name_gen", "last_name_gen", "first_name_ins", "last_name_ins", "first_name_acc", "last_name_acc", "activities", "verified", "is_verified", "wall_default", "personal", "home_town", "blacklisted_by_me", "site", "music", "is_favorite", "can_send_friend_request", "is_subscribed", "career", "blacklisted", "is_hidden_from_feed", "has_photo", "trending", "buttons", "owner_state", "can_invite_to_chats", "emoji_status", "image_status", "can_see_wishes", "is_dead", "gifts_tooltip", "military", "can_subscribe_stories", "is_subscribed_stories", "occupation", "third_party_buttons", "can_ask_anonymous", "is_best_friend", "status", "photo_avg_color", "has_cover", "cover", "service_description", "is_nft", "can_ban", "friend_status", "is_followers_mode_on", "social_button_type", "a_plus_mark", "donut"}), z4 ? ",profile_buttons_tablet" : ",profile_buttons"));
        C(1, "photo_sizes");
        C(1, "skip_hidden");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        K("access_keys", str);
    }

    @Override // xsna.prt
    public final ExtendedUserProfile F0() {
        return new ExtendedUserProfile();
    }

    @Override // xsna.prt
    public final void K0(ExtendedUserProfile extendedUserProfile, JSONObject jSONObject) throws JSONException {
        String str;
        String str2;
        boolean z;
        Pair<String, String> pair;
        ProfileContentTab profileContentTab;
        ArrayList arrayList;
        ArrayList arrayList2;
        JSONArray jSONArray;
        int i;
        List list;
        Object obj;
        JSONArray jSONArray2;
        int i2;
        ArrayList arrayList3;
        BaseImageDto.ThemeDto themeDto;
        String optString;
        Object obj2;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        JSONArray jSONArray3;
        JSONArray optJSONArray = jSONObject.optJSONArray("countries");
        HashSet hashSet = new HashSet();
        if (optJSONArray != null) {
            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                hashSet.add(Integer.valueOf(optJSONArray.getInt(i3)));
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("cities");
        HashSet hashSet2 = new HashSet();
        if (optJSONArray2 != null) {
            for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                hashSet2.add(Integer.valueOf(optJSONArray2.getInt(i4)));
            }
        }
        HashMap hashMap = new HashMap();
        List J0 = ((bcq) ((rf1) this.v).c).a.J0(hashSet);
        for (int i5 = 0; i5 < J0.size(); i5++) {
            vyj vyjVar = (vyj) J0.get(i5);
            hashMap.put(Integer.valueOf(vyjVar.a), vyjVar.b);
        }
        HashMap hashMap2 = new HashMap();
        List l0 = ((bcq) ((sj4) this.w).c).a.l0(hashSet2);
        for (int i6 = 0; i6 < l0.size(); i6++) {
            nec necVar = (nec) l0.get(i6);
            hashMap2.put(Integer.valueOf(necVar.a), necVar.b);
        }
        UserProfile userProfile = extendedUserProfile.a;
        UserId userId = new UserId(jSONObject.getLong("id"));
        this.s = userId;
        userProfile.c = userId;
        extendedUserProfile.a.d = jSONObject.getString("first_name");
        extendedUserProfile.a.f = jSONObject.getString("last_name");
        extendedUserProfile.a.e = extendedUserProfile.a.d + " " + extendedUserProfile.a.f;
        extendedUserProfile.a.j = jSONObject.getInt("friend_status") == 3;
        extendedUserProfile.a.A = jSONObject.optBoolean("is_dead");
        extendedUserProfile.a.Y = jSONObject.optBoolean("is_nft");
        extendedUserProfile.a.Z = jSONObject.optBoolean("can_ban");
        extendedUserProfile.a.X = jSONObject.optBoolean("is_verified");
        extendedUserProfile.a.a0 = jSONObject.optBoolean("is_followers_mode_on");
        extendedUserProfile.a.b0 = jSONObject.has("is_followers_mode_on");
        extendedUserProfile.a.e0 = SocialButtonType.parse(jSONObject.optString("social_button_type"));
        int i7 = jSONObject.getInt("friend_status");
        extendedUserProfile.a1 = i7;
        extendedUserProfile.a.v = jSONObject.optInt("friend_status", i7);
        String optString2 = jSONObject.optString("photo_base");
        String a2 = js5.a(480, optString2);
        if (TextUtils.isEmpty(extendedUserProfile.a.g) && !optString2.isEmpty()) {
            extendedUserProfile.a.g = optString2;
        }
        extendedUserProfile.j = a2;
        extendedUserProfile.a.h = js5.a(iah0.f().density > 1.0f ? 100 : 50, optString2);
        UserProfile userProfile2 = extendedUserProfile.a;
        Serializer.c<Image> cVar = Image.CREATOR;
        userProfile2.O = Image.b.a(optString2);
        UserProfile userProfile3 = extendedUserProfile.a;
        Integer valueOf = Integer.valueOf(jSONObject.optInt("sex"));
        UserSex.Companion.getClass();
        userProfile3.i = UserSex.a.a(valueOf);
        extendedUserProfile.a.n = UserProfile.T(jSONObject);
        extendedUserProfile.a.R = com.vk.dto.user.a.b(jSONObject);
        extendedUserProfile.e0 = jSONObject.getInt("can_write_private_message") == 1;
        extendedUserProfile.g0 = jSONObject.getInt("can_post") == 1;
        extendedUserProfile.h0 = jSONObject.optInt("can_suggest") == 1;
        extendedUserProfile.f0 = jSONObject.optInt("can_see_all_posts") == 1;
        jSONObject.optInt("can_see_archived_posts");
        extendedUserProfile.y = jSONObject.optBoolean("can_invite_to_chats", true);
        extendedUserProfile.j0 = "all".equals(jSONObject.optString("wall_default"));
        jSONObject.optBoolean("can_call", false);
        extendedUserProfile.i0 = jSONObject.optInt("blacklisted_by_me") == 1;
        extendedUserProfile.m = jSONObject.optBoolean("is_service");
        extendedUserProfile.p0 = jSONObject.optBoolean("can_ask_anonymous");
        if (jSONObject.has("silent_mode_ended_at")) {
            extendedUserProfile.C1 = jSONObject.optInt("silent_mode_ended_at");
        }
        if (jSONObject.has("can_subscribe_stories")) {
            extendedUserProfile.H1 = jSONObject.optBoolean("can_subscribe_stories", false);
        }
        if (jSONObject.has("is_subscribed_stories")) {
            extendedUserProfile.I1 = jSONObject.optBoolean("is_subscribed_stories");
        }
        if (jSONObject.optInt("blacklisted") == 1) {
            extendedUserProfile.k1 = new ExtendedUserProfile.e();
        }
        extendedUserProfile.u = jSONObject.optInt("relation");
        if (jSONObject.has("relation_partner")) {
            extendedUserProfile.v = jSONObject.getJSONObject("relation_partner").getInt("id");
            extendedUserProfile.w = jSONObject.getJSONObject("relation_partner").getString("first_name") + " " + jSONObject.getJSONObject("relation_partner").getString("last_name");
        }
        if (jSONObject.has("is_personal_ads_easy_promote_enabled")) {
            extendedUserProfile.B1 = jSONObject.getBoolean("is_personal_ads_easy_promote_enabled");
        }
        if (jSONObject.has("bdate")) {
            String string = jSONObject.getString("bdate");
            extendedUserProfile.a.p = string;
            String[] split = string.split("\\.");
            extendedUserProfile.s = Integer.parseInt(split[0]);
            extendedUserProfile.t = Integer.parseInt(split[1]);
            if (split.length > 2) {
                extendedUserProfile.r = Integer.parseInt(split[2]);
            }
        }
        extendedUserProfile.d = jSONObject.optString("first_name_dat", extendedUserProfile.a.d);
        extendedUserProfile.b = jSONObject.optString("first_name_gen", extendedUserProfile.a.d);
        extendedUserProfile.c = jSONObject.optString("first_name_ins", extendedUserProfile.a.d);
        extendedUserProfile.h = jSONObject.optString("first_name_acc", extendedUserProfile.a.d);
        extendedUserProfile.g = jSONObject.optString("last_name_dat", extendedUserProfile.a.f);
        extendedUserProfile.e = jSONObject.optString("last_name_gen", extendedUserProfile.a.f);
        extendedUserProfile.f = jSONObject.optString("last_name_ins", extendedUserProfile.a.f);
        extendedUserProfile.i = jSONObject.optString("last_name_acc", extendedUserProfile.a.f);
        extendedUserProfile.a.s.putString("first_name_dat", extendedUserProfile.d);
        extendedUserProfile.a.s.putString("first_name_gen", extendedUserProfile.b);
        extendedUserProfile.a.s.putString("first_name_ins", extendedUserProfile.c);
        extendedUserProfile.a.s.putString("first_name_acc", extendedUserProfile.h);
        extendedUserProfile.a.s.putString("last_name_dat", extendedUserProfile.g);
        extendedUserProfile.a.s.putString("last_name_gen", extendedUserProfile.e);
        extendedUserProfile.a.s.putString("last_name_ins", extendedUserProfile.f);
        extendedUserProfile.a.s.putString("last_name_acc", extendedUserProfile.i);
        if (jSONObject.has("city") && jSONObject.has("country")) {
            extendedUserProfile.s0 = jSONObject.getJSONObject("city").getString("title");
            jSONObject.getJSONObject("country").getString("title");
        }
        if (jSONObject.has("mobile_phone") && jSONObject.getString("mobile_phone").length() > 0) {
            extendedUserProfile.u0 = jSONObject.getString("mobile_phone");
        }
        if (jSONObject.has("home_phone") && jSONObject.getString("home_phone").length() > 0) {
            extendedUserProfile.v0 = jSONObject.getString("home_phone");
        }
        if (jSONObject.has("skype")) {
            extendedUserProfile.w0 = jSONObject.getString("skype");
        }
        if (jSONObject.has("twitter")) {
            extendedUserProfile.x0 = jSONObject.getString("twitter");
        }
        if (jSONObject.has("livejournal")) {
            jSONObject.getString("livejournal");
        }
        if (jSONObject.has("facebook") && jSONObject.optLong("facebook", -1L) != -1) {
            extendedUserProfile.z0 = jSONObject.getLong("facebook");
            extendedUserProfile.y0 = jSONObject.getString("facebook_name");
        }
        if (jSONObject.has("instagram")) {
            extendedUserProfile.C0 = jSONObject.getString("instagram");
        }
        extendedUserProfile.a1 = jSONObject.getInt("friend_status");
        extendedUserProfile.Q1 = jSONObject.optBoolean("is_followers_mode_on");
        JSONArray optJSONArray3 = jSONObject.optJSONArray("schools");
        extendedUserProfile.D0 = new ArrayList<>();
        if (optJSONArray3 != null) {
            for (int i8 = 0; i8 < optJSONArray3.length(); i8++) {
                ExtendedUserProfile.k kVar = new ExtendedUserProfile.k();
                JSONObject jSONObject2 = optJSONArray3.getJSONObject(i8);
                String str3 = (String) hashMap2.get(Integer.valueOf(jSONObject2.optInt("city")));
                if (str3 == null) {
                    str3 = "";
                }
                kVar.c = str3;
                kVar.a = jSONObject2.optString("name", "???");
                kVar.f = jSONObject2.optInt("year_from");
                kVar.e = jSONObject2.optInt("year_to");
                kVar.g = jSONObject2.optInt("year_graduated");
                kVar.b = jSONObject2.optString("class", null);
                kVar.d = jSONObject2.optString("speciality", null);
                jSONObject2.optString("type_str", vx2.d.getContext().getString(R.string.profile_school));
                extendedUserProfile.D0.add(kVar);
            }
        }
        extendedUserProfile.E0 = new ArrayList<>();
        JSONArray optJSONArray4 = jSONObject.optJSONArray("universities");
        if (optJSONArray4 != null) {
            for (int i9 = 0; i9 < optJSONArray4.length(); i9++) {
                ExtendedUserProfile.l lVar = new ExtendedUserProfile.l();
                JSONObject jSONObject3 = optJSONArray4.getJSONObject(i9);
                lVar.a = jSONObject3.getString("name").trim();
                if (jSONObject3.has("faculty_name")) {
                    lVar.b = jSONObject3.getString("faculty_name").trim();
                }
                if (jSONObject3.has("chair_name")) {
                    lVar.c = jSONObject3.getString("chair_name").trim();
                }
                lVar.d = jSONObject3.optInt("graduation");
                extendedUserProfile.E0.add(lVar);
            }
        }
        extendedUserProfile.F0 = new ArrayList<>();
        JSONArray optJSONArray5 = jSONObject.optJSONArray("military");
        if (optJSONArray5 != null) {
            for (int i10 = 0; i10 < optJSONArray5.length(); i10++) {
                ExtendedUserProfile.i iVar = new ExtendedUserProfile.i();
                JSONObject jSONObject4 = optJSONArray5.getJSONObject(i10);
                iVar.a = (String) hashMap.get(Integer.valueOf(jSONObject4.getInt(AnalyticsBaseParamsConstantsKt.COUNTRY_ID)));
                iVar.b = jSONObject4.getString("unit");
                iVar.d = jSONObject4.optInt("from");
                iVar.c = jSONObject4.optInt("until");
                extendedUserProfile.F0.add(iVar);
            }
        }
        if (jSONObject.has("interests") && jSONObject.getString("interests").length() > 0) {
            extendedUserProfile.H0 = jSONObject.getString("interests");
        }
        if (jSONObject.has("movies") && jSONObject.getString("movies").length() > 0) {
            extendedUserProfile.J0 = jSONObject.getString("movies");
        }
        if (jSONObject.has("music") && jSONObject.getString("music").length() > 0) {
            extendedUserProfile.I0 = jSONObject.getString("music");
        }
        if (jSONObject.has("tv") && jSONObject.getString("tv").length() > 0) {
            extendedUserProfile.K0 = jSONObject.getString("tv");
        }
        if (jSONObject.has("books") && jSONObject.getString("books").length() > 0) {
            extendedUserProfile.L0 = jSONObject.getString("books");
        }
        if (jSONObject.has("games") && jSONObject.getString("games").length() > 0) {
            extendedUserProfile.M0 = jSONObject.getString("games");
        }
        if (jSONObject.has("about") && jSONObject.getString("about").length() > 0) {
            extendedUserProfile.O0 = jSONObject.getString("about");
        }
        if (jSONObject.has("quotes") && jSONObject.getString("quotes").length() > 0) {
            extendedUserProfile.N0 = jSONObject.getString("quotes");
        }
        if (jSONObject.has("activities") && jSONObject.getString("activities").length() > 0) {
            extendedUserProfile.G0 = jSONObject.getString("activities");
        }
        if (jSONObject.has("home_town") && jSONObject.getString("home_town").length() > 0) {
            extendedUserProfile.q0 = jSONObject.getString("home_town");
        }
        if (jSONObject.has("site") && jSONObject.getString("site").length() > 0) {
            extendedUserProfile.V = jSONObject.getString("site");
        }
        extendedUserProfile.a.B.Bb(jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject("personal");
        if (optJSONObject != null) {
            JSONArray optJSONArray6 = optJSONObject.optJSONArray("langs");
            if (optJSONArray6 != null) {
                ArrayList arrayList7 = new ArrayList();
                for (int i11 = 0; i11 < optJSONArray6.length(); i11 = wq.b(optJSONArray6, i11, arrayList7, i11, 1)) {
                }
                extendedUserProfile.P0 = TextUtils.join(", ", arrayList7);
            }
            extendedUserProfile.S0 = optJSONObject.optInt("political");
            extendedUserProfile.Q0 = optJSONObject.optString("religion");
            extendedUserProfile.T0 = optJSONObject.optInt("life_main");
            extendedUserProfile.U0 = optJSONObject.optInt("people_main");
            extendedUserProfile.R0 = optJSONObject.optString("inspired_by");
            extendedUserProfile.V0 = optJSONObject.optInt("smoking");
            extendedUserProfile.W0 = optJSONObject.optInt("alcohol");
        }
        HashMap hashMap3 = new HashMap();
        JSONArray optJSONArray7 = jSONObject.optJSONArray("relatives_profiles");
        if (optJSONArray7 != null) {
            for (int i12 = 0; i12 < optJSONArray7.length(); i12++) {
                UserProfile userProfile4 = new UserProfile(optJSONArray7.getJSONObject(i12));
                hashMap3.put(userProfile4.c, userProfile4);
            }
        }
        JSONArray optJSONArray8 = jSONObject.optJSONArray("relatives");
        if (optJSONArray8 != null) {
            wyd0.d(optJSONArray8, extendedUserProfile, hashMap3);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("owner_state");
        if (optJSONObject2 != null) {
            extendedUserProfile.q = new DeactivationWithMessage.a(new u590(optJSONObject2, a2)).a();
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("gifts");
        if (optJSONObject3 != null) {
            new VKList(optJSONObject3, GiftItem.m);
        }
        JSONArray optJSONArray9 = jSONObject.optJSONArray("friends");
        if (optJSONArray9 != null) {
            extendedUserProfile.I = new ArrayList<>();
            for (int i13 = 0; i13 < optJSONArray9.length(); i13++) {
                extendedUserProfile.I.add(new UserProfile(optJSONArray9.getJSONObject(i13)));
            }
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("mutual_friends");
        if (optJSONObject4 != null) {
            Serializer.c<MutualFriendsBlock> cVar2 = MutualFriendsBlock.CREATOR;
            int optInt = optJSONObject4.optInt(SignalingProtocol.KEY_OFFSET);
            JSONObject optJSONObject5 = optJSONObject4.optJSONObject("friends");
            int optInt2 = optJSONObject5 != null ? optJSONObject5.optInt("count") : 0;
            JSONArray optJSONArray10 = optJSONObject5 != null ? optJSONObject5.optJSONArray("items") : null;
            if (optJSONArray10 != null) {
                str = "";
                arrayList6 = new ArrayList(optJSONArray10.length());
                int length = optJSONArray10.length();
                str2 = "name";
                int i14 = 0;
                while (i14 < length) {
                    JSONObject optJSONObject6 = optJSONArray10.optJSONObject(i14);
                    if (optJSONObject6 != null) {
                        Serializer.c<TrackableOwner> cVar3 = TrackableOwner.CREATOR;
                        jSONArray3 = optJSONArray10;
                        arrayList6.add(TrackableOwner.a.a(optJSONObject6));
                    } else {
                        jSONArray3 = optJSONArray10;
                    }
                    i14++;
                    optJSONArray10 = jSONArray3;
                }
            } else {
                str = "";
                str2 = "name";
                arrayList6 = null;
            }
            if (arrayList6 == null) {
                arrayList6 = new ArrayList();
            }
            extendedUserProfile.N = new MutualFriendsBlock(arrayList6, optInt2, optInt);
        } else {
            str = "";
            str2 = "name";
        }
        JSONObject optJSONObject7 = jSONObject.optJSONObject("friends_block");
        if (optJSONObject7 != null) {
            Serializer.c<FriendsBlock> cVar4 = FriendsBlock.CREATOR;
            int optInt3 = optJSONObject7.optInt(SignalingProtocol.KEY_OFFSET);
            JSONObject optJSONObject8 = optJSONObject7.optJSONObject("friends");
            int optInt4 = optJSONObject8 != null ? optJSONObject8.optInt("count") : 0;
            JSONArray optJSONArray11 = optJSONObject8 != null ? optJSONObject8.optJSONArray("items") : null;
            if (optJSONArray11 != null) {
                arrayList5 = new ArrayList(optJSONArray11.length());
                int length2 = optJSONArray11.length();
                for (int i15 = 0; i15 < length2; i15++) {
                    JSONObject optJSONObject9 = optJSONArray11.optJSONObject(i15);
                    if (optJSONObject9 != null) {
                        Serializer.c<TrackableOwner> cVar5 = TrackableOwner.CREATOR;
                        arrayList5.add(TrackableOwner.a.a(optJSONObject9));
                    }
                }
            } else {
                arrayList5 = null;
            }
            if (arrayList5 == null) {
                arrayList5 = new ArrayList();
            }
            extendedUserProfile.O = new FriendsBlock(arrayList5, optInt4, optInt3);
        }
        JSONObject optJSONObject10 = jSONObject.optJSONObject("followers_block");
        if (optJSONObject10 != null) {
            Serializer.c<FollowersBlock> cVar6 = FollowersBlock.CREATOR;
            int optInt5 = optJSONObject10.optInt(SignalingProtocol.KEY_OFFSET);
            JSONObject optJSONObject11 = optJSONObject10.optJSONObject("followers");
            int optInt6 = optJSONObject11 != null ? optJSONObject11.optInt("count") : 0;
            int optInt7 = optJSONObject11 != null ? optJSONObject11.optInt("friends_count") : 0;
            JSONArray optJSONArray12 = optJSONObject11 != null ? optJSONObject11.optJSONArray("items") : null;
            if (optJSONArray12 != null) {
                arrayList4 = new ArrayList(optJSONArray12.length());
                int length3 = optJSONArray12.length();
                for (int i16 = 0; i16 < length3; i16++) {
                    JSONObject optJSONObject12 = optJSONArray12.optJSONObject(i16);
                    if (optJSONObject12 != null) {
                        Serializer.c<TrackableOwner> cVar7 = TrackableOwner.CREATOR;
                        arrayList4.add(TrackableOwner.a.a(optJSONObject12));
                    }
                }
            } else {
                arrayList4 = null;
            }
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
            }
            extendedUserProfile.P = new FollowersBlock(arrayList4, optInt6, optInt5, optInt7);
        }
        JSONObject optJSONObject13 = jSONObject.optJSONObject("requests_block");
        if (optJSONObject13 != null) {
            Serializer.c<RequestsBlock> cVar8 = RequestsBlock.CREATOR;
            extendedUserProfile.Q = RequestsBlock.a.a(optJSONObject13);
        }
        if (jSONObject.has("career")) {
            extendedUserProfile.J = new ArrayList<>();
            JSONArray jSONArray4 = jSONObject.getJSONArray("career");
            for (int i17 = 0; i17 < jSONArray4.length(); i17++) {
                JSONObject jSONObject5 = jSONArray4.getJSONObject(i17);
                ExtendedUserProfile.g gVar = new ExtendedUserProfile.g();
                if (jSONObject5.has("group")) {
                    gVar.a = new Group(jSONObject5.getJSONObject("group"));
                } else {
                    gVar.c = jSONObject5.getString("company");
                }
                gVar.e = jSONObject5.optInt("from");
                gVar.f = jSONObject5.optInt("until");
                gVar.d = jSONObject5.optString(X3.i.L);
                if (jSONObject5.has("city_id")) {
                    String str4 = (String) hashMap2.get(Integer.valueOf(jSONObject5.getInt("city_id")));
                    if (str4 == null) {
                        str4 = str;
                    }
                    gVar.b = str4;
                }
                extendedUserProfile.J.add(gVar);
            }
        }
        if (jSONObject.has("occupation")) {
            extendedUserProfile.L = ahn.A(jSONObject.getJSONObject("occupation"));
        }
        if (jSONObject.has("occupation_group")) {
            extendedUserProfile.K = new ArrayList<>();
            new ExtendedUserProfile.g();
            JSONObject jSONObject6 = jSONObject.getJSONObject("occupation_group");
            if (jSONObject6.has("groups")) {
                JSONArray jSONArray5 = jSONObject6.getJSONArray("groups");
                for (int i18 = 0; i18 < jSONArray5.length(); i18++) {
                    extendedUserProfile.K.add(new Group(jSONArray5.getJSONObject(i18)));
                }
            }
        }
        if (jSONObject.has("display_fields")) {
            JSONArray jSONArray6 = jSONObject.getJSONArray("display_fields");
            extendedUserProfile.t1 = new ArrayList<>();
            int i19 = 0;
            while (i19 < jSONArray6.length()) {
                i19 = wq.b(jSONArray6, i19, extendedUserProfile.t1, i19, 1);
            }
        }
        JSONObject optJSONObject14 = jSONObject.optJSONObject("friends_recommendations");
        if (optJSONObject14 != null) {
            Serializer.c<ProfilesRecommendations> cVar9 = ProfilesRecommendations.CREATOR;
            extendedUserProfile.M = ProfilesRecommendations.a.a(optJSONObject14);
        }
        extendedUserProfile.b1 = jSONObject.optBoolean("can_see_wishes", false);
        JSONObject optJSONObject15 = jSONObject.optJSONObject("gifts_tooltip");
        if (optJSONObject15 != null) {
            ExtendedUserProfile.h hVar = new ExtendedUserProfile.h();
            hVar.a = optJSONObject15.optString("type");
            hVar.b = optJSONObject15.optString("title");
            hVar.c = optJSONObject15.optString("subtitle");
            hVar.d = optJSONObject15.optString("section");
            extendedUserProfile.c1 = hVar;
        }
        JSONArray optJSONArray13 = jSONObject.optJSONArray("profile_buttons");
        JSONArray optJSONArray14 = jSONObject.optJSONArray("profile_buttons_tablet");
        if (optJSONArray13 == null) {
            optJSONArray13 = optJSONArray14 != null ? optJSONArray14 : null;
        }
        if (optJSONArray13 != null) {
            extendedUserProfile.M1 = new ArrayList();
            for (int i20 = 0; i20 < optJSONArray13.length(); i20++) {
                ArrayList arrayList8 = new ArrayList();
                JSONArray jSONArray7 = optJSONArray13.getJSONArray(i20);
                for (int i21 = 0; i21 < jSONArray7.length(); i21++) {
                    arrayList8.add(ytd0.a.a(jSONArray7.getJSONObject(i21)));
                }
                extendedUserProfile.M1.add(new xtd0(arrayList8));
            }
        }
        JSONArray optJSONArray15 = jSONObject.optJSONArray("third_party_buttons");
        if (optJSONArray15 != null) {
            ArrayList arrayList9 = new ArrayList();
            for (int i22 = 0; i22 < optJSONArray15.length(); i22++) {
                arrayList9.add(ytd0.a.a(optJSONArray15.getJSONObject(i22)));
            }
            extendedUserProfile.N1 = new xtd0(arrayList9);
        }
        extendedUserProfile.o0 = jSONObject.optBoolean("is_best_friend", false);
        if (jSONObject.optJSONObject("extended_status") == null) {
            extendedUserProfile.k = jSONObject.optString("activity");
        } else if (jSONObject.getJSONObject("extended_status").has("audio")) {
            MusicTrack musicTrack = new MusicTrack(jSONObject.getJSONObject("extended_status").getJSONObject("audio"));
            extendedUserProfile.f1 = musicTrack;
            extendedUserProfile.k = this.u.a(musicTrack);
        } else {
            extendedUserProfile.k = jSONObject.optString("activity");
        }
        extendedUserProfile.g1 = jSONObject.optString("status");
        extendedUserProfile.n = jSONObject.optString("photo_avg_color");
        JSONObject optJSONObject16 = jSONObject.optJSONObject("tabs");
        if (optJSONObject16 != null) {
            JSONArray jSONArray8 = optJSONObject16.getJSONArray("tabs_settings");
            ArrayList arrayList10 = new ArrayList();
            int length4 = jSONArray8.length();
            int i23 = 0;
            while (i23 < length4) {
                JSONObject jSONObject7 = jSONArray8.getJSONObject(i23);
                String str5 = str2;
                String optString3 = jSONObject7.optString(str5);
                if (optString3 == null) {
                    jSONArray = jSONArray8;
                    i = length4;
                } else {
                    boolean optBoolean = jSONObject7.optBoolean("is_pinned", false);
                    boolean optBoolean2 = jSONObject7.optBoolean("can_add_button", false);
                    boolean optBoolean3 = jSONObject7.optBoolean("to_section_button", false);
                    JSONArray optJSONArray16 = jSONObject7.optJSONArray("additional_flags");
                    if (optJSONArray16 != null) {
                        ArrayList arrayList11 = new ArrayList(optJSONArray16.length());
                        int length5 = optJSONArray16.length();
                        for (int i24 = 0; i24 < length5; i24 = wq.b(optJSONArray16, i24, arrayList11, i24, 1)) {
                        }
                        arrayList = arrayList11;
                    } else {
                        arrayList = null;
                    }
                    JSONObject optJSONObject17 = jSONObject7.optJSONObject("special_values");
                    UsersTabSpecialValuesDto usersTabSpecialValuesDto = optJSONObject17 != null ? new UsersTabSpecialValuesDto(Integer.valueOf(optJSONObject17.getInt("co_owner_invitations_count"))) : null;
                    JSONArray optJSONArray17 = jSONObject7.optJSONArray("collections");
                    if (optJSONArray17 != null) {
                        ArrayList arrayList12 = new ArrayList(optJSONArray17.length());
                        int length6 = optJSONArray17.length();
                        int i25 = 0;
                        while (i25 < length6) {
                            JSONObject jSONObject8 = optJSONArray17.getJSONObject(i25);
                            String optString4 = jSONObject8.optString("collection_type");
                            int optInt8 = jSONObject8.optInt("count");
                            JSONArray optJSONArray18 = jSONObject8.optJSONArray("images");
                            if (optJSONArray18 != null) {
                                jSONArray2 = jSONArray8;
                                arrayList3 = new ArrayList(optJSONArray18.length());
                                int length7 = optJSONArray18.length();
                                i2 = length4;
                                int i26 = 0;
                                while (i26 < length7) {
                                    int i27 = length7;
                                    JSONObject jSONObject9 = optJSONArray18.getJSONObject(i26);
                                    JSONArray jSONArray9 = optJSONArray18;
                                    String string2 = jSONObject9.getString("url");
                                    int i28 = jSONObject9.getInt("width");
                                    int i29 = jSONObject9.getInt("height");
                                    String optString5 = jSONObject9.optString("id");
                                    JSONObject optJSONObject18 = jSONObject9.optJSONObject("theme");
                                    int i30 = i26;
                                    if (optJSONObject18 == null || (optString = optJSONObject18.optString("value")) == null) {
                                        themeDto = null;
                                    } else {
                                        Iterator it = BaseImageDto.ThemeDto.i().iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                obj2 = null;
                                                break;
                                            }
                                            obj2 = it.next();
                                            Iterator it2 = it;
                                            if (epx.f(((BaseImageDto.ThemeDto) obj2).j(), optString)) {
                                                break;
                                            } else {
                                                it = it2;
                                            }
                                        }
                                        themeDto = (BaseImageDto.ThemeDto) obj2;
                                    }
                                    arrayList3.add(new BaseImageDto(string2, i28, i29, optString5, themeDto, Boolean.valueOf(jSONObject9.optBoolean("isBase"))));
                                    i26 = i30 + 1;
                                    length7 = i27;
                                    optJSONArray18 = jSONArray9;
                                }
                            } else {
                                jSONArray2 = jSONArray8;
                                i2 = length4;
                                arrayList3 = null;
                            }
                            arrayList12.add(new UsersTabCollectionDto(optString4, Integer.valueOf(optInt8), arrayList3));
                            i25++;
                            jSONArray8 = jSONArray2;
                            length4 = i2;
                        }
                        arrayList2 = arrayList12;
                    } else {
                        arrayList2 = null;
                    }
                    jSONArray = jSONArray8;
                    i = length4;
                    JSONArray optJSONArray19 = jSONObject7.optJSONArray("content_types");
                    if (optJSONArray19 != null) {
                        ArrayList arrayList13 = new ArrayList(optJSONArray19.length());
                        int length8 = optJSONArray19.length();
                        for (int i31 = 0; i31 < length8; i31++) {
                            String string3 = optJSONArray19.getString(i31);
                            Iterator<E> it3 = UsersContentTypeDto.i().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    obj = it3.next();
                                    if (epx.f(((UsersContentTypeDto) obj).j(), string3)) {
                                        break;
                                    }
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            arrayList13.add((UsersContentTypeDto) obj);
                        }
                        list = j5g.V(arrayList13);
                    } else {
                        list = null;
                    }
                    arrayList10.add(new ExtendedUserProfile.m(optString3, optBoolean, optBoolean2, optBoolean3, list, arrayList, arrayList2, usersTabSpecialValuesDto));
                }
                i23++;
                str2 = str5;
                jSONArray8 = jSONArray;
                length4 = i;
            }
            extendedUserProfile.P1 = arrayList10;
            Iterator it4 = arrayList10.iterator();
            while (it4.hasNext()) {
                ExtendedUserProfile.m mVar = (ExtendedUserProfile.m) it4.next();
                ProfileContentTab.a aVar = ProfileContentTab.Companion;
                String str6 = mVar.a;
                aVar.getClass();
                ProfileContentTab[] values = ProfileContentTab.values();
                int length9 = values.length;
                int i32 = 0;
                while (true) {
                    if (i32 >= length9) {
                        profileContentTab = null;
                        break;
                    }
                    profileContentTab = values[i32];
                    if (epx.f(profileContentTab.h(), str6)) {
                        break;
                    } else {
                        i32++;
                    }
                }
                extendedUserProfile.O1.add(profileContentTab);
            }
        }
        if (jSONObject.has("ads_easy_promote_onboarding_name")) {
            List c0 = drm0.c0(jSONObject.getString("ads_easy_promote_onboarding_name"), new String[]{StringUtils.COMMA}, 0, 6);
            ArrayList arrayList14 = new ArrayList();
            for (Object obj3 : c0) {
                if (!drm0.N((String) obj3)) {
                    arrayList14.add(obj3);
                }
            }
            if (arrayList14.size() != 2) {
                arrayList14 = null;
            }
            if (arrayList14 != null) {
                z = true;
                pair = new Pair<>(drm0.p0((String) arrayList14.get(0)).toString(), drm0.p0((String) arrayList14.get(1)).toString());
            } else {
                z = true;
                pair = null;
            }
            extendedUserProfile.U1 = pair;
        } else {
            z = true;
        }
        JSONObject optJSONObject19 = jSONObject.optJSONObject("cover");
        if (optJSONObject19 != null) {
            extendedUserProfile.z = optJSONObject19.optInt("enabled", 0) != 0 ? z : false;
        }
        extendedUserProfile.R1 = ExtendedUserProfile.j.a(jSONObject.optJSONObject("received_throws"));
        extendedUserProfile.o = jSONObject.optString("service_description");
        JSONObject optJSONObject20 = jSONObject.optJSONObject("donut");
        if (optJSONObject20 != null) {
            extendedUserProfile.T1 = new wvd0(optJSONObject20.getBoolean("is_available"), Boolean.valueOf(optJSONObject20.optBoolean("regular")), Boolean.valueOf(optJSONObject20.optBoolean("one_time")), Boolean.valueOf(optJSONObject20.optBoolean("goals")));
        }
    }

    @Override // xsna.prt, xsna.xz2
    @Nullable
    public final int[] l() {
        int[] copyOf = Arrays.copyOf(super.l(), 15);
        copyOf[14] = 13300;
        return copyOf;
    }
}
