package xsna;

import android.util.ArrayMap;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ThemedColor;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.reactions.ReactionAsset;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.reactions.ReactionSet;
import com.vk.dto.reactions.SimpleReactionMeta;
import com.vk.dto.user.ReactionUserProfile;
import com.vk.toggle.features.FeedFeatures;
import io.appmetrica.analytics.impl.L2;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ReactionParsers.kt */
/* loaded from: classes15.dex */
public final class h1f0 {
    public static ReactionMeta a(ReactionSet reactionSet, Integer num) {
        FeedFeatures feedFeatures = FeedFeatures.FEED_REMOVE_CUSTOM_REACTIONS;
        feedFeatures.getClass();
        if (com.vk.toggle.b.A.a(feedFeatures)) {
            return c2f0.d(reactionSet, 0);
        }
        if (num != null) {
            return c2f0.d(reactionSet, num.intValue());
        }
        return null;
    }

    public static VKList b(JSONObject jSONObject) {
        VKList vKList = new VKList();
        vKList.o(jSONObject.optInt("count", 0));
        ArrayMap r = tci.r(jSONObject);
        String optString = jSONObject.optString("reaction_set_id");
        ReactionSet reactionSet = (optString == null || optString.length() == 0) ? null : (ReactionSet) r.get(optString);
        JSONObject optJSONObject = jSONObject.optJSONObject("liked_by_author");
        if (optJSONObject != null) {
            ReactionUserProfile e = e(optJSONObject, null);
            e.i0 = true;
            vKList.add(e);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("liked_by_group");
        if (optJSONObject2 != null) {
            ReactionUserProfile e2 = e(optJSONObject2, null);
            e2.i0 = true;
            vKList.add(e2);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray != null) {
            JSONArray optJSONArray2 = jSONObject.optJSONArray("reactions");
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                ReactionUserProfile e3 = e(optJSONArray.getJSONObject(i), reactionSet != null ? a(reactionSet, optJSONArray2 != null ? Integer.valueOf(optJSONArray2.optInt(i)) : null) : null);
                if (!vKList.contains(e3)) {
                    vKList.add(e3);
                }
            }
        }
        return vKList;
    }

    public static VKList c(JSONObject jSONObject, ReactionSet reactionSet) {
        VKList vKList = new VKList();
        vKList.o(jSONObject.optInt("count", 0));
        JSONObject optJSONObject = jSONObject.optJSONObject("liked_by_author");
        if (optJSONObject != null) {
            ReactionUserProfile e = e(optJSONObject, null);
            e.i0 = true;
            vKList.add(e);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("liked_by_group");
        if (optJSONObject2 != null) {
            ReactionUserProfile e2 = e(optJSONObject2, null);
            e2.i0 = true;
            vKList.add(e2);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray != null) {
            JSONArray optJSONArray2 = jSONObject.optJSONArray("reactions");
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                ReactionUserProfile e3 = e(optJSONArray.getJSONObject(i), a(reactionSet, optJSONArray2 != null ? Integer.valueOf(optJSONArray2.optInt(i)) : null));
                if (!vKList.contains(e3)) {
                    vKList.add(e3);
                }
            }
        }
        return vKList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ReactionSet d(JSONObject jSONObject) {
        JSONArray jSONArray;
        String str;
        int i;
        int i2;
        ReactionAsset reactionAsset;
        ThemedColor themedColor;
        JSONObject optJSONObject;
        ThemedColor themedColor2;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4;
        String str2 = "id";
        String optString = jSONObject.optString("id");
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            int i3 = 0;
            while (i3 < length) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i3);
                int optInt = jSONObject2.optInt(str2);
                String optString2 = jSONObject2.optString("title");
                JSONObject optJSONObject5 = jSONObject2.optJSONObject("asset");
                String str3 = null;
                Object[] objArr = 0;
                if (optJSONObject5 != null) {
                    String optString3 = optJSONObject5.optString("animation_url");
                    JSONArray optJSONArray2 = optJSONObject5.optJSONArray("images");
                    Image image = optJSONArray2 != null ? new Image(optJSONArray2, str3, 2, objArr == true ? 1 : 0) : null;
                    JSONObject optJSONObject6 = optJSONObject5.optJSONObject("title");
                    jSONArray = optJSONArray;
                    str = str2;
                    if (optJSONObject6 == null || (optJSONObject4 = optJSONObject6.optJSONObject("color")) == null) {
                        i = length;
                    } else {
                        i = length;
                        JSONObject optJSONObject7 = optJSONObject4.optJSONObject("foreground");
                        if (optJSONObject7 != null) {
                            String a = cqm0.a(optJSONObject7.optString("light"));
                            Integer a2 = a != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", a) : null;
                            String a3 = cqm0.a(optJSONObject7.optString("dark"));
                            i2 = i3;
                            themedColor = new ThemedColor(a2, a3 != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", a3) : null);
                            optJSONObject = optJSONObject5.optJSONObject("title");
                            if (optJSONObject != null || (optJSONObject2 = optJSONObject.optJSONObject("color")) == null || (optJSONObject3 = optJSONObject2.optJSONObject(L2.g)) == null) {
                                themedColor2 = null;
                            } else {
                                String a4 = cqm0.a(optJSONObject3.optString("light"));
                                Integer a5 = a4 != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", a4) : null;
                                String a6 = cqm0.a(optJSONObject3.optString("dark"));
                                themedColor2 = new ThemedColor(a5, a6 != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", a6) : null);
                            }
                            reactionAsset = new ReactionAsset(optString3, image, themedColor, themedColor2);
                        }
                    }
                    i2 = i3;
                    themedColor = null;
                    optJSONObject = optJSONObject5.optJSONObject("title");
                    if (optJSONObject != null) {
                    }
                    themedColor2 = null;
                    reactionAsset = new ReactionAsset(optString3, image, themedColor, themedColor2);
                } else {
                    jSONArray = optJSONArray;
                    str = str2;
                    i = length;
                    i2 = i3;
                    reactionAsset = null;
                }
                arrayList.add(new SimpleReactionMeta(optInt, optString2, reactionAsset, jSONObject2.optInt("score", 1)));
                i3 = i2 + 1;
                optJSONArray = jSONArray;
                str2 = str;
                length = i;
            }
        }
        return new ReactionSet(optString, arrayList);
    }

    public static ReactionUserProfile e(JSONObject jSONObject, ReactionMeta reactionMeta) {
        ImageSize Cb;
        if (epx.f(jSONObject.optString("type"), CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)) {
            return new ReactionUserProfile(jSONObject, reactionMeta);
        }
        ReactionUserProfile reactionUserProfile = new ReactionUserProfile(reactionMeta);
        reactionUserProfile.c = new UserId(-jSONObject.getLong("id"));
        reactionUserProfile.e = jSONObject.getString("name");
        Serializer.c<Image> cVar = Image.CREATOR;
        Image b = Image.b.b(jSONObject);
        reactionUserProfile.O = b;
        reactionUserProfile.h = (b == null || (Cb = b.Cb(iah0.a((float) 44), true, false)) == null) ? null : Cb.d.d;
        return reactionUserProfile;
    }
}
