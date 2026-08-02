package com.ybsdk.core.utils.ui.core;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import defpackage.vqe;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/ybsdk/core/utils/ui/core/CoreShapeDrawable;", "Landroid/graphics/drawable/ShapeDrawable;", "", "radius", "Landroid/graphics/drawable/shapes/Shape;", "shape", "<init>", "([FLandroid/graphics/drawable/shapes/Shape;)V", "[F", "getRadius", "()[F", "Companion", "vqe", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CoreShapeDrawable extends ShapeDrawable {
    public static final vqe Companion = new vqe();
    private final float[] radius;

    public CoreShapeDrawable(float[] fArr, Shape shape) {
        this.radius = fArr;
        setShape(shape);
    }

    public static final CoreShapeDrawable oval(float[] fArr) {
        Companion.getClass();
        return new CoreShapeDrawable(fArr, new OvalShape());
    }

    public final float[] getRadius() {
        return this.radius;
    }
}
