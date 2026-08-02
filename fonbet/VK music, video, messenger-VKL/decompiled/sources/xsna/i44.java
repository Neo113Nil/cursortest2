package xsna;

import java.util.function.Predicate;
import xsna.cyn0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class i44 implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ i44(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                String str = ((cyn0.b) obj).e;
                return (str == null || str.isEmpty()) ? false : true;
            case 1:
                return Character.isDigit(((Character) obj).charValue());
            case 2:
                int i = ((u1c0) obj).c;
                return i == 93 || i == 248 || i == 314;
            default:
                xmy0 xmy0Var = (xmy0) obj;
                synchronized (xmy0Var) {
                    if (xmy0Var.e || xmy0Var.d) {
                        return false;
                    }
                    xmy0Var.e = true;
                    return true;
                }
        }
    }
}
