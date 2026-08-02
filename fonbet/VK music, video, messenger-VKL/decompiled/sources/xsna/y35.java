package xsna;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class y35 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y35(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return (io.reactivex.rxjava3.core.q) ((x35) this.c).invoke((String) obj);
            case 1:
                return (String) ((ojy) this.c).invoke((String) obj);
            case 2:
                return ((izs) this.c).invoke((ohk0) obj);
            default:
                c0t0 c0t0Var = (c0t0) this.c;
                ArrayList arrayList = c0t0Var.e;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    pu90 pu90Var = (pu90) it.next();
                    c0t0Var.O(pu90Var.b(), pu90Var.a());
                }
                arrayList.clear();
                return s3q0.a;
        }
    }
}
