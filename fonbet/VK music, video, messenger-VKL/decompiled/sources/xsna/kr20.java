package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.unity3d.services.UnityAdsConstants;
import com.vk.imageloader.view.VKImageView;
import com.vk.superapp.ui.shimmer.Shimmer;
import com.vk.superapp.ui.shimmer.ShimmerFrameLayout;
import com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.random.Random;
import kotlin.random.XorWowRandom;
import xsna.lr20;

/* compiled from: MiniWidgetSettingsAdapter.kt */
/* loaded from: classes6.dex */
public final class kr20 extends RecyclerView.Adapter<b> {
    public final c2u c;
    public final ArrayList d = new ArrayList();

    /* compiled from: MiniWidgetSettingsAdapter.kt */
    public static final class a extends m.b {
        public final List<lr20> b;
        public final List<lr20> c;

        public a(ArrayList arrayList, List list) {
            this.b = arrayList;
            this.c = list;
        }

        @Override // androidx.recyclerview.widget.m.b
        public final boolean areContentsTheSame(int i, int i2) {
            return epx.f(this.b.get(i), this.c.get(i2));
        }

        @Override // androidx.recyclerview.widget.m.b
        public final boolean areItemsTheSame(int i, int i2) {
            lr20 lr20Var = this.b.get(i);
            lr20 lr20Var2 = this.c.get(i2);
            return ((lr20Var instanceof lr20.a) && (lr20Var2 instanceof lr20.a)) ? epx.f(((lr20.a) lr20Var).b, ((lr20.a) lr20Var2).b) : ((lr20Var instanceof lr20.c) && (lr20Var2 instanceof lr20.c)) ? epx.f(((lr20.c) lr20Var).b, ((lr20.c) lr20Var2).b) : epx.f(lr20Var, lr20Var2);
        }

        @Override // androidx.recyclerview.widget.m.b
        public final int getNewListSize() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.m.b
        public final int getOldListSize() {
            return this.b.size();
        }
    }

    /* compiled from: MiniWidgetSettingsAdapter.kt */
    public static abstract class b extends hf6<lr20> {
    }

    /* compiled from: MiniWidgetSettingsAdapter.kt */
    public static final class c extends b {
        public final izs<String, s3q0> m;
        public final TextView n;
        public final VKImageView o;
        public final VKImageView p;
        public final View q;
        public final View r;
        public final View s;
        public final View t;
        public final ImageView u;
        public final RotateAnimation v;

        public c(View view, c2u c2uVar) {
            super(view);
            this.m = c2uVar;
            this.n = (TextView) view.findViewById(R.id.title_text_view);
            this.o = (VKImageView) view.findViewById(R.id.top_icon_view);
            this.p = (VKImageView) view.findViewById(R.id.bottom_icon_view);
            View findViewById = view.findViewById(R.id.background_view);
            this.q = findViewById;
            View findViewById2 = view.findViewById(R.id.disabled_view);
            this.r = findViewById2;
            this.s = view.findViewById(R.id.stub1_view);
            this.t = view.findViewById(R.id.stub2_view);
            this.u = (ImageView) view.findViewById(R.id.disabled_image_view);
            findViewById.setOutlineProvider(new t0w0(6, cn70.a() * 16.0f, false, false));
            findViewById.setClipToOutline(true);
            XorWowRandom b = qz9.b(System.currentTimeMillis());
            float h = ((float) b.h(1.3d, 1.7d)) * ((Number) j5g.w0(e43.l(Float.valueOf(-1.0f), Float.valueOf(1.0f)), Random.b)).floatValue();
            RotateAnimation rotateAnimation = new RotateAnimation(-h, h, 1, (float) b.h(0.4d, 0.6d), 1, (float) b.h(0.4d, 0.6d));
            rotateAnimation.setDuration(b.o(145L, 155L));
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setRepeatMode(2);
            this.v = rotateAnimation;
            jjc.g(findViewById2, new wik(this, 23));
        }

        @Override // xsna.hf6
        public final void W5(lr20 lr20Var) {
            lr20 lr20Var2 = lr20Var;
            if (lr20Var2 instanceof lr20.a) {
                lr20.a aVar = (lr20.a) lr20Var2;
                String str = aVar.d;
                String str2 = aVar.c;
                boolean z = aVar.g;
                TextView textView = this.n;
                textView.setText(str2);
                View view = this.itemView;
                boolean z2 = getAbsoluteAdapterPosition() > 4;
                StringBuilder sb = new StringBuilder();
                sb.append(this.itemView.getContext().getString(R.string.vk_mini_widget_content_description, str2));
                if (z2) {
                    sb.append(this.itemView.getContext().getString(R.string.vk_mini_widget_additional_content_description));
                }
                boolean z3 = !z;
                if (z3) {
                    sb.append(this.itemView.getContext().getString(R.string.vk_mini_widget_disabled));
                }
                view.setContentDescription(sb.toString());
                boolean z4 = aVar.f == MiniWidgetItem.HeaderIconAlign.TOP;
                VKImageView vKImageView = this.o;
                awt0.v(vKImageView, z4);
                VKImageView vKImageView2 = this.p;
                awt0.v(vKImageView2, !z4);
                if (z4) {
                    vKImageView.setDontLoadAgainIfSameResource(true);
                    vKImageView.setPlaceholderImage(R.drawable.vk_superapp_icon_tint_top);
                    vKImageView.load(str);
                } else {
                    vKImageView2.setDontLoadAgainIfSameResource(true);
                    vKImageView2.setPlaceholderImage(R.drawable.vk_superapp_icon_tint_bottom);
                    vKImageView2.load(str);
                }
                awt0.u(this.s, z);
                awt0.u(this.t, z);
                awt0.v(this.r, z3);
                awt0.u(this.u, z3);
                if (!lr20Var2.a && this.itemView.getAnimation() == null) {
                    this.itemView.setAnimation(this.v);
                } else if (lr20Var2.a) {
                    this.itemView.setAnimation(null);
                }
                boolean z5 = lr20Var2.a;
                float f = z5 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f;
                float f2 = z5 ? 1.1f : 1.0f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, textView.getAlpha(), f);
                View view2 = this.itemView;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_X, view2.getScaleX(), f2);
                View view3 = this.itemView;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.SCALE_Y, view3.getScaleY(), f2);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
                animatorSet.start();
            }
        }
    }

    /* compiled from: MiniWidgetSettingsAdapter.kt */
    public static final class d extends b {
        public final ShimmerFrameLayout m;
        public final View n;

        public d(View view) {
            super(view);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) view.findViewById(R.id.shimmer_layout);
            this.m = shimmerFrameLayout;
            this.n = view.findViewById(R.id.shimmer_container);
            Shimmer.c cVar = new Shimmer.c();
            cVar.k(e3m.f(R.attr.vk_ui_skeleton_to, this.itemView.getContext()));
            cVar.a.d = e3m.f(R.attr.vk_ui_skeleton_to, this.itemView.getContext());
            shimmerFrameLayout.b(cVar.d(1.0f).a());
        }

        @Override // xsna.hf6
        public final void W5(lr20 lr20Var) {
            t0w0 t0w0Var = new t0w0(6, cn70.a() * 16.0f, false, false);
            View view = this.n;
            view.setOutlineProvider(t0w0Var);
            view.setClipToOutline(true);
            ShimmerFrameLayout shimmerFrameLayout = this.m;
            shimmerFrameLayout.d = true;
            shimmerFrameLayout.c();
        }
    }

    /* compiled from: MiniWidgetSettingsAdapter.kt */
    public static final class e extends b {
        public final TextView m;

        public e(View view) {
            super(view);
            this.m = (TextView) view.findViewById(R.id.title_text_view);
        }

        @Override // xsna.hf6
        public final void W5(lr20 lr20Var) {
            lr20 lr20Var2 = lr20Var;
            if (lr20Var2 instanceof lr20.c) {
                lr20.c cVar = (lr20.c) lr20Var2;
                String str = cVar.b;
                TextView textView = this.m;
                textView.setTextAppearance(R.style.VkUiTypography_Subhead);
                textView.setText(str);
                textView.setContentDescription(brm0.y(str, "\n", " "));
                textView.setEnabled(cVar.c);
            }
        }
    }

    public kr20(c2u c2uVar) {
        this.c = c2uVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((lr20) this.d.get(i)).b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(b bVar, int i) {
        b bVar2 = bVar;
        lr20 lr20Var = (lr20) j5g.b0(i, this.d);
        if (lr20Var == null) {
            return;
        }
        bVar2.V5(lr20Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final b onCreateViewHolder(ViewGroup viewGroup, int i) {
        View b2 = tf3.b(viewGroup, i, viewGroup, false);
        if (i == R.layout.mini_widget_shimmer_view_holder) {
            return new d(b2);
        }
        if (i == R.layout.mini_widget_title_view_holder) {
            return new e(b2);
        }
        if (i == R.layout.mini_widget_item_view_holder) {
            return new c(b2, this.c);
        }
        throw new IllegalStateException("Unsupported type");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(b bVar) {
        b bVar2 = bVar;
        if (bVar2 instanceof c) {
            c cVar = (c) bVar2;
            Object obj = cVar.l;
            if (obj == null) {
                obj = null;
            }
            if (((lr20) obj).a) {
                return;
            }
            cVar.itemView.setAnimation(cVar.v);
        }
    }

    public final void x0(int i) {
        ArrayList arrayList = this.d;
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            ((lr20) next).a = i != -1 && i2 == i;
            i2 = i3;
        }
        notifyItemRangeChanged(0, arrayList.size());
    }
}
