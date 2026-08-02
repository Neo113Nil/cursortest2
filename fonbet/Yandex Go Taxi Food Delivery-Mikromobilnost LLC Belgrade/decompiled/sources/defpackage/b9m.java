package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class b9m implements sls {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ z8m b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ int w;
    public final /* synthetic */ oz40 x;

    public b9m(ArrayList arrayList, z8m z8mVar, tls tlsVar, int i, oz40 oz40Var) {
        this.a = arrayList;
        this.b = z8mVar;
        this.c = tlsVar;
        this.w = i;
        this.x = oz40Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        oz40 oz40Var = this.x;
        ArrayList arrayList = new ArrayList((List) oz40Var.getValue());
        int i = this.w;
        arrayList.remove(i);
        oz40Var.setValue(arrayList);
        this.a.remove(Integer.valueOf(this.b.e));
        this.c.invoke(Integer.valueOf(i));
        return zy11.a;
    }
}
