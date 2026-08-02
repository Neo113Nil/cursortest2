package xsna;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: Uploader_Factory.java */
/* loaded from: classes.dex */
public final class xdq0 implements xhq<qdq0> {
    public final e9e0<Context> b;
    public final e9e0<tv5> c;
    public final e9e0<n0q> d;
    public final l8h0 e;
    public final e9e0<Executor> f;
    public final e9e0<uon0> g;
    public final e9e0<klc> h;

    public xdq0(e9e0 e9e0Var, e9e0 e9e0Var2, e9e0 e9e0Var3, l8h0 l8h0Var, e9e0 e9e0Var4, e9e0 e9e0Var5, e9e0 e9e0Var6) {
        this.b = e9e0Var;
        this.c = e9e0Var2;
        this.d = e9e0Var3;
        this.e = l8h0Var;
        this.f = e9e0Var4;
        this.g = e9e0Var5;
        this.h = e9e0Var6;
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new qdq0(this.b.get(), this.c.get(), this.d.get(), (dxx0) this.e.get(), this.f.get(), this.g.get(), new prw(), new k0x(5), this.h.get());
    }
}
