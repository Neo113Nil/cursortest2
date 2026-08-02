package defpackage;

import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes4.dex */
public final class ayy0 implements txy0 {
    public final Object a;
    public final ThreadLocal b;
    public final cyy0 c;

    public ayy0(Object obj, ThreadLocal threadLocal) {
        this.a = obj;
        this.b = threadLocal;
        this.c = new cyy0(threadLocal);
    }

    @Override // defpackage.txy0
    public final Object H0() {
        ThreadLocal threadLocal = this.b;
        Object obj = threadLocal.get();
        threadLocal.set(this.a);
        return obj;
    }

    @Override // defpackage.fse
    public final Object fold(Object obj, wls wlsVar) {
        return wlsVar.invoke(obj, this);
    }

    @Override // defpackage.fse
    public final dse get(ese eseVar) {
        if (this.c.equals(eseVar)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.dse
    public final ese getKey() {
        return this.c;
    }

    @Override // defpackage.fse
    public final fse minusKey(ese eseVar) {
        return this.c.equals(eseVar) ? EmptyCoroutineContext.a : this;
    }

    @Override // defpackage.txy0
    public final void n(Object obj) {
        this.b.set(obj);
    }

    @Override // defpackage.fse
    public final fse plus(fse fseVar) {
        return cvw.U(this, fseVar);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.a + ", threadLocal = " + this.b + ')';
    }
}
