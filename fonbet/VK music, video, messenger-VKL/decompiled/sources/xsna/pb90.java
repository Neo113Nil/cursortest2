package xsna;

/* compiled from: LazyLayoutPager.kt */
/* loaded from: classes11.dex */
public final class pb90 extends androidx.compose.foundation.lazy.layout.a<jb90> {
    public final zzs<xb90, Integer, androidx.compose.runtime.a, Integer, s3q0> a;
    public final izs<Integer, Object> b;
    public final p8v c;

    /* JADX WARN: Multi-variable type inference failed */
    public pb90(zzs<? super xb90, ? super Integer, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar, izs<? super Integer, ? extends Object> izsVar, int i) {
        this.a = zzsVar;
        this.b = izsVar;
        p8v p8vVar = new p8v(1);
        p8vVar.a(i, new jb90(izsVar, zzsVar));
        this.c = p8vVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.a
    public final p8v l() {
        return this.c;
    }
}
