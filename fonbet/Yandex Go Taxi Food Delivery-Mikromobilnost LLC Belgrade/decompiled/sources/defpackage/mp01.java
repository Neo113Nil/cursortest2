package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes14.dex */
public final /* synthetic */ class mp01 implements vpr, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ ep01 b;

    public /* synthetic */ mp01(ep01 ep01Var, int i) {
        this.a = i;
        this.b = ep01Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ep01 ep01Var = this.b;
        switch (i) {
            case 0:
                ep01Var.y1((sp01) obj);
                break;
            default:
                ep01Var.applyStyle((String) obj);
                break;
        }
        return zy11Var;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new AdaptedFunctionReference(2, this.b, ep01.class, "render", "render(Lcom/yandex/go/transfer_requirement/state/TransferRequirementModalViewUiState;)V", 4);
            default:
                return new AdaptedFunctionReference(2, this.b, ep01.class, "applyStyle", "applyStyle(Ljava/lang/String;)V", 4);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
