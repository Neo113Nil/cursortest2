package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public final /* synthetic */ class og0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ l3t0 b;
    public final /* synthetic */ rh0 c;
    public final /* synthetic */ oz40 w;

    public /* synthetic */ og0(l3t0 l3t0Var, rh0 rh0Var, oz40 oz40Var, int i) {
        this.a = i;
        this.b = l3t0Var;
        this.c = rh0Var;
        this.w = oz40Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        oz40 oz40Var = this.w;
        rh0 rh0Var = this.c;
        l3t0 l3t0Var = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                String str2 = rh0Var.a;
                l3t0Var.put(str2, str);
                LinkedHashMap linkedHashMap = new LinkedHashMap((Map) oz40Var.getValue());
                linkedHashMap.remove(str2);
                oz40Var.setValue(linkedHashMap);
                break;
            default:
                String str3 = rh0Var.a;
                l3t0Var.put(str3, str);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap((Map) oz40Var.getValue());
                linkedHashMap2.remove(str3);
                oz40Var.setValue(linkedHashMap2);
                break;
        }
        return zy11Var;
    }
}
