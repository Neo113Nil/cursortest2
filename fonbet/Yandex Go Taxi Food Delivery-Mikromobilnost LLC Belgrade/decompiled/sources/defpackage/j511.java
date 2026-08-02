package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.fintechsdk.core.nfc.impl.internal.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class j511 implements jg5 {
    public final /* synthetic */ int a;
    public final d860 b;
    public final FlexAdapter c;

    public /* synthetic */ j511(d860 d860Var, FlexAdapter flexAdapter, int i) {
        this.a = i;
        this.b = d860Var;
        this.c = flexAdapter;
    }

    @Override // defpackage.jg5
    public final void y(ig5 ig5Var, jh5 jh5Var) {
        a a;
        a a2;
        int i = this.a;
        d860 d860Var = this.b;
        switch (i) {
            case 0:
                if ((ig5Var instanceof f511 ? (f511) ig5Var : null) != null && (a = d860Var.a()) != null) {
                    List<mbi0> list = ((f511) ig5Var).a;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    for (mbi0 mbi0Var : list) {
                        arrayList.add(new obi0(mbi0Var.d, mbi0Var.a, mbi0Var.e, mbi0Var.b, mbi0Var.c));
                    }
                    a.a(arrayList, new zjy0(11, this, jh5Var, ig5Var), new h511(jh5Var, ig5Var, 0));
                    break;
                }
                break;
            default:
                if ((ig5Var instanceof tb11 ? (tb11) ig5Var : null) != null && (a2 = d860Var.a()) != null) {
                    List<xb51> list2 = ((tb11) ig5Var).a;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                    for (xb51 xb51Var : list2) {
                        arrayList2.add(new ec51(xb51Var.a, xb51Var.c, xb51Var.d, xb51Var.h, xb51Var.i, xb51Var.f, xb51Var.e, xb51Var.b, xb51Var.g, xb51Var.j));
                    }
                    a2.d(arrayList2, new zjy0(14, this, jh5Var, ig5Var), new h511(jh5Var, ig5Var, 2));
                    break;
                }
                break;
        }
    }
}
