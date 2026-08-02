package xsna;

import androidx.lifecycle.e0;
import java.util.Arrays;

/* compiled from: InitializerViewModelFactory.android.kt */
/* loaded from: classes12.dex */
public final class ozw implements e0.c {
    public final tyt0<?>[] a;

    public ozw(tyt0<?>... tyt0VarArr) {
        this.a = tyt0VarArr;
    }

    @Override // androidx.lifecycle.e0.c
    public final nyt0 c(Class cls, fg50 fg50Var) {
        nyt0 nyt0Var;
        tyt0 tyt0Var;
        izs<qbk, T> izsVar;
        rfc a = fpf0.a(cls);
        tyt0<?>[] tyt0VarArr = this.a;
        tyt0[] tyt0VarArr2 = (tyt0[]) Arrays.copyOf(tyt0VarArr, tyt0VarArr.length);
        int length = tyt0VarArr2.length;
        int i = 0;
        while (true) {
            nyt0Var = null;
            if (i >= length) {
                tyt0Var = null;
                break;
            }
            tyt0Var = tyt0VarArr2[i];
            if (tyt0Var.a.equals(a)) {
                break;
            }
            i++;
        }
        if (tyt0Var != null && (izsVar = tyt0Var.b) != 0) {
            nyt0Var = (nyt0) izsVar.invoke(fg50Var);
        }
        if (nyt0Var != null) {
            return nyt0Var;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + a.h()).toString());
    }
}
