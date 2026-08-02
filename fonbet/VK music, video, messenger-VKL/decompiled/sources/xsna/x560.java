package xsna;

import com.vk.core.network.metrics.traffic.TrafficItem;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class x560 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x560(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TrafficItem.ContentType contentType;
        switch (this.b) {
            case 0:
                y560 y560Var = (y560) this.c;
                Iterator<Map.Entry<okhttp3.p, TrafficItem>> it = y560Var.b.entrySet().iterator();
                while (it.hasNext()) {
                    TrafficItem value = it.next().getValue();
                    if (value != null && ((contentType = value.a) == TrafficItem.ContentType.CONTENT_AUDIO || contentType == TrafficItem.ContentType.CONTENT_VIDEO)) {
                        y560Var.a().h(value.d);
                        asu0.a.getClass();
                        asu0.r().d(y560Var.d, 6000L, TimeUnit.MILLISECONDS);
                        break;
                    }
                }
                y560Var.a().d();
                asu0.a.getClass();
                asu0.r().d(y560Var.d, 6000L, TimeUnit.MILLISECONDS);
                break;
            default:
                ((f5u0) this.c).invoke();
                break;
        }
    }
}
