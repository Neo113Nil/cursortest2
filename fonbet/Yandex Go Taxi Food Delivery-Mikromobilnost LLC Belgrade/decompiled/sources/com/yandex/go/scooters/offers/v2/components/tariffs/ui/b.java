package com.yandex.go.scooters.offers.v2.components.tariffs.ui;

import android.content.Context;
import com.yandex.go.scooters.offers.v2.components.tariffs.ui.b;
import com.yandex.go.scooters.offers.v2.components.tariffs.ui.v2.ScootersPackageItemViewImplV2;
import com.yandex.go.scooters.offers.v2.components.tariffs.ui.v2.ScootersTariffItemViewImplV2;
import defpackage.d590;
import defpackage.f5p0;
import defpackage.g0c;
import defpackage.g5p0;
import defpackage.gv40;
import defpackage.he7;
import defpackage.i5p0;
import defpackage.jqx0;
import defpackage.krl0;
import defpackage.lgp;
import defpackage.lj1;
import defpackage.qoi0;
import defpackage.qw8;
import defpackage.scc;
import defpackage.t5p0;
import defpackage.tls;
import defpackage.wnf0;
import defpackage.wt;
import defpackage.xpy;
import defpackage.zxs;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class b {
    public final Context a;
    public final krl0 b;
    public final t5p0 c;

    public b(Context context, krl0 krl0Var, t5p0 t5p0Var) {
        this.a = context;
        this.b = krl0Var;
        this.c = t5p0Var;
    }

    public final qw8 a(tls tlsVar, tls tlsVar2, tls tlsVar3) {
        int i = jqx0.S;
        final int i2 = 0;
        tls tlsVar4 = new tls(this) { // from class: x5p0
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i2;
                b bVar = this.b;
                switch (i3) {
                    case 0:
                        krl0 krl0Var = bVar.b;
                        t5p0 t5p0Var = bVar.c;
                        krl0Var.getClass();
                        return new ScootersTariffItemViewImplV2((Context) krl0Var.a, (e) krl0Var.b, t5p0Var);
                    default:
                        krl0 krl0Var2 = bVar.b;
                        t5p0 t5p0Var2 = bVar.c;
                        krl0Var2.getClass();
                        return new ScootersPackageItemViewImplV2((Context) krl0Var2.a, t5p0Var2);
                }
            }
        };
        g0c a = qoi0.a(i5p0.class);
        wnf0 wnf0Var = new wnf0(tlsVar2, tlsVar, 4);
        final int i3 = 1;
        zxs zxsVar = new zxs(a.a(), 0, tlsVar4, scc.g(new lgp(TariffViewHolder$Companion$itemType$2.b, TariffViewHolder$Companion$itemType$3.b, 3), new lgp(TariffViewHolder$Companion$itemType$4.b, TariffViewHolder$Companion$itemType$5.b, 3), new lgp(TariffViewHolder$Companion$itemType$6.b, TariffViewHolder$Companion$itemType$7.b, 3)), new he7(1, wnf0Var), null);
        int i4 = d590.S;
        tls tlsVar5 = new tls(this) { // from class: x5p0
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i32 = i3;
                b bVar = this.b;
                switch (i32) {
                    case 0:
                        krl0 krl0Var = bVar.b;
                        t5p0 t5p0Var = bVar.c;
                        krl0Var.getClass();
                        return new ScootersTariffItemViewImplV2((Context) krl0Var.a, (e) krl0Var.b, t5p0Var);
                    default:
                        krl0 krl0Var2 = bVar.b;
                        t5p0 t5p0Var2 = bVar.c;
                        krl0Var2.getClass();
                        return new ScootersPackageItemViewImplV2((Context) krl0Var2.a, t5p0Var2);
                }
            }
        };
        g0c a2 = qoi0.a(g5p0.class);
        gv40 gv40Var = new gv40(4, tlsVar3);
        zxs zxsVar2 = new zxs(a2.a(), 0, tlsVar5, scc.g(new lgp(PackageViewHolder$Companion$itemType$2.b, PackageViewHolder$Companion$itemType$3.b, 3), new lgp(PackageViewHolder$Companion$itemType$4.b, PackageViewHolder$Companion$itemType$5.b, 3), new lgp(PackageViewHolder$Companion$itemType$6.b, PackageViewHolder$Companion$itemType$7.b, 3)), new he7(1, gv40Var), null);
        int i5 = wt.T;
        g0c a3 = qoi0.a(f5p0.class);
        lj1 lj1Var = new lj1(this.a, 22);
        xpy xpyVar = new xpy(8);
        return new qw8(scc.g(zxsVar, zxsVar2, new zxs(a3.a(), 0, lj1Var, EmptyList.a, new he7(1, xpyVar), null)), 7);
    }
}
