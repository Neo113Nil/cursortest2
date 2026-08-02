package xsna;

import com.vk.navigation.NavigationDelegateActivity;
import xsna.lau;

/* compiled from: AppLovinAdsFeatureImpl.kt */
/* loaded from: classes14.dex */
public final class b73 implements lau.a {
    public final a73 a;
    public final /* synthetic */ d73 b;
    public final /* synthetic */ e73 c;
    public final /* synthetic */ NavigationDelegateActivity d;

    public b73(d73 d73Var, mq2 mq2Var, e73 e73Var, NavigationDelegateActivity navigationDelegateActivity) {
        this.b = d73Var;
        this.c = e73Var;
        this.d = navigationDelegateActivity;
        this.a = new a73(0, d73Var, mq2Var);
    }

    @Override // xsna.lau.a
    public final void a(rau rauVar) {
        d73 d73Var = this.b;
        lau lauVar = d73Var.c;
        lauVar.e();
        lauVar.f(new c73());
        int b = rauVar.b();
        e73 e73Var = this.c;
        if (b != 2) {
            d73Var.d.c();
            d73Var.b.submit(new w63(0, e73Var, d73Var));
        } else {
            rauVar.c(this.d, new v63(d73Var, e73Var, this.a, 0));
        }
    }

    @Override // xsna.lau.a
    public final void b(g2q0 g2q0Var) {
        this.a.invoke(Integer.valueOf(g2q0Var.a), "User consent info error: " + g2q0Var.b);
    }
}
