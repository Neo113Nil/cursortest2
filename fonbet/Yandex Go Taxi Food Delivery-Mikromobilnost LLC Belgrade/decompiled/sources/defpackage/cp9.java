package defpackage;

import com.yandex.go.chargers.e;
import com.yandex.go.chargers.offer.ChargersOfferOpenReason;
import com.yandex.go.chargers.station.api.ChargersStationOpenReason;
import java.util.ArrayList;
import ru.yandex.taxi.layers.presentation.walkroute.simple.b;

/* loaded from: classes12.dex */
public final class cp9 implements sj9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cp9(h55 h55Var, Object obj, int i) {
        this.a = i;
        this.b = h55Var;
        this.c = obj;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        Object obj = this.c;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((zsa) h55Var).r(new qu(9));
                break;
            case 1:
                ((zsa) h55Var).P((ArrayList) obj);
                break;
            case 2:
                ((e) h55Var).V((s2a) obj);
                break;
            default:
                ((csa) h55Var).P((hr9) obj, ChargersStationOpenReason.BackFromCamera);
                break;
        }
    }

    @Override // defpackage.sj9
    public final void c0(tsa tsaVar) {
        int i = this.a;
        Object obj = this.c;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                zsa zsaVar = (zsa) h55Var;
                String str = (String) obj;
                zsaVar.D((m950) ((yvf0) zsaVar.G).get(), new g1a(tsaVar, str), new ep9(zsaVar, str));
                break;
            case 1:
                zsa zsaVar2 = (zsa) h55Var;
                zsaVar2.A((m950) ((yvf0) zsaVar2.F).get(), new b9a(tsaVar, ChargersOfferOpenReason.Qr, null), new u4a(zsaVar2, (ArrayList) obj));
                break;
            case 2:
                e.c0((e) h55Var, (s2a) obj, tsaVar, ChargersOfferOpenReason.Qr, null, null, 24);
                break;
            default:
                csa csaVar = (csa) h55Var;
                ((b) csaVar.L.get()).c.g(zy11.a);
                csaVar.r(new ps9(tsaVar, 8));
                break;
        }
    }
}
