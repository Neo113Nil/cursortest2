package xsna;

import xsna.zjv;

/* compiled from: ZstdBaseInterceptor.kt */
/* loaded from: classes2.dex */
public abstract class j7y0 implements ojv, uz80 {
    public final m7y0 a;

    public j7y0(m7y0 m7y0Var) {
        this.a = m7y0Var;
    }

    @Override // xsna.ojv
    public final mkv a(zjv.a aVar) {
        ckv ckvVar = aVar.b;
        return (zjy.b(ckvVar) && this.a.c()) ? b(aVar) : aVar.c(ckvVar);
    }

    public abstract mkv b(zjv.a aVar);
}
