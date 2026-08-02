package xsna;

import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class w6i implements Comparator {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w6i(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                lif0 lif0Var = (lif0) this.c;
                luu luuVar = (luu) obj;
                luu luuVar2 = (luu) obj2;
                int compare = Float.compare(ahn.j(lif0Var, luuVar), ahn.j(lif0Var, luuVar2));
                return compare == 0 ? Float.compare(ahn.i(lif0Var, luuVar), ahn.i(lif0Var, luuVar2)) : compare;
            default:
                return ((Number) ((wzs) this.c).invoke(obj, obj2)).intValue();
        }
    }
}
