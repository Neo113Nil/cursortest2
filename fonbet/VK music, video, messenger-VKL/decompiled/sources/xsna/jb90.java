package xsna;

import androidx.compose.foundation.lazy.layout.a;

/* compiled from: LazyLayoutPager.kt */
/* loaded from: classes11.dex */
public final class jb90 implements a.InterfaceC0009a {
    public final izs<Integer, Object> a;
    public final zzs<xb90, Integer, androidx.compose.runtime.a, Integer, s3q0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public jb90(izs<? super Integer, ? extends Object> izsVar, zzs<? super xb90, ? super Integer, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar) {
        this.a = izsVar;
        this.b = zzsVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.a.InterfaceC0009a
    public final izs<Integer, Object> getKey() {
        return this.a;
    }
}
