package xsna;

import com.vk.channels.api.Channel;
import com.vk.im.engine.models.im_item.ImItemType;
import java.util.Collections;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.pdg0;

/* compiled from: ChannelDataSource.kt */
/* loaded from: classes16.dex */
public final class lxa implements ixa {
    public final long a;
    public final a1w b;
    public final io.reactivex.rxjava3.disposables.b c;
    public final io.reactivex.rxjava3.subjects.d<Channel> d;
    public final io.reactivex.rxjava3.internal.operators.observable.y e;

    public lxa(long j, a1w a1wVar) {
        this.a = j;
        this.b = a1wVar;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.c = bVar;
        io.reactivex.rxjava3.subjects.d<Channel> N0 = io.reactivex.rxjava3.subjects.d.N0();
        this.d = N0;
        c();
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(3, new io.reactivex.rxjava3.internal.operators.observable.i0(a1wVar.l.a(), new ox0(new pd(this, 17), 9)), null, null, new r6(this, 13)));
        this.e = new io.reactivex.rxjava3.internal.operators.observable.y(N0, io.reactivex.rxjava3.internal.functions.a.a, new ql2(new kxa((byte) 0, 0), 8));
    }

    @Override // xsna.ixa
    public final io.reactivex.rxjava3.internal.operators.observable.y a() {
        return this.e;
    }

    @Override // xsna.ixa
    public final Channel b() {
        return this.d.P0();
    }

    public final void c() {
        a1w a1wVar = this.b;
        boolean n = a1wVar.r().h.n();
        int i = 12;
        io.reactivex.rxjava3.disposables.b bVar = this.c;
        long j = this.a;
        if (n) {
            io.reactivex.rxjava3.internal.operators.mixed.q qVar = new io.reactivex.rxjava3.internal.operators.mixed.q(a1wVar.C(this, new kza(j, false)).q(asu0.a.c()), new xl0(new wl0(this, i), 11));
            int i2 = kwg0.a;
            bVar.b(io.reactivex.rxjava3.kotlin.c.f(2, qVar, null, new nu2("ChannelDataSourceImpl", 2), new com.vk.movika.sdk.base.logic.interactor.d(this, 22)));
        } else {
            io.reactivex.rxjava3.internal.operators.single.f0 q = a1wVar.C(this, new kza(j, false)).q(asu0.a.c());
            int i3 = kwg0.a;
            bVar.b(io.reactivex.rxjava3.kotlin.c.e(q, new nu2("ChannelDataSourceImpl", 2), new com.vk.movika.sdk.base.logic.interactor.e(this, i)));
        }
    }

    public final x7w d() {
        Object obj;
        b5w b5wVar = new b5w(this.a, ImItemType.CHANNEL);
        pdg0 n = this.b.n(this, new a8w(Collections.singletonList(b5wVar)));
        if (n instanceof pdg0.a) {
            obj = jgp.b;
        } else {
            if (!(n instanceof pdg0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            obj = ((pdg0.b) n).a;
        }
        return (x7w) ((Map) obj).getOrDefault(b5wVar, x7w.f);
    }

    @Override // xsna.ixa
    public final void destroy() {
        this.c.dispose();
    }
}
