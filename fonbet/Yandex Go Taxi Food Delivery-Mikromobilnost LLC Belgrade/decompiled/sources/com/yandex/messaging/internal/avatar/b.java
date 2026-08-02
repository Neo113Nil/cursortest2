package com.yandex.messaging.internal.avatar;

import androidx.compose.runtime.f;
import com.yandex.images.ImageManager$From;
import com.yandex.messaging.profile.d;
import defpackage.a16;
import defpackage.ad7;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.jl40;
import defpackage.ncf;
import defpackage.ob61;
import defpackage.oz40;
import defpackage.pa90;
import defpackage.tb61;
import defpackage.u92;
import defpackage.unr0;
import defpackage.vb61;
import defpackage.wb61;
import defpackage.wls;
import defpackage.xb61;
import defpackage.yb61;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes15.dex */
public final class b implements tb61 {
    public final d a;
    public final ob61 b = new ob61(1);

    public b(d dVar) {
        this.a = dVar;
    }

    public static pa90 b(wls wlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(85778503);
        btsVar.e0(-134415781);
        int i2 = i & 14;
        boolean z = ((i2 ^ 6) > 4 && btsVar.k(wlsVar)) || (i & 6) == 4;
        Object Q = btsVar.Q();
        if (z || Q == did.a) {
            Q = f.j(null);
            btsVar.o0(Q);
        }
        oz40 oz40Var = (oz40) Q;
        btsVar.t(false);
        if (oz40Var.getValue() == null) {
            Object obj = (pa90) wlsVar.invoke(btsVar, Integer.valueOf(i2));
            if (obj == null) {
                obj = yb61.y;
            }
            oz40Var.setValue(obj);
        }
        pa90 pa90Var = (pa90) oz40Var.getValue();
        if (pa90Var == null) {
            pa90Var = yb61.y;
        }
        btsVar.t(false);
        return pa90Var;
    }

    public final pa90 a(Object obj, wls wlsVar, wls wlsVar2, fid fidVar, int i) {
        pa90 pa90Var;
        bts btsVar = (bts) fidVar;
        btsVar.e0(62166634);
        int i2 = i >> 6;
        btsVar.e0(1977095015);
        vb61 vb61Var = vb61.a;
        btsVar.e0(-2060745817);
        boolean e = btsVar.e(obj) | btsVar.e(this);
        Object Q = btsVar.Q();
        Object obj2 = did.a;
        if (e || Q == obj2) {
            Q = new Yx360ImageLoaderImpl$rememberImageDrawableState$1$1(obj, this, null);
            btsVar.o0(Q);
        }
        btsVar.t(false);
        xb61 xb61Var = (xb61) f.l(vb61Var, obj, (wls) Q, btsVar, 6).getValue();
        btsVar.t(false);
        if (xb61Var instanceof wb61) {
            btsVar.e0(97315701);
            wb61 wb61Var = (wb61) xb61Var;
            ad7 ad7Var = wb61Var.a;
            int i3 = i & 112;
            btsVar.e0(2038688604);
            boolean z = ad7Var.d != ImageManager$From.MEMORY;
            btsVar.e0(-1431035499);
            boolean k = btsVar.k(wb61Var);
            Object Q2 = btsVar.Q();
            if (k || Q2 == obj2) {
                Q2 = new a16(new u92(ad7Var.a));
                btsVar.o0(Q2);
            }
            a16 a16Var = (a16) Q2;
            btsVar.t(false);
            pa90 pa90Var2 = a16Var;
            if (z) {
                pa90 b = b(wlsVar, btsVar, (i3 >> 3) & HProv.PP_DELETE_SAVED_PASSWD);
                btsVar.e0(-1431029208);
                boolean k2 = btsVar.k(b) | btsVar.k(a16Var);
                Object Q3 = btsVar.Q();
                if (k2 || Q3 == obj2) {
                    Q3 = new ncf(b, a16Var);
                    btsVar.o0(Q3);
                }
                btsVar.t(false);
                pa90Var2 = (ncf) Q3;
            }
            btsVar.t(false);
            btsVar.t(false);
            pa90Var = pa90Var2;
        } else if (jl40.l(xb61Var, vb61Var)) {
            btsVar.e0(97318329);
            btsVar.t(false);
            pa90Var = yb61.y;
        } else if (jl40.l(xb61Var, vb61.b)) {
            btsVar.e0(97320139);
            pa90 b2 = b(wlsVar2, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
            pa90Var = b2;
        } else {
            if (!jl40.l(xb61Var, vb61.c)) {
                throw unr0.y(97313790, btsVar, false);
            }
            btsVar.e0(97322801);
            pa90 b3 = b(wlsVar, btsVar, (i >> 3) & 14);
            btsVar.t(false);
            pa90Var = b3;
        }
        btsVar.t(false);
        return pa90Var;
    }
}
