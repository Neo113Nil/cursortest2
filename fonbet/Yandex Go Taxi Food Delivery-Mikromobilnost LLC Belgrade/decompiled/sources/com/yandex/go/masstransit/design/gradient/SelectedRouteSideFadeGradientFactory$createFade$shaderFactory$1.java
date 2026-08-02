package com.yandex.go.masstransit.design.gradient;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import defpackage.otg0;
import defpackage.piq0;
import defpackage.tje;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/yandex/go/masstransit/design/gradient/SelectedRouteSideFadeGradientFactory$createFade$shaderFactory$1", "Landroid/graphics/drawable/ShapeDrawable$ShaderFactory;", "", "width", "height", "Landroid/graphics/Shader;", "resize", "(II)Landroid/graphics/Shader;", "design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SelectedRouteSideFadeGradientFactory$createFade$shaderFactory$1 extends ShapeDrawable.ShaderFactory {
    final /* synthetic */ int $color;
    final /* synthetic */ piq0 this$0;

    public SelectedRouteSideFadeGradientFactory$createFade$shaderFactory$1(piq0 piq0Var, int i) {
        this.this$0 = piq0Var;
        this.$color = i;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public Shader resize(int width, int height) {
        float r = tje.r(otg0.route_end_fade_width, this.this$0.a);
        int i = this.$color;
        int argb = Color.argb((int) (Color.alpha(i) * 0.0f), Color.red(i), Color.green(i), Color.blue(i));
        int i2 = this.$color;
        return new LinearGradient(0.0f, 0.0f, r, 0.0f, new int[]{argb, i2, i2}, new float[]{0.0f, 0.88f, 1.0f}, Shader.TileMode.MIRROR);
    }
}
