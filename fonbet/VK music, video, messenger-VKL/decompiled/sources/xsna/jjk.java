package xsna;

import kotlin.jvm.internal.Lambda;
import xsna.wlp0;

/* compiled from: Crossfade.kt */
/* loaded from: classes11.dex */
public final class jjk extends Lambda implements izs<tdu, s3q0> {
    final /* synthetic */ mtk0<Float> $alpha$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjk(wlp0.d dVar) {
        super(1);
        this.$alpha$delegate = dVar;
    }

    @Override // xsna.izs
    public final s3q0 invoke(tdu tduVar) {
        tduVar.b(this.$alpha$delegate.getValue().floatValue());
        return s3q0.a;
    }
}
