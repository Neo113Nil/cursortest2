package defpackage;

import com.yandex.go.ultima_mode.preferences.a;

/* loaded from: classes8.dex */
public final /* synthetic */ class mv11 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ mv11(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                lv11 lv11Var = aVar.b;
                return (Boolean) lv11Var.b.getValue(lv11Var, lv11.d[1]);
            default:
                lv11 lv11Var2 = aVar.b;
                String str = (String) lv11Var2.a.getValue(lv11Var2, lv11.d[0]);
                if (str.length() > 0) {
                    return str;
                }
                return null;
        }
    }
}
