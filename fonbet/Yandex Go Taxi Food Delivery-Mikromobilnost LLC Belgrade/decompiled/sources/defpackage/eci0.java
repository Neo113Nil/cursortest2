package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes9.dex */
public final class eci0 implements hnr0, r18, gqs {
    public final /* synthetic */ hnr0 a;
    private final l8x job;

    public eci0(lz40 lz40Var, pzt0 pzt0Var) {
        this.a = lz40Var;
        this.job = pzt0Var;
    }

    @Override // defpackage.gqs
    public final tpr a(fse fseVar, int i, BufferOverflow bufferOverflow) {
        return ffx.G(this, fseVar, i, bufferOverflow);
    }

    @Override // defpackage.hnr0
    public final List b() {
        return this.a.b();
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        return this.a.collect(vprVar, continuation);
    }
}
