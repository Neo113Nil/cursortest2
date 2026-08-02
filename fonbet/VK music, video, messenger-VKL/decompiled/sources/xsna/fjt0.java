package xsna;

import androidx.recyclerview.widget.RecyclerView;
import xsna.djt0;

/* compiled from: VideoSwipeTracker.kt */
/* loaded from: classes2.dex */
public final class fjt0 {
    public djt0 a;
    public final b b = new b();
    public final a c = new a();

    /* compiled from: VideoSwipeTracker.kt */
    public static final class a extends RecyclerView.t {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 1) {
                fjt0 fjt0Var = fjt0.this;
                djt0 djt0Var = fjt0Var.a;
                if (djt0Var != null) {
                    djt0Var.b();
                }
                fjt0Var.a = null;
            }
        }
    }

    /* compiled from: VideoSwipeTracker.kt */
    public static final class b implements djt0.b {
        public b() {
        }

        @Override // xsna.djt0.b
        public final void a(djt0 djt0Var) {
            fjt0 fjt0Var = fjt0.this;
            djt0 djt0Var2 = fjt0Var.a;
            if (djt0Var2 != djt0Var) {
                if (djt0Var2 != null) {
                    djt0Var2.b();
                }
                fjt0Var.a = djt0Var;
            }
        }
    }
}
