package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class lc71 implements fy71, jms {
    public final /* synthetic */ of71 a;

    public lc71(of71 of71Var) {
        this.a = of71Var;
    }

    @Override // defpackage.fy71
    public final void a() {
        of71 of71Var = this.a;
        synchronized (of71Var.a) {
            of71Var.f = true;
        }
        synchronized (of71Var.a) {
            of71Var.b.removeCallbacksAndMessages(null);
            of71Var.e = false;
        }
        of71Var.d.a();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fy71) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.a, of71.class, "onOmSdkJsControllerLoaded", "onOmSdkJsControllerLoaded()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
