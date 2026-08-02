package xsna;

import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.a;
import com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.a;
import com.vk.ecomm.onlinebooking.impl.services.presentation.a;
import com.vk.log.L;
import com.vk.voip.VoipCallActivity;
import xsna.dbe0;
import xsna.jun0;
import xsna.k1m;
import xsna.qg00;
import xsna.usc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class i97 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ i97(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                izsVar.invoke(a.h.b);
                break;
            case 1:
                izsVar.invoke(a.C0973a.b);
                break;
            case 2:
                izsVar.invoke(a.d.b);
                break;
            case 3:
                izsVar.invoke(usc.b.i.d.b);
                break;
            case 4:
                izsVar.invoke(dbe0.c.a.b);
                break;
            case 5:
                izsVar.invoke(qg00.b.b);
                break;
            case 6:
                izsVar.invoke(k1m.b.b);
                break;
            case 7:
                izsVar.invoke(jun0.g.b);
                break;
            default:
                int i2 = VoipCallActivity.P;
                L.A("VoipCallActivity", "ensureMasksPermissions callback false");
                izsVar.invoke(Boolean.FALSE);
                break;
        }
        return s3q0.a;
    }
}
