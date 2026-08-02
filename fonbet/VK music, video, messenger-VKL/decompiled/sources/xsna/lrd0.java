package xsna;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.ecomm.market.good.ui.holder.properties.ProductPropertyType;
import com.vk.imageloader.view.VKImageView;
import com.vk.lists.ListDataSet;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: ProductPropertyVariantsAdapter.kt */
/* loaded from: classes18.dex */
public final class lrd0 extends zoj0<krd0, vif0<krd0>> {
    public final ProductPropertyType e;
    public final ja80 f;
    public krd0 g;

    /* compiled from: ProductPropertyVariantsAdapter.kt */
    public final class a extends c {
        public final ImageView p;
        public final ImageView q;

        public a(lrd0 lrd0Var, ViewGroup viewGroup, lrd0 lrd0Var2) {
            super(viewGroup, R.layout.item_property_variant_color, lrd0Var2);
            ImageView imageView = (ImageView) this.itemView.findViewById(R.id.color);
            this.p = imageView;
            this.q = imageView;
        }

        @Override // xsna.vif0
        public final void i6(krd0 krd0Var) {
            int color;
            krd0 krd0Var2 = krd0Var;
            super.s6(krd0Var2);
            String str = krd0Var2.c;
            ImageView imageView = this.p;
            imageView.setContentDescription(str);
            String str2 = krd0Var2.d;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            float f = 24;
            shapeDrawable.setIntrinsicHeight(iah0.a(f));
            shapeDrawable.setIntrinsicWidth(iah0.a(f));
            Paint paint = shapeDrawable.getPaint();
            try {
                color = Color.parseColor(str2);
            } catch (Exception unused) {
                Context context = imageView.getContext();
                e3m.a aVar = e3m.a;
                color = context.getColor(R.color.vk_white);
            }
            paint.setColor(color);
            imageView.setImageDrawable(shapeDrawable);
        }

        @Override // xsna.lrd0.c
        public final View q6() {
            return this.q;
        }
    }

    /* compiled from: ProductPropertyVariantsAdapter.kt */
    public final class b extends c {
        public final VKImageView p;
        public final t0w0 q;
        public final t0w0 r;
        public final VKImageView s;

        public b(lrd0 lrd0Var, ViewGroup viewGroup, lrd0 lrd0Var2) {
            super(viewGroup, R.layout.item_property_variant_image, lrd0Var2);
            VKImageView vKImageView = (VKImageView) this.itemView;
            this.p = vKImageView;
            this.q = new t0w0(4, iah0.b(10.25f), true, false);
            this.r = new t0w0(4, iah0.b(10.75f), true, false);
            this.s = vKImageView;
            vKImageView.F0(dhr0.x(R.drawable.vk_icon_picture_outline_24, R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary, this.itemView.getContext()), ImageView.ScaleType.CENTER);
            vKImageView.setClipToOutline(true);
        }

        @Override // xsna.vif0
        public final void i6(krd0 krd0Var) {
            krd0 krd0Var2 = krd0Var;
            super.s6(krd0Var2);
            String str = krd0Var2.c;
            VKImageView vKImageView = this.p;
            vKImageView.setContentDescription(str);
            bwt0.L(vKImageView, krd0Var2.e);
        }

        @Override // xsna.lrd0.c
        public final View q6() {
            return this.s;
        }

        @Override // xsna.lrd0.c
        public final void t6(boolean z) {
            super.t6(z);
            this.p.setOutlineProvider(z ? this.r : this.q);
        }
    }

    /* compiled from: ProductPropertyVariantsAdapter.kt */
    public abstract class c extends vif0<krd0> {
        public final lrd0 n;

        public c(ViewGroup viewGroup, int i, lrd0 lrd0Var) {
            super(viewGroup, i, 0);
            this.n = lrd0Var;
        }

        public abstract View q6();

        public void s6(krd0 krd0Var) {
            boolean z = krd0Var.f;
            krd0 krd0Var2 = lrd0.this.g;
            boolean z2 = false;
            if (krd0Var2 != null && krd0Var.a == krd0Var2.a) {
                z2 = true;
            }
            t6(z2);
            q6().setAlpha(z ? 1.0f : 0.4f);
            jjc.g(q6(), new g86(18, this, krd0Var));
            q6().setClickable(z);
        }

        public void t6(boolean z) {
            this.itemView.setSelected(z);
        }
    }

    /* compiled from: ProductPropertyVariantsAdapter.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductPropertyType.values().length];
            try {
                iArr[ProductPropertyType.TYPE_IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public lrd0(ProductPropertyType productPropertyType, ja80 ja80Var) {
        this.e = productPropertyType;
        this.f = ja80Var;
    }

    public final void K0(krd0 krd0Var) {
        int w = ((ListDataSet) this.c).w(new h2n(new bk30(krd0Var, 22), 1));
        Integer valueOf = Integer.valueOf(w);
        if (w < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            notifyItemChanged(valueOf.intValue());
        }
    }

    public final void L0(krd0 krd0Var) {
        krd0 krd0Var2 = this.g;
        this.g = krd0Var;
        K0(krd0Var2);
        K0(this.g);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((vif0) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return d.$EnumSwitchMapping$0[this.e.ordinal()] == 1 ? new b(this, viewGroup, this) : new a(this, viewGroup, this);
    }
}
