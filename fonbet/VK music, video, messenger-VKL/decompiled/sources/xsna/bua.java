package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.internal.ToggleManager;
import java.util.concurrent.TimeoutException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class bua implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bua(Object obj, long j, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((h6o0) this.d).e(this.c, true));
            default:
                ToggleManager toggleManager = (ToggleManager) this.d;
                Throwable th = (Throwable) obj;
                if (th instanceof TimeoutException) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.e, new Object[]{qlb0.a(this.c, "Couldn't initialize toggles in ", " millis, performing non-blocking sync")});
                    }
                } else {
                    L.j(th, "toggles: can't get toggles result");
                }
                toggleManager.e();
                return s3q0.a;
        }
    }
}
