package xsna;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.feed.tool.view.newsfeed.action_button.DonutProgressView;
import com.vkontakte.android.R;

/* compiled from: VkActionButtonView.kt */
/* loaded from: classes18.dex */
public final class y6u0 extends FrameLayout {
    public final ViewGroup b;
    public final View c;
    public final View d;
    public final DonutProgressView e;
    public final VkText f;
    public final VkImageSimple g;
    public final View h;
    public ValueAnimator i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public a p;
    public tlo0 q;

    /* compiled from: VkActionButtonView.kt */
    public interface a {

        /* compiled from: VkActionButtonView.kt */
        /* renamed from: xsna.y6u0$a$a, reason: collision with other inner class name */
        public static final class C4083a implements a {
            public static final C4083a a = new C4083a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C4083a);
            }

            public final int hashCode() {
                return 1920812784;
            }

            public final String toString() {
                return "Done";
            }
        }

        /* compiled from: VkActionButtonView.kt */
        public static final class b implements a {
            public final float a;

            public b(float f) {
                this.a = f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Float.compare(this.a, ((b) obj).a) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.a);
            }

            public final String toString() {
                return xq.c(')', this.a, new StringBuilder("Progress(progress="));
            }
        }
    }

    public y6u0(Context context) {
        super(context, null, 0);
        abg0 abg0Var = dhr0.t;
        this.j = abg0Var.c(R.attr.vk_ui_background_secondary);
        this.k = abg0Var.c(R.attr.vk_ui_text_primary);
        this.l = abg0Var.c(R.attr.vk_ui_icon_secondary);
        this.m = abg0Var.c(R.attr.vk_ui_background_content);
        this.n = abg0Var.c(R.attr.vk_ui_text_contrast);
        this.o = abg0Var.c(R.attr.vk_ui_icon_contrast);
        LayoutInflater.from(context).inflate(R.layout.pds_action_button, (ViewGroup) this, true);
        this.b = (ViewGroup) findViewById(R.id.attach_full_donut_goal_root);
        this.c = findViewById(R.id.pds_action_button_left);
        this.d = findViewById(R.id.pds_action_button_donut_done_icon);
        this.e = (DonutProgressView) findViewById(R.id.pds_action_button_progress);
        this.f = (VkText) findViewById(R.id.pds_action_button_title);
        this.g = (VkImageSimple) findViewById(R.id.pds_action_button_chevron);
        this.h = findViewById(R.id.pds_action_button_divider);
    }

    private final void setUpLeft(a aVar) {
        f4m.E(this.c, aVar != null);
        f4m.E(this.d, aVar instanceof a.C4083a);
        boolean z = aVar instanceof a.b;
        f4m.E(this.e, z);
        if (z) {
            setUpLeft((a.b) aVar);
        }
    }

    private final void setUpText(tlo0 tlo0Var) {
        boolean z = tlo0Var != null;
        VkText vkText = this.f;
        f4m.E(vkText, z);
        vkText.setText(tlo0Var != null ? tlo0Var.a(getContext()) : null);
    }

    public final void a(long j, Integer num) {
        int intValue = num != null ? num.intValue() : this.j;
        ValueAnimator valueAnimator = this.i;
        int i = this.m;
        if (valueAnimator == null) {
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(intValue));
            ofObject.setDuration(300L);
            ofObject.setInterpolator(new LinearInterpolator());
            ofObject.addUpdateListener(new os6(this, 2));
            this.i = ofObject;
        }
        ValueAnimator valueAnimator2 = this.i;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            valueAnimator2.removeAllListeners();
            valueAnimator2.setIntValues(i, intValue);
            valueAnimator2.setStartDelay(1500 - (SystemClock.elapsedRealtime() - j));
            valueAnimator2.addListener(new b(num));
            valueAnimator2.start();
        }
    }

    @Override // android.view.View
    public final a getLeft() {
        return this.p;
    }

    public final tlo0 getText() {
        return this.q;
    }

    public final void setLeft(a aVar) {
        this.p = aVar;
        setUpLeft(aVar);
    }

    public final void setText(tlo0 tlo0Var) {
        this.q = tlo0Var;
        setUpText(tlo0Var);
    }

    private final void setUpLeft(a.b bVar) {
        this.e.setProgress(bVar.a);
    }

    /* compiled from: VkActionButtonView.kt */
    public static final class b implements Animator.AnimatorListener {
        public final /* synthetic */ Integer c;

        public b(Integer num) {
            this.c = num;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            y6u0 y6u0Var = y6u0.this;
            VkText vkText = y6u0Var.f;
            Integer num = this.c;
            vkText.setTextColor(num == null ? y6u0Var.k : y6u0Var.n);
            y6u0Var.g.setColorFilter(num == null ? y6u0Var.l : y6u0Var.o);
            awt0.v(y6u0Var.h, num != null);
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
