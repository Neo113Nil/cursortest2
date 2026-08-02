package xsna;

import java.util.Map;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class tvi0 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Map map = (Map) obj;
                return this.c ? com.vk.voip.ui.sessionrooms.dialog.model.a.b(c5g.v(map.values())).l(new r2v(new bbw(map, 27), 14)) : io.reactivex.rxjava3.core.x.k(new Pair(map, jgp.b));
            default:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.n(tgi0Var, 2);
                qgi0.t(tgi0Var, jgz.d(this.c));
                return s3q0.a;
        }
    }

    public /* synthetic */ tvi0(boolean z, com.vk.voip.ui.sessionrooms.dialog.model.a aVar) {
        this.c = z;
    }
}
