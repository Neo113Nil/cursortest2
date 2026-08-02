package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class i3f implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ i3f(ArrayList arrayList, int i) {
        this.b = i;
        this.c = arrayList;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List list = (List) obj;
        switch (this.b) {
            case 0:
                return j5g.u0(list, this.c);
            default:
                return this.c;
        }
    }
}
