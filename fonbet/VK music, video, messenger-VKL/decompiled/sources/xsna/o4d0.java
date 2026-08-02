package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: PreviewItemAnimator.kt */
/* loaded from: classes6.dex */
public final class o4d0 extends androidx.recyclerview.widget.g {

    /* compiled from: PreviewItemAnimator.kt */
    public static final class a extends RecyclerView.l.c {
        public final boolean c;

        public a(boolean z) {
            this.c = z;
        }
    }

    /* compiled from: PreviewItemAnimator.kt */
    public static final class b extends AnimatorListenerAdapter {
        public final /* synthetic */ y5d0 c;

        public b(y5d0 y5d0Var) {
            this.c = y5d0Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            o4d0.this.h(this.c);
        }
    }

    @Override // androidx.recyclerview.widget.n0, androidx.recyclerview.widget.RecyclerView.l
    public final boolean b(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        if (!(cVar instanceof a)) {
            return super.b(e0Var, e0Var2, cVar, cVar2);
        }
        y5d0 y5d0Var = (y5d0) e0Var2;
        y5d0Var.itemView.animate().setListener(new b(y5d0Var)).alpha(!((a) cVar).c ? 1.0f : 0.64f).setDuration(200L).start();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final RecyclerView.l.c q(RecyclerView.a0 a0Var, RecyclerView.e0 e0Var, int i, List<Object> list) {
        return (i == 2 && (j5g.Y(list) instanceof eei0)) ? new a(((m4d0) ((y5d0) e0Var).m).a) : super.q(a0Var, e0Var, i, list);
    }
}
