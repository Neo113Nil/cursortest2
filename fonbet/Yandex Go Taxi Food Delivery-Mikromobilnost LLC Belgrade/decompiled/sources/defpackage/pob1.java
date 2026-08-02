package defpackage;

import androidx.compose.foundation.text.selection.i;
import androidx.compose.foundation.text.selection.j;
import androidx.compose.runtime.internal.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class pob1 {
    public static final void a(i iVar, a aVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-614342087);
        int i2 = (btsVar.e(iVar) ? 4 : 2) | i;
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.e0(-1009319487);
            mn91.e(iVar.d(), aVar, btsVar, 48);
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new onc(iVar, aVar, i, i3);
        }
    }

    public static final void b(j jVar, a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1533506138);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(jVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(aVar) ? 32 : 16;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.e0(-885604480);
            mn91.e(jVar.i(), aVar, btsVar, i2 & 112);
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nnc(jVar, aVar, i, i3);
        }
    }

    public static final void c(nl30 nl30Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(482956404);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(nl30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            qy20.a(null, null, null, false, wwg.S(1122073490, true, new qk30(i3, nl30Var, tlsVar, new ll30(nl30Var.j, nl30Var.h)), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 15);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rk30(nl30Var, tlsVar, i, 0);
        }
    }

    public static final long d() {
        return Thread.currentThread().getId();
    }
}
