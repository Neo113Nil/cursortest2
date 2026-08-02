package xsna;

import java.io.File;
import xsna.c1b0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class azd implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ azd(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke((File) obj);
                break;
            case 1:
                tny tnyVar = (tny) obj;
                this.c.invoke(jgz.p(tnyVar).z(tnyVar, true));
                break;
            default:
                this.c.invoke(new c1b0.a(((Boolean) obj).booleanValue()));
                break;
        }
        return s3q0.a;
    }
}
