package xsna;

import com.vk.ecomm.product_list.presentation.e;
import xsna.ce10;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class re10 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ re10(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                String i = ((l2v0) obj).i();
                if (i != null) {
                    this.c.invoke(new ce10.c.a(i));
                }
                break;
            case 1:
                this.c.invoke(new e.h((String) obj));
                break;
            default:
                Throwable th = (Throwable) obj;
                izs izsVar = this.c;
                if (izsVar != null) {
                    izsVar.invoke(th);
                }
                break;
        }
        return s3q0.a;
    }
}
