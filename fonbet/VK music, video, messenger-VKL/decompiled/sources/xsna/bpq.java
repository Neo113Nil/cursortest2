package xsna;

import android.os.Parcelable;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.fave.FaveItem;
import com.vk.fave.entities.FaveEntry;
import com.vk.fave.entities.FavePage;
import com.vk.fave.entities.FaveType;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import xsna.ds60;
import xsna.jm50;
import xsna.qn60;
import xsna.qr60;

/* compiled from: FaveFeedMviExternalTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class bpq extends evg0<kpq, on50, spq, rpq, ipq, xoq> {
    public static final Set<dcy<? extends Object>> i = rl3.y0(new dcy[]{fpf0.a(frq.class), fpf0.a(tqq.class), fpf0.a(mnq.class), fpf0.a(umq.class)});
    public final qn60 f;
    public final pn60 g;
    public final kq60 h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bpq(es60 es60Var, cpq cpqVar, nn50 nn50Var) {
        super(r4, nn50Var);
        jm50.a aVar = jm50.a.a;
        qn60 qn60Var = es60Var.a;
        this.f = qn60Var;
        pn60 pn60Var = es60Var.b;
        this.g = pn60Var;
        this.h = new kq60(qn60Var, pn60Var, es60Var.e, aVar, new eht(this, cpqVar));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        ds60.b bVar = ((spq) hn50Var).b;
        NewsfeedExternalAction.c cVar = bVar.b;
        boolean z = cVar instanceof NewsfeedExternalAction.c.j0;
        kq60 kq60Var = this.h;
        if (!z) {
            kq60Var.s(bVar);
            return null;
        }
        NewsfeedExternalAction.c.j0 j0Var = (NewsfeedExternalAction.c.j0) cVar;
        Parcelable parcelable = j0Var.a;
        if (!(parcelable instanceof FaveEntry)) {
            kq60Var.s(new ds60.b(j0Var));
            return null;
        }
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        kpq kpqVar = (kpq) nn50Var.getCurrentState();
        FaveType faveType = kpqVar.b;
        tqq tqqVar = kpqVar.g;
        FaveTag faveTag = kpqVar.c;
        FaveEntry faveEntry = (FaveEntry) parcelable;
        gnq.a.getClass();
        FaveItem faveItem = faveEntry.i;
        FaveType e = gnq.e(faveItem.f);
        gmq gmqVar = parcelable instanceof Post ? (gmq) parcelable : parcelable != null ? faveEntry.i.f : null;
        boolean X = gmqVar != null ? gmqVar.X() : false;
        boolean z2 = (faveTag == null || faveItem.e.contains(faveTag)) ? false : true;
        if ((faveType == null || faveType == e) && (!X || !z2)) {
            FaveEntry faveEntry2 = new FaveEntry(faveItem, faveType != null, faveEntry.k);
            pn60 pn60Var = this.g;
            qn60 qn60Var = this.f;
            if (X) {
                xle0 xle0Var = new xle0(faveEntry2, i, kpqVar.h.c, pn60Var);
                List<FavePage> list = tqqVar != null ? tqqVar.a : null;
                Object b = io.reactivex.rxjava3.internal.operators.mixed.n.b(qn60Var.f(xle0Var, new aij0(new unq(faveType, faveTag, list == null || list.isEmpty()), pn60Var)));
                if (!(b instanceof Result.Failure)) {
                    qn60.c cVar2 = (qn60.c) b;
                    nn50Var.e(new hpq(new qr60.a.c(cVar2.a, cVar2.b, false, null, 24)));
                }
                Throwable a = Result.a(b);
                if (a != null) {
                    com.vk.metrics.eventtracking.b.a.a(a);
                    return null;
                }
            } else {
                mxf0 mxf0Var = new mxf0(faveEntry2, pn60Var);
                List<FavePage> list2 = tqqVar != null ? tqqVar.a : null;
                Object b2 = io.reactivex.rxjava3.internal.operators.mixed.n.b(qn60Var.f(mxf0Var, new aij0(new unq(faveType, faveTag, list2 == null || list2.isEmpty()), pn60Var)));
                if (!(b2 instanceof Result.Failure)) {
                    qn60.c cVar3 = (qn60.c) b2;
                    nn50Var.e(new hpq(new qr60.a.c(cVar3.a, cVar3.b, false, null, 24)));
                }
                Throwable a2 = Result.a(b2);
                if (a2 != null) {
                    com.vk.metrics.eventtracking.b.a.a(a2);
                }
            }
        }
        return null;
    }
}
