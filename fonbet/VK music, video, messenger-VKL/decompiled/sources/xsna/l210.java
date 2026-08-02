package xsna;

import com.vk.dto.common.id.UserId;
import xsna.bhg0;

/* compiled from: MarketItemReviewItemViewHolder.kt */
/* loaded from: classes18.dex */
public final class l210 implements eig0<bhg0> {
    public final /* synthetic */ m210 b;

    public l210(m210 m210Var) {
        this.b = m210Var;
    }

    @Override // xsna.eig0
    public final void a(bhg0 bhg0Var) {
        h210 h210Var;
        h210 h210Var2;
        UserId userId;
        UserId userId2;
        bhg0 bhg0Var2 = bhg0Var;
        m210 m210Var = this.b;
        h780 h780Var = m210Var.l;
        if (bhg0Var2 instanceof bhg0.b) {
            h210 h210Var3 = m210Var.q;
            if (h210Var3 != null) {
                h780Var.g(((bhg0.b) bhg0Var2).a, h210Var3.b);
                return;
            }
            return;
        }
        if (bhg0Var2 instanceof bhg0.g) {
            h210 h210Var4 = m210Var.q;
            if (h210Var4 != null) {
                h780Var.f(h210Var4.b);
                return;
            }
            return;
        }
        if (!(bhg0Var2 instanceof bhg0.i)) {
            if (!(bhg0Var2 instanceof bhg0.f) || (h210Var = m210Var.q) == null) {
                return;
            }
            h780Var.d(h210Var.d, h210Var.c, h210Var.b);
            return;
        }
        h210 h210Var5 = m210Var.q;
        if ((h210Var5 != null && (userId2 = h210Var5.d) != null && !fkq0.c(userId2)) || (h210Var2 = m210Var.q) == null || (userId = h210Var2.d) == null) {
            return;
        }
        h780Var.a(userId);
    }
}
