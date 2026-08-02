package androidx.room.coroutines;

import defpackage.csz;
import defpackage.e5e;
import defpackage.i3y;
import defpackage.oll0;
import defpackage.pll0;
import defpackage.tje;
import defpackage.tp90;
import defpackage.wls;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class d implements e5e {
    public final pll0 a;
    public final String b;
    public final wls c;
    public final i3y w = kotlin.a.a(new csz(29, this));

    public d(pll0 pll0Var, String str, wls wlsVar) {
        this.a = pll0Var;
        this.b = str;
        this.c = wlsVar;
    }

    @Override // defpackage.e5e
    public final Object c0(boolean z, wls wlsVar, ContinuationImpl continuationImpl) {
        tp90 tp90Var = (tp90) continuationImpl.get_context().get(tp90.b);
        c cVar = tp90Var != null ? tp90Var.a : null;
        if (cVar != null) {
            return wlsVar.invoke(cVar, continuationImpl);
        }
        c cVar2 = new c(this.c, (oll0) this.w.getValue());
        return tje.k0(new tp90(cVar2), new PassthroughConnectionPool$useConnection$2(wlsVar, cVar2, null), continuationImpl);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        i3y i3yVar = this.w;
        if (i3yVar.isInitialized()) {
            ((oll0) i3yVar.getValue()).close();
        }
    }
}
