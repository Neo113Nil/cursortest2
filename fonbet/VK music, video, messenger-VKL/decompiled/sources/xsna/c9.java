package xsna;

import java.util.List;
import kotlin.Pair;
import xsna.xry;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c9 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ c9(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return io.reactivex.rxjava3.core.q.T(new Pair(Integer.valueOf(this.c), (List) obj));
            case 1:
                return Integer.valueOf(((xry.a) obj).a - this.c);
            default:
                return Integer.valueOf((((Integer) obj).intValue() / 2) - this.c);
        }
    }
}
