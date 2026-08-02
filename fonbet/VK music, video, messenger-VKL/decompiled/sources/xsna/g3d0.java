package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DisclaimerData;
import com.vkontakte.android.attachments.PrettyCardAttachment;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: PrettyCardsHolder.kt */
/* loaded from: classes4.dex */
public final class g3d0 extends m56<PrettyCardAttachment> implements a1n, o0n {
    public final ViewGroup D;
    public final RecyclerView E;
    public final d3d0 F;
    public final Object G;
    public boolean H;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g3d0(ViewGroup viewGroup, ng30 ng30Var) {
        super(r0);
        RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
        recyclerView.setId(R.id.attach);
        this.D = viewGroup;
        RecyclerView recyclerView2 = (RecyclerView) this.itemView.findViewById(R.id.attach);
        this.E = recyclerView2;
        d3d0 d3d0Var = new d3d0(ng30Var);
        this.F = d3d0Var;
        this.G = msy.a(LazyThreadSafetyMode.NONE, new b990(this, 8));
        recyclerView2.setAdapter(d3d0Var);
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
        this.F.f = s6oVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.m56
    public final void T6(PrettyCardAttachment prettyCardAttachment) {
        d3d0 d3d0Var = this.F;
        List<? extends PrettyCardAttachment.Card> list = d3d0Var.e;
        List<PrettyCardAttachment.Card> list2 = prettyCardAttachment.f;
        if (list != list2) {
            u1c0 J0 = J0();
            d3d0Var.d = J0 != null ? J0.k : -1;
            Integer valueOf = Integer.valueOf(((Number) this.G.getValue()).intValue());
            d3d0Var.e = list2;
            d3d0Var.g = valueOf;
            d3d0Var.notifyDataSetChanged();
            RecyclerView.o layoutManager = this.E.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.scrollToPosition(0);
            }
        }
    }

    @Override // xsna.a1n
    public final void U5() {
        this.H = true;
    }

    @Override // xsna.o0n
    public final void a5() {
        RecyclerView recyclerView = this.E;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            awt0.q(recyclerView.getChildAt(linearLayoutManager.s()));
        }
    }

    @Override // xsna.a1n
    public final boolean o5() {
        return this.H;
    }

    @Override // xsna.a1n
    public final void E2(DisclaimerData disclaimerData) {
    }
}
