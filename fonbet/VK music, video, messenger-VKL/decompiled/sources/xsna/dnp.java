package xsna;

import kotlin.jvm.internal.Lambda;
import xsna.wlp0;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes11.dex */
public final class dnp extends Lambda implements izs<tdu, s3q0> {
    final /* synthetic */ mtk0<Float> $alpha;
    final /* synthetic */ mtk0<Float> $scale;
    final /* synthetic */ mtk0<lkp0> $transformOrigin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnp(wlp0.a.C3941a c3941a, wlp0.a.C3941a c3941a2, wlp0.a.C3941a c3941a3) {
        super(1);
        this.$alpha = c3941a;
        this.$scale = c3941a2;
        this.$transformOrigin = c3941a3;
    }

    @Override // xsna.izs
    public final s3q0 invoke(tdu tduVar) {
        tdu tduVar2 = tduVar;
        mtk0<Float> mtk0Var = this.$alpha;
        tduVar2.b(mtk0Var != null ? mtk0Var.getValue().floatValue() : 1.0f);
        mtk0<Float> mtk0Var2 = this.$scale;
        tduVar2.A(mtk0Var2 != null ? mtk0Var2.getValue().floatValue() : 1.0f);
        mtk0<Float> mtk0Var3 = this.$scale;
        tduVar2.B(mtk0Var3 != null ? mtk0Var3.getValue().floatValue() : 1.0f);
        mtk0<lkp0> mtk0Var4 = this.$transformOrigin;
        tduVar2.Y0(mtk0Var4 != null ? mtk0Var4.getValue().a : lkp0.b);
        return s3q0.a;
    }
}
