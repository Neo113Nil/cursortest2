package xsna;

import android.os.Build;
import android.util.ArrayMap;
import android.util.SparseArray;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.parsers.BadgesParsers;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.badges.BadgeItem;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.LinkedHashMap;
import kotlin.collections.builders.ListBuilder;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;

/* compiled from: NewPostRequest.kt */
/* loaded from: classes4.dex */
public abstract class i860 extends rsg0<NewsEntry> {
    public final LinkedHashMap s;

    public i860(String str, LinkedHashMap linkedHashMap) {
        super(str);
        this.s = linkedHashMap;
        K("device", Build.BRAND + ':' + Build.MANUFACTURER + ':' + Build.MODEL + ':' + Build.PRODUCT);
        K("close_comments", "0");
        C(4, "func_v");
        ListBuilder listBuilder = new ListBuilder(13);
        listBuilder.add(UsersFieldsDto.SEX.i());
        listBuilder.add(UsersFieldsDto.TRENDING.i());
        listBuilder.add(UsersFieldsDto.VERIFIED.i());
        listBuilder.add(UsersFieldsDto.DOMAIN.i());
        listBuilder.add(UsersFieldsDto.EMOJI_STATUS.i());
        listBuilder.add(UsersFieldsDto.HAS_UNSEEN_STORIES.i());
        listBuilder.add(UsersFieldsDto.IS_NFT.i());
        listBuilder.add(UsersFieldsDto.IS_VERIFIED.i());
        listBuilder.add(UsersFieldsDto.FIRST_NAME_GEN.i());
        listBuilder.add(UsersFieldsDto.LAST_NAME_GEN.i());
        listBuilder.add(UsersFieldsDto.PHOTO_BASE.i());
        listBuilder.add("video_files");
        listBuilder.add(GroupsFieldsDto.TRUST_MARK.k());
        s3q0 s3q0Var = s3q0.a;
        G("fields", listBuilder.g());
    }

    public static void H0(i860 i860Var) {
        i860Var.K("close_comments", "1");
    }

    @Override // xsna.oer0, xsna.k7r0
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public NewsEntry a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        String str;
        JSONArray optJSONArray = jSONObject.optJSONArray("execute_errors");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            JSONObject optJSONObject2 = optJSONArray.optJSONObject(0);
            int optInt = optJSONObject2 != null ? optJSONObject2.optInt("error_code") : 0;
            String str2 = this.b;
            if (optJSONObject2 == null || (str = optJSONObject2.optString(SharedKt.PARAM_ERROR_MSG)) == null) {
                str = "";
            }
            throw new VKApiExecutionException(optInt, str2, false, str, null, null, null, null, 0, null, null, null, 4080);
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("response");
        LinkedHashMap linkedHashMap = this.s;
        vj90.d(optJSONObject3, linkedHashMap);
        ArrayMap r = tci.r(optJSONObject3);
        SparseArray<BadgeItem> b = BadgesParsers.b(optJSONObject3);
        com.vk.dto.newsfeed.entries.a aVar = new com.vk.dto.newsfeed.entries.a();
        JSONArray optJSONArray2 = optJSONObject3.optJSONArray("items");
        if (optJSONArray2 == null || (optJSONObject = optJSONArray2.optJSONObject(0)) == null) {
            return null;
        }
        return com.vk.dto.newsfeed.entries.a.b(aVar, "post", optJSONObject, r, b, linkedHashMap, false, null, 96);
    }

    public final void K0(String str) {
        if (epx.f(str, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE))) {
            com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("Posting entryPoint screen is not set for UiTracker"));
        } else {
            K("entry_point", str);
        }
    }
}
