package xsna;

import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class dcd0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Runnable runnable = (Runnable) obj;
        Runnable runnable2 = (Runnable) obj2;
        ecd0 ecd0Var = runnable2 instanceof ecd0 ? (ecd0) runnable2 : null;
        int i = ecd0Var != null ? ecd0Var.c : 0;
        ecd0 ecd0Var2 = runnable instanceof ecd0 ? (ecd0) runnable : null;
        return i - (ecd0Var2 != null ? ecd0Var2.c : 0);
    }
}
