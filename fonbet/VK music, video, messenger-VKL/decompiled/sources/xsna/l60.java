package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class l60 implements izs {
    public final /* synthetic */ int b;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"Offline:ActionSynchronizerInteractorImpl", "Deleting all actions."});
                }
                break;
            default:
                xgx0.a.getClass();
                xgx0.f("UsersStore warmed up at EnterLogin");
                break;
        }
        return s3q0.a;
    }
}
