package xsna;

import android.graphics.Bitmap;
import com.vk.log.L;
import java.util.List;
import xsna.bfa;
import xsna.d4k0;
import xsna.hcb0;
import xsna.msm;
import xsna.oa70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class p0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ p0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(d4k0.a.c.b);
                break;
            case 1:
                whr0 whr0Var = (whr0) ((it80) obj).a;
                if (whr0Var != null) {
                    this.c.invoke(whr0Var);
                    break;
                } else {
                    break;
                }
            case 2:
                this.c.invoke(new bfa.c((yda) obj));
                break;
            case 3:
                this.c.invoke(new oa70.i((List) obj));
                break;
            case 4:
                this.c.invoke(new hcb0.a((yda) obj));
                break;
            case 5:
                Throwable th = (Throwable) obj;
                this.c.invoke(th);
                L.i(th);
                break;
            case 6:
                this.c.invoke(Integer.valueOf((int) (((q9x) obj).a & 4294967295L)));
                break;
            case 7:
                this.c.invoke((Bitmap) obj);
                break;
            default:
                this.c.invoke(msm.c.a);
                break;
        }
        return s3q0.a;
    }
}
