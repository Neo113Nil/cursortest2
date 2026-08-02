package defpackage;

import com.yandex.go.chargers.e;
import com.yandex.go.chargers.station.api.ChargersStationOpenReason;

/* loaded from: classes12.dex */
public final class bpa implements mu9 {
    public final /* synthetic */ e a;
    public final /* synthetic */ m2a b;
    public final /* synthetic */ xoa c;

    public bpa(e eVar, m2a m2aVar, xoa xoaVar) {
        this.a = eVar;
        this.b = m2aVar;
        this.c = xoaVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.c.invoke();
    }

    @Override // defpackage.mu9
    public final void a0(tsa tsaVar) {
        this.a.Z(this.b, tsaVar, ChargersStationOpenReason.DiscountsAndPromocodes);
    }
}
