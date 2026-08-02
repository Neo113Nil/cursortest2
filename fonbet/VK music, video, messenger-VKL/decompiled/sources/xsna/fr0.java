package xsna;

import com.vk.log.L;
import com.vk.voip.VoipCallActivity;
import xsna.e510;
import xsna.kq0;
import xsna.rma0;
import xsna.sx40;
import xsna.usc;
import xsna.wi40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class fr0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ fr0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                izsVar.invoke(kq0.i.b);
                break;
            case 1:
                izsVar.invoke(usc.b.i.c.b);
                break;
            case 2:
                izsVar.invoke(jbe0.b);
                break;
            case 3:
                izsVar.invoke(e510.c.b);
                break;
            case 4:
                izsVar.invoke(sx40.a.b.b);
                break;
            case 5:
                izsVar.invoke(wi40.c.b);
                break;
            case 6:
                izsVar.invoke(rma0.c.b);
                break;
            default:
                int i2 = VoipCallActivity.P;
                L.A("VoipCallActivity", "ensureMasksPermissions callback true");
                izsVar.invoke(Boolean.TRUE);
                break;
        }
        return s3q0.a;
    }
}
