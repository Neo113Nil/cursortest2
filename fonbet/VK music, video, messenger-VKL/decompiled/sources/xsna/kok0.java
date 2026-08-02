package xsna;

import com.vk.superapp.bridges.SuperappUiRouterBridge;
import java.util.ArrayList;

/* compiled from: StackSuperrappUiRouter.kt */
/* loaded from: classes6.dex */
public final class kok0 implements hz20 {
    public final /* synthetic */ SuperappUiRouterBridge.g b;
    public final /* synthetic */ av20<bah0> c;

    public kok0(SuperappUiRouterBridge.g gVar, av20<bah0> av20Var) {
        this.b = gVar;
        this.c = av20Var;
    }

    @Override // xsna.hz20
    public final void a(int i) {
        av20<bah0> av20Var = this.c;
        int i2 = av20Var.x0().d;
        dpj0<Integer, bah0> x0 = av20Var.x0();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(x0.j(i3));
        }
        this.b.a(arrayList);
    }
}
