package defpackage;

import android.os.Handler;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.shortcuts.impl.view.adapter.n;
import java.util.List;

/* loaded from: classes13.dex */
public final class a6b0 {
    public final RecyclerView a;
    public final j1 b;
    public long e;
    public long f;
    public bwi g;
    public int c = -1;
    public int d = -1;
    public final op70 h = new op70(28, this);
    public final z5b0 i = new z5b0(this);

    public a6b0(RecyclerView recyclerView, j1 j1Var) {
        this.a = recyclerView;
        this.b = j1Var;
    }

    public static final void a(a6b0 a6b0Var) {
        int b = a6b0Var.b();
        if (b == -1) {
            bwi bwiVar = a6b0Var.g;
            if (bwiVar != null) {
                a6b0Var.g = null;
                bwiVar.cancel();
                return;
            }
            return;
        }
        if (b != a6b0Var.c) {
            a6b0Var.c = b;
            a6b0Var.e = System.currentTimeMillis();
            a6b0Var.c();
        } else {
            if (a6b0Var.g != null || b == a6b0Var.d) {
                return;
            }
            a6b0Var.c();
        }
    }

    public final int b() {
        RecyclerView recyclerView = this.a;
        RecyclerView.e layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return -1;
        }
        List list = n.e0;
        return egz.C(recyclerView, linearLayoutManager);
    }

    public final void c() {
        bwi bwiVar = this.g;
        if (bwiVar != null && bwiVar != null) {
            this.g = null;
            bwiVar.cancel();
        }
        Handler handler = (Handler) qyy0.a.getValue();
        op70 op70Var = this.h;
        handler.postDelayed(op70Var, 500L);
        this.g = new bwi(4, op70Var);
    }
}
