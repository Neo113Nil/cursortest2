package defpackage;

import android.util.LruCache;
import com.yandex.mapkit.transport.masstransit.Session;
import ru.yandex.taxi.map_common.map.r;

/* loaded from: classes14.dex */
public final class m641 {
    public final r a;
    public Session b;
    public final LruCache c = new LruCache(10);

    public m641(r rVar) {
        this.a = rVar;
    }
}
