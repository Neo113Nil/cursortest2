package com.yandex.div.core.view2.divs;

import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.view.OverridableOnPreDrawListener;
import com.yandex.div2.DivLayoutProvider;
import defpackage.gcm;
import defpackage.gtq0;
import defpackage.l6o;
import defpackage.m6o;
import defpackage.m810;
import defpackage.ngh0;
import defpackage.oyr;
import defpackage.rvo;
import defpackage.sls;
import defpackage.xz20;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class n {
    public final m6o a;
    public final Div2View b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();
    public OverridableOnPreDrawListener f;

    public n(m6o m6oVar, Div2View div2View) {
        this.a = m6oVar;
        this.b = div2View;
    }

    public final void a() {
        if (this.f != null) {
            return;
        }
        sls slsVar = new sls() { // from class: com.yandex.div.core.view2.divs.DivLayoutProviderBinder$addClearVariablesListener$listener$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                n nVar = n.this;
                o oVar = (o) nVar.d.get(nVar.b.get_divData());
                if (oVar != null) {
                    oVar.a.clear();
                }
                n nVar2 = n.this;
                for (Map.Entry entry : nVar2.c.entrySet()) {
                    rvo rvoVar = (rvo) entry.getKey();
                    for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                        gtq0.P(nVar2.b, (String) entry2.getKey(), String.valueOf(((Number) entry2.getValue()).intValue()), rvoVar);
                    }
                }
                n.this.c.clear();
                return Boolean.TRUE;
            }
        };
        OverridableOnPreDrawListener overridableOnPreDrawListener = new OverridableOnPreDrawListener(new xz20(1, slsVar), gcm.b);
        this.f = overridableOnPreDrawListener;
        this.b.getViewTreeObserver().addOnPreDrawListener(overridableOnPreDrawListener);
    }

    public final void b(View view, DivLayoutProvider divLayoutProvider) {
        if (divLayoutProvider == null) {
            return;
        }
        Set set = (Set) this.e.get(this.b.get_divData());
        if (set != null) {
            set.remove(divLayoutProvider);
        }
        Object tag = view.getTag(ngh0.div_layout_provider_listener_id);
        view.removeOnLayoutChangeListener(tag instanceof View.OnLayoutChangeListener ? (View.OnLayoutChangeListener) tag : null);
    }

    public final void c(DisplayMetrics displayMetrics, String str, o oVar, int i, int i2, int i3, int i4, rvo rvoVar, l6o l6oVar) {
        int i5;
        if (str == null || str.length() == 0 || (i5 = i2 - i) == i4 - i3) {
            return;
        }
        if (oVar.a.contains(str)) {
            l6oVar.e(new Throwable(oyr.p("Size subscriber for variable '", str, "' affects original view size. Relayout was prevented.")));
            return;
        }
        LinkedHashMap linkedHashMap = this.c;
        Object obj = linkedHashMap.get(rvoVar);
        if (obj == null) {
            obj = new LinkedHashMap();
            linkedHashMap.put(rvoVar, obj);
        }
        Map map = (Map) obj;
        Integer valueOf = Integer.valueOf(i5);
        map.put(str, Integer.valueOf(m810.b(Build.VERSION.SDK_INT >= 34 ? TypedValue.deriveDimension(1, valueOf.floatValue(), displayMetrics) : valueOf.floatValue() / displayMetrics.density)));
    }
}
