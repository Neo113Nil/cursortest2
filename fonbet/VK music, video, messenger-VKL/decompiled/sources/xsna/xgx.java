package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.actions.Action;
import com.vk.dto.newsfeed.SituationalSuggest;
import com.vk.log.L;
import com.vkontakte.android.attachments.GeoAttachment;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: InternalGetSituationalSuggest.kt */
/* loaded from: classes4.dex */
public final class xgx extends rsg0<xwj0> {
    public static SituationalSuggest F0(JSONObject jSONObject) {
        ArrayList arrayList;
        SituationalSuggest.Profile[] profileArr;
        String str;
        int i;
        String str2;
        JSONArray optJSONArray;
        Serializer.c<SituationalSuggest.SituationalImage> cVar = SituationalSuggest.SituationalImage.CREATOR;
        JSONObject optJSONObject = jSONObject.optJSONObject("image");
        int i2 = 0;
        SituationalSuggest.SituationalImage situationalImage = new SituationalSuggest.SituationalImage(optJSONObject != null ? optJSONObject.optString("url", null) : null, optJSONObject != null ? optJSONObject.optBoolean("is_rounded") : false);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("image_dark");
        SituationalSuggest.SituationalImage situationalImage2 = new SituationalSuggest.SituationalImage(optJSONObject2 != null ? optJSONObject2.optString("url", null) : null, optJSONObject2 != null ? optJSONObject2.optBoolean("is_rounded") : false);
        Serializer.c<SituationalSuggest.PlaceholderStyle> cVar2 = SituationalSuggest.PlaceholderStyle.CREATOR;
        SituationalSuggest.PlaceholderStyle a = SituationalSuggest.PlaceholderStyle.a.a(jSONObject.optJSONObject(TtmlNode.TAG_STYLE));
        SituationalSuggest.PlaceholderStyle a2 = SituationalSuggest.PlaceholderStyle.a.a(jSONObject.optJSONObject("style_dark"));
        Serializer.c<SituationalSuggest.SituationalPost> cVar3 = SituationalSuggest.SituationalPost.CREATOR;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("post");
        if (optJSONObject3 == null || (optJSONArray = optJSONObject3.optJSONArray("attachments")) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i3 = 0; i3 < length; i3++) {
                arrayList.add(com.vkontakte.android.attachments.a.c(optJSONArray.getJSONObject(i3), null, null));
            }
        }
        GeoAttachment d = com.vkontakte.android.attachments.a.d(optJSONObject3 != null ? optJSONObject3.optJSONObject("geo") : null);
        if (d != null && arrayList != null) {
            arrayList.add(d);
        }
        SituationalSuggest.SituationalPost situationalPost = new SituationalSuggest.SituationalPost(optJSONObject3 != null ? optJSONObject3.optString("text") : null, arrayList, p6c0.d(optJSONObject3 != null ? optJSONObject3.optJSONObject("poster") : null, null));
        String optString = jSONObject.optString("subhead", null);
        JSONArray optJSONArray2 = jSONObject.optJSONArray("profiles");
        if (optJSONArray2 != null) {
            ArrayList arrayList2 = new ArrayList(optJSONArray2.length());
            int length2 = optJSONArray2.length();
            int i4 = 0;
            while (i4 < length2) {
                JSONObject jSONObject2 = optJSONArray2.getJSONObject(i4);
                arrayList2.add(new SituationalSuggest.Profile(jSONObject2.optInt("id", i2), jSONObject2.optString("first_name"), jSONObject2.optString("last_name"), jSONObject2.optString("photo")));
                i4++;
                optJSONArray2 = optJSONArray2;
                i2 = 0;
            }
            profileArr = (SituationalSuggest.Profile[]) arrayList2.toArray(new SituationalSuggest.Profile[i2]);
        } else {
            profileArr = null;
        }
        List A = profileArr != null ? rli0.A(new ulp0(rli0.y(rl3.D(profileArr), 3), new j0r(7))) : null;
        JSONObject optJSONObject4 = jSONObject.optJSONObject("friends_posted");
        Action.b bVar = Action.b;
        Action a3 = Action.a.a(jSONObject.optJSONObject("link"));
        int optInt = jSONObject.optInt("suggest_id", 0);
        String optString2 = jSONObject.optString("type", null);
        String optString3 = jSONObject.optString("text", null);
        SituationalSuggest.Profile[] profileArr2 = profileArr;
        String optString4 = jSONObject.optString("action_text", null);
        String optString5 = jSONObject.optString("action_type", null);
        if (optJSONObject4 == null || (str = optJSONObject4.optString("text", null)) == null) {
            str = "";
        }
        String str3 = str;
        if (optJSONObject4 != null) {
            str2 = optString3;
            i = optJSONObject4.optInt("count", 0);
        } else {
            i = 0;
            str2 = optString3;
        }
        return new SituationalSuggest(optInt, optString2, str2, optString4, optString5, str3, i, A, situationalImage, situationalImage2, a, a2, situationalPost, profileArr2, a3, optString);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        SituationalSuggest situationalSuggest = null;
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("response");
            if (optJSONObject != null) {
                situationalSuggest = F0(optJSONObject);
            }
        } catch (Exception e) {
            L.i(e);
        }
        return new bwf0(situationalSuggest);
    }
}
