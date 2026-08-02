package defpackage;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.management.localstate.HiddenDeliveries$HiddenDeliveriesData;
import ru.yandex.taxi.logistics.sdk.management.localstate.HiddenDeliveries$HiddenDelivery;

/* loaded from: classes9.dex */
public final class igu {
    public final Moshi a;
    public final i3y b = a.a(new ppr(10, this));
    public HiddenDeliveries$HiddenDeliveriesData c = new HiddenDeliveries$HiddenDeliveriesData(null, 1, null);
    public Set d = EmptySet.a;

    public igu(Moshi moshi) {
        this.a = moshi;
    }

    public final void a(String str) {
        HiddenDeliveries$HiddenDeliveriesData hiddenDeliveries$HiddenDeliveriesData;
        if (str == null) {
            hiddenDeliveries$HiddenDeliveriesData = new HiddenDeliveries$HiddenDeliveriesData(null, 1, null);
        } else {
            try {
                hiddenDeliveries$HiddenDeliveriesData = (HiddenDeliveries$HiddenDeliveriesData) ((JsonAdapter) this.b.getValue()).fromJson(str);
            } catch (Throwable th) {
                jgz jgzVar = jgz.a;
                jgz.c(th);
                hiddenDeliveries$HiddenDeliveriesData = new HiddenDeliveries$HiddenDeliveriesData(null, 1, null);
            }
        }
        this.c = hiddenDeliveries$HiddenDeliveriesData;
        b();
    }

    public final void b() {
        List<HiddenDeliveries$HiddenDelivery> markedDeliveries = this.c.getMarkedDeliveries();
        ArrayList arrayList = new ArrayList(tcc.n(markedDeliveries, 10));
        for (HiddenDeliveries$HiddenDelivery hiddenDeliveries$HiddenDelivery : markedDeliveries) {
            arrayList.add(new Pair(hiddenDeliveries$HiddenDelivery.getDeliveryId(), Integer.valueOf(hiddenDeliveries$HiddenDelivery.getRevision())));
        }
        this.d = kotlin.collections.a.N0(arrayList);
    }
}
