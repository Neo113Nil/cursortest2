package com.yandex.div.core.view2.divs;

import android.view.View;
import com.yandex.div.core.player.DivPlayerView;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivVideoScale;
import defpackage.aol;
import defpackage.aw5;
import defpackage.egk;
import defpackage.f1k;
import defpackage.fu11;
import defpackage.hl11;
import defpackage.hol;
import defpackage.iol;
import defpackage.jj91;
import defpackage.ngd0;
import defpackage.r4l;
import defpackage.r8;
import defpackage.rol;
import defpackage.rvo;
import defpackage.sls;
import defpackage.tls;
import defpackage.u4l;
import defpackage.unr0;
import defpackage.v4l;
import defpackage.wjd;
import defpackage.ynl;
import defpackage.zch;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class x extends r8 {
    public final hl11 c;
    public final com.yandex.div.core.c w;
    public final rol x;
    public final ExecutorService y;
    public final u4l z;

    public x(e eVar, hl11 hl11Var, com.yandex.div.core.c cVar, rol rolVar, ExecutorService executorService, u4l u4lVar) {
        super(4, eVar);
        this.c = hl11Var;
        this.w = cVar;
        this.x = rolVar;
        this.y = executorService;
        this.z = u4lVar;
    }

    public static final void Hg(x xVar, ynl ynlVar, rvo rvoVar, tls tlsVar) {
        xVar.getClass();
        Expression expression = ynlVar.C;
        String str = expression != null ? (String) expression.a(rvoVar) : null;
        if (str == null) {
            ((DivVideoBinder$applyVideo$1$1) tlsVar).invoke(null);
        } else {
            xVar.y.submit(new com.yandex.div.core.a(str, false, tlsVar));
        }
    }

    public static final v4l Ig(x xVar, ynl ynlVar, rvo rvoVar) {
        xVar.getClass();
        boolean booleanValue = ((Boolean) ynlVar.g.a(rvoVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) ynlVar.w.a(rvoVar)).booleanValue();
        boolean booleanValue3 = ((Boolean) ynlVar.D.a(rvoVar)).booleanValue();
        Expression expression = ynlVar.A;
        return new v4l(booleanValue, booleanValue2, booleanValue3, expression != null ? (JSONObject) expression.a(rvoVar) : null, (float) ((Number) ynlVar.z.a(rvoVar)).doubleValue());
    }

    public static final void Jg(x xVar, Div2View div2View, ynl ynlVar) {
        xVar.getClass();
        div2View.logError(new Throwable("Neither 'video_source' nor 'player_settings_payload' are specified for video with id '" + ynlVar.getId() + '\''));
    }

    public static final void Kg(x xVar, DivVideoView divVideoView, ynl ynlVar, aw5 aw5Var, r4l r4lVar) {
        xVar.getClass();
        String str = ynlVar.m;
        if (str == null) {
            return;
        }
        divVideoView.addVideoSubscription(xVar.c.a(aw5Var, str, new zch(r4lVar)));
    }

    public static final void Lg(x xVar, DivVideoView divVideoView, ynl ynlVar, rvo rvoVar, final r4l r4lVar) {
        xVar.getClass();
        divVideoView.addVideoSubscription(ynlVar.w.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$observeMuted$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                r4l.this.setMuted(((Boolean) obj).booleanValue());
                return zy11.a;
            }
        }));
    }

    public static final void Mg(x xVar, DivVideoView divVideoView, ynl ynlVar, rvo rvoVar, final r4l r4lVar) {
        xVar.getClass();
        divVideoView.addVideoSubscription(ynlVar.z.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$observePlaybackSpeed$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ((Number) obj).doubleValue();
                r4l.this.getClass();
                return zy11.a;
            }
        }));
    }

    public static final void Ng(x xVar, DivVideoView divVideoView, ynl ynlVar, rvo rvoVar, final DivPlayerView divPlayerView, final PreviewImageView previewImageView) {
        xVar.getClass();
        divVideoView.addVideoSubscription(ynlVar.H.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$observeScale$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                DivVideoScale divVideoScale = (DivVideoScale) obj;
                DivPlayerView.this.setScale(divVideoScale);
                previewImageView.setScale(divVideoScale);
                return zy11.a;
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.yandex.div.core.view2.divs.widgets.DivVideoView] */
    /* JADX WARN: Type inference failed for: r9v1, types: [z0k] */
    /* JADX WARN: Type inference failed for: r9v2, types: [f1k] */
    /* JADX WARN: Type inference failed for: r9v4, types: [wjd] */
    /* JADX WARN: Type inference failed for: r9v5, types: [wjd] */
    public static final void Og(final x xVar, DivVideoView divVideoView, final ynl ynlVar, final rvo rvoVar, final r4l r4lVar, final Div2View div2View) {
        xVar.getClass();
        final tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$observeSource$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                List list = (List) obj;
                if (list.isEmpty()) {
                    ynl ynlVar2 = ynl.this;
                    if (ynlVar2.A == null) {
                        x.Jg(xVar, div2View, ynlVar2);
                    }
                }
                r4lVar.c(list, x.Ig(xVar, ynl.this, rvoVar));
                return zy11.a;
            }
        };
        tls tlsVar2 = new tls() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$observeSource$itemCallback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                tls.this.invoke(jj91.a(ynlVar, rvoVar));
                return zy11.a;
            }
        };
        List list = ynlVar.S;
        ?? r9 = f1k.O1;
        if (list != null && !list.isEmpty()) {
            if (list.size() == 1) {
                r9 = Qg((iol) kotlin.collections.a.P(list), rvoVar, tlsVar2);
            } else {
                r9 = new wjd();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    r9.a(Qg((iol) it.next(), rvoVar, tlsVar2));
                }
            }
        }
        divVideoView.addVideoSubscription(r9);
        Expression expression = ynlVar.A;
        if (expression != null) {
            divVideoView.addVideoSubscription(expression.c(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$observeSource$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    r4l.this.c(jj91.a(ynlVar, rvoVar), x.Ig(xVar, ynlVar, rvoVar));
                    return zy11.a;
                }
            }));
        }
    }

    public static wjd Qg(iol iolVar, rvo rvoVar, tls tlsVar) {
        wjd wjdVar = new wjd();
        Expression expression = iolVar.a;
        if (expression != null) {
            wjdVar.a(expression.c(rvoVar, tlsVar));
        }
        wjdVar.a(iolVar.b.c(rvoVar, tlsVar));
        hol holVar = iolVar.c;
        if (holVar != null) {
            wjdVar.a(holVar.a.c(rvoVar, tlsVar));
            wjdVar.a(holVar.b.c(rvoVar, tlsVar));
        }
        wjdVar.a(iolVar.d.c(rvoVar, tlsVar));
        return wjdVar;
    }

    public final void Pg(final DivVideoView divVideoView, final aw5 aw5Var, final ynl ynlVar, final com.yandex.div.core.state.b bVar) {
        PreviewImageView previewImageView;
        DivPlayerView divPlayerView;
        PreviewImageView previewImageView2;
        DivPlayerView divPlayerView2;
        Expression expression = ynlVar.A;
        Div2View div2View = aw5Var.a;
        Div2View div2View2 = aw5Var.a;
        ngd0 ngd0Var = ngd0.G;
        ngd0Var.p();
        fu11 fu11Var = fu11.a;
        boolean a = fu11Var.a();
        rol rolVar = this.x;
        int i = 0;
        u4l u4lVar = this.z;
        if (a) {
            rvo rvoVar = aw5Var.b;
            List a2 = jj91.a(ynlVar, rvoVar);
            v4l Ig = Ig(this, ynlVar, rvoVar);
            if (a2.isEmpty() && expression == null) {
                Jg(this, div2View, ynlVar);
            }
            DivPlayerView playerView = divVideoView.getPlayerView();
            int childCount = divVideoView.getChildCount();
            while (true) {
                if (i >= childCount) {
                    previewImageView2 = null;
                    break;
                }
                View childAt = divVideoView.getChildAt(i);
                if (childAt instanceof PreviewImageView) {
                    previewImageView2 = (PreviewImageView) childAt;
                    break;
                }
                i++;
            }
            if (playerView == null) {
                DivPlayerView a3 = u4lVar.a(divVideoView.getContext());
                a3.setVisibility(4);
                divPlayerView2 = a3;
            } else {
                divPlayerView2 = playerView;
            }
            PreviewImageView previewImageView3 = previewImageView2 == null ? new PreviewImageView(divVideoView.getContext()) : previewImageView2;
            Hg(this, ynlVar, rvoVar, new DivVideoBinder$applyVideo$1$1(divPlayerView2, previewImageView3, aw5Var));
            r4l b = u4lVar.b(a2, Ig);
            PreviewImageView previewImageView4 = previewImageView3;
            b.a(new aol(this, div2View2, aw5Var.b, ynlVar, previewImageView4));
            divPlayerView2.attach(b);
            Kg(this, divVideoView, ynlVar, aw5Var, b);
            Lg(this, divVideoView, ynlVar, rvoVar, b);
            Mg(this, divVideoView, ynlVar, rvoVar, b);
            DivPlayerView divPlayerView3 = divPlayerView2;
            Ng(this, divVideoView, ynlVar, rvoVar, divPlayerView3, previewImageView4);
            Og(this, divVideoView, ynlVar, rvoVar, b, div2View2);
            if (previewImageView2 == null && playerView == null) {
                divVideoView.removeAllViews();
                divVideoView.addView(divPlayerView3);
                divVideoView.addView(previewImageView4);
            }
            rolVar.a.put(divVideoView, ynlVar);
            return;
        }
        com.yandex.div.core.util.binding.a g = unr0.g(div2View, ngd0Var);
        if (!fu11Var.a()) {
            g.c(new sls() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$applyVideo$$inlined$runMainThreadAction$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    PreviewImageView previewImageView5;
                    DivPlayerView divPlayerView4;
                    rvo rvoVar2 = aw5.this.b;
                    List a4 = jj91.a(ynlVar, rvoVar2);
                    v4l Ig2 = x.Ig(this, ynlVar, rvoVar2);
                    if (a4.isEmpty()) {
                        ynl ynlVar2 = ynlVar;
                        if (ynlVar2.A == null) {
                            x.Jg(this, aw5.this.a, ynlVar2);
                        }
                    }
                    DivPlayerView playerView2 = divVideoView.getPlayerView();
                    int childCount2 = divVideoView.getChildCount();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= childCount2) {
                            previewImageView5 = null;
                            break;
                        }
                        View childAt2 = divVideoView.getChildAt(i2);
                        if (childAt2 instanceof PreviewImageView) {
                            previewImageView5 = (PreviewImageView) childAt2;
                            break;
                        }
                        i2++;
                    }
                    PreviewImageView previewImageView6 = previewImageView5;
                    if (playerView2 == null) {
                        DivPlayerView a5 = this.z.a(divVideoView.getContext());
                        a5.setVisibility(4);
                        divPlayerView4 = a5;
                    } else {
                        divPlayerView4 = playerView2;
                    }
                    PreviewImageView previewImageView7 = previewImageView6 == null ? new PreviewImageView(divVideoView.getContext()) : previewImageView6;
                    x.Hg(this, ynlVar, rvoVar2, new DivVideoBinder$applyVideo$1$1(divPlayerView4, previewImageView7, aw5.this));
                    r4l b2 = this.z.b(a4, Ig2);
                    x xVar = this;
                    aw5 aw5Var2 = aw5.this;
                    ynl ynlVar3 = ynlVar;
                    xVar.getClass();
                    PreviewImageView previewImageView8 = previewImageView7;
                    b2.a(new aol(xVar, aw5Var2.a, aw5Var2.b, ynlVar3, previewImageView8));
                    divPlayerView4.attach(b2);
                    x.Kg(this, divVideoView, ynlVar, aw5.this, b2);
                    x.Lg(this, divVideoView, ynlVar, rvoVar2, b2);
                    x.Mg(this, divVideoView, ynlVar, rvoVar2, b2);
                    x.Ng(this, divVideoView, ynlVar, rvoVar2, divPlayerView4, previewImageView7);
                    DivPlayerView divPlayerView5 = divPlayerView4;
                    x.Og(this, divVideoView, ynlVar, rvoVar2, b2, aw5.this.a);
                    if (previewImageView6 == null && playerView2 == null) {
                        divVideoView.removeAllViews();
                        divVideoView.addView(divPlayerView5);
                        divVideoView.addView(previewImageView8);
                    }
                    this.x.a.put(divVideoView, ynlVar);
                    return zy11.a;
                }
            });
            return;
        }
        rvo rvoVar2 = aw5Var.b;
        List a4 = jj91.a(ynlVar, rvoVar2);
        v4l Ig2 = Ig(this, ynlVar, rvoVar2);
        if (a4.isEmpty() && expression == null) {
            Jg(this, div2View, ynlVar);
        }
        DivPlayerView playerView2 = divVideoView.getPlayerView();
        int childCount2 = divVideoView.getChildCount();
        while (true) {
            if (i >= childCount2) {
                previewImageView = null;
                break;
            }
            View childAt2 = divVideoView.getChildAt(i);
            if (childAt2 instanceof PreviewImageView) {
                previewImageView = (PreviewImageView) childAt2;
                break;
            }
            i++;
        }
        if (playerView2 == null) {
            DivPlayerView a5 = u4lVar.a(divVideoView.getContext());
            a5.setVisibility(4);
            divPlayerView = a5;
        } else {
            divPlayerView = playerView2;
        }
        PreviewImageView previewImageView5 = previewImageView == null ? new PreviewImageView(divVideoView.getContext()) : previewImageView;
        Hg(this, ynlVar, rvoVar2, new DivVideoBinder$applyVideo$1$1(divPlayerView, previewImageView5, aw5Var));
        r4l b2 = u4lVar.b(a4, Ig2);
        PreviewImageView previewImageView6 = previewImageView5;
        b2.a(new aol(this, div2View2, aw5Var.b, ynlVar, previewImageView6));
        divPlayerView.attach(b2);
        Kg(this, divVideoView, ynlVar, aw5Var, b2);
        Lg(this, divVideoView, ynlVar, rvoVar2, b2);
        Mg(this, divVideoView, ynlVar, rvoVar2, b2);
        DivPlayerView divPlayerView4 = divPlayerView;
        Ng(this, divVideoView, ynlVar, rvoVar2, divPlayerView4, previewImageView6);
        Og(this, divVideoView, ynlVar, rvoVar2, b2, div2View2);
        if (previewImageView == null && playerView2 == null) {
            divVideoView.removeAllViews();
            divVideoView.addView(divPlayerView4);
            divVideoView.addView(previewImageView6);
        }
        rolVar.a.put(divVideoView, ynlVar);
    }

    @Override // defpackage.r8
    public final void ae(View view, aw5 aw5Var, egk egkVar, egk egkVar2, com.yandex.div.core.state.b bVar) {
        DivVideoView divVideoView = (DivVideoView) view;
        ynl ynlVar = (ynl) egkVar;
        ynl ynlVar2 = (ynl) egkVar2;
        divVideoView.setPath(bVar);
        Pg(divVideoView, aw5Var, ynlVar, bVar);
        a.i(divVideoView, ynlVar.f, ynlVar2 != null ? ynlVar2.f : null, aw5Var.b);
    }
}
