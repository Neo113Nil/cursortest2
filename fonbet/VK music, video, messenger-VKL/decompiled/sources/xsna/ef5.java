package xsna;

import java.util.ArrayList;
import java.util.List;
import xsna.hf5;
import xsna.xf5;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ef5 implements izs {
    public final /* synthetic */ hf5 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ List e;

    public /* synthetic */ ef5(hf5 hf5Var, String str, long j, List list) {
        this.b = hf5Var;
        this.c = str;
        this.d = j;
        this.e = list;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List list = (List) obj;
        long o = this.b.a.o(this.c) - this.d;
        if (o < 0) {
            o = 0;
        }
        List<xf5> D0 = j5g.D0(new hf5.b(), list);
        ArrayList arrayList = new ArrayList();
        long j = 0;
        for (xf5 xf5Var : D0) {
            if (j >= o) {
                break;
            }
            if (!this.e.contains(xf5Var.c)) {
                Long l = xf5Var.e;
                long longValue = l != null ? l.longValue() : 0L;
                arrayList.add(xf5.a.a(xf5Var));
                j += longValue;
            }
        }
        return arrayList;
    }
}
