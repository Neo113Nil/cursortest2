package xsna;

import com.vk.api.photos.PhotosGetAlbums;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.TagsSuggestions;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PhotosGetAlbumsAndTags.kt */
/* loaded from: classes14.dex */
public final class xea0 extends awi<wea0> {
    public final String A;
    public final UserId s;
    public final boolean t;
    public final boolean u;
    public final yea0 v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public xea0(UserId userId, boolean z, yea0 yea0Var, int i, int i2, int i3) {
        userId = (i3 & 1) != 0 ? UserId.d : userId;
        i = (i3 & 32) != 0 ? 10 : i;
        i2 = (i3 & 128) != 0 ? 10 : i2;
        String str = (i3 & 256) != 0 ? null : "PHOTO_CATALOG";
        this.s = userId;
        this.t = true;
        this.u = z;
        this.v = yea0Var;
        this.w = 0;
        this.x = i;
        this.y = 0;
        this.z = i2;
        this.A = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f9, code lost:
    
        if (r2 == null) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.xz2, xsna.nx2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(l7r0 l7r0Var) {
        rsg0[] rsg0VarArr;
        PhotosGetAlbums.a aVar;
        TagsSuggestions tagsSuggestions;
        JSONObject optJSONObject;
        UserId userId = this.s;
        boolean c = fkq0.c(userId);
        String str = this.A;
        hz2 z = yfb.z(!c ? zga0.i(new aha0(), Integer.valueOf(this.w), Integer.valueOf(this.x), str, 8) : zga0.i(new aha0(), null, null, str, 11), new y160(3));
        hz2 z2 = yfb.z(!fkq0.c(userId) ? zga0.i(new aha0(), Integer.valueOf(this.y), Integer.valueOf(this.z), str, 12) : zga0.i(new aha0(), null, null, str, 15), new d230(4));
        if (this.t) {
            boolean c2 = fkq0.c(userId);
            boolean z3 = this.u;
            rsg0VarArr = new rsg0[]{z, z2, yfb.z(!c2 ? zga0.c(new aha0(), null, null, null, null, Boolean.valueOf(z3), 31) : zga0.c(new aha0(), this.s, null, null, null, Boolean.valueOf(z3), 30), new dl70(5))};
        } else {
            rsg0VarArr = new rsg0[]{z, z2};
        }
        if (rsg0VarArr.length > 25) {
            throw new IllegalArgumentException("Не более 25 реквестов в один батч! Это ограничение бэкенда. Сейчас было " + rsg0VarArr.length);
        }
        bv6<? extends Object>[] f = new com.vk.api.request.rx.batch.g(rsg0VarArr).f(l7r0Var);
        JSONObject jSONObject = (JSONObject) f[0].a;
        JSONObject jSONObject2 = (JSONObject) f[1].a;
        bv6 bv6Var = (bv6) rl3.S(2, f);
        Object obj = bv6Var != null ? bv6Var.a : null;
        JSONObject jSONObject3 = obj instanceof JSONObject ? (JSONObject) obj : null;
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = jSONObject.getJSONArray("items");
        if (jSONArray2 != null) {
            int length = jSONArray2.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i);
                jSONObject4.put("is_recognition", false);
                jSONArray.put(jSONObject4);
            }
        }
        JSONArray jSONArray3 = jSONObject.getJSONArray("profiles");
        JSONArray jSONArray4 = jSONObject.getJSONArray("groups");
        HashSet hashSet = new HashSet();
        if (jSONArray3 != null) {
            int length2 = jSONArray3.length();
            for (int i2 = 0; i2 < length2; i2++) {
                hashSet.add(Long.valueOf(jSONArray3.getJSONObject(i2).getLong("id")));
            }
        }
        if (jSONArray4 != null) {
            int length3 = jSONArray4.length();
            for (int i3 = 0; i3 < length3; i3++) {
                hashSet.add(Long.valueOf(jSONArray4.getJSONObject(i3).getLong("id")));
            }
        }
        JSONArray jSONArray5 = jSONObject2.getJSONArray("items");
        if (jSONArray5 != null) {
            int length4 = jSONArray5.length();
            int i4 = 0;
            while (i4 < length4) {
                int i5 = length4;
                JSONObject jSONObject5 = jSONArray5.getJSONObject(i4);
                jSONObject5.put("is_recognition", true);
                jSONArray.put(jSONObject5);
                i4++;
                length4 = i5;
            }
        }
        JSONArray jSONArray6 = jSONObject2.getJSONArray("profiles");
        if (jSONArray6 != null) {
            int length5 = jSONArray6.length();
            for (int i6 = 0; i6 < length5; i6++) {
                hashSet.add(Long.valueOf(jSONArray6.getJSONObject(i6).getLong("id")));
            }
        }
        JSONArray jSONArray7 = jSONObject2.getJSONArray("groups");
        if (jSONArray7 != null) {
            int length6 = jSONArray7.length();
            for (int i7 = 0; i7 < length6; i7++) {
                hashSet.add(Long.valueOf(jSONArray7.getJSONObject(i7).getLong("id")));
            }
        }
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("count", jSONArray.length());
        jSONObject6.put("items", jSONArray);
        JSONObject jSONObject7 = new JSONObject();
        jSONObject7.put("photo_tags", jSONObject6);
        jSONObject7.put("profiles", jSONArray3);
        jSONObject7.put("groups", jSONArray4);
        if (jSONObject3 != null) {
            jSONObject7.put("albums", jSONObject3);
        }
        JSONObject jSONObject8 = new JSONObject();
        jSONObject8.put("response", jSONObject7);
        JSONObject optJSONObject2 = jSONObject8.optJSONObject("response");
        if (optJSONObject2 != null) {
            yea0 yea0Var = this.v;
            aVar = yea0Var != null ? PhotosGetAlbums.F0(optJSONObject2, "albums", yea0Var) : null;
        }
        aVar = new PhotosGetAlbums.a();
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("photo_tags")) == null) {
            tagsSuggestions = null;
        } else {
            Serializer.c<TagsSuggestions> cVar = TagsSuggestions.CREATOR;
            tagsSuggestions = TagsSuggestions.a.a(optJSONObject, null);
        }
        return new wea0(aVar, tagsSuggestions, vj90.e(optJSONObject2));
    }
}
