package com.yandex.div.core.view2.divs;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import com.yandex.div.internal.widget.slider.SliderView;
import com.yandex.div.internal.widget.slider.shapes.TextDrawable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivSizeUnit;
import defpackage.aok;
import defpackage.apf;
import defpackage.aw5;
import defpackage.egk;
import defpackage.fal;
import defpackage.gal;
import defpackage.hal;
import defpackage.hl11;
import defpackage.kal;
import defpackage.l6o;
import defpackage.lz;
import defpackage.m6o;
import defpackage.nml;
import defpackage.r8;
import defpackage.rvo;
import defpackage.tls;
import defpackage.uml;
import defpackage.y5e;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class t extends r8 {
    public final boolean A;
    public l6o B;
    public final nml c;
    public final hl11 w;
    public final m6o x;
    public final float y;
    public final com.yandex.div.core.c z;

    public t(e eVar, nml nmlVar, hl11 hl11Var, m6o m6oVar, float f, com.yandex.div.core.c cVar, boolean z) {
        super(4, eVar);
        this.c = nmlVar;
        this.w = hl11Var;
        this.x = m6oVar;
        this.y = f;
        this.z = cVar;
        this.A = z;
    }

    public final void Hg(DivSliderView divSliderView) {
        if (!this.A || this.B == null) {
            return;
        }
        OneShotPreDrawListener.add(divSliderView, new lz(15, divSliderView, divSliderView, this));
    }

    @Override // defpackage.r8
    public final void ae(View view, aw5 aw5Var, egk egkVar, egk egkVar2, com.yandex.div.core.state.b bVar) {
        Div2View div2View;
        zy11 zy11Var;
        Iterator it;
        Expression expression;
        int i;
        List list;
        final DivSliderView divSliderView = (DivSliderView) view;
        hal halVar = (hal) egkVar;
        Div2View div2View2 = aw5Var.a;
        final rvo rvoVar = aw5Var.b;
        this.B = this.x.a(div2View2.get_divData(), div2View2.getDataTag());
        divSliderView.setInterceptionAngle(this.y);
        Expression expression2 = halVar.s;
        final aok aokVar = halVar.L;
        final aok aokVar2 = halVar.K;
        final aok aokVar3 = halVar.E;
        divSliderView.addSubscription(expression2.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$bind$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                DivSliderView.this.setMinValue(((Number) obj).longValue());
                this.Hg(DivSliderView.this);
                return zy11.a;
            }
        }));
        Expression expression3 = halVar.r;
        divSliderView.addSubscription(expression3.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$bind$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                DivSliderView.this.setMaxValue(((Number) obj).longValue());
                this.Hg(DivSliderView.this);
                return zy11.a;
            }
        }));
        divSliderView.addSubscription(halVar.o.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$bind$3
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                DivSliderView.this.setInteractive(((Boolean) obj).booleanValue());
                return zy11.a;
            }
        }));
        divSliderView.clearOnThumbChangedListener();
        String str = halVar.G;
        int i2 = 1;
        hl11 hl11Var = this.w;
        if (str != null) {
            divSliderView.addSubscription(hl11Var.a(aw5Var, str, new kal(divSliderView, this, aw5Var, i2)));
        }
        divSliderView.setThumbDrawable(uml.m(aokVar3, divSliderView.getResources().getDisplayMetrics(), rvoVar));
        y5e.x(divSliderView, aokVar3, rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                t tVar = t.this;
                DivSliderView divSliderView2 = divSliderView;
                rvo rvoVar2 = rvoVar;
                aok aokVar4 = aokVar3;
                tVar.getClass();
                divSliderView2.setThumbDrawable(uml.m(aokVar4, divSliderView2.getResources().getDisplayMetrics(), rvoVar2));
                return zy11.a;
            }
        });
        final gal galVar = halVar.F;
        nml nmlVar = this.c;
        divSliderView.setThumbTextDrawable(galVar != null ? new TextDrawable(y5e.N(galVar, divSliderView.getResources().getDisplayMetrics(), nmlVar, rvoVar)) : null);
        if (galVar != null) {
            divSliderView.addSubscription(galVar.i.c(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbTextStyle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    ((Number) obj).intValue();
                    t tVar = t.this;
                    DivSliderView divSliderView2 = divSliderView;
                    rvo rvoVar2 = rvoVar;
                    gal galVar2 = galVar;
                    tVar.getClass();
                    divSliderView2.setThumbTextDrawable(galVar2 != null ? new TextDrawable(y5e.N(galVar2, divSliderView2.getResources().getDisplayMetrics(), tVar.c, rvoVar2)) : null);
                    return zy11.a;
                }
            }));
        }
        String str2 = halVar.D;
        zy11 zy11Var2 = zy11.a;
        int i3 = 0;
        if (str2 == null) {
            div2View = div2View2;
            divSliderView.setThumbSecondaryDrawable(null);
            divSliderView.setThumbSecondaryValue(null, false);
        } else {
            div2View = div2View2;
            divSliderView.addSubscription(hl11Var.a(aw5Var, str2, new kal(divSliderView, this, aw5Var, i3)));
            final aok aokVar4 = halVar.B;
            if (aokVar4 != null) {
                divSliderView.setThumbSecondaryDrawable(uml.m(aokVar4, divSliderView.getResources().getDisplayMetrics(), rvoVar));
                y5e.x(divSliderView, aokVar4, rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbSecondaryStyle$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        t tVar = t.this;
                        DivSliderView divSliderView2 = divSliderView;
                        rvo rvoVar2 = rvoVar;
                        aok aokVar5 = aokVar4;
                        tVar.getClass();
                        divSliderView2.setThumbSecondaryDrawable(uml.m(aokVar5, divSliderView2.getResources().getDisplayMetrics(), rvoVar2));
                        return zy11.a;
                    }
                });
                zy11Var = zy11Var2;
            } else {
                zy11Var = null;
            }
            if (zy11Var == null) {
                divSliderView.setThumbSecondaryDrawable(uml.m(aokVar3, divSliderView.getResources().getDisplayMetrics(), rvoVar));
                y5e.x(divSliderView, aokVar3, rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbSecondaryStyle$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        t tVar = t.this;
                        DivSliderView divSliderView2 = divSliderView;
                        rvo rvoVar2 = rvoVar;
                        aok aokVar5 = aokVar3;
                        tVar.getClass();
                        divSliderView2.setThumbSecondaryDrawable(uml.m(aokVar5, divSliderView2.getResources().getDisplayMetrics(), rvoVar2));
                        return zy11.a;
                    }
                });
            }
            final gal galVar2 = halVar.C;
            divSliderView.setThumbSecondTextDrawable(galVar2 != null ? new TextDrawable(y5e.N(galVar2, divSliderView.getResources().getDisplayMetrics(), nmlVar, rvoVar)) : null);
            if (galVar2 != null) {
                divSliderView.addSubscription(galVar2.i.c(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbSecondaryTextStyle$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        ((Number) obj).intValue();
                        t tVar = t.this;
                        DivSliderView divSliderView2 = divSliderView;
                        rvo rvoVar2 = rvoVar;
                        gal galVar3 = galVar2;
                        tVar.getClass();
                        divSliderView2.setThumbSecondTextDrawable(galVar3 != null ? new TextDrawable(y5e.N(galVar3, divSliderView2.getResources().getDisplayMetrics(), tVar.c, rvoVar2)) : null);
                        return zy11.a;
                    }
                }));
            }
        }
        divSliderView.setActiveTrackDrawable(uml.m(aokVar2, divSliderView.getResources().getDisplayMetrics(), rvoVar));
        y5e.x(divSliderView, aokVar2, rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeTrackActiveStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                t tVar = t.this;
                DivSliderView divSliderView2 = divSliderView;
                rvo rvoVar2 = rvoVar;
                aok aokVar5 = aokVar2;
                tVar.getClass();
                divSliderView2.setActiveTrackDrawable(uml.m(aokVar5, divSliderView2.getResources().getDisplayMetrics(), rvoVar2));
                return zy11.a;
            }
        });
        divSliderView.setInactiveTrackDrawable(uml.m(aokVar, divSliderView.getResources().getDisplayMetrics(), rvoVar));
        y5e.x(divSliderView, aokVar, rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeTrackInactiveStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                t tVar = t.this;
                DivSliderView divSliderView2 = divSliderView;
                rvo rvoVar2 = rvoVar;
                aok aokVar5 = aokVar;
                tVar.getClass();
                divSliderView2.setInactiveTrackDrawable(uml.m(aokVar5, divSliderView2.getResources().getDisplayMetrics(), rvoVar2));
                return zy11.a;
            }
        });
        final aok aokVar5 = halVar.H;
        divSliderView.setActiveTickMarkDrawable(aokVar5 != null ? uml.m(aokVar5, divSliderView.getResources().getDisplayMetrics(), rvoVar) : null);
        Hg(divSliderView);
        y5e.x(divSliderView, aokVar5, rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeTickMarkActiveStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                t tVar = t.this;
                DivSliderView divSliderView2 = divSliderView;
                rvo rvoVar2 = rvoVar;
                aok aokVar6 = aokVar5;
                tVar.getClass();
                divSliderView2.setActiveTickMarkDrawable(aokVar6 != null ? uml.m(aokVar6, divSliderView2.getResources().getDisplayMetrics(), rvoVar2) : null);
                tVar.Hg(divSliderView2);
                return zy11.a;
            }
        });
        final aok aokVar6 = halVar.I;
        divSliderView.setInactiveTickMarkDrawable(aokVar6 != null ? uml.m(aokVar6, divSliderView.getResources().getDisplayMetrics(), rvoVar) : null);
        Hg(divSliderView);
        y5e.x(divSliderView, aokVar6, rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeTickMarkInactiveStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                t tVar = t.this;
                DivSliderView divSliderView2 = divSliderView;
                rvo rvoVar2 = rvoVar;
                aok aokVar7 = aokVar6;
                tVar.getClass();
                divSliderView2.setInactiveTickMarkDrawable(aokVar7 != null ? uml.m(aokVar7, divSliderView2.getResources().getDisplayMetrics(), rvoVar2) : null);
                tVar.Hg(divSliderView2);
                return zy11.a;
            }
        });
        divSliderView.getRanges().clear();
        List list2 = halVar.w;
        if (list2 != null) {
            final DisplayMetrics displayMetrics = divSliderView.getResources().getDisplayMetrics();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                fal falVar = (fal) it2.next();
                final SliderView.a aVar = new SliderView.a();
                divSliderView.getRanges().add(aVar);
                Expression expression4 = falVar.c;
                if (expression4 == null) {
                    expression4 = expression2;
                }
                divSliderView.addSubscription(expression4.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        long longValue = ((Number) obj).longValue();
                        DivSliderView divSliderView2 = DivSliderView.this;
                        aVar.a = longValue;
                        divSliderView2.requestLayout();
                        divSliderView2.invalidate();
                        return zy11.a;
                    }
                }));
                Expression expression5 = falVar.a;
                if (expression5 == null) {
                    expression5 = expression3;
                }
                divSliderView.addSubscription(expression5.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        long longValue = ((Number) obj).longValue();
                        DivSliderView divSliderView2 = DivSliderView.this;
                        aVar.b = longValue;
                        divSliderView2.requestLayout();
                        divSliderView2.invalidate();
                        return zy11.a;
                    }
                }));
                final DivEdgeInsets divEdgeInsets = falVar.b;
                if (divEdgeInsets == null) {
                    aVar.k();
                    aVar.j();
                    it = it2;
                    i = i3;
                } else {
                    Expression expression6 = divEdgeInsets.b;
                    Expression expression7 = divEdgeInsets.e;
                    boolean z = (expression7 == null && expression6 == null) ? false : true;
                    if (!z) {
                        expression7 = divEdgeInsets.c;
                    }
                    if (!z) {
                        expression6 = divEdgeInsets.d;
                    }
                    if (expression7 != null) {
                        final rvo rvoVar2 = rvoVar;
                        final DisplayMetrics displayMetrics2 = displayMetrics;
                        it = it2;
                        expression = expression6;
                        tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$3$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                long longValue = ((Number) obj).longValue();
                                DivSliderView divSliderView2 = DivSliderView.this;
                                SliderView.a aVar2 = aVar;
                                DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
                                rvo rvoVar3 = rvoVar2;
                                aVar2.c = y5e.g(longValue, (DivSizeUnit) divEdgeInsets2.g.a(rvoVar3), displayMetrics2);
                                divSliderView2.requestLayout();
                                divSliderView2.invalidate();
                                return zy11.a;
                            }
                        };
                        rvoVar = rvoVar2;
                        displayMetrics = displayMetrics2;
                        divSliderView.addSubscription(expression7.c(rvoVar, tlsVar));
                    } else {
                        it = it2;
                        expression = expression6;
                    }
                    if (expression != null) {
                        final rvo rvoVar3 = rvoVar;
                        final DisplayMetrics displayMetrics3 = displayMetrics;
                        tls tlsVar2 = new tls() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$3$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                long longValue = ((Number) obj).longValue();
                                DivSliderView divSliderView2 = DivSliderView.this;
                                SliderView.a aVar2 = aVar;
                                DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
                                rvo rvoVar4 = rvoVar3;
                                aVar2.d = y5e.g(longValue, (DivSizeUnit) divEdgeInsets2.g.a(rvoVar4), displayMetrics3);
                                divSliderView2.requestLayout();
                                divSliderView2.invalidate();
                                return zy11.a;
                            }
                        };
                        rvoVar = rvoVar3;
                        displayMetrics = displayMetrics3;
                        divSliderView.addSubscription(expression.c(rvoVar, tlsVar2));
                    }
                    Expression expression8 = divEdgeInsets.g;
                    final Expression expression9 = expression;
                    final DisplayMetrics displayMetrics4 = displayMetrics;
                    final Expression expression10 = expression7;
                    i = 0;
                    tls tlsVar3 = new tls() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$3$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            DivSizeUnit divSizeUnit = (DivSizeUnit) obj;
                            DivSliderView divSliderView2 = DivSliderView.this;
                            Expression expression11 = expression10;
                            Expression expression12 = expression9;
                            SliderView.a aVar2 = aVar;
                            rvo rvoVar4 = rvoVar;
                            DisplayMetrics displayMetrics5 = displayMetrics4;
                            if (expression11 != null) {
                                aVar2.c = y5e.g(((Number) expression11.a(rvoVar4)).longValue(), divSizeUnit, displayMetrics5);
                            }
                            if (expression12 != null) {
                                aVar2.d = y5e.g(((Number) expression12.a(rvoVar4)).longValue(), divSizeUnit, displayMetrics5);
                            }
                            divSliderView2.requestLayout();
                            divSliderView2.invalidate();
                            return zy11.a;
                        }
                    };
                    aVar = aVar;
                    displayMetrics = displayMetrics4;
                    expression8.d(rvoVar, tlsVar3);
                }
                aok aokVar7 = falVar.d;
                final aok aokVar8 = aokVar7 == null ? aokVar2 : aokVar7;
                tls tlsVar4 = new tls() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$applyActiveTrackStyle$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        DivSliderView divSliderView2 = DivSliderView.this;
                        aVar.e = uml.m(aokVar8, displayMetrics, rvoVar);
                        divSliderView2.requestLayout();
                        divSliderView2.invalidate();
                        return zy11.a;
                    }
                };
                tlsVar4.invoke(zy11Var2);
                y5e.x(divSliderView, aokVar8, rvoVar, tlsVar4);
                aok aokVar9 = falVar.e;
                final aok aokVar10 = aokVar9 == null ? aokVar : aokVar9;
                tls tlsVar5 = new tls() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$applyInactiveTrackStyle$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        DivSliderView divSliderView2 = DivSliderView.this;
                        aVar.f = uml.m(aokVar10, displayMetrics, rvoVar);
                        divSliderView2.requestLayout();
                        divSliderView2.invalidate();
                        return zy11.a;
                    }
                };
                tlsVar5.invoke(zy11Var2);
                y5e.x(divSliderView, aokVar10, rvoVar, tlsVar5);
                it2 = it;
                i3 = i;
            }
        }
        divSliderView.removeTouchListener$div_release();
        List list3 = halVar.v;
        if ((list3 == null || list3.isEmpty()) && ((list = halVar.u) == null || list.isEmpty())) {
            return;
        }
        divSliderView.setTouchListener$div_release(new apf(halVar, this, div2View, rvoVar, 25));
    }
}
