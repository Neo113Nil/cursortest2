package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h460 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ h460(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.core.utils.newtork.d dVar = (com.vk.core.utils.newtork.d) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"Network status changed - ".concat(dVar.getClass().getSimpleName())});
                }
                break;
            default:
                owi.a(hhx0.a, 10000L, new knf(25));
                break;
        }
        return s3q0.a;
    }
}
