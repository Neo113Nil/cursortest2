package xsna;

import com.vk.dto.common.id.UserId;
import kotlin.NoWhenBranchMatchedException;
import xsna.pwh;

/* compiled from: CommunityRepliesReducer.kt */
/* loaded from: classes18.dex */
public final class uwh extends dm50<wwh, pwh, vwh> {
    public final xwh d;

    public uwh(sdz sdzVar) {
        super(new vwh(0));
        this.d = new xwh(sdzVar);
    }

    @Override // xsna.dm50
    public final vwh c(vwh vwhVar, pwh pwhVar) {
        vwh vwhVar2 = vwhVar;
        pwh pwhVar2 = pwhVar;
        if (pwhVar2 instanceof pwh.a) {
            return vwh.a(vwhVar2, 0, null, null, ((pwh.a) pwhVar2).b, 0, 0, null, null, null, null, false, null, false, false, false, false, null, 262135);
        }
        if (pwhVar2.equals(pwh.c.b)) {
            return vwh.a(vwhVar2, 0, null, null, false, 0, 0, null, null, null, null, true, null, false, false, false, false, null, 197631);
        }
        if (pwhVar2.equals(pwh.b.b)) {
            return vwh.a(vwhVar2, 0, null, null, false, 0, 0, null, null, null, null, false, null, false, false, false, false, null, 131071);
        }
        if (pwhVar2.equals(pwh.f.b)) {
            return vwh.a(vwhVar2, 0, null, null, false, 0, 0, null, null, null, null, false, null, true, false, false, false, null, 206799);
        }
        if (pwhVar2.equals(pwh.h.b)) {
            return vwh.a(vwhVar2, 0, null, null, false, 0, 0, null, null, null, null, false, null, false, true, false, false, null, 202751);
        }
        if (pwhVar2.equals(qwh.b)) {
            return vwh.a(vwhVar2, 0, null, null, false, 0, 0, null, null, yig0.a(vwhVar2.j, null, 8), null, false, null, false, false, false, false, null, 163583);
        }
        if (pwhVar2 instanceof swh) {
            return vwh.a(vwhVar2, 0, null, null, false, 0, 0, null, null, null, null, false, null, false, false, false, false, Integer.valueOf(((swh) pwhVar2).b), 196607);
        }
        if (pwhVar2 instanceof pwh.d) {
            pwh.d dVar = (pwh.d) pwhVar2;
            return vwh.a(vwhVar2, 0, null, null, false, dVar.e, dVar.b, dVar.c, dVar.d, null, dVar.f, false, null, false, false, false, false, null, 196879);
        }
        if (pwhVar2.equals(pwh.k.b)) {
            return vwh.a(vwhVar2, 0, null, null, false, 0, 0, null, null, null, null, false, null, false, false, true, false, null, 243711);
        }
        if (pwhVar2 instanceof pwh.e) {
            pwh.e eVar = (pwh.e) pwhVar2;
            return vwh.a(vwhVar2, 0, null, null, false, eVar.d, eVar.b, null, eVar.c, null, eVar.e, false, null, false, false, false, false, null, 196943);
        }
        if (pwhVar2 instanceof pwh.g) {
            return vwh.a(vwhVar2, 0, null, null, false, 0, 0, null, null, null, null, false, ((pwh.g) pwhVar2).b, false, false, false, false, null, 243711);
        }
        if (pwhVar2 instanceof rwh) {
            yig0 yig0Var = vwhVar2.j;
            rwh rwhVar = (rwh) pwhVar2;
            Integer num = rwhVar.c;
            Integer num2 = rwhVar.b;
            UserId userId = rwhVar.d;
            UserId userId2 = rwhVar.e;
            yig0Var.getClass();
            return vwh.a(vwhVar2, 0, null, null, false, 0, 0, null, null, new yig0(num, num2, userId, userId2), null, false, null, false, false, false, false, null, 261887);
        }
        if (pwhVar2 instanceof twh) {
            return vwh.a(vwhVar2, 0, null, null, false, 0, 0, null, null, yig0.a(vwhVar2.j, ((twh) pwhVar2).b, 7), null, false, null, false, false, false, false, null, 261887);
        }
        if (pwhVar2 instanceof pwh.j) {
            pwh.j jVar = (pwh.j) pwhVar2;
            UserId userId3 = jVar.b;
            return vwh.a(vwhVar2, jVar.d, jVar.c, userId3, false, 0, 0, null, null, null, null, false, null, false, false, false, false, null, 245752);
        }
        if (pwhVar2 instanceof pwh.l) {
            return vwh.a(vwhVar2, 0, null, null, false, 0, 0, null, ((pwh.l) pwhVar2).b, null, null, false, null, false, false, false, false, null, 98175);
        }
        if (pwhVar2 instanceof pwh.m) {
            return vwh.a(vwhVar2, 0, null, null, false, 0, 0, ((pwh.m) pwhVar2).b, null, null, null, false, null, false, false, false, false, null, 229311);
        }
        if (pwhVar2 instanceof pwh.i) {
            return vwh.a(vwhVar2, 0, null, null, false, 0, 0, null, null, null, null, false, null, false, false, false, ((pwh.i) pwhVar2).b, null, 229375);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final wwh d() {
        return new wwh(e(new n1d(this, 9)), e(new c2(21)), e(new wq3(17)), e(new y40(19)));
    }

    @Override // xsna.dm50
    public final void h(vwh vwhVar, wwh wwhVar) {
        vwh vwhVar2 = vwhVar;
        wwh wwhVar2 = wwhVar;
        if (vwhVar2.o) {
            f(wwhVar2.d, vwhVar2);
            return;
        }
        if (vwhVar2.n) {
            f(wwhVar2.c, vwhVar2);
        } else if (vwhVar2.l) {
            f(wwhVar2.b, vwhVar2);
        } else {
            f(wwhVar2.a, vwhVar2);
        }
    }
}
