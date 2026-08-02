package xsna;

import java.util.Arrays;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class raw implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ raw(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((Boolean) ((nfj) this.b).invoke(obj)).booleanValue();
            default:
                return Arrays.equals(((gey0) obj).d, (byte[]) this.b);
        }
    }
}
