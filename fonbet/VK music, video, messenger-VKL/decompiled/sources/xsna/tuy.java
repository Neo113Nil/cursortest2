package xsna;

import androidx.compose.foundation.lazy.layout.a;

/* compiled from: LazyListIntervalContent.kt */
/* loaded from: classes11.dex */
public final class tuy implements a.InterfaceC0009a {
    public final izs<Integer, Object> a;
    public final izs<Integer, Object> b;
    public final zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> c;

    /* JADX WARN: Multi-variable type inference failed */
    public tuy(izs<? super Integer, ? extends Object> izsVar, izs<? super Integer, ? extends Object> izsVar2, zzs<? super ksy, ? super Integer, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar) {
        this.a = izsVar;
        this.b = izsVar2;
        this.c = zzsVar;
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
