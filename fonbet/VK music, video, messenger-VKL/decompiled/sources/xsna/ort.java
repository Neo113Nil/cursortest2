package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: GetFullCommunityMethod.kt */
/* loaded from: classes15.dex */
public final class ort implements qrt<ExtendedCommunityProfile, JSONObject> {
    public final UserId b;
    public final List<String> c;
    public final Float d;
    public final Float e;
    public final Boolean f;
    public final List<GroupsFieldsDto> g = e43.l(GroupsFieldsDto.CAN_SEE_MEMBERS, GroupsFieldsDto.ADS_EASY_PROMOTE, GroupsFieldsDto.WARNING_NOTIFICATION, GroupsFieldsDto.MENU, GroupsFieldsDto.CAN_MESSAGE, GroupsFieldsDto.CITY, GroupsFieldsDto.COUNTRY, GroupsFieldsDto.PLACE, GroupsFieldsDto.DESCRIPTION, GroupsFieldsDto.WIKI_PAGE, GroupsFieldsDto.START_DATE, GroupsFieldsDto.FINISH_DATE, GroupsFieldsDto.CAN_POST, GroupsFieldsDto.ACTIVITY, GroupsFieldsDto.SITE, GroupsFieldsDto.CAN_SEE_ALL_POSTS, GroupsFieldsDto.VERIFIED, GroupsFieldsDto.CONTACTS, GroupsFieldsDto.LINKS, GroupsFieldsDto.IS_FAVORITE, GroupsFieldsDto.IS_SUBSCRIBED, GroupsFieldsDto.BAN_INFO, GroupsFieldsDto.INVITED_BY, GroupsFieldsDto.IS_HIDDEN_FROM_FEED, GroupsFieldsDto.HAS_PHOTO, GroupsFieldsDto.MEMBER_STATUS, GroupsFieldsDto.CAN_UPLOAD_VIDEO, GroupsFieldsDto.MARKET, GroupsFieldsDto.APP_BUTTONS, GroupsFieldsDto.COVER, GroupsFieldsDto.VIDEO_LIVE, GroupsFieldsDto.CAN_SUGGEST, GroupsFieldsDto.CAN_UPLOAD_STORY, GroupsFieldsDto.WALL, GroupsFieldsDto.USING_VKPAY_MARKET_APP, GroupsFieldsDto.ADDRESSES, GroupsFieldsDto.HAS_MARKET_APP, GroupsFieldsDto.ACTION_BUTTON, GroupsFieldsDto.TRENDING, GroupsFieldsDto.AUDIO_ARTIST_ID, GroupsFieldsDto.AUDIO_CURATOR_ID, GroupsFieldsDto.BUTTONS, GroupsFieldsDto.PHONE, GroupsFieldsDto.CAN_SUBSCRIBE_PODCASTS, GroupsFieldsDto.IS_SUBSCRIBED_PODCASTS, GroupsFieldsDto.IS_MESSAGES_BLOCKED, GroupsFieldsDto.LIVE_COVERS, GroupsFieldsDto.ONLINE_STATUS, GroupsFieldsDto.CAN_SUBSCRIBE_POSTS, GroupsFieldsDto.CAN_REPORT, GroupsFieldsDto.CHATS_STATUS, GroupsFieldsDto.DONUT, GroupsFieldsDto.CAN_POST_DONUT, GroupsFieldsDto.HAS_SUGGESTIONS, GroupsFieldsDto.SHOW_SUGGESTIONS, GroupsFieldsDto.IS_MARKET_CART_ENABLED, GroupsFieldsDto.SCREEN_NAME, GroupsFieldsDto.MARKET_SERVICES, GroupsFieldsDto.CAN_UPLOAD_CLIP, GroupsFieldsDto.IS_BUSINESS, GroupsFieldsDto.DEACTIVATED_MESSAGE, GroupsFieldsDto.IS_GOVERNMENT_ORGANIZATION, GroupsFieldsDto.MEMBERS_PREVIEW, GroupsFieldsDto.MARKET_SHOP_CONDITIONS_STATE);
    public final nrt h;

    /* compiled from: GetFullCommunityMethod.kt */
    public static final class a extends com.vk.api.request.rx.batch.b<JSONObject, JSONObject, BaseOkResponseDto, JSONObject> {
        public a(hz2 hz2Var, hz2 hz2Var2, dz2 dz2Var) {
            super(hz2Var, hz2Var2, dz2Var);
        }

        @Override // com.vk.api.request.rx.batch.b
        public final JSONObject K0(bv6<JSONObject> bv6Var, bv6<JSONObject> bv6Var2, bv6<BaseOkResponseDto> bv6Var3) {
            JSONObject optJSONObject;
            JSONObject optJSONObject2;
            JSONObject jSONObject = bv6Var.a;
            JSONObject jSONObject2 = bv6Var2.a.getJSONObject("response");
            JSONObject jSONObject3 = jSONObject.getJSONObject("response");
            JSONArray optJSONArray = jSONObject3.optJSONArray("live_covers");
            if (optJSONArray != null && (optJSONObject = jSONObject3.optJSONObject("group")) != null && (optJSONObject2 = optJSONObject.optJSONObject("live_covers")) != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("count", optJSONArray.length());
                jSONObject4.put("items", optJSONArray);
                JSONArray optJSONArray2 = jSONObject2.optJSONArray("groups");
                if (optJSONArray2 == null) {
                    optJSONArray2 = new JSONArray();
                }
                jSONObject4.put("groups", optJSONArray2);
                JSONArray optJSONArray3 = jSONObject2.optJSONArray("profiles");
                if (optJSONArray3 == null) {
                    optJSONArray3 = new JSONArray();
                }
                jSONObject4.put("profiles", optJSONArray3);
                optJSONObject2.putOpt("items", jSONObject4);
            }
            jSONObject3.remove("live_covers");
            uki0 c = dli0.c(jSONObject3.keys());
            HashSet hashSet = new HashSet();
            rli0.z(c, hashSet);
            JSONObject jSONObject5 = jSONObject3.getJSONObject("group");
            Iterator<String> keys = jSONObject5.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!hashSet.contains(next)) {
                    jSONObject3.put(next, jSONObject5.get(next));
                }
            }
            jSONObject3.remove("group");
            int optInt = jSONObject3.optInt("invited_by");
            int i = 0;
            JSONObject jSONObject6 = null;
            if (optInt > 0) {
                JSONArray optJSONArray4 = jSONObject3.optJSONArray("profiles");
                if (optJSONArray4 != null) {
                    int length = optJSONArray4.length();
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        JSONObject optJSONObject3 = optJSONArray4.optJSONObject(i);
                        if (optJSONObject3 != null && optJSONObject3.optInt("id") == optInt) {
                            jSONObject6 = optJSONObject3;
                            break;
                        }
                        i++;
                    }
                }
                if (jSONObject6 != null) {
                    jSONObject3.put("invited_by_user", jSONObject6);
                }
            } else if (optInt < 0) {
                JSONArray optJSONArray5 = jSONObject3.optJSONArray("groups");
                int abs = Math.abs(optInt);
                if (optJSONArray5 != null) {
                    int length2 = optJSONArray5.length();
                    while (true) {
                        if (i >= length2) {
                            break;
                        }
                        JSONObject optJSONObject4 = optJSONArray5.optJSONObject(i);
                        if (optJSONObject4 != null && optJSONObject4.optInt("id") == abs) {
                            jSONObject6 = optJSONObject4;
                            break;
                        }
                        i++;
                    }
                }
                if (jSONObject6 != null) {
                    jSONObject3.put("invited_by_group", jSONObject6);
                }
            }
            jSONObject3.put("stories", jSONObject2);
            return jSONObject;
        }

        @Override // xsna.xz2
        public final int[] l() {
            return ort.this.h.l();
        }
    }

    public ort(UserId userId, String str, boolean z, qj4 qj4Var, b9 b9Var, List list, aay aayVar, Float f, Float f2, Boolean bool) {
        this.b = userId;
        this.c = list;
        this.d = f;
        this.e = f2;
        this.f = bool;
        this.h = new nrt(userId, str, z, qj4Var, b9Var, list != null ? j5g.g0(list, StringUtils.COMMA, null, null, 0, null, 62) : null, aayVar);
    }

    @Override // xsna.qrt
    public final ExtendedCommunityProfile b(JSONObject jSONObject) {
        return this.h.b(jSONObject);
    }

    @Override // xsna.qrt
    public final rsg0<JSONObject> d() {
        ArrayList arrayList;
        UserId userId = this.b;
        if (!fkq0.b(userId)) {
            com.vk.metrics.eventtracking.b.a.q(new IllegalStateException(b4q.b(userId, "Incorrect groupId=")));
        }
        UserId a2 = fkq0.a(userId);
        List l = e43.l(BaseUserGroupFieldsDto.ID, BaseUserGroupFieldsDto.FIRST_NAME, BaseUserGroupFieldsDto.LAST_NAME, BaseUserGroupFieldsDto.SCREEN_NAME, BaseUserGroupFieldsDto.PHOTO_BASE);
        tfx tfxVar = new tfx("groups.getGroupInfo", new tf3(15), new uf3(11));
        tfx.n(tfxVar, "group_id", a2, 1L, 0L, 8);
        if (l != null) {
            List list = l;
            arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("profile_fields", arrayList);
        }
        tfxVar.j("need_onboarding", this.f.booleanValue());
        Float f = this.d;
        if (f != null) {
            tfxVar.h("latitude", f.floatValue(), -90.0d, 90.0d);
        }
        Float f2 = this.e;
        if (f2 != null) {
            tfxVar.h("longitude", f2.floatValue(), -180.0d, 180.0d);
        }
        hz2 z = yfb.z(tfxVar, new y8(22));
        List<GroupsFieldsDto> list2 = this.g;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((GroupsFieldsDto) it2.next()).k());
        }
        Iterable iterable = this.c;
        if (iterable == null) {
            iterable = EmptyList.b;
        }
        z.i("group_fields", j5g.u0(iterable, arrayList2));
        hz2 z2 = yfb.z(zul0.h(new avl0(), this.b, null, null, null, e43.l(BaseUserGroupFieldsDto.NAME, BaseUserGroupFieldsDto.SCREEN_NAME, BaseUserGroupFieldsDto.SEX, BaseUserGroupFieldsDto.VERIFIED, BaseUserGroupFieldsDto.CAN_WRITE_PRIVATE_MESSAGE, BaseUserGroupFieldsDto.FIRST_NAME_GEN, BaseUserGroupFieldsDto.LAST_NAME_GEN, BaseUserGroupFieldsDto.FIRST_NAME_DAT, BaseUserGroupFieldsDto.LAST_NAME_DAT, BaseUserGroupFieldsDto.FRIEND_STATUS, BaseUserGroupFieldsDto.IS_MEMBER, BaseUserGroupFieldsDto.CAN_UPLOAD_STORY, BaseUserGroupFieldsDto.TRENDING, BaseUserGroupFieldsDto.IS_NFT_PHOTO, BaseUserGroupFieldsDto.IS_NFT), null, null, null, null, 32718), new y8(22));
        tfx tfxVar2 = new tfx("groups.addRecent", new rr(18), new vr(16));
        tfx.n(tfxVar2, "group_id", a2, 1L, 0L, 8);
        return new a(z, z2, yfb.x(tfxVar2));
    }
}
