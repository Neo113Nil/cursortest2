package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.push.common.Logger;
import com.vk.push.core.domain.ComponentActions;
import java.util.Collections;
import ru.ok.tracer.base.ucum.UcumUtils;
import ru.rustore.sdk.pushclient.messaging.service.RuStoreMessagingService;
import xsna.d9i;

/* compiled from: MetricReaderInstrumentation.java */
/* loaded from: classes8.dex */
public final class el20 {
    public final Object a;
    public final Object b;

    public el20(Context context, Logger logger) {
        this.a = context;
        this.b = logger.createLogger("ClientServiceStarter");
    }

    public void a() {
        Logger logger = (Logger) this.b;
        Logger.DefaultImpls.info$default(logger, "Trying to start the client app service", null, 2, null);
        int i = RuStoreMessagingService.k;
        Intent intent = new Intent(ComponentActions.CLIENT_MESSAGING_SERVICE_ACTION);
        Context context = (Context) this.a;
        intent.setPackage(context.getPackageName());
        try {
            context.startService(intent);
        } catch (IllegalStateException e) {
            Logger.DefaultImpls.warn$default(logger, "Unable to start service, possible background limitations: " + e.getMessage(), null, 2, null);
        } catch (Exception e2) {
            logger.warn("Unable to start service", e2);
        }
    }

    public el20(d9i d9iVar, cj20 cj20Var) {
        yi20 yi20Var = cj20Var.get("io.opentelemetry.sdk.metrics");
        this.b = q94.k(rfi0.a, ((d9i.a) d9iVar).a, rfi0.b, d9iVar.a());
        this.a = yi20Var.histogramBuilder("otel.sdk.metric_reader.collection.duration").setUnit(UcumUtils.UCUM_SECONDS).setDescription("The duration of the collect operation of the metric reader.").setExplicitBucketBoundariesAdvice(Collections.EMPTY_LIST).build();
    }
}
