package xsna;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.dto.search.SearchStatsLoggingInfo;

/* compiled from: EpisodeAdapter.kt */
/* loaded from: classes2.dex */
public final class isp extends wx3 {
    public final izs<atp, s3q0> j;
    public int k;

    /* compiled from: EpisodeAdapter.kt */
    public static final class a extends m.e<hfz> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(hfz hfzVar, hfz hfzVar2) {
            return hfzVar.equals(hfzVar2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(hfz hfzVar, hfz hfzVar2) {
            hfz hfzVar3 = hfzVar;
            hfz hfzVar4 = hfzVar2;
            return hfzVar3.getClass().equals(hfzVar4.getClass()) && epx.f(hfzVar3.getItemId(), hfzVar4.getItemId());
        }

        @Override // androidx.recyclerview.widget.m.e
        public final Object getChangePayload(hfz hfzVar, hfz hfzVar2) {
            hfz hfzVar3 = hfzVar;
            hfz hfzVar4 = hfzVar2;
            if (!(hfzVar3 instanceof atp) || !(hfzVar4 instanceof atp) || hfzVar3.equals(hfzVar4)) {
                return null;
            }
            atp atpVar = (atp) hfzVar3;
            atp atpVar2 = (atp) hfzVar4;
            if (epx.f(atpVar.b, atpVar2.b) && atpVar.c == atpVar2.c && atpVar.f == atpVar2.f) {
                return atpVar2;
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public isp(int i, gzs<s3q0> gzsVar, rcg0 rcg0Var, bzs0 bzs0Var, boolean z, izs<? super atp, s3q0> izsVar, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        super(new a());
        this.j = izsVar;
        this.k = -1;
        y0(new gtp(i, gzsVar, rcg0Var, bzs0Var, z, izsVar, searchStatsLoggingInfo));
    }

    @Override // xsna.qul, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f = recyclerView;
        int i = this.k;
        if (i == -1) {
            return;
        }
        this.k = i;
        if (recyclerView != null) {
            this.k = -1;
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new lsp(recyclerView, i, this));
        }
    }
}
