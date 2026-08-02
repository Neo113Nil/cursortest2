package defpackage;

import com.yandex.mapkit.transport.masstransit.ThreadInfo;
import com.yandex.mapkit.transport.masstransit.ThreadSession;
import com.yandex.runtime.Error;
import java.io.IOException;
import ru.yandex.taxi.masstransit.datasource.thread.MtThreadRepository$mapKitRequest$$inlined$suspendCallbackApi$2;
import ru.yandex.taxi.masstransit.datasource.thread.MtThreadRepository$mapKitRequest$$inlined$suspendCallbackApi$3;

/* loaded from: classes6.dex */
public final class o540 implements ThreadSession.ThreadListener {
    public final /* synthetic */ MtThreadRepository$mapKitRequest$$inlined$suspendCallbackApi$2 a;
    public final /* synthetic */ MtThreadRepository$mapKitRequest$$inlined$suspendCallbackApi$3 b;

    public o540(MtThreadRepository$mapKitRequest$$inlined$suspendCallbackApi$2 mtThreadRepository$mapKitRequest$$inlined$suspendCallbackApi$2, MtThreadRepository$mapKitRequest$$inlined$suspendCallbackApi$3 mtThreadRepository$mapKitRequest$$inlined$suspendCallbackApi$3) {
        this.a = mtThreadRepository$mapKitRequest$$inlined$suspendCallbackApi$2;
        this.b = mtThreadRepository$mapKitRequest$$inlined$suspendCallbackApi$3;
    }

    @Override // com.yandex.mapkit.transport.masstransit.ThreadSession.ThreadListener
    public final void onThreadError(Error error) {
        this.b.invoke(new IOException("Error " + error + " in masstransit thread request"));
    }

    @Override // com.yandex.mapkit.transport.masstransit.ThreadSession.ThreadListener
    public final void onThreadResponse(ThreadInfo threadInfo) {
        this.a.invoke(threadInfo);
    }
}
