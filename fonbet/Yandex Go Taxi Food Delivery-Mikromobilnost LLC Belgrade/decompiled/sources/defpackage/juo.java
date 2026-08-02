package defpackage;

import com.yandex.go.explorer.impl.ui.map.c;
import java.util.Iterator;
import kotlin.collections.a;

/* loaded from: classes12.dex */
public final /* synthetic */ class juo implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ juo(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                float floatValue = ((Float) obj).floatValue();
                Iterator it = cVar.y.iterator();
                while (it.hasNext()) {
                    n3e0 n3e0Var = (n3e0) it.next();
                    n3e0Var.r(yga1.b(floatValue, cVar.K));
                    n3e0Var.u(yga1.b(floatValue, cVar.L));
                }
                Iterator it2 = cVar.C.iterator();
                while (it2.hasNext()) {
                    n3e0 n3e0Var2 = (n3e0) it2.next();
                    n3e0Var2.r(yga1.b(floatValue, cVar.O));
                    n3e0Var2.u(yga1.b(floatValue, cVar.P));
                }
                break;
            case 1:
                int b = yga1.b(((Float) obj).floatValue(), cVar.M);
                Iterator it3 = cVar.A.iterator();
                while (it3.hasNext()) {
                    ((n3e0) it3.next()).u(b);
                }
                break;
            default:
                n3e0 n3e0Var3 = (n3e0) a.S(((Integer) obj).intValue(), cVar.C);
                if (n3e0Var3 != null) {
                    n3e0Var3.d();
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
