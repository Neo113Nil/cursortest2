package defpackage;

import android.view.View;
import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import com.yandex.go.taxi.order.details.v2.domain.a;
import com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.state.bottom_sheet.RideCardChangeStateEventRepository;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.response.TipsVariant;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.order.f;

/* loaded from: classes14.dex */
public final class ifk0 extends h55 {
    public final w030 D;
    public final yvf0 E;
    public final h3y F;
    public final yvf0 G;
    public final yvf0 H;
    public final h3y I;
    public final yvf0 J;
    public final yvf0 K;
    public final yvf0 L;
    public final f2b M;
    public final yvf0 N;
    public final h3y O;
    public final h3y P;
    public final h3y Q;
    public final h3y R;
    public final h3y S;
    public final yvf0 T;
    public final p6f U;
    public final h3y V;
    public final a W;
    public final q2p Z;
    public final gx60 a0;
    public final s5w0 b0;
    public xkk0 c0;
    public ej1 d0;

    public ifk0(w030 w030Var, yvf0 yvf0Var, h3y h3yVar, yvf0 yvf0Var2, yvf0 yvf0Var3, h3y h3yVar2, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, f2b f2bVar, yvf0 yvf0Var7, h3y h3yVar3, h3y h3yVar4, h3y h3yVar5, h3y h3yVar6, h3y h3yVar7, yvf0 yvf0Var8, p6f p6fVar, h3y h3yVar8, a aVar, q2p q2pVar, gx60 gx60Var, s5w0 s5w0Var) {
        super(null);
        this.D = w030Var;
        this.E = yvf0Var;
        this.F = h3yVar;
        this.G = yvf0Var2;
        this.H = yvf0Var3;
        this.I = h3yVar2;
        this.J = yvf0Var4;
        this.K = yvf0Var5;
        this.L = yvf0Var6;
        this.M = f2bVar;
        this.N = yvf0Var7;
        this.O = h3yVar3;
        this.P = h3yVar4;
        this.Q = h3yVar5;
        this.R = h3yVar6;
        this.S = h3yVar7;
        this.T = yvf0Var8;
        this.U = p6fVar;
        this.V = h3yVar8;
        this.W = aVar;
        this.Z = q2pVar;
        this.a0 = gx60Var;
        this.b0 = s5w0Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.W.c = null;
        this.b0.invoke(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [zek0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [zek0] */
    @Override // defpackage.h55
    public final void J(Object obj) {
        t9y0 t9y0Var = (t9y0) obj;
        this.b0.invoke(new gfk0(this, t9y0Var.a()));
        final int i = 0;
        final int i2 = 1;
        this.W.a(o(), t9y0Var.a(), new tls(this) { // from class: zek0
            public final /* synthetic */ ifk0 b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                int i3 = i;
                zy11 zy11Var = zy11.a;
                ifk0 ifk0Var = this.b;
                de deVar = (de) obj2;
                switch (i3) {
                    case 0:
                        ifk0Var.A(deVar, zy11Var, sy60.Q2);
                        break;
                    default:
                        ifk0Var.j(new epb(deVar));
                        break;
                }
                return zy11Var;
            }
        }, new tls(this) { // from class: zek0
            public final /* synthetic */ ifk0 b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                int i3 = i2;
                zy11 zy11Var = zy11.a;
                ifk0 ifk0Var = this.b;
                de deVar = (de) obj2;
                switch (i3) {
                    case 0:
                        ifk0Var.A(deVar, zy11Var, sy60.Q2);
                        break;
                    default:
                        ifk0Var.j(new epb(deVar));
                        break;
                }
                return zy11Var;
            }
        });
        if (t9y0Var instanceof r9y0) {
            r9y0 r9y0Var = (r9y0) t9y0Var;
            o2y0 o2y0Var = r9y0Var.a;
            xkk0 xkk0Var = (xkk0) this.E.get();
            this.c0 = xkk0Var;
            A(xkk0Var, o2y0Var, new hfk0(this));
            Q(o2y0Var, r9y0Var.b);
            return;
        }
        if (t9y0Var instanceof q9y0) {
            ((q9y0) t9y0Var).c.invoke((View) ((ppk0) this.F.get()).a.get());
        } else {
            if (!(t9y0Var instanceof s9y0)) {
                w511.b();
                return;
            }
            s9y0 s9y0Var = (s9y0) t9y0Var;
            A((m950) this.H.get(), new cnk0(s9y0Var.b, s9y0Var.c), new p4g0(this, i2));
        }
    }

    public final void P(fmf fmfVar) {
        ej1 ej1Var = this.d0;
        if (ej1Var == null || !ej1Var.u()) {
            ej1 ej1Var2 = (ej1) this.M.get();
            this.d0 = ej1Var2;
            A(ej1Var2, fmfVar, new mo30(21, this));
        }
    }

    public final void Q(o2y0 o2y0Var, TaxiCardNavigationAction taxiCardNavigationAction) {
        TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType taxiOrderTipsValueType;
        h3y h3yVar = this.V;
        int i = afk0.a[taxiCardNavigationAction.ordinal()];
        if (i == 1) {
            ((f) ((l2y0) this.I.get()).a).k0(o2y0Var);
            return;
        }
        fmf fmfVar = null;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    return;
                }
                w511.b();
                return;
            } else {
                RideCardChangeStateEventRepository rideCardChangeStateEventRepository = (RideCardChangeStateEventRepository) h3yVar.get();
                rideCardChangeStateEventRepository.b = RideCardChangeStateEventRepository.ChangeStateEvent.EXPAND_CARD;
                r0 r0Var = rideCardChangeStateEventRepository.a;
                Object obj = new Object();
                r0Var.getClass();
                r0Var.m(null, obj);
                return;
            }
        }
        RideCardChangeStateEventRepository rideCardChangeStateEventRepository2 = (RideCardChangeStateEventRepository) h3yVar.get();
        rideCardChangeStateEventRepository2.b = RideCardChangeStateEventRepository.ChangeStateEvent.EXPAND_CARD;
        r0 r0Var2 = rideCardChangeStateEventRepository2.a;
        Object obj2 = new Object();
        r0Var2.getClass();
        r0Var2.m(null, obj2);
        xdf xdfVar = ((mmf) this.U.get()).a;
        OrderStatusInfo.TipsSuggestions tipsSuggestions = o2y0Var.b().V().E;
        TipsVariant.CustomizedOptions a = tipsSuggestions.a();
        if (a.b) {
            ief iefVar = o2y0Var.b().V().K;
            fef h = iefVar != null ? gwk0.h(iefVar) : null;
            String v = cvu0.v(a.c, ",", Extension.DOT_CHAR, false);
            xdfVar.getClass();
            Float j = avu0.j(xdf.e(v));
            if (j != null) {
                float floatValue = j.floatValue();
                Float j2 = avu0.j(xdf.e(cvu0.v(a.d, ",", Extension.DOT_CHAR, false)));
                if (j2 != null) {
                    float floatValue2 = j2.floatValue();
                    int i2 = lmf.a[tipsSuggestions.b().ordinal()];
                    if (i2 == 1) {
                        taxiOrderTipsValueType = TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType.PERCENT;
                    } else {
                        if (i2 != 2) {
                            w511.b();
                            return;
                        }
                        taxiOrderTipsValueType = TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType.FLAT;
                    }
                    fmfVar = new fmf(a.a, floatValue, floatValue2, null, taxiOrderTipsValueType, h);
                }
            }
        }
        if (fmfVar == null) {
            return;
        }
        P(fmfVar);
    }
}
