package xsna;

import androidx.annotation.NonNull;
import xsna.yrl;

/* compiled from: OptionalProvider.java */
/* loaded from: classes.dex */
public final class yt80<T> implements f9e0<T>, yrl<T> {
    public static final m5k c = new m5k();
    public static final wt80 d = new wt80();
    public yrl.a<T> a;
    public volatile f9e0<T> b;

    public yt80(m5k m5kVar, f9e0 f9e0Var) {
        this.a = m5kVar;
        this.b = f9e0Var;
    }

    public final void a(@NonNull final yrl.a<T> aVar) {
        f9e0<T> f9e0Var;
        f9e0<T> f9e0Var2;
        f9e0<T> f9e0Var3 = this.b;
        wt80 wt80Var = d;
        if (f9e0Var3 != wt80Var) {
            aVar.a(f9e0Var3);
            return;
        }
        synchronized (this) {
            f9e0Var = this.b;
            if (f9e0Var != wt80Var) {
                f9e0Var2 = f9e0Var;
            } else {
                final yrl.a<T> aVar2 = this.a;
                this.a = new yrl.a() { // from class: xsna.xt80
                    @Override // xsna.yrl.a
                    public final void a(f9e0 f9e0Var4) {
                        yrl.a.this.a(f9e0Var4);
                        aVar.a(f9e0Var4);
                    }
                };
                f9e0Var2 = null;
            }
        }
        if (f9e0Var2 != null) {
            aVar.a(f9e0Var);
        }
    }

    @Override // xsna.f9e0
    public final T get() {
        return this.b.get();
    }
}
