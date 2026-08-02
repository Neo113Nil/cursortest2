package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public final /* synthetic */ class cr20 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ cr20(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        String str = this.c;
        String str2 = this.b;
        switch (i) {
            case 0:
                ConcurrentHashMap concurrentHashMap = ((gm20) obj).c;
                concurrentHashMap.put("proxy_url", str2);
                concurrentHashMap.put("proxy_type", str);
                break;
            case 1:
                ConcurrentHashMap concurrentHashMap2 = ((gm20) obj).c;
                concurrentHashMap2.put("dns_domain", str2);
                concurrentHashMap2.put("dns_ip", str);
                break;
            case 2:
                ek7 ek7Var = (ek7) obj;
                ek7Var.c.put("dns_domain", str2);
                if (str != null) {
                    ek7Var.c.put("dns_ip", str);
                    break;
                }
                break;
            default:
                ek7 ek7Var2 = (ek7) obj;
                ek7Var2.c.put("proxy_url", str2);
                if (str != null) {
                    ek7Var2.c.put("proxy_route", str);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
