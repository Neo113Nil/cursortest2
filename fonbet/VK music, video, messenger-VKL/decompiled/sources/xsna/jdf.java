package xsna;

import java.util.ArrayList;
import xsna.xyj;

/* compiled from: LazyDsl.kt */
/* loaded from: classes17.dex */
public final class jdf implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jdf(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return ((pgf) ((wow) this.c).b.get(((Number) obj).intValue())) instanceof zdd ? "cell_item" : "custom_item";
            case 1:
                ((ArrayList) this.c).get(((Number) obj).intValue());
                return null;
            default:
                ((izj) this.c).a.a(xyj.j.a.b);
                return s3q0.a;
        }
    }
}
