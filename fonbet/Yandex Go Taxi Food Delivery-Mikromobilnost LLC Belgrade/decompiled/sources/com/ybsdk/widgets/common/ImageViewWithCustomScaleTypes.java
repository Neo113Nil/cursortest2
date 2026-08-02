package com.ybsdk.widgets.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.t3i0;
import defpackage.vgv;
import defpackage.w511;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/widgets/common/ImageViewWithCustomScaleTypes;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/ybsdk/widgets/common/ImageScaleTypeEntity;", "imageScaleTypeEntity", "Lzy11;", "render", "(Lcom/ybsdk/widgets/common/ImageScaleTypeEntity;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "currScaleType", "Lcom/ybsdk/widgets/common/ImageScaleTypeEntity;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImageViewWithCustomScaleTypes extends AppCompatImageView {
    private ImageScaleTypeEntity currScaleType;

    public ImageViewWithCustomScaleTypes(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ImageScaleTypeEntity imageScaleTypeEntity;
        ImageScaleTypeEntity imageScaleTypeEntity2 = ImageScaleTypeEntity.DEFAULT;
        this.currScaleType = imageScaleTypeEntity2;
        int i2 = 0;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, t3i0.YbSdkImageWithCustomScaleTypes, 0, 0);
        int integer = obtainStyledAttributes.getInteger(t3i0.YbSdkImageWithCustomScaleTypes_ybsdk_custom_scale_type, imageScaleTypeEntity2.getValue());
        ImageScaleTypeEntity[] values = ImageScaleTypeEntity.values();
        int length = values.length;
        while (true) {
            if (i2 >= length) {
                imageScaleTypeEntity = null;
                break;
            }
            imageScaleTypeEntity = values[i2];
            if (imageScaleTypeEntity.getValue() == integer) {
                break;
            } else {
                i2++;
            }
        }
        this.currScaleType = imageScaleTypeEntity == null ? ImageScaleTypeEntity.DEFAULT : imageScaleTypeEntity;
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        Matrix imageMatrix = getImageMatrix();
        float width = getWidth() / drawable.getIntrinsicWidth();
        int i = vgv.a[this.currScaleType.ordinal()];
        Float f = null;
        if (i != 1) {
            if (i == 2) {
                f = Float.valueOf(0.0f);
            } else if (i == 3) {
                setScaleType(((float) getHeight()) - (((float) drawable.getIntrinsicHeight()) * width) >= 0.0f ? ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.CENTER_CROP);
            } else if (i == 4) {
                f = Float.valueOf(getHeight() - (drawable.getIntrinsicHeight() * width));
            } else {
                if (i != 5) {
                    w511.b();
                    return;
                }
                setScaleType(ImageView.ScaleType.FIT_XY);
            }
        }
        if (f == null) {
            super.onDraw(canvas);
            return;
        }
        imageMatrix.setScale(width, width);
        imageMatrix.postTranslate(0.0f, f.floatValue());
        setImageMatrix(imageMatrix);
        super.onDraw(canvas);
    }

    public final void render(ImageScaleTypeEntity imageScaleTypeEntity) {
        this.currScaleType = imageScaleTypeEntity;
        invalidate();
    }

    public ImageViewWithCustomScaleTypes(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ImageViewWithCustomScaleTypes(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ImageViewWithCustomScaleTypes(Context context) {
        this(context, null, 0, 6, null);
    }
}
