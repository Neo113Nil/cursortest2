package defpackage;

import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes6.dex */
public final /* synthetic */ class b8n0 implements sy60, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ c8n0 b;

    public /* synthetic */ b8n0(c8n0 c8n0Var, int i) {
        this.a = i;
        this.b = c8n0Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        c8n0 c8n0Var = this.b;
        switch (i) {
            case 0:
                c8n0Var.r(new qu(9));
                break;
            default:
                c8n0Var.r(new qu(9));
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof sy60) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof sy60) && (obj instanceof jms)) {
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
        return new AdaptedFunctionReference(0, this.b, c8n0.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0);
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
