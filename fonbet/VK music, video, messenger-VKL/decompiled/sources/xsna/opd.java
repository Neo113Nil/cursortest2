package xsna;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.Iterator;
import java.util.List;
import xsna.mbf;
import xsna.vmu;
import xsna.xij;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class opd implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ opd(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(new mbf.b.f((zoa) obj));
                return s3q0.a;
            case 1:
                this.c.invoke((Bitmap) obj);
                return s3q0.a;
            case 2:
                izs izsVar = this.c;
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    izsVar.invoke(new xij.i(((Number) it.next()).intValue()));
                }
                return s3q0.a;
            case 3:
                this.c.invoke(new vmu.h((List) obj));
                return s3q0.a;
            case 4:
                this.c.invoke(((gcu0) obj).a);
                return s3q0.a;
            case 5:
                dak0 dak0Var = (dak0) this.c.invoke((kak0) obj);
                synchronized (qak0.c) {
                    qak0.d = qak0.d.e(dak0Var.g());
                    s3q0 s3q0Var = s3q0.a;
                }
                return dak0Var;
            case 6:
                izs izsVar2 = this.c;
                zhf0 j = jgz.j((tny) obj, true);
                izsVar2.invoke(new Rect(an10.b(j.a), an10.b(j.b), an10.b(j.c), an10.b(j.d)));
                return s3q0.a;
            default:
                this.c.invoke(jgz.j((tny) obj, true));
                return s3q0.a;
        }
    }
}
