package com.yandex.passport.internal.ui.bouncer.challenge;

import com.yandex.passport.internal.properties.u;
import com.yandex.passport.internal.ui.challenge.v;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.jiu;
import defpackage.tls;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes2.dex */
public final class f implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ v b;
    public final /* synthetic */ g c;

    public /* synthetic */ f(v vVar, g gVar, int i) {
        this.a = i;
        this.b = vVar;
        this.c = gVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = 0;
        g gVar = this.c;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        break;
                    }
                }
                com.yandex.passport.common.ui.progress.g a = com.yandex.passport.api.mapper.b.a(gVar.D);
                bts btsVar2 = (bts) fidVar;
                btsVar2.e0(1533724928);
                Object Q = btsVar2.Q();
                if (Q == did.a) {
                    Q = new jiu(13);
                    btsVar2.o0(Q);
                }
                tls tlsVar = (tls) Q;
                btsVar2.t(false);
                com.yandex.passport.common.ui.progress.g gVar2 = com.yandex.passport.common.ui.progress.g.e;
                u.a(this.b, a, null, tlsVar, btsVar2, HProv.ALG_TYPE_SECURECHANNEL, 4);
                break;
            default:
                fid fidVar2 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.E()) {
                        btsVar3.Y();
                        break;
                    }
                }
                com.yandex.passport.common.ui.compose.theme.e.a(false, com.yandex.passport.internal.di.a.a().getProperties().w, wwg.S(918384242, true, new f(this.b, gVar, i2), fidVar2), fidVar2, 384, 1);
                break;
        }
        return zy11Var;
    }
}
