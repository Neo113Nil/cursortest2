package defpackage;

import com.yandex.quark.capability.CapabilityListener;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class hc41 extends hy4 {
    public final String b;
    public png c;
    public final a201 d;
    public final String e;

    public hc41(jc41 jc41Var, e331 e331Var) {
        String str = jc41Var.a;
        this.b = str;
        this.c = jc41Var.b;
        z28.a(str);
        this.d = new a201(28, jc41Var.c, e331Var);
        this.e = "Web";
    }

    @Override // defpackage.u28
    public final String a() {
        return this.b;
    }

    @Override // defpackage.u28
    public final String c() {
        return this.e;
    }

    @Override // defpackage.u28
    public final bnj d() {
        return this.d;
    }

    public final void f(png pngVar) {
        synchronized (this) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((CapabilityListener) it.next()).onEvent(pngVar);
            }
        }
    }

    public final synchronized void g(png pngVar) {
        this.c = pngVar;
        e(pngVar);
    }

    @Override // defpackage.u28
    public final synchronized png getCurrentState() {
        return this.c;
    }
}
