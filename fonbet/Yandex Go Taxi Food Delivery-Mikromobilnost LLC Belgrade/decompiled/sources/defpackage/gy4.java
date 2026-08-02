package defpackage;

import com.yandex.go.ultima_mode.preferences.a;
import com.ybsdk.rconfig.b;

/* loaded from: classes8.dex */
public final /* synthetic */ class gy4 implements sls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ gy4(k9 k9Var, boolean z, k1k0 k1k0Var) {
        this.c = k9Var;
        this.b = z;
        this.w = k1k0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        boolean z = this.b;
        Object obj = this.w;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                k9 k9Var = (k9) obj2;
                k1k0 k1k0Var = (k1k0) obj;
                if ((z ? k9Var : null) != null) {
                    return k1k0Var == null ? xz50.a((b) k9Var.w) : k1k0Var;
                }
                return null;
            default:
                a aVar = (a) obj2;
                String str = (String) obj;
                lv11 lv11Var = aVar.b;
                if (str == null) {
                    str = "";
                }
                qme0 qme0Var = lv11Var.a;
                kgx[] kgxVarArr = lv11.d;
                qme0Var.setValue(lv11Var, kgxVarArr[0], str);
                lv11 lv11Var2 = aVar.b;
                lv11Var2.b.setValue(lv11Var2, kgxVarArr[1], Boolean.valueOf(z));
                return zy11.a;
        }
    }

    public /* synthetic */ gy4(a aVar, String str, boolean z) {
        this.c = aVar;
        this.w = str;
        this.b = z;
    }
}
