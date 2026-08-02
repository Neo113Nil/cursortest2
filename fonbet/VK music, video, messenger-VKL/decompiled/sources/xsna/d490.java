package xsna;

import android.content.Context;
import android.view.View;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import xsna.phj0;

/* compiled from: ShowAllOnOverscrollDelegate.kt */
/* loaded from: classes16.dex */
public final class d490 extends RecyclerView.k {
    public final RecyclerView a;
    public final phj0.a b;
    public final boolean c = xpg0.b();

    /* compiled from: ShowAllOnOverscrollDelegate.kt */
    public static final class a extends EdgeEffect {
        public final float a;
        public boolean b;
        public float c;

        public a(Context context) {
            super(context);
            this.a = 60.0f;
        }

        @Override // android.widget.EdgeEffect
        public final void onPull(float f, float f2) {
            d490 d490Var = d490.this;
            RecyclerView recyclerView = d490Var.a;
            recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
            float f3 = this.c + f;
            this.c = f3;
            float f4 = this.a;
            float min = Math.min(f3 * recyclerView.getWidth(), f4);
            for (View view : awt0.d(recyclerView)) {
                view.setTranslationX(d490Var.c ? -min : min);
            }
            if (min != f4 || this.b) {
                return;
            }
            this.b = true;
            vvr0.c();
            d490Var.b.invoke();
        }

        @Override // android.widget.EdgeEffect
        public final void onRelease() {
            d490 d490Var = d490.this;
            d490Var.a.getParent().requestDisallowInterceptTouchEvent(false);
            this.b = false;
            this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            for (View view : awt0.d(d490Var.a)) {
                view.animate().translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
    }

    public d490(RecyclerView recyclerView, phj0.a aVar) {
        this.a = recyclerView;
        this.b = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public final EdgeEffect a(RecyclerView recyclerView, int i) {
        boolean z = this.c;
        RecyclerView recyclerView2 = this.a;
        if (z) {
            if (i != 2) {
                return new EdgeEffect(recyclerView2.getContext());
            }
        } else if (i != 0) {
            return new EdgeEffect(recyclerView2.getContext());
        }
        return new a(recyclerView2.getContext());
    }
}
