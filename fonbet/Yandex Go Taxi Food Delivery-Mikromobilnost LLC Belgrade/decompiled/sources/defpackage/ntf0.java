package defpackage;

/* loaded from: classes9.dex */
public final class ntf0 implements u93 {
    public final egx a;
    public final String b;

    public ntf0(egx egxVar, String str) {
        this.a = egxVar;
        this.b = str;
    }

    @Override // defpackage.u93
    public final Object a(Object obj, Object obj2) {
        egx egxVar = this.a;
        Object obj3 = egxVar.get(obj);
        if (obj3 == null) {
            egxVar.set(obj, obj2);
            return null;
        }
        if (obj3.equals(obj2)) {
            return null;
        }
        return obj3;
    }

    public final Object b(Object obj) {
        Object obj2 = this.a.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        ny61.r(oyr.t(new StringBuilder("Field "), this.b, " is not set"));
        return null;
    }
}
