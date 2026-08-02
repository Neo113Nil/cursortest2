package xsna;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: PosterButtonsHelper.kt */
/* loaded from: classes4.dex */
public final class eac0 {
    public static boolean j;
    public static final SparseBooleanArray k = new SparseBooleanArray();
    public static final SparseBooleanArray l = new SparseBooleanArray();
    public static final SparseIntArray m = new SparseIntArray();
    public static final int[] n;
    public int a;
    public boolean b;
    public int c;
    public final OvershootInterpolator d = new OvershootInterpolator();
    public final DecelerateInterpolator e = new DecelerateInterpolator();
    public final AppCompatTextView f;
    public final LinearLayout g;
    public final TextView h;
    public final bpn0 i;

    /* compiled from: PosterButtonsHelper.kt */
    public static final class a {
    }

    static {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        e3m.a aVar = e3m.a;
        int color = context.getColor(R.color.vk_black_alpha35);
        Context context2 = e43.a;
        n = new int[]{color, (context2 != null ? context2 : null).getColor(R.color.vk_black_alpha35)};
    }

    public eac0(gac0 gac0Var) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(gac0Var.itemView.getContext());
        q1i0 q1i0Var = new q1i0(appCompatTextView.getContext(), R.drawable.vk_bg_tip_tail_bottom_center, R.drawable.vk_bg_tip_tail_top_center);
        q1i0Var.b(48);
        q1i0Var.j = false;
        appCompatTextView.setBackground(q1i0Var);
        appCompatTextView.setGravity(17);
        bwt0.p0(appCompatTextView, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.topMargin = iah0.a(8);
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setMaxWidth(an10.b(iah0.f().widthPixels * 0.6f));
        int a2 = iah0.a(20);
        appCompatTextView.setPadding(a2, iah0.a(16), a2, iah0.a(24));
        Context context = appCompatTextView.getContext();
        e3m.a aVar = e3m.a;
        appCompatTextView.setTextColor(context.getColor(R.color.vk_gray_800));
        appCompatTextView.setTextSize(1, 14.0f);
        this.f = appCompatTextView;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(gac0Var.itemView.getContext()).inflate(R.layout.holder_poster_author, (ViewGroup) null);
        this.g = linearLayout;
        TextView textView = (TextView) linearLayout.findViewById(R.id.poster_author_text);
        this.h = textView;
        int b2 = an10.b(iah0.f().widthPixels * 0.5f);
        textView.setMaxWidth((b2 - linearLayout.getPaddingLeft()) - linearLayout.getPaddingRight());
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(b2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = linearLayout.getMeasuredHeight();
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, n);
        gradientDrawable.setCornerRadius(measuredHeight * 0.5f);
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setOnClickListener(gac0Var);
        this.i = new bpn0(new dac0(this, 0));
    }

    public final void a(boolean z) {
        if (this.a == 0) {
            return;
        }
        TimeInterpolator timeInterpolator = z ? this.d : this.e;
        long j2 = z ? 400L : 200L;
        if (myc0.f(this.h.getText())) {
            float f = z ? 0.0f : 1.0f;
            float f2 = z ? 1.0f : 0.0f;
            LinearLayout linearLayout = this.g;
            linearLayout.setScaleX(f);
            linearLayout.setScaleY(f);
            bwt0.p0(linearLayout, true);
            linearLayout.animate().scaleX(f2).scaleY(f2).setDuration(j2).setInterpolator(timeInterpolator).setListener((b) this.i.getValue()).start();
        }
    }

    public final boolean b() {
        return (!pla.e().b().a(HintId.INFO_BUBBLE_POSTER_ACTIONS.getId()) || j || this.b) ? false : true;
    }

    public final void c(int i) {
        this.c = i;
        m.put(this.a, i);
    }

    public final void d() {
        if (b()) {
            c(1);
            j = true;
            Hint b2 = pla.e().b().b(HintId.INFO_BUBBLE_POSTER_ACTIONS.getId());
            if (b2 == null) {
                return;
            }
            String str = b2.c;
            AppCompatTextView appCompatTextView = this.f;
            appCompatTextView.setText(str);
            appCompatTextView.setAlpha(1.0f);
            appCompatTextView.setScaleX(1.0f);
            appCompatTextView.setScaleY(1.0f);
            bwt0.p0(appCompatTextView, true);
        }
    }

    /* compiled from: PosterButtonsHelper.kt */
    public static final class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            boolean z = eac0.j;
            int i = eac0.this.a;
            SparseBooleanArray sparseBooleanArray = eac0.k;
            u4q0 u4q0Var = zik0.a;
            sparseBooleanArray.put(i, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
