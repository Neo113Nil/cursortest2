package com.yandex.go.scooters.parking;

import android.content.Context;
import com.yandex.go.scooters.parking.api.ParkingButtonAction;
import com.yandex.go.scooters.parking.api.ParkingCardOpenReason;
import defpackage.agd;
import defpackage.alb0;
import defpackage.dqt;
import defpackage.fco0;
import defpackage.iin0;
import defpackage.m950;
import defpackage.mu5;
import defpackage.nbo0;
import defpackage.pgd;
import defpackage.pgk0;
import defpackage.rol0;
import defpackage.tbo0;
import defpackage.tje;
import defpackage.tls;
import defpackage.w030;
import defpackage.wfd;
import defpackage.yfd;
import defpackage.zy11;
import defpackage.zzs;

/* loaded from: classes13.dex */
public final class b extends pgd implements m950 {
    public final Context F;
    public final w030 G;
    public final dqt H;
    public final fco0 I;
    public final pgk0 J;
    public final nbo0 K;
    public final mu5 L;

    public b(Context context, w030 w030Var, dqt dqtVar, fco0 fco0Var, pgk0 pgk0Var, nbo0 nbo0Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = dqtVar;
        this.I = fco0Var;
        this.J = pgk0Var;
        this.K = nbo0Var;
        this.L = new mu5(new tls() { // from class: com.yandex.go.scooters.parking.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                yfd yfdVar = (yfd) obj;
                b bVar = b.this;
                fco0 fco0Var2 = bVar.I;
                zzs zzsVar = ((tbo0) ((agd) yfdVar).a).a;
                agd agdVar = (agd) yfdVar;
                tbo0 tbo0Var = (tbo0) agdVar.a;
                boolean z = tbo0Var.b;
                ParkingButtonAction parkingButtonAction = tbo0Var.d;
                Integer num = tbo0Var.e;
                ParkingCardOpenReason parkingCardOpenReason = tbo0Var.c;
                fco0Var2.getClass();
                agdVar.c = new rol0(new ScootersParkingUiStateInteractor$uiStateFlow$1(fco0Var2, zzsVar, z, parkingButtonAction, num, parkingCardOpenReason, null));
                agdVar.e = new iin0(12, bVar);
                agdVar.g = new androidx.compose.runtime.internal.a(1468228567, new alb0(22, bVar), true);
                return zy11.a;
            }
        });
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        super.G((tbo0) obj);
        tje.N(o(), null, null, new ScootersParkingRouterImpl$onAttach$1(this, null), 3);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.L;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
