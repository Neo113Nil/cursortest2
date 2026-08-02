package com.yandex.div.core.view2.divs;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.animation.Interpolator;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.widget.LoadableImageView;
import com.yandex.div.internal.view.DivImageView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.DivBlendMode;
import com.yandex.div2.DivImageScale;
import defpackage.aw5;
import defpackage.egk;
import defpackage.ffx;
import defpackage.fu11;
import defpackage.gtk;
import defpackage.hpk;
import defpackage.hxy;
import defpackage.jl40;
import defpackage.kvo;
import defpackage.l6o;
import defpackage.m6o;
import defpackage.ngd0;
import defpackage.opk;
import defpackage.p7b1;
import defpackage.ppk;
import defpackage.psk;
import defpackage.qje;
import defpackage.qpk;
import defpackage.r8;
import defpackage.rvo;
import defpackage.scc;
import defpackage.sls;
import defpackage.tls;
import defpackage.uml;
import defpackage.unr0;
import defpackage.v3k;
import defpackage.vez0;
import defpackage.w511;
import defpackage.wdv;
import defpackage.xsk;
import defpackage.ydv;
import defpackage.zdv;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends r8 {
    public final gtk c;
    public final com.yandex.div.core.view2.e w;
    public final m6o x;

    public j(e eVar, gtk gtkVar, com.yandex.div.core.view2.e eVar2, m6o m6oVar) {
        super(4, eVar);
        this.c = gtkVar;
        this.w = eVar2;
        this.x = m6oVar;
    }

    public static final void Hg(j jVar, DivImageView divImageView, psk pskVar, rvo rvoVar, BitmapSource bitmapSource) {
        divImageView.animate().cancel();
        hpk hpkVar = pskVar.i;
        float doubleValue = (float) ((Number) pskVar.g.a(rvoVar)).doubleValue();
        if (hpkVar == null || bitmapSource == BitmapSource.MEMORY) {
            divImageView.setAlpha(doubleValue);
            return;
        }
        long longValue = ((Number) hpkVar.b.a(rvoVar)).longValue();
        Interpolator e = uml.e((DivAnimationInterpolator) hpkVar.c.a(rvoVar));
        divImageView.setAlpha((float) ((Number) hpkVar.a.a(rvoVar)).doubleValue());
        divImageView.animate().alpha(doubleValue).setDuration(longValue).setInterpolator(e).setStartDelay(((Number) hpkVar.d.a(rvoVar)).longValue());
    }

    public static final void Ig(j jVar, final DivImageView divImageView, Div2View div2View, final Drawable drawable) {
        jVar.getClass();
        ngd0 ngd0Var = ngd0.G;
        ngd0Var.p();
        fu11 fu11Var = fu11.a;
        if (fu11Var.a()) {
            divImageView.setImageDrawable(drawable);
            return;
        }
        com.yandex.div.core.util.binding.a g = unr0.g(div2View, ngd0Var);
        if (fu11Var.a()) {
            divImageView.setImageDrawable(drawable);
        } else {
            g.c(new sls() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$setImageDrawable$$inlined$runMainThreadAction$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    DivImageView.this.setImageDrawable(drawable);
                    return zy11.a;
                }
            });
        }
    }

    public static final void Jg(j jVar, DivImageView divImageView, aw5 aw5Var, Bitmap bitmap, psk pskVar) {
        jVar.getClass();
        jVar.Mg(divImageView, aw5Var, bitmap, pskVar.N, pskVar.t);
        rvo rvoVar = aw5Var.b;
        divImageView.previewLoaded();
        Expression expression = pskVar.P;
        Ng(divImageView, expression != null ? (Integer) expression.a(rvoVar) : null, (DivBlendMode) pskVar.Q.a(rvoVar));
    }

    public static void Ng(LoadableImageView loadableImageView, Integer num, DivBlendMode divBlendMode) {
        if ((loadableImageView.isImageLoaded() || loadableImageView.isImagePreview()) && num != null) {
            loadableImageView.setColorFilter(num.intValue(), uml.q(divBlendMode));
        } else {
            loadableImageView.setColorFilter((ColorFilter) null);
        }
    }

    public static boolean Og(rvo rvoVar, DivImageView divImageView, psk pskVar) {
        return !divImageView.isImageLoaded() && ((Boolean) pskVar.x.a(rvoVar)).booleanValue();
    }

    public static void Pg(final DivImageView divImageView, Div2View div2View, final Bitmap bitmap) {
        ngd0 ngd0Var = ngd0.G;
        ngd0Var.p();
        fu11 fu11Var = fu11.a;
        if (fu11Var.a()) {
            divImageView.setImageBitmap(bitmap);
            return;
        }
        com.yandex.div.core.util.binding.a g = unr0.g(div2View, ngd0Var);
        if (fu11Var.a()) {
            divImageView.setImageBitmap(bitmap);
        } else {
            g.c(new sls() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$setImageBitmap$$inlined$runMainThreadAction$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    DivImageView.this.setImageBitmap(bitmap);
                    return zy11.a;
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0251, code lost:
    
        if (defpackage.qje.k(r2, r14 != null ? r14.B : null) == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0266, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0268, code lost:
    
        if (r2 == null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x026e, code lost:
    
        if (r2.isEmpty() == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0271, code lost:
    
        r3 = r1.getCurrentBitmapWithoutFilters();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0275, code lost:
    
        if (r3 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0277, code lost:
    
        r0.Mg(r1, r22, r3, r6.N, r6.t);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0281, code lost:
    
        r0 = r1.getDrawable();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0285, code lost:
    
        if (r0 != null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x028a, code lost:
    
        if ((r0 instanceof android.graphics.drawable.BitmapDrawable) == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x028c, code lost:
    
        r0 = ((android.graphics.drawable.BitmapDrawable) r0).getBitmap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02a2, code lost:
    
        Mg(r1, r22, r0, r6.N, r6.t);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0294, code lost:
    
        r0 = defpackage.ffx.d0(r0, r0.getIntrinsicWidth(), r0.getIntrinsicHeight(), 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02ae, code lost:
    
        r0 = r1.getCurrentBitmapWithoutFilters();
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02b2, code lost:
    
        if (r0 == null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02b4, code lost:
    
        Pg(r1, r7, r0);
        r1.setCurrentBitmapWithoutFilters$div_release(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0263, code lost:
    
        if (defpackage.qje.k(r13, r14 != null ? r14.K : null) == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a0, code lost:
    
        if (defpackage.qje.k(r4, r14 != null ? r14.p : null) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a1, code lost:
    
        if (defpackage.qje.k(r3, r14 != null ? r14.Q : null) != false) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01fd  */
    @Override // defpackage.r8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Hc(View view, final aw5 aw5Var, egk egkVar, egk egkVar2) {
        boolean z;
        boolean z2;
        Expression expression;
        final psk pskVar;
        final j jVar;
        aw5 aw5Var2;
        final psk pskVar2;
        Expression expression2;
        Expression expression3;
        List list;
        List list2;
        boolean z3;
        boolean z4;
        List list3;
        List list4;
        final DivImageView divImageView = (DivImageView) view;
        final psk pskVar3 = (psk) egkVar;
        psk pskVar4 = (psk) egkVar2;
        v3k v3kVar = pskVar3.b;
        Expression expression4 = pskVar3.K;
        Expression expression5 = pskVar3.B;
        Expression expression6 = pskVar3.N;
        a.c(divImageView, aw5Var, v3kVar, pskVar3.d, pskVar3.D, pskVar3.r, pskVar3.z, pskVar3.y, pskVar3.J, pskVar3.I, pskVar3.c, pskVar3.m);
        Div2View div2View = aw5Var.a;
        final rvo rvoVar = aw5Var.b;
        final l6o a = this.x.a(div2View.get_divData(), div2View.getDataTag());
        a.i(divImageView, pskVar3.j, pskVar4 != null ? pskVar4.j : null, rvoVar);
        if (!qje.k(expression6, pskVar4 != null ? pskVar4.N : null)) {
            divImageView.setImageScale(uml.o((DivImageScale) expression6.a(rvoVar)));
            if (!(expression6 instanceof kvo)) {
                divImageView.addSubscription(expression6.c(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$bindImageScale$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        j jVar2 = j.this;
                        DivImageView divImageView2 = divImageView;
                        jVar2.getClass();
                        divImageView2.setImageScale(uml.o((DivImageScale) obj));
                        return zy11.a;
                    }
                }));
            }
        }
        Expression expression7 = pskVar3.o;
        Expression expression8 = pskVar3.p;
        if (qje.k(expression7, pskVar4 != null ? pskVar4.o : null)) {
        }
        divImageView.setGravity(uml.b((DivAlignmentHorizontal) expression7.a(rvoVar), (DivAlignmentVertical) expression8.a(rvoVar)));
        if (!(expression7 instanceof kvo) || !(expression8 instanceof kvo)) {
            tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$bindContentAlignment$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    j jVar2 = j.this;
                    DivImageView divImageView2 = divImageView;
                    DivAlignmentHorizontal divAlignmentHorizontal = (DivAlignmentHorizontal) pskVar3.o.a(rvoVar);
                    DivAlignmentVertical divAlignmentVertical = (DivAlignmentVertical) pskVar3.p.a(rvoVar);
                    jVar2.getClass();
                    divImageView2.setGravity(uml.b(divAlignmentHorizontal, divAlignmentVertical));
                    return zy11.a;
                }
            };
            divImageView.addSubscription(expression7.c(rvoVar, tlsVar));
            divImageView.addSubscription(expression8.c(rvoVar, tlsVar));
        }
        Expression expression9 = pskVar3.G;
        boolean k = qje.k(expression5, pskVar4 != null ? pskVar4.B : null);
        if (qje.k(expression4, pskVar4 != null ? pskVar4.K : null)) {
            if (qje.k(expression9, pskVar4 != null ? pskVar4.G : null)) {
                z = false;
                boolean z5 = !qje.B(expression4) && (expression9 instanceof kvo);
                z2 = divImageView.isImageLoaded() && z;
                if (z2 || z5) {
                    expression = expression4;
                    pskVar = pskVar3;
                } else {
                    final rvo rvoVar2 = aw5Var.b;
                    expression = expression4;
                    pskVar = pskVar3;
                    tls tlsVar2 = new tls() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$observePlaceholders$callback$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            if (!DivImageView.this.isImageLoaded()) {
                                j jVar2 = this;
                                DivImageView divImageView2 = DivImageView.this;
                                aw5 aw5Var3 = aw5Var;
                                psk pskVar5 = pskVar;
                                rvo rvoVar3 = rvoVar2;
                                jVar2.getClass();
                                jVar2.Lg(divImageView2, aw5Var3, pskVar5, j.Og(rvoVar3, divImageView2, pskVar5), a);
                            }
                            return zy11.a;
                        }
                    };
                    a = a;
                    divImageView.addSubscription(expression != null ? expression.c(rvoVar2, tlsVar2) : null);
                    divImageView.addSubscription(expression9.c(rvoVar2, tlsVar2));
                }
                if (!k || qje.B(expression5)) {
                    jVar = this;
                    aw5Var2 = aw5Var;
                } else {
                    tls tlsVar3 = new tls() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$bindPreviewAndImage$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            j.this.Kg(divImageView, aw5Var, pskVar, a);
                            return zy11.a;
                        }
                    };
                    jVar = this;
                    divImageView = divImageView;
                    aw5Var2 = aw5Var;
                    divImageView.addSubscription(expression5.c(rvoVar, tlsVar3));
                }
                if (jVar.Kg(divImageView, aw5Var2, pskVar, a) && z2) {
                    psk pskVar5 = pskVar;
                    jVar.Lg(divImageView, aw5Var2, pskVar5, Og(rvoVar, divImageView, pskVar5), a);
                    pskVar2 = pskVar5;
                } else {
                    pskVar2 = pskVar;
                }
                expression2 = pskVar2.P;
                expression3 = pskVar2.Q;
                if (qje.k(expression2, pskVar4 == null ? pskVar4.P : null)) {
                }
                Ng(divImageView, expression2 == null ? (Integer) expression2.a(rvoVar) : null, (DivBlendMode) expression3.a(rvoVar));
                if (qje.B(expression2) || !(expression3 instanceof kvo)) {
                    tls tlsVar4 = new tls() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$bindTint$callback$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            j jVar2 = j.this;
                            DivImageView divImageView2 = divImageView;
                            Expression expression10 = pskVar2.P;
                            Integer num = expression10 != null ? (Integer) expression10.a(rvoVar) : null;
                            DivBlendMode divBlendMode = (DivBlendMode) pskVar2.Q.a(rvoVar);
                            jVar2.getClass();
                            j.Ng(divImageView2, num, divBlendMode);
                            return zy11.a;
                        }
                    };
                    divImageView.addSubscription(expression2 == null ? expression2.c(rvoVar, tlsVar4) : null);
                    divImageView.addSubscription(expression3.c(rvoVar, tlsVar4));
                }
                list = pskVar2.t;
                if (jl40.l(list == null ? Integer.valueOf(list.size()) : null, (pskVar4 != null || (list4 = pskVar4.t) == null) ? null : Integer.valueOf(list4.size()))) {
                    if (list != null) {
                        int i = 0;
                        z4 = true;
                        for (Object obj : list) {
                            int i2 = i + 1;
                            if (i < 0) {
                                scc.m();
                                throw null;
                            }
                            qpk qpkVar = (qpk) obj;
                            if (z4) {
                                if (vez0.m(qpkVar, (pskVar4 == null || (list3 = pskVar4.t) == null) ? null : (qpk) list3.get(i))) {
                                    z4 = true;
                                    i = i2;
                                }
                            }
                            z4 = false;
                            i = i2;
                        }
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        return;
                    }
                }
                if (divImageView.isImageLoaded()) {
                }
                if (divImageView.isImagePreview()) {
                }
                final List list5 = pskVar2.t;
                list2 = list5;
                if (list2 != null || list2.isEmpty()) {
                }
                List<qpk> list6 = list5;
                if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                    for (qpk qpkVar2 : list6) {
                        if (qpkVar2 == null || (qpkVar2 instanceof ppk)) {
                            z3 = true;
                        } else {
                            if (!(qpkVar2 instanceof opk)) {
                                w511.b();
                                return;
                            }
                            z3 = ((opk) qpkVar2).c().a instanceof kvo;
                        }
                        if (!z3) {
                            break;
                        }
                    }
                }
                if (expression6 instanceof kvo) {
                    return;
                }
                final psk pskVar6 = pskVar2;
                tls tlsVar5 = new tls() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$bindFilters$callback$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        Bitmap currentBitmapWithoutFilters = DivImageView.this.getCurrentBitmapWithoutFilters();
                        if (currentBitmapWithoutFilters != null) {
                            j jVar2 = this;
                            DivImageView divImageView2 = DivImageView.this;
                            aw5 aw5Var3 = aw5Var;
                            psk pskVar7 = pskVar6;
                            jVar2.Mg(divImageView2, aw5Var3, currentBitmapWithoutFilters, pskVar7.N, list5);
                        }
                        return zy11.a;
                    }
                };
                for (qpk qpkVar3 : list6) {
                    if (qpkVar3 instanceof opk) {
                        divImageView.addSubscription(((opk) qpkVar3).c().a.c(rvoVar, tlsVar5));
                    }
                }
                expression6.c(rvoVar, tlsVar5);
                return;
            }
        }
        z = true;
        if (qje.B(expression4)) {
        }
        if (divImageView.isImageLoaded()) {
        }
        if (z2) {
        }
        expression = expression4;
        pskVar = pskVar3;
        if (k) {
        }
        jVar = this;
        aw5Var2 = aw5Var;
        if (jVar.Kg(divImageView, aw5Var2, pskVar, a)) {
        }
        pskVar2 = pskVar;
        expression2 = pskVar2.P;
        expression3 = pskVar2.Q;
        if (qje.k(expression2, pskVar4 == null ? pskVar4.P : null)) {
        }
        Ng(divImageView, expression2 == null ? (Integer) expression2.a(rvoVar) : null, (DivBlendMode) expression3.a(rvoVar));
        if (qje.B(expression2)) {
        }
        tls tlsVar42 = new tls() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$bindTint$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                j jVar2 = j.this;
                DivImageView divImageView2 = divImageView;
                Expression expression10 = pskVar2.P;
                Integer num = expression10 != null ? (Integer) expression10.a(rvoVar) : null;
                DivBlendMode divBlendMode = (DivBlendMode) pskVar2.Q.a(rvoVar);
                jVar2.getClass();
                j.Ng(divImageView2, num, divBlendMode);
                return zy11.a;
            }
        };
        divImageView.addSubscription(expression2 == null ? expression2.c(rvoVar, tlsVar42) : null);
        divImageView.addSubscription(expression3.c(rvoVar, tlsVar42));
        list = pskVar2.t;
        if (jl40.l(list == null ? Integer.valueOf(list.size()) : null, (pskVar4 != null || (list4 = pskVar4.t) == null) ? null : Integer.valueOf(list4.size()))) {
        }
        if (divImageView.isImageLoaded()) {
        }
        if (divImageView.isImagePreview()) {
        }
        final List list52 = pskVar2.t;
        list2 = list52;
        if (list2 != null) {
        }
    }

    public final boolean Kg(DivImageView divImageView, aw5 aw5Var, psk pskVar, l6o l6oVar) {
        rvo rvoVar = aw5Var.b;
        Div2View div2View = aw5Var.a;
        Uri uri = (Uri) pskVar.B.a(rvoVar);
        if (jl40.l(uri, divImageView.getImageUrl())) {
            return false;
        }
        boolean Og = Og(rvoVar, divImageView, pskVar);
        divImageView.resetImageLoaded();
        divImageView.setCurrentBitmapWithoutFilters$div_release(null);
        divImageView.setColorFilter((ColorFilter) null);
        hxy loadReference = divImageView.getLoadReference();
        if (loadReference != null) {
            loadReference.cancel();
        }
        Lg(divImageView, aw5Var, pskVar, Og, l6oVar);
        divImageView.setImageUrl$div_release(uri);
        hxy loadImage = this.c.loadImage(uri.toString(), new xsk(this, divImageView, aw5Var, pskVar, rvoVar, div2View));
        div2View.addLoadReference(loadImage, divImageView);
        divImageView.setLoadReference$div_release(loadImage);
        return true;
    }

    public final void Lg(final DivImageView divImageView, final aw5 aw5Var, final psk pskVar, boolean z, l6o l6oVar) {
        rvo rvoVar = aw5Var.b;
        Expression expression = pskVar.K;
        this.w.a(divImageView, l6oVar, expression != null ? (String) expression.a(rvoVar) : null, ((Number) pskVar.G.a(rvoVar)).intValue(), z, new tls() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$applyPlaceholders$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                final Drawable drawable = (Drawable) obj;
                if (!divImageView.isImageLoaded() && !divImageView.isImagePreview()) {
                    j jVar = this;
                    final DivImageView divImageView2 = divImageView;
                    Div2View div2View = aw5Var.a;
                    jVar.getClass();
                    ngd0 ngd0Var = ngd0.G;
                    ngd0Var.p();
                    fu11 fu11Var = fu11.a;
                    if (!fu11Var.a()) {
                        com.yandex.div.core.util.binding.a g = unr0.g(div2View, ngd0Var);
                        if (!fu11Var.a()) {
                            g.c(new sls() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$setPlaceholder$$inlined$runMainThreadAction$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    DivImageView.this.setPlaceholder(drawable);
                                    return zy11.a;
                                }
                            });
                        }
                    }
                    divImageView2.setPlaceholder(drawable);
                }
                return zy11.a;
            }
        }, new tls() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$applyPlaceholders$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                List list;
                zdv zdvVar = (zdv) obj;
                if (!DivImageView.this.isImageLoaded()) {
                    if (zdvVar instanceof wdv) {
                        j.Jg(this, DivImageView.this, aw5Var, ((wdv) zdvVar).a, pskVar);
                    } else if (zdvVar instanceof ydv) {
                        j jVar = this;
                        psk pskVar2 = pskVar;
                        jVar.getClass();
                        if (pskVar2.P == null && ((list = pskVar2.t) == null || list.isEmpty())) {
                            DivImageView.this.previewLoaded();
                            j.Ig(this, DivImageView.this, aw5Var.a, ((ydv) zdvVar).b());
                        } else {
                            j.Jg(this, DivImageView.this, aw5Var, ffx.d0(((ydv) zdvVar).b(), 0, 0, 7), pskVar);
                        }
                    }
                }
                return zy11.a;
            }
        });
    }

    public final void Mg(final DivImageView divImageView, final aw5 aw5Var, Bitmap bitmap, Expression expression, List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            Pg(divImageView, aw5Var.a, bitmap);
            return;
        }
        DivImageScale divImageScale = (DivImageScale) expression.a(aw5Var.b);
        ArrayList n = uml.n(list, aw5Var.b);
        divImageView.setCurrentBitmapWithoutFilters$div_release(bitmap);
        p7b1.c(bitmap, divImageScale, divImageView, aw5Var.a, n, new tls() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$applyScaleAndFiltersAndSetBitmap$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                j jVar = this;
                DivImageView divImageView2 = divImageView;
                Div2View div2View = aw5Var.a;
                jVar.getClass();
                j.Pg(divImageView2, div2View, (Bitmap) obj);
                return zy11.a;
            }
        });
    }
}
