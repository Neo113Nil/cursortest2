package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.common.links.LaunchContext;
import com.vk.dto.discover.carousel.products.BaseProductCarouselItem;
import com.vk.dto.discover.carousel.products.ProductCarousel;
import com.vk.dto.discover.carousel.products.ProductCarouselPromoItem;
import com.vk.dto.discover.carousel.products.ShowAllProductCarouselItem;
import com.vk.dto.discover.carousel.products.SkeletonProductCarouselItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ProductCarouselHolder.kt */
/* loaded from: classes4.dex */
public final class nnd0 extends qi6<ProductCarousel> implements w8i {
    public static final /* synthetic */ int I = 0;
    public final h170 C;
    public final View D;
    public final pa10 E;
    public final Object F;
    public final Object G;
    public final nbf0 H;

    /* compiled from: ProductCarouselHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            String str;
            nnd0 nnd0Var = (nnd0) this.receiver;
            int i = nnd0.I;
            ProductCarousel q6 = nnd0Var.q6();
            if (q6 != null && (str = q6.r) != null) {
                maz.c(xwk.d().e(), nnd0Var.itemView.getContext(), str, LaunchContext.A, null, null, 24);
                hd60.a().m(q6);
            }
            return s3q0.a;
        }
    }

    public nnd0(ViewGroup viewGroup, h170 h170Var) {
        super(R.layout.classified_recommendations, viewGroup);
        this.C = h170Var;
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.classifieds_list);
        this.D = this.itemView.findViewById(R.id.bottom_space);
        this.E = new pa10(new h440(this, 12), (sz00) new bpn0(new m130(this, 29)).getValue());
        i440 i440Var = new i440(this, 24);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.F = msy.a(lazyThreadSafetyMode, i440Var);
        this.G = msy.a(lazyThreadSafetyMode, new zf20(this, 23));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        nbf0 nbf0Var = new nbf0();
        this.H = nbf0Var;
        recyclerView.setItemAnimator(new jxq(nbf0Var));
        recyclerView.setAdapter(R6());
        int a2 = gbg0.a(recyclerView.getResources(), 16.0f);
        recyclerView.setPadding(a2, 0, a2, 0);
        recyclerView.setClipToPadding(false);
        recyclerView.getContext();
        recyclerView.addItemDecoration(new ehk0(cn70.b(12)));
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
    @Override // xsna.qi6
    public final void E6(ProductCarousel productCarousel) {
        ArrayList arrayList;
        Integer num;
        ProductCarousel productCarousel2 = productCarousel;
        if (productCarousel2.e) {
            arrayList = new ArrayList(10);
            for (int i = 0; i < 10; i++) {
                arrayList.add(SkeletonProductCarouselItem.c);
            }
        } else {
            ProductCarouselPromoItem productCarouselPromoItem = productCarousel2.p;
            int intValue = (productCarouselPromoItem == null || (num = productCarouselPromoItem.h) == null) ? -1 : num.intValue();
            if (productCarouselPromoItem == null || intValue < 0 || intValue > productCarousel2.o.size()) {
                arrayList = new ArrayList((Collection) productCarousel2.o);
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll((Collection) productCarousel2.o);
                arrayList2.add(intValue, productCarouselPromoItem);
                arrayList = arrayList2;
            }
            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList, 10));
            int i2 = 0;
            for (Object obj : arrayList) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    e43.t();
                    throw null;
                }
                BaseProductCarouselItem baseProductCarouselItem = (BaseProductCarouselItem) obj;
                baseProductCarouselItem.e(Integer.valueOf(i2));
                arrayList3.add(baseProductCarouselItem);
                i2 = i3;
            }
            arrayList.add(new ShowAllProductCarouselItem(productCarousel2.s));
        }
        R6().submitList(arrayList);
        String str = productCarousel2.u;
        View view = this.D;
        if (str == null && ((Collection) productCarousel2.v).isEmpty() && productCarousel2.t == null) {
            bwt0.c0(gbg0.a(this.itemView.getResources(), 3.0f), view);
            view.setVisibility(0);
        } else {
            bwt0.c0(gbg0.a(this.itemView.getResources(), 16.0f), view);
            view.setVisibility(0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final qnd0 R6() {
        return (qnd0) this.F.getValue();
    }
}
