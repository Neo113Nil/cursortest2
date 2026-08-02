package xsna;

import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class vp6 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        tp6 tp6Var = (tp6) obj;
        tp6 tp6Var2 = (tp6) obj2;
        int compare = Integer.compare(tp6Var.c, tp6Var2.c);
        return compare != 0 ? compare : tp6Var.b.compareTo(tp6Var2.b);
    }
}
