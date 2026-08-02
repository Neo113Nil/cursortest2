package xsna;

import xsna.ha70;
import xsna.kyg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class oyg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ oyg(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(new kyg.f((String) obj));
                break;
            case 1:
                this.c.invoke((com.vk.fullscreenvideo.a) obj);
                break;
            case 2:
                this.c.invoke(new oqx(((tho0) obj).a.c));
                break;
            default:
                this.c.invoke(ha70.a.a);
                break;
        }
        return s3q0.a;
    }
}
