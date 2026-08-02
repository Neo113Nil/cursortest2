package defpackage;

import java.util.Map;

/* loaded from: classes9.dex */
public final class av implements wu {
    public n530 a;

    @Override // defpackage.wu
    public final void b(kr krVar, pxl pxlVar, Map map) {
        n530 n530Var = this.a;
        if (n530Var != null) {
            n530Var.b(krVar, pxlVar, map);
        } else {
            yci0.n("Attempt to dispatch ", krVar, " while dispatcher is not set");
        }
    }
}
