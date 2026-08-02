package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.masks.Mask;
import com.vk.dto.masks.MaskSection;
import com.vk.dto.masks.MasksCatalogItem;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MasksGetCameraCatalog.kt */
/* loaded from: classes15.dex */
public final class sh10 extends rsg0<ArrayList<MasksCatalogItem>> {
    public sh10(int i) {
        super("masks.getCameraCatalog");
        C(1, "extended");
        C(1, "need_counters");
        C(i, "model_version");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        HashMap hashMap;
        HashMap hashMap2;
        ArrayList arrayList;
        JSONArray jSONArray;
        HashMap hashMap3;
        int i;
        int i2;
        ArrayList arrayList2;
        JSONArray jSONArray2;
        HashMap hashMap4;
        int i3;
        int i4;
        Mask mask;
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        JSONArray optJSONArray = jSONObject2.optJSONArray("profiles");
        if (optJSONArray != null) {
            hashMap = new HashMap();
            int length = optJSONArray.length();
            for (int i5 = 0; i5 < length; i5++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i5);
                if (optJSONObject != null) {
                    UserProfile userProfile = new UserProfile(optJSONObject);
                    hashMap.put(userProfile.c, userProfile);
                }
            }
        } else {
            hashMap = null;
        }
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("groups");
        if (optJSONArray2 != null) {
            hashMap2 = new HashMap();
            int length2 = optJSONArray2.length();
            for (int i6 = 0; i6 < length2; i6++) {
                JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i6);
                if (optJSONObject2 != null) {
                    Group group = new Group(optJSONObject2);
                    hashMap2.put(group.c, group);
                }
            }
        } else {
            hashMap2 = null;
        }
        HashMap hashMap5 = new HashMap();
        JSONArray optJSONArray3 = jSONObject2.optJSONArray("counters");
        if (optJSONArray3 != null) {
            int length3 = optJSONArray3.length();
            for (int i7 = 0; i7 < length3; i7++) {
                JSONObject jSONObject3 = optJSONArray3.getJSONObject(i7);
                hashMap5.put(Integer.valueOf(jSONObject3.getInt("id")), Long.valueOf(jSONObject3.getLong("clips_count")));
            }
        }
        JSONArray optJSONArray4 = jSONObject2.optJSONArray("items");
        if (optJSONArray4 != null) {
            ArrayList arrayList3 = new ArrayList(optJSONArray4.length());
            int length4 = optJSONArray4.length();
            int i8 = 0;
            while (i8 < length4) {
                JSONObject optJSONObject3 = optJSONArray4.optJSONObject(i8);
                if (optJSONObject3 != null) {
                    String optString = optJSONObject3.optString("type");
                    JSONArray optJSONArray5 = optJSONObject3.optJSONArray("items");
                    if (optJSONArray5 != null) {
                        arrayList2 = new ArrayList(optJSONArray5.length());
                        int length5 = optJSONArray5.length();
                        int i9 = 0;
                        while (i9 < length5) {
                            JSONObject optJSONObject4 = optJSONArray5.optJSONObject(i9);
                            if (optJSONObject4 != null) {
                                JSONObject optJSONObject5 = optJSONObject4.optJSONObject("mask");
                                if (optJSONObject5 == null) {
                                    optJSONObject5 = optJSONObject4.optJSONObject("effect");
                                }
                                if (optJSONObject5 != null) {
                                    i3 = length4;
                                    i4 = i8;
                                    UserId userId = new UserId(optJSONObject5.optLong("owner_id"));
                                    int optInt = optJSONObject5.optInt("id");
                                    Serializer.c<Mask> cVar = Mask.CREATOR;
                                    UserProfile userProfile2 = hashMap != null ? (UserProfile) hashMap.get(userId) : null;
                                    Group group2 = hashMap2 != null ? (Group) hashMap2.get(fkq0.e(userId)) : null;
                                    Long l = (Long) hashMap5.get(Integer.valueOf(optInt));
                                    long longValue = l != null ? l.longValue() : 0L;
                                    jSONArray2 = optJSONArray4;
                                    hashMap4 = hashMap5;
                                    mask = Mask.a.a(optJSONObject5, userProfile2, group2, longValue);
                                } else {
                                    jSONArray2 = optJSONArray4;
                                    hashMap4 = hashMap5;
                                    i3 = length4;
                                    i4 = i8;
                                    mask = null;
                                }
                                arrayList2.add(mask);
                            } else {
                                jSONArray2 = optJSONArray4;
                                hashMap4 = hashMap5;
                                i3 = length4;
                                i4 = i8;
                            }
                            i9++;
                            hashMap5 = hashMap4;
                            length4 = i3;
                            i8 = i4;
                            optJSONArray4 = jSONArray2;
                        }
                    } else {
                        arrayList2 = null;
                    }
                    jSONArray = optJSONArray4;
                    hashMap3 = hashMap5;
                    i = length4;
                    i2 = i8;
                    ArrayList q = arrayList2 != null ? p4g.q(j5g.V(arrayList2)) : null;
                    arrayList3.add(new MasksCatalogItem(new MaskSection(0, null, optString, false, q != null ? q.size() : 0), q));
                } else {
                    jSONArray = optJSONArray4;
                    hashMap3 = hashMap5;
                    i = length4;
                    i2 = i8;
                }
                i8 = i2 + 1;
                hashMap5 = hashMap3;
                length4 = i;
                optJSONArray4 = jSONArray;
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        if (hashMap != null) {
            hashMap.clear();
        }
        if (hashMap2 != null) {
            hashMap2.clear();
        }
        return arrayList;
    }
}
