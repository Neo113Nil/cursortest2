package xsna;

import java.util.Date;
import java.util.List;
import xsna.kyg;
import xsna.mbf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class lyg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ lyg(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(new kyg.e(((Integer) obj).intValue()));
                break;
            case 1:
                Date date = (Date) obj;
                this.c.invoke(new mbf.c.x.b(date != null ? Long.valueOf(date.getTime()) : null));
                break;
            default:
                this.c.invoke((List) obj);
                break;
        }
        return s3q0.a;
    }
}
