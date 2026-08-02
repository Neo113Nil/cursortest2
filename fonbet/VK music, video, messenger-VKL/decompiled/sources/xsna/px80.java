package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.y8l;

/* compiled from: OrderToOrderListItemsMapper.kt */
/* loaded from: classes18.dex */
public final class px80 {
    public final sdz a;

    public px80(sdz sdzVar) {
        this.a = sdzVar;
    }

    public static jv80 a(jv80 jv80Var, y8l.a aVar) {
        if (jv80Var instanceof hxu) {
            hxu hxuVar = (hxu) jv80Var;
            return new hxu(aVar, hxuVar.c, hxuVar.d, hxuVar.e);
        }
        if (jv80Var instanceof gww) {
            gww gwwVar = (gww) jv80Var;
            return new gww(aVar, gwwVar.c, gwwVar.d, gwwVar.e);
        }
        if (jv80Var instanceof ns90) {
            return new ns90(aVar, ((ns90) jv80Var).c);
        }
        if (jv80Var instanceof gpd0) {
            gpd0 gpd0Var = (gpd0) jv80Var;
            return new gpd0(aVar, gpd0Var.c, gpd0Var.d, gpd0Var.e, gpd0Var.f, gpd0Var.g, gpd0Var.h, gpd0Var.i, gpd0Var.j, gpd0Var.k, gpd0Var.l);
        }
        if (!(jv80Var instanceof ofi0)) {
            throw new NoWhenBranchMatchedException();
        }
        ofi0 ofi0Var = (ofi0) jv80Var;
        return new ofi0(aVar, ofi0Var.c, ofi0Var.d);
    }
}
