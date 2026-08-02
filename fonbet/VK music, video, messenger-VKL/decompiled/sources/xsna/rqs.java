package xsna;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes14.dex */
public final class rqs implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rqs(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((List) this.c).get(((Number) obj).intValue());
                return null;
            default:
                ((kdw0) this.c).b((mdw0) obj);
                return s3q0.a;
        }
    }
}
