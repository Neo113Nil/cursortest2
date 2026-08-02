package defpackage;

import com.yandex.go.chargers.station.api.ChargersStationOpenReason;
import ru.yandex.taxi.layers.presentation.walkroute.simple.b;

/* loaded from: classes12.dex */
public final class asa implements sj9 {
    public final /* synthetic */ csa a;
    public final /* synthetic */ hr9 b;
    public final /* synthetic */ String c;

    public asa(csa csaVar, hr9 hr9Var, String str) {
        this.a = csaVar;
        this.b = hr9Var;
        this.c = str;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.P(this.b, ChargersStationOpenReason.BackFromCamera);
    }

    @Override // defpackage.sj9
    public final void c0(tsa tsaVar) {
        csa csaVar = this.a;
        ((b) csaVar.L.get()).c.g(zy11.a);
        csaVar.D((m950) csaVar.I.get(), new ada(new qca(tsaVar, this.c)), new zra(csaVar, this.b));
    }
}
