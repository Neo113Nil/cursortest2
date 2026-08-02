package defpackage;

import ru.yandex.taxi.am.OnAuthorizedAndReadyInteractorImpl$waitForUserAuthorizedAndReady$$inlined$suspendCallbackApi$2;

/* loaded from: classes5.dex */
public final class ex60 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ OnAuthorizedAndReadyInteractorImpl$waitForUserAuthorizedAndReady$$inlined$suspendCallbackApi$2 b;

    public /* synthetic */ ex60(OnAuthorizedAndReadyInteractorImpl$waitForUserAuthorizedAndReady$$inlined$suspendCallbackApi$2 onAuthorizedAndReadyInteractorImpl$waitForUserAuthorizedAndReady$$inlined$suspendCallbackApi$2, int i) {
        this.a = i;
        this.b = onAuthorizedAndReadyInteractorImpl$waitForUserAuthorizedAndReady$$inlined$suspendCallbackApi$2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        OnAuthorizedAndReadyInteractorImpl$waitForUserAuthorizedAndReady$$inlined$suspendCallbackApi$2 onAuthorizedAndReadyInteractorImpl$waitForUserAuthorizedAndReady$$inlined$suspendCallbackApi$2 = this.b;
        switch (i) {
            case 0:
                onAuthorizedAndReadyInteractorImpl$waitForUserAuthorizedAndReady$$inlined$suspendCallbackApi$2.invoke(Boolean.TRUE);
                break;
            default:
                onAuthorizedAndReadyInteractorImpl$waitForUserAuthorizedAndReady$$inlined$suspendCallbackApi$2.invoke(Boolean.FALSE);
                break;
        }
        return zy11Var;
    }
}
