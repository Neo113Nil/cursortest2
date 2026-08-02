package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.UserProfile;
import com.vk.fave.entities.FavePage;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: FaveResponseEntries.kt */
/* loaded from: classes18.dex */
public final class ad90 {
    public final Object a;
    public final int b;
    public final String c;

    public ad90() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v9, types: [kotlin.collections.EmptyList] */
    public ad90(JSONObject jSONObject) {
        ?? r4;
        JSONArray jSONArray;
        String str;
        JSONObject jSONObject2;
        Owner d;
        List list;
        int i;
        JSONArray jSONArray2 = jSONObject.getJSONArray("items");
        if (jSONArray2 != null) {
            r4 = new ArrayList(jSONArray2.length());
            int length = jSONArray2.length();
            int i2 = 0;
            while (i2 < length) {
                JSONObject optJSONObject = jSONArray2.optJSONObject(i2);
                if (optJSONObject != null) {
                    Serializer.c<FavePage> cVar = FavePage.CREATOR;
                    String string = optJSONObject.getString("type");
                    long optLong = optJSONObject.optLong("updated_date");
                    String optString = optJSONObject.optString("description");
                    if (epx.f(string, "user")) {
                        str = optJSONObject.getJSONObject(string).optString("first_name");
                    } else if (epx.f(string, "group")) {
                        str = optJSONObject.getJSONObject(string).optString("name");
                    } else {
                        L.l(go9.b("Incorrect profile type ", string));
                        str = "";
                    }
                    String str2 = str;
                    if (epx.f(string, "user")) {
                        jSONObject2 = optJSONObject.getJSONObject("user");
                    } else {
                        if (!epx.f(string, "group")) {
                            throw new IllegalArgumentException(go9.b("Can't parse ", string));
                        }
                        jSONObject2 = optJSONObject.getJSONObject("group");
                    }
                    if (epx.f(string, "user")) {
                        Serializer.c<Owner> cVar2 = Owner.CREATOR;
                        d = Owner.a.f(jSONObject2);
                    } else {
                        if (!epx.f(string, "group")) {
                            throw new IllegalArgumentException(go9.b("Can't parse ", string));
                        }
                        Serializer.c<Owner> cVar3 = Owner.CREATOR;
                        d = Owner.a.d(jSONObject2);
                    }
                    Owner owner = d;
                    OnlineInfo onlineInfo = new UserProfile(jSONObject2).n;
                    boolean optBoolean = optJSONObject.optBoolean("is_favorite", true);
                    JSONArray optJSONArray = optJSONObject.optJSONArray("tags");
                    if (optJSONArray != null) {
                        list = new ArrayList(optJSONArray.length());
                        int length2 = optJSONArray.length();
                        jSONArray = jSONArray2;
                        int i3 = 0;
                        while (i3 < length2) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i3);
                            if (optJSONObject2 != null) {
                                Serializer.c<FaveTag> cVar4 = FaveTag.CREATOR;
                                i = i3;
                                list.add(FaveTag.a.a(optJSONObject2));
                            } else {
                                i = i3;
                            }
                            i3 = i + 1;
                        }
                    } else {
                        jSONArray = jSONArray2;
                        list = EmptyList.b;
                    }
                    r4.add(new FavePage(string, optString, optLong, owner, str2, onlineInfo, optBoolean, list));
                } else {
                    jSONArray = jSONArray2;
                }
                i2++;
                jSONArray2 = jSONArray;
            }
        } else {
            r4 = 0;
        }
        r4 = r4 == 0 ? EmptyList.b : r4;
        int optInt = jSONObject.optInt("count", 0);
        String optString2 = jSONObject.optString("next_from");
        this.a = r4;
        this.b = optInt;
        this.c = optString2;
    }
}
