package defpackage;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.lifecycle.p;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.go.flex.common.extensions.shortcut_shimmer.ShortcutShimmeringDrawable;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.eja1;
import defpackage.l8x;
import defpackage.pey;
import defpackage.tje;
import defpackage.vng;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d1s0 implements dpk {
    public final tpr a;

    public d1s0(pwy0 pwy0Var) {
        this.a = pwy0Var.a();
    }

    public static f1s0 a(a1s0 a1s0Var, rvo rvoVar) {
        e1s0 e1s0Var;
        boolean booleanValue = ((Boolean) a1s0Var.a.a(rvoVar)).booleanValue();
        List a = a1s0Var.d.a(rvoVar);
        double doubleValue = ((Number) a1s0Var.b.a(rvoVar)).doubleValue();
        double doubleValue2 = ((Number) a1s0Var.c.a(rvoVar)).doubleValue();
        jkk jkkVar = a1s0Var.f;
        if (jkkVar != null) {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Expression expression = jkkVar.c;
            float q = a.q(expression != null ? (Long) expression.a(rvoVar) : null, displayMetrics);
            Expression expression2 = jkkVar.d;
            float q2 = a.q(expression2 != null ? (Long) expression2.a(rvoVar) : null, displayMetrics);
            Expression expression3 = jkkVar.a;
            float q3 = a.q(expression3 != null ? (Long) expression3.a(rvoVar) : null, displayMetrics);
            Expression expression4 = jkkVar.b;
            e1s0Var = new e1s0(q, q2, q3, a.q(expression4 != null ? (Long) expression4.a(rvoVar) : null, displayMetrics));
        } else {
            e1s0Var = null;
        }
        return new f1s0(booleanValue, kotlin.collections.a.I0(a), doubleValue, 1000 * m810.c(doubleValue2), e1s0Var);
    }

    public static final void b(d1s0 d1s0Var, a1s0 a1s0Var, rvo rvoVar, ShortcutShimmeringDrawable shortcutShimmeringDrawable, View view) {
        d1s0Var.getClass();
        f1s0 a = a(a1s0Var, rvoVar);
        shortcutShimmeringDrawable.setConfig(a, view.getContext());
        if (!a.a) {
            shortcutShimmeringDrawable = null;
        }
        view.setForeground(shortcutShimmeringDrawable);
        view.setTag(mih0.div_shimmer_drawable, shortcutShimmeringDrawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    @Override // defpackage.dpk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(Div2View div2View, final rvo rvoVar, final View view, egk egkVar) {
        JSONObject jSONObject;
        final a1s0 a1s0Var;
        Object obj;
        List extensions = egkVar.getExtensions();
        jkk jkkVar = null;
        if (extensions != null) {
            Iterator it = extensions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (jl40.l(((bpk) obj).a, "shortcut_shimmer")) {
                        break;
                    }
                }
            }
            bpk bpkVar = (bpk) obj;
            if (bpkVar != null) {
                jSONObject = bpkVar.b;
                kvo kvoVar = a1s0.g;
                int i = 0;
                if (jSONObject != null) {
                    a1s0Var = new a1s0(i);
                } else {
                    u2l u2lVar = new u2l(eg90.a);
                    Expression a = pdx.a(jSONObject, BackendConfig.Restrictions.ENABLED, b.f, new kbs(19), wm11.a);
                    if (a == null) {
                        a = a1s0.g;
                    }
                    Expression expression = a;
                    tls tlsVar = b.g;
                    kbs kbsVar = new kbs(19);
                    sms smsVar = wm11.d;
                    Expression a2 = pdx.a(jSONObject, "angle", tlsVar, kbsVar, smsVar);
                    if (a2 == null) {
                        a2 = a1s0.h;
                    }
                    Expression expression2 = a2;
                    Expression a3 = pdx.a(jSONObject, "duration", tlsVar, new yci0(), smsVar);
                    if (a3 == null) {
                        a3 = a1s0.i;
                    }
                    Expression expression3 = a3;
                    pvo b = pdx.b(jSONObject, "colors", b.b, new yci0(), new kbs(19), u2lVar, wm11.f);
                    if (b == null) {
                        b = a1s0.j;
                    }
                    pvo pvoVar = b;
                    Expression a4 = pdx.a(jSONObject, "width", b.h, new kbs(19), wm11.b);
                    if (a4 == null) {
                        a4 = a1s0.k;
                    }
                    Expression expression4 = a4;
                    JSONObject optJSONObject = jSONObject.optJSONObject("corner_radius");
                    if (optJSONObject != null) {
                        ((kkk) ft6.b.B2.getValue()).getClass();
                        jkkVar = kkk.c(u2lVar, optJSONObject);
                    }
                    a1s0Var = new a1s0(expression, expression2, expression3, pvoVar, expression4, jkkVar);
                }
                final ShortcutShimmeringDrawable shortcutShimmeringDrawable = new ShortcutShimmeringDrawable(view.getContext(), a(a1s0Var, rvoVar));
                b(this, a1s0Var, rvoVar, shortcutShimmeringDrawable, view);
                final int i2 = 0;
                tje.F(view).a(a1s0Var.a.c(rvoVar, new tls(this) { // from class: c1s0
                    public final /* synthetic */ d1s0 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        int i3 = i2;
                        zy11 zy11Var = zy11.a;
                        View view2 = view;
                        ShortcutShimmeringDrawable shortcutShimmeringDrawable2 = shortcutShimmeringDrawable;
                        rvo rvoVar2 = rvoVar;
                        a1s0 a1s0Var2 = a1s0Var;
                        d1s0 d1s0Var = this.b;
                        switch (i3) {
                            case 0:
                                ((Boolean) obj2).getClass();
                                d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable2, view2);
                                break;
                            case 1:
                                d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable2, view2);
                                break;
                            case 2:
                                ((Double) obj2).getClass();
                                d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable2, view2);
                                break;
                            default:
                                ((Double) obj2).getClass();
                                d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable2, view2);
                                break;
                        }
                        return zy11Var;
                    }
                }));
                final int i3 = 1;
                tje.F(view).a(a1s0Var.d.b(rvoVar, new tls(this) { // from class: c1s0
                    public final /* synthetic */ d1s0 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        int i32 = i3;
                        zy11 zy11Var = zy11.a;
                        View view2 = view;
                        ShortcutShimmeringDrawable shortcutShimmeringDrawable2 = shortcutShimmeringDrawable;
                        rvo rvoVar2 = rvoVar;
                        a1s0 a1s0Var2 = a1s0Var;
                        d1s0 d1s0Var = this.b;
                        switch (i32) {
                            case 0:
                                ((Boolean) obj2).getClass();
                                d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable2, view2);
                                break;
                            case 1:
                                d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable2, view2);
                                break;
                            case 2:
                                ((Double) obj2).getClass();
                                d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable2, view2);
                                break;
                            default:
                                ((Double) obj2).getClass();
                                d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable2, view2);
                                break;
                        }
                        return zy11Var;
                    }
                }));
                final int i4 = 2;
                tje.F(view).a(a1s0Var.b.c(rvoVar, new tls(this) { // from class: c1s0
                    public final /* synthetic */ d1s0 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        int i32 = i4;
                        zy11 zy11Var = zy11.a;
                        View view2 = view;
                        ShortcutShimmeringDrawable shortcutShimmeringDrawable2 = shortcutShimmeringDrawable;
                        rvo rvoVar2 = rvoVar;
                        a1s0 a1s0Var2 = a1s0Var;
                        d1s0 d1s0Var = this.b;
                        switch (i32) {
                            case 0:
                                ((Boolean) obj2).getClass();
                                d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable2, view2);
                                break;
                            case 1:
                                d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable2, view2);
                                break;
                            case 2:
                                ((Double) obj2).getClass();
                                d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable2, view2);
                                break;
                            default:
                                ((Double) obj2).getClass();
                                d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable2, view2);
                                break;
                        }
                        return zy11Var;
                    }
                }));
                final int i5 = 3;
                tje.F(view).a(a1s0Var.c.c(rvoVar, new tls(this) { // from class: c1s0
                    public final /* synthetic */ d1s0 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        int i32 = i5;
                        zy11 zy11Var = zy11.a;
                        View view2 = view;
                        ShortcutShimmeringDrawable shortcutShimmeringDrawable2 = shortcutShimmeringDrawable;
                        rvo rvoVar2 = rvoVar;
                        a1s0 a1s0Var2 = a1s0Var;
                        d1s0 d1s0Var = this.b;
                        switch (i32) {
                            case 0:
                                ((Boolean) obj2).getClass();
                                d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable2, view2);
                                break;
                            case 1:
                                d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable2, view2);
                                break;
                            case 2:
                                ((Double) obj2).getClass();
                                d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable2, view2);
                                break;
                            default:
                                ((Double) obj2).getClass();
                                d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable2, view2);
                                break;
                        }
                        return zy11Var;
                    }
                }));
                tje.F(view).a(a1s0Var.e.c(rvoVar, new kn2(29, shortcutShimmeringDrawable, view)));
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.flex.common.extensions.shortcut_shimmer.ShortcutShimmerExtensionHandler$observeTheme$$inlined$addLifecycleListener$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View v) {
                        pey o = vng.o(v);
                        p s = o != null ? eja1.s(o) : null;
                        Ref$ObjectRef.this.element = s != null ? tje.N(s, null, null, new ShortcutShimmerExtensionHandler$observeTheme$listener$1$1(this, shortcutShimmeringDrawable, view, null), 3) : 0;
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View v) {
                        l8x l8xVar = (l8x) ref$ObjectRef.element;
                        if (l8xVar != null) {
                            l8xVar.a(null);
                        }
                    }
                };
                view.addOnAttachStateChangeListener(onAttachStateChangeListener);
                tje.F(view).a(new svo(1, ref$ObjectRef, view, onAttachStateChangeListener));
                lp2 lp2Var = new lp2(4, shortcutShimmeringDrawable);
                view.addOnLayoutChangeListener(lp2Var);
                tje.F(view).a(new b1s0(lp2Var, i, view));
            }
        }
        jSONObject = null;
        kvo kvoVar2 = a1s0.g;
        int i6 = 0;
        if (jSONObject != null) {
        }
        final ShortcutShimmeringDrawable shortcutShimmeringDrawable2 = new ShortcutShimmeringDrawable(view.getContext(), a(a1s0Var, rvoVar));
        b(this, a1s0Var, rvoVar, shortcutShimmeringDrawable2, view);
        final int i22 = 0;
        tje.F(view).a(a1s0Var.a.c(rvoVar, new tls(this) { // from class: c1s0
            public final /* synthetic */ d1s0 b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                int i32 = i22;
                zy11 zy11Var = zy11.a;
                View view2 = view;
                ShortcutShimmeringDrawable shortcutShimmeringDrawable22 = shortcutShimmeringDrawable2;
                rvo rvoVar2 = rvoVar;
                a1s0 a1s0Var2 = a1s0Var;
                d1s0 d1s0Var = this.b;
                switch (i32) {
                    case 0:
                        ((Boolean) obj2).getClass();
                        d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable22, view2);
                        break;
                    case 1:
                        d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable22, view2);
                        break;
                    case 2:
                        ((Double) obj2).getClass();
                        d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable22, view2);
                        break;
                    default:
                        ((Double) obj2).getClass();
                        d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable22, view2);
                        break;
                }
                return zy11Var;
            }
        }));
        final int i32 = 1;
        tje.F(view).a(a1s0Var.d.b(rvoVar, new tls(this) { // from class: c1s0
            public final /* synthetic */ d1s0 b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                int i322 = i32;
                zy11 zy11Var = zy11.a;
                View view2 = view;
                ShortcutShimmeringDrawable shortcutShimmeringDrawable22 = shortcutShimmeringDrawable2;
                rvo rvoVar2 = rvoVar;
                a1s0 a1s0Var2 = a1s0Var;
                d1s0 d1s0Var = this.b;
                switch (i322) {
                    case 0:
                        ((Boolean) obj2).getClass();
                        d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable22, view2);
                        break;
                    case 1:
                        d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable22, view2);
                        break;
                    case 2:
                        ((Double) obj2).getClass();
                        d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable22, view2);
                        break;
                    default:
                        ((Double) obj2).getClass();
                        d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable22, view2);
                        break;
                }
                return zy11Var;
            }
        }));
        final int i42 = 2;
        tje.F(view).a(a1s0Var.b.c(rvoVar, new tls(this) { // from class: c1s0
            public final /* synthetic */ d1s0 b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                int i322 = i42;
                zy11 zy11Var = zy11.a;
                View view2 = view;
                ShortcutShimmeringDrawable shortcutShimmeringDrawable22 = shortcutShimmeringDrawable2;
                rvo rvoVar2 = rvoVar;
                a1s0 a1s0Var2 = a1s0Var;
                d1s0 d1s0Var = this.b;
                switch (i322) {
                    case 0:
                        ((Boolean) obj2).getClass();
                        d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable22, view2);
                        break;
                    case 1:
                        d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable22, view2);
                        break;
                    case 2:
                        ((Double) obj2).getClass();
                        d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable22, view2);
                        break;
                    default:
                        ((Double) obj2).getClass();
                        d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable22, view2);
                        break;
                }
                return zy11Var;
            }
        }));
        final int i52 = 3;
        tje.F(view).a(a1s0Var.c.c(rvoVar, new tls(this) { // from class: c1s0
            public final /* synthetic */ d1s0 b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                int i322 = i52;
                zy11 zy11Var = zy11.a;
                View view2 = view;
                ShortcutShimmeringDrawable shortcutShimmeringDrawable22 = shortcutShimmeringDrawable2;
                rvo rvoVar2 = rvoVar;
                a1s0 a1s0Var2 = a1s0Var;
                d1s0 d1s0Var = this.b;
                switch (i322) {
                    case 0:
                        ((Boolean) obj2).getClass();
                        d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable22, view2);
                        break;
                    case 1:
                        d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable22, view2);
                        break;
                    case 2:
                        ((Double) obj2).getClass();
                        d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable22, view2);
                        break;
                    default:
                        ((Double) obj2).getClass();
                        d1s0.b(d1s0Var, a1s0Var2, rvoVar2, shortcutShimmeringDrawable22, view2);
                        break;
                }
                return zy11Var;
            }
        }));
        tje.F(view).a(a1s0Var.e.c(rvoVar, new kn2(29, shortcutShimmeringDrawable2, view)));
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        View.OnAttachStateChangeListener onAttachStateChangeListener2 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.flex.common.extensions.shortcut_shimmer.ShortcutShimmerExtensionHandler$observeTheme$$inlined$addLifecycleListener$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                pey o = vng.o(v);
                p s = o != null ? eja1.s(o) : null;
                Ref$ObjectRef.this.element = s != null ? tje.N(s, null, null, new ShortcutShimmerExtensionHandler$observeTheme$listener$1$1(this, shortcutShimmeringDrawable2, view, null), 3) : 0;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                l8x l8xVar = (l8x) ref$ObjectRef2.element;
                if (l8xVar != null) {
                    l8xVar.a(null);
                }
            }
        };
        view.addOnAttachStateChangeListener(onAttachStateChangeListener2);
        tje.F(view).a(new svo(1, ref$ObjectRef2, view, onAttachStateChangeListener2));
        lp2 lp2Var2 = new lp2(4, shortcutShimmeringDrawable2);
        view.addOnLayoutChangeListener(lp2Var2);
        tje.F(view).a(new b1s0(lp2Var2, i6, view));
    }

    @Override // defpackage.dpk
    public final boolean matches(egk egkVar) {
        List extensions = egkVar.getExtensions();
        if (extensions == null) {
            return false;
        }
        List list = extensions;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (jl40.l(((bpk) it.next()).a, "shortcut_shimmer")) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        Object tag = view.getTag(mih0.div_shimmer_drawable);
        ShortcutShimmeringDrawable shortcutShimmeringDrawable = tag instanceof ShortcutShimmeringDrawable ? (ShortcutShimmeringDrawable) tag : null;
        if (shortcutShimmeringDrawable != null) {
            shortcutShimmeringDrawable.stop();
        }
        view.setForeground(null);
        view.setTag(mih0.div_shimmer_drawable, null);
        tje.m(view);
    }
}
