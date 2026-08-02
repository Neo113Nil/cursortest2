package xsna;

import java.util.LinkedHashMap;

/* compiled from: FairBucketPriorityManagerQueue.kt */
/* loaded from: classes2.dex */
public class hjq implements zbd0 {
    public final sl8 b;
    public final LinkedHashMap c;

    public hjq(sl8 sl8Var) {
        this.b = sl8Var;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sl8Var.c.values()) {
            linkedHashMap.put(obj, d(((Number) obj).intValue()));
        }
        linkedHashMap.computeIfAbsent(Integer.MAX_VALUE, new gjq(new qcl(this, 6), 0));
        this.c = linkedHashMap;
    }

    @Override // xsna.zbd0
    public boolean a(ckv ckvVar) {
        return e(ybd0.a(ckvVar, this.b.c)).d.contains(ckvVar);
    }

    @Override // xsna.zbd0
    public void b(ckv ckvVar) {
        sv90 e = e(ybd0.a(ckvVar, this.b.c));
        e.f.contains(ckvVar);
        e.a(ckvVar);
    }

    @Override // xsna.zbd0
    public boolean c(ckv ckvVar) {
        return e(ybd0.a(ckvVar, this.b.c)).b(ckvVar);
    }

    public final sv90 d(int i) {
        sl8 sl8Var = this.b;
        Integer num = (Integer) sl8Var.a.get(Integer.valueOf(i));
        return new sv90(num != null ? num.intValue() : sl8Var.b, i, sl8Var.c);
    }

    public final sv90 e(int i) {
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.c;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = d(i);
            linkedHashMap.put(valueOf, obj);
        }
        return (sv90) obj;
    }
}
