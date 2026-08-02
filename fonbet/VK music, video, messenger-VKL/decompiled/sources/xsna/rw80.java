package xsna;

import xsna.hu80;

/* compiled from: Pingable.kt */
/* loaded from: classes6.dex */
public final class rw80<T extends hu80> extends ow80<T> {
    public final izs<Integer, io.reactivex.rxjava3.core.x<T>> d;

    public rw80(izs izsVar) {
        this.d = izsVar;
    }

    @Override // xsna.doa0
    public final io.reactivex.rxjava3.internal.operators.single.y c() {
        io.reactivex.rxjava3.core.x<T> invoke;
        synchronized (this.a) {
            try {
                T t = this.c;
                Integer valueOf = t != null ? Integer.valueOf(t.a()) : null;
                this.b++;
                invoke = this.d.invoke(valueOf);
            } catch (Throwable th) {
                throw th;
            }
        }
        fv70 fv70Var = new fv70(new es00(this, 16), 2);
        invoke.getClass();
        return new io.reactivex.rxjava3.internal.operators.single.h(invoke, fv70Var).l(new qw80(new h2s(this, 26), 0));
    }
}
