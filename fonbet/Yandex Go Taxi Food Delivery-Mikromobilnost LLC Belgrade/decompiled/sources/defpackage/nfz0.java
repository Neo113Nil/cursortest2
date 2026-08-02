package defpackage;

import java.util.HashMap;

/* loaded from: classes14.dex */
public final class nfz0 {
    public final pho a;

    public nfz0(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(Integer num) {
        HashMap hashMap = new HashMap();
        if (num != null) {
            hashMap.put("tips_value", num);
        }
        this.a.a("Tips.Done", hashMap, 1, new HashMap());
    }

    public final void b() {
        this.a.a("Tips.GoBack", new HashMap(), 1, new HashMap());
    }

    public final void c(Integer num) {
        HashMap hashMap = new HashMap();
        hashMap.put("tips_value", num);
        this.a.a("Tips.ValueSelected", hashMap, 1, new HashMap());
    }
}
