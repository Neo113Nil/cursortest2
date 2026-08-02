package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptySet;
import xsna.qmw0;

/* compiled from: VoipChatInfoProviderImpl.kt */
/* loaded from: classes7.dex */
public final class rmw0 implements qmw0 {
    @Override // xsna.qmw0
    public final io.reactivex.rxjava3.core.q<qmw0.a> a(long j) {
        if (j == 0) {
            return io.reactivex.rxjava3.core.q.T(new qmw0.a(0, EmptySet.b));
        }
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        List l = e43.l(Source.CACHE, Source.ACTUAL);
        zxp zxpVar = a1wVar.l;
        List<Source> list = l;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (Source source : list) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList.add(new io.reactivex.rxjava3.internal.operators.observable.i0(a1wVar.C(this, new tqm(Peer.a.b(j), source)).w(), new z7(new i1w(j), 28)).U(new b8(new m1w(j), 27)));
        }
        io.reactivex.rxjava3.core.q r = io.reactivex.rxjava3.core.q.r(arrayList);
        int i = 26;
        io.reactivex.rxjava3.internal.operators.observable.j1 U = new io.reactivex.rxjava3.internal.operators.observable.i0(zxpVar.a().b0(r480.class), new r2v(new x96(j), 1)).U(new q7(new j1w(j), i));
        int i2 = 24;
        io.reactivex.rxjava3.core.q<R> s0 = new io.reactivex.rxjava3.internal.operators.observable.i0(zxpVar.a(), new s7(new sm0(29), 17)).s0(new bl(new k1w(j, a1wVar, this), i2));
        w7 w7Var = new w7(new b37(j, 1), i2);
        s0.getClass();
        io.reactivex.rxjava3.core.q n0 = io.reactivex.rxjava3.core.q.X(U, new io.reactivex.rxjava3.internal.operators.observable.i0(s0, w7Var).U(new y7(new l1w(j), i))).n0(r);
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        n0.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.y(n0, qVar, io.reactivex.rxjava3.internal.functions.b.a).r0(io.reactivex.rxjava3.schedulers.a.b()).U(new oe40(new j6e0(22), 19));
    }
}
