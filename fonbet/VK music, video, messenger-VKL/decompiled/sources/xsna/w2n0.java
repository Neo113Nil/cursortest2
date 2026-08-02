package xsna;

import com.vk.im.engine.models.messages.CnvMsgId;
import com.vk.im.engine.reporters.performance.events.VkmSuccessRateEventBuilder;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SuccessRateViewMsgReporterImpl.kt */
/* loaded from: classes5.dex */
public final class w2n0 implements v2n0 {
    public final t2n0 a;
    public CnvMsgId b;

    public w2n0(VkmSuccessRateEventBuilder.EventName eventName) {
        this.a = new t2n0(eventName);
    }

    @Override // xsna.v2n0
    public final void a() {
        if (this.b != null) {
            this.a.onError("cancelled");
            this.b = null;
        }
    }

    @Override // xsna.v2n0
    public final void b(CnvMsgId cnvMsgId) {
        CnvMsgId cnvMsgId2 = this.b;
        t2n0 t2n0Var = this.a;
        if (cnvMsgId2 != null) {
            t2n0Var.onError("lost");
            this.b = null;
        }
        this.b = cnvMsgId;
        t2n0Var.b();
    }

    @Override // xsna.v2n0
    public final void c() {
        t2n0 t2n0Var = this.a;
        t2n0Var.b();
        t2n0Var.onError("missed");
    }

    @Override // xsna.v2n0
    public final void d(Map<CnvMsgId, Boolean> map) {
        CnvMsgId cnvMsgId = this.b;
        if (cnvMsgId == null) {
            return;
        }
        Boolean bool = map.get(cnvMsgId);
        boolean f = epx.f(bool, Boolean.TRUE);
        t2n0 t2n0Var = this.a;
        if (f) {
            t2n0Var.a();
            this.b = null;
        } else if (epx.f(bool, Boolean.FALSE)) {
            t2n0Var.onError("hidden");
            this.b = null;
        } else if (bool != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // xsna.v2n0
    public final void onDestroy() {
        if (this.b != null) {
            this.a.onError("lost");
            this.b = null;
        }
    }
}
