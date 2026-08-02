package xsna;

import com.vk.superapp.bridges.SuperappUiRouterBridge;
import java.util.ArrayList;
import java.util.List;

/* compiled from: StackSuperrappUiRouter.kt */
/* loaded from: classes6.dex */
public final class lok0 implements gz20 {
    public final /* synthetic */ SuperappUiRouterBridge.g b;
    public final /* synthetic */ List<bah0> c;
    public final /* synthetic */ av20<bah0> d;

    public lok0(SuperappUiRouterBridge.g gVar, List<bah0> list, av20<bah0> av20Var) {
        this.b = gVar;
        this.c = list;
        this.d = av20Var;
    }

    @Override // xsna.gz20
    public final void onCancel() {
        av20<bah0> av20Var = this.d;
        int i = av20Var.x0().d;
        dpj0<Integer, bah0> x0 = av20Var.x0();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(x0.j(i2));
        }
        this.b.b(arrayList, this.c);
    }
}
