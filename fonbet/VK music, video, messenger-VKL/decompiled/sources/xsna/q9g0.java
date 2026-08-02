package xsna;

import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class q9g0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        qx8 qx8Var = (qx8) obj;
        qx8 qx8Var2 = (qx8) obj2;
        long j = qx8Var.g;
        long j2 = qx8Var2.g;
        return j - j2 == 0 ? qx8Var.compareTo(qx8Var2) : j < j2 ? -1 : 1;
    }
}
