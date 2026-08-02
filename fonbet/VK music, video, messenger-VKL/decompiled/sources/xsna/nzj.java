package xsna;

import com.vk.ecomm.cart.impl.common.models.geo.Address;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.jt0;
import xsna.mzj;
import xsna.pk00;

/* compiled from: CourierMapReducer.kt */
/* loaded from: classes18.dex */
public final class nzj extends dm50<vzj, mzj, tzj> {
    public final zyj d;
    public final sdy e;
    public final fl00 f;
    public final qk00 g;

    public nzj(tzj tzjVar) {
        super(tzjVar);
        this.d = new zyj();
        this.e = new sdy();
        this.f = new fl00();
        this.g = new qk00(0);
    }

    @Override // xsna.dm50
    public final tzj c(tzj tzjVar, mzj mzjVar) {
        jt0 bVar;
        jt0 cVar;
        tzj tzjVar2 = tzjVar;
        mzj mzjVar2 = mzjVar;
        tj00 tj00Var = tzjVar2.b;
        jt0 jt0Var = tzjVar2.c;
        if (mzjVar2 instanceof mzj.c) {
            mzj.c cVar2 = (mzj.c) mzjVar2;
            if (cVar2 instanceof mzj.c.e) {
                Address address = ((mzj.c.e) cVar2).b;
                return tzj.a(tzjVar2, null, null, address.b, address.e != null ? address : null, null, true, 35);
            }
            if (cVar2 instanceof mzj.c.d) {
                return tzj.a(tzjVar2, null, null, null, null, null, true, 47);
            }
            if (cVar2 instanceof mzj.c.C3379c) {
                return tzj.a(tzjVar2, null, null, null, null, null, false, 95);
            }
            if (cVar2 instanceof mzj.c.a) {
                return tzj.a(tzjVar2, null, null, null, null, ((mzj.c.a) cVar2).b, false, 47);
            }
            if (cVar2 instanceof mzj.c.b) {
                return tzj.a(tzjVar2, null, null, null, null, null, false, 47);
            }
            throw new NoWhenBranchMatchedException();
        }
        jt0 jt0Var2 = null;
        if (mzjVar2 instanceof mzj.e) {
            mzj.e eVar = (mzj.e) mzjVar2;
            if (eVar instanceof mzj.e.b) {
                return tzj.a(tzjVar2, null, null, null, null, null, true, 63);
            }
            if (eVar instanceof mzj.e.a) {
                return tzj.a(tzjVar2, null, null, null, null, null, false, 63);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (mzjVar2 instanceof mzj.d) {
            pk00 pk00Var = ((mzj.d) mzjVar2).b;
            tj00 a = this.g.a(tj00Var, pk00Var);
            if (pk00Var instanceof pk00.b) {
                return tzj.a(tzjVar2, a, null, null, null, null, false, 62);
            }
            if (!(pk00Var instanceof pk00.c)) {
                return tzj.a(tzjVar2, a, null, null, null, null, false, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            }
            if (jt0Var != null) {
                jt0Var2 = jt0Var.a(false);
            }
            return tzj.a(tzjVar2, a, jt0Var2, null, null, null, false, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        }
        if (mzjVar2 instanceof mzj.a) {
            mzj.a aVar = (mzj.a) mzjVar2;
            if (aVar instanceof mzj.a.b) {
                if (jt0Var != null) {
                    jt0Var2 = jt0Var.a(false);
                }
                return tzj.a(tzjVar2, null, jt0Var2, null, null, null, false, 125);
            }
            if (!(aVar instanceof mzj.a.C3378a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (jt0Var != null) {
                jt0Var2 = jt0Var.a(true);
            }
            return tzj.a(tzjVar2, null, jt0Var2, null, null, null, false, 125);
        }
        if (!(mzjVar2 instanceof mzj.b)) {
            throw new NoWhenBranchMatchedException();
        }
        mzj.b bVar2 = (mzj.b) mzjVar2;
        if (!tj00Var.c) {
            if (bVar2.c != null) {
                return tzj.a(tzjVar2, null, new jt0.a(true), null, null, null, false, 125);
            }
            qnt qntVar = bVar2.b;
            if (qntVar != null) {
                ArrayList arrayList = qntVar.a;
                if (arrayList.isEmpty()) {
                    bVar = new jt0.a(true);
                } else {
                    d03 d03Var = (d03) j5g.Y(arrayList);
                    String str = d03Var.j;
                    String str2 = d03Var.h;
                    if (epx.f(str, "RU")) {
                        boolean z = !(str2 == null || str2.length() == 0);
                        String str3 = d03Var.f;
                        String str4 = d03Var.d;
                        if (str4 == null) {
                            str4 = d03Var.e;
                        }
                        String r = rli0.r(rli0.m(rl3.D(new String[]{str3, str4, str2})), ", ", null, 62);
                        if (r.length() == 0) {
                            r = d03Var.a;
                        }
                        cVar = new jt0.c(r, z, true);
                        return tzj.a(tzjVar2, null, cVar, null, null, null, false, 125);
                    }
                    bVar = new jt0.b(true);
                }
                cVar = bVar;
                return tzj.a(tzjVar2, null, cVar, null, null, null, false, 125);
            }
        }
        return tzjVar2;
    }

    @Override // xsna.dm50
    public final vzj d() {
        return new vzj(e(new w5(this, 28)), e(new dhh(this, 5)));
    }

    @Override // xsna.dm50
    public final void h(tzj tzjVar, vzj vzjVar) {
        tzj tzjVar2 = tzjVar;
        vzj vzjVar2 = vzjVar;
        if (tzjVar2.f != null) {
            f(vzjVar2.b, tzjVar2);
        } else {
            f(vzjVar2.a, tzjVar2);
        }
    }
}
