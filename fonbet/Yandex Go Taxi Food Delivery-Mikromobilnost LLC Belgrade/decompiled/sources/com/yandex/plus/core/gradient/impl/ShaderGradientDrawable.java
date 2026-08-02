package com.yandex.plus.core.gradient.impl;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Shader;
import com.yandex.plus.core.gradient.api.PlusDrawable;
import defpackage.ajy;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/plus/core/gradient/impl/ShaderGradientDrawable;", "Lcom/yandex/plus/core/gradient/api/PlusDrawable;", "Lajy;", "shaderController", "<init>", "(Lajy;)V", "Landroid/graphics/Rect;", "bounds", "Lzy11;", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Shader;", "getCurrentShader", "()Landroid/graphics/Shader;", "Lajy;", "plus-core-gradient_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShaderGradientDrawable extends PlusDrawable {
    private final ajy shaderController;

    public ShaderGradientDrawable(ajy ajyVar) {
        this.shaderController = ajyVar;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        getPaint().setShader(this.shaderController.b());
        canvas.drawRect(getBoundsF(), getPaint());
    }

    @Override // com.yandex.plus.core.gradient.api.PlusDrawable
    public Shader getCurrentShader() {
        return this.shaderController.b();
    }

    @Override // com.yandex.plus.core.gradient.api.PlusDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        this.shaderController.a(bounds.left, bounds.top, bounds.right, bounds.bottom);
    }
}
