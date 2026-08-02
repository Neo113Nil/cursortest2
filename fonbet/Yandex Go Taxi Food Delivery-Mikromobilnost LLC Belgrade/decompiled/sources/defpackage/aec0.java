package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes13.dex */
public abstract class aec0 implements hgl0 {
    public final n3w a;
    public final n5g b;
    public final ArrayList c = new ArrayList();

    public aec0(n3w n3wVar, n5g n5gVar) {
        this.a = n3wVar;
        this.b = n5gVar;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [T, java.lang.Object, wdc0] */
    @Override // defpackage.hgl0
    public final void a(sls slsVar, tls tlsVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        n5g n5gVar = this.b;
        zdc0 zdc0Var = new zdc0(n5gVar);
        xdc0 xdc0Var = new xdc0(zdc0Var, new b700(25, ref$ObjectRef, slsVar, this));
        ?? wdc0Var = new wdc0(zdc0Var);
        ref$ObjectRef.element = wdc0Var;
        this.c.add(wdc0Var);
        e(xdc0Var, (rhr) tlsVar.invoke(new ydc0(this.a, n5gVar, this)));
    }

    @Override // defpackage.hgl0
    public final void b(cgl0 cgl0Var) {
        fkr fkrVar;
        wdc0 wdc0Var = (wdc0) ycc.A(this.c);
        if (wdc0Var == null) {
            d(cgl0Var);
            return;
        }
        pys pysVar = wdc0Var.a.b;
        if (pysVar == null || (fkrVar = pysVar.F) == null) {
            return;
        }
        fkrVar.T(cgl0Var);
    }

    public abstract void d(cgl0 cgl0Var);

    public abstract void e(xdc0 xdc0Var, rhr rhrVar);
}
