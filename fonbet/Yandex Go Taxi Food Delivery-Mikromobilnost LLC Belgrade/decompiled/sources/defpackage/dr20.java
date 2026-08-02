package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public final /* synthetic */ class dr20 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ yf7 b;

    public /* synthetic */ dr20(yf7 yf7Var, int i) {
        this.a = i;
        this.b = yf7Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Integer l;
        Integer l2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = 0;
        yf7 yf7Var = this.b;
        switch (i) {
            case 0:
                ConcurrentHashMap concurrentHashMap = ((gm20) obj).c;
                String a = yf7Var.k().c.a("X-Retry-Number");
                if (a != null && (l = bvu0.l(10, a)) != null) {
                    i2 = l.intValue();
                }
                concurrentHashMap.put("retry_number", Integer.valueOf(i2));
                break;
            default:
                ConcurrentHashMap concurrentHashMap2 = ((ek7) obj).c;
                String a2 = yf7Var.k().c.a("X-YaTaxi-Retry-Number");
                if (a2 != null && (l2 = bvu0.l(10, a2)) != null) {
                    i2 = l2.intValue();
                }
                concurrentHashMap2.put("retry_number", Integer.valueOf(i2));
                break;
        }
        return zy11Var;
    }
}
