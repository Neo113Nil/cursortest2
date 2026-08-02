package defpackage;

import android.content.Context;
import com.yandex.go.chargers.passes.payment_settings.d;
import defpackage.agd;
import defpackage.c5d;
import defpackage.eci0;
import defpackage.gci0;
import defpackage.jha;
import defpackage.jqr;
import defpackage.n1f;
import defpackage.nha;
import defpackage.oha;
import defpackage.oka;
import defpackage.qoi0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.uyj;
import defpackage.vha;
import defpackage.yfd;
import defpackage.yha;
import defpackage.zha;
import defpackage.zy11;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class oha extends pgd {
    public final Context F;
    public final w030 G;
    public final yvf0 H;
    public final yvf0 I;
    public final fha J;
    public final zha K;
    public final d L;
    public final mu5 M;

    public oha(Context context, w030 w030Var, yvf0 yvf0Var, yvf0 yvf0Var2, fha fhaVar, zha zhaVar, d dVar) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = yvf0Var;
        this.I = yvf0Var2;
        this.J = fhaVar;
        this.K = zhaVar;
        this.L = dVar;
        this.M = new mu5(new tls() { // from class: com.yandex.go.chargers.passes.payment_settings.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                final yfd yfdVar = (yfd) obj;
                final oha ohaVar = oha.this;
                final nha nhaVar = new nha(ohaVar);
                zha zhaVar2 = ohaVar.K;
                String str = ((jha) ((agd) yfdVar).a).a;
                tpr a = zhaVar2.b.a();
                gci0 gci0Var = zhaVar2.e.b;
                eci0 eci0Var = zhaVar2.f.b;
                zy11 zy11Var = zy11.a;
                tpr t = kotlinx.coroutines.flow.e.t(com.yandex.go.coroutines.b.d(kotlinx.coroutines.flow.e.n(a, gci0Var, new n1f(8, new jqr(kotlinx.coroutines.flow.e.X(com.yandex.go.coroutines.b.d(eci0Var, new ChargersPassesPaymentSettingsUiStateInteractor$settingsFlow$$inlined$start$1(zy11Var, null)), new ChargersPassesPaymentSettingsUiStateInteractor$settingsFlow$$inlined$flatMapLatest$1(zhaVar2, str, null)), new ChargersPassesPaymentSettingsUiStateInteractor$settingsFlow$2(zhaVar2, nhaVar, null), 3), qoi0.a(oka.class)), new ChargersPassesPaymentSettingsUiStateInteractor$getUiStateFlow$1(zhaVar2, str, null)), new ChargersPassesPaymentSettingsUiStateInteractor$getUiStateFlow$$inlined$start$1(new yha("", "", null, null, EmptyList.a, true, false), null)));
                zhaVar2.a.getClass();
                tpr F = kotlinx.coroutines.flow.e.F(t, uyj.a);
                agd agdVar = (agd) yfdVar;
                agdVar.c = F;
                agdVar.e = new tls() { // from class: com.yandex.go.chargers.passes.payment_settings.b
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        oha ohaVar2 = oha.this;
                        tje.N(ohaVar2.o(), null, null, new ChargersPassesPaymentSettingsRouter$content$1$1$1(ohaVar2, yfdVar, (vha) obj2, nhaVar, null), 3);
                        return zy11.a;
                    }
                };
                c5d.a.getClass();
                agdVar.g = c5d.b;
                return zy11Var;
            }
        });
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void H(Object obj) {
        r0 r0Var = this.J.a;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool);
        super.H((jha) obj);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.M;
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
