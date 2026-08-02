package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.dto.newsfeed.SituationalSuggest;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import xsna.awg0;
import xsna.jm50;
import xsna.jv60;
import xsna.qn60;
import xsna.qr60;
import xsna.r070;

/* compiled from: NewsfeedSitpostingTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class oz60 extends evg0<qz60, on50, r070.j, r070, jv60, xh60> {
    public final bpn0 f;
    public final qn60 g;
    public final pn60 h;

    public oz60(st60 st60Var, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = st60Var.c;
        es60 es60Var = st60Var.a;
        this.g = es60Var.a;
        this.h = es60Var.b;
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        final r070.j jVar = (r070.j) hn50Var;
        boolean z = jVar instanceof r070.j.b;
        bpn0 bpn0Var = this.f;
        if (z) {
            s1v s1vVar = ((axj0) bpn0Var.getValue()).b;
            xgx xgxVar = new xgx("internal.getSituationalSuggest");
            xgxVar.K("fields", "photo");
            xgxVar.C(1, "extended");
            io.reactivex.rxjava3.internal.operators.observable.o1 c0 = rsg0.y0(xgxVar, null, null, 3).c0(new zwj0());
            mz60 mz60Var = new mz60(0, this, jVar);
            int i = kwg0.a;
            return awg0.a.b(this, c0, new hwg0(), null, mz60Var, 2);
        }
        if (jVar instanceof r070.j.c) {
            sd9 sd9Var = ((axj0) bpn0Var.getValue()).a;
            io.reactivex.rxjava3.internal.operators.observable.j1 U = wmi0.a.i("publishSuggest", true).U(new yzt(new oi40(15), 13));
            io.reactivex.rxjava3.functions.f fVar = new io.reactivex.rxjava3.functions.f() { // from class: xsna.nz60
                @Override // io.reactivex.rxjava3.functions.f
                public final void accept(Object obj) {
                    xwj0 xwj0Var = (xwj0) obj;
                    jv60.d.a aVar = new jv60.d.a(xwj0Var.a);
                    oz60 oz60Var = oz60.this;
                    oz60Var.e(aVar);
                    oz60Var.s(xwj0Var.a, ((r070.j.c) jVar).b);
                }
            };
            int i2 = kwg0.a;
            return awg0.a.b(this, U, new hwg0(), null, fVar, 2);
        }
        if (jVar instanceof r070.j.e) {
            t(null, 0);
            return null;
        }
        if (jVar instanceof r070.j.d) {
            s(null, 0);
            return null;
        }
        if (!(jVar instanceof r070.j.a)) {
            if (jVar instanceof x070) {
                e(jv60.d.c.a);
                return v(((x070) jVar).b, CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
            }
            if (!(jVar instanceof y070)) {
                throw new NoWhenBranchMatchedException();
            }
            e(jv60.d.c.a);
            return v(((y070) jVar).b, "swipe");
        }
        r070.j.a aVar = (r070.j.a) jVar;
        ce60.b.getClass();
        ce60.g();
        Object b = io.reactivex.rxjava3.internal.operators.mixed.n.b(this.g.f(new uxf0()));
        if (!(b instanceof Result.Failure)) {
            qn60.c cVar = (qn60.c) b;
            e(new kv60(new qr60.a.c(cVar.a, cVar.b, false, null, 24)));
        }
        Throwable a = Result.a(b);
        if (a != null) {
            com.vk.metrics.eventtracking.b.a.a(a);
        }
        e(jv60.d.c.a);
        int i3 = aVar.b.b;
        ce60.g();
        wmi0.a.c("publishSuggest");
        mvf mvfVar = new mvf("internal.closeSituationalSuggest", 0);
        mvfVar.C(i3, "suggest_id");
        mvfVar.K("close_type", CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
        mvfVar.k = true;
        return awg0.a.b(this, rsg0.y0(mvfVar, null, null, 3), new iq60(1), new va4(0), null, 4);
    }

    public final void s(SituationalSuggest situationalSuggest, int i) {
        qz60 qz60Var = (qz60) this.b.getCurrentState();
        if (qz60Var.c == 0) {
            pz60 pz60Var = qz60Var.g;
            if (pz60Var.b) {
                x(true, new lb6(18, this, situationalSuggest));
            } else {
                situationalSuggest = pz60Var.a;
            }
            w(situationalSuggest, i);
        }
    }

    public final void t(SituationalSuggest situationalSuggest, int i) {
        if (((qz60) this.b.getCurrentState()).c == 0) {
            if (situationalSuggest == null) {
                ce60.b.getClass();
                ce60.g();
                wmi0.a.c("publishSuggest");
            } else {
                wmi0.a.a("publishSuggest", situationalSuggest);
            }
            e(new jv60.d.b(situationalSuggest));
            x(true, new cy0(20, this, situationalSuggest));
            w(situationalSuggest, i);
        }
    }

    public final yvg0 v(SituationalSuggest situationalSuggest, String str) {
        int i = situationalSuggest.b;
        ce60.b.getClass();
        ce60.g();
        wmi0.a.c("publishSuggest");
        mvf mvfVar = new mvf("internal.closeSituationalSuggest", 0);
        mvfVar.C(i, "suggest_id");
        mvfVar.K("close_type", str);
        mvfVar.k = true;
        return awg0.a.b(this, rsg0.y0(mvfVar, null, null, 3), new ymg(1), new va4(0), null, 4);
    }

    public final void w(SituationalSuggest situationalSuggest, int i) {
        if (situationalSuggest != null && "float".equals(situationalSuggest.c) && i == 0) {
            c(new ai60(situationalSuggest));
        } else {
            c(yh60.a);
        }
    }

    public final void x(boolean z, gzs<Result<qn60.c>> gzsVar) {
        Object d = gzsVar.invoke().d();
        if (!(d instanceof Result.Failure)) {
            qn60.c cVar = (qn60.c) d;
            e(new kv60(new qr60.a.c(cVar.a, cVar.b, z, null, 24)));
        }
        Throwable a = Result.a(d);
        if (a != null) {
            com.vk.metrics.eventtracking.b.a.a(a);
        }
    }
}
