package yads;

import kotlin.coroutines.d;
import xsna.pvj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class s52 implements pvj {
    public final i02 b;
    public final pvj.a c = pvj.a.b;

    public s52(i02 i02Var) {
        this.b = i02Var;
    }

    @Override // kotlin.coroutines.d
    public final Object fold(Object obj, wzs wzsVar) {
        return wzsVar.invoke(obj, this);
    }

    @Override // kotlin.coroutines.d
    public final d.b get(d.c cVar) {
        return d.b.a.a(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    public final d.c getKey() {
        return this.c;
    }

    @Override // xsna.pvj
    public final void handleException(kotlin.coroutines.d dVar, Throwable th) {
        th.toString();
        this.b.a(h9.w);
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d minusKey(d.c cVar) {
        return d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d plus(kotlin.coroutines.d dVar) {
        return d.a.a(this, dVar);
    }
}
