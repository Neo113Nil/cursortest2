package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.dto.discover.carousel.products.BaseProductCarouselItem;
import com.vk.dto.discover.carousel.products.ProductCarouselItem;
import com.vk.dto.discover.carousel.products.ProductCarouselPromoItem;
import com.vk.dto.discover.carousel.products.ShowAllProductCarouselItem;
import com.vk.dto.discover.carousel.products.SkeletonProductCarouselItem;
import com.vk.newsfeed.common.recycler.holders.recommendations.ActionButtonStyle;
import com.vk.toggle.data.RecommendationsItemImageStyle;
import xsna.nnd0;

/* compiled from: ProductCarouselItemsAdapter.kt */
/* loaded from: classes4.dex */
public final class qnd0 extends androidx.recyclerview.widget.x<BaseProductCarouselItem, RecyclerView.e0> {
    public final h170 c;
    public final nnd0.a d;
    public final pa10 e;
    public final pnd0 f;

    /* compiled from: ProductCarouselItemsAdapter.kt */
    public static final class a extends m.e<BaseProductCarouselItem> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(BaseProductCarouselItem baseProductCarouselItem, BaseProductCarouselItem baseProductCarouselItem2) {
            return baseProductCarouselItem.equals(baseProductCarouselItem2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(BaseProductCarouselItem baseProductCarouselItem, BaseProductCarouselItem baseProductCarouselItem2) {
            BaseProductCarouselItem baseProductCarouselItem3 = baseProductCarouselItem;
            BaseProductCarouselItem baseProductCarouselItem4 = baseProductCarouselItem2;
            if ((baseProductCarouselItem3 instanceof ProductCarouselItem) && (baseProductCarouselItem4 instanceof ProductCarouselItem) && ((ProductCarouselItem) baseProductCarouselItem3).c == ((ProductCarouselItem) baseProductCarouselItem4).c) {
                return true;
            }
            if ((baseProductCarouselItem3 instanceof ProductCarouselPromoItem) && (baseProductCarouselItem4 instanceof ProductCarouselPromoItem) && epx.f(((ProductCarouselPromoItem) baseProductCarouselItem3).g, ((ProductCarouselPromoItem) baseProductCarouselItem4).g)) {
                return true;
            }
            return (baseProductCarouselItem3 instanceof ShowAllProductCarouselItem) && (baseProductCarouselItem4 instanceof ShowAllProductCarouselItem);
        }
    }

    public qnd0(h170 h170Var, nnd0.a aVar, pa10 pa10Var) {
        super(new a());
        this.c = h170Var;
        this.d = aVar;
        this.e = pa10Var;
        this.f = new pnd0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        int intValue;
        if (i >= getItemCount()) {
            return -1L;
        }
        BaseProductCarouselItem item = getItem(i);
        if (item instanceof ProductCarouselItem) {
            intValue = ((ProductCarouselItem) item).c;
        } else {
            Integer d = item.d();
            if (d == null) {
                return -1L;
            }
            intValue = d.intValue();
        }
        return intValue;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        BaseProductCarouselItem item = getItem(i);
        if (item instanceof ProductCarouselItem) {
            return 0;
        }
        if (item instanceof ProductCarouselPromoItem) {
            return 1;
        }
        if (item instanceof ShowAllProductCarouselItem) {
            return 3;
        }
        if (item instanceof SkeletonProductCarouselItem) {
            return 2;
        }
        throw new IllegalArgumentException("unsupported view type");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        BaseProductCarouselItem item = getItem(i);
        if (e0Var instanceof ond0) {
            ProductCarouselItem productCarouselItem = item instanceof ProductCarouselItem ? (ProductCarouselItem) item : null;
            if (productCarouselItem != null) {
                ((ond0) e0Var).V5(productCarouselItem);
                return;
            }
            return;
        }
        if (e0Var instanceof w4e0) {
            ProductCarouselPromoItem productCarouselPromoItem = item instanceof ProductCarouselPromoItem ? (ProductCarouselPromoItem) item : null;
            if (productCarouselPromoItem != null) {
                ((w4e0) e0Var).V5(productCarouselPromoItem);
                return;
            }
            return;
        }
        if (e0Var instanceof ubf0) {
            return;
        }
        if (!(e0Var instanceof tbf0)) {
            throw new IllegalArgumentException("Unsupported ViewHolder type");
        }
        ShowAllProductCarouselItem showAllProductCarouselItem = item instanceof ShowAllProductCarouselItem ? (ShowAllProductCarouselItem) item : null;
        if (showAllProductCarouselItem != null) {
            tbf0 tbf0Var = (tbf0) e0Var;
            String str = showAllProductCarouselItem.c;
            if (str == null) {
                str = "";
            }
            tbf0Var.o.setText(str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        gtl0 obf0Var;
        h170 h170Var = this.c;
        if (i != 0) {
            if (i == 1) {
                return new w4e0(viewGroup);
            }
            if (i == 2) {
                return new ubf0(viewGroup, null, ((sbf0) h170Var.j.getValue()).c, ((sbf0) h170Var.j.getValue()).d, null);
            }
            if (i != 3) {
                throw new IllegalArgumentException("Unsupported viewType");
            }
            return new tbf0(viewGroup, this.d, (sbf0) h170Var.j.getValue(), false);
        }
        sbf0 a2 = sbf0.a(sbf0.e, RecommendationsItemImageStyle.PORTRAIT);
        ActionButtonStyle actionButtonStyle = ActionButtonStyle.PrimaryWithNoShadow;
        if (h170Var.d()) {
            obf0Var = new pbf0(viewGroup, this.e, actionButtonStyle, a2.b, a2.a, a2.c);
        } else {
            obf0Var = new obf0(viewGroup, this.e, actionButtonStyle, a2.b, a2.a, a2.c, a2.d);
        }
        return new ond0(this.f, obf0Var);
    }
}
