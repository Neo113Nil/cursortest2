package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.privacy.ListFriends;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PrivacyFriendsInfo.kt */
/* loaded from: classes17.dex */
public final class ded0 {
    public final List<ListFriends> a;
    public final List<ProfileFriendItem> b;
    public final boolean c;

    /* compiled from: PrivacyFriendsInfo.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
        public static ded0 a(JSONObject jSONObject) {
            List list;
            ?? r3;
            JSONObject optJSONObject = jSONObject.optJSONObject("listsFriends");
            ArrayList arrayList = null;
            JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("items") : null;
            Serializer.c<ListFriends> cVar = ListFriends.CREATOR;
            if (optJSONArray != null) {
                arrayList = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    if (optJSONObject2 != null) {
                        arrayList.add(ListFriends.a.a(optJSONObject2));
                    }
                }
            }
            if (arrayList == null || (list = j5g.O0(arrayList)) == null) {
                list = EmptyList.b;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("forbiddenFriends");
            if (optJSONArray2 != null) {
                r3 = new ArrayList(optJSONArray2.length());
                int length2 = optJSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject2 = optJSONArray2.getJSONObject(i2);
                    Serializer.c<ProfileFriendItem> cVar2 = ProfileFriendItem.CREATOR;
                    r3.add(ProfileFriendItem.a.a(jSONObject2));
                }
            } else {
                r3 = EmptyList.b;
            }
            return new ded0(list, r3, jSONObject.optBoolean("isProfileClosed"));
        }
    }

    public ded0() {
        this(0);
    }

    public ded0(List<ListFriends> list, List<ProfileFriendItem> list2, boolean z) {
        this.a = list;
        this.b = list2;
        this.c = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ded0(int i) {
        this(r2, r2, false);
        EmptyList emptyList = EmptyList.b;
    }
}
