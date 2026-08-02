package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: VectorPainter.kt */
/* loaded from: classes11.dex */
public final class nlr0 extends Lambda implements izs<lgn, kgn> {
    final /* synthetic */ bvi $composition;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nlr0(bvi bviVar) {
        super(1);
        this.$composition = bviVar;
    }

    @Override // xsna.izs
    public final kgn invoke(lgn lgnVar) {
        return new mty(this.$composition, 1);
    }
}
