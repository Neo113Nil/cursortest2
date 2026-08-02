package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.common.ImageSize;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.List;
import xsna.e3m;

/* compiled from: PosterPreviewAdapter.kt */
/* loaded from: classes4.dex */
public final class wac0 extends zoj0<xac0, RecyclerView.e0> {
    public final Object e;
    public final Object f;
    public boolean g;
    public xac0 i;
    public int h = -1;
    public WeakReference<d> j = new WeakReference<>(null);

    /* compiled from: PosterPreviewAdapter.kt */
    public static final class a extends vif0<xac0> implements View.OnClickListener {
        public final b n;

        public a(ViewGroup viewGroup, b bVar) {
            super(new FrameLayout(viewGroup.getContext()));
            this.n = bVar;
            View inflate = e3m.b(this.itemView.getContext()).inflate(R.layout.item_posting_bottom_panel_button, viewGroup, false);
            View findViewById = inflate.findViewById(R.id.root_layout);
            bwt0.s0(findViewById, 0.96f);
            ((ImageView) inflate.findViewById(R.id.icon_button_panel)).setImageResource(R.drawable.vk_icon_picture_outline_28);
            bwt0.h0(this, findViewById);
            FrameLayout frameLayout = (FrameLayout) this.itemView;
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(d.w, -1));
            float f = 48;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iah0.a(f), iah0.a(f));
            layoutParams.gravity = 17;
            s3q0 s3q0Var = s3q0.a;
            frameLayout.addView(inflate, layoutParams);
        }

        @Override // xsna.vif0
        public final /* bridge */ /* synthetic */ void i6(xac0 xac0Var) {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.n.b();
        }
    }

    /* compiled from: PosterPreviewAdapter.kt */
    public interface b {
        void b();

        void o();
    }

    /* compiled from: PosterPreviewAdapter.kt */
    public static final class c extends vif0<xac0> implements View.OnClickListener {
        public final b n;

        public c(ViewGroup viewGroup, b bVar) {
            super(new FrameLayout(viewGroup.getContext()));
            this.n = bVar;
            ImageView imageView = new ImageView(viewGroup.getContext());
            View view = this.itemView;
            FrameLayout frameLayout = (FrameLayout) view;
            int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.posting_poster_preview_item_image_size);
            imageView.setBackgroundResource(R.drawable.bg_button_close_dark);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setImageResource(R.drawable.vk_icon_cancel_16);
            bwt0.h0(this, imageView);
            imageView.setContentDescription(g6(R.string.accessibility_close_posters));
            int i = d.x;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.gravity = 17;
            s3q0 s3q0Var = s3q0.a;
            frameLayout.addView(imageView, layoutParams);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(d.w, -1));
        }

        @Override // xsna.vif0
        public final /* bridge */ /* synthetic */ void i6(xac0 xac0Var) {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.n.o();
        }
    }

    /* compiled from: PosterPreviewAdapter.kt */
    public static final class d extends vif0<xac0> implements View.OnClickListener {
        public static final int w;
        public static final int x;
        public final fux<xac0> n;
        public final wac0 o;
        public final wac0 p;
        public final FrescoImageView q;
        public final View r;
        public final View s;
        public final FrameLayout t;
        public final pcc u;
        public final BitmapDrawable v;

        static {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            w = context.getResources().getDimensionPixelSize(R.dimen.width_item_poster_big);
            Context context2 = e43.a;
            x = (context2 != null ? context2 : null).getResources().getDimensionPixelSize(R.dimen.image_poster_size_big);
        }

        public d(ViewGroup viewGroup, fux fuxVar, wac0 wac0Var, wac0 wac0Var2) {
            super(new FrameLayout(viewGroup.getContext()));
            this.n = fuxVar;
            this.o = wac0Var;
            this.p = wac0Var2;
            FrescoImageView frescoImageView = new FrescoImageView(viewGroup.getContext(), null, 6, 0);
            this.q = frescoImageView;
            View view = new View(viewGroup.getContext());
            this.r = view;
            View view2 = new View(viewGroup.getContext());
            this.s = view2;
            FrameLayout frameLayout = (FrameLayout) this.itemView;
            this.t = frameLayout;
            pcc pccVar = new pcc(-1);
            pccVar.b.setColor(503316480);
            pccVar.a = iah0.a(1);
            this.u = pccVar;
            Bitmap decodeResource = BitmapFactory.decodeResource(b6(), R.drawable.ic_custom_bg_24);
            Bitmap createBitmap = Bitmap.createBitmap(decodeResource.getWidth(), decodeResource.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            Rect rect = new Rect(0, 0, decodeResource.getWidth(), decodeResource.getHeight());
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-12434878);
            canvas.drawCircle(decodeResource.getWidth() / 2.0f, decodeResource.getHeight() / 2.0f, decodeResource.getWidth() / 2.0f, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(decodeResource, rect, rect, paint);
            this.v = new BitmapDrawable(b6(), createBitmap);
            view.setBackgroundResource(R.drawable.bg_selected_poster_item_big);
            bwt0.p0(view, false);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            bwt0.p0(view2, false);
            Context context = this.itemView.getContext();
            e3m.a aVar = e3m.a;
            view2.setBackgroundColor(context.getColor(R.color.vk_clear));
            int i = x;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.gravity = 17;
            s3q0 s3q0Var = s3q0.a;
            frameLayout.addView(view2, layoutParams);
            frescoImageView.setBackground(pccVar);
            frescoImageView.setIsCircle(true);
            frescoImageView.setScaleType(ScaleType.FIT_CENTER);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i);
            layoutParams2.gravity = 17;
            frameLayout.addView(frescoImageView, layoutParams2);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(w, -1));
            this.itemView.setOnClickListener(this);
            frameLayout.setFocusable(true);
        }

        @Override // xsna.vif0
        public final void i6(xac0 xac0Var) {
            xac0 xac0Var2 = xac0Var;
            if (xac0Var2 == null) {
                return;
            }
            boolean z = xac0Var2.e;
            List<ImageSize> list = xac0Var2.d;
            FrescoImageView frescoImageView = this.q;
            frescoImageView.setIsCircle(z);
            Drawable drawable = this.u;
            if (list == null || list.isEmpty() || z) {
                frescoImageView.setBackground(drawable);
                ((pcc) frescoImageView.getBackground()).setColor(xac0Var2.c);
            } else {
                frescoImageView.setBackground(null);
            }
            frescoImageView.setVisible((list == null || list.isEmpty()) ? false : true);
            frescoImageView.setRemoteImage((List<? extends fxj0>) list);
            List<ImageSize> list2 = list;
            boolean z2 = list2 == null || list2.isEmpty();
            View view = this.s;
            bwt0.p0(view, z2);
            boolean z3 = xac0Var2.a == -2 || fkq0.c(xac0Var2.b);
            if (z3) {
                drawable = this.v;
            }
            view.setBackground(drawable);
            bwt0.p0(this.r, this.o.h == getAdapterPosition());
            FrameLayout frameLayout = this.t;
            frameLayout.setContentDescription(z3 ? frameLayout.getContext().getString(R.string.accessibility_custom_poster) : xac0Var2.f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            xac0 xac0Var;
            if (!this.o.K0(this.m, getAdapterPosition(), this) || (xac0Var = (xac0) this.m) == null) {
                return;
            }
            int adapterPosition = getAdapterPosition();
            this.p.getClass();
            this.n.li(adapterPosition - 1, xac0Var);
        }
    }

    public wac0(fux<? super xac0> fuxVar, b bVar) {
        this.e = fuxVar;
        this.f = bVar;
    }

    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public final boolean K0(xac0 xac0Var, int i, d dVar) {
        if (epx.f(this.i, xac0Var)) {
            return false;
        }
        int i2 = this.h;
        this.i = xac0Var;
        this.h = i;
        d dVar2 = this.j.get();
        if (dVar2 == null || dVar2.getAdapterPosition() != i2) {
            notifyDataSetChanged();
        }
        d dVar3 = this.j.get();
        if (dVar3 != null) {
            bwt0.p0(dVar3.r, false);
        } else {
            notifyItemChanged(i2);
        }
        if (dVar != null) {
            bwt0.p0(dVar.r, true);
        } else {
            notifyItemChanged(i);
        }
        this.j = new WeakReference<>(dVar);
        return true;
    }

    public final void f4(boolean z) {
        if (this.g == z) {
            return;
        }
        this.g = z;
        int i = this.h;
        if (i > 0) {
            if (z) {
                this.h = i + 1;
            } else {
                this.h = i - 1;
            }
        }
        notifyDataSetChanged();
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return super.getItemCount() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return i == 0 ? 2 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        if (i == 0) {
            return;
        }
        d dVar = e0Var instanceof d ? (d) e0Var : null;
        if (dVar != null) {
            dVar.V5(this.c.c(i - 1));
            if (i == 1 && this.j.get() == null) {
                this.j = new WeakReference<>(e0Var);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, xsna.fux] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, xsna.wac0$b] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ?? r1 = this.f;
        return i != 1 ? i != 2 ? new d(viewGroup, this.e, this, this) : new a(viewGroup, r1) : new c(viewGroup, r1);
    }
}
