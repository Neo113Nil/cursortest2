package xsna;

import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.dto.common.VideoFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ClipsList.kt */
/* loaded from: classes14.dex */
public abstract class e7d extends rsg0<h7d> {
    public static final String t = "photo_base,friend_status,video_files,verified,image_status,is_nft,is_nft_photo,url,trust_mark," + GroupsFieldsDto.VIDEO_LIVES_DATA.k();
    public final boolean s;

    public e7d(String str, PaginationKey paginationKey, int i, boolean z) {
        super(str);
        this.s = z;
        PaginationKey.Next next = paginationKey instanceof PaginationKey.Next ? (PaginationKey.Next) paginationKey : null;
        if (next != null) {
            K("start_from", next.b);
        }
        C(i, "count");
        K("fields", t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.ArrayList] */
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        ?? r0;
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        String a = cqm0.a(jSONObject2.optString("title"));
        eqe0 eqe0Var = null;
        if (this.s) {
            mss0 c = g7d.c(jSONObject2, null, null);
            List<VideoFile> list = c.a;
            String str = c.b;
            long j = c.c;
            PaginationKey paginationKey = PaginationKey.LoadedFull.b;
            return new h7d(list, paginationKey, (str == null || str.length() == 0 || str.equals("null")) ? paginationKey : new PaginationKey.Next(str), j, a, null);
        }
        mss0 c2 = g7d.c(jSONObject2, null, null);
        List<VideoFile> list2 = c2.a;
        String str2 = c2.b;
        long j2 = c2.c;
        JSONArray optJSONArray = jSONObject2.optJSONArray("questionnaires");
        if (optJSONArray != null) {
            try {
                r0 = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        r0.add(fqe0.a(optJSONObject));
                    }
                }
            } catch (Throwable th) {
                com.vk.metrics.eventtracking.b.a.a(th);
                r0 = EmptyList.b;
            }
            eqe0Var = new eqe0(r0);
        }
        eqe0 eqe0Var2 = eqe0Var;
        PaginationKey paginationKey2 = PaginationKey.LoadedFull.b;
        return new h7d(list2, paginationKey2, (str2 == null || str2.length() == 0 || str2.equals("null")) ? paginationKey2 : new PaginationKey.Next(str2), j2, a, eqe0Var2);
    }
}
