package xsna;

import androidx.lifecycle.Lifecycle;
import xsna.zao;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class lbo implements androidx.lifecycle.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lbo(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // androidx.lifecycle.l
    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.c;
                nbo nboVar = (nbo) this.d;
                if (event == Lifecycle.Event.ON_RESUME) {
                    izsVar.invoke(new zao.c(nboVar.b));
                    break;
                }
                break;
            default:
                l620 l620Var = (l620) this.c;
                c820 c820Var = (c820) this.d;
                l620Var.getClass();
                if (event == Lifecycle.Event.ON_DESTROY) {
                    l620Var.a(c820Var);
                    break;
                }
                break;
        }
    }
}
