package defpackage;

import android.content.Context;
import com.yandex.go.route.interactor.b;
import com.yandex.go.taxi.summary.mobilityhub.interactor.k;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.VerticalHubV2Router$onLaunch$$inlined$safeCollectIn$1;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.f;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor.q;
import kotlin.a;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes14.dex */
public final class dd31 extends pgd {
    public final Context F;
    public final zuj0 G;
    public final h3y H;
    public final a3v I;
    public final h3y J;
    public final h3y K;
    public final z0a0 L;
    public final ra00 M;
    public final t0w0 N;
    public final h3y O;
    public final lk31 P;
    public final x1v Q;
    public final w030 R;
    public final f1v S;
    public final b T;
    public final h3y U;
    public final yvf0 V;
    public final yvf0 W;
    public final yvf0 Z;
    public final yvf0 a0;
    public final k b0;
    public final yvf0 c0;
    public final h3y d0;
    public final h3y e0;
    public final h3y f0;
    public final yvf0 g0;
    public final h3y h0;
    public final aw20 i0;
    public final i3y j0;
    public final mu5 k0;

    public dd31(q qVar, f fVar, Context context, zuj0 zuj0Var, h3y h3yVar, a3v a3vVar, h3y h3yVar2, h3y h3yVar3, z0a0 z0a0Var, ra00 ra00Var, t0w0 t0w0Var, h3y h3yVar4, lk31 lk31Var, x1v x1vVar, w030 w030Var, f1v f1vVar, b bVar, h3y h3yVar5, l3g l3gVar, vu vuVar, h3g h3gVar, l3g l3gVar2, k kVar, h3g h3gVar2, h3y h3yVar6, h3y h3yVar7, h3y h3yVar8, ubq0 ubq0Var, h3y h3yVar9, aw20 aw20Var) {
        super(0);
        this.F = context;
        this.G = zuj0Var;
        this.H = h3yVar;
        this.I = a3vVar;
        this.J = h3yVar2;
        this.K = h3yVar3;
        this.L = z0a0Var;
        this.M = ra00Var;
        this.N = t0w0Var;
        this.O = h3yVar4;
        this.P = lk31Var;
        this.Q = x1vVar;
        this.R = w030Var;
        this.S = f1vVar;
        this.T = bVar;
        this.U = h3yVar5;
        this.V = l3gVar;
        this.W = vuVar;
        this.Z = h3gVar;
        this.a0 = l3gVar2;
        this.b0 = kVar;
        this.c0 = h3gVar2;
        this.d0 = h3yVar6;
        this.e0 = h3yVar7;
        this.f0 = h3yVar8;
        this.g0 = ubq0Var;
        this.h0 = h3yVar9;
        this.i0 = aw20Var;
        this.j0 = a.a(new ec31(2, this));
        this.k0 = new mu5(new zjy0(19, this, qVar, fVar));
    }

    public static final void U(dd31 dd31Var, PointType pointType) {
        SourcePicker sourcePicker;
        dd31Var.j(new epb((ksd) dd31Var.j0.getValue()));
        ksd ksdVar = (ksd) dd31Var.j0.getValue();
        int i = cd31.a[pointType.ordinal()];
        if (i == 1) {
            sourcePicker = SourcePicker.A_FROM_SUMMARY;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            sourcePicker = SourcePicker.B_FROM_SUMMARY;
        }
        SourcePicker sourcePicker2 = sourcePicker;
        o501 o501Var = new o501(kyh0.address_search_modal_view_from, kyh0.address_search_modal_view_to, 14);
        dd31Var.A(ksdVar, new jsd(pointType, sourcePicker2, false, new q501(o501Var, o501Var), dd31Var.T.c().b(), "order_summary", null, 1792), new k0i(dd31Var, 7));
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        x1v x1vVar = this.Q;
        x1vVar.b = valueOf;
        x1vVar.c = null;
        this.I.a0(this);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        x1v x1vVar = this.Q;
        Long l = x1vVar.b;
        if (l != null) {
            if (System.currentTimeMillis() - l.longValue() > 180000) {
                x1vVar.a = null;
            }
        }
        this.I.b8(this);
        z((m950) this.W.get(), sy60.Q2);
        tje.N(o(), null, null, new VerticalHubV2Router$onLaunch$$inlined$safeCollectIn$1(this.S.b, null, this), 3);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.k0;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.R;
    }
}
