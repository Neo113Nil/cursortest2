package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.viewer.impl.feed.view.list.item.controls.side.shares.fast.config.ClipsFastShareConfig$Strategy;
import com.vk.dto.common.VideoFile;
import com.vk.sharing.api.di.SharingComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.amq;
import xsna.f9j0;
import xsna.t2e;
import xsna.u3f;
import xsna.xlq;

/* compiled from: ClipsFastSharePopupHelper.kt */
/* loaded from: classes17.dex */
public final class q2e {
    public final SharingComponent a;
    public final t3f b;
    public zlq c;
    public FrameLayout d;
    public ValueAnimator e;
    public final io.reactivex.rxjava3.disposables.b f;

    /* compiled from: ClipsFastSharePopupHelper.kt */
    public static final class a {
        public final f9j0 a;
        public final xlq b;

        public a(f9j0 f9j0Var, xlq xlqVar) {
            this.a = f9j0Var;
            this.b = xlqVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "FastShareEntry(clipsFastShareTarget=" + this.a + ", fastShareTarget=" + this.b + ')';
        }
    }

    /* compiled from: ClipsFastSharePopupHelper.kt */
    public static final class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            q2e.this.d();
        }
    }

    public q2e(SharingComponent sharingComponent, t3f t3fVar) {
        ClipsFastShareConfig$Strategy clipsFastShareConfig$Strategy = h2e.a;
        this.a = sharingComponent;
        this.b = t3fVar;
        this.e = new ValueAnimator();
        this.f = new io.reactivex.rxjava3.disposables.b();
    }

    public static final void a(q2e q2eVar, final View view, final FrameLayout frameLayout) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.m2e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view2 = view;
                view2.setScaleX(floatValue);
                view2.setScaleY(floatValue);
                view2.setAlpha(floatValue);
                frameLayout.setBackgroundColor(Color.argb((int) (floatValue * 0.3f), 0, 0, 0));
            }
        });
        q2eVar.e = ofFloat;
        ofFloat.start();
    }

    public static final void e(zlq zlqVar, q2e q2eVar, View view, VideoFile videoFile, za zaVar, t2e t2eVar) {
        if (!(t2eVar instanceof t2e.a)) {
            throw new NoWhenBranchMatchedException();
        }
        Context context = zlqVar.getContext();
        List<f9j0> list = ((t2e.a) t2eVar).a;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            a aVar = null;
            if (i < 0) {
                e43.t();
                throw null;
            }
            f9j0 f9j0Var = (f9j0) obj;
            if (f9j0Var instanceof f9j0.c) {
                f9j0.c cVar = (f9j0.c) f9j0Var;
                aVar = new a(f9j0Var, new xlq.c(i, cVar.getName(), cVar.a(), null));
            } else if (!(f9j0Var instanceof f9j0.a)) {
                if (!(f9j0Var instanceof f9j0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new a(f9j0Var, new xlq.b(i, context.getString(R.string.clips_fast_share_more_title)));
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
            i = i2;
        }
        zlqVar.setOnSuccess(new k2e(arrayList, q2eVar, view, videoFile, zaVar, 0));
        zlqVar.setOnCancel(new g5(q2eVar, 20));
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((a) it.next()).b);
        }
        zlqVar.setState(new amq.b(arrayList2));
    }

    public final void b() {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        valueAnimator.reverse();
        valueAnimator.removeAllListeners();
        valueAnimator.addListener(new b());
        this.f.e();
    }

    public final io.reactivex.rxjava3.internal.operators.single.y c(t3f t3fVar, ClipsFastShareConfig$Strategy clipsFastShareConfig$Strategy, boolean z) {
        ClipsFastShareConfig$Strategy clipsFastShareConfig$Strategy2 = h2e.a;
        u3f.a aVar = new u3f.a(4, clipsFastShareConfig$Strategy, new u3f.b(4, clipsFastShareConfig$Strategy, z, 4), 8);
        t3fVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.single.c(new r3f(aVar, t3fVar)).l(new dg1(new r2e(1, this, q2e.class, "replaceEmptyWithCurrentAccount", "replaceEmptyWithCurrentAccount(Ljava/util/List;)Ljava/util/List;", 0), 10));
    }

    public final void d() {
        if (this.e.isRunning()) {
            this.e.removeAllListeners();
            this.e.cancel();
        }
        FrameLayout frameLayout = this.d;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(frameLayout);
            }
        }
        this.d = null;
        this.c = null;
    }
}
