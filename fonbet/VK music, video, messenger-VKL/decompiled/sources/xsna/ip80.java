package xsna;

import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ip80 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;
    public final /* synthetic */ int d;

    public /* synthetic */ ip80(int i, List list, int i2) {
        this.b = i;
        this.c = list;
        this.d = i2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        return new jks(Integer.valueOf(this.d), (List) obj, this.b < this.c.size());
    }
}
