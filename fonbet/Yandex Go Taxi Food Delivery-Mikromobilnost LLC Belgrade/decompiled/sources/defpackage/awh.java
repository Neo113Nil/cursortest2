package defpackage;

import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes5.dex */
public final /* synthetic */ class awh implements g18, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ pzt0 b;

    public /* synthetic */ awh(pzt0 pzt0Var, int i) {
        this.a = i;
        this.b = pzt0Var;
    }

    @Override // defpackage.g18
    public final void cancel() {
        int i = this.a;
        pzt0 pzt0Var = this.b;
        switch (i) {
            case 0:
                pzt0Var.a(null);
                break;
            default:
                pzt0Var.a(null);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof g18) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof g18) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
        }
        return new AdaptedFunctionReference(0, this.b, l8x.class, "cancel", "cancel(Ljava/util/concurrent/CancellationException;)V", 0);
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
