package xsna;

import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import xsna.sv60;
import xsna.sv60.a;

/* compiled from: NewsfeedPostLikesActivityScrollController.kt */
/* loaded from: classes4.dex */
public final class tv60 extends RecyclerView.t {
    public final /* synthetic */ sv60 b;

    public tv60(sv60 sv60Var) {
        this.b = sv60Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        sv60 sv60Var = this.b;
        Handler handler = sv60Var.b;
        if (sv60Var.e) {
            return;
        }
        sv60.a aVar = sv60Var.c;
        if (aVar != null) {
            handler.removeCallbacks(aVar);
            sv60Var.c = null;
        }
        if (sv60Var.a != i && i == 0) {
            sv60Var.d = new WeakReference<>(recyclerView);
            sv60.a aVar2 = sv60Var.new a();
            sv60Var.c = aVar2;
            handler.postDelayed(aVar2, 100L);
        }
        sv60Var.a = i;
    }
}
