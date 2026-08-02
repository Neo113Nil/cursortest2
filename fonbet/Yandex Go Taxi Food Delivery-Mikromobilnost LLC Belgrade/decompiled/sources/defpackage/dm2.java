package defpackage;

import ru.yandex.yx_platform_api.NetCapabilityValidatedHandler$onListen$1;

/* loaded from: classes10.dex */
public final /* synthetic */ class dm2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xeo b;

    public /* synthetic */ dm2(xeo xeoVar, int i) {
        this.a = i;
        this.b = xeoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        xeo xeoVar = this.b;
        switch (i) {
            case 0:
                xeoVar.endOfStream();
                break;
            case 1:
                NetCapabilityValidatedHandler$onListen$1.onUnavailable$lambda$2(xeoVar);
                break;
            default:
                NetCapabilityValidatedHandler$onListen$1.onLost$lambda$1(xeoVar);
                break;
        }
    }
}
