package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class nec0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ UserId c;

    public /* synthetic */ nec0(UserId userId, int i) {
        this.b = i;
        this.c = userId;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        qyg0 V0;
        switch (this.b) {
            case 0:
                UserId userId = this.c;
                V0 = ((hyg0) obj).V0("SELECT id FROM posting_draft WHERE user_id = ?");
                try {
                    V0.bindLong(1, userId.b);
                    Long l = null;
                    if (V0.step() && !V0.isNull(0)) {
                        l = Long.valueOf(V0.getLong(0));
                    }
                    return l;
                } finally {
                }
            default:
                UserId userId2 = this.c;
                V0 = ((hyg0) obj).V0("SELECT * FROM cached_subscription WHERE user_id = ?");
                try {
                    V0.bindLong(1, userId2.b);
                    int k = egi.k(V0, "user_id");
                    int k2 = egi.k(V0, "owner_id");
                    int k3 = egi.k(V0, "status");
                    int k4 = egi.k(V0, "next_payment_date");
                    int k5 = egi.k(V0, "updated_at");
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        arrayList.add(new py8(new UserId(V0.getLong(k)), new UserId(V0.getLong(k2)), V0.l2(k3), V0.getLong(k4), V0.getLong(k5)));
                    }
                    return arrayList;
                } finally {
                }
        }
    }
}
