package xsna;

import java.util.Collection;
import java.util.Map;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ase0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Collection c;

    public /* synthetic */ ase0(int i, Collection collection) {
        this.b = i;
        this.c = collection;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(this.c.contains((zwm0) obj));
            default:
                return new Pair(this.c, (Map) obj);
        }
    }
}
