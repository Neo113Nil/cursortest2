package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class f9m implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ wls c;
    public final /* synthetic */ oz40 w;

    public /* synthetic */ f9m(int i, wls wlsVar, oz40 oz40Var, int i2) {
        this.a = i2;
        this.b = i;
        this.c = wlsVar;
        this.w = oz40Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        boolean z = false;
        wls wlsVar = this.c;
        oz40 oz40Var = this.w;
        int i2 = this.b;
        switch (i) {
            case 0:
                if (i2 > 0) {
                    ArrayList arrayList = new ArrayList((List) oz40Var.getValue());
                    int i3 = i2 - 1;
                    arrayList.add(i3, arrayList.remove(i2));
                    oz40Var.setValue(arrayList);
                    wlsVar.invoke(Integer.valueOf(i3), Integer.valueOf(i2));
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                if (i2 < ((List) oz40Var.getValue()).size() - 1) {
                    ArrayList arrayList2 = new ArrayList((List) oz40Var.getValue());
                    int i4 = i2 + 1;
                    arrayList2.add(i4, arrayList2.remove(i2));
                    oz40Var.setValue(arrayList2);
                    wlsVar.invoke(Integer.valueOf(i4), Integer.valueOf(i2));
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
