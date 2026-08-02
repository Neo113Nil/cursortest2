package defpackage;

import java.util.Optional;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;

/* loaded from: classes6.dex */
public final class iym0 extends h55 {
    public final MapNotificationsMuteRepository D;
    public final yvf0 E;
    public final yvf0 F;

    public iym0(MapNotificationsMuteRepository mapNotificationsMuteRepository, yvf0 yvf0Var, yvf0 yvf0Var2) {
        super(null);
        this.D = mapNotificationsMuteRepository;
        this.E = yvf0Var;
        this.F = yvf0Var2;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.D.b();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.D.a();
        z((m950) this.E.get(), new hym0(this, new j6m0(14, this), 0));
    }

    public final void P(zzs zzsVar) {
        D((m950) this.F.get(), Optional.ofNullable(zzsVar), new gym0(this));
    }
}
