package xsna;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Triple;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ge3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ ge3(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((String) obj).equals(this.c));
            case 1:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "priority_block_header_show_all_item_btn");
                qgi0.h(tgi0Var, this.c);
                return s3q0.a;
            case 2:
                qgi0.h((tgi0) obj, this.c);
                return s3q0.a;
            case 3:
                String str = this.c;
                qyg0 V0 = ((hyg0) obj).V0("SELECT owner_id FROM podcast WHERE uid = ? ORDER BY id");
                try {
                    V0.D3(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        arrayList.add(fwx0.b(V0.l2(0)));
                    }
                    return arrayList;
                } finally {
                    V0.close();
                }
            default:
                Pair pair = (Pair) obj;
                return new Triple(this.c, pair.i(), pair.j());
        }
    }

    public /* synthetic */ ge3(String str, sgb0 sgb0Var) {
        this.b = 3;
        this.c = str;
    }
}
