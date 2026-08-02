package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: ClipsOverscrollEdgeEffectFactory.kt */
/* loaded from: classes4.dex */
public final class une extends RecyclerView.k {
    public final RecyclerView a;
    public final y24 b;
    public int e;
    public float f;
    public final boolean c = xpg0.b();
    public a d = a.IDLE;
    public final LinkedHashSet g = new LinkedHashSet();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsOverscrollEdgeEffectFactory.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ACTIVATE_ON_RELEASE;
        public static final a IDLE;

        static {
            a aVar = new a("ACTIVATE_ON_RELEASE", 0);
            ACTIVATE_ON_RELEASE = aVar;
            a aVar2 = new a("IDLE", 1);
            IDLE = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipsOverscrollEdgeEffectFactory.kt */
    public static final class b extends EdgeEffect {
        public ValueAnimator a;
        public final /* synthetic */ RecyclerView c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RecyclerView recyclerView, Context context) {
            super(context);
            this.c = recyclerView;
        }

        @Override // android.widget.EdgeEffect
        public final boolean draw(Canvas canvas) {
            return false;
        }

        @Override // android.widget.EdgeEffect
        public final float getDistance() {
            return une.this.f;
        }

        @Override // android.widget.EdgeEffect
        public final boolean isFinished() {
            ValueAnimator valueAnimator = this.a;
            return valueAnimator == null || !valueAnimator.isRunning();
        }

        @Override // android.widget.EdgeEffect
        public final void onPull(float f, float f2) {
            une uneVar = une.this;
            uneVar.e = 0;
            this.c.getParent().requestDisallowInterceptTouchEvent(true);
            super.onPull(f, f2);
            ValueAnimator valueAnimator = this.a;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float width = uneVar.f + (r2.getWidth() * (uneVar.c ? -1 : 1) * f * 0.2f);
            for (View view : awt0.d(uneVar.a)) {
                view.setTranslationX(width);
                uneVar.g.add(view);
            }
            uneVar.f = width;
            une.b(uneVar);
        }

        @Override // android.widget.EdgeEffect
        public final void onRelease() {
            this.c.getParent().requestDisallowInterceptTouchEvent(false);
            super.onRelease();
            une uneVar = une.this;
            float f = uneVar.f;
            if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ofFloat.addUpdateListener(new ef0(uneVar, 1));
                ofFloat.addListener(new wne(uneVar, this));
                ofFloat.start();
                this.a = ofFloat;
            }
            if (uneVar.d == a.ACTIVATE_ON_RELEASE) {
                uneVar.b.invoke();
            }
            uneVar.d = a.IDLE;
        }
    }

    public une(RecyclerView recyclerView, y24 y24Var) {
        this.a = recyclerView;
        this.b = y24Var;
        if (Build.VERSION.SDK_INT < 31) {
            recyclerView.addOnScrollListener(new vne(this));
        }
    }

    public static final void b(une uneVar) {
        boolean z = Math.abs(uneVar.f) - ((float) Math.abs(uneVar.e)) >= (((float) uneVar.a.getWidth()) * 0.15f) * 0.2f;
        if (z && uneVar.d == a.IDLE) {
            uneVar.d = a.ACTIVATE_ON_RELEASE;
            vvr0.c();
        }
        if (z || uneVar.d != a.ACTIVATE_ON_RELEASE) {
            return;
        }
        uneVar.d = a.IDLE;
        vvr0.c();
    }

    public static final void c(une uneVar, float f) {
        Iterator it = uneVar.g.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view.isAttachedToWindow()) {
                view.setTranslationX(f);
            } else {
                view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                it.remove();
            }
        }
        uneVar.f = f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public final EdgeEffect a(RecyclerView recyclerView, int i) {
        if (this.c) {
            if (i != 2) {
                return new EdgeEffect(recyclerView.getContext());
            }
        } else if (i != 0) {
            return new EdgeEffect(recyclerView.getContext());
        }
        return new b(recyclerView, recyclerView.getContext());
    }
}
