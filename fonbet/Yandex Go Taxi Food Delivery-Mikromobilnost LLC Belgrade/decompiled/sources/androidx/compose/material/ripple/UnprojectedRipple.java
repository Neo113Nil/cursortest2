package androidx.compose.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.ldc;
import defpackage.rzo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/compose/material/ripple/UnprojectedRipple;", "Landroid/graphics/drawable/RippleDrawable;", "", "bounded", "<init>", "(Z)V", "Lldc;", "color", "", CaretView.ALPHA_PROPERTY, "calculateRippleColor-5vOe2sY", "(JF)J", "calculateRippleColor", "Lzy11;", "setColor-DxMtmZc", "(JF)V", "setColor", "isProjected", "()Z", "Landroid/graphics/Rect;", "getDirtyBounds", "()Landroid/graphics/Rect;", "Z", "rippleColor", "Lldc;", "projected", "material-ripple"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class UnprojectedRipple extends RippleDrawable {
    private final boolean bounded;
    private boolean projected;
    private ldc rippleColor;

    public UnprojectedRipple(boolean z) {
        super(ColorStateList.valueOf(ModalContentViewContainer.BASE_SHADOW_COLOR), null, z ? new ColorDrawable(-1) : null);
        this.bounded = z;
    }

    /* renamed from: calculateRippleColor-5vOe2sY, reason: not valid java name */
    private final long m39calculateRippleColor5vOe2sY(long color, float alpha) {
        return ldc.b(color, alpha > 1.0f ? 1.0f : alpha, 0.0f, 0.0f, 0.0f, 14);
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        if (!this.bounded) {
            this.projected = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.projected = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.projected;
    }

    /* renamed from: setColor-DxMtmZc, reason: not valid java name */
    public final void m40setColorDxMtmZc(long color, float alpha) {
        long m39calculateRippleColor5vOe2sY = m39calculateRippleColor5vOe2sY(color, alpha);
        ldc ldcVar = this.rippleColor;
        if (ldcVar == null ? false : ldc.c(ldcVar.a, m39calculateRippleColor5vOe2sY)) {
            return;
        }
        this.rippleColor = new ldc(m39calculateRippleColor5vOe2sY);
        setColor(ColorStateList.valueOf(rzo.X(m39calculateRippleColor5vOe2sY)));
    }
}
