package com.yandex.plus.pay.ui.core.mobile.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.pvg0;
import defpackage.q3i0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R*\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010!\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020 8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010'\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020 8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010.¨\u00060"}, d2 = {"Lcom/yandex/plus/pay/ui/core/mobile/view/PlusPayAvatarImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "w", "h", "oldw", "oldh", "Lzy11;", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setGradientDrawable", "(Landroid/graphics/drawable/Drawable;)V", "", "value", "isPlusStroked", "Z", "()Z", "setPlusStroked", "(Z)V", "", "strokeWidth", "F", "getStrokeWidth", "()F", "setStrokeWidth", "(F)V", "strokePadding", "getStrokePadding", "setStrokePadding", "strokeDrawable", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/Path;", "strokePath", "Landroid/graphics/Path;", "avatarPath", "pay-sdk-ui-core-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPayAvatarImageView extends AppCompatImageView {
    private Path avatarPath;
    private boolean isPlusStroked;
    private Drawable strokeDrawable;
    private float strokePadding;
    private Path strokePath;
    private float strokeWidth;

    public PlusPayAvatarImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.strokePath = new Path();
        this.avatarPath = new Path();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q3i0.PlusPayAvatarView, 0, 0);
        try {
            _init_$lambda$0(this, obtainStyledAttributes);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private static final zy11 _init_$lambda$0(PlusPayAvatarImageView plusPayAvatarImageView, TypedArray typedArray) {
        plusPayAvatarImageView.setStrokeWidth(typedArray.getDimension(q3i0.PlusPayAvatarView_pay_sdk_strokeWith, plusPayAvatarImageView.getResources().getDimension(pvg0.pay_sdk_avatar_stroke_width)));
        plusPayAvatarImageView.setStrokePadding(typedArray.getDimension(q3i0.PlusPayAvatarView_pay_sdk_strokePadding, plusPayAvatarImageView.getResources().getDimension(pvg0.pay_sdk_avatar_stroke_padding)));
        plusPayAvatarImageView.setPlusStroked(typedArray.getBoolean(q3i0.PlusPayAvatarView_pay_sdk_isPlusStroked, false));
        return zy11.a;
    }

    public final float getStrokePadding() {
        return this.strokePadding;
    }

    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    /* renamed from: isPlusStroked, reason: from getter */
    public final boolean getIsPlusStroked() {
        return this.isPlusStroked;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        int save;
        if (this.isPlusStroked) {
            Path path = this.strokePath;
            save = canvas.save();
            canvas.clipPath(path);
            try {
                Drawable drawable = this.strokeDrawable;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                canvas.restoreToCount(save);
            } finally {
            }
        }
        Path path2 = this.avatarPath;
        save = canvas.save();
        canvas.clipPath(path2);
        try {
            super.onDraw(canvas);
        } finally {
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        float f = w / 2.0f;
        float f2 = h / 2.0f;
        float min = Math.min(f, f2);
        Path path = new Path();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(f, f2, min, direction);
        this.strokePath = path;
        Path path2 = new Path();
        path2.addCircle(f, f2, min - this.strokeWidth, direction);
        this.strokePath.op(path2, Path.Op.DIFFERENCE);
        Path path3 = new Path();
        path3.addCircle(f, f2, (min - this.strokeWidth) - this.strokePadding, direction);
        this.avatarPath = path3;
        Drawable drawable = this.strokeDrawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    public final void setGradientDrawable(Drawable drawable) {
        this.strokeDrawable = drawable;
        invalidate();
    }

    public final void setPlusStroked(boolean z) {
        this.isPlusStroked = z;
        invalidate();
    }

    public final void setStrokePadding(float f) {
        this.strokePadding = f;
        invalidate();
    }

    public final void setStrokeWidth(float f) {
        this.strokeWidth = f;
        invalidate();
    }

    public PlusPayAvatarImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PlusPayAvatarImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public PlusPayAvatarImageView(Context context) {
        this(context, null, 0, 6, null);
    }
}
