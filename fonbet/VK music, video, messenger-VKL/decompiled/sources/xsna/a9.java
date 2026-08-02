package xsna;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a9 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ a9(ArrayList arrayList, int i) {
        this.b = i;
        this.c = arrayList;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Pair pair = (Pair) obj;
                int intValue = ((Number) pair.d()).intValue();
                List list = (List) pair.g();
                ArrayList arrayList = this.c;
                arrayList.set(intValue, list);
                return c5g.v(j5g.V(arrayList));
            default:
                return Boolean.valueOf(this.c.contains(((Map.Entry) obj).getValue()));
        }
    }
}
