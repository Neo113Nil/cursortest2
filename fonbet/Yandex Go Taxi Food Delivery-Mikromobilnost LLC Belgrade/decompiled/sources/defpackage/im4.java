package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class im4 {
    public final cne0 a;
    public final ConcurrentHashMap.KeySetView b = ConcurrentHashMap.newKeySet();
    public final ConcurrentHashMap.KeySetView c = ConcurrentHashMap.newKeySet();
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public im4(dne0 dne0Var) {
        this.a = dne0Var.a("BoldVerticalBadgeShowPolicyStorage");
    }

    public final void a(String str) {
        ConcurrentHashMap.KeySetView keySetView = this.b;
        if (keySetView.contains(str)) {
            return;
        }
        hm4 c = c(str);
        String o = g8e.o("BADGE_SHOWN_", str);
        this.a.p(c.a + 1, o);
        keySetView.add(str);
    }

    public final void b(String str) {
        ConcurrentHashMap.KeySetView keySetView = this.c;
        if (keySetView.contains(str)) {
            return;
        }
        hm4 c = c(str);
        String o = g8e.o("BADGE_USED_", str);
        this.a.p(c.b + 1, o);
        keySetView.add(str);
    }

    public final hm4 c(String str) {
        ConcurrentHashMap concurrentHashMap = this.d;
        hm4 hm4Var = (hm4) concurrentHashMap.get(str);
        if (hm4Var != null) {
            return hm4Var;
        }
        cne0 cne0Var = this.a;
        hm4 hm4Var2 = new hm4(qv10.d("BADGE_SHOWN_", str, cne0Var, 0), qv10.d("BADGE_USED_", str, cne0Var, 0));
        concurrentHashMap.put(str, hm4Var2);
        return hm4Var2;
    }
}
