package xsna;

import com.google.gson.Gson;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class vsr implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ vsr(long j, int i) {
        this.b = i;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        long j = this.c;
        switch (i) {
            case 0:
                return Long.valueOf(j);
            case 1:
                return ((kw8) obj).c(new n4b(j, 4));
            default:
                qyg0 V0 = ((hyg0) obj).V0("SELECT * FROM ugc_packs WHERE ownerId = ?");
                try {
                    V0.bindLong(1, j);
                    int k = egi.k(V0, "ownerId");
                    int k2 = egi.k(V0, "id");
                    int k3 = egi.k(V0, "stickers");
                    int k4 = egi.k(V0, "hash");
                    int k5 = egi.k(V0, "editParams");
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        long j2 = V0.getLong(k);
                        Gson gson = psj.a;
                        UserId userId = new UserId(j2);
                        long j3 = V0.getLong(k2);
                        List j4 = psj.j(V0.l2(k3));
                        String l2 = V0.l2(k4);
                        String l22 = V0.isNull(k5) ? null : V0.l2(k5);
                        arrayList.add(new dwp0(userId, j3, j4, l2, l22 != null ? psj.i(l22) : null));
                    }
                    return arrayList;
                } finally {
                    V0.close();
                }
        }
    }
}
