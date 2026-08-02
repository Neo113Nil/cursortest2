package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class kyc {
    public final pho a;

    public kyc(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(String str, Integer num, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        hashMap.put("rating", num);
        if (str2 != null) {
            hashMap.put("tips_list", str2);
        }
        this.a.a("Complete.DidTapDoneButton", hashMap, 1, x4e.q(hashMap, "tips_type", str3, "tips_value", str4));
    }
}
