package xsna;

import java.util.Optional;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class c86 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c86(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((Boolean) ((t6) this.b).invoke(obj)).booleanValue();
            case 1:
                return ((Boolean) ((izs) this.b).invoke(obj)).booleanValue();
            default:
                return ((Long) obj).longValue() <= ((Long) ((Optional) this.b).get()).longValue();
        }
    }
}
