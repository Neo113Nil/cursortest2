package xsna;

import com.vk.dto.newsfeed.SituationalSuggest;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.NewsfeedDeduplicator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xsna.qn60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class wu60 implements izs {
    public final /* synthetic */ dv60 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ wu60(dv60 dv60Var, int i, boolean z) {
        this.b = dv60Var;
        this.c = i;
        this.d = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        lu60 lu60Var = (lu60) obj;
        dv60 dv60Var = this.b;
        qz60 qz60Var = (qz60) dv60Var.b.getCurrentState();
        SituationalSuggest situationalSuggest = qz60Var.g.a;
        zz60 zz60Var = dv60Var.h;
        zz60Var.h.a();
        aic aicVar = new aic();
        k070 k070Var = qz60Var.f;
        pn60 pn60Var = zz60Var.h;
        int i = this.c;
        rn0 rn0Var = new rn0(i, k070Var, pn60Var);
        qn0 qn0Var = new qn0(situationalSuggest, pn60Var);
        List<NewsEntry> a = lu60Var.a();
        qtc0 qtc0Var = qz60Var.b.c;
        NewsfeedDeduplicator newsfeedDeduplicator = (NewsfeedDeduplicator) dv60Var.l.getValue();
        Boolean c = lu60Var.c();
        Boolean bool = Boolean.TRUE;
        ArrayList o = e43.o(aicVar, rn0Var, qn0Var, new xc3(a, qtc0Var, pn60Var, newsfeedDeduplicator, epx.f(c, bool) ? (h6c0) dv60Var.j.getValue() : null, true, sua.m(lu60Var)), new bjj0(i, lu60Var, pn60Var));
        if (i == 0 && this.d && epx.f(lu60Var.c(), bool) && sua.n(lu60Var)) {
            o.add(new kjj0(pn60Var));
        }
        qn60 qn60Var = zz60Var.g;
        qn60.b[] bVarArr = (qn60.b[]) o.toArray(new qn60.b[0]);
        return odq.c(qn60Var, (qn60.b[]) Arrays.copyOf(bVarArr, bVarArr.length)).l(new uf20(new fju(lu60Var, 14), 4));
    }
}
