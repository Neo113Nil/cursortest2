package xsna;

import com.vk.navigation.NavigationDelegateActivity;
import java.util.concurrent.ExecutorService;

/* compiled from: AppLovinAdsFeatureImpl.kt */
/* loaded from: classes14.dex */
public final class d73 implements lt80 {
    public final vv0 a;
    public final ExecutorService b;
    public final lau c;
    public final m11 d;
    public final b25 e;
    public volatile e73 f;
    public final bpn0 g = new bpn0(new com.vk.movika.sdk.base.logic.interactor.m(1));
    public final bpn0 h = new bpn0(new vf0(this, 5));
    public volatile int i;

    public d73(vv0 vv0Var, ExecutorService executorService, lau lauVar, m11 m11Var, b25 b25Var) {
        this.a = vv0Var;
        this.b = executorService;
        this.c = lauVar;
        this.d = m11Var;
        this.e = b25Var;
    }

    @Override // xsna.lt80
    public final void a(NavigationDelegateActivity navigationDelegateActivity, mq2 mq2Var) {
        i0q0.j(new x63(this, navigationDelegateActivity, mq2Var, 0));
    }

    @Override // xsna.lt80
    public final boolean isInitialized() {
        return this.i == 2;
    }
}
