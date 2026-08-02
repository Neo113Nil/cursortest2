package defpackage;

import com.yandex.xplat.payment.sdk.NetworkServiceRetryingStrategy;

/* loaded from: classes2.dex */
public final /* synthetic */ class khj implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ nhj b;
    public final /* synthetic */ wgb c;

    public /* synthetic */ khj(nhj nhjVar, wgb wgbVar, int i) {
        this.a = i;
        this.b = nhjVar;
        this.c = wgbVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        wgb wgbVar = this.c;
        nhj nhjVar = this.b;
        switch (i) {
            case 0:
                return nhjVar.a.f(wgbVar, new nni(20), NetworkServiceRetryingStrategy.noRetry);
            default:
                return nhjVar.a.f(wgbVar, new nni(21), NetworkServiceRetryingStrategy.noRetry);
        }
    }
}
