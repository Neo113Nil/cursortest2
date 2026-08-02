package xsna;

import com.vk.log.L;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.report.dialog.VoipReportSuspiciousCallActivity;
import java.util.concurrent.TimeUnit;
import ru.ok.android.utils.Logger;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class fww0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fww0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                VoipReportSuspiciousCallActivity voipReportSuspiciousCallActivity = (VoipReportSuspiciousCallActivity) this.c;
                CallId callId = (CallId) this.d;
                int i = VoipReportSuspiciousCallActivity.q;
                gww0 gww0Var = new gww0(callId);
                a1w a1wVar = q1w.a;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                voipReportSuspiciousCallActivity.p.b(io.reactivex.rxjava3.kotlin.c.h(new io.reactivex.rxjava3.internal.operators.single.i(ktr.d(a1wVar.C(voipReportSuspiciousCallActivity, gww0Var).r(2L, TimeUnit.SECONDS)), new sh1(voipReportSuspiciousCallActivity, 4)), new uuh(1, L.a, L.class, Logger.METHOD_W, "w(Ljava/lang/Throwable;[Ljava/lang/Object;)V", 0, 1), null, 2));
                break;
            default:
                gvw0 gvw0Var = (gvw0) this.c;
                gzs gzsVar = (gzs) this.d;
                gvw0Var.d = false;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
        }
        return s3q0.a;
    }
}
