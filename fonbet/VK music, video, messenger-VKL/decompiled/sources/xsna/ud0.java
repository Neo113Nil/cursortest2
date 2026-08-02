package xsna;

import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.vk.dto.fave.MarketFavable;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class ud0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ud0(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ae0 ae0Var = (ae0) this.c;
                ViewGroup viewGroup = (ViewGroup) this.d;
                ComposeView composeView = (ComposeView) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1297101859, intValue, -1, "com.vk.ads.impl.adchoice.AdChoicesBottomSheetRedesign.show.<anonymous>.<anonymous> (AdChoicesBottomSheetRedesign.kt:39)");
                    }
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = androidx.compose.runtime.k.b(Boolean.TRUE);
                        aVar.R(x);
                    }
                    wh50 wh50Var = (wh50) x;
                    if (((Boolean) wh50Var.getValue()).booleanValue()) {
                        aVar.K(140832664);
                        boolean y = aVar.y(viewGroup) | aVar.y(composeView) | aVar.y(ae0Var);
                        Object x2 = aVar.x();
                        if (y || x2 == c0012a) {
                            x2 = new vd0(wh50Var, viewGroup, composeView, ae0Var, 0);
                            aVar.R(x2);
                        }
                        ae0Var.a((gzs) x2, aVar, 0);
                    } else {
                        aVar.K(139142079);
                    }
                    aVar.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((qre) this.c).h((yre) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ex80.a(this.c, (izs) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ((io.reactivex.rxjava3.core.y) this.c).onSuccess(((lml0) this.d).c((List) this.e, ((Boolean) obj).booleanValue(), (MarketFavable) obj2));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ud0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
