package defpackage;

import android.content.Context;
import com.yandex.go.chargers.offer.passes.ui.a;
import defpackage.agd;
import defpackage.cja;
import defpackage.dja;
import defpackage.eja;
import defpackage.fja;
import defpackage.g5d;
import defpackage.gci0;
import defpackage.gja;
import defpackage.jja;
import defpackage.tje;
import defpackage.tls;
import defpackage.w511;
import defpackage.yfd;
import defpackage.zy11;
import kotlinx.coroutines.flow.e;

/* loaded from: classes12.dex */
public final class gja extends pgd {
    public final Context F;
    public final w030 G;
    public final kja H;
    public final a I;
    public final com.yandex.go.chargers.offer.plus_dvizh.ui.a J;
    public final mu5 K;

    public gja(Context context, w030 w030Var, kja kjaVar, a aVar, com.yandex.go.chargers.offer.plus_dvizh.ui.a aVar2) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = kjaVar;
        this.I = aVar;
        this.J = aVar2;
        this.K = new mu5(new tls() { // from class: com.yandex.go.chargers.offer.passes.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                gci0 d;
                yfd yfdVar = (yfd) obj;
                final gja gjaVar = gja.this;
                final fja fjaVar = new fja(gjaVar);
                eja ejaVar = (eja) ((agd) yfdVar).a;
                if (ejaVar instanceof dja) {
                    tje.N(gjaVar.o(), null, null, new ChargersPassesPurchasingRouter$content$1$activeUiStateFlow$1(gjaVar, ejaVar, null), 3);
                    d = e.d(gjaVar.I.e);
                } else {
                    if (!(ejaVar instanceof cja)) {
                        w511.b();
                        return null;
                    }
                    tje.N(gjaVar.o(), null, null, new ChargersPassesPurchasingRouter$content$1$activeUiStateFlow$2(gjaVar, ejaVar, null), 3);
                    d = e.d(gjaVar.J.e);
                }
                agd agdVar = (agd) yfdVar;
                agdVar.c = d;
                agdVar.e = new tls() { // from class: com.yandex.go.chargers.offer.passes.b
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        gja gjaVar2 = gja.this;
                        tje.N(gjaVar2.o(), null, null, new ChargersPassesPurchasingRouter$content$1$1$1(gjaVar2, (jja) obj2, fjaVar, null), 3);
                        return zy11.a;
                    }
                };
                g5d.a.getClass();
                agdVar.g = g5d.b;
                return zy11.a;
            }
        });
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.K;
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
