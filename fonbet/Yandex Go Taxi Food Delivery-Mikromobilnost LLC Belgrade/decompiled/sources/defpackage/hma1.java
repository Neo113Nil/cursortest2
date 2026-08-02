package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes11.dex */
public final class hma1 extends s591 {
    public final /* synthetic */ int c = 4;
    public final Object w;

    public hma1(va90 va90Var) {
        super("internal.logger");
        this.w = va90Var;
        this.b.put("log", new dnb1(this, false, true));
        this.b.put("silent", new g3b1("silent", 1));
        ((s591) this.b.get("silent")).f("log", new dnb1(this, true, true));
        this.b.put("unmonitored", new g3b1("unmonitored", 2));
        ((s591) this.b.get("unmonitored")).f("log", new dnb1(this, false, false));
    }

    @Override // defpackage.s591
    public final r691 c(cr71 cr71Var, List list) {
        TreeMap treeMap;
        int i = this.c;
        String str = this.a;
        g791 g791Var = r691.z5;
        Object obj = this.w;
        String str2 = null;
        switch (i) {
            case 0:
                cwa1.e(3, str, list);
                String zzc = ((p791) cr71Var.c).b(cr71Var, (r691) list.get(0)).zzc();
                r691 r691Var = (r691) list.get(1);
                p791 p791Var = (p791) cr71Var.c;
                long l = (long) cwa1.l(p791Var.b(cr71Var, r691Var).zzd().doubleValue());
                r691 b = p791Var.b(cr71Var, (r691) list.get(2));
                HashMap n = b instanceof i691 ? cwa1.n((i691) b) : new HashMap();
                h491 h491Var = (h491) obj;
                h491Var.getClass();
                HashMap hashMap = new HashMap();
                for (String str3 : n.keySet()) {
                    HashMap hashMap2 = h491Var.a.c;
                    hashMap.put(str3, y391.e(str3, hashMap2.containsKey(str3) ? hashMap2.get(str3) : null, n.get(str3)));
                }
                h491Var.c.add(new y391(zzc, l, hashMap));
                return g791Var;
            case 1:
                cwa1.e(2, "getValue", list);
                r691 b2 = ((p791) cr71Var.c).b(cr71Var, (r691) list.get(0));
                r691 b3 = ((p791) cr71Var.c).b(cr71Var, (r691) list.get(1));
                String zzc2 = b2.zzc();
                wl91 wl91Var = (wl91) obj;
                Map map = (Map) ((p8a1) wl91Var.b).x.get((String) wl91Var.a);
                if (map != null && map.containsKey(zzc2)) {
                    str2 = (String) map.get(zzc2);
                }
                return str2 != null ? new a791(str2) : b3;
            case 2:
                return g791Var;
            case 3:
                try {
                    return mwa1.e(((r7a1) obj).call());
                } catch (Exception unused) {
                    return g791Var;
                }
            default:
                cwa1.e(3, str, list);
                ((p791) cr71Var.c).b(cr71Var, (r691) list.get(0)).zzc();
                r691 r691Var2 = (r691) list.get(1);
                p791 p791Var2 = (p791) cr71Var.c;
                r691 b4 = p791Var2.b(cr71Var, r691Var2);
                if (b4 instanceof o691) {
                    r691 b5 = p791Var2.b(cr71Var, (r691) list.get(2));
                    if (b5 instanceof i691) {
                        i691 i691Var = (i691) b5;
                        HashMap hashMap3 = i691Var.a;
                        if (hashMap3.containsKey("type")) {
                            String zzc3 = i691Var.a("type").zzc();
                            int k = hashMap3.containsKey("priority") ? cwa1.k(i691Var.a("priority").zzd().doubleValue()) : 1000;
                            cwb1 cwb1Var = (cwb1) obj;
                            o691 o691Var = (o691) b4;
                            if ("create".equals(zzc3)) {
                                treeMap = cwb1Var.b;
                            } else if ("edit".equals(zzc3)) {
                                treeMap = cwb1Var.a;
                            } else {
                                cwb1Var.getClass();
                                ny61.r("Unknown callback type: ".concat(String.valueOf(zzc3)));
                            }
                            if (treeMap.containsKey(Integer.valueOf(k))) {
                                k = ((Integer) treeMap.lastKey()).intValue() + 1;
                            }
                            treeMap.put(Integer.valueOf(k), o691Var);
                            return g791Var;
                        }
                        ny61.g("Undefined rule type");
                    } else {
                        ny61.g("Invalid callback params");
                    }
                } else {
                    ny61.g("Invalid callback type");
                }
                return null;
        }
    }

    public hma1(h491 h491Var) {
        super("internal.eventLogger");
        this.w = h491Var;
    }

    public hma1(r7a1 r7a1Var) {
        super("internal.appMetadata");
        this.w = r7a1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hma1(g3b1 g3b1Var, wl91 wl91Var) {
        super("getValue");
        this.w = wl91Var;
    }

    public hma1(cwb1 cwb1Var) {
        super("internal.registerCallback");
        this.w = cwb1Var;
    }
}
