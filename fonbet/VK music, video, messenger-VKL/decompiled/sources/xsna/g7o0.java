package xsna;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: TaskTimeInQueueReporter.kt */
/* loaded from: classes3.dex */
public final class g7o0 {
    public final boolean a;
    public final String[] b = {erm0.D0(15, "vk-io-pool-thread"), erm0.D0(15, "vk-computation-thread"), erm0.D0(15, "vk-network-image-thread"), erm0.D0(15, "vk-network-thread")};
    public final List<Long>[] c;

    public g7o0(boolean z) {
        this.a = z;
        List<Long>[] listArr = new List[4];
        for (int i = 0; i < 4; i++) {
            listArr[i] = dez0.b();
        }
        this.c = listArr;
        io.reactivex.rxjava3.core.q.R(1L, TimeUnit.MINUTES).a0(io.reactivex.rxjava3.schedulers.a.b()).subscribe(new gl30(new xc50(this, 26), 28), new afs(new bqt(29), 28));
    }

    public static void a(List list) {
        int size = (int) (list.size() * 0.75d);
        Long l = list.size() > size ? (Long) list.get(size) : null;
        if (l != null) {
            TimeUnit.NANOSECONDS.toMillis(l.longValue());
        }
    }
}
