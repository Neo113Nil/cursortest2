package xsna;

import android.content.Context;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class pp7 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ xzs e;

    public /* synthetic */ pp7(Object obj, Object obj2, xzs xzsVar, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = xzsVar;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                yzt0 yzt0Var = (yzt0) this.c;
                mtk0 mtk0Var = (mtk0) this.d;
                izs izsVar = (izs) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(776778110, intValue, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditScreenMviView.addInformationBlockCell.<anonymous> (BookingEditScreenMviView.kt:319)");
                    }
                    xo7.a(jk50.c(yzt0Var, aVar), mtk0Var, izsVar, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                g2w0 g2w0Var = (g2w0) this.c;
                Context context = (Context) this.d;
                yzs yzsVar = (yzs) this.e;
                Integer num = (Integer) obj;
                num.getClass();
                String str = (String) obj2;
                Long l = (Long) obj3;
                x1w0.b(g2w0Var.g, context, l.longValue());
                if (yzsVar != null) {
                    yzsVar.invoke(num, str, l);
                }
                yok0 yok0Var = g2w0Var.i;
                if (yok0Var != null) {
                    yok0Var.b(null);
                }
                break;
        }
        return s3q0.a;
    }
}
