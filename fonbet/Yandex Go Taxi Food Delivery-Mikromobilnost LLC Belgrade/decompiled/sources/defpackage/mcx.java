package defpackage;

import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class mcx implements yyn {
    public static final kcx f;
    public static final kcx g;
    public final HashMap a;
    public final HashMap b;
    public final jcx c;
    public boolean d;
    public static final jcx e = new jcx(0);
    public static final lcx h = new lcx();

    /* JADX WARN: Type inference failed for: r0v1, types: [kcx] */
    /* JADX WARN: Type inference failed for: r0v2, types: [kcx] */
    static {
        final int i = 0;
        f = new h131() { // from class: kcx
            @Override // defpackage.uyn
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        jcx jcxVar = mcx.e;
                        ((i131) obj2).a((String) obj);
                        break;
                    default:
                        jcx jcxVar2 = mcx.e;
                        ((i131) obj2).add(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        g = new h131() { // from class: kcx
            @Override // defpackage.uyn
            public final void a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        jcx jcxVar = mcx.e;
                        ((i131) obj2).a((String) obj);
                        break;
                    default:
                        jcx jcxVar2 = mcx.e;
                        ((i131) obj2).add(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public mcx() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        this.c = e;
        this.d = false;
        hashMap2.put(String.class, f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, h);
        hashMap.remove(Date.class);
    }

    @Override // defpackage.yyn
    public final yyn a(Class cls, ip60 ip60Var) {
        this.a.put(cls, ip60Var);
        this.b.remove(cls);
        return this;
    }
}
