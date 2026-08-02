package xsna;

import android.text.TextUtils;
import android.util.ArrayMap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.common.data.DataBufferUtils;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.reactions.ReactionSet;
import com.vk.log.L;
import com.vk.newsfeed.api.data.NewsfeedGetResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: NewsfeedGetFeedExp.java */
/* loaded from: classes4.dex */
public final class jk60 extends rsg0<NewsfeedGetResponse> {
    public static final AtomicBoolean x = new AtomicBoolean(true);
    public static final String[] y = {"post", "photo", "photo_tag", "promo_button"};

    @Nullable
    public final String s;
    public final long t;
    public final int u;
    public final de60 v;

    @NonNull
    public final zvq w;

    public jk60(@Nullable String str, int i, Boolean bool, @Nullable JSONObject jSONObject, @NonNull de60 de60Var) {
        super("newsfeed.getFeedExp");
        this.t = System.currentTimeMillis();
        this.w = new zvq();
        this.s = str;
        this.u = i;
        this.v = de60Var;
        K("connection_type", com.vk.core.utils.newtork.b.c().b());
        K("connection_subtype", com.vk.core.utils.newtork.b.c().a());
        K("user_options", zeq0.e());
        K("start_from", str);
        K("fields", "video_files,trust_mark," + jy2.a);
        TextUtils.isEmpty(null);
        if (i == -5) {
            C(1, "extended");
            K("filters", "video");
        } else if (i != -4) {
            boolean a1 = hd60.a().a1();
            ArrayList arrayList = new ArrayList(Arrays.asList(y));
            if (!TextUtils.isEmpty(hd60.a().a().m())) {
                arrayList.add("ads_applovin");
            }
            String[] strArr = new String[arrayList.size()];
            arrayList.toArray(strArr);
            K("filters", zeq0.d(a1, strArr));
        } else {
            K("filters", "photo,photo_tag,wall_photo");
        }
        if (i == -5) {
            K("section", "videos");
        } else if (i == -4) {
            K("source_ids", "friends,following");
            K("section", "photos");
        } else if (i == -2) {
            K("source_ids", "friends,following");
            K("section", "friends");
        } else if (i == 0) {
            K("section", "news");
        } else if (i > 0) {
            K("source_ids", "list" + i);
            K("section", "list");
        }
        if (i == 0) {
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "0")) {
                K("feed_type", bool.booleanValue() ? "top" : "recent");
            } else if (de60Var.e()) {
                K("forced_feed_type", bool.booleanValue() ? "top" : "recent");
            }
        }
        if (jSONObject != null) {
            K("geo_data", jSONObject.toString());
        }
        K(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, DataBufferUtils.NEXT_PAGE);
        TextUtils.isEmpty(null);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(@NonNull JSONObject jSONObject) throws Exception, VKApiExecutionException {
        zvq zvqVar = this.w;
        try {
            zvqVar.getClass();
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            NewsfeedGetResponse newsfeedGetResponse = new NewsfeedGetResponse(jSONObject2.optString("next_from", null));
            ArrayMap<String, ReactionSet> r = tci.r(jSONObject2);
            newsfeedGetResponse.reactionSets = r;
            try {
                com.vk.dto.newsfeed.a.a(jSONObject2, newsfeedGetResponse, new qus(zvqVar), r);
            } catch (Exception e) {
                com.vk.metrics.eventtracking.b.a.a(e);
                newsfeedGetResponse = null;
            }
            if (jSONObject2.has("feed_type")) {
                if (newsfeedGetResponse == null) {
                    newsfeedGetResponse = new NewsfeedGetResponse(jSONObject2.optString("next_from", null));
                }
                newsfeedGetResponse.isSmartNews = Boolean.valueOf(TextUtils.equals(jSONObject2.optString("feed_type", "recent"), "top"));
            }
            this.v.b(false);
            if (newsfeedGetResponse != null) {
                newsfeedGetResponse.requestedAt = this.t;
                newsfeedGetResponse.startFrom = this.s;
                newsfeedGetResponse.reqListId = this.u;
                newsfeedGetResponse.sessionIdNextFrom = newsfeedGetResponse.i();
            }
            return newsfeedGetResponse;
        } catch (Exception e2) {
            com.vk.metrics.eventtracking.b.a.a(e2);
            L.l("error", jSONObject.toString());
            throw e2;
        }
    }

    @Override // xsna.xz2
    @Nullable
    public final int[] l() {
        return new int[]{3, 5, 6, 7, 8, 9, 15, 23, 27, 28, 29, 33, 43, 100};
    }
}
