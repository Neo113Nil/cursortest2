package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.yandex.go.zone.dto.objects.SummaryStyle;
import com.yandex.go.zone.dto.objects.SurgeIconStyle;

/* loaded from: classes6.dex */
public final class ppw0 {
    public final Context a;
    public final pdc b;
    public final int c;
    public final npw0 d;

    public ppw0(pdc pdcVar, Context context) {
        this.a = context;
        this.b = pdcVar;
        int color = context.getColor(mqg0.component_red_toxic);
        this.c = color;
        this.d = new npw0(f1h0.ic_surge_lightning_16, color);
    }

    public final npw0 a(SurgeIconStyle surgeIconStyle, int i) {
        String str = surgeIconStyle.b;
        int m = s8o.m(((ufu) this.b).f(new cdc(this.c), str), this.a);
        if (opw0.a[surgeIconStyle.a.ordinal()] == 1) {
            return new npw0(i, m);
        }
        w511.b();
        return null;
    }

    public final LayerDrawable b(pex0 pex0Var) {
        npw0 c = c(pex0Var);
        int i = c.b;
        int i2 = xng0.textMain;
        Context context = this.a;
        int t = qje.t(i2, context);
        int u = qje.u(context.getTheme(), xng0.textInvert);
        float e = q5z.e(i);
        if (Math.abs(e - q5z.e(t)) <= Math.abs(e - q5z.e(u))) {
            t = u;
        }
        LayerDrawable layerDrawable = (LayerDrawable) vng.t(e1h0.ic_round_surge, context);
        layerDrawable.findDrawableByLayerId(zfh0.bg_drawable).setTint(i);
        int i3 = zfh0.ic_icon;
        Drawable y = tje.y(c.a, context);
        y.setTint(t);
        layerDrawable.setDrawableByLayerId(i3, y);
        return layerDrawable;
    }

    public final npw0 c(pex0 pex0Var) {
        SurgeIconStyle surgeIconStyle;
        SummaryStyle summaryStyle;
        if (pex0Var == null || (summaryStyle = pex0Var.v0) == null || (surgeIconStyle = summaryStyle.a) == null) {
            surgeIconStyle = new SurgeIconStyle(0);
        }
        return a(surgeIconStyle, f1h0.ic_surge_lightning_24);
    }
}
