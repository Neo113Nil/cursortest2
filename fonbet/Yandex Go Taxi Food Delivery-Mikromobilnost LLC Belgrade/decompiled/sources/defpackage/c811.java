package defpackage;

import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes12.dex */
public final /* synthetic */ class c811 implements sy60, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ d811 b;

    public /* synthetic */ c811(d811 d811Var, int i) {
        this.a = i;
        this.b = d811Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        d811 d811Var = this.b;
        switch (i) {
            case 0:
                d811Var.r(new qu(9));
                break;
            default:
                d811Var.r(new qu(9));
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
        return new AdaptedFunctionReference(0, this.b, d811.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0);
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
