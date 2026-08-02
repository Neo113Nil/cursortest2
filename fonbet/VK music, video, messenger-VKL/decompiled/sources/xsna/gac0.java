package xsna;

import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Poster;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import kotlin.LazyThreadSafetyMode;

/* compiled from: PosterHolder.kt */
/* loaded from: classes4.dex */
public final class gac0 extends qi6<NewsEntry> implements hng0, View.OnClickListener, y4u0, w8i {
    public final Object C;
    public final jac0 D;
    public final eac0 E;
    public float F;
    public boolean G;

    public gac0(ViewGroup viewGroup) {
        super(new FrameLayout(viewGroup.getContext()));
        this.C = msy.a(LazyThreadSafetyMode.NONE, new wf40(this, 13));
        jac0 jac0Var = new jac0(viewGroup.getContext());
        jac0Var.setId(R.id.poster_view);
        this.D = jac0Var;
        eac0 eac0Var = new eac0(this);
        this.E = eac0Var;
        this.F = -1.0f;
        jac0Var.setPlainTextClickListener(this);
        FrameLayout frameLayout = (FrameLayout) this.itemView;
        RecyclerView.p pVar = new RecyclerView.p(-1, -2);
        ((ViewGroup.MarginLayoutParams) pVar).topMargin = e3m.a(R.dimen.newsfeed_single_photo_top_space, viewGroup.getContext());
        frameLayout.setLayoutParams(pVar);
        frameLayout.addView(jac0Var);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        int a = iah0.a(12);
        layoutParams.topMargin = a;
        layoutParams.setMarginEnd(a);
        s3q0 s3q0Var = s3q0.a;
        frameLayout.addView(eac0Var.g, layoutParams);
        frameLayout.addView(eac0Var.f);
        frameLayout.setOnClickListener(this);
    }

    @Override // xsna.hng0
    public final void A1(float f, float f2) {
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        jac0 jac0Var = this.D;
        jac0Var.b.a(jac0Var.getParallaxTranslationX() - f, jac0Var.getParallaxTranslationY() - f2);
    }

    @Override // xsna.y4u0
    public final void B5(boolean z) {
        if (this.G == z) {
            return;
        }
        this.G = z;
        this.E.d();
    }

    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
        Post post;
        Poster poster;
        if (!(newsEntry instanceof Post) || (poster = (post = (Post) newsEntry).M) == null) {
            return;
        }
        Poster.Constants constants = poster.h;
        jac0 jac0Var = this.D;
        jac0Var.setConstants(constants);
        bac0 bac0Var = jac0Var.b;
        jac0Var.setTextColor(poster.e);
        jac0Var.setText(post.s);
        jac0Var.setBackgroundColor(poster.d);
        bac0Var.b.c(poster.f, true);
        bac0Var.c.c(poster.g, true);
        bac0Var.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Owner owner = poster.j;
        String j = owner == null ? "" : wlb0.j(owner);
        eac0 eac0Var = this.E;
        TextView textView = eac0Var.h;
        LinearLayout linearLayout = eac0Var.g;
        textView.setText(j);
        bwt0.p0(linearLayout, !(j == null || j.length() == 0));
        if (poster.i) {
            int i = post.n;
            eac0Var.a = i;
            eac0Var.c(eac0.m.get(i, 0));
            eac0Var.b = epx.f(poster.c, hd60.a().a().y());
            bwt0.p0(linearLayout, false);
            bwt0.p0(eac0Var.f, eac0Var.b());
            int i2 = eac0Var.a;
            SparseBooleanArray sparseBooleanArray = eac0.k;
            if (sparseBooleanArray.indexOfKey(i2) < 0) {
                int i3 = eac0Var.a;
                u4q0 u4q0Var = zik0.a;
                sparseBooleanArray.put(i3, true);
            } else if (!sparseBooleanArray.get(eac0Var.a, false)) {
                if (myc0.f(eac0Var.h.getText())) {
                    bwt0.p0(linearLayout, true);
                }
                if (eac0.l.indexOfKey(eac0Var.a) >= 0) {
                    bwt0.p0(linearLayout, false);
                    eac0Var.c(0);
                }
            }
            eac0Var.d();
        }
    }

    @Override // xsna.hng0
    public final void h4(float f, float f2) {
        this.D.b.a(-f, -f2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Poster poster;
        UserId userId;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.poster_author_layout) {
            String str = com.vk.newsfeed.common.util.k.a;
            new b.d("poster_feed_author_click").e();
            NewsEntry q6 = q6();
            Post post = q6 instanceof Post ? (Post) q6 : null;
            if (post == null || (poster = post.M) == null || (userId = poster.c) == null) {
                return;
            }
            gd60.Z0(hd60.a(), view.getContext(), userId, null, null, 12);
            return;
        }
        eac0 eac0Var = this.E;
        int i = eac0Var.c;
        if (i == 0) {
            eac0Var.a(true);
            eac0Var.c(2);
        } else if (i == 1) {
            eac0Var.f.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).scaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).scaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L).start();
            eac0Var.a(true);
            eac0Var.c(2);
        } else {
            if (i != 2) {
                return;
            }
            eac0Var.a(false);
            eac0Var.c(0);
        }
    }

    @Override // xsna.y4u0
    public final void onDestroy() {
        this.E.getClass();
        eac0.k.clear();
        eac0.l.clear();
    }
}
