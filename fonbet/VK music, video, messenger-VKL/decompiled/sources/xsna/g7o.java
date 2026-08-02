package xsna;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.rlottie.RLottieDrawable;
import com.vkontakte.android.R;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference0Impl;
import xsna.y6o;

/* compiled from: DoubleTapLikeDecoration.kt */
/* loaded from: classes18.dex */
public final class g7o extends RecyclerView.n {
    public final PropertyReference0Impl b;
    public final gzs<Integer> c;
    public int e;
    public int f;
    public RLottieDrawable g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float n;
    public NewsEntry o;
    public ValueAnimator p;
    public PointF q;
    public final y6o d = new y6o(new cfl(this, 4));
    public int m = Integer.MIN_VALUE;

    public g7o(PropertyReference0Impl propertyReference0Impl, gzs gzsVar) {
        this.b = propertyReference0Impl;
        this.c = gzsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        if (this.o != null) {
            this.m = Integer.MIN_VALUE;
            ValueAnimator valueAnimator = this.p;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            RLottieDrawable rLottieDrawable = this.g;
            if (rLottieDrawable != null) {
                rLottieDrawable.k();
            }
            y6o y6oVar = this.d;
            int nextInt = y6oVar.e.nextInt(101);
            ArrayList<y6o.a> arrayList = y6oVar.d;
            y6o.a aVar = arrayList.get(nextInt % arrayList.size());
            n900<y6o.a> n900Var = y6oVar.c;
            x6o x6oVar = n900Var.get(aVar);
            if (x6oVar == null) {
                Resources resources = (Resources) y6oVar.a.invoke();
                if (resources != null) {
                    aVar.getClass();
                    InputStream openRawResource = resources.openRawResource(R.raw.red_like_v3);
                    if (openRawResource != null) {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, emb.b), 8192);
                        try {
                            String b = a0a.b(bufferedReader);
                            bufferedReader.close();
                            int intValue = aVar.a.intValue();
                            x6oVar = new x6o(intValue, "like_v3", b, intValue, true);
                            if (x6oVar != null) {
                                x6oVar = (x6o) y6oVar.b.b.getValue();
                            } else {
                                n900Var.put(aVar, x6oVar);
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                ro.e(bufferedReader, th);
                                throw th2;
                            }
                        }
                    }
                }
                x6oVar = null;
                if (x6oVar != null) {
                }
            }
            RLottieDrawable rLottieDrawable2 = new RLottieDrawable(x6oVar.d, x6oVar.a, x6oVar.b, x6oVar.c, null, false, false, null, 496);
            int i = x6oVar.b;
            this.e = i;
            int i2 = x6oVar.c;
            this.f = i2;
            rLottieDrawable2.setBounds(0, 0, i, i2);
            ez3 ez3Var = rLottieDrawable2.k;
            ez3Var.q = 1;
            rLottieDrawable2.setCallback((Drawable.Callback) this.b.get());
            ez3Var.t = new f7o(x6oVar, this, rLottieDrawable2);
            this.g = rLottieDrawable2;
            rLottieDrawable2.j();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        NewsEntry H0;
        if (this.o == null) {
            return;
        }
        int i = 0;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        View view = null;
        while (i < recyclerView.getChildCount()) {
            int i2 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            Object childViewHolder = recyclerView.getChildViewHolder(childAt);
            i7o i7oVar = childViewHolder instanceof i7o ? (i7o) childViewHolder : null;
            if (i7oVar != null && (H0 = i7oVar.H0()) != null && H0.equals(this.o)) {
                if (view == null) {
                    view = childAt;
                }
                f += childAt.getHeight();
            }
            i = i2;
        }
        Pair pair = new Pair(view, Float.valueOf(f));
        View view2 = (View) pair.d();
        float floatValue = ((Number) pair.g()).floatValue();
        int i3 = this.m;
        gzs<Integer> gzsVar = this.c;
        if (i3 == Integer.MIN_VALUE) {
            this.m = gzsVar.invoke().intValue();
            RecyclerView recyclerView2 = (RecyclerView) this.b.get();
            PointF pointF = this.q;
            if (recyclerView2 == null || pointF == null) {
                this.i = view2 != null ? (floatValue / 2) + view2.getY() : -this.f;
                this.h = view2 != null ? view2.getX() + (view2.getWidth() / 2) : -this.e;
            } else {
                float f2 = pointF.x;
                this.h = f2;
                this.i = pointF.y;
                float f3 = f2 < ((float) (recyclerView2.getWidth() / 2)) ? -15.0f : 15.0f;
                this.l = f3;
                double radians = (float) Math.toRadians(f3);
                float abs = Math.abs(this.e * ((float) Math.sin(radians))) + Math.abs(this.e * ((float) Math.cos(radians)));
                float abs2 = Math.abs(this.f * ((float) Math.cos(radians))) + Math.abs(this.f * ((float) Math.sin(radians)));
                float f4 = 2;
                float f5 = abs / f4;
                float f6 = abs2 / f4;
                this.h = swe0.f(this.h, f5, recyclerView2.getWidth() - f5);
                this.i = swe0.f(this.i, f6, recyclerView2.getHeight() - f6);
            }
            this.n = this.i - (this.f / 2);
            this.j = this.h - (this.e / 2);
        }
        if (this.m != Integer.MIN_VALUE) {
            float intValue = this.n - (gzsVar.invoke().intValue() - this.m);
            this.k = intValue;
            int i4 = this.f;
            if (intValue < (-i4)) {
                this.k = -i4;
            }
            int save = canvas.save();
            try {
                canvas.rotate(this.l, this.h, this.i);
                canvas.translate(this.j, this.k);
                RLottieDrawable rLottieDrawable = this.g;
                if (rLottieDrawable != null) {
                    rLottieDrawable.draw(canvas);
                }
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }
}
