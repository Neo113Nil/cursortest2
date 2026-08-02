package xsna;

import com.vk.voip.dto.call_member.CallMemberId;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.participant.movie.Movie;
import xsna.wja0;
import xsna.xja0;

/* compiled from: PictureInPictureFeature.kt */
/* loaded from: classes7.dex */
public final class vja0 {
    public final com.vk.voip.ui.c a;
    public final io.reactivex.rxjava3.subjects.d<xja0> b = io.reactivex.rxjava3.subjects.d.O0(xja0.b.a);
    public final io.reactivex.rxjava3.core.w c = asu0.a.d();
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();
    public final xo9 e = new xo9();
    public boolean f = true;

    public vja0(com.vk.voip.ui.c cVar) {
        this.a = cVar;
    }

    public final synchronized void a() {
        if (this.f) {
            this.d.e();
            this.d.dispose();
            xja0.b bVar = xja0.b.a;
            synchronized (this) {
                if (this.f) {
                    this.b.onNext(bVar);
                }
                this.f = false;
            }
        }
    }

    public final CallMemberId b() {
        Object obj;
        Object obj2;
        com.vk.voip.ui.c cVar = this.a;
        dhw0 L = cVar.L();
        CallMemberId a = com.vk.voip.ui.c.r.a();
        CallMemberId c0 = cVar.c0();
        this.e.getClass();
        if (L != null && L.D) {
            CallMemberId callMemberId = L.z;
            CallMemberId callMemberId2 = L.y;
            Map<CallMemberId, List<Movie>> map = L.q;
            Iterator<T> it = map.keySet().iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                List<Movie> list = map.get((CallMemberId) obj2);
                if (list != null && !list.isEmpty()) {
                    break;
                }
            }
            CallMemberId callMemberId3 = (CallMemberId) obj2;
            Iterator<T> it2 = L.r.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (!epx.f((CallMemberId) next, a)) {
                    obj = next;
                    break;
                }
            }
            CallMemberId callMemberId4 = (CallMemberId) obj;
            CallMemberId callMemberId5 = L.m;
            if (callMemberId != null && !callMemberId.equals(a)) {
                return callMemberId;
            }
            if (callMemberId2 != null && !callMemberId2.equals(a)) {
                return callMemberId2;
            }
            if (callMemberId3 != null) {
                return callMemberId3;
            }
            if (callMemberId4 != null) {
                return callMemberId4;
            }
            if (callMemberId5 != null && !callMemberId5.equals(a)) {
                return callMemberId5;
            }
        }
        return c0;
    }

    public final void c(wja0 wja0Var) {
        if (!(wja0Var instanceof wja0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        io.reactivex.rxjava3.disposables.b bVar = this.d;
        bVar.e();
        this.a.getClass();
        io.reactivex.rxjava3.internal.operators.observable.j1 U = com.vk.voip.ui.c.H0(true).U(new pi40(new viu(13), 3));
        io.reactivex.rxjava3.internal.operators.observable.j1 U2 = com.vk.voip.ui.c.G0(true).U(new xq70(new lw20(this, 15), 1));
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
        io.reactivex.rxjava3.internal.operators.observable.y yVar = new io.reactivex.rxjava3.internal.operators.observable.y(U2, qVar, aVar);
        io.reactivex.rxjava3.internal.operators.observable.y yVar2 = new io.reactivex.rxjava3.internal.operators.observable.y(com.vk.voip.ui.c.G0(true).U(new com.vk.movika.sdk.base.hooks.f(new t440(this, 8), 27)), qVar, aVar);
        io.reactivex.rxjava3.internal.operators.observable.y H0 = com.vk.voip.ui.c.H0(true);
        io.reactivex.rxjava3.internal.operators.observable.y G0 = com.vk.voip.ui.c.G0(true);
        ysg0<Object> ysg0Var = ysg0.b;
        io.reactivex.rxjava3.core.q o0 = io.reactivex.rxjava3.core.q.l(H0, io.reactivex.rxjava3.core.q.s(io.reactivex.rxjava3.core.q.T(new wgw0()), ysg0Var.a.b0(wgw0.class)), G0, new lmc()).o0(new io.reactivex.rxjava3.internal.operators.single.v(new uja0(this, 0)));
        o0.getClass();
        io.reactivex.rxjava3.internal.operators.observable.y yVar3 = new io.reactivex.rxjava3.internal.operators.observable.y(o0, qVar, aVar);
        int i = 10;
        io.reactivex.rxjava3.internal.operators.observable.j1 U3 = com.vk.voip.ui.c.G0(true).U(new o40(new kb40(this, i), 29));
        io.reactivex.rxjava3.core.q o02 = ysg0Var.a.b0(h3x0.class).U(new p5w(new xgv(this, 22), i)).o0(new io.reactivex.rxjava3.internal.operators.single.v(new u0n(this, 2)));
        o02.getClass();
        io.reactivex.rxjava3.core.q m = io.reactivex.rxjava3.core.q.m(new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.y(o02, qVar, aVar), qVar, aVar), new io.reactivex.rxjava3.internal.operators.observable.y(com.vk.voip.ui.c.G0(true), qVar, aVar), new mnh0());
        m.getClass();
        io.reactivex.rxjava3.internal.operators.observable.y yVar4 = new io.reactivex.rxjava3.internal.operators.observable.y(m, qVar, aVar);
        r4x0 I = com.vk.voip.ui.c.I();
        I.getClass();
        io.reactivex.rxjava3.core.q g = io.reactivex.rxjava3.core.q.g(U, yVar, yVar2, yVar3, U3, yVar4, I.g.a(true, new rqs0(I, 9)).U(new mh40(new b4r(23), 6)), new fsk());
        g.getClass();
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(g, qVar, aVar).a0(this.c).subscribe(new kjs(new mgz(this, 21), 12)));
    }
}
