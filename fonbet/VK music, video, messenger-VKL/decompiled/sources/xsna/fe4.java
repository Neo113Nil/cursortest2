package xsna;

import java.util.ArrayList;
import xsna.m3b0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class fe4 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fe4(hlb hlbVar, izs izsVar, q630 q630Var, int i) {
        this.b = 0;
        this.c = hlbVar;
        this.d = izsVar;
        this.e = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ie4.a((hlb) this.c, (izs) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                jai jaiVar = (jai) this.c;
                khx khxVar = (khx) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1257555082, intValue, -1, "com.vk.core.compose.component.internal.InternalTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InternalTabs.kt:218)");
                    }
                    jaiVar.invoke(khxVar, new wow(arrayList), aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((th70) this.c).j((uh70) this.e, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            default:
                ((Integer) obj2).getClass();
                ((a4b0) this.c).k((m3b0.b) this.e, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ fe4(jai jaiVar, khx khxVar, ArrayList arrayList) {
        this.b = 1;
        this.c = jaiVar;
        this.d = khxVar;
        this.e = arrayList;
    }

    public /* synthetic */ fe4(i6v0 i6v0Var, Object obj, izs izsVar, int i, int i2) {
        this.b = i2;
        this.c = i6v0Var;
        this.e = obj;
        this.d = izsVar;
    }
}
