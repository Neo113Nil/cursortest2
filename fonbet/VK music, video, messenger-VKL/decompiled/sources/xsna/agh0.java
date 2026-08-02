package xsna;

import android.os.Build;
import android.os.Trace;
import android.view.Choreographer;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ScrollPerformanceChecker.kt */
/* loaded from: classes3.dex */
public final class agh0 {
    public static int b;
    public final Choreographer a;

    public agh0(Choreographer choreographer) {
        this.a = choreographer;
    }

    /* compiled from: ScrollPerformanceChecker.kt */
    public final class a extends RecyclerView.t {
        public final gfs b;
        public final int c;
        public boolean d;

        public a(gfs gfsVar) {
            this.b = gfsVar;
            int i = agh0.b;
            agh0.b = i + 1;
            this.c = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            boolean z = i != 0;
            boolean z2 = this.d;
            this.d = z;
            gfs gfsVar = this.b;
            int i2 = this.c;
            if (z && !z2) {
                if (Build.VERSION.SDK_INT >= 29) {
                    Trace.beginAsyncSection("ScrollPerformanceChecker.scrollInProgress", i2);
                }
                gfsVar.a();
            } else {
                if (z || !z2) {
                    return;
                }
                gfsVar.b();
                if (Build.VERSION.SDK_INT >= 29) {
                    Trace.endAsyncSection("ScrollPerformanceChecker.scrollInProgress", i2);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }
}
