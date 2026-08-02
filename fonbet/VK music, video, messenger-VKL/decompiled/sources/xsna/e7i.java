package xsna;

import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class e7i implements Comparator {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e7i(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                for (izs izsVar : (izs[]) this.c) {
                    int b = jw5.b((Comparable) izsVar.invoke(obj), (Comparable) izsVar.invoke(obj2));
                    if (b != 0) {
                        return b;
                    }
                }
                return 0;
            default:
                return ((Number) ((fne) this.c).invoke(obj, obj2)).intValue();
        }
    }
}
