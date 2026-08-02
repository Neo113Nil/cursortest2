package xsna;

import android.util.ArrayMap;
import android.util.SparseArray;
import com.ironsource.X3;
import com.vk.api.comments.CommentsOrder;
import com.vk.api.parsers.BadgesParsers;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.serialize.Serializer;
import com.vk.dto.badges.BadgeItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.reactions.ReactionSet;
import com.vk.dto.user.UserProfileGift;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.log.L;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.toggle.features.SmbAdFeatures;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: GiftsResolveLink.java */
/* loaded from: classes15.dex */
public final class a0u extends rsg0 {
    public final /* synthetic */ int s = 2;

    public a0u() {
        super("account.getCommentOrder");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        Map<UserId, Owner> map;
        ?? r3;
        switch (this.s) {
            case 0:
                return new UserProfileGift(jSONObject.getJSONArray("response").getJSONObject(0));
            case 1:
                try {
                    JSONObject optJSONObject = jSONObject.optJSONObject("response");
                    if (optJSONObject == null) {
                        JSONObject jSONObject2 = jSONObject.getJSONArray("execute_errors").getJSONObject(0);
                        throw new VKApiExecutionException(jSONObject2.getInt("error_code"), this.b, false, jSONObject2.getString(SharedKt.PARAM_ERROR_MSG));
                    }
                    JSONArray optJSONArray = optJSONObject.optJSONArray("items");
                    if (optJSONArray == null) {
                        return WallWithCounters.b;
                    }
                    String optString = optJSONObject.optString("next_from");
                    ArrayList arrayList = new ArrayList();
                    int optInt = optJSONObject.optInt("count");
                    Map<UserId, Owner> e = vj90.e(optJSONObject);
                    ArrayMap<String, ReactionSet> r = tci.r(optJSONObject);
                    SparseArray<BadgeItem> b = BadgesParsers.b(optJSONObject);
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("fixed");
                    com.vk.dto.newsfeed.entries.a aVar = new com.vk.dto.newsfeed.entries.a();
                    SmbAdFeatures smbAdFeatures = SmbAdFeatures.FEATURE_SMB_PIXEL_STATS_REFACTORING;
                    smbAdFeatures.getClass();
                    boolean a = com.vk.toggle.b.A.a(smbAdFeatures);
                    if (optJSONObject2 != null) {
                        try {
                            NewsEntry a2 = aVar.a(optJSONObject2.optString("type"), optJSONObject2, r, b, e, a, new ck90());
                            map = e;
                            if (a2 != null) {
                                try {
                                    arrayList.add(a2);
                                } catch (Exception e2) {
                                    e = e2;
                                    com.vk.metrics.eventtracking.b.a.a(e);
                                    bis.j(optJSONArray, map, r, b, arrayList);
                                    WallWithCounters wallWithCounters = new WallWithCounters(optString, optJSONObject.optInt("postponed_count"), optJSONObject.optInt("suggested_count"), optJSONObject.optInt("drafts_count"), optInt);
                                    wallWithCounters.addAll(arrayList);
                                    return wallWithCounters;
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                            map = e;
                        }
                    } else {
                        map = e;
                    }
                    bis.j(optJSONArray, map, r, b, arrayList);
                    WallWithCounters wallWithCounters2 = new WallWithCounters(optString, optJSONObject.optInt("postponed_count"), optJSONObject.optInt("suggested_count"), optJSONObject.optInt("drafts_count"), optInt);
                    wallWithCounters2.addAll(arrayList);
                    return wallWithCounters2;
                } catch (Exception e4) {
                    L.C("vk", e4);
                    if (e4 instanceof VKApiExecutionException) {
                        throw e4;
                    }
                    return null;
                }
            case 2:
                Serializer.c<CommentsOrder> cVar = CommentsOrder.CREATOR;
                JSONObject jSONObject3 = jSONObject.getJSONObject("response");
                String optString2 = jSONObject3.optString("current_order");
                JSONArray optJSONArray2 = jSONObject3.optJSONArray("items");
                if (optJSONArray2 != null) {
                    r3 = new ArrayList(optJSONArray2.length());
                    int length = optJSONArray2.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject3 = optJSONArray2.optJSONObject(i);
                        if (optJSONObject3 != null) {
                            r3.add(new CommentsOrder.Item(optJSONObject3.optString("id"), optJSONObject3.optString("name")));
                        }
                    }
                } else {
                    r3 = EmptyList.b;
                }
                return new CommentsOrder(optString2, r3);
            default:
                return Boolean.valueOf(jSONObject.getInt("response") == 1);
        }
    }

    @Override // xsna.xz2
    public int[] l() {
        switch (this.s) {
            case 1:
                return new int[]{15};
            default:
                return super.l();
        }
    }

    public a0u(String str) {
        super("users.get");
        K("user_ids", str);
        K("fields", "can_see_gifts,first_name_gen");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0u(UserId userId, int i, String str, String str2, boolean z, int i2) {
        super(z ? "video.subscribeToAlbum" : "video.unsubscribeFromAlbum");
        str2 = (i2 & 8) != 0 ? "" : str2;
        F(userId, "owner_id");
        C(i, "album_id");
        K("ref", str);
        K("context", str2);
    }

    public a0u(UserId userId, int i, int i2) {
        this(i, i2, userId, "drafts", "photo_base,sex,first_name_dat,last_name_dat,video_files,first_name_gen,can_write_private_message,can_message,is_government_organization,is_verified,check_sign,last_name_gen,trust_mark");
    }

    public a0u(int i, int i2, UserId userId, String str, String str2) {
        super("wall.get");
        F(userId, "owner_id");
        C(i, SignalingProtocol.KEY_OFFSET);
        C(i2, "count");
        C(1, "extended");
        K("filter", str);
        C(1, "photo_sizes");
        R("need_blacklisted_info", false);
        K("fields", str2);
    }

    public a0u(UserId userId, String str, String str2, String str3, boolean z) {
        super("wall.get");
        F(userId, X3.j.D);
        K("start_from", str);
        C(30, "count");
        C(1, "extended");
        K("filter", str2);
        C(1, "photo_sizes");
        R("need_blacklisted_info", z);
        K("fields", str3);
    }
}
