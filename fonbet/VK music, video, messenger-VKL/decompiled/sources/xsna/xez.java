package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;
import java.util.concurrent.TimeUnit;

/* compiled from: ListGroupCallView.kt */
/* loaded from: classes7.dex */
public final class xez extends RecyclerView.t {
    public final /* synthetic */ ListGroupCallView b;

    public xez(ListGroupCallView listGroupCallView) {
        this.b = listGroupCallView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ListGroupCallView listGroupCallView = this.b;
        if (i == 0) {
            listGroupCallView.y.a();
            return;
        }
        yro0 yro0Var = listGroupCallView.a0;
        yro0Var.getClass();
        long nanoTime = System.nanoTime();
        long j = yro0Var.d + yro0Var.c;
        if (nanoTime > j) {
            yro0Var.a.run();
            yro0Var.d = nanoTime;
        } else if (yro0Var.e == null) {
            xw1 xw1Var = new xw1(yro0Var, 14);
            yro0Var.e = xw1Var;
            yro0Var.b.postDelayed(xw1Var, TimeUnit.NANOSECONDS.toMillis(j - nanoTime));
        }
    }
}
