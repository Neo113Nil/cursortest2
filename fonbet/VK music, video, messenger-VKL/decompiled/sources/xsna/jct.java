package xsna;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.market.catalog.CatalogMarketStatusOption;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import com.vk.ecomm.design.compose.reviewcard.ReviewCardTypeOfState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.god0;
import xsna.ifk0;
import xsna.iv00;
import xsna.jdt;
import xsna.n1k0;
import xsna.r1k0;
import xsna.ult;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class jct implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jct(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        MarketBridgeCategory marketBridgeCategory;
        dw20 a;
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                pct.a((jdt.a) this.c, (izs) this.d, (gzs) this.e, (rha) this.f, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                d64 d64Var = (d64) this.c;
                d64 d64Var2 = (d64) this.d;
                d64 d64Var3 = (d64) this.e;
                d64 d64Var4 = (d64) this.f;
                rj50 rj50Var = (rj50) obj;
                ult ultVar = (ult) obj2;
                if (ultVar instanceof ult.c) {
                    return rj50Var.a(d64Var, ultVar);
                }
                if (ultVar instanceof ult.b) {
                    return rj50Var.a(d64Var2, ultVar);
                }
                if (ultVar instanceof ult.a) {
                    return rj50Var.a(d64Var3, ultVar);
                }
                if (ultVar instanceof vlt) {
                    return rj50Var.a(d64Var4, ultVar);
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                god0 god0Var = (god0) this.c;
                FragmentActivity fragmentActivity = (FragmentActivity) this.d;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.e;
                god0.a aVar = (god0.a) this.f;
                vcr vcrVar = (vcr) obj;
                Integer num = (Integer) obj2;
                num.getClass();
                u9 u9Var = new u9(28, god0Var, aVar);
                op5 op5Var = god0Var.a;
                final omo omoVar = new omo(fragmentActivity, op5Var);
                ncr<vcr<?>> ncrVar = god0Var.b;
                if (ncrVar == null || (a = ncrVar.a(vcrVar, omoVar)) == null) {
                    if (vcrVar instanceof nmo) {
                        nmo nmoVar = (nmo) vcrVar;
                        List<wqd0> list = nmoVar.j;
                        List<wqd0> list2 = list;
                        if (list2 != null && !list2.isEmpty()) {
                            if (vcrVar instanceof rka) {
                                rka rkaVar = (rka) vcrVar;
                                MarketBridgeCategory marketBridgeCategory2 = rkaVar.l;
                                wqd0 wqd0Var = rkaVar.e;
                                if (wqd0Var == null || (marketBridgeCategory = marketBridgeCategory2.a(wqd0Var.a)) == null) {
                                    marketBridgeCategory = marketBridgeCategory2;
                                }
                                iv00.a aVar2 = new iv00.a(fragmentActivity, rkaVar.l);
                                aVar2.f = new di30(vcrVar, god0Var, u9Var, fragmentActivity, 2);
                                aVar2.g = marketBridgeCategory;
                                op5Var.e(fragmentActivity, aVar2.X(new rkt(omoVar, 27)).c0(new DialogInterface.OnKeyListener() { // from class: xsna.eod0
                                    @Override // android.content.DialogInterface.OnKeyListener
                                    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                                        return omo.this.a(i);
                                    }
                                }).a());
                            } else {
                                String str = nmoVar.i;
                                god0Var.d(fragmentActivity, str == null ? "" : str, list, new ar80(vcrVar, u9Var, god0Var, fragmentActivity, 1));
                            }
                        }
                    }
                    if (vcrVar instanceof wzk0) {
                        wzk0 wzk0Var = (wzk0) vcrVar;
                        String str2 = wzk0Var.e;
                        if (str2 == null) {
                            str2 = "";
                        }
                        CatalogMarketStatusOption catalogMarketStatusOption = wzk0Var.f;
                        if (catalogMarketStatusOption == null) {
                            catalogMarketStatusOption = wzk0Var.g;
                        }
                        CatalogMarketStatusOption catalogMarketStatusOption2 = catalogMarketStatusOption;
                        List<CatalogMarketStatusOption> list3 = wzk0Var.h;
                        bx9 bx9Var = new bx9(vcrVar, u9Var, god0Var, fragmentActivity, 3);
                        View inflate = fragmentActivity.getLayoutInflater().inflate(R.layout.product_filter_dropdown, (ViewGroup) null);
                        ((TextView) inflate.findViewById(R.id.title)).setText(str2);
                        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.items);
                        List<CatalogMarketStatusOption> list4 = list3;
                        ArrayList arrayList = new ArrayList(c5g.u(list4, 10));
                        for (CatalogMarketStatusOption catalogMarketStatusOption3 : list4) {
                            arrayList.add(new ifk0.a(epx.f(catalogMarketStatusOption3.c, catalogMarketStatusOption2.c), catalogMarketStatusOption3.c, catalogMarketStatusOption3.b));
                        }
                        recyclerView.setAdapter(new hfk0(arrayList, new mgz(bx9Var, 26)));
                        ((ImageView) inflate.findViewById(R.id.close_button)).setOnClickListener(new akc(2, god0Var, fragmentActivity));
                        op5Var.e(fragmentActivity, god0Var.b(fragmentActivity, inflate));
                    }
                } else {
                    op5Var.e(fragmentActivity, a);
                }
                aod0 aod0Var = (aod0) ref$ObjectRef.element;
                if (aod0Var != null) {
                    aod0Var.notifyItemChanged(num.intValue());
                }
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                vgg0.d((wgg0) this.c, (q630) this.d, (ReviewCardTypeOfState) this.e, (wzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(3121));
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                ((n1k0.a) this.c).h6((r1k0.b) this.e, (izs) this.d, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(385));
                return s3q0.a;
        }
    }

    public /* synthetic */ jct(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ jct(n1k0.a aVar, r1k0.b bVar, izs izsVar, q630 q630Var, int i) {
        this.b = 4;
        this.c = aVar;
        this.e = bVar;
        this.d = izsVar;
        this.f = q630Var;
    }
}
