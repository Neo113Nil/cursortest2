package xsna;

import java.util.List;

/* compiled from: LazyGridDsl.kt */
/* loaded from: classes18.dex */
public final class gd10 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gd10(Object obj, int i) {
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
                qgi0.h((tgi0) obj, (String) this.c);
                return s3q0.a;
        }
    }
}
