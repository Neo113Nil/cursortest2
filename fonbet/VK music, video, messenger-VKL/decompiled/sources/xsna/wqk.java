package xsna;

import java.util.List;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class wqk implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wqk(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((List) this.b).contains(((pt50) obj).getClass());
            default:
                return ((Boolean) ((egt0) this.b).invoke(obj)).booleanValue();
        }
    }
}
