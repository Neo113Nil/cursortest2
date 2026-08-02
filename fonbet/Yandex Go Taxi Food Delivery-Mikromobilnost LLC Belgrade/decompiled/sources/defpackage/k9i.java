package defpackage;

import com.yandex.delivery.mapper.model.Expansion;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class k9i {
    public final qii a;
    public final ra00 b;

    public k9i(qii qiiVar, ra00 ra00Var) {
        this.a = qiiVar;
        this.b = ra00Var;
    }

    public final void a(UUID uuid) {
        ra00 ra00Var = this.b;
        if (uuid == null) {
            ra00Var.a();
        } else {
            ra00Var.b((m950) this.a.get(), new rui((String) null, (Map) null, (Expansion) null, uuid, 22));
        }
    }
}
