package xsna;

import com.vk.core.performance.network.NetworkPerformanceMeasurer;
import com.vk.log.L;
import com.vk.stat.model.builders.aggregate.AggregateEventBuilder;
import com.vk.stat.model.builders.aggregate.AggregateEventKey;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class v460 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (NetworkPerformanceMeasurer.k == -2) {
            NetworkPerformanceMeasurer.k = hx90.a.getInt("network_quality", -1);
        }
        if (NetworkPerformanceMeasurer.k != -1) {
            L.e("NetworkPerformanceMeasurer", "reporting: network quality for previous session was " + NetworkPerformanceMeasurer.k);
            AggregateEventBuilder aggregateEventBuilder = new AggregateEventBuilder(AggregateEventKey.FEED_NETWORK_QUALITY);
            aggregateEventBuilder.v(0, NetworkPerformanceMeasurer.k);
            aggregateEventBuilder.q();
            hx90.b(-1);
        } else {
            L.e("NetworkPerformanceMeasurer", "reporting: no data for previous session");
        }
        NetworkPerformanceMeasurer.j = true;
    }
}
