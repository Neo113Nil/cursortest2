package xsna;

import androidx.compose.foundation.lazy.layout.a;

/* compiled from: LazyStaggeredGridIntervalContent.kt */
/* loaded from: classes11.dex */
public final class rwy implements a.InterfaceC0009a {
    public final rrv a;
    public final srv b;
    public final jai c;

    public rwy(rrv rrvVar, srv srvVar, jai jaiVar) {
        this.a = rrvVar;
        this.b = srvVar;
        this.c = jaiVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.a.InterfaceC0009a
    public final izs<Integer, Object> getKey() {
        return this.a;
    }

    @Override // androidx.compose.foundation.lazy.layout.a.InterfaceC0009a
    public final izs<Integer, Object> getType() {
        return this.b;
    }
}
