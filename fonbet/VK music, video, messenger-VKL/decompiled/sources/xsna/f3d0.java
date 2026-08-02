package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DisclaimerData;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: PrettyCardsDtoHolder.kt */
/* loaded from: classes4.dex */
public final class f3d0 extends rp6<i3d0, NewsEntry> implements i7o, a1n, o0n {
    public final ViewGroup E;
    public final RecyclerView F;
    public final e3d0 G;
    public final Object H;
    public boolean I;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f3d0(ViewGroup viewGroup, ng30 ng30Var) {
        super(r0, viewGroup);
        RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
        recyclerView.setId(R.id.attach);
        this.E = viewGroup;
        RecyclerView recyclerView2 = (RecyclerView) this.itemView.findViewById(R.id.attach);
        this.F = recyclerView2;
        e3d0 e3d0Var = new e3d0(ng30Var);
        this.G = e3d0Var;
        this.H = msy.a(LazyThreadSafetyMode.NONE, new jaa0(this, 7));
        recyclerView2.setAdapter(e3d0Var);
        viewGroup.getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager(0, false));
        int b = cn70.b(12);
        int b2 = cn70.b(16);
        recyclerView2.addItemDecoration(new v98(b, b2, b2, true));
        f4m.v(cn70.b(1), recyclerView2);
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        this.G.f = s6oVar;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rp6
    public final void R6(i3d0 i3d0Var) {
        e3d0 e3d0Var = this.G;
        List<c3d0> list = e3d0Var.e;
        ArrayList arrayList = i3d0Var.k;
        if (epx.f(list, arrayList)) {
            return;
        }
        u1c0 J0 = J0();
        e3d0Var.d = J0 != null ? J0.k : -1;
        Integer valueOf = Integer.valueOf(((Number) this.H.getValue()).intValue());
        e3d0Var.e = arrayList;
        e3d0Var.g = valueOf;
        e3d0Var.notifyDataSetChanged();
        RecyclerView.o layoutManager = this.F.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.scrollToPosition(0);
        }
    }

    @Override // xsna.a1n
    public final void U5() {
        this.I = true;
    }

    @Override // xsna.o0n
    public final void a5() {
        RecyclerView recyclerView = this.F;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            awt0.q(recyclerView.getChildAt(linearLayoutManager.s()));
        }
    }

    @Override // xsna.a1n
    public final boolean o5() {
        return this.I;
    }

    @Override // xsna.a1n
    public final void E2(DisclaimerData disclaimerData) {
    }
}
