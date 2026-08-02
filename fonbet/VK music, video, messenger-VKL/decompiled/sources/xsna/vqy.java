package xsna;

import androidx.compose.foundation.lazy.layout.a;

/* compiled from: LazyGridIntervalContent.kt */
/* loaded from: classes11.dex */
public final class vqy implements a.InterfaceC0009a {
    public final izs<Integer, Object> a;
    public final wzs<ery, Integer, tfu> b;
    public final izs<Integer, Object> c;
    public final jai d;

    public vqy(izs izsVar, wzs wzsVar, izs izsVar2, jai jaiVar) {
        this.a = izsVar;
        this.b = wzsVar;
        this.c = izsVar2;
        this.d = jaiVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.a.InterfaceC0009a
    public final izs<Integer, Object> getKey() {
        return this.a;
    }

    @Override // androidx.compose.foundation.lazy.layout.a.InterfaceC0009a
    public final izs<Integer, Object> getType() {
        return this.c;
    }
}
