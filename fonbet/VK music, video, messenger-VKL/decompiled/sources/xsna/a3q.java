package xsna;

import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.shortvideo.ClipsAuthor;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ExecuteGetOwnerClipsGridLists.kt */
/* loaded from: classes14.dex */
public final class a3q extends rsg0<nee> {
    public final UserId s;

    public a3q(UserId userId, boolean z, boolean z2, boolean z3) {
        super("execute.getOwnerClipsGridLists");
        this.s = userId;
        F(userId, "profile_id");
        C(0, "with_lives");
        C(z ? 1 : 0, "with_liked_clips");
        C(z2 ? 1 : 0, "with_profile_info");
        C(z3 ? 1 : 0, "with_scheduled");
        C(9, "func_v");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r14v4 */
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        String str;
        ArrayList arrayList;
        String str2;
        String str3;
        String str4;
        String str5;
        ArrayList arrayList2;
        String str6;
        String str7;
        String str8;
        String str9;
        long j;
        long j2;
        ?? r14;
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        f7d b = g7d.b(jSONObject2.optJSONObject("clips"), null, 6);
        ArrayList arrayList3 = b.a;
        String str10 = b.b;
        long j3 = b.d;
        long j4 = b.e;
        f7d b2 = g7d.b(jSONObject2.optJSONObject("scheduled_clips"), null, 6);
        ArrayList arrayList4 = b2.a;
        String str11 = b2.b;
        JSONObject optJSONObject = jSONObject2.optJSONObject("ended_lives");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        long j5 = 0;
        if (optJSONObject != null) {
            j5 = optJSONObject.optLong("count", 0L);
            JSONArray jSONArray = optJSONObject.getJSONArray("items");
            str = str11;
            ?? arrayList5 = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            arrayList = arrayList4;
            int i = 0;
            while (i < length) {
                arrayList5.add(new VideoFileOld(jSONArray.getJSONObject(i)));
                i++;
                length = length;
                jSONArray = jSONArray;
            }
            ref$ObjectRef.element = arrayList5;
            str2 = optJSONObject.optString("next_from");
            if (str2 == null) {
                str2 = "";
            }
        } else {
            str = str11;
            arrayList = arrayList4;
            str2 = null;
        }
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("liked_clips");
        if (optJSONObject2 != null) {
            JSONArray jSONArray2 = optJSONObject2.getJSONArray("items");
            ArrayList arrayList6 = new ArrayList(jSONArray2.length());
            int length2 = jSONArray2.length();
            str3 = str2;
            int i2 = 0;
            while (i2 < length2) {
                arrayList6.add(new ClipVideoFile(jSONArray2.getJSONObject(i2).getJSONObject("clip").getJSONArray("items").getJSONObject(0), null, null, null, 8, null));
                i2++;
                str10 = str10;
            }
            str4 = str10;
            str5 = null;
            f7d a = g7d.a(optJSONObject2, null, arrayList6);
            arrayList2 = a.a;
            str6 = a.b;
        } else {
            str3 = str2;
            str4 = str10;
            str5 = null;
            arrayList2 = null;
            str6 = null;
        }
        JSONObject optJSONObject3 = jSONObject2.optJSONObject("current_author");
        if (optJSONObject3 != null) {
            String optString = fkq0.b(this.s) ? optJSONObject3.optString("description") : optJSONObject3.optString("about");
            Serializer.c<ClipsAuthor> cVar = ClipsAuthor.CREATOR;
            str7 = optString;
            str9 = str3;
            long j6 = j5;
            r14 = ClipsAuthor.a.a(optJSONObject3);
            str8 = str;
            j = j4;
            j2 = j6;
        } else {
            str7 = str5;
            str8 = str;
            str9 = str3;
            j = j4;
            j2 = j5;
            r14 = str7;
        }
        return new nee(arrayList3, PaginationKey.a.a(str4), (List) ref$ObjectRef.element, j2, PaginationKey.a.a(str9), arrayList2, str6, str7, r14, j3, j, EmptyList.b, arrayList, PaginationKey.a.a(str8));
    }
}
