package com.yandex.plus.plaquesdk.plaque.api.models.display;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import defpackage.he20;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/yandex/plus/plaquesdk/plaque/api/models/display/MicroWidgetDrawableFactory$createSolidColorShader$1", "Landroid/graphics/drawable/ShapeDrawable$ShaderFactory;", "", "width", "height", "Landroid/graphics/Shader;", "resize", "(II)Landroid/graphics/Shader;", "plus-home-plaque-core-plaqueview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MicroWidgetDrawableFactory$createSolidColorShader$1 extends ShapeDrawable.ShaderFactory {
    final /* synthetic */ he20 $solid;

    public MicroWidgetDrawableFactory$createSolidColorShader$1(he20 he20Var) {
        this.$solid = he20Var;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public Shader resize(int width, int height) {
        int i = this.$solid.a;
        return new LinearGradient(0.0f, 0.0f, width, height, new int[]{i, i}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
    }
}
