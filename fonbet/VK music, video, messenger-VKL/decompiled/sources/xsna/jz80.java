package xsna;

import com.vk.core.utils.newtork.NetworkState;
import com.vk.dto.common.id.UserId;
import io.opentelemetry.api.trace.SpanKind;
import io.reactivex.rxjava3.internal.functions.a;

/* compiled from: OtelApiChainCall.kt */
/* loaded from: classes.dex */
public final class jz80<T> extends ara<T> {
    public final wdp0 b;
    public final String c;
    public final long d;
    public final String e;
    public final ara<T> f;

    public jz80(wy2 wy2Var, wdp0 wdp0Var, String str, long j, String str2, ara araVar) {
        super(wy2Var);
        this.b = wdp0Var;
        this.c = str;
        this.d = j;
        this.e = str2;
        this.f = araVar;
    }

    @Override // xsna.ara
    public final T a(final zqa zqaVar) {
        T t;
        izs izsVar = new izs() { // from class: xsna.iz80
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                UserId userId;
                io.reactivex.rxjava3.disposables.c cVar;
                jz80 jz80Var = jz80.this;
                zqa zqaVar2 = zqaVar;
                ohk0 ohk0Var = (ohk0) obj;
                if (ohk0Var == null) {
                    return jz80Var.f.a(zqaVar2);
                }
                h7r0 h7r0Var = (h7r0) j5g.a0(jz80Var.a.i().e.getValue());
                if (h7r0Var == null || (userId = h7r0Var.e) == null) {
                    userId = UserId.d;
                }
                ohk0Var.m(userId.b, "user.id");
                ohk0Var.setAttribute("api.request_type", jz80Var.e);
                try {
                    com.vk.core.utils.newtork.b.a.getClass();
                    io.reactivex.rxjava3.subjects.d<NetworkState> dVar = com.vk.core.utils.newtork.b.e;
                    a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
                    dVar.getClass();
                    cVar = new io.reactivex.rxjava3.internal.operators.observable.y(dVar, qVar, io.reactivex.rxjava3.internal.functions.b.a).a0(io.reactivex.rxjava3.schedulers.a.c()).subscribe(new fs00(new h2s(ohk0Var, 27), 10));
                } catch (Throwable unused) {
                    cVar = null;
                }
                try {
                    return vhk0.h(jz80Var.b, "ChainCall", new ue40(3, jz80Var, zqaVar2), 6);
                } finally {
                }
            }
        };
        wdp0 wdp0Var = this.b;
        if (wdp0Var != null) {
            qhk0 i = ohk0.current().i();
            if (i.i() || !((sm5) i).f) {
                phk0 a = wdp0Var.a("Api Request");
                a.d(SpanKind.CLIENT);
                s3q0 s3q0Var = s3q0.a;
                ohk0 e = a.e();
                try {
                    v9h0 b = yxy.b.b(wmj.current().b(e).a(vhk0.b, e));
                    try {
                        Object invoke = e.i().i() ? izsVar.invoke(e) : izsVar.invoke(null);
                        yfb.d(b, null);
                        e.end();
                        t = (T) invoke;
                    } finally {
                    }
                } finally {
                }
            } else {
                t = (T) izsVar.invoke(null);
            }
            if (t != null) {
                return t;
            }
        }
        return (T) izsVar.invoke(null);
    }
}
