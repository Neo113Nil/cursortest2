package com.yandex.div.core.view2.divs;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivImageScale;
import defpackage.aw5;
import defpackage.egk;
import defpackage.fu11;
import defpackage.gtk;
import defpackage.hxy;
import defpackage.jl40;
import defpackage.l6o;
import defpackage.m6o;
import defpackage.ngd0;
import defpackage.r8;
import defpackage.rvo;
import defpackage.sls;
import defpackage.tfk;
import defpackage.tls;
import defpackage.uml;
import defpackage.unr0;
import defpackage.wdv;
import defpackage.xrk;
import defpackage.ydv;
import defpackage.yrk;
import defpackage.zdv;
import defpackage.zy11;

/* loaded from: classes.dex */
public final class h extends r8 {
    public final gtk c;
    public final com.yandex.div.core.view2.e w;
    public final m6o x;

    public h(e eVar, gtk gtkVar, com.yandex.div.core.view2.e eVar2, m6o m6oVar) {
        super(4, eVar);
        this.c = gtkVar;
        this.w = eVar2;
        this.x = m6oVar;
    }

    @Override // defpackage.r8
    public final void Hc(View view, aw5 aw5Var, egk egkVar, egk egkVar2) {
        final DivGifImageView divGifImageView = (DivGifImageView) view;
        final xrk xrkVar = (xrk) egkVar;
        xrk xrkVar2 = (xrk) egkVar2;
        final Div2View div2View = aw5Var.a;
        final rvo rvoVar = aw5Var.b;
        final l6o a = this.x.a(div2View.get_divData(), div2View.getDataTag());
        a.c(divGifImageView, aw5Var, xrkVar.b, xrkVar.d, xrkVar.A, xrkVar.q, xrkVar.x, xrkVar.w, xrkVar.G, xrkVar.F, xrkVar.c, xrkVar.l);
        a.i(divGifImageView, xrkVar.i, xrkVar2 != null ? xrkVar2.i : null, rvoVar);
        divGifImageView.addSubscription(xrkVar.L.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$bind$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                DivGifImageView.this.setImageScale(uml.o((DivImageScale) obj));
                return zy11.a;
            }
        }));
        final Expression expression = xrkVar.n;
        final Expression expression2 = xrkVar.o;
        divGifImageView.setGravity(uml.b((DivAlignmentHorizontal) expression.a(rvoVar), (DivAlignmentVertical) expression2.a(rvoVar)));
        tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$observeContentAlignment$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                h hVar = h.this;
                DivGifImageView divGifImageView2 = divGifImageView;
                rvo rvoVar2 = rvoVar;
                Expression expression3 = expression;
                Expression expression4 = expression2;
                hVar.getClass();
                divGifImageView2.setGravity(uml.b((DivAlignmentHorizontal) expression3.a(rvoVar2), (DivAlignmentVertical) expression4.a(rvoVar2)));
                return zy11.a;
            }
        };
        divGifImageView.addSubscription(expression.c(rvoVar, tlsVar));
        divGifImageView.addSubscription(expression2.c(rvoVar, tlsVar));
        divGifImageView.addSubscription(xrkVar.u.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$bind$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                h.this.Hg(divGifImageView, div2View, rvoVar, xrkVar, a);
                return zy11.a;
            }
        }));
    }

    public final void Hg(final DivGifImageView divGifImageView, final Div2View div2View, rvo rvoVar, xrk xrkVar, l6o l6oVar) {
        Uri uri = (Uri) xrkVar.u.a(rvoVar);
        if (jl40.l(uri, divGifImageView.getGifUrl())) {
            return;
        }
        divGifImageView.resetImageLoaded();
        hxy loadReference = divGifImageView.getLoadReference();
        if (loadReference != null) {
            loadReference.cancel();
        }
        Expression expression = xrkVar.H;
        String str = expression != null ? (String) expression.a(rvoVar) : null;
        this.w.a(divGifImageView, l6oVar, str, ((Number) xrkVar.D.a(rvoVar)).intValue(), false, new tls() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$applyPlaceholders$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                final Drawable drawable = (Drawable) obj;
                if (!divGifImageView.isImageLoaded() && !divGifImageView.isImagePreview()) {
                    final DivGifImageView divGifImageView2 = divGifImageView;
                    Div2View div2View2 = div2View;
                    ngd0 ngd0Var = ngd0.G;
                    ngd0Var.p();
                    fu11 fu11Var = fu11.a;
                    if (!fu11Var.a()) {
                        com.yandex.div.core.util.binding.a g = unr0.g(div2View2, ngd0Var);
                        if (!fu11Var.a()) {
                            g.c(new sls() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$Companion$setPlaceholder$$inlined$runMainThreadAction$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    DivGifImageView.this.setPlaceholder(drawable);
                                    return zy11.a;
                                }
                            });
                        }
                    }
                    divGifImageView2.setPlaceholder(drawable);
                }
                return zy11.a;
            }
        }, new tls() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$applyPlaceholders$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zdv zdvVar = (zdv) obj;
                ngd0 ngd0Var = ngd0.G;
                if (!divGifImageView.isImageLoaded()) {
                    if (zdvVar instanceof wdv) {
                        DivGifImageView divGifImageView2 = divGifImageView;
                        Div2View div2View2 = div2View;
                        Bitmap bitmap = ((wdv) zdvVar).a;
                        ngd0Var.p();
                        fu11 fu11Var = fu11.a;
                        if (!fu11Var.a()) {
                            com.yandex.div.core.util.binding.a g = unr0.g(div2View2, ngd0Var);
                            if (!fu11Var.a()) {
                                g.c(new DivGifImageBinder$Companion$setPreview$$inlined$runMainThreadAction$2(divGifImageView2, bitmap));
                                divGifImageView2.previewLoaded();
                            }
                        }
                        divGifImageView2.setPreview(bitmap);
                        divGifImageView2.previewLoaded();
                    } else if (zdvVar instanceof ydv) {
                        DivGifImageView divGifImageView3 = divGifImageView;
                        Div2View div2View3 = div2View;
                        PictureDrawable b = ((ydv) zdvVar).b();
                        ngd0Var.p();
                        fu11 fu11Var2 = fu11.a;
                        if (!fu11Var2.a()) {
                            com.yandex.div.core.util.binding.a g2 = unr0.g(div2View3, ngd0Var);
                            if (!fu11Var2.a()) {
                                g2.c(new DivGifImageBinder$Companion$setPreview$$inlined$runMainThreadAction$1(divGifImageView3, b));
                                divGifImageView3.previewLoaded();
                            }
                        }
                        divGifImageView3.setPreview(b);
                        divGifImageView3.previewLoaded();
                    }
                }
                return zy11.a;
            }
        });
        Expression expression2 = xrkVar.I;
        Uri uri2 = expression2 != null ? (Uri) expression2.a(rvoVar) : null;
        gtk gtkVar = this.c;
        if (str == null && uri2 != null && !divGifImageView.isImageLoaded() && (!divGifImageView.isImagePreview() || !jl40.l(divGifImageView.getPreviewUrl(), uri2))) {
            divGifImageView.setPreviewUrl$div_release(uri2);
            String uri3 = uri2.toString();
            hxy loadPreviewReference = divGifImageView.getLoadPreviewReference();
            if (loadPreviewReference != null) {
                loadPreviewReference.cancel();
            }
            hxy loadImage = gtkVar.loadImage(uri3, new tfk(div2View, divGifImageView));
            div2View.addLoadReference(loadImage, divGifImageView);
            divGifImageView.setLoadPreviewReference$div_release(loadImage);
        }
        divGifImageView.setGifUrl$div_release(uri);
        hxy loadAnimatedImage = gtkVar.loadAnimatedImage(uri.toString(), new yrk(div2View, this, divGifImageView));
        div2View.addLoadReference(loadAnimatedImage, divGifImageView);
        divGifImageView.setLoadReference$div_release(loadAnimatedImage);
    }
}
