package xsna;

import com.vk.log.L;
import java.util.concurrent.ScheduledExecutorService;
import ru.ok.android.onelog.OneLogDirect;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class v870 implements Runnable {
    public final /* synthetic */ int b;

    public /* synthetic */ v870(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                x870.f = null;
                L.e("[Push][Channels]: Schedule init channels by timeout");
                asu0.a.getClass();
                ((ScheduledExecutorService) asu0.Z.getValue()).execute(new w870());
                break;
            default:
                OneLogDirect.flush$lambda$2();
                break;
        }
    }
}
