package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.go.promocodes.base.impl.discounts.domain.analytics.ItemType;
import com.yandex.go.promocodes.base.impl.discounts.presentation.entities.list.DiscountsListItemType;
import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.main.a;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final class eqj extends RecyclerView.Adapter {
    public final pav a;
    public final a b;
    public List c = EmptyList.a;

    public eqj(pav pavVar, a aVar) {
        this.a = pavVar;
        this.b = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((fqj) this.c.get(i)).a().getId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        trj trjVar = (trj) x0Var;
        fqj fqjVar = (fqj) this.c.get(i);
        if (i != this.c.size() - 1) {
        }
        if (i != 0) {
        }
        trjVar.W(fqjVar);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [cqj] */
    /* JADX WARN: Type inference failed for: r0v12, types: [cqj] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        final int i2 = 0;
        if (i == DiscountsListItemType.ADD.getId()) {
            return new urj(viewGroup, new sls(this) { // from class: cqj
                public final /* synthetic */ eqj b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    int i3 = i2;
                    zy11 zy11Var = zy11.a;
                    eqj eqjVar = this.b;
                    switch (i3) {
                        case 0:
                            a aVar = eqjVar.b;
                            prj prjVar = aVar.H;
                            rrj rrjVar = prjVar.b;
                            rrjVar.A((m950) ((yvf0) rrjVar.I).get(), new epj(null, prjVar.a.b), new orj(rrjVar, prjVar));
                            aVar.y.c(ItemType.ADD, null, null);
                            break;
                        default:
                            a aVar2 = eqjVar.b;
                            aVar2.y.b(ItemType.GET_DISCOUNT, aVar2.J.c);
                            aVar2.H.a();
                            break;
                    }
                    return zy11Var;
                }
            });
        }
        int id = DiscountsListItemType.REFERRAL.getId();
        final int i3 = 1;
        pav pavVar = this.a;
        if (i == id) {
            return new zrj(viewGroup, pavVar, new sls(this) { // from class: cqj
                public final /* synthetic */ eqj b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    int i32 = i3;
                    zy11 zy11Var = zy11.a;
                    eqj eqjVar = this.b;
                    switch (i32) {
                        case 0:
                            a aVar = eqjVar.b;
                            prj prjVar = aVar.H;
                            rrj rrjVar = prjVar.b;
                            rrjVar.A((m950) ((yvf0) rrjVar.I).get(), new epj(null, prjVar.a.b), new orj(rrjVar, prjVar));
                            aVar.y.c(ItemType.ADD, null, null);
                            break;
                        default:
                            a aVar2 = eqjVar.b;
                            aVar2.y.b(ItemType.GET_DISCOUNT, aVar2.J.c);
                            aVar2.H.a();
                            break;
                    }
                    return zy11Var;
                }
            });
        }
        if (i == DiscountsListItemType.PROMO_CODE.getId()) {
            return new xrj(viewGroup, pavVar, new dqj(this, i2), new dqj(this, i3));
        }
        if (i == DiscountsListItemType.PROMO_LINK.getId()) {
            return new yrj(viewGroup, pavVar, new dqj(this, 2));
        }
        if (i == DiscountsListItemType.HEADER.getId()) {
            return new vrj(oo31.f(viewGroup, dvh0.promocode_list_header_item, viewGroup, false));
        }
        if (i == DiscountsListItemType.NULL_HEADER.getId()) {
            return new vrj(viewGroup);
        }
        jst.e.u("Unexpected item type '" + i + "'");
        return new vrj(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(x0 x0Var) {
        ((trj) x0Var).X();
    }
}
