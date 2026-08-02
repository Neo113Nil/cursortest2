package xsna;

import com.vkontakte.android.VKApplication;
import java.util.concurrent.TimeUnit;
import okhttp3.o;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.tracer.opentelemetry.OpenTelemetryConfiguration;
import xsna.ka3;
import xsna.wjy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ma3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ma3(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ka3.a aVar = (ka3.a) this.c;
                na3 na3Var = (na3) this.d;
                OpenTelemetryConfiguration.Builder builder = (OpenTelemetryConfiguration.Builder) obj;
                ka3.b bVar = aVar.f;
                builder.setEnabled(bVar.a);
                builder.setExperimentalMaxSpanCountToUpload(bVar.b);
                builder.setExperimentalCompleteTracesToUpload(bVar.c);
                builder.setServiceName(((VKApplication) na3Var).getApplicationContext().getPackageName());
                builder.setExperimentalMaxNumberOfEventsPerSpan(bVar.e);
                builder.setExperimentalMaxNumberOfEventsPerSpan(bVar.f);
                builder.setExperimentalMaxNumberOfEventsPerSpan(bVar.g);
                double e = swe0.e(bVar.h, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 1.0d);
                rm5 rm5Var = sdp0.d;
                if (e < ConnectivityTracker.DEFAULT_UPLINK_BITRATE || e > 1.0d) {
                    throw new IllegalArgumentException("ratio must be in range [0.0, 1.0]");
                }
                builder.setExperimentalSampler(new ji90(new sdp0(e == ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? Long.MIN_VALUE : e == 1.0d ? Long.MAX_VALUE : (long) (9.223372036854776E18d * e), e)));
                return s3q0.a;
            case 1:
                wdp0 wdp0Var = (wdp0) this.c;
                wjy.a aVar2 = (wjy.a) this.d;
                o.a aVar3 = (o.a) obj;
                if (wdp0Var != null) {
                    tz80.b(aVar3, wdp0Var);
                }
                TimeUnit timeUnit = TimeUnit.MINUTES;
                h4j h4jVar = new h4j(3L);
                qcn qcnVar = new qcn(aVar2.l);
                synchronized (qcnVar) {
                    qcnVar.a = 5;
                    s3q0 s3q0Var = s3q0.a;
                }
                qcnVar.d();
                synchronized (qcnVar) {
                    qcnVar.b = 50;
                }
                qcnVar.d();
                long j = aVar2.r.a;
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                aVar3.c(j, timeUnit2);
                aVar3.g(aVar2.r.b, timeUnit2);
                aVar3.e(aVar2.r.c, timeUnit2);
                aVar3.b = h4jVar;
                aVar3.a = qcnVar;
                aVar3.h = true;
                aVar3.i = true;
                aVar3.d(nvn.b);
                return aVar3;
            default:
                return new com.vk.catalog.mvi.block.video.impl.video.list.b((m7a) this.c, (b2a) obj, (h7v) this.d);
        }
    }
}
