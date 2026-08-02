package xsna;

import android.view.ViewGroup;
import com.vk.dto.search.SearchStatsLoggingInfo;
import java.util.List;

/* compiled from: EpisodeVideoDelegate.kt */
/* loaded from: classes2.dex */
public final class gtp extends p1u0<atp> {
    public final int a;
    public final gzs<s3q0> b;
    public final bzs0 c;
    public final boolean d;
    public final izs<atp, s3q0> e;
    public final SearchStatsLoggingInfo f;

    /* JADX WARN: Multi-variable type inference failed */
    public gtp(int i, gzs<s3q0> gzsVar, rcg0 rcg0Var, bzs0 bzs0Var, boolean z, izs<? super atp, s3q0> izsVar, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        this.a = i;
        this.b = gzsVar;
        this.c = bzs0Var;
        this.d = z;
        this.e = izsVar;
        this.f = searchStatsLoggingInfo;
    }

    @Override // xsna.p1u0
    public final void a(vfz<atp> vfzVar, atp atpVar, List list) {
        atp atpVar2 = atpVar;
        if (list == null || !(!list.isEmpty()) || !(list.get(0) instanceof atp)) {
            vfzVar.W5(atpVar2);
            return;
        }
        htp htpVar = vfzVar instanceof htp ? (htp) vfzVar : null;
        if (htpVar != null) {
            htpVar.z = atpVar2;
            htpVar.h6(atpVar2);
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends atp> b(ViewGroup viewGroup) {
        return new htp(viewGroup, this.a, this.b, this.c, this.d, this.e, this.f);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof atp;
    }
}
