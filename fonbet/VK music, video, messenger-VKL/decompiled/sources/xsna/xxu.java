package xsna;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.ListDataSet;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.impl.posting.avatar.PostingAvatarViewContainer;
import com.vk.sharing.api.dto.Target;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: HeaderPostingView.kt */
/* loaded from: classes4.dex */
public final class xxu implements txu, View.OnClickListener {
    public static final int x;
    public sxu b;
    public float c;
    public float d;
    public ViewPropertyAnimator f;
    public ViewPropertyAnimator g;
    public cdc0 h;
    public View i;
    public View j;
    public View k;
    public TextView l;
    public TextView m;
    public PostingAvatarViewContainer n;
    public ImageView o;
    public RecyclerPaginatedView p;
    public AppCompatImageView q;
    public TextView r;
    public int e = iah0.a(56);
    public boolean s = true;
    public final bpn0 t = new bpn0(new myh(this, 22));
    public final bpn0 u = new bpn0(new flu(this, 2));
    public final bpn0 v = new bpn0(new pr1(24));
    public final bpn0 w = new bpn0(new i9(26));

    static {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        x = context.getResources().getInteger(R.integer.config_shortAnimTime);
    }

    @Override // xsna.txu
    public final void Ed() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator rotation;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator listener;
        ViewPropertyAnimator translationYBy;
        View view = this.k;
        ViewPropertyAnimator viewPropertyAnimator = null;
        ViewPropertyAnimator withLayer = (view == null || (animate2 = view.animate()) == null || (duration2 = animate2.setDuration(250L)) == null || (interpolator = duration2.setInterpolator((DecelerateInterpolator) this.w.getValue())) == null || (listener = interpolator.setListener((a) this.u.getValue())) == null || (translationYBy = listener.translationYBy(-((this.c + this.d) + ((float) this.e)))) == null) ? null : translationYBy.withLayer();
        this.f = withLayer;
        if (withLayer != null) {
            withLayer.start();
        }
        ImageView imageView = this.o;
        if (imageView != null) {
            imageView.setRotation(180.0f);
        }
        ImageView imageView2 = this.o;
        if (imageView2 != null && (animate = imageView2.animate()) != null && (duration = animate.setDuration(250L)) != null && (rotation = duration.rotation(360.0f)) != null) {
            viewPropertyAnimator = rotation.withLayer();
        }
        this.g = viewPropertyAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.start();
        }
        View view2 = this.i;
        if (view2 != null) {
            float f = 16;
            bwt0.f0(view2, iah0.a(f), 0, iah0.a(f), 0, 10);
        }
    }

    @Override // xsna.txu
    public final void H6() {
        RecyclerPaginatedView recyclerPaginatedView = this.p;
        if (recyclerPaginatedView != null) {
            recyclerPaginatedView.Fe();
        }
    }

    @Override // xsna.txu
    public final void P8() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator rotation;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator listener;
        ViewPropertyAnimator translationYBy;
        View view = this.k;
        if (view != null) {
            view.setY(-this.c);
        }
        View view2 = this.k;
        ViewPropertyAnimator viewPropertyAnimator = null;
        ViewPropertyAnimator withLayer = (view2 == null || (animate2 = view2.animate()) == null || (duration2 = animate2.setDuration(250L)) == null || (interpolator = duration2.setInterpolator((DecelerateInterpolator) this.v.getValue())) == null || (listener = interpolator.setListener((b) this.t.getValue())) == null || (translationYBy = listener.translationYBy(this.c + ((float) this.e))) == null) ? null : translationYBy.withLayer();
        this.f = withLayer;
        if (withLayer != null) {
            withLayer.start();
        }
        ImageView imageView = this.o;
        if (imageView != null) {
            imageView.setRotation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        ImageView imageView2 = this.o;
        if (imageView2 != null && (animate = imageView2.animate()) != null && (duration = animate.setDuration(250L)) != null && (rotation = duration.rotation(180.0f)) != null) {
            viewPropertyAnimator = rotation.withLayer();
        }
        this.g = viewPropertyAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.start();
        }
        View view3 = this.i;
        if (view3 != null) {
            bwt0.f0(view3, 0, 0, 0, 0, 10);
        }
    }

    @Override // xsna.txu
    public final void Ph(boolean z, boolean z2) {
        AppCompatImageView appCompatImageView = this.q;
        if (appCompatImageView != null && !appCompatImageView.isEnabled() && z && z2) {
            AppCompatImageView appCompatImageView2 = this.q;
            if (appCompatImageView2 != null) {
                appCompatImageView2.setPressed(true);
            }
            AppCompatImageView appCompatImageView3 = this.q;
            if (appCompatImageView3 != null) {
                appCompatImageView3.postDelayed(new o93(this, 18), 250L);
            }
        }
        AppCompatImageView appCompatImageView4 = this.q;
        if (appCompatImageView4 != null) {
            appCompatImageView4.setEnabled(z);
        }
        AppCompatImageView appCompatImageView5 = this.q;
        if (appCompatImageView5 != null) {
            omw.b(appCompatImageView5, z ? com.vkontakte.android.R.attr.vk_ui_background_accent : com.vkontakte.android.R.attr.vk_ui_icon_secondary);
        }
    }

    @Override // xsna.txu
    public final List<Target> Q2() {
        List<Target> y0;
        cdc0 cdc0Var = this.h;
        return (cdc0Var == null || (y0 = cdc0Var.y0()) == null) ? EmptyList.b : y0;
    }

    @Override // xsna.txu
    public final boolean Rd() {
        return this.s;
    }

    @Override // xsna.txu
    public final void Tc(boolean z, boolean z2) {
        if (z2) {
            j6r0.d(this.j, z ? 0 : 8, true, x, null);
            return;
        }
        View view = this.j;
        if (view != null) {
            bwt0.p0(view, z);
        }
    }

    @Override // xsna.txu
    public final void ak() {
        String e = y8g0.e(com.vkontakte.android.R.string.newsfeed_newpost_post_editing);
        TextView textView = this.m;
        if (textView != null) {
            textView.setText(e);
        }
        TextView textView2 = this.l;
        ViewGroup.LayoutParams layoutParams = textView2 != null ? textView2.getLayoutParams() : null;
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (e == null || e.length() == 0) {
            TextView textView3 = this.m;
            if (textView3 != null) {
                bwt0.p0(textView3, false);
            }
            if (layoutParams2 != null) {
                layoutParams2.gravity = 17;
            }
            TextView textView4 = this.l;
            if (textView4 != null) {
                f4m.q(0, textView4);
                return;
            }
            return;
        }
        if (layoutParams2 != null) {
            layoutParams2.gravity = 80;
        }
        TextView textView5 = this.l;
        if (textView5 != null) {
            f4m.q(this.e / 2, textView5);
        }
        TextView textView6 = this.m;
        if (textView6 != null) {
            bwt0.p0(textView6, true);
        }
        AppCompatImageView appCompatImageView = this.q;
        if (appCompatImageView != null) {
            appCompatImageView.setEnabled(true);
        }
    }

    @Override // xsna.txu
    public final void ce(Target target, boolean z) {
        int indexOf;
        cdc0 cdc0Var = this.h;
        if (cdc0Var != null && (indexOf = ((ListDataSet) cdc0Var.c).d.indexOf(target)) != -1) {
            int i = cdc0Var.f;
            cdc0Var.f = indexOf;
            cdc0Var.notifyItemChanged(i);
            cdc0Var.notifyItemChanged(cdc0Var.f);
        }
        PostingAvatarViewContainer postingAvatarViewContainer = this.n;
        if (postingAvatarViewContainer != null) {
            postingAvatarViewContainer.q(target, dhr0.w(com.vkontakte.android.R.drawable.user_placeholder, postingAvatarViewContainer.getContext()));
        }
        TextView textView = this.l;
        if (textView != null) {
            textView.setText(target.d);
        }
        TextView textView2 = this.l;
        ViewGroup.LayoutParams layoutParams = textView2 != null ? textView2.getLayoutParams() : null;
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.weight = 1.0f;
        }
        if (layoutParams2 != null) {
            layoutParams2.width = -2;
        }
        TextView textView3 = this.l;
        if (textView3 == null || layoutParams2 == null) {
            return;
        }
        textView3.setLayoutParams(layoutParams2);
    }

    @Override // xsna.jk6
    public final void d3(View view) {
        Resources resources;
        Resources resources2;
        Context context = view.getContext();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.c = (context == null || (resources2 = context.getResources()) == null) ? 0.0f : resources2.getDimension(com.vkontakte.android.R.dimen.newsfeed_newpost_authors_layout_height);
        Context context2 = view.getContext();
        if (context2 != null && (resources = context2.getResources()) != null) {
            f = resources.getDimension(com.vkontakte.android.R.dimen.newsfeed_newpost_authors_layout_elevation);
        }
        this.d = f;
        Context context3 = view.getContext();
        this.e = context3 != null ? e3m.d(R.attr.actionBarSize, context3) : iah0.a(56);
        this.h = new cdc0(this.b);
        View findViewById = view.findViewById(com.vkontakte.android.R.id.posting_sender_layout);
        this.j = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        this.k = view.findViewById(com.vkontakte.android.R.id.posting_author_layout);
        this.l = (TextView) view.findViewById(com.vkontakte.android.R.id.posting_user_name_text);
        this.m = (TextView) view.findViewById(com.vkontakte.android.R.id.posting_subtitle_text);
        this.n = (PostingAvatarViewContainer) view.findViewById(com.vkontakte.android.R.id.posting_avatar_image);
        this.o = (ImageView) view.findViewById(com.vkontakte.android.R.id.posting_author_arrow);
        this.p = (RecyclerPaginatedView) view.findViewById(com.vkontakte.android.R.id.posting_author_recycler_paginated_view);
        this.r = (TextView) view.findViewById(com.vkontakte.android.R.id.posting_header_title_text);
        this.i = view.findViewById(com.vkontakte.android.R.id.top_divider);
        View findViewById2 = view.findViewById(com.vkontakte.android.R.id.posting_close_button);
        if (findViewById2 != null) {
            bwt0.h0(this, findViewById2);
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(com.vkontakte.android.R.id.posting_done_button);
        this.q = appCompatImageView;
        if (appCompatImageView != null) {
            bwt0.h0(this, appCompatImageView);
        }
        RecyclerPaginatedView recyclerPaginatedView = this.p;
        if (recyclerPaginatedView != null) {
            AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, recyclerPaginatedView);
            dVar.f = 0;
            dVar.a();
            recyclerPaginatedView.setAdapter(this.h);
            recyclerPaginatedView.setSwipeRefreshEnabled(false);
            RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
            int a2 = iah0.a(4.0f);
            recyclerView.addItemDecoration(new v98(0, a2, a2, true));
        }
        sxu sxuVar = this.b;
        if (sxuVar != null) {
            sxuVar.onStart();
        }
    }

    @Override // xsna.txu
    public final void ed(boolean z, boolean z2) {
        if (z2) {
            j6r0.d(this.r, z ? 0 : 8, true, x, null);
            return;
        }
        TextView textView = this.r;
        if (textView != null) {
            bwt0.p0(textView, z);
        }
    }

    @Override // xsna.txu
    public final RecyclerPaginatedView hi() {
        return this.p;
    }

    @Override // xsna.txu
    public final void nj(Target target) {
        cdc0 cdc0Var = this.h;
        if (cdc0Var != null) {
            cdc0Var.x0(target);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        sxu sxuVar;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.vkontakte.android.R.id.posting_sender_layout) {
            sxu sxuVar2 = this.b;
            if (sxuVar2 != null) {
                sxuVar2.g();
                return;
            }
            return;
        }
        if (valueOf != null && valueOf.intValue() == com.vkontakte.android.R.id.posting_close_button) {
            sxu sxuVar3 = this.b;
            if (sxuVar3 != null) {
                sxuVar3.o();
                return;
            }
            return;
        }
        if (valueOf == null || valueOf.intValue() != com.vkontakte.android.R.id.posting_done_button || (sxuVar = this.b) == null) {
            return;
        }
        sxuVar.G();
    }

    @Override // xsna.jk6
    public final void onDestroyView() {
        sxu sxuVar = this.b;
        if (sxuVar != null) {
            sxuVar.onStop();
        }
        this.q = null;
        this.o = null;
        this.j = null;
        this.k = null;
        this.n = null;
        this.l = null;
        this.p = null;
        this.r = null;
        this.i = null;
    }

    @Override // xsna.dc6
    public final void setPresenter(cc6 cc6Var) {
        this.b = (sxu) cc6Var;
    }

    @Override // xsna.txu
    public final void x7() {
        ViewPropertyAnimator viewPropertyAnimator = this.f;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.g;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        View view = this.k;
        if (view != null) {
            view.setY(-this.c);
        }
        ImageView imageView = this.o;
        if (imageView != null) {
            imageView.setRotation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    @Override // xsna.txu
    public final void xg() {
        ImageView imageView = this.o;
        if (imageView != null) {
            bwt0.p0(imageView, false);
        }
        View view = this.j;
        if (view != null) {
            view.setClickable(false);
        }
    }

    /* compiled from: HeaderPostingView.kt */
    public static final class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            xxu xxuVar = xxu.this;
            View view = xxuVar.k;
            if (view != null) {
                bwt0.p0(view, false);
            }
            xxuVar.s = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            xxu xxuVar = xxu.this;
            View view = xxuVar.k;
            if (view != null) {
                bwt0.p0(view, false);
            }
            xxuVar.s = true;
            sxu sxuVar = xxuVar.b;
            if (sxuVar != null) {
                sxuVar.x6();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            xxu.this.s = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }
    }

    /* compiled from: HeaderPostingView.kt */
    public static final class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            xxu.this.s = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            xxu xxuVar = xxu.this;
            xxuVar.s = true;
            View view = xxuVar.k;
            if (view != null) {
                view.post(new b04(xxuVar, 5));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            xxu xxuVar = xxu.this;
            View view = xxuVar.k;
            if (view != null) {
                bwt0.p0(view, true);
            }
            xxuVar.s = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }
    }

    @Override // xsna.txu
    public final void Vb(boolean z) {
    }

    @Override // xsna.txu
    public final void S5(boolean z, boolean z2) {
    }
}
