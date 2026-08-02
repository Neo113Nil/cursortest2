package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.superapp.api.dto.menu.QueueParams;
import xsna.pwg0;

/* compiled from: WidgetsUpdateSubscriberV2.kt */
/* loaded from: classes6.dex */
public final class fpx0 extends pwg0 {
    public final tan0 b;
    public final pwg0.a c;
    public QueueParams d;

    public fpx0(tan0 tan0Var, pwg0.a aVar) {
        this.b = tan0Var;
        this.c = aVar;
    }

    public final void a() {
        this.b.b();
        r7n0 r7n0Var = this.a;
        if (r7n0Var != null) {
            r7n0Var.cancel();
        }
        this.a = null;
    }

    public final void b() {
        if (!q7n0.a().c().getAccount().A()) {
            a();
            return;
        }
        if (this.a != null) {
            a();
        }
        QueueParams queueParams = this.d;
        if (queueParams != null) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"Subscribing: key=" + queueParams.d});
            }
            String str = queueParams.b;
            this.a = this.b.e(new qen0(str), new qan0(str, queueParams.c, queueParams.d, queueParams.e), new dpx0(0, this, queueParams), new uww0(this, 1), new com.vk.movika.sdk.base.flow.binding.l(28, this, queueParams), new yde(this, 10), queueParams.f);
        }
    }
}
