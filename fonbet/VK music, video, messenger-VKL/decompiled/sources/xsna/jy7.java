package xsna;

import com.vk.ecomm.onlinebooking.impl.services.presentation.a;
import com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenKt;
import java.util.List;
import xsna.dz40;
import xsna.gfp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class jy7 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ jy7(yvj yvjVar, izs izsVar, yjl yjlVar, xvy xvyVar, List list) {
        this.c = yvjVar;
        this.d = izsVar;
        this.e = yjlVar;
        this.f = xvyVar;
        this.g = list;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                yvj yvjVar = (yvj) this.c;
                izs izsVar = (izs) this.d;
                myc0.h(yvjVar, null, null, new BookingServicesScreenKt.d((yjl) this.e, ((Integer) obj).intValue(), (xvy) this.f, (List) this.g, null), 3);
                izsVar.invoke(new a.g((ow7) obj2));
                break;
            case 1:
                ((Integer) obj2).getClass();
                nix.f((fw20) this.c, (q630) this.d, (wzs) this.e, (wzs) this.f, (jai) this.g, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ((Integer) obj2).getClass();
                siy.c((gfp0.b.c) this.c, (dz40.c) this.e, (izs) this.d, (oiy) this.f, (q630) this.g, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ jy7(fw20 fw20Var, q630 q630Var, wzs wzsVar, wzs wzsVar2, jai jaiVar, int i) {
        this.c = fw20Var;
        this.d = q630Var;
        this.e = wzsVar;
        this.f = wzsVar2;
        this.g = jaiVar;
    }

    public /* synthetic */ jy7(gfp0.b.c cVar, dz40.c cVar2, izs izsVar, oiy oiyVar, q630 q630Var, int i) {
        this.c = cVar;
        this.e = cVar2;
        this.d = izsVar;
        this.f = oiyVar;
        this.g = q630Var;
    }
}
