package xsna;

import android.content.Context;
import java.text.SimpleDateFormat;
import xsna.lbf;
import xsna.yaf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class e59 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e59(Object obj, int i, Object obj2, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
        this.e = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new SimpleDateFormat(((Context) this.d).getString(this.c), ((i59) this.e).d);
            default:
                izs izsVar = (izs) this.d;
                izs izsVar2 = (izs) this.e;
                izsVar.invoke(new yaf.b.h(this.c));
                izsVar2.invoke(lbf.c.l.C3255c.b);
                return s3q0.a;
        }
    }
}
