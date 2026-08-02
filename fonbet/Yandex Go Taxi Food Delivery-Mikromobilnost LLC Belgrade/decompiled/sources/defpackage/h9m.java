package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class h9m implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ int c;
    public final /* synthetic */ oz40 w;

    public /* synthetic */ h9m(tls tlsVar, int i, oz40 oz40Var, int i2) {
        this.a = i2;
        this.b = tlsVar;
        this.c = i;
        this.w = oz40Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        oz40 oz40Var = this.w;
        int i2 = this.c;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList((List) oz40Var.getValue());
                arrayList.remove(i2);
                oz40Var.setValue(arrayList);
                tlsVar.invoke(Integer.valueOf(i2));
                break;
            default:
                tlsVar.invoke(new qyx0(i2, (List) oz40Var.getValue()));
                break;
        }
        return zy11Var;
    }
}
