package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;

/* compiled from: SwipeToReplyItemTouchCallback.kt */
/* loaded from: classes2.dex */
public final class lmn0 extends r.d {
    public final jjx e;
    public final float f;
    public final float g = iah0.a(80);
    public final long h = 200;
    public final int i = iah0.a(8);
    public final float j = 0.7f;
    public final int k = iah0.a(12);
    public final float l = 0.7f;
    public boolean m = true;
    public final float n = 0.7f;
    public boolean o = true;
    public final a p = new a(0);
    public final Object q;

    /* compiled from: SwipeToReplyItemTouchCallback.kt */
    public static final class a {
        public final ArrayList a = new ArrayList();
        public float b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        public int c = 0;
        public int d = 0;

        public a(int i) {
        }
    }

    /* compiled from: SwipeToReplyItemTouchCallback.kt */
    public interface b {
        View B();

        int id();

        boolean u3();
    }

    public lmn0(Context context, jjx jjxVar) {
        this.e = jjxVar;
        this.f = ViewConfiguration.get(context).getScaledTouchSlop();
        this.q = msy.a(LazyThreadSafetyMode.NONE, new k75(18, this, context));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.r.d
    public final void b(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
        super.b(recyclerView, e0Var);
        if (e0Var instanceof b) {
            b bVar = (b) e0Var;
            a aVar = this.p;
            if (aVar.b >= this.n && this.o) {
                this.e.invoke(bVar);
                this.o = false;
            }
            ArrayList arrayList = aVar.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((b) arrayList.get(i)).B().setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            aVar.a.clear();
            this.m = true;
            this.o = true;
        }
    }

    @Override // androidx.recyclerview.widget.r.d
    public final long e(RecyclerView recyclerView, int i) {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.r.d
    public final int f(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
        b bVar = e0Var instanceof b ? (b) e0Var : null;
        return r.d.l(0, bVar != null ? bVar.u3() : false ? 4 : 0);
    }

    @Override // androidx.recyclerview.widget.r.d
    public final float g(float f) {
        return Float.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.r.d
    public final float h() {
        return Float.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.r.d
    public final boolean j() {
        return true;
    }

    @Override // androidx.recyclerview.widget.r.d
    public final boolean k() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.r.d
    public final void m(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, float f, float f2, int i, boolean z) {
        if (e0Var instanceof b) {
            b bVar = (b) e0Var;
            a aVar = this.p;
            ArrayList arrayList = aVar.a;
            ArrayList arrayList2 = aVar.a;
            if (arrayList.isEmpty()) {
                int id = bVar.id();
                for (int i2 = 0; i2 < recyclerView.getChildCount(); i2++) {
                    Object findContainingViewHolder = recyclerView.findContainingViewHolder(recyclerView.getChildAt(i2));
                    b bVar2 = findContainingViewHolder instanceof b ? (b) findContainingViewHolder : null;
                    if (bVar2 != null) {
                        p4g.a(bVar2, arrayList, bVar2.id() == id);
                    }
                }
            }
            float abs = Math.abs(f) - this.f;
            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, abs);
            float f4 = this.g;
            aVar.b = Math.min(max, f4) / f4;
            aVar.c = Integer.MAX_VALUE;
            aVar.d = Integer.MIN_VALUE;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                b bVar3 = (b) arrayList.get(i3);
                aVar.c = Math.min(aVar.c, bVar3.B().getTop());
                aVar.d = Math.max(aVar.d, bVar3.B().getBottom());
            }
            aVar.c = Math.max(0, aVar.c);
            aVar.d = Math.min(recyclerView.getHeight(), aVar.d);
            if (arrayList2.isEmpty()) {
                return;
            }
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ((b) arrayList2.get(i4)).B().setTranslationX((-aVar.b) * f4);
            }
            float f5 = this.j;
            if (f5 < 0.01f) {
                f3 = aVar.b;
            } else {
                float f6 = aVar.b;
                if (f6 > f5) {
                    f3 = (f6 - f5) / (1.0f - f5);
                }
            }
            int right = ((recyclerView.getRight() - this.i) - q().getIntrinsicWidth()) - ((int) (this.k * f3));
            int i5 = aVar.c;
            int b2 = x9.b(aVar.d, i5, 2, i5) - (q().getIntrinsicHeight() / 2);
            q().setBounds(right, b2, q().getIntrinsicWidth() + right, q().getIntrinsicHeight() + b2);
            q().setAlpha((int) (f3 * 255));
            q().draw(canvas);
            boolean z2 = aVar.b >= this.l;
            if (z2 && this.m) {
                awt0.p(e0Var.itemView);
                this.m = false;
            }
            if (!z2) {
                this.m = true;
            }
            if (z || aVar.b < this.n || !this.o) {
                return;
            }
            this.e.invoke(bVar);
            this.o = false;
        }
    }

    @Override // androidx.recyclerview.widget.r.d
    public final boolean n(RecyclerView recyclerView, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.r.d
    public final void o(RecyclerView.e0 e0Var, int i) {
        if (i == 1) {
            this.p.a.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Drawable q() {
        return (Drawable) this.q.getValue();
    }

    @Override // androidx.recyclerview.widget.r.d
    public final void p(RecyclerView.e0 e0Var) {
    }
}
