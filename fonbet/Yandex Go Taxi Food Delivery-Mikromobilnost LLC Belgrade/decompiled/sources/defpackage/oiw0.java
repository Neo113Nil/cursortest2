package defpackage;

import android.net.Uri;
import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.ArrayDeque;
import java.util.Iterator;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.order.OrderFragment;
import ru.yandex.taxi.order.f;

/* loaded from: classes5.dex */
public final /* synthetic */ class oiw0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ oiw0(m mVar, int i) {
        this.a = i;
        this.b = mVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        m mVar = this.b;
        switch (i) {
            case 0:
                p0h p0hVar = (p0h) mVar.h;
                p0hVar.getClass();
                p0hVar.a.a(Uri.parse((String) obj), DeeplinkSource.UNSPECIFIED);
                break;
            case 1:
                o2y0 o2y0Var = (o2y0) obj;
                f fVar = (f) ((k2y0) mVar.f).a;
                apf apfVar = fVar.C1.c;
                bub bubVar = new bub(2);
                Iterator it = ((ArrayDeque) apfVar.c).iterator();
                while (it.hasNext()) {
                    if (apf.r((tdj) it.next(), pp70.class, bubVar)) {
                        it.remove();
                    }
                }
                tdj tdjVar = (tdj) apfVar.w;
                if (tdjVar == null ? false : apf.r(tdjVar, pp70.class, bubVar)) {
                    apfVar.k();
                }
                if (o2y0Var.b().V().R) {
                    fVar.x0(o2y0Var);
                    OrderFragment orderFragment = fVar.p1;
                    if (orderFragment != null) {
                        orderFragment.showChat(o2y0Var, true);
                        break;
                    }
                }
                break;
            case 2:
                ((f) ((z1y0) mVar.g).a).X((o2y0) obj);
                break;
            default:
                ((f) ((x1y0) mVar.d).a).s0((o2y0) obj);
                break;
        }
        return zy11Var;
    }
}
