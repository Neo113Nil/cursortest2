package defpackage;

import com.ybsdk.feature.webview.internal.utils.b;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.layers.e;

/* loaded from: classes14.dex */
public final class e641 implements v7p {
    public final /* synthetic */ int a;
    public final Object b;
    public final xvf0 c;

    public /* synthetic */ e641(Object obj, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = obj;
        this.c = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        kwu kwuVar;
        int i = this.a;
        xvf0 xvf0Var = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new d641((e) ((qcg) obj).get(), (tyx) ((qcg) xvf0Var).get());
            case 1:
                return new ah41((g) ((b7g) obj).get(), (yu41) ((jv21) xvf0Var).get());
            case 2:
                um41 um41Var = (um41) ((rbg) obj).get();
                ((rbg) xvf0Var).get();
                return new b(um41Var);
            case 3:
                return new yy41((lx4) ((c1g) obj).get(), (o7r0) ((tw11) xvf0Var).get());
            case 4:
                mj31 mj31Var = (mj31) obj;
                gq50 gq50Var = (gq50) xvf0Var.get();
                try {
                    jwu jwuVar = new jwu();
                    jwuVar.i(null, "https://mail.yandex.ru");
                    kwuVar = jwuVar.e();
                } catch (IllegalArgumentException unused) {
                    kwuVar = null;
                }
                if (kwuVar == null) {
                    ny61.g("Required value was null.");
                    return null;
                }
                jwu g = kwuVar.g();
                g.c("api/mobile/", true);
                return new kfh(g.e().m(), gq50Var, new qdh(), new ic01(4, mj31Var), new i1(3, mj31Var));
            default:
                return new dv51((oep0) ((xvf0) obj).get(), (ii9) xvf0Var);
        }
    }
}
