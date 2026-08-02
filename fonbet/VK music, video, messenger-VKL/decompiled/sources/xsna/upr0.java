package xsna;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.xha0;
import xsna.ypr0;

/* compiled from: VerticalizationModeReducer.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class upr0 extends FunctionReferenceImpl implements izs<xpr0, ypr0.c> {
    @Override // xsna.izs
    public final ypr0.c invoke(xpr0 xpr0Var) {
        xpr0 xpr0Var2 = xpr0Var;
        ((vpr0) this.receiver).getClass();
        ArrayList arrayList = new ArrayList();
        List<String> list = xpr0Var2.g;
        int i = xpr0Var2.i;
        if (list != null) {
            List<String> list2 = list;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            int i2 = 0;
            for (Object obj : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    e43.t();
                    throw null;
                }
                arrayList2.add(new xha0.b(i2 == i, (String) obj));
                i2 = i3;
            }
            arrayList.addAll(arrayList2);
        }
        arrayList.add(new xha0.a(xpr0Var2.e, xpr0Var2.f, i == arrayList.size()));
        return new ypr0.c(arrayList, i);
    }
}
