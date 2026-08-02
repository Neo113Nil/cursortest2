package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SmoothScrollHelper.kt */
/* loaded from: classes4.dex */
public final class i6k0 {
    public final RecyclerView a;
    public final a c;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final Handler d = new Handler(Looper.getMainLooper());

    /* compiled from: SmoothScrollHelper.kt */
    public static final class a extends androidx.recyclerview.widget.v {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.v
        public final int calculateDyToMakeVisible(View view, int i) {
            RecyclerView.o layoutManager = getLayoutManager();
            if (layoutManager == null || !layoutManager.canScrollVertically()) {
                return 0;
            }
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return calculateDtToFit(layoutManager.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, layoutManager.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin, layoutManager.getPaddingTop(), layoutManager.getHeight() - layoutManager.getPaddingBottom(), i);
        }

        @Override // androidx.recyclerview.widget.v
        public final int getVerticalSnapPreference() {
            return 1;
        }

        @Override // androidx.recyclerview.widget.v, androidx.recyclerview.widget.RecyclerView.z
        public final void onStart() {
            super.onStart();
            i6k0.this.b.set(true);
        }

        @Override // androidx.recyclerview.widget.v, androidx.recyclerview.widget.RecyclerView.z
        public final void onStop() {
            super.onStop();
            final i6k0 i6k0Var = i6k0.this;
            i6k0Var.d.postDelayed(new Runnable(i6k0Var) { // from class: xsna.h6k0
                @Override // java.lang.Runnable
                public final void run() {
                }
            }, 16L);
            i6k0Var.b.set(false);
            i6k0Var.a.postDelayed(new Runnable(i6k0Var) { // from class: xsna.h6k0
                @Override // java.lang.Runnable
                public final void run() {
                }
            }, 1500L);
        }
    }

    public i6k0(RecyclerView recyclerView) {
        this.a = recyclerView;
        this.c = new a(recyclerView.getContext());
    }
}
