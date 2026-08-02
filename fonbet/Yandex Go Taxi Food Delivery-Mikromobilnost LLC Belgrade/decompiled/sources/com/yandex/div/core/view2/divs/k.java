package com.yandex.div.core.view2.divs;

import android.util.DisplayMetrics;
import android.view.View;
import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Animation;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivIndicator;
import com.yandex.div2.DivSizeUnit;
import defpackage.aw5;
import defpackage.bb1;
import defpackage.bcl;
import defpackage.c4x;
import defpackage.dnk;
import defpackage.egk;
import defpackage.k7l;
import defpackage.k890;
import defpackage.r8;
import defpackage.r8l;
import defpackage.rvo;
import defpackage.s8l;
import defpackage.sb2;
import defpackage.sqk;
import defpackage.srv;
import defpackage.t8l;
import defpackage.tls;
import defpackage.trv;
import defpackage.urv;
import defpackage.utk;
import defpackage.vrv;
import defpackage.vtk;
import defpackage.w511;
import defpackage.wrv;
import defpackage.xrv;
import defpackage.y5e;
import defpackage.yrv;
import defpackage.zrv;
import defpackage.zy11;

/* loaded from: classes.dex */
public final class k extends r8 {
    public final k890 c;

    public k(e eVar, k890 k890Var) {
        super(4, eVar);
        this.c = k890Var;
    }

    public static void Hg(DivPagerIndicatorView divPagerIndicatorView, rvo rvoVar, DivIndicator divIndicator) {
        sb2 Jg;
        urv trvVar;
        DisplayMetrics displayMetrics = divPagerIndicatorView.getResources().getDisplayMetrics();
        k7l k7lVar = divIndicator.d;
        Expression expression = divIndicator.s;
        k7l k7lVar2 = divIndicator.u;
        k7l k7lVar3 = divIndicator.t;
        float doubleValue = (float) ((Number) divIndicator.c.a(rvoVar)).doubleValue();
        float doubleValue2 = (float) ((Number) divIndicator.y.a(rvoVar)).doubleValue();
        if (k7lVar2 != null) {
            Jg = Jg(k7lVar2, displayMetrics, rvoVar, expression, 1.0f);
        } else if (k7lVar != null) {
            Jg = Jg(k7lVar, displayMetrics, rvoVar, expression, 1.0f / doubleValue);
        } else {
            Jg = k7lVar3 != null ? Jg(k7lVar3, displayMetrics, rvoVar, expression, doubleValue2) : null;
            if (Jg == null) {
                t8l t8lVar = divIndicator.E;
                if (t8lVar instanceof s8l) {
                    Jg = Jg(((s8l) t8lVar).b, displayMetrics, rvoVar, expression, 1.0f);
                } else {
                    if (!(t8lVar instanceof r8l)) {
                        w511.b();
                        return;
                    }
                    Jg = new xrv(((Number) expression.a(rvoVar)).intValue(), new vrv(a.K(((r8l) t8lVar).c().b, displayMetrics, rvoVar) * 1.0f));
                }
            }
        }
        sb2 sb2Var = Jg;
        Expression expression2 = divIndicator.b;
        sb2 Jg2 = k7lVar != null ? Jg(k7lVar, displayMetrics, rvoVar, expression2, 1.0f) : Ig(sb2Var, doubleValue, (Integer) expression2.a(rvoVar));
        sb2 Jg3 = k7lVar3 != null ? Jg(k7lVar3, displayMetrics, rvoVar, expression, 1.0f) : Ig(sb2Var, doubleValue2, null);
        DivIndicator.Animation animation = (DivIndicator.Animation) divIndicator.h.a(rvoVar);
        IndicatorParams$Animation indicatorParams$Animation = animation == DivIndicator.Animation.WORM ? IndicatorParams$Animation.WORM : animation == DivIndicator.Animation.SLIDER ? IndicatorParams$Animation.SLIDER : IndicatorParams$Animation.SCALE;
        c4x c4xVar = divIndicator.v;
        if (c4xVar == null) {
            c4xVar = new utk(new dnk(divIndicator.F));
        }
        if (c4xVar instanceof utk) {
            trvVar = new srv(a.H(((utk) c4xVar).b.a, displayMetrics, rvoVar));
        } else {
            if (!(c4xVar instanceof vtk)) {
                w511.b();
                return;
            }
            vtk vtkVar = (vtk) c4xVar;
            float H = a.H(vtkVar.a().a, displayMetrics, rvoVar);
            long longValue = ((Number) vtkVar.a().b.a(rvoVar)).longValue();
            long j = longValue >> 31;
            trvVar = new trv(H, (j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
        }
        divPagerIndicatorView.setStyle(new zrv(indicatorParams$Animation, Jg2, sb2Var, Jg3, trvVar));
    }

    public static sb2 Ig(sb2 sb2Var, float f, Integer num) {
        if (sb2Var instanceof yrv) {
            int intValue = num != null ? num.intValue() : ((yrv) sb2Var).x;
            yrv yrvVar = (yrv) sb2Var;
            wrv wrvVar = yrvVar.y;
            return bb1.f(intValue, wrvVar.f, wrvVar.g, wrvVar.h, f, Float.valueOf(yrvVar.z), Integer.valueOf(yrvVar.A));
        }
        if (sb2Var instanceof xrv) {
            return new xrv(num != null ? num.intValue() : ((xrv) sb2Var).x, new vrv(((xrv) sb2Var).y.q0() * f));
        }
        w511.b();
        return null;
    }

    public static yrv Jg(k7l k7lVar, DisplayMetrics displayMetrics, rvo rvoVar, Expression expression, float f) {
        DivSizeUnit divSizeUnit;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        bcl bclVar = k7lVar.e;
        if (bclVar == null || (expression4 = bclVar.c) == null || (divSizeUnit = (DivSizeUnit) expression4.a(rvoVar)) == null) {
            divSizeUnit = DivSizeUnit.DP;
        }
        Integer num = null;
        Integer valueOf = (bclVar == null || (expression3 = bclVar.d) == null) ? null : Integer.valueOf(a.O(Double.valueOf(((Number) expression3.a(rvoVar)).doubleValue()), displayMetrics, divSizeUnit));
        Expression expression5 = k7lVar.a;
        if (expression5 != null) {
            expression = expression5;
        }
        int intValue = ((Number) expression.a(rvoVar)).intValue();
        float K = a.K(k7lVar.d, displayMetrics, rvoVar);
        float K2 = a.K(k7lVar.c, displayMetrics, rvoVar);
        float K3 = a.K(k7lVar.b, displayMetrics, rvoVar);
        Float valueOf2 = valueOf != null ? Float.valueOf(valueOf.intValue()) : null;
        if (bclVar != null && (expression2 = bclVar.a) != null) {
            num = (Integer) expression2.a(rvoVar);
        }
        return bb1.f(intValue, K, K2, K3, f, valueOf2, num);
    }

    @Override // defpackage.r8
    public final void Hc(View view, aw5 aw5Var, egk egkVar, egk egkVar2) {
        final DivPagerIndicatorView divPagerIndicatorView = (DivPagerIndicatorView) view;
        final DivIndicator divIndicator = (DivIndicator) egkVar;
        final rvo rvoVar = aw5Var.b;
        Hg(divPagerIndicatorView, rvoVar, divIndicator);
        tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.DivIndicatorBinder$bind$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                k kVar = k.this;
                DivPagerIndicatorView divPagerIndicatorView2 = divPagerIndicatorView;
                rvo rvoVar2 = rvoVar;
                DivIndicator divIndicator2 = divIndicator;
                kVar.getClass();
                k.Hg(divPagerIndicatorView2, rvoVar2, divIndicator2);
                return zy11.a;
            }
        };
        divPagerIndicatorView.addSubscription(divIndicator.h.c(rvoVar, tlsVar));
        divPagerIndicatorView.addSubscription(divIndicator.b.c(rvoVar, tlsVar));
        divPagerIndicatorView.addSubscription(divIndicator.c.c(rvoVar, tlsVar));
        divPagerIndicatorView.addSubscription(divIndicator.s.c(rvoVar, tlsVar));
        divPagerIndicatorView.addSubscription(divIndicator.y.c(rvoVar, tlsVar));
        y5e.D(divPagerIndicatorView, divIndicator.E, rvoVar, tlsVar);
        y5e.C(divPagerIndicatorView, divIndicator.d, rvoVar, tlsVar);
        y5e.C(divPagerIndicatorView, divIndicator.u, rvoVar, tlsVar);
        y5e.C(divPagerIndicatorView, divIndicator.t, rvoVar, tlsVar);
        c4x c4xVar = divIndicator.v;
        if (c4xVar == null) {
            c4xVar = new utk(new dnk(divIndicator.F));
        }
        if (c4xVar instanceof utk) {
            sqk sqkVar = ((utk) c4xVar).b.a;
            divPagerIndicatorView.addSubscription(sqkVar.b.c(rvoVar, tlsVar));
            divPagerIndicatorView.addSubscription(sqkVar.a.c(rvoVar, tlsVar));
        } else if (c4xVar instanceof vtk) {
            vtk vtkVar = (vtk) c4xVar;
            divPagerIndicatorView.addSubscription(vtkVar.a().a.b.c(rvoVar, tlsVar));
            divPagerIndicatorView.addSubscription(vtkVar.a().a.a.c(rvoVar, tlsVar));
            divPagerIndicatorView.addSubscription(vtkVar.a().b.c(rvoVar, tlsVar));
        }
        Object c = divIndicator.S.c();
        if (c instanceof sqk) {
            y5e.z(divPagerIndicatorView, (sqk) c, rvoVar, tlsVar);
        }
        Object c2 = divIndicator.q.c();
        if (c2 instanceof sqk) {
            y5e.z(divPagerIndicatorView, (sqk) c2, rvoVar, tlsVar);
        }
    }
}
