package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes9.dex */
public final class gci0 implements n4u0, r18, gqs {
    public final /* synthetic */ n4u0 a;
    private final l8x job;

    public gci0(pz40 pz40Var, l8x l8xVar) {
        this.a = pz40Var;
        this.job = l8xVar;
    }

    @Override // defpackage.gqs
    public final tpr a(fse fseVar, int i, BufferOverflow bufferOverflow) {
        return (((i < 0 || i >= 2) && i != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) ? ffx.G(this, fseVar, i, bufferOverflow) : this;
    }

    @Override // defpackage.hnr0
    public final List b() {
        return this.a.b();
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        return this.a.collect(vprVar, continuation);
    }

    @Override // defpackage.n4u0
    public final Object getValue() {
        return this.a.getValue();
    }
}
