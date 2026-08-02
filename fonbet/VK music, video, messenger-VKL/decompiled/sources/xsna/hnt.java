package xsna;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: GeoSideEffectChannel.kt */
/* loaded from: classes2.dex */
public final class hnt implements fq9 {
    public final AtomicBoolean a = new AtomicBoolean();
    public final /* synthetic */ fnt b;

    public hnt(fnt fntVar) {
        this.b = fntVar;
    }

    @Override // xsna.fq9
    public final void cancel() {
        fnt fntVar = this.b;
        fntVar.b.c.set(null);
        fntVar.b.b.set(null);
        i0q0.g(fntVar.b);
        this.a.set(true);
    }
}
