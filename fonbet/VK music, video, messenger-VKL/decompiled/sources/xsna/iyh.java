package xsna;

import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class iyh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ iyh(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                String i = ((l2v0) obj).i();
                if (i != null) {
                    this.c.invoke(i);
                }
                break;
            case 1:
                ViewGroup viewGroup = (ViewGroup) obj;
                break;
            case 2:
                this.c.invoke(Float.valueOf((float) Math.floor(((Float) obj).floatValue())));
                break;
            default:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    this.c.invoke(Integer.valueOf(((Number) it.next()).intValue()));
                }
                break;
        }
        return s3q0.a;
    }
}
