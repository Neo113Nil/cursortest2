package xsna;

import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.superapp.vkclient.js.bridge.api.events.JoinGroup$Parameters;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class v7y implements izs {
    public final /* synthetic */ x7y b;
    public final /* synthetic */ JoinGroup$Parameters c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long e;

    public /* synthetic */ v7y(long j, JoinGroup$Parameters joinGroup$Parameters, String str, x7y x7yVar) {
        this.b = x7yVar;
        this.c = joinGroup$Parameters;
        this.d = str;
        this.e = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VkUiView view;
        io.reactivex.rxjava3.disposables.b D6;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        x7y x7yVar = this.b;
        JoinGroup$Parameters joinGroup$Parameters = this.c;
        String str = this.d;
        if (booleanValue) {
            x7yVar.X0().b(joinGroup$Parameters.e(), str);
        } else {
            String e = joinGroup$Parameters.e();
            xwv0 xwv0Var = x7yVar.d;
            if (xwv0Var != null && (view = xwv0Var.getView()) != null && (D6 = view.D6()) != null) {
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                D6.b(vdx0Var.j().f(this.e).subscribe(new np3(new ysd(x7yVar, e, str, 6), 27), new pp3(new yf7(x7yVar, e, str, 7), 26)));
            }
        }
        return s3q0.a;
    }
}
