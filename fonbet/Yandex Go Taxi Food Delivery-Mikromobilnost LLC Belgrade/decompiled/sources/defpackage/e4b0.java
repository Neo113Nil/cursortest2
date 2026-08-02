package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final class e4b0 {
    public final pho a;

    public e4b0(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(String str, String str2, String str3, ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        hashMap.put("goals", arrayList);
        hashMap.put("type", str);
        hashMap.put("open_source", str2);
        if (str3 != null) {
            hashMap.put("selected_goal", str3);
        }
        this.a.a("PersonalGoals.Selector.Tapped", hashMap, 1, new HashMap());
    }
}
