package xsna;

import com.vk.design.demo.presentation.nav.ScreenKey;
import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class uo7 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ mtk0 c;

    public /* synthetic */ uo7(mtk0 mtk0Var, int i) {
        this.b = i;
        this.c = mtk0Var;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((BookingEditScreenState.InfoBlock) this.c.getValue()).b;
            default:
                return (yah0) mpg0.a.get((ScreenKey) this.c.getValue());
        }
    }
}
