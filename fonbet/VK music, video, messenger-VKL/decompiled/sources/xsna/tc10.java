package xsna;

import java.io.Serializable;
import java.util.LinkedHashSet;
import kotlin.LazyThreadSafetyMode;

/* compiled from: MarketProductTileConfigContext.kt */
/* loaded from: classes18.dex */
public final class tc10 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Serializable d;

    public tc10(dc10 dc10Var) {
        this.a = dc10Var;
        this.b = new bpn0(new f5x(this, 6));
        this.c = new bpn0(new xqf(this, 29));
        this.d = new LinkedHashSet();
    }

    public tc10(ebe ebeVar) {
        f550 f550Var = new f550(ebeVar, 28);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = msy.a(lazyThreadSafetyMode, f550Var);
        this.b = msy.a(lazyThreadSafetyMode, new wzb0(ebeVar, 9));
        this.c = msy.a(lazyThreadSafetyMode, new x1c0(6));
        this.d = "clips_shops_block";
    }
}
