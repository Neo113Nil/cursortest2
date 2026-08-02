package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import kotlin.Pair;

/* compiled from: ClipsMusicTemplateController.kt */
/* loaded from: classes17.dex */
public final class ule {
    public final xle a;
    public final tle b;
    public final ClipFeedTab c;
    public final wzs<View, m7f, s3q0> d;
    public a e;
    public final b f = new b();

    /* compiled from: ClipsMusicTemplateController.kt */
    public static final class a extends RecyclerView.i {
        public final kg a;

        public a(kg kgVar) {
            this.a = kgVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            this.a.invoke();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int i, int i2) {
            this.a.invoke();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void d(int i, int i2, Object obj) {
            this.a.invoke();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            this.a.invoke();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int i, int i2) {
            this.a.invoke();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            this.a.invoke();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void h() {
            this.a.invoke();
        }
    }

    /* compiled from: ClipsMusicTemplateController.kt */
    public final class b extends RecyclerView.t {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ule.this.c(recyclerView);
        }
    }

    public ule(xle xleVar, tle tleVar, ClipFeedTab clipFeedTab, wzs wzsVar) {
        this.a = xleVar;
        this.b = tleVar;
        this.c = clipFeedTab;
        this.d = wzsVar;
        xleVar.setOnSelectClickListener(new gr3(this, 17));
    }

    public final void a(q8e q8eVar) {
        a aVar = new a(new kg(8, q8eVar, this));
        this.e = aVar;
        RecyclerView.Adapter adapter = q8eVar.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(aVar);
        }
        q8eVar.addOnScrollListener(this.f);
        c(q8eVar);
    }

    public final void b(q8e q8eVar) {
        RecyclerView.Adapter adapter;
        a aVar = this.e;
        if (aVar != null && (adapter = q8eVar.getAdapter()) != null) {
            adapter.unregisterAdapterDataObserver(aVar);
        }
        q8eVar.removeOnScrollListener(this.f);
    }

    public final void c(RecyclerView recyclerView) {
        Pair pair;
        View view;
        int decoratedLeft;
        int decoratedRight;
        int centerX;
        kih0 j;
        SdkVideoFile A;
        Float valueOf = Float.valueOf(1.0f);
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            pair = new Pair(0, valueOf);
        } else {
            int v = linearLayoutManager.v();
            int x = ((linearLayoutManager.x() - v) / 2) + v;
            RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(x);
            if (findViewHolderForAdapterPosition == null || (view = findViewHolderForAdapterPosition.itemView) == null) {
                pair = new Pair(0, valueOf);
            } else {
                if (linearLayoutManager.b == 1) {
                    decoratedLeft = linearLayoutManager.getDecoratedTop(view);
                    decoratedRight = linearLayoutManager.getDecoratedBottom(view);
                    centerX = bwt0.C(recyclerView).centerY();
                } else {
                    decoratedLeft = linearLayoutManager.getDecoratedLeft(view);
                    decoratedRight = linearLayoutManager.getDecoratedRight(view);
                    centerX = bwt0.C(recyclerView).centerX();
                }
                if (decoratedLeft == decoratedRight) {
                    pair = new Pair(0, valueOf);
                } else {
                    float f = (decoratedRight - decoratedLeft) / 2.0f;
                    float abs = Math.abs(Math.abs(centerX - (decoratedLeft + f)) - f) / f;
                    if (centerX - decoratedRight > 0) {
                        x++;
                    }
                    pair = new Pair(Integer.valueOf(x), Float.valueOf(abs));
                }
            }
        }
        int intValue = ((Number) pair.d()).intValue();
        float floatValue = ((Number) pair.g()).floatValue();
        xle xleVar = this.a;
        xleVar.setTextAlpha(floatValue);
        Object findViewHolderForAdapterPosition2 = recyclerView.findViewHolderForAdapterPosition(intValue);
        pi5 pi5Var = findViewHolderForAdapterPosition2 instanceof pi5 ? (pi5) findViewHolderForAdapterPosition2 : null;
        if (pi5Var == null || (j = pi5Var.j()) == null || (A = j.A()) == null) {
            return;
        }
        xleVar.a(A);
    }
}
