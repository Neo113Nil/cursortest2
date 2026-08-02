package xsna;

import android.util.LongSparseArray;
import androidx.core.app.NotificationCompat;
import com.ironsource.X3;
import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.external.VideoToClipInfo;
import com.vk.dto.clips.upload.ClipTemplateInfo;
import com.vk.dto.clips.upload.ShortVideoCreationFeature;
import com.vk.dto.common.clips.ClipsLinkAttachment;
import com.vk.dto.common.clips.VideoTemplatePublishInfo;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupLeaveMode;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.polls.PollInfo;
import com.vk.dto.profile.Donut;
import com.vk.dto.stories.entities.OrdData;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.log.L;
import com.vkontakte.android.attachments.PollAttachment;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ncq0;

/* compiled from: PollsGetById.java */
/* loaded from: classes7.dex */
public final class cub0 extends rsg0 {
    public final /* synthetic */ int s = 1;

    public /* synthetic */ cub0(String str) {
        super(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016e  */
    @Override // xsna.oer0, xsna.k7r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(JSONObject jSONObject) {
        Integer num;
        JSONObject optJSONObject;
        pm3 pm3Var;
        int i;
        int optInt;
        int i2;
        Donut donut = null;
        switch (this.s) {
            case 0:
                try {
                    return new PollAttachment(jSONObject.getJSONObject("response"));
                } catch (Exception e) {
                    L.C("vk", e);
                    return null;
                }
            case 1:
                JSONObject jSONObject2 = jSONObject.getJSONObject("response");
                LongSparseArray longSparseArray = new LongSparseArray();
                JSONArray optJSONArray = jSONObject2.optJSONArray("profiles");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i3 = 0; i3 < length; i3++) {
                        JSONObject optJSONObject2 = optJSONArray.optJSONObject(i3);
                        if (optJSONObject2 != null) {
                            Serializer.c<Owner> cVar = Owner.CREATOR;
                            Owner f = Owner.a.f(optJSONObject2);
                            longSparseArray.put(f.b.b, f);
                        }
                    }
                }
                JSONArray optJSONArray2 = jSONObject2.optJSONArray("groups");
                if (optJSONArray2 != null) {
                    int length2 = optJSONArray2.length();
                    for (int i4 = 0; i4 < length2; i4++) {
                        JSONObject optJSONObject3 = optJSONArray2.optJSONObject(i4);
                        if (optJSONObject3 != null) {
                            Serializer.c<Owner> cVar2 = Owner.CREATOR;
                            Owner d = Owner.a.d(optJSONObject3);
                            longSparseArray.put(d.b.b, d);
                        }
                    }
                }
                VKList vKList = new VKList(jSONObject2, new pd(longSparseArray, 4));
                JSONArray jSONArray = jSONObject2.getJSONArray("profiles");
                if (jSONArray.length() != 0) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(0);
                    boolean z = jSONObject3.getBoolean("is_closed");
                    if (z) {
                        JSONObject optJSONObject4 = jSONObject3.optJSONObject("counters");
                        if (optJSONObject4 != null) {
                            optInt = optJSONObject4.optInt("friends");
                        } else {
                            i2 = 0;
                            Serializer.c<Owner> cVar3 = Owner.CREATOR;
                            pm3Var = new pm3(Owner.a.f(jSONObject3), i2, jSONObject3.optString(X3.j.D, null), null, !z, z, false, jSONObject3.optInt("friend_status") != 1, null, false, null, false);
                        }
                    } else {
                        optInt = jSONObject3.optInt("followers_count", 0);
                    }
                    i2 = optInt;
                    Serializer.c<Owner> cVar32 = Owner.CREATOR;
                    pm3Var = new pm3(Owner.a.f(jSONObject3), i2, jSONObject3.optString(X3.j.D, null), null, !z, z, false, jSONObject3.optInt("friend_status") != 1, null, false, null, false);
                } else {
                    JSONObject jSONObject4 = jSONObject2.getJSONArray("groups").getJSONObject(0);
                    int i5 = jSONObject4.getInt("is_closed");
                    String optString = jSONObject4.optString("type");
                    if (optString != null) {
                        int hashCode = optString.hashCode();
                        if (hashCode != 3433103) {
                            if (hashCode != 96891546) {
                                if (hashCode == 98629247 && optString.equals("group")) {
                                    i = 0;
                                    num = i;
                                }
                            } else if (optString.equals(NotificationCompat.CATEGORY_EVENT)) {
                                i = 1;
                                num = i;
                            }
                        } else if (optString.equals("page")) {
                            i = 2;
                            num = i;
                        }
                        Serializer.c<Owner> cVar4 = Owner.CREATOR;
                        Owner d2 = Owner.a.d(jSONObject4);
                        int optInt2 = jSONObject4.optInt("members_count");
                        String optString2 = jSONObject4.optString("screen_name", null);
                        boolean z2 = i5 != 0;
                        boolean z3 = i5 != 1;
                        boolean z4 = i5 != 2;
                        boolean z5 = jSONObject4.getInt("member_status") != 4;
                        optJSONObject = jSONObject4.optJSONObject("donut");
                        if (optJSONObject != null) {
                            Serializer.c<Donut> cVar5 = Donut.CREATOR;
                            donut = Donut.a.a(optJSONObject);
                        }
                        Donut donut2 = donut;
                        boolean z6 = jSONObject4.optInt("is_admin") <= 0;
                        GroupLeaveMode.a aVar = GroupLeaveMode.Companion;
                        String optString3 = jSONObject4.optString("leave_mode");
                        aVar.getClass();
                        GroupLeaveMode a = GroupLeaveMode.a.a(optString3);
                        JSONObject optJSONObject5 = jSONObject4.optJSONObject("enabled_features");
                        pm3Var = new pm3(d2, optInt2, optString2, num, z2, z3, z4, z5, donut2, z6, a, optJSONObject5 != null ? optJSONObject5.has("admin_receive_monetization_payouts") : false);
                    }
                    num = null;
                    Serializer.c<Owner> cVar42 = Owner.CREATOR;
                    Owner d22 = Owner.a.d(jSONObject4);
                    int optInt22 = jSONObject4.optInt("members_count");
                    String optString22 = jSONObject4.optString("screen_name", null);
                    if (i5 != 0) {
                    }
                    if (i5 != 1) {
                    }
                    if (i5 != 2) {
                    }
                    if (jSONObject4.getInt("member_status") != 4) {
                    }
                    optJSONObject = jSONObject4.optJSONObject("donut");
                    if (optJSONObject != null) {
                    }
                    Donut donut22 = donut;
                    if (jSONObject4.optInt("is_admin") <= 0) {
                    }
                    GroupLeaveMode.a aVar2 = GroupLeaveMode.Companion;
                    String optString32 = jSONObject4.optString("leave_mode");
                    aVar2.getClass();
                    GroupLeaveMode a2 = GroupLeaveMode.a.a(optString32);
                    JSONObject optJSONObject52 = jSONObject4.optJSONObject("enabled_features");
                    pm3Var = new pm3(d22, optInt22, optString22, num, z2, z3, z4, z5, donut22, z6, a2, optJSONObject52 != null ? optJSONObject52.has("admin_receive_monetization_payouts") : false);
                }
                return new ro3(vKList, pm3Var);
            case 2:
                return Boolean.valueOf(jSONObject.getInt("response") == 1);
            case 3:
                JSONObject jSONObject5 = jSONObject.getJSONObject("response");
                ncq0 ncq0Var = ncq0.d;
                return new pcq0(ncq0.a.b(jSONObject5), jSONObject5.getInt("video_id"), new UserId(jSONObject5.getLong("owner_id")));
            default:
                return new GetStoriesResponse(jSONObject.optJSONObject("response"));
        }
    }

    public cub0(PollInfo pollInfo) {
        this(pollInfo.b, pollInfo.c, pollInfo.d);
    }

    public cub0(int i, int i2, UserId userId, String str, String str2) {
        super("articles.getOwnerPublished");
        if (userId == null && str == null) {
            throw new IllegalArgumentException("You should provide id or domain for the request");
        }
        if (userId != null) {
            F(userId, "owner_id");
        } else {
            K(X3.j.D, str);
        }
        K("sort_by", str2);
        C(i, SignalingProtocol.KEY_OFFSET);
        C(i2, "count");
        K("fields", "friend_status,members_count,domain,followers_count,is_closed,member_status,counters,verified,trending,donut,oauth_verification,is_verified,is_esia_verified,is_tinkoff_verified,is_sber_verified,photo_base");
        C(1, "extended");
    }

    public cub0(int i, UserId userId, boolean z) {
        super("polls.getById");
        F(userId, "owner_id");
        C(i, "poll_id");
        C(z ? 1 : 0, "is_board");
        C(1, "extended");
        C(3, "friends_count");
        K("friends_fields", "photo_base");
        K("friends_name_case", "nom");
    }

    public cub0(long j, UserId userId, String str, String str2, String str3) {
        super("fave.addProduct");
        D(j, "id");
        F(userId, "owner_id");
        if (str != null && str.length() != 0) {
            K("access_key", str);
        }
        if (str2 != null && str2.length() != 0) {
            K("ref", str2);
        }
        if (str3 == null || str3.length() == 0) {
            return;
        }
        K("track_code", str3);
    }

    public cub0(long j, String str, ClickableStickers clickableStickers, UserId userId, String str2, String str3, String str4, boolean z, String str5, String str6, boolean z2, String str7, boolean z3, int i, VideoToClipInfo videoToClipInfo, ClipsLinkAttachment clipsLinkAttachment, List list, ClipTemplateInfo clipTemplateInfo, VideoTemplatePublishInfo videoTemplatePublishInfo, OrdData ordData, Boolean bool, Integer num, Integer num2, List list2, String str8, Boolean bool2) {
        super("shortVideo.create");
        if (clickableStickers != null) {
            K("clickable_stickers", clickableStickers.e5().toString());
        }
        D(j, "file_size");
        K("title", "Test");
        if (str.length() > 0) {
            K("description", str);
        }
        if (fkq0.c(userId)) {
            F(fkq0.a(userId), "group_id");
        }
        if (str2 != null && str2.length() != 0) {
            K("audio_id", str2);
        }
        if (str3 != null) {
            K("analytics", str3);
        }
        if (str4 != null) {
            K("mask_ids", str4);
        }
        if (list != null) {
            K("creation_features", ((ShortVideoCreationFeature) j5g.Y(list)).h());
        }
        C(z ? 1 : 0, "wallpost");
        if (str5 != null) {
            K("privacy_view", str5);
        }
        if (str6 != null) {
            K("privacy_comment", str6);
        }
        C(z2 ? 1 : 0, "can_make_duet");
        if (str7 != null) {
            K("duet_video_id", str7);
        }
        R("license_2022_agree", z3);
        C(i, "publish_date");
        if (videoToClipInfo != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(videoToClipInfo.b);
            sb.append('_');
            sb.append(videoToClipInfo.c);
            K("source_video_id", sb.toString());
        }
        if (clipTemplateInfo != null) {
            K("metainfo", new JSONObject().put("audio_template", clipTemplateInfo.e5()).toString());
        }
        if (clipsLinkAttachment != null) {
            K("attached_link_title", clipsLinkAttachment.b);
            K("attached_link_url", clipsLinkAttachment.c);
        }
        if (videoTemplatePublishInfo != null) {
            K("template_raw_id", videoTemplatePublishInfo.b);
        }
        if (ordData != null) {
            K("ord_info", com.vk.movika.sdk.android.defaultplayer.interactive.c.b("is_ads", true).put("advertisers", new JSONArray().put(new JSONObject().put("er_id", ordData.d).put("ord_pred_id", ordData.c))).toString());
        }
        if (bool != null) {
            R("is_market_online_booking_enabled", bool.booleanValue());
        }
        if (num != null) {
            C(num.intValue(), "attached_donut_level_id");
        }
        if (num2 != null) {
            C(num2.intValue(), "target_playlist_id");
        }
        if (list2 != null) {
            M("co_owner_ids", list2);
        }
        if (str8 != null) {
            K("attach_to_video_raw_id", str8);
        }
        if (bool2 != null) {
            R("wallpost_mute_notifications", bool2.booleanValue());
        }
    }
}
