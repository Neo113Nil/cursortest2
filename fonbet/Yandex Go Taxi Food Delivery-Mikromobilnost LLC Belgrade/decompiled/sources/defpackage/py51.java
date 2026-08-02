package defpackage;

import com.yandex.go.yb.api.domain.model.YbSdkPaymentMethodInfo$ProductType;
import com.yandex.go.yb.data.e;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class py51 {
    public final e a;
    public final qy51 b;

    public py51(e eVar, qy51 qy51Var) {
        this.a = eVar;
        this.b = qy51Var;
    }

    public static String a(nw51 nw51Var) {
        Object obj;
        if (nw51Var instanceof jw51) {
            Iterator it = ((jw51) nw51Var).c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((uv51) obj).d() == YbSdkPaymentMethodInfo$ProductType.WALLET) {
                    break;
                }
            }
            uv51 uv51Var = (uv51) obj;
            if (uv51Var != null) {
                return uv51Var.c();
            }
        }
        return null;
    }

    public final tpr b() {
        qy51 qy51Var = this.b;
        return ((wy51) qy51Var.a.getValue()) instanceof uy51 ? new g92(2, ty51.a) : kotlinx.coroutines.flow.e.d(qy51Var.a);
    }
}
