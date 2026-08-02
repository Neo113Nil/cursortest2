package xsna;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class pzi implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pzi(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((List) this.c).get(((Number) obj).intValue());
                return null;
            case 1:
                return ((jv80) ((List) this.c).get(((Number) obj).intValue())).a();
            case 2:
                ((List) this.c).get(((Number) obj).intValue());
                return null;
            default:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "NotificationGroupHeader");
                qgi0.h(tgi0Var, (String) this.c);
                return s3q0.a;
        }
    }

    public pzi(c220 c220Var, List list) {
        this.b = 1;
        this.c = list;
    }
}
