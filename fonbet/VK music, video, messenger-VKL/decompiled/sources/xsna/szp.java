package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.network.eventhub.impl.EventHubServiceClient;
import defpackage.WebSocketCriticalException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: EventHubServiceClient.kt */
/* loaded from: classes3.dex */
public final class szp {
    public final AtomicLong a = new AtomicLong(0);
    public final /* synthetic */ EventHubServiceClient b;

    public szp(EventHubServiceClient eventHubServiceClient) {
        this.b = eventHubServiceClient;
    }

    public final void a(String str) {
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{"EventHubServiceClient VkWebSocket message: " + ((Object) str)});
    }

    public final void b(Throwable th, String str) {
        com.vk.metrics.eventtracking.b.a.a(new WebSocketCriticalException("EventHubServiceClient VkWebSocket exception", th));
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.e, new Object[]{"EventHubServiceClient", str});
    }
}
