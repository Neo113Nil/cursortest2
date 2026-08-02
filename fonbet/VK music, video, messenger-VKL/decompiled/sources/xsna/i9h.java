package xsna;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.lifecycle.Lifecycle;
import com.vk.core.tool.view.AspectRatioFrameLayout;
import com.vk.lists.DefaultErrorView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.k9h;

/* compiled from: CommunityLiveVideosItem.kt */
/* loaded from: classes5.dex */
public final class i9h extends we6 {
    public final Context g;
    public final Lifecycle h;
    public final j9h i;
    public final i3b j;
    public final int k = -87;

    /* compiled from: CommunityLiveVideosItem.kt */
    public final class a extends vif0<i9h> {
        public final LinearLayout n;

        public a(LinearLayout linearLayout) {
            super(linearLayout);
            this.n = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }

        @Override // xsna.vif0
        /* renamed from: q6, reason: merged with bridge method [inline-methods] */
        public final void i6(i9h i9hVar) {
            if (epx.f(this.m, i9hVar) || i9hVar == null) {
                return;
            }
            j9h j9hVar = i9hVar.i;
            k9h k9hVar = j9hVar.b;
            k9h k9hVar2 = j9hVar.b;
            k9h.b bVar = k9h.b.a;
            boolean f = epx.f(k9hVar, bVar);
            LinearLayout linearLayout = this.n;
            Integer valueOf = f ? Integer.valueOf(linearLayout.getHeight()) : null;
            linearLayout.removeAllViews();
            if (epx.f(k9hVar2, k9h.a.a)) {
                AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(this.itemView.getContext(), null, 6);
                aspectRatioFrameLayout.setAspectRation(1.7777778f);
                aspectRatioFrameLayout.setBackgroundColor(dhr0.t.c(R.attr.vk_ui_background_content));
                bwt0.d(aspectRatioFrameLayout, iah0.a(20), (r4 & 2) != 0, (r4 & 4) != 0);
                DefaultErrorView defaultErrorView = new DefaultErrorView(this.itemView.getContext());
                defaultErrorView.setRetryClickListener(new h9h(i9hVar, 0));
                aspectRatioFrameLayout.addView(defaultErrorView, -1, -1);
                linearLayout.addView(aspectRatioFrameLayout, -1, -2);
                return;
            }
            if (!epx.f(k9hVar2, bVar)) {
                if (!(k9hVar2 instanceof k9h.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                linearLayout.addView(new g9h(linearLayout.getContext(), i9h.this.h, ((k9h.c) k9hVar2).a.a).e, -1, -2);
                return;
            }
            if (valueOf != null) {
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = valueOf.intValue();
                linearLayout.setLayoutParams(layoutParams);
            }
            ProgressBar progressBar = new ProgressBar(this.itemView.getContext());
            progressBar.setIndeterminate(true);
            progressBar.getIndeterminateDrawable().setColorFilter(e3m.f(R.attr.vk_ui_icon_tertiary, progressBar.getContext()), PorterDuff.Mode.SRC_IN);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 17;
            layoutParams2.weight = 1.0f;
            s3q0 s3q0Var = s3q0.a;
            linearLayout.addView(progressBar, layoutParams2);
        }
    }

    public i9h(Context context, Lifecycle lifecycle, j9h j9hVar, i3b i3bVar) {
        this.g = context;
        this.h = lifecycle;
        this.i = j9hVar;
        this.j = i3bVar;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        a aVar = new a(new LinearLayout(this.g));
        aVar.i6(this);
        return aVar;
    }

    @Override // xsna.we6
    public final int h() {
        return this.k;
    }
}
