package xsna;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class rdh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ rdh(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "priority_block_header_add_item_btn");
                qgi0.h(tgi0Var, str);
                return s3q0.a;
            case 1:
                qyg0 V0 = ((hyg0) obj).V0("SELECT * FROM polls WHERE triggers LIKE '%' || ? || '%'");
                try {
                    V0.D3(1, str);
                    int k = egi.k(V0, "id");
                    int k2 = egi.k(V0, "triggers");
                    int k3 = egi.k(V0, "initialHeight");
                    int k4 = egi.k(V0, "status");
                    int k5 = egi.k(V0, "metadata");
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        int i2 = (int) V0.getLong(k);
                        String l2 = V0.l2(k2);
                        bpn0 bpn0Var = ssj.a;
                        arrayList.add(new ypb0(i2, V0.isNull(k3) ? null : Integer.valueOf((int) V0.getLong(k3)), V0.isNull(k4) ? null : V0.l2(k4), V0.isNull(k5) ? null : V0.l2(k5), (List) ((Gson) ssj.a.getValue()).fromJson(l2, new msj().getType())));
                    }
                    return arrayList;
                } finally {
                    V0.close();
                }
            default:
                qgi0.h((tgi0) obj, str);
                return s3q0.a;
        }
    }
}
