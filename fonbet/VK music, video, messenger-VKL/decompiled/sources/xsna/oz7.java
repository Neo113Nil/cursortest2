package xsna;

import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.a;
import xsna.vmu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class oz7 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ oz7(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(a.e.b);
                break;
            case 1:
                this.c.invoke(Boolean.valueOf(((gmq) obj).X()));
                break;
            default:
                this.c.invoke(new vmu.j((String) obj));
                break;
        }
        return s3q0.a;
    }
}
