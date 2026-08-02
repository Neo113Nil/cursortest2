package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.photo.editor.features.filter.d;
import com.vk.photo.editor.views.shimmer.Shimmer;
import com.vk.photo.editor.views.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: SubFilterViewHolder.kt */
/* loaded from: classes4.dex */
public final class rtm0 extends RecyclerView.e0 {
    public final d.C1460d l;
    public final d.e m;
    public final xcr n;
    public final FrameLayout o;
    public final ImageView p;
    public final View q;
    public final View r;
    public final ShimmerFrameLayout s;
    public final View t;
    public final View u;
    public Integer v;
    public final ArrayList w;

    /* compiled from: SubFilterViewHolder.kt */
    public final class a implements RecyclerView.l.a {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l.a
        public final void a() {
            com.vk.photo.editor.views.shimmer.a aVar;
            ValueAnimator valueAnimator;
            rtm0 rtm0Var = rtm0.this;
            if (rtm0Var.w.contains(this) && (valueAnimator = (aVar = rtm0Var.s.c).e) != null && ((valueAnimator == null || !valueAnimator.isStarted()) && aVar.getCallback() != null)) {
                aVar.e.start();
            }
            rtm0Var.w.remove(this);
        }
    }

    public rtm0(View view, d.C1460d c1460d, d.e eVar, xcr xcrVar) {
        super(view);
        this.l = c1460d;
        this.m = eVar;
        this.n = xcrVar;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.layout_filter_preview_wrapper);
        this.o = frameLayout;
        ImageView imageView = (ImageView) view.findViewById(R.id.image_filter_preview);
        imageView.setClipToOutline(true);
        this.p = imageView;
        this.q = view.findViewById(R.id.loading_state_frame_layout);
        this.r = view.findViewById(R.id.error_frame_layout);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) view.findViewById(R.id.loading_state_frame_layout);
        this.s = shimmerFrameLayout;
        View findViewById = view.findViewById(R.id.retry_button);
        this.t = findViewById;
        this.u = view.findViewById(R.id.selected_stroke_view);
        this.w = new ArrayList();
        view.setZ(-1.0f);
        frameLayout.setOnClickListener(new og(this, 8));
        findViewById.setOnClickListener(new oyt(this, 6));
        Context context = view.getContext();
        Shimmer.b bVar = new Shimmer.b();
        bVar.a.getClass();
        Shimmer.b bVar2 = (Shimmer.b) bVar.c();
        bVar2.a.j = true;
        Shimmer.b bVar3 = (Shimmer.b) bVar2.d();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.editorSkeletonColor, typedValue, true);
        bVar3.e(typedValue.data);
        TypedValue typedValue2 = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.editorSkeletonHighlightColor, typedValue2, true);
        bVar3.a.d = typedValue2.data;
        shimmerFrameLayout.a(bVar3.a());
    }
}
