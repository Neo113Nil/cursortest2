package xsna;

import com.vk.ecomm.onlinebooking.impl.services.presentation.a;
import com.vk.geo.impl.presentation.GeoFragment;
import com.vk.log.L;
import xsna.ejd0;
import xsna.mbf;
import xsna.oa70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class uy7 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ uy7(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                izsVar.invoke(new a.f((String) obj));
                break;
            case 1:
                izsVar.invoke(new mbf.c.h(((Long) obj).longValue()));
                break;
            case 2:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "searchTopViewBar");
                qgi0.e(tgi0Var, null, new lv7(izsVar, 5));
                break;
            case 3:
                qcy<Object>[] qcyVarArr = GeoFragment.c0;
                if (obj != null) {
                    try {
                        izsVar.invoke(obj);
                    } catch (Throwable th) {
                        L.i(th);
                    }
                    break;
                } else {
                    break;
                }
            case 4:
                izsVar.invoke(oa70.a.b);
                break;
            case 5:
                Throwable th2 = (Throwable) obj;
                izsVar.invoke(th2);
                L.i(th2);
                break;
            default:
                izsVar.invoke(new ejd0.d.b(((Integer) obj).intValue()));
                break;
        }
        return s3q0.a;
    }
}
