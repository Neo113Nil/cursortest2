package xsna;

import com.vk.ecomm.catalog.impl.catalog.root.ClassifiedsCatalogRootVh;
import xsna.bcw0;

/* compiled from: ClassifiedsCatalogRootVh.kt */
/* loaded from: classes18.dex */
public final class hgc extends bcw0 {
    public final /* synthetic */ ClassifiedsCatalogRootVh a;

    public hgc(ClassifiedsCatalogRootVh classifiedsCatalogRootVh) {
        this.a = classifiedsCatalogRootVh;
    }

    @Override // xsna.bcw0
    public final void a(bcw0.a aVar) {
        String str = aVar.a;
        ClassifiedsCatalogRootVh classifiedsCatalogRootVh = this.a;
        bnn0 bnn0Var = classifiedsCatalogRootVh.W;
        bnn0 bnn0Var2 = classifiedsCatalogRootVh.e0.r;
        bnn0 bnn0Var3 = vyh0.a;
        if (epx.f(bnn0Var2, bnn0Var3)) {
            if (str != null) {
                classifiedsCatalogRootVh.u0(str, null, false);
                return;
            }
            if (bnn0Var == null) {
                bnn0Var = classifiedsCatalogRootVh.V;
            }
            if (!classifiedsCatalogRootVh.L) {
                bnn0Var3 = bnn0Var;
            }
            classifiedsCatalogRootVh.i8(bnn0Var3);
        }
    }

    @Override // xsna.bcw0
    public final void b() {
        ClassifiedsCatalogRootVh classifiedsCatalogRootVh = this.a;
        classifiedsCatalogRootVh.W = classifiedsCatalogRootVh.V;
        classifiedsCatalogRootVh.i8(vyh0.a);
    }
}
