package com.yandex.div.core.view2.debugview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.div.core.view2.Div2View;
import defpackage.an8;
import defpackage.axg;
import defpackage.bxg;
import defpackage.cxg;
import defpackage.dxg;
import defpackage.f1k;
import defpackage.fn6;
import defpackage.fu11;
import defpackage.gol0;
import defpackage.jl40;
import defpackage.lml;
import defpackage.ngd0;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tls;
import defpackage.unr0;
import defpackage.xwg;
import defpackage.ykl0;
import defpackage.zwg;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a implements f1k {
    public PopupWindow A;
    public final dxg B;
    public final ViewGroup a;
    public final Div2View b;
    public final b c;
    public final lml w;
    public final gol0 x;
    public an8 y;
    public fn6 z;

    public a(ViewGroup viewGroup, Div2View div2View, b bVar, lml lmlVar) {
        this.a = viewGroup;
        this.b = div2View;
        this.c = bVar;
        this.w = lmlVar;
        this.x = new gol0(viewGroup);
        tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.debugview.DebugView$modelObservation$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                final cxg cxgVar = (cxg) obj;
                final a aVar = a.this;
                Div2View div2View2 = aVar.b;
                ngd0 ngd0Var = ngd0.G;
                ngd0Var.p();
                fu11 fu11Var = fu11.a;
                if (!fu11Var.a()) {
                    com.yandex.div.core.util.binding.a g = unr0.g(div2View2, ngd0Var);
                    if (!fu11Var.a()) {
                        g.c(new sls() { // from class: com.yandex.div.core.view2.debugview.DebugView$special$$inlined$runMainThreadAction$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.sls
                            public final Object invoke() {
                                a.a(a.this, cxgVar);
                                return zy11.a;
                            }
                        });
                        return zy11.a;
                    }
                }
                a.a(aVar, cxgVar);
                return zy11.a;
            }
        };
        bVar.h.add(tlsVar);
        tlsVar.invoke(bVar.e(bVar.n));
        this.B = new dxg(0, bVar, tlsVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(a aVar, cxg cxgVar) {
        an8 an8Var;
        LinearLayout o;
        View view;
        LinearLayout o2;
        fn6 fn6Var;
        LinearLayout g;
        View view2;
        b bVar = aVar.c;
        ViewGroup viewGroup = aVar.a;
        LinearLayout linearLayout = null;
        boolean z = true;
        if (cxgVar instanceof zwg) {
            an8 an8Var2 = aVar.y;
            if (an8Var2 != null) {
                viewGroup.removeView(an8Var2.o());
            }
            aVar.y = null;
            fn6 fn6Var2 = aVar.z;
            if (fn6Var2 != null && (g = fn6Var2.g()) != null) {
                if (viewGroup.getChildCount() > 0) {
                    view2 = viewGroup.getChildAt(0);
                    if (view2 == null) {
                        ny61.s();
                        return;
                    }
                    int i = 1;
                    while (i < viewGroup.getChildCount()) {
                        int i2 = i + 1;
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt == null) {
                            ny61.s();
                            return;
                        } else {
                            i = i2;
                            view2 = childAt;
                        }
                    }
                } else {
                    view2 = null;
                }
                if (!jl40.l(view2, g)) {
                    viewGroup.removeView(g);
                    aVar.z = null;
                }
                fn6Var = aVar.z;
                if (fn6Var != null) {
                    zwg zwgVar = (zwg) cxgVar;
                    ykl0 runtimeStore = bVar.b.getRuntimeStore();
                    Map d = runtimeStore.d();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("", runtimeStore.b().a.d);
                    for (Map.Entry entry : d.entrySet()) {
                        linkedHashMap.put((String) entry.getKey(), ((com.yandex.div.core.expression.a) entry.getValue()).a.d);
                    }
                    fn6Var.c(zwgVar, linkedHashMap);
                }
            }
            Context context = viewGroup.getContext();
            bVar.getClass();
            fn6 fn6Var3 = new fn6(context, new DebugViewModelProvider$getErrorHandler$1(bVar.b), new DebugView$tryAddDetailsView$holder$1(aVar), new DebugView$tryAddDetailsView$holder$2(aVar));
            int p = com.yandex.div.core.view2.divs.a.p(150, viewGroup.getContext().getResources().getDisplayMetrics());
            if (viewGroup.getWidth() < p || viewGroup.getHeight() < p) {
                PopupWindow popupWindow = new PopupWindow((View) fn6Var3.g(), -1, -2, true);
                popupWindow.setOutsideTouchable(true);
                popupWindow.showAsDropDown(viewGroup, 0, -viewGroup.getHeight());
                popupWindow.setOnDismissListener(new xwg(r6, aVar));
                aVar.A = popupWindow;
            } else {
                viewGroup.addView(fn6Var3.g(), new ViewGroup.MarginLayoutParams(-1, -1));
            }
            aVar.z = fn6Var3;
            fn6Var = aVar.z;
            if (fn6Var != null) {
            }
        } else if (cxgVar instanceof bxg) {
            aVar.c();
            an8 an8Var3 = aVar.y;
            if (an8Var3 != null && (o = an8Var3.o()) != null) {
                if (viewGroup.getChildCount() > 0) {
                    view = viewGroup.getChildAt(0);
                    if (view == null) {
                        ny61.s();
                        return;
                    }
                    int i3 = 1;
                    while (i3 < viewGroup.getChildCount()) {
                        int i4 = i3 + 1;
                        View childAt2 = viewGroup.getChildAt(i3);
                        if (childAt2 == null) {
                            ny61.s();
                            return;
                        } else {
                            i3 = i4;
                            view = childAt2;
                        }
                    }
                } else {
                    view = null;
                }
                if (!jl40.l(view, o)) {
                    viewGroup.removeView(o);
                    aVar.y = null;
                }
                an8Var = aVar.y;
                if (an8Var != null) {
                    bxg bxgVar = (bxg) cxgVar;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) an8Var.w;
                    appCompatTextView.setText(bxgVar.a);
                    appCompatTextView.setBackgroundResource(bxgVar.c);
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) an8Var.x;
                    String str = bxgVar.b;
                    appCompatTextView2.setText(str != null ? str : "");
                    if (str != null && str.length() != 0) {
                        z = false;
                    }
                    appCompatTextView2.setVisibility(z ? 8 : 0);
                }
            }
            an8 an8Var4 = new an8(viewGroup.getContext(), aVar.w, new DebugView$tryAddCounterView$holder$1(aVar));
            viewGroup.addView(an8Var4.o(), new ViewGroup.MarginLayoutParams(-1, -1));
            aVar.y = an8Var4;
            an8Var = aVar.y;
            if (an8Var != null) {
            }
        } else if (jl40.l(cxgVar, axg.a)) {
            an8 an8Var5 = aVar.y;
            if (an8Var5 != null) {
                viewGroup.removeView(an8Var5.o());
            }
            aVar.y = null;
            aVar.c();
        }
        gol0 gol0Var = aVar.x;
        an8 an8Var6 = aVar.y;
        if (an8Var6 == null || (o2 = an8Var6.o()) == null) {
            fn6 fn6Var4 = aVar.z;
            if (fn6Var4 != null) {
                linearLayout = fn6Var4.g();
            }
        } else {
            linearLayout = o2;
        }
        gol0Var.b(linearLayout);
    }

    public final void c() {
        fn6 fn6Var = this.z;
        if (fn6Var != null) {
            PopupWindow popupWindow = this.A;
            if (popupWindow == null || !popupWindow.isShowing()) {
                this.a.removeView(fn6Var.g());
            } else {
                PopupWindow popupWindow2 = this.A;
                if (popupWindow2 != null) {
                    popupWindow2.dismiss();
                }
                this.A = null;
            }
        }
        this.z = null;
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        this.B.close();
        an8 an8Var = this.y;
        if (an8Var != null) {
            this.a.removeView(an8Var.o());
        }
        this.x.a();
        c();
    }
}
