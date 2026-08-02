package xsna;

import com.vk.im.engine.models.a;
import com.vk.log.L;
import com.vk.menu.data.network.response.StreamParcelableSuperAppMenu;
import xsna.hov;
import xsna.n9n0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class z0v implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        T t;
        switch (this.b) {
            case 0:
                xgx0.a.getClass();
                xgx0.d((Throwable) obj);
                return s3q0.a;
            case 1:
                hov.a aVar = (hov.a) obj;
                k720 k720Var = k720.a;
                if (k720.R == null && k720.O() && (t = aVar.a) != 0) {
                    L.e("Warmed up SuperApp menu");
                    k720.X(new n9n0(k720.K(((StreamParcelableSuperAppMenu) t).d()), new n9n0.a.C3389a(true)));
                }
                return s3q0.a;
            case 2:
                vx2.d.getClass();
                return s3q0.a;
            default:
                com.vk.im.engine.models.a.b.getClass();
                return a.C1121a.b((String) obj);
        }
    }

    public /* synthetic */ z0v(rsg0 rsg0Var) {
        this.b = 2;
    }
}
