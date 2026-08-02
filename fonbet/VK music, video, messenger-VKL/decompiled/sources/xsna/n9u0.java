package xsna;

import android.view.View;
import com.vk.dialogtags.api.a;

/* compiled from: VkAppDialogsToolbarComponent.kt */
/* loaded from: classes18.dex */
public final class n9u0 implements yzs<Integer, Integer, d2o0, View> {
    public final /* synthetic */ o9u0 b;

    public n9u0(o9u0 o9u0Var) {
        this.b = o9u0Var;
    }

    @Override // xsna.yzs
    public final View invoke(Integer num, Integer num2, d2o0 d2o0Var) {
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        d2o0 d2o0Var2 = d2o0Var;
        o9u0 o9u0Var = this.b;
        com.vk.dialogsscreen.impl.a aVar = o9u0Var.o;
        return aVar.d.a(o9u0Var.n.getActivity(), aVar.a.q().b, new a.b((int) (r13.requireView().getMeasuredHeight() * 0.8d), intValue, intValue2), d2o0Var2);
    }
}
