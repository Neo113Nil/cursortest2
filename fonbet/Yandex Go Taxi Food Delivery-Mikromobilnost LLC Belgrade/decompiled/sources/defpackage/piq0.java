package defpackage;

import android.content.Context;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.yandex.go.masstransit.design.gradient.SelectedRouteSideFadeGradientFactory$createFade$shaderFactory$1;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes12.dex */
public final class piq0 {
    public final Context a;

    public piq0(Context context) {
        this.a = context;
    }

    public final PaintDrawable a(ThemeType themeType) {
        int color;
        int i = oiq0.a[themeType.ordinal()];
        Context context = this.a;
        if (i == 1) {
            color = context.getColor(mqg0.component_control_minor_light_no_transparency);
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            color = context.getColor(mqg0.component_control_minor_dark_no_transparency);
        }
        SelectedRouteSideFadeGradientFactory$createFade$shaderFactory$1 selectedRouteSideFadeGradientFactory$createFade$shaderFactory$1 = new SelectedRouteSideFadeGradientFactory$createFade$shaderFactory$1(this, color);
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        paintDrawable.setShaderFactory(selectedRouteSideFadeGradientFactory$createFade$shaderFactory$1);
        return paintDrawable;
    }
}
