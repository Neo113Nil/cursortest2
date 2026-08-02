package xsna;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.additional_settings.data.AdvertisingOrd;
import com.vk.newsfeed.posting.impl.domain.model.EmptyCropArea;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.PhotoTag;
import com.vk.newsfeed.posting.impl.domain.model.PhotoVideoAttachmentsCropData;
import com.vk.newsfeed.posting.impl.domain.model.PostingPreviewRatio;
import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoTagsData;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PostingTypeConverters.kt */
/* loaded from: classes4.dex */
public final class fpc0 {
    public static AdditionalSettingsConfiguration a(String str) {
        AdvertisingOrd advertisingOrd;
        JSONObject jSONObject = new JSONObject(str);
        boolean z = jSONObject.getBoolean("comments_enabled");
        boolean z2 = jSONObject.getBoolean("sign_enabled");
        boolean z3 = jSONObject.getBoolean("notif_enabled");
        if (jSONObject.has("ord")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("ord");
            advertisingOrd = new AdvertisingOrd(f370.D(jSONObject2, "ord_pred_id"), f370.q(jSONObject2, "ord_add"), f370.D(jSONObject2, "ord_er_id"), jSONObject2.has("ord_is_applied_before") ? jSONObject2.getBoolean("ord_is_applied_before") : false);
        } else {
            advertisingOrd = AdvertisingOrd.f;
        }
        return new AdditionalSettingsConfiguration(z, z2, z3, advertisingOrd, false, 16, null);
    }

    public static PhotoTagsData b(String str) {
        JSONArray i = cqm0.i(str);
        ArrayList arrayList = new ArrayList(i.length());
        int length = i.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject = i.getJSONObject(i2);
            int i3 = jSONObject.getInt("photo_tag_id");
            Integer x = f370.x(jSONObject, "product_id");
            long optLong = jSONObject.optLong("product_owner_id");
            gzs<s3q0> gzsVar = fkq0.a;
            arrayList.add(new PhotoTag(i3, new UserId(optLong), x, jSONObject.getString("photo_tag_title"), f370.D(jSONObject, "photo_tag_url"), jSONObject.getInt("photo_tag_photo_id"), f370.u("photo_tag_x", jSONObject), f370.u("photo_tag_y", jSONObject)));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Integer valueOf = Integer.valueOf(((PhotoTag) next).g);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(next);
        }
        return new PhotoTagsData(linkedHashMap, null, false, 6, null);
    }

    public static PhotoVideoAttachmentsCropData c(String str) {
        ArrayList arrayList;
        JSONObject jSONObject = new JSONObject(str);
        ArrayList arrayList2 = null;
        if (jSONObject.has("current_crops")) {
            JSONArray jSONArray = jSONObject.getJSONArray("current_crops");
            arrayList = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString("crop_id");
                String D = f370.D(jSONObject2, "photo_uri");
                arrayList.add(new ImageCropArea(string, D != null ? Uri.parse(D) : null, jSONObject2.getInt("crop_x"), jSONObject2.getInt("crop_y"), jSONObject2.getInt("crop_width"), jSONObject2.getInt("crop_height"), null, null, PsExtractor.AUDIO_STREAM, null));
            }
        } else {
            arrayList = null;
        }
        if (jSONObject.has("empty_crops")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("empty_crops");
            ArrayList arrayList3 = new ArrayList(jSONArray2.length());
            int length2 = jSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                String string2 = jSONObject3.getString("crop_id");
                String D2 = f370.D(jSONObject3, "photo_uri");
                arrayList3.add(new EmptyCropArea(string2, D2 != null ? Uri.parse(D2) : null, e(jSONObject)));
            }
            arrayList2 = arrayList3;
        }
        return new PhotoVideoAttachmentsCropData(arrayList, arrayList2, jSONObject.getString("ratioMeta"), e(jSONObject));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static PrivacyPostType d(String str) {
        DonutLevel donutLevel;
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("privacy_type");
        if (string != null) {
            switch (string.hashCode()) {
                case -1704418640:
                    if (string.equals("single_donut_level")) {
                        String D = f370.D(jSONObject, "donut_level");
                        if (D != null) {
                            JSONObject jSONObject2 = new JSONObject(D);
                            donutLevel = new DonutLevel(jSONObject2.getInt("donut_level_id"), jSONObject2.getString("donut_level_title"), jSONObject2.getString("donut_level_description"), jSONObject2.getString("teaser_text"));
                        } else {
                            donutLevel = null;
                        }
                        return new PrivacyPostType.SingleDonutLevel(donutLevel);
                    }
                    break;
                case 84337210:
                    if (string.equals("best_friends")) {
                        return PrivacyPostType.BestFriends.b;
                    }
                    break;
                case 639321110:
                    if (string.equals("friends_only")) {
                        return PrivacyPostType.FriendsOnly.b;
                    }
                    break;
                case 1108750831:
                    if (string.equals("all_donuts")) {
                        return PrivacyPostType.AllDonuts.b;
                    }
                    break;
            }
        }
        return PrivacyPostType.AllUsers.b;
    }

    public static PostingPreviewRatio e(JSONObject jSONObject) {
        if (!jSONObject.has("ratio")) {
            return PostingPreviewRatio.f;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("ratio");
        return new PostingPreviewRatio(jSONObject2.getInt("ratio_w"), jSONObject2.getInt("ratio_h"), jSONObject2.getBoolean("ratio_custom"), false, 8, null);
    }
}
