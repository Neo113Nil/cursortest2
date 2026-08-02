package xsna;

import java.util.ArrayList;
import java.util.List;
import xsna.d280;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ss0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ss0(int i, int i2, Object obj, izs izsVar, q630 q630Var) {
        this.b = i2;
        this.d = obj;
        this.c = izsVar;
        this.e = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                bt0.e((it0) this.d, (izs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((rqg) this.d).i((sqg) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 2:
                jai jaiVar = (jai) this.d;
                khx khxVar = (khx) this.c;
                ArrayList arrayList = (ArrayList) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1708707152, intValue, -1, "com.vk.core.compose.component.internal.InternalScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InternalTabs.kt:385)");
                    }
                    jaiVar.invoke(khxVar, new wow(arrayList), aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                n080.c((d280.b) this.d, (izs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((mze0) this.d).fo((eze0) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                rol0.b((sol0) this.d, (izs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
            default:
                List list = (List) this.d;
                izs izsVar = (izs) this.c;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                inx0.a(ne7.I(1), (androidx.compose.runtime.a) obj, list, izsVar, q630Var);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ss0(Object obj, Object obj2, izs izsVar, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = izsVar;
    }

    public /* synthetic */ ss0(jai jaiVar, khx khxVar, ArrayList arrayList) {
        this.b = 2;
        this.d = jaiVar;
        this.c = khxVar;
        this.e = arrayList;
    }
}
