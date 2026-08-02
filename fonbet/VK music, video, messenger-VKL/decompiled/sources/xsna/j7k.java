package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import xsna.y6k;

/* compiled from: CreateChatVC.kt */
/* loaded from: classes2.dex */
public final class j7k {
    public final Context a;
    public final com.vk.im.engine.models.c b;
    public final y6k.b c;
    public final Object d = new Object();
    public final bpn0 e = new bpn0(new dne(this, 13));
    public RecyclerView f;
    public View g;
    public t6k h;

    public j7k(Context context, com.vk.im.engine.models.c cVar, y6k.b bVar) {
        this.a = context;
        this.b = cVar;
        this.c = bVar;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void a(v230 v230Var) {
        owi.b(this.d);
        RecyclerView recyclerView = this.f;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setVisibility(0);
        View view = this.g;
        if (view == null) {
            view = null;
        }
        f4m.j(view);
        t6k t6kVar = this.h;
        if (t6kVar == null) {
            t6kVar = null;
        }
        t6kVar.J0(v230Var);
        RecyclerView recyclerView2 = this.f;
        RecyclerView.Adapter adapter = (recyclerView2 != null ? recyclerView2 : null).getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public final void b(Configuration configuration) {
        int a = iah0.a(Math.max((configuration.screenWidthDp - 720) / 2, 0));
        RecyclerView recyclerView = this.f;
        if (recyclerView == null) {
            recyclerView = null;
        }
        f4m.r(a, recyclerView);
        RecyclerView recyclerView2 = this.f;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        f4m.s(a, recyclerView2);
        RecyclerView recyclerView3 = this.f;
        (recyclerView3 != null ? recyclerView3 : null).invalidateItemDecorations();
    }
}
