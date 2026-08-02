package xsna;

import android.os.Bundle;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import java.util.Iterator;
import java.util.List;

/* compiled from: VkCatalogExternalEventsCompositeAdapter.kt */
/* loaded from: classes.dex */
public final class zhu0 extends l5a {
    public final bpn0 c;
    public final yhu0 d;

    /* JADX WARN: Type inference failed for: r0v1, types: [xsna.yhu0] */
    public zhu0(final q3a q3aVar) {
        super(q3aVar);
        this.c = new bpn0(new nxv(q3aVar, 8));
        this.d = new bd70() { // from class: xsna.yhu0
            @Override // xsna.bd70
            public final void x0(int i, int i2, Object obj) {
                Bundle bundle = (Bundle) obj;
                if (i == 9) {
                    if (epx.f(bundle != null ? bundle.getString("type") : null, "video") && bundle.containsKey("id") && bundle.containsKey("owner_id")) {
                        long j = bundle.getLong("item_id");
                        UserId userId = (UserId) bundle.getParcelable("owner_id");
                        if (userId != null) {
                            q3a.this.b(new xxf0(VideoFile.a.b(j, userId)), false);
                        }
                    }
                }
            }
        };
    }

    @Override // xsna.l5a
    public final void a() {
        p870.f().b(9, this.d);
        Iterator it = ((List) this.c.getValue()).iterator();
        while (it.hasNext()) {
            ((l5a) it.next()).a();
        }
    }
}
