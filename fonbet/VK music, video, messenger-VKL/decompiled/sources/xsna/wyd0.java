package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RelativeProfile;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ProfileParsers.kt */
/* loaded from: classes15.dex */
public final class wyd0 {

    /* compiled from: ProfileParsers.kt */
    public static final class a {
        public final int a;
        public final List<UserId> b;

        public a(int i, List<UserId> list) {
            this.a = i;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProfileMutualFriendsData(totalCount=");
            sb.append(this.a);
            sb.append(", mutualFriendsIds=");
            return ms9.a(')', sb, this.b);
        }
    }

    public static ArrayList a(ArrayList arrayList, RelativeProfile relativeProfile) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.add(relativeProfile);
        return arrayList;
    }

    public static RelativeProfile[] b(ArrayList arrayList) {
        if (arrayList != null) {
            return (RelativeProfile[]) arrayList.toArray(RelativeProfile.CREATOR.newArray(arrayList.size()));
        }
        return null;
    }

    public static final a c(JSONObject jSONObject) {
        int optInt = jSONObject != null ? jSONObject.optInt("count") : 0;
        JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("users") : null;
        if (optJSONArray == null) {
            return new a(optInt, EmptyList.b);
        }
        int length = optJSONArray.length();
        if (length > 3) {
            length = 3;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            arrayList.add(new UserId(optJSONArray.optLong(i)));
        }
        return new a(optInt, arrayList);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final void d(JSONArray jSONArray, ExtendedUserProfile extendedUserProfile, HashMap hashMap) {
        int length = jSONArray.length();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                UserId userId = new UserId(optJSONObject.getLong("id"));
                String optString = optJSONObject.optString("name");
                String optString2 = optJSONObject.optString("type");
                RelativeProfile relativeProfile = new RelativeProfile(userId, optString, (UserProfile) hashMap.get(userId));
                if (optString2 != null) {
                    switch (optString2.hashCode()) {
                        case -995424086:
                            if (optString2.equals("parent")) {
                                arrayList = a(arrayList, relativeProfile);
                                break;
                            } else {
                                break;
                            }
                        case -268316490:
                            if (optString2.equals("grandparent")) {
                                arrayList3 = a(arrayList3, relativeProfile);
                                break;
                            } else {
                                break;
                            }
                        case 94631196:
                            if (optString2.equals("child")) {
                                arrayList2 = a(arrayList2, relativeProfile);
                                break;
                            } else {
                                break;
                            }
                        case 395180944:
                            if (optString2.equals("grandchild")) {
                                arrayList4 = a(arrayList4, relativeProfile);
                                break;
                            } else {
                                break;
                            }
                        case 2083595970:
                            if (optString2.equals("sibling")) {
                                arrayList5 = a(arrayList5, relativeProfile);
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
        }
        extendedUserProfile.B = b(arrayList);
        extendedUserProfile.C = b(arrayList5);
        extendedUserProfile.D = b(arrayList2);
        extendedUserProfile.E = b(arrayList3);
        extendedUserProfile.F = b(arrayList4);
    }
}
