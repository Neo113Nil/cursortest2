package xsna;

import xsna.hu80;

/* compiled from: Pingable.kt */
/* loaded from: classes6.dex */
public final class pw80<T extends hu80> extends ow80<T> {
    public final izs<Integer, io.reactivex.rxjava3.core.q<T>> d;

    public pw80(izs izsVar) {
        this.d = izsVar;
    }

    @Override // xsna.doa0
    public final io.reactivex.rxjava3.internal.operators.single.y c() {
        io.reactivex.rxjava3.core.q<T> invoke;
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
        return new io.reactivex.rxjava3.internal.operators.single.h(invoke.K(), new w250(new bk30(this, 10), 6)).l(new hl30(new bzw(this, 16), 7));
    }
}
