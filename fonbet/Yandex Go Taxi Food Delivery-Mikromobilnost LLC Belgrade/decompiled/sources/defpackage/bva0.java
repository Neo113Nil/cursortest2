package defpackage;

import com.yandex.go.address.search.perf.b;
import java.util.concurrent.atomic.AtomicReference;
import ru.yandex.taxi.perf.screen.ScreenEndpoint;
import ru.yandex.taxi.perf.screen.c;

/* loaded from: classes9.dex */
public final class bva0 {
    public final c a;
    public final AtomicReference b = new AtomicReference();

    public bva0(c cVar) {
        this.a = cVar;
    }

    public final void a(ScreenEndpoint screenEndpoint, long j, String str, String str2) {
        this.a.e(screenEndpoint, j, str);
        b bVar = (b) this.b.get();
        if (bVar != null) {
            bVar.b(screenEndpoint, j, str, str2);
        }
    }
}
