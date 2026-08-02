package xsna;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.story.viewer.impl.presentation.stories.view.reactions.OnboardingType;
import kotlin.LazyThreadSafetyMode;

/* compiled from: OnboardingDelegate.kt */
/* loaded from: classes6.dex */
public final class jd80 {
    public final nzl0 a;
    public final View b;
    public final gzs<StoryEntry> c;
    public etv0 d;
    public boolean f;
    public final w4u0 k;
    public gzs<s3q0> e = new mg(20);
    public final Object g = msy.a(LazyThreadSafetyMode.NONE, new x550(this, 8));
    public final Handler h = new Handler(Looper.getMainLooper());
    public final jk9 i = new jk9(this, 6);
    public final a j = new a();

    /* compiled from: OnboardingDelegate.kt */
    public static final class a implements m8m0 {
        public a() {
        }

        @Override // xsna.m8m0
        public final void a() {
            jd80 jd80Var = jd80.this;
            jd80Var.h.postDelayed(jd80Var.i, 200L);
        }

        @Override // xsna.m8m0
        public final void b() {
            jd80 jd80Var = jd80.this;
            jd80Var.f = false;
            jd80Var.h.removeCallbacksAndMessages(null);
        }

        @Override // xsna.m8m0
        public final void c() {
            jd80 jd80Var = jd80.this;
            jd80Var.k.i = false;
            etv0 etv0Var = jd80Var.d;
            if (etv0Var != null) {
                etv0Var.b(false);
            }
            jd80Var.d = null;
            jd80Var.h.removeCallbacksAndMessages(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jd80(nzl0 nzl0Var, View view, gzs<? extends StoryEntry> gzsVar) {
        this.a = nzl0Var;
        this.b = view;
        this.c = gzsVar;
        this.k = new w4u0(view, new cf00(this, 12), new u110(this, 5), 2);
        bwt0.g(view, new bfm(this, 27));
        view.addOnAttachStateChangeListener(new b(view, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(OnboardingType onboardingType) {
        aqw.o((q7v0) this.g.getValue(), onboardingType.h(), new g06(10, this, onboardingType));
    }

    /* compiled from: ViewExt.kt */
    public static final class b implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ jd80 c;

        public b(View view, jd80 jd80Var) {
            this.b = view;
            this.c = jd80Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            w4u0 w4u0Var = this.c.k;
            View view2 = w4u0Var.b;
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(w4u0Var);
                viewTreeObserver.removeOnScrollChangedListener(w4u0Var);
                viewTreeObserver.removeOnGlobalLayoutListener(w4u0Var);
            }
            view2.removeOnAttachStateChangeListener(w4u0Var);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
