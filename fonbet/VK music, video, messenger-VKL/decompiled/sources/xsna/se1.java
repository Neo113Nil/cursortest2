package xsna;

import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.a;
import xsna.cd1;
import xsna.coc;
import xsna.dbe0;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class se1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ se1(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(cd1.a.b);
                break;
            case 1:
                this.c.invoke(a.e.b);
                break;
            case 2:
                this.c.invoke(dbe0.e.b.b);
                break;
            case 3:
                this.c.invoke(sx40.b.e.b);
                break;
            case 4:
                this.c.invoke(coc.b.b);
                break;
            case 5:
                this.c.invoke(dbe0.h.b.b);
                break;
            default:
                this.c.invoke(Boolean.TRUE);
                break;
        }
        return s3q0.a;
    }
}
