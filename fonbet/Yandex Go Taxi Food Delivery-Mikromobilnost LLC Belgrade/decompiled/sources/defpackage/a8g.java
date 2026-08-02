package defpackage;

import android.content.Context;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.data.a;
import com.yandex.messaging.data.e;

/* loaded from: classes15.dex */
public final class a8g implements j9b {
    public final o1b0 a;
    public final z8g b;
    public final p8g c;

    public a8g(z8g z8gVar, p8g p8gVar, o1b0 o1b0Var) {
        this.b = z8gVar;
        this.c = p8gVar;
        this.a = o1b0Var;
    }

    @Override // defpackage.j9b
    public final du10 a() {
        naz0 i = i();
        vcz0 b = b();
        naz0 i2 = i();
        p8g p8gVar = this.c;
        oy80 oy80Var = new oy80(15, i2, (at2) p8gVar.z.get());
        k020 k020Var = (k020) p8gVar.H.get();
        MessengerEnvironment messengerEnvironment = (MessengerEnvironment) p8gVar.i.get();
        z8g z8gVar = this.b;
        r1s r1sVar = new r1s(18, (p220) z8gVar.n.get(), (q220) z8gVar.x0.get(), (MessengerEnvironment) p8gVar.i.get());
        lqo lqoVar = z8gVar.a.d;
        q5z.i(lqoVar);
        return new du10(i, b, oy80Var, k020Var, messengerEnvironment, r1sVar, lqoVar, e(), (a) p8gVar.Q1.get(), new izy0((com.yandex.messaging.internal.backendconfig.a) p8gVar.t0.get()), (e) z8gVar.f0.get(), (tyf0) z8gVar.y0.get());
    }

    @Override // defpackage.j9b
    public final vcz0 b() {
        p8g p8gVar = this.c;
        return new vcz0(this.a, (at2) p8gVar.z.get(), (k020) p8gVar.H.get(), (Moshi) this.b.N.get());
    }

    @Override // defpackage.j9b
    public final p150 c() {
        Context context = this.b.a.a;
        q5z.i(context);
        p8g p8gVar = this.c;
        return new p150(context, this.a, (at2) p8gVar.z.get(), new oeb((at2) p8gVar.z.get()), p8gVar.h(), p8gVar.l(), i5m.a(p8gVar.B0));
    }

    @Override // defpackage.j9b
    public final ebb d() {
        p8g p8gVar = this.c;
        return new ebb((k020) p8gVar.H.get(), (at2) p8gVar.z.get(), this.a, new ui20(), (fbb) this.b.h0.get());
    }

    @Override // defpackage.j9b
    public final v0b e() {
        return new v0b(this.a, (wf4) this.c.s0.get());
    }

    @Override // defpackage.j9b
    public final r1s f() {
        return new r1s(17, (at2) this.c.z.get(), c(), i());
    }

    @Override // defpackage.j9b
    public final ymu g() {
        return new ymu(7, i(), (k020) this.c.H.get());
    }

    @Override // defpackage.j9b
    public final o1b0 h() {
        return this.a;
    }

    public final naz0 i() {
        p8g p8gVar = this.c;
        at2 at2Var = (at2) p8gVar.z.get();
        k020 k020Var = (k020) p8gVar.H.get();
        lqo lqoVar = this.b.a.d;
        q5z.i(lqoVar);
        return new naz0(this.a, at2Var, k020Var, lqoVar);
    }
}
