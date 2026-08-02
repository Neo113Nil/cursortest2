package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import com.yandex.go.loyalty.impl.selector.domain.model.LoyaltyProgramState;
import java.util.Iterator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class fia1 {
    public static xia1 a;

    public static final void a(ge geVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-795423426);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(geVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            qy20.a(null, null, null, false, wwg.S(-156306340, true, new u5(i4, geVar, tlsVar), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 15);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(geVar, tlsVar, i, i3);
        }
    }

    public static int b(int i, int i2) {
        return oyr.b(i, i2, 31);
    }

    public static final dvz c(lxz lxzVar) {
        Object obj;
        Iterator it = lxzVar.a.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((dvz) obj).d == LoyaltyProgramState.ENABLED) {
                break;
            }
        }
        return (dvz) obj;
    }

    public static final Rect d(f6w f6wVar) {
        return new Rect(f6wVar.a, f6wVar.b, f6wVar.c, f6wVar.d);
    }

    public static final Rect e(zii0 zii0Var) {
        return new Rect((int) zii0Var.a, (int) zii0Var.b, (int) zii0Var.c, (int) zii0Var.d);
    }

    public static final RectF f(zii0 zii0Var) {
        return new RectF(zii0Var.a, zii0Var.b, zii0Var.c, zii0Var.d);
    }

    public static final zii0 g(Rect rect) {
        return new zii0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final zii0 h(RectF rectF) {
        return new zii0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
