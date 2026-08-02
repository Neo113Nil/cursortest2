package com.yandex.go.blur.view.internal.scrim;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import defpackage.csf0;
import defpackage.cy4;
import defpackage.g76;
import defpackage.hng0;
import defpackage.i3y;
import defpackage.kdc;
import defpackage.s8o;
import defpackage.sls;
import defpackage.tje;
import defpackage.xby;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;

/* loaded from: classes.dex */
public final class b extends cy4 {
    public final Context e;
    public final kdc f;
    public final kdc g;
    public final Float h;
    public final i3y i;

    public b(Context context, g76 g76Var) {
        kdc kdcVar = g76Var.a;
        kdc kdcVar2 = g76Var.b;
        Float f = g76Var.c;
        this.e = context;
        this.f = kdcVar;
        this.g = kdcVar2;
        this.h = f;
        this.i = kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.go.blur.view.internal.scrim.a
            @Override // defpackage.sls
            public final Object invoke() {
                b bVar = b.this;
                kdc kdcVar3 = bVar.f;
                Context context2 = bVar.e;
                Integer valueOf = kdcVar3 != null ? Integer.valueOf(s8o.m(kdcVar3, context2)) : null;
                kdc kdcVar4 = bVar.g;
                Integer valueOf2 = kdcVar4 != null ? Integer.valueOf(s8o.m(kdcVar4, context2)) : null;
                Float f2 = bVar.h;
                return new ScrimBlurDrawable(valueOf, valueOf2, f2 != null ? f2.floatValue() : bVar.i(), new ScrimBlurDelegate$drawable$2$1(1, bVar.e, tje.class, "dpToPx", "dpToPx(Landroid/content/Context;I)F", 1));
            }
        });
    }

    @Override // defpackage.v66
    public final String a() {
        return "blur/scrim";
    }

    @Override // defpackage.v66
    public final void c() {
        i3y a = kotlin.a.a(new csf0(24, this));
        ScrimBlurDrawable scrimBlurDrawable = (ScrimBlurDrawable) this.i.getValue();
        Context context = this.e;
        kdc kdcVar = this.f;
        Integer valueOf = kdcVar != null ? Integer.valueOf(s8o.m(kdcVar, context)) : null;
        kdc kdcVar2 = this.g;
        Integer valueOf2 = kdcVar2 != null ? Integer.valueOf(s8o.m(kdcVar2, context)) : null;
        Float f = this.h;
        scrimBlurDrawable.setColors(valueOf, valueOf2, f != null ? f.floatValue() : i(), new ScrimBlurDelegate$refreshTheme$1(a, i3y.class, "value", "getValue()Ljava/lang/Object;", 0));
    }

    @Override // defpackage.cy4
    public final void e(Map map, View view) {
        i3y a = kotlin.a.a(new csf0(23, view));
        i3y i3yVar = this.i;
        ((ScrimBlurDrawable) i3yVar.getValue()).setEffects(map, new ScrimBlurDelegate$applyBlurEffects$1(a, i3y.class, "value", "getValue()Ljava/lang/Object;", 0));
        view.setForeground(!map.isEmpty() ? (ScrimBlurDrawable) i3yVar.getValue() : null);
    }

    public final float i() {
        int i = hng0.blurFallbackScrimRadiusToAlphaMultiplier;
        TypedValue typedValue = new TypedValue();
        Context context = this.e;
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.type == 4) {
            return Float.parseFloat(typedValue.coerceToString().toString());
        }
        xby.d.k(new IllegalArgumentException(), "Type of " + context.getResources().getResourceName(i) + " is not float!");
        return 0.0075f;
    }
}
