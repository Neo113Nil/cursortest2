package xsna;

import android.content.Context;
import com.vk.dto.common.Peer;
import xsna.odw;
import xsna.xwv;

/* compiled from: VkChannelsFeatureDependencies.kt */
/* loaded from: classes11.dex */
public final class kju0 implements zeb {
    public final a1w a;
    public final mxv b;
    public final b25 c;
    public final rxr d;
    public final odw e;
    public final xwv.b f;
    public final hju0 g;
    public final zyv h;
    public final rgb i;
    public final xgb j;
    public final tyx k;
    public final teb l;
    public final iju0 m;
    public final tkb n;
    public final lju0 o;
    public final wdj p;

    public kju0(Context context, mn8 mn8Var, a1w a1wVar, mxv mxvVar, ui70 ui70Var, b25 b25Var, h7v h7vVar, rxr rxrVar) {
        odw qdwVar;
        this.a = a1wVar;
        this.b = mxvVar;
        this.c = b25Var;
        this.d = rxrVar;
        Peer q = a1wVar.q();
        q.getClass();
        if (q.Ab(Peer.Type.GROUP)) {
            odw.a.getClass();
            qdwVar = odw.a.a();
        } else {
            qdwVar = new qdw(a1wVar, mxvVar.g());
        }
        this.e = qdwVar;
        d1w d1wVar = new d1w(a1wVar);
        this.f = new xwv.b();
        this.g = new hju0(mxvVar.k(), 0);
        zyv zyvVar = new zyv(new mju0(b25Var));
        this.h = zyvVar;
        rgb rgbVar = new rgb(new fuz(a1wVar), new suf0(a1wVar), new bib(a1wVar), d1wVar, new uvf0(a1wVar), e9w.b("ChannelsListLoader"));
        this.i = rgbVar;
        this.j = new xgb(new com.vk.channels.impl.list.loader.b(context, rgbVar, new rkb(a1wVar, new mkb(a1wVar), asu0.a, e9w.b("ChannelsListLoader")), new ikb(qdwVar), new tib(h7vVar, a1wVar), new eib(new fjk0(a1wVar))));
        this.k = new tyx();
        this.l = new teb(d1wVar, new iv3(a1wVar), e9w.b("ChannelsCountersObserver"));
        this.m = new iju0(mxvVar.k(), zyvVar);
        tkb tkbVar = new tkb();
        this.n = tkbVar;
        this.o = new lju0(a1wVar, tkbVar, context, ui70Var, b25Var);
        this.p = new wdj(this);
    }

    @Override // xsna.zeb
    public final wdj a() {
        return this.p;
    }

    @Override // xsna.zeb
    public final xgb b() {
        return this.j;
    }

    @Override // xsna.zeb
    public final fib c() {
        return this.h;
    }

    public final g9u0 d() {
        return new g9u0(this.a, this.d);
    }

    public final nju0 e() {
        return new nju0(this.c);
    }
}
