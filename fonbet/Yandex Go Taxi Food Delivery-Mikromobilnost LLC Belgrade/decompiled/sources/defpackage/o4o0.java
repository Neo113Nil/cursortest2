package defpackage;

import com.yandex.go.scooters.data.model.ScootersOffersPresentationState$LaunchContext;
import com.yandex.go.scooters.domain.model.ScootersComeFrom;

/* loaded from: classes13.dex */
public abstract class o4o0 {
    public final zzs a;
    public final ScootersOffersPresentationState$LaunchContext b;
    public final pxm0 c;

    public o4o0(zzs zzsVar, ScootersOffersPresentationState$LaunchContext scootersOffersPresentationState$LaunchContext, pxm0 pxm0Var) {
        this.a = zzsVar;
        this.b = scootersOffersPresentationState$LaunchContext;
        this.c = pxm0Var;
    }

    public final ScootersComeFrom a() {
        int i = n4o0.a[this.b.ordinal()];
        if (i == 1 || i == 2) {
            return ScootersComeFrom.QR;
        }
        if (i == 3) {
            return ScootersComeFrom.ANOTHER;
        }
        w511.b();
        return null;
    }
}
