package xsna;

import android.util.SparseArray;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ClipsLiveList.kt */
/* loaded from: classes17.dex */
public final class ske extends rsg0<h7d> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        JSONArray optJSONArray = jSONObject2.optJSONArray("profiles");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("groups");
        SparseArray sparseArray = new SparseArray();
        SparseArray sparseArray2 = new SparseArray();
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                UserProfile userProfile = new UserProfile(optJSONArray.getJSONObject(i));
                sparseArray.put((int) userProfile.c.b, userProfile);
            }
        }
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                Group group = new Group(optJSONArray2.getJSONObject(i2));
                sparseArray2.put(-((int) group.c.b), group);
            }
        }
        JSONArray jSONArray = jSONObject2.getJSONArray("items");
        JSONArray jSONArray2 = new JSONArray();
        int length3 = jSONArray.length();
        for (int i3 = 0; i3 < length3; i3++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i3);
            JSONArray jSONArray3 = null;
            if (!epx.f(jSONObject3.optString("type"), "video")) {
                jSONObject3 = null;
            }
            if (jSONObject3 != null && (optJSONObject = jSONObject3.optJSONObject("video")) != null) {
                jSONArray3 = optJSONObject.optJSONArray("items");
            }
            if (jSONArray3 != null) {
                jSONArray2.put(jSONArray3);
            }
        }
        JSONArray jSONArray4 = new JSONArray();
        int length4 = jSONArray2.length();
        for (int i4 = 0; i4 < length4; i4++) {
            JSONArray jSONArray5 = jSONArray2.getJSONArray(i4);
            int length5 = jSONArray5.length();
            for (int i5 = 0; i5 < length5; i5++) {
                jSONArray4.put(jSONArray5.getJSONObject(i5));
            }
        }
        ArrayList arrayList = new ArrayList();
        j9x it = swe0.q(0, jSONArray4.length()).iterator();
        while (it.d) {
            VideoFileOld b = com.vk.dto.common.c.b(jSONArray4.getJSONObject(it.nextInt()));
            if (sparseArray.indexOfKey((int) b.b.b) >= 0) {
                b.f1(((UserProfile) sparseArray.get((int) b.b.b)).l0());
            }
            if (sparseArray2.indexOfKey((int) b.b.b) >= 0) {
                b.f1(tsj.a((Group) sparseArray2.get((int) b.b.b)));
            }
            arrayList.add(b);
        }
        PaginationKey paginationKey = PaginationKey.LoadedFull.b;
        String optString = jSONObject2.optString("next_from");
        return new h7d(arrayList, paginationKey, (optString == null || optString.length() == 0 || optString.equals("null")) ? paginationKey : new PaginationKey.Next(optString), 0L, null, null);
    }
}
