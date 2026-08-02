package defpackage;

import com.yandex.go.taxi.order.details.v1.style.OrderDetailsStyleState;
import com.yandex.go.taxi.order.state.o;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class pxx0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ pxx0(o oVar, int i) {
        this.a = i;
        this.b = oVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        o oVar = this.b;
        switch (i) {
            case 0:
                ((jxx0) oVar.Dg()).renderTopButtons((x4j) obj);
                break;
            case 1:
                ((jxx0) oVar.Dg()).renderBottomButtons((x4j) obj);
                break;
            case 2:
                ((Boolean) obj).getClass();
                ((jxx0) oVar.Dg()).onButtonsInitialized();
                break;
            case 3:
                ((jxx0) oVar.Dg()).renderCancelButton((a5j) obj);
                break;
            case 4:
                ((jxx0) oVar.Dg()).renderDetailsCardStyle((OrderDetailsStyleState) obj);
                break;
            case 5:
                ((jxx0) oVar.Dg()).setTitles((b980) obj);
                break;
            case 6:
                ((jxx0) oVar.Dg()).renderDriverSection((f6j) obj);
                break;
            case 7:
                ((jxx0) oVar.Dg()).renderPromoPlaquesTopSection((List) obj, oVar.A);
                break;
            case 8:
                ((jxx0) oVar.Dg()).renderPromoPlaquesBottomSection((List) obj, oVar.A);
                break;
            default:
                ((jxx0) oVar.Dg()).renderUpsell((d8j) obj);
                break;
        }
        return zy11Var;
    }
}
