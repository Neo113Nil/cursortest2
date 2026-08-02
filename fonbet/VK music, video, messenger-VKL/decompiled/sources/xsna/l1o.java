package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.core.tool.view.NestedScrollableRecyclerView;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.picture.VkImage;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.o1o;
import xsna.qhv0;

/* compiled from: DonutPostHorizontalGallery.kt */
/* loaded from: classes17.dex */
public final class l1o extends FrameLayout {
    public final NestedScrollableRecyclerView b;
    public final LinearLayoutManager c;
    public final c d;
    public final androidx.recyclerview.widget.g0 e;
    public final o1o f;
    public final VkContentBadge g;
    public List<a> h;
    public String i;
    public o1o.a j;
    public izs<? super Integer, s3q0> k;
    public gzs<s3q0> l;
    public float m;

    /* compiled from: DonutPostHorizontalGallery.kt */
    public static final class a {
        public final String a;
        public final uxb b;

        public a(String str, uxb uxbVar) {
            this.a = str;
            this.b = uxbVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return "ImageProvider(baseUrl=" + this.a + ", url=" + this.b + ')';
        }
    }

    /* compiled from: DonutPostHorizontalGallery.kt */
    public static final class b extends RecyclerView.e0 {
        public final gzs<s3q0> l;
        public final VkImage m;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(ViewGroup viewGroup, pvh pvhVar) {
            super(r0);
            VkImage vkImage = new VkImage(viewGroup.getContext(), null, 6, 0);
            vkImage.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.l = pvhVar;
            VkImage vkImage2 = (VkImage) this.itemView;
            this.m = vkImage2;
            vkImage2.setClickable(true);
            vkImage2.setFocusable(true);
            vkImage2.setOnClickListener(new rg0(this, 1));
            vkImage2.setPlaceholderImage(new ColorDrawable(krv0.m(R.attr.vk_ui_image_placeholder, this.itemView.getContext())));
            vkImage2.setVkScaleType(qhv0.e.a);
            vkImage2.setContentDescription(vkImage2.getContext().getString(R.string.donut_horizontal_gallery_image_accessibility));
        }
    }

    /* compiled from: DonutPostHorizontalGallery.kt */
    public static final class c extends androidx.recyclerview.widget.x<a, b> {
        public static final a d = new a();
        public final pvh c;

        /* compiled from: DonutPostHorizontalGallery.kt */
        public static final class a extends m.e<a> {
            @Override // androidx.recyclerview.widget.m.e
            public final boolean areContentsTheSame(a aVar, a aVar2) {
                a aVar3 = aVar2;
                String str = aVar.a;
                return str != null && epx.f(str, aVar3.a);
            }

            @Override // androidx.recyclerview.widget.m.e
            public final boolean areItemsTheSame(a aVar, a aVar2) {
                a aVar3 = aVar2;
                String str = aVar.a;
                return str != null && epx.f(str, aVar3.a);
            }
        }

        public c(pvh pvhVar) {
            super(d);
            this.c = pvhVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            b bVar = (b) e0Var;
            bwt0.S(bVar.m, new aq1(8, getItem(i), bVar));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new b(viewGroup, this.c);
        }
    }

    /* compiled from: DonutPostHorizontalGallery.kt */
    public final class d extends RecyclerView.t {
        public final i4h b;

        public d(i4h i4hVar) {
            this.b = i4hVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            l1o l1oVar = l1o.this;
            androidx.recyclerview.widget.g0 g0Var = l1oVar.e;
            LinearLayoutManager linearLayoutManager = l1oVar.c;
            View findSnapView = g0Var.findSnapView(linearLayoutManager);
            this.b.invoke(Integer.valueOf(findSnapView == null ? -1 : linearLayoutManager.getPosition(findSnapView)));
        }
    }

    public l1o(Context context) {
        super(context, null, 0);
        NestedScrollableRecyclerView nestedScrollableRecyclerView = new NestedScrollableRecyclerView(context, null, 6, 0);
        this.b = nestedScrollableRecyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.c = linearLayoutManager;
        c cVar = new c(new pvh(this, 2));
        this.d = cVar;
        androidx.recyclerview.widget.g0 g0Var = new androidx.recyclerview.widget.g0();
        this.e = g0Var;
        o1o o1oVar = new o1o(context);
        this.f = o1oVar;
        VkContentBadge vkContentBadge = new VkContentBadge(context, null, 6);
        vkContentBadge.setSize(VkContentBadge.Size.Large);
        vkContentBadge.setMode(VkContentBadge.Mode.Primary);
        vkContentBadge.setAppearance(VkContentBadge.Appearance.Design.Overlay);
        vkContentBadge.setCapsule(true);
        this.g = vkContentBadge;
        this.h = EmptyList.b;
        this.k = new vt1(21);
        this.m = 1.0f;
        addView(nestedScrollableRecyclerView, -1, -1);
        addView(o1oVar, -1, -1);
        addView(vkContentBadge, new FrameLayout.LayoutParams(-2, -2, 8388661));
        nestedScrollableRecyclerView.setAdapter(cVar);
        nestedScrollableRecyclerView.setLayoutManager(linearLayoutManager);
        g0Var.attachToRecyclerView(nestedScrollableRecyclerView);
        nestedScrollableRecyclerView.addOnScrollListener(new d(new i4h(this, 14)));
        f4m.t(e3m.a(R.dimen.vk_ui_spacing_size_xl, context), vkContentBadge);
        f4m.r(e3m.a(R.dimen.vk_ui_spacing_size_xl, context), vkContentBadge);
    }

    public final void a(int i) {
        VkContentBadge vkContentBadge = this.g;
        if (i == -1) {
            vkContentBadge.setVisibility(8);
        } else {
            vkContentBadge.setVisibility(0);
            vkContentBadge.setText(getContext().getString(R.string.donut_post_horizontal_gallery_count, Integer.valueOf(i + 1), Integer.valueOf(this.h.size())));
        }
    }

    public final List<a> getImageUrls() {
        return this.h;
    }

    public final gzs<s3q0> getOnItemClick() {
        return this.l;
    }

    public final izs<Integer, s3q0> getOnPageChanged() {
        return this.k;
    }

    public final o1o.a getPlaceholderButton() {
        return this.j;
    }

    public final String getPlaceholderDescription() {
        return this.i;
    }

    public final float getRatio() {
        return this.m;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) ((View.MeasureSpec.getSize(i) / this.m) + 0.5f), 1073741824));
    }

    public final void setCurrentPage(int i) {
        this.b.post(new k1o(this, i, 0));
    }

    public final void setImageUrls(List<a> list) {
        this.h = list;
        this.d.submitList(list);
        this.g.setText(getContext().getString(R.string.donut_post_horizontal_gallery_count, 1, Integer.valueOf(list.size())));
    }

    public final void setOnItemClick(gzs<s3q0> gzsVar) {
        this.l = gzsVar;
    }

    public final void setOnPageChanged(izs<? super Integer, s3q0> izsVar) {
        this.k = izsVar;
    }

    public final void setPlaceholderButton(o1o.a aVar) {
        this.j = aVar;
        this.f.setButton(aVar);
    }

    public final void setPlaceholderDescription(String str) {
        this.i = str;
        this.f.setDescription(str);
    }

    public final void setRatio(float f) {
        this.m = f;
        requestLayout();
    }
}
