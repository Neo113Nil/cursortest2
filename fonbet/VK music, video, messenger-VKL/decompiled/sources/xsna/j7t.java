package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import xsna.djc;
import xsna.o9t;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class j7t implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j7t(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((izs) this.d).invoke(new o9t.m(new djc.b(((g7t) this.e).d, Integer.valueOf(this.c), null, null)));
                break;
            default:
                qgp0 qgp0Var = (qgp0) this.d;
                String str = (String) this.e;
                L l = L.a;
                l.getClass();
                boolean m = L.m(LoggerOutputTarget.NONE);
                int i = this.c;
                if (!m) {
                    L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", zil0.a(i, "mid=", str, " downloadingState=")});
                }
                qgp0Var.b.q(i, str);
                break;
        }
        return s3q0.a;
    }
}
