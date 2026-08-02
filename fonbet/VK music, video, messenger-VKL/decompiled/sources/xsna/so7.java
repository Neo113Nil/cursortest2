package xsna;

import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import xsna.kve;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class so7 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ mtk0 c;

    public /* synthetic */ so7(mtk0 mtk0Var, int i) {
        this.b = i;
        this.c = mtk0Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        switch (this.b) {
            case 0:
                z = ((BookingEditScreenState.InfoBlock) this.c.getValue()).j;
                break;
            default:
                z = ((kve.a) this.c.getValue()) instanceof kve.a.b;
                break;
        }
        return Boolean.valueOf(z);
    }
}
