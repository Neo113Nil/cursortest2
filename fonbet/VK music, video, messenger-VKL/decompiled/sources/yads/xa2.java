package yads;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.epx;
import xsna.g0t;
import xsna.s3q0;
import xsna.xzs;

/* loaded from: classes10.dex */
public final /* synthetic */ class xa2 implements pe3, g0t {
    public final /* synthetic */ ya2 a;

    public xa2(ya2 ya2Var) {
        this.a = ya2Var;
    }

    @Override // yads.pe3
    public final void a() {
        ya2 ya2Var = this.a;
        synchronized (ya2Var.a) {
            ya2Var.f = true;
            s3q0 s3q0Var = s3q0.a;
        }
        ya2Var.c();
        ya2Var.d.b();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof pe3) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.a, ya2.class, "onOmSdkJsControllerLoaded", "onOmSdkJsControllerLoaded()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
