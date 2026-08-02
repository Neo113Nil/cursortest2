package xsna;

import com.vk.dto.stories.model.GetStoriesResponse;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import xsna.jm50;
import xsna.jv60;
import xsna.qn60;
import xsna.qr60;
import xsna.r070;
import xsna.xh60;

/* compiled from: NewsfeedStoriesTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class m070 extends evg0<qz60, on50, r070.k, r070, jv60, xh60> {
    public final qn60 f;
    public final pn60 g;
    public final cs60 h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m070(ot60 ot60Var, qn60 qn60Var, pn60 pn60Var, nn50 nn50Var) {
        super(r0, nn50Var);
        jm50.a aVar = jm50.a.a;
        this.f = qn60Var;
        this.g = pn60Var;
        this.h = new cs60(qn60Var, pn60Var, aVar, new eht(this, ot60Var));
    }

    public static void s(m070 m070Var, gzs gzsVar) {
        Object d = ((Result) gzsVar.invoke()).d();
        if (!(d instanceof Result.Failure)) {
            qn60.c cVar = (qn60.c) d;
            m070Var.e(new kv60(new qr60.a.c(cVar.a, cVar.b, false, null, 24)));
        }
        Throwable a = Result.a(d);
        if (a != null) {
            com.vk.metrics.eventtracking.b.a.a(a);
        }
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        r070.k kVar = (r070.k) hn50Var;
        if (kVar instanceof r070.k.d) {
            this.h.s(((r070.k.d) kVar).b);
            return null;
        }
        boolean z = kVar instanceof r070.k.e;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        if (z) {
            r070.k.e eVar = (r070.k.e) kVar;
            qz60 qz60Var = (qz60) nn50Var.getCurrentState();
            c(xh60.h.d.a);
            e(new jv60.e.a(eVar.b));
            s(this, new xah(this, qz60Var, eVar, 5));
            return null;
        }
        if (kVar instanceof z070) {
            c(new bi60(null, ((qz60) nn50Var.getCurrentState()).f));
            return null;
        }
        if (kVar instanceof r070.k.i) {
            c(new xh60.h.i(null, ((qz60) nn50Var.getCurrentState()).f));
            return null;
        }
        if (kVar instanceof r070.k.a) {
            c(new xh60.h.a(null, ((qz60) nn50Var.getCurrentState()).f));
            return null;
        }
        if (kVar instanceof r070.k.g) {
            c(new xh60.h.C4003h(null, ((qz60) nn50Var.getCurrentState()).f));
            return null;
        }
        if (kVar instanceof r070.k.f) {
            c(new xh60.h.e(null, ((qz60) nn50Var.getCurrentState()).f));
            return null;
        }
        if (kVar instanceof r070.k.b) {
            ((r070.k.b) kVar).getClass();
            c(new xh60.h.b(true));
            return null;
        }
        if (kVar instanceof r070.k.c) {
            if (com.vk.toggle.d.e().a) {
                a(new r070.k.b());
                c(xh60.h.c.a);
                return null;
            }
        } else {
            if (!(kVar instanceof r070.k.h)) {
                throw new NoWhenBranchMatchedException();
            }
            qz60 qz60Var2 = (qz60) nn50Var.getCurrentState();
            GetStoriesResponse getStoriesResponse = qz60Var2.f.a;
            GetStoriesResponse getStoriesResponse2 = ((r070.k.h) kVar).b.a;
            if (getStoriesResponse == getStoriesResponse2) {
                k070 k070Var = new k070(getStoriesResponse2);
                e(new jv60.e.a(k070Var));
                s(this, new q34(this, qz60Var2, k070Var, 5));
            }
        }
        return null;
    }
}
