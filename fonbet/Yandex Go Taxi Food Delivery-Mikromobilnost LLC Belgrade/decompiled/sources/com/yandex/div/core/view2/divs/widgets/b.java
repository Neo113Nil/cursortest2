package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import android.view.ViewOutlineProvider;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivBorder;
import defpackage.aw5;
import defpackage.bcl;
import defpackage.jkk;
import defpackage.jnk;
import defpackage.kvo;
import defpackage.m8l;
import defpackage.qje;
import defpackage.rvo;
import defpackage.tls;
import defpackage.ugk;
import defpackage.vez0;
import defpackage.x4l;
import defpackage.zy11;

/* loaded from: classes.dex */
public final class b implements ugk {
    public a a;
    public boolean b = true;

    @Override // defpackage.ugk
    public final a getDivBorderDrawer() {
        return this.a;
    }

    @Override // defpackage.ugk
    public final boolean getNeedClipping() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0087, code lost:
    
        if (defpackage.qje.k(r3 != null ? r3.a : null, r4 != null ? r4.a : null) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0128, code lost:
    
        if (defpackage.vez0.p(r12 != null ? r12.e : null, r2 != null ? r2.e : null) != false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0116, code lost:
    
        if (defpackage.vez0.k(r3 != null ? r3.b : null, r4 != null ? r4.b : null) != false) goto L127;
     */
    @Override // defpackage.ugk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setBorder(aw5 aw5Var, final DivBorder divBorder, View view) {
        boolean z;
        x4l x4lVar;
        jnk jnkVar;
        Expression expression;
        x4l x4lVar2;
        jnk jnkVar2;
        Expression expression2;
        x4l x4lVar3;
        jnk jnkVar3;
        Expression expression3;
        x4l x4lVar4;
        jnk jnkVar4;
        Expression expression4;
        Expression expression5;
        Expression expression6;
        Expression expression7;
        Expression expression8;
        Expression expression9;
        Expression expression10;
        Expression expression11;
        Expression expression12;
        Expression expression13;
        Expression expression14;
        x4l x4lVar5;
        jnk jnkVar5;
        jnk jnkVar6;
        if (this.a == null && divBorder != null) {
            this.a = new a(view, aw5Var.a);
        }
        final a aVar = this.a;
        if (aVar != null) {
            final rvo rvoVar = aw5Var.b;
            DivBorder divBorder2 = aVar.c;
            if (divBorder != null || divBorder2 != null) {
                if (qje.k(divBorder != null ? divBorder.a : null, divBorder2 != null ? divBorder2.a : null)) {
                    jkk jkkVar = divBorder != null ? divBorder.b : null;
                    jkk jkkVar2 = divBorder2 != null ? divBorder2.b : null;
                    if (jkkVar != null || jkkVar2 != null) {
                        if (qje.k(jkkVar != null ? jkkVar.c : null, jkkVar2 != null ? jkkVar2.c : null)) {
                            if (qje.k(jkkVar != null ? jkkVar.d : null, jkkVar2 != null ? jkkVar2.d : null)) {
                                if (qje.k(jkkVar != null ? jkkVar.b : null, jkkVar2 != null ? jkkVar2.b : null)) {
                                }
                            }
                        }
                    }
                    if (qje.k(divBorder != null ? divBorder.c : null, divBorder2 != null ? divBorder2.c : null)) {
                        m8l m8lVar = divBorder != null ? divBorder.d : null;
                        m8l m8lVar2 = divBorder2 != null ? divBorder2.d : null;
                        if (m8lVar != null || m8lVar2 != null) {
                            if (qje.k(m8lVar != null ? m8lVar.a : null, m8lVar2 != null ? m8lVar2.a : null)) {
                                if (qje.k(m8lVar != null ? m8lVar.b : null, m8lVar2 != null ? m8lVar2.b : null)) {
                                    if (qje.k(m8lVar != null ? m8lVar.c : null, m8lVar2 != null ? m8lVar2.c : null)) {
                                        x4l x4lVar6 = m8lVar != null ? m8lVar.d : null;
                                        x4l x4lVar7 = m8lVar2 != null ? m8lVar2.d : null;
                                        if (x4lVar6 != null || x4lVar7 != null) {
                                            if (vez0.k(x4lVar6 != null ? x4lVar6.a : null, x4lVar7 != null ? x4lVar7.a : null)) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                aVar.closeAllSubscription();
                aVar.c = divBorder;
                aVar.a(divBorder, rvoVar);
                if (divBorder != null) {
                    Expression expression15 = divBorder.c;
                    Expression expression16 = divBorder.a;
                    bcl bclVar = divBorder.e;
                    jkk jkkVar3 = divBorder.b;
                    m8l m8lVar3 = divBorder.d;
                    if (!qje.B(expression16) || ((jkkVar3 != null && (!qje.B(jkkVar3.c) || !qje.B(jkkVar3.d) || !qje.B(jkkVar3.b) || !qje.B(jkkVar3.a))) || !(expression15 instanceof kvo) || ((m8lVar3 != null && (!(m8lVar3.a instanceof kvo) || !(m8lVar3.b instanceof kvo) || !(m8lVar3.c instanceof kvo) || ((x4lVar5 = m8lVar3.d) != null && (((jnkVar5 = x4lVar5.a) != null && (!(jnkVar5.a instanceof kvo) || !(jnkVar5.b instanceof kvo))) || ((jnkVar6 = x4lVar5.b) != null && (!(jnkVar6.a instanceof kvo) || !(jnkVar6.b instanceof kvo))))))) || !vez0.L(bclVar)))) {
                        tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.widgets.DivBorderDrawer$observeBorder$callback$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                a.this.a(divBorder, rvoVar);
                                a.this.b.invalidate();
                                return zy11.a;
                            }
                        };
                        aVar.addSubscription(expression16 != null ? expression16.c(rvoVar, tlsVar) : null);
                        aVar.addSubscription((jkkVar3 == null || (expression14 = jkkVar3.c) == null) ? null : expression14.c(rvoVar, tlsVar));
                        aVar.addSubscription((jkkVar3 == null || (expression13 = jkkVar3.d) == null) ? null : expression13.c(rvoVar, tlsVar));
                        aVar.addSubscription((jkkVar3 == null || (expression12 = jkkVar3.b) == null) ? null : expression12.c(rvoVar, tlsVar));
                        aVar.addSubscription((jkkVar3 == null || (expression11 = jkkVar3.a) == null) ? null : expression11.c(rvoVar, tlsVar));
                        aVar.addSubscription(expression15.c(rvoVar, tlsVar));
                        aVar.addSubscription((bclVar == null || (expression10 = bclVar.a) == null) ? null : expression10.c(rvoVar, tlsVar));
                        aVar.addSubscription((bclVar == null || (expression9 = bclVar.d) == null) ? null : expression9.c(rvoVar, tlsVar));
                        aVar.addSubscription((bclVar == null || (expression8 = bclVar.c) == null) ? null : expression8.c(rvoVar, tlsVar));
                        aVar.addSubscription((m8lVar3 == null || (expression7 = m8lVar3.a) == null) ? null : expression7.c(rvoVar, tlsVar));
                        aVar.addSubscription((m8lVar3 == null || (expression6 = m8lVar3.b) == null) ? null : expression6.c(rvoVar, tlsVar));
                        aVar.addSubscription((m8lVar3 == null || (expression5 = m8lVar3.c) == null) ? null : expression5.c(rvoVar, tlsVar));
                        aVar.addSubscription((m8lVar3 == null || (x4lVar4 = m8lVar3.d) == null || (jnkVar4 = x4lVar4.a) == null || (expression4 = jnkVar4.a) == null) ? null : expression4.c(rvoVar, tlsVar));
                        aVar.addSubscription((m8lVar3 == null || (x4lVar3 = m8lVar3.d) == null || (jnkVar3 = x4lVar3.a) == null || (expression3 = jnkVar3.b) == null) ? null : expression3.c(rvoVar, tlsVar));
                        aVar.addSubscription((m8lVar3 == null || (x4lVar2 = m8lVar3.d) == null || (jnkVar2 = x4lVar2.b) == null || (expression2 = jnkVar2.a) == null) ? null : expression2.c(rvoVar, tlsVar));
                        aVar.addSubscription((m8lVar3 == null || (x4lVar = m8lVar3.d) == null || (jnkVar = x4lVar.b) == null || (expression = jnkVar.b) == null) ? null : expression.c(rvoVar, tlsVar));
                    }
                }
            }
        }
        a aVar2 = this.a;
        if (aVar2 != null && aVar2.G != (z = this.b)) {
            aVar2.G = z;
            aVar2.h();
            aVar2.b.invalidate();
        }
        if (divBorder == null) {
            view.setElevation(0.0f);
            view.setClipToOutline(false);
            view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            releaseBorderDrawer();
            this.a = null;
        }
        view.invalidate();
    }

    @Override // defpackage.ugk
    public final void setNeedClipping(boolean z) {
        a aVar = this.a;
        if (aVar != null && aVar.G != z) {
            aVar.G = z;
            aVar.h();
            aVar.b.invalidate();
        }
        this.b = z;
    }
}
