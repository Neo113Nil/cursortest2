package defpackage;

import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.BackupHostsWithPciDss;
import com.ybsdk.rconfig.configs.NetworkRetryConfigData;

/* loaded from: classes8.dex */
public final /* synthetic */ class bx50 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ bx50(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                NetworkRetryConfigData networkRetryConfigData = (NetworkRetryConfigData) bVar.d(xz50.a).getData();
                if (networkRetryConfigData.getRetryBudget().isEnabled()) {
                    return new h1k0(networkRetryConfigData.getRetryBudget().getInitialTokens(), networkRetryConfigData.getRetryBudget().getMaxTokens(), networkRetryConfigData.getRetryBudget().getTokenRefillRatio());
                }
                return null;
            default:
                return ((BackupHostsWithPciDss) bVar.d(ej4.a).getData()).getHosts();
        }
    }
}
