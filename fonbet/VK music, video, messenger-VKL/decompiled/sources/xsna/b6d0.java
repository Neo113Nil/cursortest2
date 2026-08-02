package xsna;

import com.vk.libvideo.design.compose.base.preview.PreviewViewState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b6d0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b6d0(PreviewViewState.n nVar, int i) {
        this.b = 0;
        this.d = nVar;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.base.preview.c.r((PreviewViewState.n) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((sjg0) this.d).b(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            default:
                xfl0 xfl0Var = (xfl0) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1633639049, intValue, -1, "com.vk.ecomm.market.good.ui.holder.StockAmountHolder.onBind.<anonymous> (StockAmountHolder.kt:53)");
                    }
                    if (xfl0Var.m == 0) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        break;
                    } else {
                        boolean booleanValue = ((Boolean) xfl0Var.o.getValue()).booleanValue();
                        int i = this.c;
                        if (booleanValue) {
                            aVar.K(-1466359795);
                            xfl0Var.s6(i, 0, aVar);
                            aVar.j();
                        } else {
                            aVar.K(-1466292556);
                            xfl0Var.q6(i, 0, aVar);
                            aVar.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ b6d0(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }
}
