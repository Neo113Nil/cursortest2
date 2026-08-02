package xsna;

import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.data.PrivacyRulesLocal;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PrivacyRulesParser.kt */
/* loaded from: classes7.dex */
public final class ied0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r7.equals("-friends_of_friends,all") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        return com.vk.dto.common.data.PrivacyRules.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7.equals("friends") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        return com.vk.dto.common.data.PrivacyRules.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        if (r7.equals("-friends,all") != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
    
        if (r7.equals("friends_of_friends") == false) goto L43;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static PrivacySetting.PrivacyRule a(boolean z, boolean z2, boolean z3, String str, String str2) {
        switch (str.hashCode()) {
            case -1942494185:
                if (str.equals("friends_of_friends")) {
                    return PrivacyRules.j;
                }
                break;
            case -1887957850:
                if (str.equals("editors")) {
                    return PrivacyRules.g;
                }
                break;
            case -1313660149:
                if (str.equals("only_me")) {
                    return PrivacyRules.b;
                }
                break;
            case -1144722732:
                if (str.equals("friends_of_friends_only")) {
                    return PrivacyRules.l;
                }
                break;
            case -1102510236:
                if (str.equals("list28")) {
                    return PrivacyRules.m;
                }
                break;
            case -600094315:
                if (str.equals("friends")) {
                    return PrivacyRules.h;
                }
                break;
            case 96673:
                if (str.equals("all")) {
                    switch (str2.hashCode()) {
                        case -1942494185:
                            break;
                        case -1376648515:
                            break;
                        case -600094315:
                            break;
                        case 834104057:
                            break;
                        default:
                            return (z || z2) ? PrivacyRulesLocal.a : PrivacyRules.a;
                    }
                }
                break;
            case 84337210:
                if (str.equals("best_friends")) {
                    return PrivacyRules.n;
                }
                break;
            case 95768354:
                if (str.equals("donut")) {
                    return PrivacyRules.f;
                }
                break;
            case 336231138:
                if (str.equals("by_link")) {
                    return PrivacyRules.e;
                }
                break;
            case 948881689:
                if (str.equals("members")) {
                    return PrivacyRules.d;
                }
                break;
        }
        return z3 ? PrivacyRules.m : PrivacyRules.c;
    }

    public static ArrayList b(JSONObject jSONObject) throws JSONException {
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        String optString = jSONObject.optString("category", "");
        String optString2 = jSONObject.optString("excluded_category", "");
        JSONObject optJSONObject = jSONObject.optJSONObject("owners");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("lists");
        JSONObject optJSONObject3 = jSONObject.optJSONObject("lists_owners");
        boolean z = true;
        boolean z2 = (optJSONObject == null || (optJSONArray2 = optJSONObject.optJSONArray("excluded")) == null || optJSONArray2.length() == 0) ? false : true;
        boolean z3 = (optJSONObject2 == null || (optJSONArray = optJSONObject2.optJSONArray("excluded")) == null || optJSONArray.length() == 0) ? false : true;
        JSONArray optJSONArray3 = optJSONObject2 != null ? optJSONObject2.optJSONArray("allowed") : null;
        if (optJSONArray3 != null) {
            int length = optJSONArray3.length();
            for (int i = 0; i < length; i++) {
                if (optJSONArray3.getInt(i) == 28) {
                    break;
                }
            }
        }
        z = false;
        PrivacySetting.PrivacyRule a = a(z2, z3, z, optString, optString2);
        ArrayList arrayList = new ArrayList();
        if (a != PrivacyRules.c || "nobody".equals(optString)) {
            arrayList.add(a);
        }
        PrivacyRules.Include include = new PrivacyRules.Include();
        PrivacyRules.Exclude exclude = new PrivacyRules.Exclude();
        if (optJSONObject != null) {
            if (optJSONObject.has("excluded")) {
                JSONArray jSONArray = optJSONObject.getJSONArray("excluded");
                int length2 = jSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    exclude.Fb(new UserId(jSONArray.getLong(i2)));
                }
            }
            if (optJSONObject.has("allowed")) {
                JSONArray jSONArray2 = optJSONObject.getJSONArray("allowed");
                int length3 = jSONArray2.length();
                for (int i3 = 0; i3 < length3; i3++) {
                    include.Fb(new UserId(jSONArray2.getLong(i3)));
                }
            }
        }
        if (optJSONObject2 != null) {
            if (optJSONObject2.has("excluded")) {
                JSONArray jSONArray3 = optJSONObject2.getJSONArray("excluded");
                int length4 = jSONArray3.length();
                for (int i4 = 0; i4 < length4; i4++) {
                    exclude.Fb(new UserId(jSONArray3.getLong(i4) + 2000000000));
                }
            }
            if (optJSONObject2.has("allowed")) {
                JSONArray jSONArray4 = optJSONObject2.getJSONArray("allowed");
                int length5 = jSONArray4.length();
                for (int i5 = 0; i5 < length5; i5++) {
                    int i6 = jSONArray4.getInt(i5);
                    if (i6 != 28) {
                        include.Fb(new UserId(i6 + 2000000000));
                    }
                }
            }
        }
        if (optJSONObject3 != null) {
            if (optJSONObject3.has("excluded")) {
                JSONArray jSONArray5 = optJSONObject3.getJSONArray("excluded");
                int length6 = jSONArray5.length();
                for (int i7 = 0; i7 < length6; i7++) {
                    exclude.b.add(new UserId(jSONArray5.getLong(i7)));
                }
            }
            if (optJSONObject3.has("allowed")) {
                int length7 = optJSONObject3.getJSONArray("allowed").length();
                for (int i8 = 0; i8 < length7; i8++) {
                    include.b.add(new UserId(r0.getInt(i8)));
                }
            }
        }
        if (include.c.size() > 0) {
            arrayList.add(include);
        }
        if (exclude.c.size() > 0) {
            arrayList.add(exclude);
        }
        if (arrayList.size() == 0) {
            arrayList.add(PrivacyRules.a);
        }
        return arrayList;
    }
}
