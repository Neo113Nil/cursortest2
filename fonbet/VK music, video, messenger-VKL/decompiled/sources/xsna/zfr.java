package xsna;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class zfr implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;
    public final /* synthetic */ izs d;

    public /* synthetic */ zfr(int i, List list, izs izsVar) {
        this.b = i;
        this.d = izsVar;
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return ((pt) this.d).invoke(this.c.get(((Number) obj).intValue()));
            default:
                return ((i0r) this.d).invoke(this.c.get(((Number) obj).intValue()));
        }
    }
}
