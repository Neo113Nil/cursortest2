package xsna;

import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.util.ArrayList;
import org.chromium.net.NetError;

/* compiled from: VideoProfileCatalogPerfMetricsDelegate.kt */
/* loaded from: classes6.dex */
public final class f7t0 implements e7t0 {
    public final ArrayList a = new ArrayList();
    public Long b;
    public String c;

    @Override // xsna.e7t0
    public final void a() {
        this.b = Long.valueOf(System.currentTimeMillis());
    }

    @Override // xsna.e7t0
    public final void b(String str) {
        if (epx.f(this.c, str)) {
            return;
        }
        c();
        e();
        this.c = str;
    }

    @Override // xsna.e7t0
    public final void c() {
        long currentTimeMillis = System.currentTimeMillis();
        Long l = this.b;
        if (l != null) {
            this.a.add(Long.valueOf(currentTimeMillis - l.longValue()));
        }
        this.b = null;
    }

    @Override // xsna.e7t0
    public final void d() {
        e();
    }

    public final void e() {
        if (this.c == null) {
            return;
        }
        l5m l5mVar = new l5m(null, null, 3);
        String h = DevNullEventKey.AUTHORS_CATALOG_PAGINATION_LOADER_VISIBLE_EVENT.h();
        ArrayList arrayList = this.a;
        l5mVar.g = new SchemeStat$TypeDevNullItem(h, null, String.valueOf(arrayList.size()), null, String.valueOf(j5g.G0(arrayList)), null, "OLD CATALOG AUTHORS CHANNEL", null, this.c, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, NetError.ERR_UNEXPECTED_SECURITY_LIBRARY_STATUS, 3, null);
        l5mVar.q();
        arrayList.clear();
    }
}
