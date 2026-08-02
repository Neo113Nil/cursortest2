package xsna;

import com.vk.dto.common.VideoFile;
import xsna.mbf;
import xsna.wc30;
import xsna.x2v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class qhf implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ qhf(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(new mbf.c.m((String) obj));
                break;
            case 1:
                dwj dwjVar = (dwj) obj;
                eyx eyxVar = (eyx) this.c.invoke(dwjVar);
                if (eyxVar != null) {
                    break;
                }
                break;
            case 2:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "searchTopViewBar");
                qgi0.e(tgi0Var, null, new wq0(this.c, 4));
                break;
            case 3:
                ((Boolean) obj).booleanValue();
                this.c.invoke(x2v.c.b);
                break;
            case 4:
                t5s0 t5s0Var = (t5s0) obj;
                this.c.invoke(new wc30.a(t5s0Var.w(), t5s0Var));
                break;
            default:
                VideoFile videoFile = (VideoFile) obj;
                izs izsVar = this.c;
                if (izsVar != null) {
                    izsVar.invoke(k15.B(videoFile));
                }
                break;
        }
        return s3q0.a;
    }
}
