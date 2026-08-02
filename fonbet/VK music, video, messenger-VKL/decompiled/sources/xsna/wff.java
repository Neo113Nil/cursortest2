package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ClipsUploadFragmentImpl.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class wff implements xy, g0t {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wff(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.xy
    public final void a(lj50 lj50Var) {
        switch (this.b) {
            case 0:
                ((hjf) this.c).b((lbf) lj50Var);
                break;
            default:
                ((bn50) this.c).b((sdo) lj50Var);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.b) {
            case 0:
                if ((obj instanceof xy) && (obj instanceof g0t)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof xy) && (obj instanceof g0t)) {
                    break;
                }
                break;
        }
        return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
    }

    @Override // xsna.g0t
    public final xzs getFunctionDelegate() {
        switch (this.b) {
            case 0:
                return new FunctionReferenceImpl(1, (hjf) this.c, hjf.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
            default:
                return new FunctionReferenceImpl(1, (bn50) this.c, bn50.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.b) {
        }
        return getFunctionDelegate().hashCode();
    }
}
