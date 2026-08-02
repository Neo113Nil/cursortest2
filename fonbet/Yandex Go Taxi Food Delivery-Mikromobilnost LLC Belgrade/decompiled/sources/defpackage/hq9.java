package defpackage;

import com.yandex.go.chargers.debt.notification.domain.a;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class hq9 extends ad5 {
    public final em9 x;
    public final a y;

    public hq9(em9 em9Var, a aVar) {
        super(gq9.class);
        this.x = em9Var;
        this.y = aVar;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        em9 em9Var = this.x;
        em9Var.a.a("Chargers.DebtStateBar.Closed", b64.w(em9Var), 1, new HashMap());
    }
}
