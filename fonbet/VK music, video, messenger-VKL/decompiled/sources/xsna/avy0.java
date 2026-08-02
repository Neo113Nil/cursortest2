package xsna;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import xsna.o9y0;
import xsna.osy0;

/* compiled from: SensorsDataRepositoryImpl.kt */
/* loaded from: classes2.dex */
public final class avy0 extends Lambda implements izs<o9y0.c, s3q0> {
    private /* synthetic */ izs<List<? extends o9y0>, s3q0> $b;
    private /* synthetic */ bvy0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avy0(bvy0 bvy0Var, osy0.a aVar) {
        super(1);
        this.a = bvy0Var;
        this.$b = aVar;
    }

    @Override // xsna.izs
    public final s3q0 invoke(o9y0.c cVar) {
        bvy0 bvy0Var = this.a;
        bvy0Var.g = cVar;
        bvy0Var.k = true;
        bvy0.b(bvy0Var, this.$b);
        return s3q0.a;
    }
}
