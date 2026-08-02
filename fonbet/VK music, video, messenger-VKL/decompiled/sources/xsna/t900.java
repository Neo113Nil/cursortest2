package xsna;

import java.util.Comparator;

/* compiled from: SemanticsSort.kt */
/* loaded from: classes11.dex */
public final class t900 implements Comparator {
    public static final t900 c = new t900(0);
    public final /* synthetic */ int b;

    public /* synthetic */ t900(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                zhf0 h = ((igi0) obj).h();
                zhf0 h2 = ((igi0) obj2).h();
                int compare = Float.compare(h.a, h2.a);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(h.b, h2.b);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(h.d, h2.d);
                return compare3 != 0 ? compare3 : Float.compare(h.c, h2.c);
            default:
                hla hlaVar = (hla) obj;
                hla hlaVar2 = (hla) obj2;
                return jw5.b(Float.valueOf(hlaVar.itemView.getX() + (hlaVar.itemView.getY() * iah0.z(hlaVar.itemView.getContext()))), Float.valueOf(hlaVar2.itemView.getX() + (hlaVar2.itemView.getY() * iah0.z(hlaVar2.itemView.getContext()))));
        }
    }
}
